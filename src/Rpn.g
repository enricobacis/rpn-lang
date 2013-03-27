grammar Rpn;

options {
    language = Java;
    k = 1;
}

@header {
package rpn.interpreter.core;

import rpn.interpreter.utils.*;
import java.util.Hashtable;
}

@lexer::header {
package rpn.interpreter.core;
}

@members {
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
}

@lexer::members {}

start
@init { init (); }
    :   ( def | statement[true] )* EOF
    ;

statement[boolean execute]
    :   assign[execute]
    |   output[execute]
    |   input[execute]
    |   ifstat[execute]
    |   whilestat[execute]
    ;

assign[boolean execute]
    :   ID '=' expr[execute] ';'
        { if (execute) sem.assign($ID, $expr.value); }
    ;

output[boolean execute]
    :   '<<' expr[execute] ';'
        { if (execute) sem.output($expr.text + " = " + $expr.value); }
    ;

input[boolean execute]
    :   '>>' ID ';'
        { if (execute) sem.input($ID); }
    ;

ifstat[boolean execute]
    :   'if' cond[false] il=slist[false] ( 'else' el=slist[false] )?
        { if (execute) sem.ifstat($cond.start, $il.start, $el.start); }
    ;

whilestat[boolean execute]
    :   'while' cond[false] wl=slist[false]
        { if (execute) sem.whilestat($cond.start, $wl.start); }
    ;
    
cond[boolean execute] returns [boolean satisfied]
    :   '(' l=expr[execute] tk=CONOP r=expr[execute] ')'
        { if (execute) $satisfied = sem.cond($l.value, $r.value, $tk); }
    ;

expr[boolean execute] returns [double value]
options { k = 2; }
    :   tk=BINOP a=expr[execute] b=expr[execute]
        { if (execute) $value = sem.binop($a.value, $b.value, $tk); }
    |   tk=UNAOP u=expr[execute]
        { if (execute) $value = sem.unaop($u.value, $tk); }
    |   NUM
        { if (execute) $value = sem.getNumber($NUM); }
    |   ID
        { if (execute) $value = sem.getVar($ID); }
    |   fun=call[execute]
        { if (execute) $value = $fun.value; }
    ;

def
@init { List<Token> args = new ArrayList<Token>(); }
    :   'def' name=ID '(' ( arg=ID { args.add($arg); } ( ',' arg=ID { args.add($arg); } )* )? ')'
        deflist[false] { sem.def($name.text, args, $deflist.start); }
    ;
    
deflist[boolean execute] returns [double value]
    :   '{' ( statement[execute] )* ret[execute] '}'
        { if (execute) $value = $ret.value; }
    ;

slist[boolean execute]
    :   '{' ( statement[execute] )* '}'
    ;

ret[boolean execute] returns [double value]
    :   'return' expr[execute] ';'
        { if (execute) $value = $expr.value; }
    ;

call[boolean execute] returns [double value]
@init { List<Double> args = new ArrayList<Double>(); }
    :   name=ID '('
        ( arg=expr[execute] { args.add($arg.value); }
          ( ',' arg=expr[execute] { args.add($arg.value); } )*
        )? ')'
        { if (execute) $value = sem.call($name, args); }
    ;

UNAOP
    :   ('~' | '!')
    ;

BINOP
    :   ('+' | '-' | '*' | '/')
    ;

CONOP
    :   ('<' | '<=' | '==' | '>=' | '>')
    ;

ID       
    :   ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
    ;

NUM      
    :   ( ('1'..'9') ('0'..'9')* | '0' ) ( '.' ('0'..'9')+ )?
    ;
         
WS       
    :   ('\t' | '\r' | '\n' | ' ')+ { $channel=HIDDEN; }
    ;
         
SL_COMMENT
    :   '#' ~('\r'|'\n')* { $channel=HIDDEN; }
    ;
    
SCAN_ERROR
    :   .
    ;
