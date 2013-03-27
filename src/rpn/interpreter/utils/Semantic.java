package rpn.interpreter.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

import rpn.interpreter.core.RpnParser;

public class Semantic {
	
	private Environment env;
	private RpnParser parser;
	private Scanner in;
	
	public Semantic(Environment env, RpnParser parser) {
		this.env = env;
		this.parser = parser;
		this.in = new Scanner(System.in);
	}
	
	public double getNumber(Token tk) {
		return new Double(tk.getText());
	}
	
	public void assign(Token tk, double value) {
		env.currentSpace.putVar(tk.getText(), value);
	}
	
	public double getVar(Token tk) {
		double result = Double.NaN;
		if (env.currentSpace.containsVar(tk.getText()))
			return env.currentSpace.getVar(tk.getText()).floatValue();
		else
			env.errors.add(new TokenMessage(tk, "variable '" + tk.getText() + "' not declared"));
		return result;
	}
	
	public void display(String text) {
		System.out.println(text);
	}
	
	public void input(Token tk) {
		Double value;
		do {
			value = Double.NaN;
			System.out.print(tk.getText() + ": ");
			try {
				value = Double.parseDouble(in.nextLine());
			} catch ( NumberFormatException nfe ) {
				System.out.println("Valore non valido, inserire un numero");
			}
		} while ( value.isNaN() );
		assign(tk, value);
	}
	
	public double binop(double a, double b, Token tk) {
		double result = Double.NaN;
		
		switch ( tk.getText() ) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			if (b != 0)
				result = a / b;
			else
				env.errors.add(new TokenMessage(tk, "division by zero"));
			break;
		}
		
		return result;
	}
	
	public double unaop(double n, Token tk) {
		double result = Double.NaN;
		
		switch ( tk.getText() ) {
		case "~":
			result = -(n);
			break;
		case "!":
			if ( n < 0 ) {
				env.warnings.add(new TokenMessage(tk, n + " -> 0 to use factorial"));
				n = 0;
			}
			
			int i = (int) Math.floor(n);
			if ( n != Math.floor(n) ) {
				env.warnings.add(new TokenMessage(tk, n + " -> " + i + " to use factorial"));
			}
			
			result = factorial(i);
			break;
		}
		
		return result;
	}
	
	private int factorial(int i) {
		if ( i == 0 )
			return 1;
		return i * factorial(i - 1);
	}
	
    public void def(String name, List <Token> formalArgs, Token codeStart) {
        Function fn = new Function(name, formalArgs, codeStart);
        env.currentSpace.putFun(fn);
    }

    public double call(Token tk, List<Double> args) {
    	String name = tk.getText();
    	Function fn = env.currentSpace.getFun(name);

    	if ( fn == null ) {
    		fn = env.globals.getFun(name);
    		if (fn == null) {
    			env.errors.add(new TokenMessage(tk, "no function '" + name + "'"));
    			return Double.NaN;
    		}
    	}

    	MemorySpace fnSpace = new MemorySpace(fn);
    	MemorySpace oldSpace = env.currentSpace;
    	env.currentSpace = fnSpace;

    	if ( (fn.formalArgs == null && args.size() > 0) ||
    			(fn.formalArgs != null && args.size() != fn.formalArgs.size()) ) {
    		env.errors.add(new TokenMessage(tk, "function '" + fn.name + "' argument list mismatch"));
    		return Double.NaN;
    	}

    	Iterator<Double> argsiter = args.iterator();
    	for ( Token formal : fn.formalArgs ) {
    		fnSpace.putVar(formal.getText(), argsiter.next());
    	}
    	
    	env.stack.push(fnSpace);
    	
    	Double result = Double.NaN;
    	int oldPosition = parser.input.index();
    	parser.input.seek(fn.codeStart.getTokenIndex());
    	
		try {
			result = parser.deflist(true).value;
		} catch (RecognitionException e) {
			env.errors.add(new TokenMessage(tk, "can't execute function '" + name + "'"));
		} finally {
			parser.input.seek(oldPosition);
		}
		
    	env.stack.pop();
    	env.currentSpace = oldSpace;
    	
    	return result;
    }
    
    @Override
    protected void finalize() throws Throwable {
    	super.finalize();
    	if ( in != null )
    		in.close();
    }
	
}
