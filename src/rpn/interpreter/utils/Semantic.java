package rpn.interpreter.utils;

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
		env.currentSpace().putVar(tk.getText(), value);
	}
	
	public double getVar(Token tk) {
		String id = tk.getText();
		Double var = env.getVar(id);
		if ( var.isNaN() )
			env.errors.add(new TokenMessage(tk, "variable '" + id + "' not declared"));
		return var;
	}
	
	public void output(String text) {
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
		switch ( tk.getText() ) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			if (b != 0)
				return a / b;
			else
				env.errors.add(new TokenMessage(tk, "division by zero"));
			break;
		}
		return Double.NaN;
	}
	
	public double unaop(double n, Token tk) {
		switch ( tk.getText() ) {
		case "~":
			return -(n);
		case "!":
			if ( n < 0 ) {
				env.warnings.add(new TokenMessage(tk, n + " -> 0 to use factorial"));
				n = 0;
			}
			
			int i = (int) Math.floor(n);
			if ( n != Math.floor(n) ) {
				env.warnings.add(new TokenMessage(tk, n + " -> " + i + " to use factorial"));
			}
			
			return factorial(i);
		}
		return Double.NaN;
	}
	
	private int factorial(int i) {
		if ( i == 0 )
			return 1;
		return i * factorial(i - 1);
	}
	
	public void ifstat(Token cond, Token iflist, Token elselist) {
		int oldPosition = parser.input.index();
    	parser.input.seek(cond.getTokenIndex());
    	env.stack.push(new MemorySpace("if " + cond.getText()));
    	
		try {
			if ( parser.cond(true).satisfied ) {
				parser.input.seek(iflist.getTokenIndex());
				parser.slist(true);
			} else if ( elselist != null ) {
				parser.input.seek(elselist.getTokenIndex());
				parser.slist(true);
			}
		} catch (RecognitionException re) {
			env.errors.add(new TokenMessage(cond, "can't execute if statement"));
		} finally {
			parser.input.seek(oldPosition);
		}
		
		env.stack.pop();
	}
	
	public void whilestat(Token cond, Token whilelist) {
		int oldPosition = parser.input.index();
    	parser.input.seek(cond.getTokenIndex());
    	env.stack.push(new MemorySpace("while " + cond.getText()));
    	
    	try {
    		while ( parser.cond(true).satisfied ) {
    			parser.input.seek(whilelist.getTokenIndex());
				parser.slist(true);
				parser.input.seek(cond.getTokenIndex());
    		}
    	} catch (RecognitionException re) {
			env.errors.add(new TokenMessage(cond, "can't execute while loop"));
		} finally {
			parser.input.seek(oldPosition);
		}
		
		env.stack.pop();
	}
	
	public boolean cond(double left, double right, Token condop) {
		switch(condop.getText()) {
		case "<":
			return left < right;
		case "<=":
			return left <= right;
		case "==":
			return left == right;
		case ">=":
			return left >= right;
		case ">":
			return left > right;
		}
		return false;
	}
	
    public void def(String name, List <Token> formalArgs, Token codeStart) {
        Function fn = new Function(name, formalArgs, codeStart);
        env.currentSpace().putFun(fn);
    }

    public double call(Token tk, List<Double> args) {
    	String name = tk.getText();
    	
    	Function fun = env.getFun(name);
		if ( fun == null ) {
			env.errors.add(new TokenMessage(tk, "no function '" + name + "'"));
			return Double.NaN;
		}

    	MemorySpace fnSpace = new MemorySpace(fun);

    	if ( (fun.formalArgs == null && args.size() > 0) ||
    			(fun.formalArgs != null && args.size() != fun.formalArgs.size()) ) {
    		env.errors.add(new TokenMessage(tk, "function '" + fun.name + "' argument list mismatch"));
    		return Double.NaN;
    	}
    	
    	for ( int i = 0; i < args.size(); ++i ) {
    		fnSpace.putVar(fun.formalArgs.get(i).getText(), args.get(i));
    	}
    	
    	env.stack.push(fnSpace);
    	
    	Double result = Double.NaN;
    	int oldPosition = parser.input.index();
    	parser.input.seek(fun.codeStart.getTokenIndex());
    	
		try {
			result = parser.deflist(true).value;
		} catch (RecognitionException e) {
			env.errors.add(new TokenMessage(tk, "can't execute function '" + name + "'"));
		} finally {
			parser.input.seek(oldPosition);
		}
		
    	env.stack.pop();
    	return result;
    }
    
    @Override
    protected void finalize() throws Throwable {
    	super.finalize();
    	if ( in != null )
    		in.close();
    }
	
}
