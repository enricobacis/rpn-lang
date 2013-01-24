/**
 * 
 */
package rpn.compiler.utils;

import org.antlr.runtime.Token;

import com.sun.tools.javac.util.Pair;

/**
 * @authors Daniele Ciriello, Enrico Bacis
 *
 */
public class Semantic {
	Environment env;
	public Semantic (Environment env) {
		this.env = env; 
	}
	
	public void saveVar (Token tk, double value) {
		env.symbolTable.put(tk.getText(), value);		
	}
	
	public double getValue (Token tk) {
		return new Double(tk.getText());
	}
	
	public double getVarValue (Token tk) {
		if (env.symbolTable.containsKey(tk.getText()))
			return env.symbolTable.get(tk.getText()).floatValue();

		env.errors.add(new Pair<Token, String> (tk, "variable '" + tk.getText() + "' not declared."));
		return 0;
	}
	
	public void display (String text, double value) {
		System.out.println (text + " = " + value);
	}
	
	public double add (double value1, double value2) {
		return value1 + value2;
	}
	
	public double sub (double value1, double value2) {
		return value1 - value2;
	}
	
	public double mul (double value1, double value2) {
		return value1 * value2;
	}
	
	public double div (double value1, double value2, Token tk) {
		if (value2 != 0)
			return value1 / value2;
		env.errors.add(new Pair<Token, String> (tk, "division by zero."));
		return Double.NaN;
	}
	
	
}


