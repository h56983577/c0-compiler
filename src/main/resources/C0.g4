grammar C0; // 声明语法头
/*
*========================
*   一些 options 配置
*=======================
*/
options {
    language = Java; //设定生成代码的语言
}
/**
 =========================
   rule
 =========================
*/
/* 程序 */
program : item*;
item : function | decl_stmt;

// 关键字
FN_KW : 'fn';
LET_KW : 'let';
CONST_KW : 'const';
AS_KW : 'as';
WHILE_KW : 'while';
IF_KW : 'if';
ELSE_KW : 'else';
RETURN_KW : 'return';
BREAK_KW : 'break';
CONTINUE_KW : 'continue';
WS: [ \t\n\r]+ -> skip ;

// ## 字面量
UINT_LITERAL : [0-9]+;
DOUBLE_LITERAL : [0-9]+ '.' [0-9]+ ([eE] [0-9]+)?;

ESCAPE_SEQUENCE : '\\' [\\'"nrt];
STRING_REGULAR_CHAR : [^"\\];
STRING_LITERAL : '"' (STRING_REGULAR_CHAR | ESCAPE_SEQUENCE)* '"';

CHAR_REGULAR_CHAR : [^'\\];
CHAR_LITERAL : '\'' (CHAR_REGULAR_CHAR | ESCAPE_SEQUENCE) '\'';

// 标识符
IDENT : [_a-zA-Z] [_a-zA-Z0-9]*;

// 符号
PLUS      : '+';
MINUS     : '-';
MUL       : '*';
DIV       : '/';
ASSIGN    : '=';
EQ        : '==';
NEQ:'!=';
LT        : '<';
GT        : '>';
LE        : '<=';
GE        : '>=';
L_PAREN   : '(';
R_PAREN   : ')';
L_BRACE   : '{';
R_BRACE   : '}';
ARROW     : '->';
COMMA     : ',';
COLON     : ':';
SEMICOLON : ';';

// ## 注释
COMMENT : '//' .* '\n';

// # 表达式
expr : expr2 | expr1;
expr1 :
    negate_expr
    | assign_expr
    | call_expr
    | literal_expr
    | ident_expr
    | group_expr;
expr2 : operator_expr | as_expr;

binary_operator : PLUS | '-' | '*' | '/' | '==' | '!=' | '<' | '>' | '<=' | '>=';
operator_expr : expr1 (binary_operator expr)+;

negate_expr : '-' expr;

assign_expr : l_expr '=' expr;

as_expr : expr1 ('as' ty)+;

call_param_list : expr (',' expr)*;
call_expr : IDENT '(' call_param_list? ')';

literal_expr : UINT_LITERAL | DOUBLE_LITERAL | STRING_LITERAL | CHAR_LITERAL;

ident_expr : IDENT;

group_expr : '(' expr ')';

// 左值表达式
l_expr : IDENT;

// 类型
ty : IDENT;

// 语句
stmt :
      expr_stmt
    | decl_stmt
    | if_stmt
    | while_stmt
    | break_stmt
    | continue_stmt
    | return_stmt
    | block_stmt
    | empty_stmt;

expr_stmt : expr ';';

let_decl_stmt : 'let' IDENT ':' ty ('=' expr)? ';';
const_decl_stmt : 'const' IDENT ':' ty '=' expr ';';
decl_stmt : let_decl_stmt | const_decl_stmt;

if_stmt : 'if' expr block_stmt ('else' 'if' expr block_stmt)* ('else' block_stmt)?;

while_stmt : 'while' expr block_stmt;

break_stmt : 'break' ';';

continue_stmt : 'continue' ';';

return_stmt : 'return' expr? ';';

block_stmt : '{' stmt* '}';

empty_stmt : ';';

// # 函数
function_param : 'const'? IDENT ':' ty;
function_param_list : function_param (',' function_param)*;
function : 'fn' IDENT '(' function_param_list? ')' '->' ty block_stmt;
