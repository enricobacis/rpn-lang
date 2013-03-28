// $ANTLR 3.5 /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g 2013-03-27 23:50:19

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BINOP", "CONOP", "ID", "NUM", 
		"SCAN_ERROR", "SL_COMMENT", "UNAOP", "WS", "'('", "')'", "','", "';'", 
		"'<<'", "'='", "'>>'", "'def'", "'else'", "'if'", "'return'", "'while'", 
		"'{'", "'}'"
	};
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
	    return env.currentSpace();
	}



	// $ANTLR start "start"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:43:1: start : ( statement[true] )* EOF ;
	public final void start() throws RecognitionException {
		 init (); 
		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:45:5: ( ( statement[true] )* EOF )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:45:9: ( statement[true] )* EOF
			{
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:45:9: ( statement[true] )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==16||(LA1_0 >= 18 && LA1_0 <= 19)||LA1_0==21||LA1_0==23) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:45:11: statement[true]
					{
					pushFollow(FOLLOW_statement_in_start80);
					statement(true);
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_start86); 
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:48:1: statement[boolean execute] : ( assign[execute] | output[execute] | input[execute] | ifstat[execute] | whilestat[execute] | def[execute] );
	public final void statement(boolean execute) throws RecognitionException {
		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:49:5: ( assign[execute] | output[execute] | input[execute] | ifstat[execute] | whilestat[execute] | def[execute] )
			int alt2=6;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case 16:
				{
				alt2=2;
				}
				break;
			case 18:
				{
				alt2=3;
				}
				break;
			case 21:
				{
				alt2=4;
				}
				break;
			case 23:
				{
				alt2=5;
				}
				break;
			case 19:
				{
				alt2=6;
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
					pushFollow(FOLLOW_assign_in_statement106);
					assign(execute);
					state._fsp--;

					}
					break;
				case 2 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:50:9: output[execute]
					{
					pushFollow(FOLLOW_output_in_statement117);
					output(execute);
					state._fsp--;

					}
					break;
				case 3 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:51:9: input[execute]
					{
					pushFollow(FOLLOW_input_in_statement128);
					input(execute);
					state._fsp--;

					}
					break;
				case 4 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:52:9: ifstat[execute]
					{
					pushFollow(FOLLOW_ifstat_in_statement139);
					ifstat(execute);
					state._fsp--;

					}
					break;
				case 5 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:53:9: whilestat[execute]
					{
					pushFollow(FOLLOW_whilestat_in_statement150);
					whilestat(execute);
					state._fsp--;

					}
					break;
				case 6 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:54:9: def[execute]
					{
					pushFollow(FOLLOW_def_in_statement161);
					def(execute);
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:57:1: assign[boolean execute] : ID '=' expr[execute] ';' ;
	public final void assign(boolean execute) throws RecognitionException {
		Token ID1=null;
		ParserRuleReturnScope expr2 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:58:5: ( ID '=' expr[execute] ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:58:9: ID '=' expr[execute] ';'
			{
			ID1=(Token)match(input,ID,FOLLOW_ID_in_assign182); 
			match(input,17,FOLLOW_17_in_assign184); 
			pushFollow(FOLLOW_expr_in_assign186);
			expr2=expr(execute);
			state._fsp--;

			match(input,15,FOLLOW_15_in_assign189); 
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



	// $ANTLR start "output"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:62:1: output[boolean execute] : '<<' expr[execute] ';' ;
	public final void output(boolean execute) throws RecognitionException {
		ParserRuleReturnScope expr3 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:63:5: ( '<<' expr[execute] ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:63:9: '<<' expr[execute] ';'
			{
			match(input,16,FOLLOW_16_in_output219); 
			pushFollow(FOLLOW_expr_in_output221);
			expr3=expr(execute);
			state._fsp--;

			match(input,15,FOLLOW_15_in_output224); 
			 if (execute) sem.output((expr3!=null?input.toString(expr3.start,expr3.stop):null) + " = " + (expr3!=null?((RpnParser.expr_return)expr3).value:0.0)); 
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
	// $ANTLR end "output"



	// $ANTLR start "input"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:67:1: input[boolean execute] : '>>' ID ';' ;
	public final void input(boolean execute) throws RecognitionException {
		Token ID4=null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:68:5: ( '>>' ID ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:68:9: '>>' ID ';'
			{
			match(input,18,FOLLOW_18_in_input254); 
			ID4=(Token)match(input,ID,FOLLOW_ID_in_input256); 
			match(input,15,FOLLOW_15_in_input258); 
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



	// $ANTLR start "ifstat"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:72:1: ifstat[boolean execute] : 'if' cond[false] il= slist[false] ( 'else' el= slist[false] )? ;
	public final void ifstat(boolean execute) throws RecognitionException {
		ParserRuleReturnScope il =null;
		ParserRuleReturnScope el =null;
		ParserRuleReturnScope cond5 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:73:5: ( 'if' cond[false] il= slist[false] ( 'else' el= slist[false] )? )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:73:9: 'if' cond[false] il= slist[false] ( 'else' el= slist[false] )?
			{
			match(input,21,FOLLOW_21_in_ifstat288); 
			pushFollow(FOLLOW_cond_in_ifstat290);
			cond5=cond(false);
			state._fsp--;

			pushFollow(FOLLOW_slist_in_ifstat295);
			il=slist(false);
			state._fsp--;

			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:73:42: ( 'else' el= slist[false] )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==20) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:73:44: 'else' el= slist[false]
					{
					match(input,20,FOLLOW_20_in_ifstat300); 
					pushFollow(FOLLOW_slist_in_ifstat304);
					el=slist(false);
					state._fsp--;

					}
					break;

			}

			 if (execute) sem.ifstat((cond5!=null?(cond5.start):null), (il!=null?(il.start):null), (el!=null?(el.start):null)); 
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
	// $ANTLR end "ifstat"



	// $ANTLR start "whilestat"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:77:1: whilestat[boolean execute] : 'while' cond[false] wl= slist[false] ;
	public final void whilestat(boolean execute) throws RecognitionException {
		ParserRuleReturnScope wl =null;
		ParserRuleReturnScope cond6 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:78:5: ( 'while' cond[false] wl= slist[false] )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:78:9: 'while' cond[false] wl= slist[false]
			{
			match(input,23,FOLLOW_23_in_whilestat338); 
			pushFollow(FOLLOW_cond_in_whilestat340);
			cond6=cond(false);
			state._fsp--;

			pushFollow(FOLLOW_slist_in_whilestat345);
			wl=slist(false);
			state._fsp--;

			 if (execute) sem.whilestat((cond6!=null?(cond6.start):null), (wl!=null?(wl.start):null)); 
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
	// $ANTLR end "whilestat"


	public static class cond_return extends ParserRuleReturnScope {
		public boolean satisfied;
	};


	// $ANTLR start "cond"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:82:1: cond[boolean execute] returns [boolean satisfied] : '(' tk= CONOP l= expr[execute] r= expr[execute] ')' ;
	public final RpnParser.cond_return cond(boolean execute) throws RecognitionException {
		RpnParser.cond_return retval = new RpnParser.cond_return();
		retval.start = input.LT(1);

		Token tk=null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope r =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:83:5: ( '(' tk= CONOP l= expr[execute] r= expr[execute] ')' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:83:9: '(' tk= CONOP l= expr[execute] r= expr[execute] ')'
			{
			match(input,12,FOLLOW_12_in_cond384); 
			tk=(Token)match(input,CONOP,FOLLOW_CONOP_in_cond388); 
			pushFollow(FOLLOW_expr_in_cond392);
			l=expr(execute);
			state._fsp--;

			pushFollow(FOLLOW_expr_in_cond397);
			r=expr(execute);
			state._fsp--;

			match(input,13,FOLLOW_13_in_cond400); 
			 if (execute) retval.satisfied = sem.cond((l!=null?((RpnParser.expr_return)l).value:0.0), (r!=null?((RpnParser.expr_return)r).value:0.0), tk); 
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
	// $ANTLR end "cond"



	// $ANTLR start "def"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:87:1: def[boolean execute] : 'def' name= ID '(' (arg= ID ( ',' arg= ID )* )? ')' deflist[false] ;
	public final void def(boolean execute) throws RecognitionException {
		Token name=null;
		Token arg=null;
		ParserRuleReturnScope deflist7 =null;

		 List<Token> args = new ArrayList<Token>(); 
		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:89:5: ( 'def' name= ID '(' (arg= ID ( ',' arg= ID )* )? ')' deflist[false] )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:89:9: 'def' name= ID '(' (arg= ID ( ',' arg= ID )* )? ')' deflist[false]
			{
			match(input,19,FOLLOW_19_in_def435); 
			name=(Token)match(input,ID,FOLLOW_ID_in_def439); 
			match(input,12,FOLLOW_12_in_def441); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:89:27: (arg= ID ( ',' arg= ID )* )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:89:29: arg= ID ( ',' arg= ID )*
					{
					arg=(Token)match(input,ID,FOLLOW_ID_in_def447); 
					 args.add(arg); 
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:89:56: ( ',' arg= ID )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==14) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:89:58: ',' arg= ID
							{
							match(input,14,FOLLOW_14_in_def453); 
							arg=(Token)match(input,ID,FOLLOW_ID_in_def457); 
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

			match(input,13,FOLLOW_13_in_def467); 
			pushFollow(FOLLOW_deflist_in_def477);
			deflist7=deflist(false);
			state._fsp--;

			 if (execute) sem.def((name!=null?name.getText():null), args, (deflist7!=null?(deflist7.start):null)); 
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:93:1: deflist[boolean execute] returns [double value] : '{' ( statement[execute] )* ret[execute] '}' ;
	public final RpnParser.deflist_return deflist(boolean execute) throws RecognitionException {
		RpnParser.deflist_return retval = new RpnParser.deflist_return();
		retval.start = input.LT(1);

		double ret8 =0.0;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:94:5: ( '{' ( statement[execute] )* ret[execute] '}' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:94:9: '{' ( statement[execute] )* ret[execute] '}'
			{
			match(input,24,FOLLOW_24_in_deflist508); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:94:13: ( statement[execute] )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ID||LA6_0==16||(LA6_0 >= 18 && LA6_0 <= 19)||LA6_0==21||LA6_0==23) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:94:15: statement[execute]
					{
					pushFollow(FOLLOW_statement_in_deflist512);
					statement(execute);
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			pushFollow(FOLLOW_ret_in_deflist518);
			ret8=ret(execute);
			state._fsp--;

			match(input,25,FOLLOW_25_in_deflist521); 
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


	public static class slist_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "slist"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:98:1: slist[boolean execute] : '{' ( statement[execute] )* '}' ;
	public final RpnParser.slist_return slist(boolean execute) throws RecognitionException {
		RpnParser.slist_return retval = new RpnParser.slist_return();
		retval.start = input.LT(1);

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:99:5: ( '{' ( statement[execute] )* '}' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:99:9: '{' ( statement[execute] )* '}'
			{
			match(input,24,FOLLOW_24_in_slist551); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:99:13: ( statement[execute] )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ID||LA7_0==16||(LA7_0 >= 18 && LA7_0 <= 19)||LA7_0==21||LA7_0==23) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:99:15: statement[execute]
					{
					pushFollow(FOLLOW_statement_in_slist555);
					statement(execute);
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,25,FOLLOW_25_in_slist561); 
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
	// $ANTLR end "slist"



	// $ANTLR start "ret"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:102:1: ret[boolean execute] returns [double value] : 'return' expr[execute] ';' ;
	public final double ret(boolean execute) throws RecognitionException {
		double value = 0.0;


		ParserRuleReturnScope expr9 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:103:5: ( 'return' expr[execute] ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:103:9: 'return' expr[execute] ';'
			{
			match(input,22,FOLLOW_22_in_ret585); 
			pushFollow(FOLLOW_expr_in_ret587);
			expr9=expr(execute);
			state._fsp--;

			match(input,15,FOLLOW_15_in_ret590); 
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


	public static class expr_return extends ParserRuleReturnScope {
		public double value;
	};


	// $ANTLR start "expr"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:107:1: expr[boolean execute] returns [double value] options {k=2; } : (tk= BINOP a= expr[execute] b= expr[execute] |tk= UNAOP u= expr[execute] | NUM | ID |fun= call[execute] );
	public final RpnParser.expr_return expr(boolean execute) throws RecognitionException {
		RpnParser.expr_return retval = new RpnParser.expr_return();
		retval.start = input.LT(1);

		Token tk=null;
		Token NUM10=null;
		Token ID11=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope u =null;
		double fun =0.0;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:109:5: (tk= BINOP a= expr[execute] b= expr[execute] |tk= UNAOP u= expr[execute] | NUM | ID |fun= call[execute] )
			int alt8=5;
			switch ( input.LA(1) ) {
			case BINOP:
				{
				alt8=1;
				}
				break;
			case UNAOP:
				{
				alt8=2;
				}
				break;
			case NUM:
				{
				alt8=3;
				}
				break;
			case ID:
				{
				int LA8_4 = input.LA(2);
				if ( (LA8_4==12) ) {
					alt8=5;
				}
				else if ( (LA8_4==BINOP||(LA8_4 >= ID && LA8_4 <= NUM)||LA8_4==UNAOP||(LA8_4 >= 13 && LA8_4 <= 15)) ) {
					alt8=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:109:9: tk= BINOP a= expr[execute] b= expr[execute]
					{
					tk=(Token)match(input,BINOP,FOLLOW_BINOP_in_expr637); 
					pushFollow(FOLLOW_expr_in_expr641);
					a=expr(execute);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr646);
					b=expr(execute);
					state._fsp--;

					 if (execute) retval.value = sem.binop((a!=null?((RpnParser.expr_return)a).value:0.0), (b!=null?((RpnParser.expr_return)b).value:0.0), tk); 
					}
					break;
				case 2 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:111:9: tk= UNAOP u= expr[execute]
					{
					tk=(Token)match(input,UNAOP,FOLLOW_UNAOP_in_expr669); 
					pushFollow(FOLLOW_expr_in_expr673);
					u=expr(execute);
					state._fsp--;

					 if (execute) retval.value = sem.unaop((u!=null?((RpnParser.expr_return)u).value:0.0), tk); 
					}
					break;
				case 3 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:113:9: NUM
					{
					NUM10=(Token)match(input,NUM,FOLLOW_NUM_in_expr694); 
					 if (execute) retval.value = sem.getNumber(NUM10); 
					}
					break;
				case 4 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:115:9: ID
					{
					ID11=(Token)match(input,ID,FOLLOW_ID_in_expr714); 
					 if (execute) retval.value = sem.getVar(ID11); 
					}
					break;
				case 5 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:117:9: fun= call[execute]
					{
					pushFollow(FOLLOW_call_in_expr736);
					fun=call(execute);
					state._fsp--;

					 if (execute) retval.value = fun; 
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



	// $ANTLR start "call"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:121:1: call[boolean execute] returns [double value] : name= ID '(' (arg= expr[execute] ( ',' arg= expr[execute] )* )? ')' ;
	public final double call(boolean execute) throws RecognitionException {
		double value = 0.0;


		Token name=null;
		ParserRuleReturnScope arg =null;

		 List<Double> args = new ArrayList<Double>(); 
		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:123:5: (name= ID '(' (arg= expr[execute] ( ',' arg= expr[execute] )* )? ')' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:123:9: name= ID '(' (arg= expr[execute] ( ',' arg= expr[execute] )* )? ')'
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_call778); 
			match(input,12,FOLLOW_12_in_call780); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:124:9: (arg= expr[execute] ( ',' arg= expr[execute] )* )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BINOP||(LA10_0 >= ID && LA10_0 <= NUM)||LA10_0==UNAOP) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:124:11: arg= expr[execute] ( ',' arg= expr[execute] )*
					{
					pushFollow(FOLLOW_expr_in_call794);
					arg=expr(execute);
					state._fsp--;

					 args.add((arg!=null?((RpnParser.expr_return)arg).value:0.0)); 
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:125:11: ( ',' arg= expr[execute] )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==14) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:125:13: ',' arg= expr[execute]
							{
							match(input,14,FOLLOW_14_in_call811); 
							pushFollow(FOLLOW_expr_in_call815);
							arg=expr(execute);
							state._fsp--;

							 args.add((arg!=null?((RpnParser.expr_return)arg).value:0.0)); 
							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;

			}

			match(input,13,FOLLOW_13_in_call834); 
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



	public static final BitSet FOLLOW_statement_in_start80 = new BitSet(new long[]{0x0000000000AD0040L});
	public static final BitSet FOLLOW_EOF_in_start86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_output_in_statement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_in_statement128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_statement150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_def_in_statement161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign182 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_assign184 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_assign186 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assign189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_output219 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_output221 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_output224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_input254 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_input256 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_input258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_ifstat288 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_cond_in_ifstat290 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_slist_in_ifstat295 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_ifstat300 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_slist_in_ifstat304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_whilestat338 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_cond_in_whilestat340 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_slist_in_whilestat345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_cond384 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CONOP_in_cond388 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_cond392 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_cond397 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_cond400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_def435 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_def439 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_def441 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_ID_in_def447 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_14_in_def453 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_def457 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_13_in_def467 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_deflist_in_def477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_deflist508 = new BitSet(new long[]{0x0000000000ED0040L});
	public static final BitSet FOLLOW_statement_in_deflist512 = new BitSet(new long[]{0x0000000000ED0040L});
	public static final BitSet FOLLOW_ret_in_deflist518 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_deflist521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_slist551 = new BitSet(new long[]{0x0000000002AD0040L});
	public static final BitSet FOLLOW_statement_in_slist555 = new BitSet(new long[]{0x0000000002AD0040L});
	public static final BitSet FOLLOW_25_in_slist561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_ret585 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_ret587 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ret590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINOP_in_expr637 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_expr641 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_expr646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAOP_in_expr669 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_expr673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_expr694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_expr736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_call778 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_call780 = new BitSet(new long[]{0x00000000000024D0L});
	public static final BitSet FOLLOW_expr_in_call794 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_14_in_call811 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_call815 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_13_in_call834 = new BitSet(new long[]{0x0000000000000002L});
}
