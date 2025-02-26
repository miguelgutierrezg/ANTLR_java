grammar Grammar;

import Tokenizer;

program
    : sentencia* EOF
    ;

sentencia
    : (definicion_global | asignacion | func_definicion | struct_definicion | entrada)
    ;

sentencia_funcion
	: (definicion_global | asignacion | entrada |func_call)
	;
	
definicion_global
    : 'var' IDENT ':' ( '[' LITENT ']' )* tipo ';'
    ;
    
definicion_local
	: IDENT ':' ( '[' LITENT ']' )* tipo
	;

func_definicion
    : IDENT '(' (definicion_local (',' definicion_local)*)? ')' (':' tipo)? '{' (sentencia_funcion)* ('return' expresion ';')?'}'
    ;

struct_definicion
    : 'struct' IDENT '{' (definicion_local';')* '}'
    ;


entrada
	: 'print' expresion ';'
	| 'printsp' expresion ';'
	| 'println' expresion ';'
	;
	
func_call
	: IDENT'('(expresion(','expresion)*)?')'
	;
    

asignacion
    : expresion '=' expresion ';'
    ;
    
expresion
    : '(' expresion ')'
    | IDENT
    | LITENT
    | LITCHAR
    | LITREAL
    | expresion '[' expresion ']'
    | '!' expresion
    | expresion ('*' | '/') expresion
    | expresion ('+' | '-') expresion
    | expresion ('==' | '!=') expresion
    | expresion ('<' | '>' | '<=' | '>=') expresion
    | expresion ('&&'|'||') expresion
    | expresion '.' expresion
    ;


	


tipo
    : 'int'
    | 'float'
    | 'char'
    | IDENT
    ;