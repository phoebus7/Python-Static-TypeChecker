%%

%class Lexer
%standalone
%unicode
%line
%column

int = [+-]?[0-9]+ | [0][Bb][01]+ | [0][Xx][a-fA-F0-9]+ | [0][Oo][0-7]+
float = [+-]?[0-9]*\.?[0-9]+([Ee][+-]?[0-9]+)?
str = \'.*\' | \".*\"  
bool = "True" | "False"
id = [a-zA-Z_][a-zA-Z_0-9]*
//whitespace = \r|\n|\r\n | [\t\f]
newline = \r\n|\n\r

%%

{int} {System.out.println("LEXER: int token: " + yytext()); }
{float} {System.out.println("LEXER: float token: " + yytext());}
{bool} {System.out.println("LEXER: bool token: " + yytext());}
{str} {System.out.println("LEXER: str token: " + yytext()); }
{id} {System.out.println("LEXER: id token: " + yytext()); }

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

{newline}|" "|\t {;}

. {System.out.println("LEXER: error: " + yytext());}


