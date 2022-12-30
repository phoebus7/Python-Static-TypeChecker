import java_cup.runtime.*;
import java.lang.*;

%%
%class Lexer 
%standalone
%unicode
%cup
%line
%column


whitespace = \r\n|\n\r
newline = "\n"
comment = \#[^\n\r]*
int = [+-]?[0-9]+ | [0][Bb][01]+ | [0][Xx][a-fA-F0-9]+ | [0][Oo][0-7]+
float = [+-]?[0-9]*\.?[0-9]+([Ee][+-]?[0-9]+)?
bool = "True" | "False"
str = \'.*\' | \".*\" 
id = [a-zA-Z_][a-zA-Z_0-9]*


%%

"await" {System.out.println("LEXER: await: " + yytext());
         return new Symbol(sym.AWAIT, yyline, yycolumn, new String(yytext()));}

"or" {System.out.println("LEXER: disjunction: " + yytext());
      return new Symbol(sym.DISJUNCTION, yyline, yycolumn, new String(yytext()));}
"and" {System.out.println("LEXER: conjunction: " + yytext());
       return new Symbol(sym.CONJUNCTION, yyline, yycolumn, new String(yytext()));}
"not" {System.out.println("LEXER: negation: " + yytext());
       return new Symbol(sym.NEGATION, yyline, yycolumn, new String(yytext()));}


{int} {System.out.println("LEXER: int token: " + yytext()); return new Symbol(sym.INT, yyline, yycolumn, new Integer(yytext()));}
{float} {System.out.println("LEXER: float token: " + yytext()); return new Symbol(sym.FLOAT, yyline, yycolumn, new Float(yytext()));}
{bool} {System.out.println("LEXER: bool token: " + yytext()); return new Symbol(sym.BOOL, yyline, yycolumn, new String(yytext()));}
{str} {System.out.println("LEXER: str token: " + yytext()); return new Symbol(sym.STR, yyline, yycolumn, new String(yytext()));}
{id} {System.out.println("LEXER: id token: " + yytext()); return new Symbol(sym.ID, yyline, yycolumn, new String(yytext()));}



"&" {System.out.println("LEXER: bitwise and: " + yytext());
     return new Symbol(sym.BIT_AND, yyline, yycolumn, new String(yytext()));}
"|" {System.out.println("LEXER: bitwise or: " + yytext());
     return new Symbol(sym.BIT_OR, yyline, yycolumn, new String(yytext()));}
"^" {System.out.println("LEXER: bitwise xor: " + yytext());
     return new Symbol(sym.BIT_XOR, yyline, yycolumn, new String(yytext()));}
"~" {System.out.println("LEXER: bitwise inversion: " + yytext());
     return new Symbol(sym.BIT_INVERSION, yyline, yycolumn, new String(yytext()));}


">>" {System.out.println("LEXER: bitwise right shift: " + yytext());
      return new Symbol(sym.RIGHT_SHIFT, yyline, yycolumn, new String(yytext()));}
"<<" {System.out.println("LEXER: bitwise left shift: " + yytext());
      return new Symbol(sym.LEFT_SHIFT, yyline, yycolumn, new String(yytext()));}

"[" {System.out.println("LEXER: left square bracket: " + yytext());
     return new Symbol(sym.LSQB, yyline, yycolumn, new String(yytext()));}
"]" {System.out.println("LEXER: right square bracket: " + yytext());
     return new Symbol(sym.RSQB, yyline, yycolumn, new String(yytext()));}
"(" {System.out.println("LEXER: left parenthesis: " + yytext());
     return new Symbol(sym.LPAR, yyline, yycolumn, new String(yytext()));}
")" {System.out.println("LEXER: right parenthesis: " + yytext());
     return new Symbol(sym.RPAR, yyline, yycolumn, new String(yytext()));}
"{" {System.out.println("LEXER: left curly bracket: " + yytext());
     return new Symbol(sym.LBRACE, yyline, yycolumn, new String(yytext()));}
"}" {System.out.println("LEXER: right curly bracket: " + yytext());
     return new Symbol(sym.RBRACE, yyline, yycolumn, new String(yytext()));}

"," {System.out.println("LEXER: comma: " + yytext());
     return new Symbol(sym.COMMA, yyline, yycolumn, new String(yytext()));}
"." {System.out.println("LEXER: dot: " + yytext());
     return new Symbol(sym.DOT, yyline, yycolumn, new String(yytext()));}
":" {System.out.println("LEXER: colon: " + yytext());
     return new Symbol(sym.COLON, yyline, yycolumn, new String(yytext()));}
";" {System.out.println("LEXER: semicolon: " + yytext());
     return new Symbol(sym.SEMICOLON, yyline, yycolumn, new String(yytext()));}

"is" {System.out.println("LEXER: identity: " + yytext());
      return new Symbol(sym.IS, yyline, yycolumn, new String(yytext()));}
"is not" {System.out.println("LEXER: identity: " + yytext());
          return new Symbol(sym.ISNOT, yyline, yycolumn, new String(yytext()));}

"in" {System.out.println("LEXER: membership: " + yytext());
      return new Symbol(sym.IN, yyline, yycolumn, new String(yytext()));}
"not in" {System.out.println("LEXER: membership: " + yytext());
          return new Symbol(sym.NOTIN, yyline, yycolumn, new String(yytext()));}



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


"==" {System.out.println("LEXER: equality token: " + yytext()); return new Symbol(sym.EQ, yyline, yycolumn,
																				  new String(yytext()));}
"!=" {System.out.println("LEXER: inequality token: " + yytext()); return new Symbol(sym.NE, yyline, yycolumn,
																				  new String(yytext()));}
">" {System.out.println("LEXER: greater than token: " + yytext()); return new Symbol(sym.GT, yyline, yycolumn,
																				  new String(yytext()));}
"<" {System.out.println("LEXER: less than token: " + yytext()); return new Symbol(sym.LT, yyline, yycolumn,
																				  new String(yytext()));}
">=" {System.out.println("LEXER: greater or equal token: " + yytext()); return new Symbol(sym.GE, yyline, yycolumn,
																				  new String(yytext()));}
"<=" {System.out.println("LEXER: less or equal token: " + yytext()); return new Symbol(sym.LE, yyline, yycolumn,
																				  new String(yytext()));}


{comment} {}

{newline}  {System.out.println("LEXER: newline token:");} 
           //return new Symbol(sym.NL);}


{whitespace}|" "|\t {;}

. {System.out.println("LEXER: error: " + yytext());}
