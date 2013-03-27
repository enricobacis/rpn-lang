// $ANTLR 3.5 /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g 2013-03-27 15:03:39

package rpn.interpreter.core;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RpnLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int BINOP=4;
	public static final int CONOP=5;
	public static final int ID=6;
	public static final int NUM=7;
	public static final int SCAN_ERROR=8;
	public static final int SL_COMMENT=9;
	public static final int UNAOP=10;
	public static final int WS=11;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public RpnLexer() {} 
	public RpnLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public RpnLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g"; }

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:12:7: ( '(' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:12:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:13:7: ( ')' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:13:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:14:7: ( ',' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:14:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:15:7: ( ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:15:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:16:7: ( '<<' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:16:9: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:17:7: ( '=' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:17:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:18:7: ( '>>' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:18:9: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:19:7: ( 'def' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:19:9: 'def'
			{
			match("def"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:20:7: ( 'else' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:20:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:21:7: ( 'if' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:21:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:22:7: ( 'return' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:22:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:23:7: ( 'while' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:23:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:24:7: ( '{' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:24:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:25:7: ( '}' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:25:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "UNAOP"
	public final void mUNAOP() throws RecognitionException {
		try {
			int _type = UNAOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:130:5: ( ( '~' | '!' ) )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='~' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNAOP"

	// $ANTLR start "BINOP"
	public final void mBINOP() throws RecognitionException {
		try {
			int _type = BINOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:134:5: ( ( '+' | '-' | '*' | '/' ) )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:
			{
			if ( (input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINOP"

	// $ANTLR start "CONOP"
	public final void mCONOP() throws RecognitionException {
		try {
			int _type = CONOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:138:5: ( ( '<' | '<=' | '==' | '>=' | '>' ) )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:138:9: ( '<' | '<=' | '==' | '>=' | '>' )
			{
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:138:9: ( '<' | '<=' | '==' | '>=' | '>' )
			int alt1=5;
			switch ( input.LA(1) ) {
			case '<':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='=') ) {
					alt1=2;
				}

				else {
					alt1=1;
				}

				}
				break;
			case '=':
				{
				alt1=3;
				}
				break;
			case '>':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='=') ) {
					alt1=4;
				}

				else {
					alt1=5;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:138:10: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:138:16: '<='
					{
					match("<="); 

					}
					break;
				case 3 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:138:23: '=='
					{
					match("=="); 

					}
					break;
				case 4 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:138:30: '>='
					{
					match(">="); 

					}
					break;
				case 5 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:138:37: '>'
					{
					match('>'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONOP"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:142:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:142:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:142:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:146:5: ( ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) ( '.' ( '0' .. '9' )+ )? )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:146:9: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) ( '.' ( '0' .. '9' )+ )?
			{
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:146:9: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
				alt4=1;
			}
			else if ( (LA4_0=='0') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:146:11: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:146:22: ( '0' .. '9' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;
				case 2 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:146:36: '0'
					{
					match('0'); 
					}
					break;

			}

			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:146:42: ( '.' ( '0' .. '9' )+ )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='.') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:146:44: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:146:48: ( '0' .. '9' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:150:5: ( ( '\\t' | '\\r' | '\\n' | ' ' )+ )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:150:9: ( '\\t' | '\\r' | '\\n' | ' ' )+
			{
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:150:9: ( '\\t' | '\\r' | '\\n' | ' ' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "SL_COMMENT"
	public final void mSL_COMMENT() throws RecognitionException {
		try {
			int _type = SL_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:154:5: ( '#' (~ ( '\\r' | '\\n' ) )* )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:154:9: '#' (~ ( '\\r' | '\\n' ) )*
			{
			match('#'); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:154:13: (~ ( '\\r' | '\\n' ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SL_COMMENT"

	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:158:5: ( . )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:158:9: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCAN_ERROR"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | UNAOP | BINOP | CONOP | ID | NUM | WS | SL_COMMENT | SCAN_ERROR )
		int alt9=22;
		int LA9_0 = input.LA(1);
		if ( (LA9_0=='(') ) {
			alt9=1;
		}
		else if ( (LA9_0==')') ) {
			alt9=2;
		}
		else if ( (LA9_0==',') ) {
			alt9=3;
		}
		else if ( (LA9_0==';') ) {
			alt9=4;
		}
		else if ( (LA9_0=='<') ) {
			int LA9_5 = input.LA(2);
			if ( (LA9_5=='<') ) {
				alt9=5;
			}

			else {
				alt9=17;
			}

		}
		else if ( (LA9_0=='=') ) {
			int LA9_6 = input.LA(2);
			if ( (LA9_6=='=') ) {
				alt9=17;
			}

			else {
				alt9=6;
			}

		}
		else if ( (LA9_0=='>') ) {
			int LA9_7 = input.LA(2);
			if ( (LA9_7=='>') ) {
				alt9=7;
			}

			else {
				alt9=17;
			}

		}
		else if ( (LA9_0=='d') ) {
			int LA9_8 = input.LA(2);
			if ( (LA9_8=='e') ) {
				int LA9_31 = input.LA(3);
				if ( (LA9_31=='f') ) {
					int LA9_44 = input.LA(4);
					if ( ((LA9_44 >= '0' && LA9_44 <= '9')||(LA9_44 >= 'A' && LA9_44 <= 'Z')||LA9_44=='_'||(LA9_44 >= 'a' && LA9_44 <= 'z')) ) {
						alt9=18;
					}

					else {
						alt9=8;
					}

				}

				else {
					alt9=18;
				}

			}

			else {
				alt9=18;
			}

		}
		else if ( (LA9_0=='e') ) {
			int LA9_9 = input.LA(2);
			if ( (LA9_9=='l') ) {
				int LA9_33 = input.LA(3);
				if ( (LA9_33=='s') ) {
					int LA9_45 = input.LA(4);
					if ( (LA9_45=='e') ) {
						int LA9_50 = input.LA(5);
						if ( ((LA9_50 >= '0' && LA9_50 <= '9')||(LA9_50 >= 'A' && LA9_50 <= 'Z')||LA9_50=='_'||(LA9_50 >= 'a' && LA9_50 <= 'z')) ) {
							alt9=18;
						}

						else {
							alt9=9;
						}

					}

					else {
						alt9=18;
					}

				}

				else {
					alt9=18;
				}

			}

			else {
				alt9=18;
			}

		}
		else if ( (LA9_0=='i') ) {
			int LA9_10 = input.LA(2);
			if ( (LA9_10=='f') ) {
				int LA9_34 = input.LA(3);
				if ( ((LA9_34 >= '0' && LA9_34 <= '9')||(LA9_34 >= 'A' && LA9_34 <= 'Z')||LA9_34=='_'||(LA9_34 >= 'a' && LA9_34 <= 'z')) ) {
					alt9=18;
				}

				else {
					alt9=10;
				}

			}

			else {
				alt9=18;
			}

		}
		else if ( (LA9_0=='r') ) {
			int LA9_11 = input.LA(2);
			if ( (LA9_11=='e') ) {
				int LA9_35 = input.LA(3);
				if ( (LA9_35=='t') ) {
					int LA9_47 = input.LA(4);
					if ( (LA9_47=='u') ) {
						int LA9_51 = input.LA(5);
						if ( (LA9_51=='r') ) {
							int LA9_54 = input.LA(6);
							if ( (LA9_54=='n') ) {
								int LA9_56 = input.LA(7);
								if ( ((LA9_56 >= '0' && LA9_56 <= '9')||(LA9_56 >= 'A' && LA9_56 <= 'Z')||LA9_56=='_'||(LA9_56 >= 'a' && LA9_56 <= 'z')) ) {
									alt9=18;
								}

								else {
									alt9=11;
								}

							}

							else {
								alt9=18;
							}

						}

						else {
							alt9=18;
						}

					}

					else {
						alt9=18;
					}

				}

				else {
					alt9=18;
				}

			}

			else {
				alt9=18;
			}

		}
		else if ( (LA9_0=='w') ) {
			int LA9_12 = input.LA(2);
			if ( (LA9_12=='h') ) {
				int LA9_36 = input.LA(3);
				if ( (LA9_36=='i') ) {
					int LA9_48 = input.LA(4);
					if ( (LA9_48=='l') ) {
						int LA9_52 = input.LA(5);
						if ( (LA9_52=='e') ) {
							int LA9_55 = input.LA(6);
							if ( ((LA9_55 >= '0' && LA9_55 <= '9')||(LA9_55 >= 'A' && LA9_55 <= 'Z')||LA9_55=='_'||(LA9_55 >= 'a' && LA9_55 <= 'z')) ) {
								alt9=18;
							}

							else {
								alt9=12;
							}

						}

						else {
							alt9=18;
						}

					}

					else {
						alt9=18;
					}

				}

				else {
					alt9=18;
				}

			}

			else {
				alt9=18;
			}

		}
		else if ( (LA9_0=='{') ) {
			alt9=13;
		}
		else if ( (LA9_0=='}') ) {
			alt9=14;
		}
		else if ( (LA9_0=='!'||LA9_0=='~') ) {
			alt9=15;
		}
		else if ( ((LA9_0 >= '*' && LA9_0 <= '+')||LA9_0=='-'||LA9_0=='/') ) {
			alt9=16;
		}
		else if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'c')||(LA9_0 >= 'f' && LA9_0 <= 'h')||(LA9_0 >= 'j' && LA9_0 <= 'q')||(LA9_0 >= 's' && LA9_0 <= 'v')||(LA9_0 >= 'x' && LA9_0 <= 'z')) ) {
			alt9=18;
		}
		else if ( ((LA9_0 >= '1' && LA9_0 <= '9')) ) {
			alt9=19;
		}
		else if ( (LA9_0=='0') ) {
			alt9=19;
		}
		else if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
			alt9=20;
		}
		else if ( (LA9_0=='#') ) {
			alt9=21;
		}
		else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\b')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\u001F')||LA9_0=='\"'||(LA9_0 >= '$' && LA9_0 <= '\'')||LA9_0=='.'||LA9_0==':'||(LA9_0 >= '?' && LA9_0 <= '@')||(LA9_0 >= '[' && LA9_0 <= '^')||LA9_0=='`'||LA9_0=='|'||(LA9_0 >= '\u007F' && LA9_0 <= '\uFFFF')) ) {
			alt9=22;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 9, 0, input);
			throw nvae;
		}

		switch (alt9) {
			case 1 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:10: T__12
				{
				mT__12(); 

				}
				break;
			case 2 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:16: T__13
				{
				mT__13(); 

				}
				break;
			case 3 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:22: T__14
				{
				mT__14(); 

				}
				break;
			case 4 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:28: T__15
				{
				mT__15(); 

				}
				break;
			case 5 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:34: T__16
				{
				mT__16(); 

				}
				break;
			case 6 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:40: T__17
				{
				mT__17(); 

				}
				break;
			case 7 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:46: T__18
				{
				mT__18(); 

				}
				break;
			case 8 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:52: T__19
				{
				mT__19(); 

				}
				break;
			case 9 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:58: T__20
				{
				mT__20(); 

				}
				break;
			case 10 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:64: T__21
				{
				mT__21(); 

				}
				break;
			case 11 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:70: T__22
				{
				mT__22(); 

				}
				break;
			case 12 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:76: T__23
				{
				mT__23(); 

				}
				break;
			case 13 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:82: T__24
				{
				mT__24(); 

				}
				break;
			case 14 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:88: T__25
				{
				mT__25(); 

				}
				break;
			case 15 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:94: UNAOP
				{
				mUNAOP(); 

				}
				break;
			case 16 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:100: BINOP
				{
				mBINOP(); 

				}
				break;
			case 17 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:106: CONOP
				{
				mCONOP(); 

				}
				break;
			case 18 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:112: ID
				{
				mID(); 

				}
				break;
			case 19 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:115: NUM
				{
				mNUM(); 

				}
				break;
			case 20 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:119: WS
				{
				mWS(); 

				}
				break;
			case 21 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:122: SL_COMMENT
				{
				mSL_COMMENT(); 

				}
				break;
			case 22 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:133: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}



}
