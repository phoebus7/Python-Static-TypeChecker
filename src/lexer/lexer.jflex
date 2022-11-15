import java_cup.runtime.*;

%%
%class Lexer
%standalone
%unicode
%cup
%line
%column

newline = \r\n|\n\r
int = [+-]?[0-9]+ | [0][Bb][01]+ | [0][Xx][a-fA-F0-9]+ | [0][Oo][0-7]+
float = [+-]?[0-9]*\.?[0-9]+([Ee][+-]?[0-9]+)?
str = \'.*\' | \".*\" 
id = [a-zA-Z_][a-zA-Z_0-9]*


%%

{int} {System.out.println("LEXER: int token: " + yytext()); return new Symbol(sym.INT, yyline, yycolumn, new String(yytext()));}
{float} {System.out.println("LEXER: float token: " + yytext()); return new Symbol(sym.FLOAT, yyline, yycolumn, new String(yytext()));}
{str} {System.out.println("LEXER: str token: " + yytext()); return new Symbol(sym.STR, yyline, yycolumn, new String(yytext()));}
{id} {System.out.println("LEXER: id token: " + yytext()); return new Symbol(sym.ID, yyline, yycolumn, new String(yytext()));}

"=" {System.out.println("LEXER: assisgnment token: " + yytext()); return new Symbol(sym.ASSIGNMENT, yyline, yycolumn, new String(yytext()));}

"+" {System.out.println("LEXER: binary addition token: " + yytext()); return new Symbol(sym.ADDITION, yyline, yycolumn, 
																						new String(yytext()));}
"+=" {System.out.println("LEXER: short addition token: " + yytext()); return new Symbol(sym.SHORTADDITION, yyline, yycolumn,
																					new String(yytext()));}
"-" {System.out.println("LEXER: binary substraction token: " + yytext()); return new Symbol(sym.SUBSTRACTION, yyline, yycolumn,
																							new String(yytext()));}
"-=" {System.out.println("LEXER: short substraction token: " + yytext()); return new Symbol(sym.SHORTSUBSTRACTION, yyline, yycolumn,
																							new String(yytext()));}
"*" {System.out.println("LEXER: binary multiplication token: " + yytext()); return new Symbol(sym.MULTIPLICATION, yyline, yycolumn,
																							  new String(yytext()));}
"*=" {System.out.println("LEXER: short multiplication token: " + yytext()); return new Symbol(sym.SHORTMULTIPLICATION, yyline, yycolumn,
																							new String(yytext()));}
"/" {System.out.println("LEXER: binary float division token: " + yytext()); return new Symbol(sym.FLOATDIVISION, yyline, yycolumn,
																							  new String(yytext()));}
"/=" {System.out.println("LEXER: short floatdivision token: " + yytext()); return new Symbol(sym.SHORTFLOATDIVISION, yyline, yycolumn,
																							new String(yytext()));}
"//" {System.out.println("LEXER: binary int division token: " + yytext()); return new Symbol(sym.INTDIVISION, yyline, yycolumn, 
																							 new String(yytext()));}
"//=" {System.out.println("LEXER: short intdivision token: " + yytext()); return new Symbol(sym.SHORTINTDIVISION, yyline, yycolumn,
																							new String(yytext()));}
"%" {System.out.println("LEXER: binary modulo token: " + yytext()); return new Symbol(sym.MODULO, yyline, yycolumn,
																					  new String(yytext()));}
"%=" {System.out.println("LEXER: short modulo token: " + yytext()); return new Symbol(sym.SHORTMODULO, yyline, yycolumn,
																					  new String(yytext()));}
"**" {System.out.println("LEXER: binary power token: " + yytext()); return new Symbol(sym.DEGREE, yyline, yycolumn,
																					  new String(yytext()));}
"**=" {System.out.println("LEXER: short power token: " + yytext()); return new Symbol(sym.SHORTDEGREE, yyline, yycolumn,
																					  new String(yytext()));}
"," {System.out.println("LEXER: comma token: " + yytext()); return new Symbol(sym.COMMA, yyline, yycolumn, 
																			new String(yytext()));}


{newline}|" "|\t {;}

. {System.out.println("LEXER: error: " + yytext());}
