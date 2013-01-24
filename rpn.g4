grammar rpn;

options {
    language = Java;
    // k = 1;
}

//@header {}

//@lexer::header {}

//@members {}

//@lexer::members {}

s        :   ( def )* prog
         ;

prog     :   'program' ID '{' li '}'
         ;

li       :   ( ass | disp )* ret
         ;

ass      :   ID '=' expr ';'
         ;

disp     :   '?' expr ';'
         ;

ret      :   'return' expr ';'
         ;

expr     :   ( '+' | '-' | '*' | '/' ) expr expr
         |   ( UMINUS )? NUM
         |   fn
         |   ID
         ;

fn       :   ID '(' ( expr ( ',' expr )* )? ')' ;

def      :   'def' ID '(' ( ID ( ',' ID )* )? ')' '{' li '}'
         ;

UMINUS   :   '_' ;
ID       :   LETTER ( LETTER | DIGIT )* ;
NUM      :   ( [1-9] DIGIT* | '0' ) ( '.' DIGIT+ )? ;
DIGIT    :   [0-9] ;
LETTER   :   [a-zA-Z_] ;
WS       :   [\t\r\n ]+ -> skip ;
ERROR    :   .   ;
