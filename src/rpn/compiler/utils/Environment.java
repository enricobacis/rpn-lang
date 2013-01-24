/**
 * 
 */
package rpn.compiler.utils;

import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.Token;

import com.sun.tools.javac.util.Pair;

/**
 * @authors Daniele Ciriello, Enrico Bacis
 *
 */
public class Environment {
	
	public Hashtable<String, Double> symbolTable;
	public ArrayList<Pair<Token, String>> warnings;
	public ArrayList<Pair<Token, String>> errors;
	
	public Environment() {
		symbolTable = new Hashtable<String, Double> ();
		warnings = new ArrayList<Pair<Token, String>> ();
		errors = new ArrayList<Pair<Token, String>> ();
	}
}