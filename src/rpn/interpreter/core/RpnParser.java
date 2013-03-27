// $ANTLR 3.5 /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g 2013-03-27 15:03:36

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
				if ( (LA1_0==19) ) {
					alt1=1;
				}
				else if ( (LA1_0==ID||LA1_0==16||LA1_0==18||LA1_0==21||LA1_0==23) ) {
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:48:1: statement[boolean execute] : ( assign[execute] | output[execute] | input[execute] | ifstat[execute] | whilestat[execute] );
	public final void statement(boolean execute) throws RecognitionException {
		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:49:5: ( assign[execute] | output[execute] | input[execute] | ifstat[execute] | whilestat[execute] )
			int alt2=5;
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
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:50:9: output[execute]
					{
					pushFollow(FOLLOW_output_in_statement121);
					output(execute);
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
				case 4 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:52:9: ifstat[execute]
					{
					pushFollow(FOLLOW_ifstat_in_statement143);
					ifstat(execute);
					state._fsp--;

					}
					break;
				case 5 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:53:9: whilestat[execute]
					{
					pushFollow(FOLLOW_whilestat_in_statement154);
					whilestat(execute);
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:56:1: assign[boolean execute] : ID '=' expr[execute] ';' ;
	public final void assign(boolean execute) throws RecognitionException {
		Token ID1=null;
		ParserRuleReturnScope expr2 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:57:5: ( ID '=' expr[execute] ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:57:9: ID '=' expr[execute] ';'
			{
			ID1=(Token)match(input,ID,FOLLOW_ID_in_assign175); 
			match(input,17,FOLLOW_17_in_assign177); 
			pushFollow(FOLLOW_expr_in_assign179);
			expr2=expr(execute);
			state._fsp--;

			match(input,15,FOLLOW_15_in_assign182); 
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:61:1: output[boolean execute] : '<<' expr[execute] ';' ;
	public final void output(boolean execute) throws RecognitionException {
		ParserRuleReturnScope expr3 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:62:5: ( '<<' expr[execute] ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:62:9: '<<' expr[execute] ';'
			{
			match(input,16,FOLLOW_16_in_output212); 
			pushFollow(FOLLOW_expr_in_output214);
			expr3=expr(execute);
			state._fsp--;

			match(input,15,FOLLOW_15_in_output217); 
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:66:1: input[boolean execute] : '>>' ID ';' ;
	public final void input(boolean execute) throws RecognitionException {
		Token ID4=null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:67:5: ( '>>' ID ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:67:9: '>>' ID ';'
			{
			match(input,18,FOLLOW_18_in_input247); 
			ID4=(Token)match(input,ID,FOLLOW_ID_in_input249); 
			match(input,15,FOLLOW_15_in_input251); 
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:71:1: ifstat[boolean execute] : 'if' cond[false] il= slist[false] ( 'else' el= slist[false] )? ;
	public final void ifstat(boolean execute) throws RecognitionException {
		ParserRuleReturnScope il =null;
		ParserRuleReturnScope el =null;
		ParserRuleReturnScope cond5 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:72:5: ( 'if' cond[false] il= slist[false] ( 'else' el= slist[false] )? )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:72:9: 'if' cond[false] il= slist[false] ( 'else' el= slist[false] )?
			{
			match(input,21,FOLLOW_21_in_ifstat281); 
			pushFollow(FOLLOW_cond_in_ifstat283);
			cond5=cond(false);
			state._fsp--;

			pushFollow(FOLLOW_slist_in_ifstat288);
			il=slist(false);
			state._fsp--;

			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:72:42: ( 'else' el= slist[false] )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==20) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:72:44: 'else' el= slist[false]
					{
					match(input,20,FOLLOW_20_in_ifstat293); 
					pushFollow(FOLLOW_slist_in_ifstat297);
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:76:1: whilestat[boolean execute] : 'while' cond[false] wl= slist[false] ;
	public final void whilestat(boolean execute) throws RecognitionException {
		ParserRuleReturnScope wl =null;
		ParserRuleReturnScope cond6 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:77:5: ( 'while' cond[false] wl= slist[false] )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:77:9: 'while' cond[false] wl= slist[false]
			{
			match(input,23,FOLLOW_23_in_whilestat331); 
			pushFollow(FOLLOW_cond_in_whilestat333);
			cond6=cond(false);
			state._fsp--;

			pushFollow(FOLLOW_slist_in_whilestat338);
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:81:1: cond[boolean execute] returns [boolean satisfied] : '(' l= expr[execute] tk= CONOP r= expr[execute] ')' ;
	public final RpnParser.cond_return cond(boolean execute) throws RecognitionException {
		RpnParser.cond_return retval = new RpnParser.cond_return();
		retval.start = input.LT(1);

		Token tk=null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope r =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:82:5: ( '(' l= expr[execute] tk= CONOP r= expr[execute] ')' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:82:9: '(' l= expr[execute] tk= CONOP r= expr[execute] ')'
			{
			match(input,12,FOLLOW_12_in_cond377); 
			pushFollow(FOLLOW_expr_in_cond381);
			l=expr(execute);
			state._fsp--;

			tk=(Token)match(input,CONOP,FOLLOW_CONOP_in_cond386); 
			pushFollow(FOLLOW_expr_in_cond390);
			r=expr(execute);
			state._fsp--;

			match(input,13,FOLLOW_13_in_cond393); 
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


	public static class expr_return extends ParserRuleReturnScope {
		public double value;
	};


	// $ANTLR start "expr"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:86:1: expr[boolean execute] returns [double value] options {k=2; } : (tk= BINOP a= expr[execute] b= expr[execute] |tk= UNAOP u= expr[execute] | NUM | ID |fun= call[execute] );
	public final RpnParser.expr_return expr(boolean execute) throws RecognitionException {
		RpnParser.expr_return retval = new RpnParser.expr_return();
		retval.start = input.LT(1);

		Token tk=null;
		Token NUM7=null;
		Token ID8=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope u =null;
		double fun =0.0;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:88:5: (tk= BINOP a= expr[execute] b= expr[execute] |tk= UNAOP u= expr[execute] | NUM | ID |fun= call[execute] )
			int alt4=5;
			switch ( input.LA(1) ) {
			case BINOP:
				{
				alt4=1;
				}
				break;
			case UNAOP:
				{
				alt4=2;
				}
				break;
			case NUM:
				{
				alt4=3;
				}
				break;
			case ID:
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4==12) ) {
					alt4=5;
				}
				else if ( ((LA4_4 >= BINOP && LA4_4 <= NUM)||LA4_4==UNAOP||(LA4_4 >= 13 && LA4_4 <= 15)) ) {
					alt4=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:88:9: tk= BINOP a= expr[execute] b= expr[execute]
					{
					tk=(Token)match(input,BINOP,FOLLOW_BINOP_in_expr440); 
					pushFollow(FOLLOW_expr_in_expr444);
					a=expr(execute);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr449);
					b=expr(execute);
					state._fsp--;

					 if (execute) retval.value = sem.binop((a!=null?((RpnParser.expr_return)a).value:0.0), (b!=null?((RpnParser.expr_return)b).value:0.0), tk); 
					}
					break;
				case 2 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:90:9: tk= UNAOP u= expr[execute]
					{
					tk=(Token)match(input,UNAOP,FOLLOW_UNAOP_in_expr472); 
					pushFollow(FOLLOW_expr_in_expr476);
					u=expr(execute);
					state._fsp--;

					 if (execute) retval.value = sem.unaop((u!=null?((RpnParser.expr_return)u).value:0.0), tk); 
					}
					break;
				case 3 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:92:9: NUM
					{
					NUM7=(Token)match(input,NUM,FOLLOW_NUM_in_expr497); 
					 if (execute) retval.value = sem.getNumber(NUM7); 
					}
					break;
				case 4 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:94:9: ID
					{
					ID8=(Token)match(input,ID,FOLLOW_ID_in_expr517); 
					 if (execute) retval.value = sem.getVar(ID8); 
					}
					break;
				case 5 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:96:9: fun= call[execute]
					{
					pushFollow(FOLLOW_call_in_expr539);
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



	// $ANTLR start "def"
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:100:1: def : 'def' name= ID '(' (arg= ID ( ',' arg= ID )* )? ')' deflist[false] ;
	public final void def() throws RecognitionException {
		Token name=null;
		Token arg=null;
		ParserRuleReturnScope deflist9 =null;

		 List<Token> args = new ArrayList<Token>(); 
		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:102:5: ( 'def' name= ID '(' (arg= ID ( ',' arg= ID )* )? ')' deflist[false] )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:102:9: 'def' name= ID '(' (arg= ID ( ',' arg= ID )* )? ')' deflist[false]
			{
			match(input,19,FOLLOW_19_in_def574); 
			name=(Token)match(input,ID,FOLLOW_ID_in_def578); 
			match(input,12,FOLLOW_12_in_def580); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:102:27: (arg= ID ( ',' arg= ID )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:102:29: arg= ID ( ',' arg= ID )*
					{
					arg=(Token)match(input,ID,FOLLOW_ID_in_def586); 
					 args.add(arg); 
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:102:56: ( ',' arg= ID )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==14) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:102:58: ',' arg= ID
							{
							match(input,14,FOLLOW_14_in_def592); 
							arg=(Token)match(input,ID,FOLLOW_ID_in_def596); 
							 args.add(arg); 
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			match(input,13,FOLLOW_13_in_def606); 
			pushFollow(FOLLOW_deflist_in_def616);
			deflist9=deflist(false);
			state._fsp--;

			 sem.def((name!=null?name.getText():null), args, (deflist9!=null?(deflist9.start):null)); 
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:106:1: deflist[boolean execute] returns [double value] : '{' ( statement[execute] )* ret[execute] '}' ;
	public final RpnParser.deflist_return deflist(boolean execute) throws RecognitionException {
		RpnParser.deflist_return retval = new RpnParser.deflist_return();
		retval.start = input.LT(1);

		double ret10 =0.0;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:107:5: ( '{' ( statement[execute] )* ret[execute] '}' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:107:9: '{' ( statement[execute] )* ret[execute] '}'
			{
			match(input,24,FOLLOW_24_in_deflist647); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:107:13: ( statement[execute] )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ID||LA7_0==16||LA7_0==18||LA7_0==21||LA7_0==23) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:107:15: statement[execute]
					{
					pushFollow(FOLLOW_statement_in_deflist651);
					statement(execute);
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_ret_in_deflist657);
			ret10=ret(execute);
			state._fsp--;

			match(input,25,FOLLOW_25_in_deflist660); 
			 if (execute) retval.value = ret10; 
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:111:1: slist[boolean execute] : '{' ( statement[execute] )* '}' ;
	public final RpnParser.slist_return slist(boolean execute) throws RecognitionException {
		RpnParser.slist_return retval = new RpnParser.slist_return();
		retval.start = input.LT(1);

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:112:5: ( '{' ( statement[execute] )* '}' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:112:9: '{' ( statement[execute] )* '}'
			{
			match(input,24,FOLLOW_24_in_slist690); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:112:13: ( statement[execute] )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==ID||LA8_0==16||LA8_0==18||LA8_0==21||LA8_0==23) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:112:15: statement[execute]
					{
					pushFollow(FOLLOW_statement_in_slist694);
					statement(execute);
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			match(input,25,FOLLOW_25_in_slist700); 
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:115:1: ret[boolean execute] returns [double value] : 'return' expr[execute] ';' ;
	public final double ret(boolean execute) throws RecognitionException {
		double value = 0.0;


		ParserRuleReturnScope expr11 =null;

		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:116:5: ( 'return' expr[execute] ';' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:116:9: 'return' expr[execute] ';'
			{
			match(input,22,FOLLOW_22_in_ret724); 
			pushFollow(FOLLOW_expr_in_ret726);
			expr11=expr(execute);
			state._fsp--;

			match(input,15,FOLLOW_15_in_ret729); 
			 if (execute) value = (expr11!=null?((RpnParser.expr_return)expr11).value:0.0); 
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
	// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:120:1: call[boolean execute] returns [double value] : name= ID '(' (arg= expr[execute] ( ',' arg= expr[execute] )* )? ')' ;
	public final double call(boolean execute) throws RecognitionException {
		double value = 0.0;


		Token name=null;
		ParserRuleReturnScope arg =null;

		 List<Double> args = new ArrayList<Double>(); 
		try {
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:122:5: (name= ID '(' (arg= expr[execute] ( ',' arg= expr[execute] )* )? ')' )
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:122:9: name= ID '(' (arg= expr[execute] ( ',' arg= expr[execute] )* )? ')'
			{
			name=(Token)match(input,ID,FOLLOW_ID_in_call770); 
			match(input,12,FOLLOW_12_in_call772); 
			// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:123:9: (arg= expr[execute] ( ',' arg= expr[execute] )* )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==BINOP||(LA10_0 >= ID && LA10_0 <= NUM)||LA10_0==UNAOP) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:123:11: arg= expr[execute] ( ',' arg= expr[execute] )*
					{
					pushFollow(FOLLOW_expr_in_call786);
					arg=expr(execute);
					state._fsp--;

					 args.add((arg!=null?((RpnParser.expr_return)arg).value:0.0)); 
					// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:124:11: ( ',' arg= expr[execute] )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==14) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /home/enrico/Dropbox/enrico/code/uni/lang/rpn-lang/src/Rpn.g:124:13: ',' arg= expr[execute]
							{
							match(input,14,FOLLOW_14_in_call803); 
							pushFollow(FOLLOW_expr_in_call807);
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

			match(input,13,FOLLOW_13_in_call826); 
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



	public static final BitSet FOLLOW_def_in_start80 = new BitSet(new long[]{0x0000000000AD0040L});
	public static final BitSet FOLLOW_statement_in_start84 = new BitSet(new long[]{0x0000000000AD0040L});
	public static final BitSet FOLLOW_EOF_in_start90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_statement110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_output_in_statement121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_in_statement132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_statement143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign175 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_assign177 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_assign179 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assign182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_output212 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_output214 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_output217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_input247 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_input249 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_input251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_ifstat281 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_cond_in_ifstat283 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_slist_in_ifstat288 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_ifstat293 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_slist_in_ifstat297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_whilestat331 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_cond_in_whilestat333 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_slist_in_whilestat338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_cond377 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_cond381 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CONOP_in_cond386 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_cond390 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_cond393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINOP_in_expr440 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_expr444 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_expr449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAOP_in_expr472 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_expr476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_expr497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_expr539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_def574 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_def578 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_def580 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_ID_in_def586 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_14_in_def592 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_def596 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_13_in_def606 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_deflist_in_def616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_deflist647 = new BitSet(new long[]{0x0000000000E50040L});
	public static final BitSet FOLLOW_statement_in_deflist651 = new BitSet(new long[]{0x0000000000E50040L});
	public static final BitSet FOLLOW_ret_in_deflist657 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_deflist660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_slist690 = new BitSet(new long[]{0x0000000002A50040L});
	public static final BitSet FOLLOW_statement_in_slist694 = new BitSet(new long[]{0x0000000002A50040L});
	public static final BitSet FOLLOW_25_in_slist700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_ret724 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_ret726 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ret729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_call770 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_call772 = new BitSet(new long[]{0x00000000000024D0L});
	public static final BitSet FOLLOW_expr_in_call786 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_14_in_call803 = new BitSet(new long[]{0x00000000000004D0L});
	public static final BitSet FOLLOW_expr_in_call807 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_13_in_call826 = new BitSet(new long[]{0x0000000000000002L});
}
