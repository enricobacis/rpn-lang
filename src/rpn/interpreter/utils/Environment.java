package rpn.interpreter.utils;

import java.util.ArrayList;
import java.util.Stack;

public class Environment {
	
	public ArrayList <TokenMessage> warnings;
	public ArrayList <TokenMessage> errors;
	public MemorySpace globals;
	public MemorySpace currentSpace;
	public Stack <MemorySpace> stack;
	
	public Environment() {
		this.warnings = new ArrayList <TokenMessage> ();
		this.errors = new ArrayList <TokenMessage> ();
		this.globals = new MemorySpace("globals");
		this.currentSpace = globals;
		this.stack = new Stack <MemorySpace> ();
	}
	
}
