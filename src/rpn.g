grammar rpn;

options {
    language = Java;
    k = 1;
}

@header {
package rpn.compiler.core;

import rpn.compiler.utils.*;
import java.util.Hashtable;
import com.sun.tools.javac.util.Pair;
}

@lexer::header {
package rpn.compiler.core;
}

@members {
Environment env;
Semantic sem;

void init () {
    System.out.println("Start Parsing...\n");
    env = new Environment ();
    sem = new Semantic (env);
 }
  
public ArrayList<Pair<Token, String>> getErrors () {
    return env.errors;
}
  
public ArrayList<Pair<Token, String>> getWarnings() {
    return env.warnings;
}
  
public Hashtable<String, Double> getVariables() {
    return env.symbolTable;
}
}

@lexer::members {}

s
@init { init (); }
         :   ( def )* prog
         ;
         
prog     
         :   'program' ID '{' li '}'
         ;

li       
         :   ( ass | disp )* ret
         ;

ass 
         :   tk=ID '=' v=expr ';' { sem.saveVar ($tk, $v.value); }
         ;

disp     
         :   '?' v=expr ';' { sem.display($v.text, $v.value); }
         ;

ret      
         :   'return' expr ';'
         ;

expr     returns [double value]
         :   tk='+' v1=expr v2=expr { $value = sem.add($v1.value, $v2.value); }
         |   tk='-' v1=expr v2=expr { $value = sem.sub($v1.value, $v2.value); }
         |   tk='*' v1=expr v2=expr { $value = sem.mul($v1.value, $v2.value); }
         |   tk='/' v1=expr v2=expr { $value = sem.div($v1.value, $v2.value, $tk); }
         |   n=NUM                  { $value = sem.getValue($n); }
         |   tk=UMINUS n=NUM        { $value = -(sem.getValue($n)); }
         |   f=fn                   { $value = 0.0; } //TODO
         |   id=ID                  { $value = sem.getVarValue($id); }
         ;

fn       
         :   ':' ID '(' ( expr ( ',' expr )* )? ')'  ;

def      
         :   'def' ID '(' ( ID ( ',' ID )* )? ')' '{' li '}'
         ;

UMINUS   
         :   '_' ;
ID       
         :   ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

//NUM      :   ( [1-9] DIGIT* | '0' ) ( '.' DIGIT+ )? ;
//DIGIT    :   [0-9] ;
//LETTER   :   [a-zA-Z_] ;
//WS       :   [\t\r\n ]+ -> skip ;

NUM      
         :   ( ('1'..'9') ('0'..'9')* | '0' ) ( '.' ('0'..'9')+ )? ;
         
WS       
         :   ('\t' | '\r' | '\n' | ' ')+ { skip(); } ;
         
//COMMENT
//         :   ( '//' .*? '\n' 
//         |     '/*' .*? '*/' ) { skip(); }
//         ;
    
SCAN_ERROR    
         :   .   ;
