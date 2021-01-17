package c0.tokenizer;

public enum TokenType {
    /* "fn" */
    FnKw,
    /* "let" */
    LetKw,
    /* "const" */
    ConstKw,
    /* "as" */
    AsKw,
    /* "while" */
    WhileKw,
    /* "if" */
    IfKw,
    /* "else" */
    ElseKw,
    /* "return" */
    ReturnKw,
    /* "break" */
    BreakKw,
    /* "continue" */
    ContinueKw,
    /* regex(r"\d+", |lex| lex.slice().parse()) */
    UIntLiteral,
    /* regex(r"\d+\.\d+([eE][+-]?\d+)?", |lex| lex.slice().parse()) */
    FloatLiteral,
    /* regex(r#"'([^\\']|\\[rnt\\/"'])'"#, parse_char_literal) */
    CharLiteral,
    /* regex(r#""([^\\"]|\\([rnt\\/"']))*""#, parse_string_literal) */
    StringLiteral,
    /* regex(r"[_a-zA-Z][_a-zA-Z0-9]*", |lex| SmolStr::new(lex.slice())) */
    Ident,
    /* "+" */
    Plus,
    /* "-" */
    Minus,
    /* "*" */
    Mul,
    /* "/" */
    Div,
    /* "=" */
    Assign,
    /* "==" */
    Eq,
    /* "!=" */
    Neq,
    /* "<" */
    Lt,
    /* ">" */
    Gt,
    /* "<=" */
    Le,
    /* ">=" */
    Ge,
    /* "(" */
    LParen,
    /* ")" */
    RParen,
    /* "{" */
    LBrace,
    /* "}" */
    RBrace,
    /* "->" */
    Arrow,
    /* "," */
    Comma,
    /* ":" */
    Colon,
    /* ";" */
    Semicolon,
    // Empty stuff
    /* regex(r"\s+", logos::skip, priority = 1) */
    Whitespace,
    /* regex(r"//.*\n", logos::skip) */
    Comment,
    // Error token
    Error,
    /** 文件尾 */
    EOF
}
