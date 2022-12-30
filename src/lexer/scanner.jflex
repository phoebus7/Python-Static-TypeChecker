%%

%class Lexer
%standalone
%unicode
%line
%column

whitespace = \r\n|\n\r
newline = "\n"
comment = \#[^\n\r]*
int = [+-]?[0-9]+ | [0][Bb][01]+ | [0][Xx][a-fA-F0-9]+ | [0][Oo][0-7]+
float = [+-]?[0-9]*\.?[0-9]+([Ee][+-]?[0-9]+)?
str = \'.*\' | \".*\"  
bool = "True" | "False"
id = [a-zA-Z_][a-zA-Z_0-9]*


%%

"await" {System.out.println("LEXER: await: " + yytext());}

"or" {System.out.println("LEXER: disjunction: " + yytext());}
"and" {System.out.println("LEXER: conjunction: " + yytext());}
"not" {System.out.println("LEXER: negation: " + yytext());}

{int} {System.out.println("LEXER: int token: " + yytext()); }
{float} {System.out.println("LEXER: float token: " + yytext());}
{bool} {System.out.println("LEXER: bool token: " + yytext());}
{str} {System.out.println("LEXER: str token: " + yytext()); }
{id} {System.out.println("LEXER: id token: " + yytext()); }




"&" {System.out.println("LEXER: bitwise and: " + yytext());}
"|" {System.out.println("LEXER: bitwise or: " + yytext());}
"^" {System.out.println("LEXER: bitwise xor: " + yytext());}
"~" {System.out.println("LEXER: bitwise inversion: " + yytext());}


">>" {System.out.println("LEXER: bitwise right shift: " + yytext());}
"<<" {System.out.println("LEXER: bitwise left shift: " + yytext());}

"[" {System.out.println("LEXER: left square bracket: " + yytext());}
"]" {System.out.println("LEXER: right square bracket: " + yytext());}
"(" {System.out.println("LEXER: left parenthesis: " + yytext());}
")" {System.out.println("LEXER: right parenthesis: " + yytext());}
"{" {System.out.println("LEXER: left curly bracket: " + yytext());}
"}" {System.out.println("LEXER: right curly bracket: " + yytext());}

"," {System.out.println("LEXER: comma: " + yytext());}
"." {System.out.println("LEXER: dot: " + yytext());}
":" {System.out.println("LEXER: colon: " + yytext());}
";" {System.out.println("LEXER: semicolon: " + yytext());}

"is" {System.out.println("LEXER: identity: " + yytext());}
"is not" {System.out.println("LEXER: identity: " + yytext());}

"in" {System.out.println("LEXER: membership: " + yytext());}
"not in" {System.out.println("LEXER: membership: " + yytext());}

"=" {System.out.println("LEXER: assisgnment token: " + yytext());}
"+" {System.out.println("LEXER: binary addition token: " + yytext());}
"+=" {System.out.println("LEXER: short addition token: " + yytext());}
"-" {System.out.println("LEXER: binary substraction token: " + yytext());}
"-=" {System.out.println("LEXER: short substraction token: " + yytext());}
"*" {System.out.println("LEXER: binary multiplication token: " + yytext());}
"*=" {System.out.println("LEXER: short multiplication token: " + yytext());}
"/" {System.out.println("LEXER: binary float division token: " + yytext());}
"/=" {System.out.println("LEXER: short floatdivision token: " + yytext());}
"//" {System.out.println("LEXER: binary int division token: " + yytext());}
"//=" {System.out.println("LEXER: short intdivision token: " + yytext());}
"%" {System.out.println("LEXER: binary modulo token: " + yytext());}
"%=" {System.out.println("LEXER: short modulo token: " + yytext());}
"**" {System.out.println("LEXER: binary power token: " + yytext());}
"**=" {System.out.println("LEXER: short power token: " + yytext());}
"," {System.out.println("LEXER: comma token: " + yytext());}
"==" {System.out.println("LEXER: equality token: " + yytext());}
"!=" {System.out.println("LEXER: inequality token: " + yytext());}
">" {System.out.println("LEXER: greater than token: " + yytext());}
"<" {System.out.println("LEXER: less than token: " + yytext());}
">=" {System.out.println("LEXER: greater or equal token: " + yytext());}
"<=" {System.out.println("LEXER: less or equal token: " + yytext());}

{comment} {}

{newline} {System.out.println("LEXER: newline token:");}


{whitespace}|" "|\t {;}

. {System.out.println("LEXER: error: " + yytext());}


