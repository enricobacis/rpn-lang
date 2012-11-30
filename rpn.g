grammar rpn;

options {
    language = Java;
    k = 1;
}

@header {}

@lexer::header {}

@members {}

@lexer::members {}

PROG    :   'prog' ;
DEF     :   'def' ;
RETURN  :   'return' ;
NEWLINE :   '\n' ;
QMARK   :   '?' ;
COMMA   :   ',' ;
LR      :   '(' ;
RR      :   ')' ;
LC      :   '{' ;
RC      :   '}' ;
EQUALS  :   '=' ;
UMINUS  :   '_' ;
PLUS    :   '+' ;
MINUS   :   '-' ;
TIMES   :   '*' ;
DIV     :   '/' ;
ID      :   ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')* ;
NUM     :   ( ( ('1'..'9') ('0'..'9')* ) | '0') ('.' ('0'..'9')+ )? ;
WS      :   ( ' ' | '\t' | '\r' )+ {$channel=HIDDEN;} ;

s       :   ld
        ;

ld      :   prog
        |   def ld
        ;

prog    :   PROG LC li RC
        ;

li      :   ret
        |   i li
        ;

i       :   ( ass | disp ) NEWLINE
        |   NEWLINE
        ;

ass     :   ID EQUALS expr
        ;

disp    :   QMARK ID
        ;

ret     :   RETURN expr
        ;

expr    :   ( PLUS | MINUS | TIMES | DIV ) expr expr
        |   NUM
        |   ID
        ;

def     :   DEF ID LR lp RR LC li RC
        ;

lp      :   ( ID ( COMMA ID )* )?
        ;
