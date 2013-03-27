package rpn.interpreter.utils;

import org.antlr.runtime.Token;
import java.util.List;

public class Function {
	String name;
    List<Token> formalArgs;
    Token codeStart;
    
    public Function(String name, List<Token> formalArgs, Token codeStart) {
        this.name = name;
        this.formalArgs = formalArgs;
        this.codeStart = codeStart; 
    }
}
