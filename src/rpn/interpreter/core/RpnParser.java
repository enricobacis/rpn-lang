// $ANTLR 3.5 /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g 2013-03-27 10:19:10

package rpn.interpreter.core;

import rpn.interpreter.utils.*;
import java.util.Hashtable;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RpnParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BINOP", "ID", "NUM", "SCAN_ERROR", 
		"SL_COMMENT", "UNAOP", "WS", "'('", "')'", "','", "';'", "'<<'", "'='", 
		"'>>'", "'def'", "'return'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public RpnParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public RpnParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return RpnParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g"; }


	private Environment env;
	private Semantic sem;

	void init () {
	    env = new Environment();
	    sem = new Semantic(env, this);
	}
	  
	public ArrayList<TokenMessage> getWarnings() {
	    return env.warnings;
	}

	public ArrayList<TokenMessage> getErrors() {
	    return env.errors;
	}
	  
	public MemorySpace getVariables () {
	    return env.currentSpace;
	}



	// $ANTLR start "start"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:43:1: start : ( def | statement[true] )* EOF ;
	public final void start() throws RecognitionException {
		 init (); 
		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:45:5: ( ( def | statement[true] )* EOF )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:45:9: ( def | statement[true] )* EOF
			{
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:45:9: ( def | statement[true] )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==18) ) {
					alt1=1;
				}
				else if ( (LA1_0==ID||LA1_0==15||LA1_0==17) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:45:11: def
					{
					pushFollow(FOLLOW_def_in_start80);
					def();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:45:17: statement[true]
					{
					pushFollow(FOLLOW_statement_in_start84);
					statement(true);
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start90); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"



	// $ANTLR start "statement"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:48:1: statement[boolean execute] : ( assign[execute] | display[execute] | input[execute] );
	public final void statement(boolean execute) throws RecognitionException {
		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:49:5: ( assign[execute] | display[execute] | input[execute] )
			int alt2=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case 15:
				{
				alt2=2;
				}
				break;
			case 17:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:49:9: assign[execute]
					{
					pushFollow(FOLLOW_assign_in_statement110);
					assign(execute);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:50:9: display[execute]
					{
					pushFollow(FOLLOW_display_in_statement121);
					display(execute);
					state._fsp--;

					}
					break;
				case 3 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:51:9: input[execute]
					{
					pushFollow(FOLLOW_input_in_statement132);
					input(execute);
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "assign"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:54:1: assign[boolean execute] : ID '=' expr[execute] ';' ;
	public final void assign(boolean execute) throws RecognitionException {
		Token ID1=null;
		ParserRuleReturnScope expr2 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:55:5: ( ID '=' expr[execute] ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:55:9: ID '=' expr[execute] ';'
			{
			ID1=(Token)match(input,ID,FOLLOW_ID_in_assign153); 
			match(input,16,FOLLOW_16_in_assign155); 
			pushFollow(FOLLOW_expr_in_assign157);
			expr2=expr(execute);
			state._fsp--;

			match(input,14,FOLLOW_14_in_assign160); 
			 if (execute) sem.assign(ID1, (expr2!=null?((RpnParser.expr_return)expr2).value:0.0)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign"



	// $ANTLR start "display"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:59:1: display[boolean execute] : '<<' expr[execute] ';' ;
	public final void display(boolean execute) throws RecognitionException {
		ParserRuleReturnScope expr3 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:60:5: ( '<<' expr[execute] ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:60:9: '<<' expr[execute] ';'
			{
			match(input,15,FOLLOW_15_in_display190); 
			pushFollow(FOLLOW_expr_in_display192);
			expr3=expr(execute);
			state._fsp--;

			match(input,14,FOLLOW_14_in_display195); 
			 if (execute) sem.display((expr3!=null?input.toString(expr3.start,expr3.stop):null) + " = " + (expr3!=null?((RpnParser.expr_return)expr3).value:0.0)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "display"



	// $ANTLR start "input"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:64:1: input[boolean execute] : '>>' ID ';' ;
	public final void input(boolean execute) throws RecognitionException {
		Token ID4=null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:65:5: ( '>>' ID ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:65:9: '>>' ID ';'
			{
			match(input,17,FOLLOW_17_in_input225); 
			ID4=(Token)match(input,ID,FOLLOW_ID_in_input227); 
			match(input,14,FOLLOW_14_in_input229); 
			 if (execute) sem.input(ID4); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "input"


	public static class expr_return extends ParserRuleReturnScope {
		public double value;
	};


	// $ANTLR start "expr"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:69:1: expr[boolean execute] returns [double value] options {k=2; } : (tk= BINOP a= expr[execute] b= expr[execute] |tk= UNAOP u= expr[execute] | NUM | ID |fn= call[execute] );
	public final RpnParser.expr_return expr(boolean execute) throws RecognitionException {
		RpnParser.expr_return retval = new RpnParser.expr_return();
		retval.start = input.LT(1);

		Token tk=null;
		Token NUM5=null;
		Token ID6=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope u =null;
		double fn =0.0;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:71:5: (tk= BINOP a= expr[execute] b= expr[execute] |tk= UNAOP u= expr[execute] | NUM | ID |fn= call[execute] )
			int alt3=5;
			switch ( input.LA(1) ) {
			case BINOP:
				{
				alt3=1;
				}
				break;
			case UNAOP:
				{
				alt3=2;
				}
				break;
			case NUM:
				{
				alt3=3;
				}
				break;
			case ID:
				{
				int LA3_4 = input.LA(2);
				if ( (LA3_4==11) ) {
					alt3=5;
				}
				else if ( ((LA3_4 >= BINOP && LA3_4 <= NUM)||LA3_4==UNAOP||(LA3_4 >= 12 && LA3_4 <= 14)) ) {
					alt3=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:71:9: tk= BINOP a= expr[execute] b= expr[execute]
					{
					tk=(Token)match(input,BINOP,FOLLOW_BINOP_in_expr276); 
					pushFollow(FOLLOW_expr_in_expr280);
					a=expr(execute);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr285);
					b=expr(execute);
					state._fsp--;

					 if (execute) retval.value = sem.binop((a!=null?((RpnParser.expr_return)a).value:0.0), (b!=null?((RpnParser.expr_return)b).value:0.0), tk); 
					}
					break;
				case 2 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:73:9: tk= UNAOP u= expr[execute]
					{
					tk=(Token)match(input,UNAOP,FOLLOW_UNAOP_in_expr308); 
					pushFollow(FOLLOW_expr_in_expr312);
					u=expr(execute);
					state._fsp--;

					 if (execute) retval.value = sem.unaop((u!=null?((RpnParser.expr_return)u).value:0.0), tk); 
					}
					break;
				case 3 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:75:9: NUM
					{
					NUM5=(Token)match(input,NUM,FOLLOW_NUM_in_expr333); 
					 if (execute) retval.value = sem.getNumber(NUM5); 
					}
					break;
				case 4 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:77:9: ID
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_expr353); 
					 if (execute) retval.value = sem.getVar(ID6); 
					}
					break;
				case 5 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:79:9: fn= call[execute]
					{
					pushFollow(FOLLOW_call_in_expr375);
					fn=call(execute);
					state._fsp--;

					 if (execute) retval.value = fn; 
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"



	// $ANTLR start "def"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:83:1: def : 'def' name= ID '(' (arg= ID ( ',' arg= ID )* )? ')' deflist[false] ;
	public final void def() throws RecognitionException {
		Token name=null;
		Token arg=null;
		ParserRuleReturnScope deflist7 =null;

		 List<Token> args = new ArrayList<Token>(); 
		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:85:5: ( 'def' name= ID '(' (arg= ID ( ',' arg= ID )* )? ')' deflist[false] )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:85:9: 'def' name= ID '(' (arg= ID ( ',' arg= ID )* )? ')' deflist[false]
			{
			match(input,18,FOLLOW_18_in_def413); 
			name=(Token)match(input,ID,FOLLOW_ID_in_def417); 
			match(input,11,FOLLOW_11_in_def419); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:85:27: (arg= ID ( ',' arg= ID )* )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:85:29: arg= ID ( ',' arg= ID )*
					{
					arg=(Token)match(input,ID,FOLLOW_ID_in_def425); 
					 args.add(arg); 
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:85:56: ( ',' arg= ID )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==13) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:85:58: ',' arg= ID
							{
							match(input,13,FOLLOW_13_in_def431); 
							arg=(Token)match(input,ID,FOLLOW_ID_in_def435); 
							 args.add(arg); 
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;

			}

			match(input,12,FOLLOW_12_in_def445); 
			pushFollow(FOLLOW_deflist_in_def455);
			deflist7=deflist(false);
			state._fsp--;

			 sem.def((name!=null?name.getText():null), args, (deflist7!=null?(deflist7.start):null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "def"


	public static class deflist_return extends ParserRuleReturnScope {
		public double value;
	};


	// $ANTLR start "deflist"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:89:1: deflist[boolean execute] returns [double value] : '{' ( statement[execute] )* ret[execute] '}' ;
	public final RpnParser.deflist_return deflist(boolean execute) throws RecognitionException {
		RpnParser.deflist_return retval = new RpnParser.deflist_return();
		retval.start = input.LT(1);

		double ret8 =0.0;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:90:5: ( '{' ( statement[execute] )* ret[execute] '}' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:90:9: '{' ( statement[execute] )* ret[execute] '}'
			{
			match(input,20,FOLLOW_20_in_deflist486); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:90:13: ( statement[execute] )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ID||LA6_0==15||LA6_0==17) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:90:15: statement[execute]
					{
					pushFollow(FOLLOW_statement_in_deflist490);
					statement(execute);
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			pushFollow(FOLLOW_ret_in_deflist496);
			ret8=ret(execute);
			state._fsp--;

			match(input,21,FOLLOW_21_in_deflist499); 
			 if (execute) retval.value = ret8; 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "deflist"



	// $ANTLR start "ret"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:94:1: ret[boolean execute] returns [double value] : 'return' expr[execute] ';' ;
	public final double ret(boolean execute) throws RecognitionException {
		double value = 0.0;


		ParserRuleReturnScope expr9 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:95:5: ( 'return' expr[execute] ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:95:9: 'return' expr[execute] ';'
			{
			match(input,19,FOLLOW_19_in_ret533); 
			pushFollow(FOLLOW_expr_in_ret535);
			expr9=expr(execute);
			state._fsp--;

			match(input,14,FOLLOW_14_in_ret538); 
			 if (execute) value = (expr9!=null?((RpnParser.expr_return)expr9).value:0.0); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "ret"



	// $ANTLR start "call"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:99:1: call[boolean execute] returns [double value] : name= ID '(' (arg= expr[execute] ( ',' arg= expr[execute] )* )? ')' ;
	public final double call(boolean execute) throws RecognitionException {
		double value = 0.0;


		Token name=null;
		ParserRuleReturnScope arg =null;

		 List<Double> args = new ArrayList<Double>(); 
		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:101:5: (name= ID '(' (arg= expr[execute] ( ',' arg= expr[execute] )* )? ')' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:101:9: name= ID '(' (arg= expr[execute] ( ',' arg= expr[execute] )* )? ')'
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_call579); 
			match(input,11,FOLLOW_11_in_call581); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:102:9: (arg= expr[execute] ( ',' arg= expr[execute] )* )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= BINOP && LA8_0 <= NUM)||LA8_0==UNAOP) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:102:11: arg= expr[execute] ( ',' arg= expr[execute] )*
					{
					pushFollow(FOLLOW_expr_in_call595);
					arg=expr(execute);
					state._fsp--;

					 args.add((arg!=null?((RpnParser.expr_return)arg).value:0.0)); 
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:103:11: ( ',' arg= expr[execute] )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==13) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:103:13: ',' arg= expr[execute]
							{
							match(input,13,FOLLOW_13_in_call612); 
							pushFollow(FOLLOW_expr_in_call616);
							arg=expr(execute);
							state._fsp--;

							 args.add((arg!=null?((RpnParser.expr_return)arg).value:0.0)); 
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}

			match(input,12,FOLLOW_12_in_call635); 
			 if (execute) value = sem.call(name, args); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "call"

	// Delegated rules



	public static final BitSet FOLLOW_def_in_start80 = new BitSet(new long[]{0x0000000000068020L});
	public static final BitSet FOLLOW_statement_in_start84 = new BitSet(new long[]{0x0000000000068020L});
	public static final BitSet FOLLOW_EOF_in_start90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_display_in_statement121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_in_statement132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign153 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_assign155 = new BitSet(new long[]{0x0000000000000270L});
	public static final BitSet FOLLOW_expr_in_assign157 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assign160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_display190 = new BitSet(new long[]{0x0000000000000270L});
	public static final BitSet FOLLOW_expr_in_display192 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_display195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_input225 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_input227 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_input229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINOP_in_expr276 = new BitSet(new long[]{0x0000000000000270L});
	public static final BitSet FOLLOW_expr_in_expr280 = new BitSet(new long[]{0x0000000000000270L});
	public static final BitSet FOLLOW_expr_in_expr285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAOP_in_expr308 = new BitSet(new long[]{0x0000000000000270L});
	public static final BitSet FOLLOW_expr_in_expr312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_expr333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_expr375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_def413 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_def417 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_def419 = new BitSet(new long[]{0x0000000000001020L});
	public static final BitSet FOLLOW_ID_in_def425 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_13_in_def431 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_def435 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_12_in_def445 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_deflist_in_def455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_deflist486 = new BitSet(new long[]{0x00000000000A8020L});
	public static final BitSet FOLLOW_statement_in_deflist490 = new BitSet(new long[]{0x00000000000A8020L});
	public static final BitSet FOLLOW_ret_in_deflist496 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_deflist499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_ret533 = new BitSet(new long[]{0x0000000000000270L});
	public static final BitSet FOLLOW_expr_in_ret535 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ret538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_call579 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_call581 = new BitSet(new long[]{0x0000000000001270L});
	public static final BitSet FOLLOW_expr_in_call595 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_13_in_call612 = new BitSet(new long[]{0x0000000000000270L});
	public static final BitSet FOLLOW_expr_in_call616 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_12_in_call635 = new BitSet(new long[]{0x0000000000000002L});
}
