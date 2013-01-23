grammar rpn;

options {
    language = Java;
    k = 1;
}

@header {}

@lexer::header {}

@members {}

@lexer::members {}

s        :   ( def )* prog
         ;

prog     :   PROG LC li RC
         ;

li       :   ( ass | disp )* ret
         ;

ass      :   ID EQ expr SC
         ;

disp     :   QMARK expr SC
         ;

ret      :   RET expr SC
         ;

expr     :   ( PLUS | MINUS | TIMES | DIV ) expr expr
         |   ( UMINUS )? NUM
         |   ID
         ;

def      :   DEF ID LR ( ID ( COMMA ID )* )? RR LC li RC
         ;


PROG     :   'prog' ;
DEF      :   'def' ;
RET      :   'return' ;
QMARK    :   '?' ;
COMMA    :   ',' ;
SC       :   ';' ;
LR       :   '(' ;
RR       :   ')' ;
LC       :   '{' ;
RC       :   '}' ;
EQ       :   '=' ;
UMINUS   :   '_' ;
PLUS     :   '+' ;
MINUS    :   '-' ;
TIMES    :   '*' ;
DIV      :   '/' ;
ID       :   ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')* ;
NUM      :   ( ( ('1'..'9') ('0'..'9')* ) | '0') ('.' ('0'..'9')+ )? ;
WS       :   ( ' ' | '\t' | '\r' | '\n' )+ { $channel=HIDDEN; } ;
ERROR    :   .   ;
