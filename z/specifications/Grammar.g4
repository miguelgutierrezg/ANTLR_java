grammar Grammar;

import Tokenizer;

program
    : sentencia* EOF
    ;

sentencia
    : (definicion_global | asignacion | func_definicion | struct_definicion | salida | entrada)
    ;

sentencia_funcion
	: (definicion_global | asignacion | salida | entrada |func_call';'|if_statement|while_statement|return_statement)
	;
	
definicion_global
    : 'var' IDENT ':' ( '[' LITENT ']' )* tipo ';'
    ;
    
definicion_local
	: IDENT ':' ( '[' LITENT ']' )* tipo
	;

func_definicion
    : IDENT '(' (definicion_local (',' definicion_local)*)? ')' (':' tipo)? '{' (sentencia_funcion)*'}'
    ;
    
return_statement
	: 'return' expresion? ';'
	;
	
struct_definicion
    : 'struct' IDENT '{' (definicion_local';')* '}'
    ;

if_statement
    : 'if' '('expresion')' '{' (sentencia_funcion)*'}'('else' '{' (sentencia_funcion)*'}')?
    ;

while_statement
    : 'while' '('expresion')' '{' (sentencia_funcion)*'}'
    ;

salida
	: ('print'|'printsp'|'println') (expresion_list)? ';'
	;
	
expresion_list
	:expresion (',' expresion)*
	;
	
entrada
	: 'read' expresion ';'
	;
	
func_call
	: IDENT'('(expresion(','expresion)*)?')'
	;
    

asignacion
    : expresion '=' expresion ';'
    ;
    
expresion
    : '(' expresion ')'
    | '<'tipo'>' '('expresion')'
    | IDENT
    | LITENT
    | LITCHAR
    | LITREAL
    | func_call
    | expresion '[' expresion ']'
    | '!' expresion
    | expresion ('*' | '/') expresion
    | expresion ('+' | '-') expresion
    | expresion ('<' | '>' | '<=' | '>=') expresion
    | expresion ('==' | '!=') expresion
    | expresion '&&' expresion
    | expresion '||' expresion
    | expresion '.' expresion
    ;


	


tipo
    : 'int'
    | 'float'
    | 'char'
    | IDENT
    ;