package rpn.compiler.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;

import org.antlr.runtime.*;

import rpn.compiler.core.*;


public class Tester  {
	static rpnParser parser;
	static String fileIn = "./test/test.rpn";
	static String fileOut = "./test/parser.ANTLR.out.txt";
	static String fileErr = "./test/parser.ANTLR.err.txt";
	static String fileMsg = "./test/parser.ANTLR.msg.txt";
  
	public static void main(String[] args) {
    CommonTokenStream tokens;

		try {
			System.out.println ("Parsing con ANTLR lexer");
			System.out.println ("-----------------------");
			rpnLexer lexer = new rpnLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
	    tokens = new CommonTokenStream(lexer);
	    parser = new rpnParser(tokens);
	    parser.s();

	    if (parser.getErrors().size() == 0)
	    	System.out.println ("Parsing completato con successo\n\n");
	    else 
	    	System.out.println ("Parsing completato con " + parser.getErrors().size() + " errori semantici\n\n");

	    saveMessages ();
	    saveErrors ();

		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
  }

	static void saveMessages () throws IOException {
		FileWriter fOut = new FileWriter (fileMsg);
    fOut.append("Lista delle variabili\n" +
    						"---------------------\n");
    Enumeration<String> varList = parser.getVariables().keys();
    int v=0;
    while (varList.hasMoreElements()) {
    	String var = varList.nextElement();
    	double value = parser.getVariables().get(var);
    	fOut.append(++v + ": " + var + "=" + value + "\n");
    }
    if (parser.getWarnings().size()> 0) {
	    fOut.append("\nLista dei Warnings" +
	    						"\n-------------------\n");
	  	for (int i=0; i<parser.getWarnings().size(); i++)
	  		fOut.append((i+1) + ": " + parser.getWarnings().get(i) + "\n");    	
    }
    fOut.close();		
	}

	
	static void saveErrors ()  throws IOException {
		FileWriter fOut = new FileWriter (fileErr);
  	for (int i=0; i<parser.getErrors().size(); i++)
  		fOut.append((i+1) + ": " + parser.getErrors().get(i) + "\n");    	
    fOut.close();		
	}

}
