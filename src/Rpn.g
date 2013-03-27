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
    return env.currentSpace;
}
}

@lexer::members {}

start
@init { init (); }
    :   ( def | statement[true] )* EOF
    ;

statement[boolean execute]
    :   assign[execute]
    |   display[execute]
    |   input[execute]
    ;

assign[boolean execute]
    :   ID '=' expr[execute] ';'
        { if (execute) sem.assign($ID, $expr.value); }
    ;

display[boolean execute]
    :   '<<' expr[execute] ';'
        { if (execute) sem.display($expr.text + " = " + $expr.value); }
    ;

input[boolean execute]
    :   '>>' ID ';'
        { if (execute) sem.input($ID); }
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
    |   fn=call[execute]
        { if (execute) $value = $fn.value; } // TODO
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
