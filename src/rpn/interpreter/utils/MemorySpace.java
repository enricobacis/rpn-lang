package rpn.interpreter.utils;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MemorySpace {
	
    private String name;
    private Map<String, Object> members;

    public MemorySpace(String name) {
    	this.name = name;
    	this.members = new HashMap<String, Object> ();
    }
    
    public MemorySpace(Function function) {
    	this.name = function.name;
    	this.members = new HashMap<String, Object> ();
    }
    
    public Set<String> keySet() {
    	return members.keySet();
    }
    
    public boolean containsVar(String id) {
    	return (getVar(id) == null ? false : true);
    }
    
    public boolean containsFun(String name) {
    	return (getFun(name) == null ? false : true);
    }

    public Double getVar(String id) {
    	Object obj = members.get(id);
    	if ((obj != null) && (obj instanceof Double))
    		return (Double)obj; 
    	return null;
    }
    
    public Function getFun(String name) {
    	Object obj = members.get(name);
    	if ((obj != null) && (obj instanceof Function))
    		return (Function)obj;
    	return null;
    }
    
    public void putVar(String id,  Double value) {
    	members.put(id, value);
    }

    public void putFun(Function fun) {
    	members.put(fun.name, fun);
    }

    public String toString() {
    	return name + " [" + members + "]";
    }
    
}
