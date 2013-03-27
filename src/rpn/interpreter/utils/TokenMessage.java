package rpn.interpreter.utils;

import org.antlr.runtime.Token;

public class TokenMessage {
	
	private Token token;
	private String message;
	
	public TokenMessage(Token token, String message) {
		this.token = token;
		this.message = message;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "[" + token.getLine() + ":" + token.getCharPositionInLine() + "] " + message;
	}

}
