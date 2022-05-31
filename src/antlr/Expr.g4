grammar Expr;

// -no-listener
// nieterminale z małej litery, tokeny all capital / One calpital first

@header {
package antlr;
}

//start symbol

prog: (decl | expr)+ EOF
     ;

decl: ID ':' INT_TYPE '=' NUM
     ;
//ANTLR tutaj kolejnosc bierze pod uwage
expr: expr '*' expr
    | expr '+' expr
    | ID
    | NUM
    ;



//tokens

ID: [a-z][a-zA-Z0-9_]*;
NUM: '0' | '-'?[1-9][0-9]*;
INT_TYPE: 'INT';
COMMENT: '//' ~[\r\n]* -> skip;
COMMENT_LONG: '/*' ~[*/]* -> skip;

WS: [ \t\n]+ -> skip;