// $ANTLR 3.5 /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g 2013-03-27 10:19:13

package rpn.interpreter.core;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RpnLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__11=11;
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
	public static final int BINOP=4;
	public static final int ID=5;
	public static final int NUM=6;
	public static final int SCAN_ERROR=7;
	public static final int SL_COMMENT=8;
	public static final int UNAOP=9;
	public static final int WS=10;

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

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:20:7: ( 'return' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:20:9: 'return'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:21:7: ( '{' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:21:9: '{'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:22:7: ( '}' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:22:9: '}'
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
	// $ANTLR end "T__21"

	// $ANTLR start "UNAOP"
	public final void mUNAOP() throws RecognitionException {
		try {
			int _type = UNAOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:109:5: ( ( '~' | '!' ) )
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
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:113:5: ( ( '+' | '-' | '*' | '/' ) )
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:117:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:117:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:117:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
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
					break loop1;
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
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:121:5: ( ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) ( '.' ( '0' .. '9' )+ )? )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:121:9: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) ( '.' ( '0' .. '9' )+ )?
			{
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:121:9: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=1;
			}
			else if ( (LA3_0=='0') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:121:11: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:121:22: ( '0' .. '9' )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
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
							break loop2;
						}
					}

					}
					break;
				case 2 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:121:36: '0'
					{
					match('0'); 
					}
					break;

			}

			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:121:42: ( '.' ( '0' .. '9' )+ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='.') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:121:44: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:121:48: ( '0' .. '9' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
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
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
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
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:125:5: ( ( '\\t' | '\\r' | '\\n' | ' ' )+ )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:125:9: ( '\\t' | '\\r' | '\\n' | ' ' )+
			{
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:125:9: ( '\\t' | '\\r' | '\\n' | ' ' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:129:5: ( '#' (~ ( '\\r' | '\\n' ) )* )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:129:9: '#' (~ ( '\\r' | '\\n' ) )*
			{
			match('#'); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:129:13: (~ ( '\\r' | '\\n' ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
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
					break loop7;
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
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:133:5: ( . )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:133:9: .
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
		// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | UNAOP | BINOP | ID | NUM | WS | SL_COMMENT | SCAN_ERROR )
		int alt8=18;
		int LA8_0 = input.LA(1);
		if ( (LA8_0=='(') ) {
			alt8=1;
		}
		else if ( (LA8_0==')') ) {
			alt8=2;
		}
		else if ( (LA8_0==',') ) {
			alt8=3;
		}
		else if ( (LA8_0==';') ) {
			alt8=4;
		}
		else if ( (LA8_0=='<') ) {
			int LA8_5 = input.LA(2);
			if ( (LA8_5=='<') ) {
				alt8=5;
			}

			else {
				alt8=18;
			}

		}
		else if ( (LA8_0=='=') ) {
			alt8=6;
		}
		else if ( (LA8_0=='>') ) {
			int LA8_7 = input.LA(2);
			if ( (LA8_7=='>') ) {
				alt8=7;
			}

			else {
				alt8=18;
			}

		}
		else if ( (LA8_0=='d') ) {
			int LA8_8 = input.LA(2);
			if ( (LA8_8=='e') ) {
				int LA8_27 = input.LA(3);
				if ( (LA8_27=='f') ) {
					int LA8_37 = input.LA(4);
					if ( ((LA8_37 >= '0' && LA8_37 <= '9')||(LA8_37 >= 'A' && LA8_37 <= 'Z')||LA8_37=='_'||(LA8_37 >= 'a' && LA8_37 <= 'z')) ) {
						alt8=14;
					}

					else {
						alt8=8;
					}

				}

				else {
					alt8=14;
				}

			}

			else {
				alt8=14;
			}

		}
		else if ( (LA8_0=='r') ) {
			int LA8_9 = input.LA(2);
			if ( (LA8_9=='e') ) {
				int LA8_29 = input.LA(3);
				if ( (LA8_29=='t') ) {
					int LA8_38 = input.LA(4);
					if ( (LA8_38=='u') ) {
						int LA8_40 = input.LA(5);
						if ( (LA8_40=='r') ) {
							int LA8_41 = input.LA(6);
							if ( (LA8_41=='n') ) {
								int LA8_42 = input.LA(7);
								if ( ((LA8_42 >= '0' && LA8_42 <= '9')||(LA8_42 >= 'A' && LA8_42 <= 'Z')||LA8_42=='_'||(LA8_42 >= 'a' && LA8_42 <= 'z')) ) {
									alt8=14;
								}

								else {
									alt8=9;
								}

							}

							else {
								alt8=14;
							}

						}

						else {
							alt8=14;
						}

					}

					else {
						alt8=14;
					}

				}

				else {
					alt8=14;
				}

			}

			else {
				alt8=14;
			}

		}
		else if ( (LA8_0=='{') ) {
			alt8=10;
		}
		else if ( (LA8_0=='}') ) {
			alt8=11;
		}
		else if ( (LA8_0=='!'||LA8_0=='~') ) {
			alt8=12;
		}
		else if ( ((LA8_0 >= '*' && LA8_0 <= '+')||LA8_0=='-'||LA8_0=='/') ) {
			alt8=13;
		}
		else if ( ((LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'c')||(LA8_0 >= 'e' && LA8_0 <= 'q')||(LA8_0 >= 's' && LA8_0 <= 'z')) ) {
			alt8=14;
		}
		else if ( ((LA8_0 >= '1' && LA8_0 <= '9')) ) {
			alt8=15;
		}
		else if ( (LA8_0=='0') ) {
			alt8=15;
		}
		else if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
			alt8=16;
		}
		else if ( (LA8_0=='#') ) {
			alt8=17;
		}
		else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\b')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\u001F')||LA8_0=='\"'||(LA8_0 >= '$' && LA8_0 <= '\'')||LA8_0=='.'||LA8_0==':'||(LA8_0 >= '?' && LA8_0 <= '@')||(LA8_0 >= '[' && LA8_0 <= '^')||LA8_0=='`'||LA8_0=='|'||(LA8_0 >= '\u007F' && LA8_0 <= '\uFFFF')) ) {
			alt8=18;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 8, 0, input);
			throw nvae;
		}

		switch (alt8) {
			case 1 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:10: T__11
				{
				mT__11(); 

				}
				break;
			case 2 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:16: T__12
				{
				mT__12(); 

				}
				break;
			case 3 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:22: T__13
				{
				mT__13(); 

				}
				break;
			case 4 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:28: T__14
				{
				mT__14(); 

				}
				break;
			case 5 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:34: T__15
				{
				mT__15(); 

				}
				break;
			case 6 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:40: T__16
				{
				mT__16(); 

				}
				break;
			case 7 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:46: T__17
				{
				mT__17(); 

				}
				break;
			case 8 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:52: T__18
				{
				mT__18(); 

				}
				break;
			case 9 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:58: T__19
				{
				mT__19(); 

				}
				break;
			case 10 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:64: T__20
				{
				mT__20(); 

				}
				break;
			case 11 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:70: T__21
				{
				mT__21(); 

				}
				break;
			case 12 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:76: UNAOP
				{
				mUNAOP(); 

				}
				break;
			case 13 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:82: BINOP
				{
				mBINOP(); 

				}
				break;
			case 14 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:88: ID
				{
				mID(); 

				}
				break;
			case 15 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:91: NUM
				{
				mNUM(); 

				}
				break;
			case 16 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:95: WS
				{
				mWS(); 

				}
				break;
			case 17 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:98: SL_COMMENT
				{
				mSL_COMMENT(); 

				}
				break;
			case 18 :
				// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:1:109: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}



}
