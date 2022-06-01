grammar JavaGr;

// -no-listener
// nieterminale z małej litery, tokeny all capital / One calpital first

@header {
package antlr;
}

//start symbol

prog: package (import_op)* class EOF;

//tokens
NUMBER: [0-9];
CHARACTER: [a-zA-Z];
IDENTIFIER: [a-zA-Z][a-zA-Z0-9]+;
STRING_VAL: '"'[.]*'"';
CHAR_VAL: '\''[.]'\'';
INT_VAL: [1-9][0-9]*;
FLOAT_VAL: [+-]?([0-9]*[.])?[0-9]+'f';
DOUBLE_VAL:  [+-]?([0-9]*[.])?[0-9]+;
//ANY_SYMBOL: .;
DO_: 'do';
FLOAT: 'float';
INT: 'int';
DOUBLE: 'double';
STRING: 'string';
CHAR: 'char';
BOOL: 'boolean';
PUBLIC: 'public';
CLASS: 'class';
TRUE: 'true';
FALSE: 'false';
EQUAL: '=';
NOT_EQUAL: '!=';
GREATER: '>';
LESS: '<';
GREATER_EQUAL: '>=';
LESS_EQUAL: '<=';
BRACKET_L: '(';
BRACKET_R: ')';
SQ_BRACKET_L: '[';
SQ_BRACKET_R: ']';
PARENT_L: '{';
PARENT_R: '}';
ADD: '+';
SUBTRACT: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';
COMMENT: '//'~[\r\n]*;
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
SEMICOLON: ';';
COMMA: ',';
NEWLINE: '\n';
IMPORT: 'import';
PACKAGE: 'package';
RETURN: 'return';
PRIVATE_NEW_VAR: 'private';
PROTECTED_NEW_VAR: 'protected';
STATIC_VAR: 'static';
OR: '||';
AND: '&&';

numeric_type: INT
| FLOAT
| DOUBLE;

text_type: CHAR
| STRING;

datatype: numeric_type
| text_type
| BOOL;

bool_val: TRUE
| FALSE;

num_val: INT_VAL
| DOUBLE_VAL
| FLOAT_VAL
| IDENTIFIER;

declaration_var: (PUBLIC | PRIVATE_NEW_VAR | PROTECTED_NEW_VAR) STATIC_VAR? datatype STRING SEMICOLON;

input_vars: (datatype IDENTIFIER) (COMMA datatype IDENTIFIER)*;

function_in: BRACKET_L input_vars BRACKET_R;

function_to_ret: (PUBLIC | PRIVATE_NEW_VAR | PROTECTED_NEW_VAR) STATIC_VAR? datatype STRING function_in;

return_statement: RETURN (IDENTIFIER | math_expr | bool_val | CHAR_VAL | STRING_VAL | function_to_ret)?;

elif_statement: if_statement ELSE elif_statement;

instruction: declaration SEMICOLON
| assignment SEMICOLON
| modification SEMICOLON
| if_statement
| elif_statement
| while_loop
| do_while_loop
| for_loop
| return_statement SEMICOLON;

instruction_general: (instruction SEMICOLON NEWLINE | COMMENT)*;

function_body: PARENT_L instruction_general PARENT_R;

function: (PUBLIC | PRIVATE_NEW_VAR | PROTECTED_NEW_VAR) STATIC_VAR? datatype STRING function_in function_body ;

class: PUBLIC CLASS PARENT_L  (declaration_var | function)* PARENT_R;

math_symbol: ADD
| SUBTRACT
| MULTIPLY
| DIVIDE
| MODULO;

add_equals: ADD EQUAL;
subtract_equals: SUBTRACT EQUAL;
multiply_equals: MULTIPLY EQUAL;
divide_equals: DIVIDE EQUAL;
modulo_equals: MODULO EQUAL;

math_modification: add_equals
| subtract_equals
| multiply_equals
| divide_equals
| modulo_equals;

math_expr: math_expr math_symbol math_expr
| num_val
| BRACKET_L math_expr BRACKET_R;

declaration: datatype IDENTIFIER(COMMA IDENTIFIER)*;

assignment: numeric_type IDENTIFIER EQUAL math_expr
| CHAR IDENTIFIER EQUAL CHARACTER
| STRING EQUAL STRING_VAL
| BOOL EQUAL bool_val;

add_double: ADD ADD;

subtract_double: SUBTRACT SUBTRACT;

modification: IDENTIFIER math_modification math_expr
| IDENTIFIER add_double
| IDENTIFIER subtract_double;

comparator: EQUAL
| NOT_EQUAL
| GREATER
| LESS
| GREATER_EQUAL
| LESS_EQUAL;

comparison: num_val comparator num_val;

logic_statement: comparison | bool_val;

logic_operator: OR | AND;

logic_condition: BRACKET_L logic_statement (logic_operator logic_statement)* BRACKET_R;

if_statement: IF logic_condition PARENT_L instruction_general PARENT_R;

while_loop: WHILE logic_condition PARENT_L instruction_general PARENT_R;

do_while_loop: DO_ PARENT_L instruction_general PARENT_R WHILE logic_condition;

for_loop: FOR BRACKET_L assignment SEMICOLON comparison SEMICOLON modification BRACKET_R PARENT_L instruction_general PARENT_R;

package: PACKAGE STRING SEMICOLON;

import_op: IMPORT STRING SEMICOLON;