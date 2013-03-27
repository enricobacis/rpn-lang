package rpn.interpreter.utils;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;

public class Environment {
	
	public ArrayList <TokenMessage> warnings;
	public ArrayList <TokenMessage> errors;
	public Stack <MemorySpace> stack;
	
	public Environment() {
		this.warnings = new ArrayList <TokenMessage> ();
		this.errors = new ArrayList <TokenMessage> ();
		this.stack = new Stack <MemorySpace> ();
		this.stack.push(new MemorySpace("globals"));
	}
	
	public MemorySpace currentSpace() {
		return stack.peek();
	}
	
	public Double getVar(String id) {
		Double var = Double.NaN;
		ListIterator<MemorySpace> iter = stack.listIterator(stack.size());
		while ( iter.hasPrevious() && var.isNaN() )
			var = iter.previous().getVar(id);
		return var;
	}
	
	public Function getFun(String name) {
		Function fun = null;
		ListIterator<MemorySpace> iter = stack.listIterator(stack.size());
		while ( iter.hasPrevious() && ( fun == null ) )
			fun = iter.previous().getFun(name);
		return fun;
	}
	
}
