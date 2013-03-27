package rpn.user;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import rpn.interpreter.core.RpnLexer;
import rpn.interpreter.core.RpnParser;
import rpn.interpreter.utils.TokenMessage;


public class RpnUser  {
	
	static RpnParser parser;
	static RpnLexer lexer;
	static CommonTokenStream tokens;

	public static void main(String[] args) {
		
		if ( args.length < 1 ) {
			System.err.println("File di input mancante");
			System.exit(1);
		}
		
		System.out.println("Parsing con rpn-lang");
		System.out.println("--------------------\n");
		String infile = args[0];

		try {
			lexer = new RpnLexer(new ANTLRReaderStream(new FileReader(infile)));
			tokens = new CommonTokenStream(lexer);
			parser = new RpnParser(tokens);
			parser.start();
			
			saveOutput(infile + ".out");

		} catch ( Exception e ) {
			System.err.println("Parsing con ANTLR abortito");
		}
		
		int errors = parser.getErrors().size();
		int warnings = parser.getWarnings().size();
		
		String result = "\n[Parsing completato. " + errors + " errori e " + warnings + " warning]";
		
		if ( errors == 0 )
			System.out.println(result);
		else
			System.err.println(result);
	}
	
	static void saveOutput(String outfile) throws IOException {
		FileWriter fout = new FileWriter (outfile);
		
		fout.append("Lista delle Variabili\n---------------------\n");
		
		for ( String key : parser.getVariables().keySet() ) {
			Double value = parser.getVariables().getVar(key);
			fout.append(key + " = " + (value.isNaN() ? "function" : value) + "\n");
		}
		
		if ( parser.getWarnings().size() > 0 ) {
			fout.append("\nLista dei Warning\n-------------------\n");
			for (TokenMessage warn : parser.getWarnings()) {
				fout.append(warn + "\n");
			}	
		}
		
		if ( parser.getErrors().size() > 0 ) {
			fout.append("\nLista degli Errori\n--------------------\n");
			for (TokenMessage err : parser.getErrors()) {
				fout.append(err + "\n");  	
			}
		}
		
		fout.close();		
	}

}
