
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java.lang.*;
import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\045\000\002\002\004\000\002\004\005\000\002\004" +
    "\004\000\002\004\003\000\002\005\004\000\002\005\003" +
    "\000\002\007\004\000\002\007\003\000\002\002\005\000" +
    "\002\002\005\000\002\003\003\000\002\003\003\000\002" +
    "\003\003\000\002\003\003\000\002\003\003\000\002\003" +
    "\003\000\002\003\003\000\002\010\005\000\002\010\005" +
    "\000\002\010\003\000\002\011\005\000\002\011\005\000" +
    "\002\011\005\000\002\011\005\000\002\011\003\000\002" +
    "\012\004\000\002\012\004\000\002\012\003\000\002\013" +
    "\005\000\002\013\003\000\002\014\003\000\002\015\003" +
    "\000\002\016\003\000\002\016\003\000\002\016\003\000" +
    "\002\016\003\000\002\016\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\063\000\004\041\004\001\002\000\022\040\020\051" +
    "\023\052\017\053\024\054\022\055\026\056\021\057\025" +
    "\001\002\000\006\002\ufffe\041\004\001\002\000\004\002" +
    "\010\001\002\000\006\002\ufffa\041\ufffa\001\002\000\004" +
    "\002\001\001\002\000\006\002\ufffc\041\ufffc\001\002\000" +
    "\006\002\uffff\041\004\001\002\000\006\002\ufffb\041\ufffb" +
    "\001\002\000\006\002\000\041\004\001\002\000\006\002" +
    "\ufffd\041\ufffd\001\002\000\020\034\027\035\044\036\033" +
    "\037\031\041\036\042\037\043\040\001\002\000\020\034" +
    "\ufff6\035\ufff6\036\ufff6\037\ufff6\041\ufff6\042\ufff6\043\ufff6" +
    "\001\002\000\020\034\027\035\044\036\033\037\031\041" +
    "\036\042\037\043\040\001\002\000\020\034\ufff2\035\ufff2" +
    "\036\ufff2\037\ufff2\041\ufff2\042\ufff2\043\ufff2\001\002\000" +
    "\020\034\ufff4\035\ufff4\036\ufff4\037\ufff4\041\ufff4\042\ufff4" +
    "\043\ufff4\001\002\000\020\034\ufff7\035\ufff7\036\ufff7\037" +
    "\ufff7\041\ufff7\042\ufff7\043\ufff7\001\002\000\020\034\ufff5" +
    "\035\ufff5\036\ufff5\037\ufff5\041\ufff5\042\ufff5\043\ufff5\001" +
    "\002\000\020\034\ufff1\035\ufff1\036\ufff1\037\ufff1\041\ufff1" +
    "\042\ufff1\043\ufff1\001\002\000\020\034\ufff3\035\ufff3\036" +
    "\ufff3\037\ufff3\041\ufff3\042\ufff3\043\ufff3\001\002\000\024" +
    "\002\uffe0\041\uffe0\042\uffe0\043\uffe0\044\uffe0\045\uffe0\046" +
    "\uffe0\047\uffe0\050\uffe0\001\002\000\012\002\ufff9\041\ufff9" +
    "\042\062\043\061\001\002\000\024\002\uffde\041\uffde\042" +
    "\uffde\043\uffde\044\uffde\045\uffde\046\uffde\047\uffde\050\uffde" +
    "\001\002\000\022\002\uffee\041\uffee\042\uffee\043\uffee\044" +
    "\053\045\052\046\051\047\054\001\002\000\024\002\uffdd" +
    "\041\uffdd\042\uffdd\043\uffdd\044\uffdd\045\uffdd\046\uffdd\047" +
    "\uffdd\050\uffdd\001\002\000\022\002\uffe9\041\uffe9\042\uffe9" +
    "\043\uffe9\044\uffe9\045\uffe9\046\uffe9\047\uffe9\001\002\000" +
    "\024\002\uffe2\041\uffe2\042\uffe2\043\uffe2\044\uffe2\045\uffe2" +
    "\046\uffe2\047\uffe2\050\uffe2\001\002\000\024\002\uffe1\041" +
    "\uffe1\042\uffe1\043\uffe1\044\uffe1\045\uffe1\046\uffe1\047\uffe1" +
    "\050\uffe1\001\002\000\020\034\027\035\044\036\033\037" +
    "\031\041\036\042\037\043\040\001\002\000\020\034\027" +
    "\035\044\036\033\037\031\041\036\042\037\043\040\001" +
    "\002\000\022\002\uffe6\041\uffe6\042\uffe6\043\uffe6\044\uffe6" +
    "\045\uffe6\046\uffe6\047\uffe6\001\002\000\024\002\uffe4\041" +
    "\uffe4\042\uffe4\043\uffe4\044\uffe4\045\uffe4\046\uffe4\047\uffe4" +
    "\050\045\001\002\000\024\002\uffe3\041\uffe3\042\uffe3\043" +
    "\uffe3\044\uffe3\045\uffe3\046\uffe3\047\uffe3\050\uffe3\001\002" +
    "\000\024\002\uffdf\041\uffdf\042\uffdf\043\uffdf\044\uffdf\045" +
    "\uffdf\046\uffdf\047\uffdf\050\uffdf\001\002\000\020\034\027" +
    "\035\044\036\033\037\031\041\036\042\037\043\040\001" +
    "\002\000\022\002\uffe5\041\uffe5\042\uffe5\043\uffe5\044\uffe5" +
    "\045\uffe5\046\uffe5\047\uffe5\001\002\000\022\002\uffe7\041" +
    "\uffe7\042\uffe7\043\uffe7\044\uffe7\045\uffe7\046\uffe7\047\uffe7" +
    "\001\002\000\022\002\uffe8\041\uffe8\042\uffe8\043\uffe8\044" +
    "\uffe8\045\uffe8\046\uffe8\047\uffe8\001\002\000\020\034\027" +
    "\035\044\036\033\037\031\041\036\042\037\043\040\001" +
    "\002\000\020\034\027\035\044\036\033\037\031\041\036" +
    "\042\037\043\040\001\002\000\020\034\027\035\044\036" +
    "\033\037\031\041\036\042\037\043\040\001\002\000\020" +
    "\034\027\035\044\036\033\037\031\041\036\042\037\043" +
    "\040\001\002\000\022\002\uffea\041\uffea\042\uffea\043\uffea" +
    "\044\uffea\045\uffea\046\uffea\047\uffea\001\002\000\022\002" +
    "\uffed\041\uffed\042\uffed\043\uffed\044\uffed\045\uffed\046\uffed" +
    "\047\uffed\001\002\000\022\002\uffec\041\uffec\042\uffec\043" +
    "\uffec\044\uffec\045\uffec\046\uffec\047\uffec\001\002\000\022" +
    "\002\uffeb\041\uffeb\042\uffeb\043\uffeb\044\uffeb\045\uffeb\046" +
    "\uffeb\047\uffeb\001\002\000\020\034\027\035\044\036\033" +
    "\037\031\041\036\042\037\043\040\001\002\000\020\034" +
    "\027\035\044\036\033\037\031\041\036\042\037\043\040" +
    "\001\002\000\022\002\ufff0\041\ufff0\042\ufff0\043\ufff0\044" +
    "\053\045\052\046\051\047\054\001\002\000\022\002\uffef" +
    "\041\uffef\042\uffef\043\uffef\044\053\045\052\046\051\047" +
    "\054\001\002\000\012\002\ufff8\041\ufff8\042\062\043\061" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\063\000\010\002\006\004\005\007\004\001\001\000" +
    "\004\003\015\001\001\000\010\002\012\005\011\006\010" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\002\006\006\014\007\013" +
    "\001\001\000\002\001\001\000\004\002\012\001\001\000" +
    "\002\001\001\000\020\010\064\011\031\012\033\013\040" +
    "\014\041\015\042\016\034\001\001\000\002\001\001\000" +
    "\020\010\027\011\031\012\033\013\040\014\041\015\042" +
    "\016\034\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\012\047\013" +
    "\040\014\041\015\042\016\034\001\001\000\014\012\046" +
    "\013\040\014\041\015\042\016\034\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\012\045\013\040\014\041\015\042\016\034\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\012\057\013\040\014\041\015\042\016\034\001" +
    "\001\000\014\012\056\013\040\014\041\015\042\016\034" +
    "\001\001\000\014\012\055\013\040\014\041\015\042\016" +
    "\034\001\001\000\014\012\054\013\040\014\041\015\042" +
    "\016\034\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\016\011\063\012\033" +
    "\013\040\014\041\015\042\016\034\001\001\000\016\011" +
    "\062\012\033\013\040\014\041\015\042\016\034\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROGRAM EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROGRAM ::= STMT ENDLINE STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROGRAM",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // PROGRAM ::= STMT ENDLINE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROGRAM",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // PROGRAM ::= STMT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROGRAM",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ENDLINE ::= ENDLINE EOL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ENDLINE",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ENDLINE ::= EOL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ENDLINE",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // STMT ::= STMT ASSIGN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // STMT ::= ASSIGN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("STMT",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // ASSIGN ::= ID ASSIGNMENT SUM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASSIGN",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // ASSIGN ::= ID AUGASSIGN SUM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASSIGN",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // AUGASSIGN ::= SHORTADDITION 
            {
              Object RESULT =null;
		 System.out.println("PARSER: augmented addition identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("AUGASSIGN",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // AUGASSIGN ::= SHORTSUBSTRACTION 
            {
              Object RESULT =null;
		 System.out.println("PARSER: augmented substraction identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("AUGASSIGN",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // AUGASSIGN ::= SHORTMULTIPLICATION 
            {
              Object RESULT =null;
		 System.out.println("PARSER: augmented multiplication identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("AUGASSIGN",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // AUGASSIGN ::= SHORTFLOATDIVISION 
            {
              Object RESULT =null;
		 System.out.println("PARSER: augmented floatdivision identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("AUGASSIGN",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // AUGASSIGN ::= SHORTINTDIVISION 
            {
              Object RESULT =null;
		 System.out.println("PARSER: augmented intdivision identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("AUGASSIGN",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // AUGASSIGN ::= SHORTMODULO 
            {
              Object RESULT =null;
		 System.out.println("PARSER: augmented modulo identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("AUGASSIGN",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // AUGASSIGN ::= SHORTDEGREE 
            {
              Object RESULT =null;
		 System.out.println("PARSER: augmented power identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("AUGASSIGN",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SUM ::= SUM ADDITION TERM 
            {
              Object RESULT =null;
		 System.out.println("PARSER: sum + term identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SUM",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // SUM ::= SUM SUBSTRACTION TERM 
            {
              Object RESULT =null;
		 System.out.println("PARSER: sum - term identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SUM",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // SUM ::= TERM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SUM",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // TERM ::= TERM MULTIPLICATION FACTOR 
            {
              Object RESULT =null;
		 System.out.println("PARSER: term * factor identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERM",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // TERM ::= TERM FLOATDIVISION FACTOR 
            {
              Object RESULT =null;
		 System.out.println("PARSER: term / factor identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERM",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // TERM ::= TERM INTDIVISION FACTOR 
            {
              Object RESULT =null;
		 System.out.println("PARSER: term // factor identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERM",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // TERM ::= TERM MODULO FACTOR 
            {
              Object RESULT =null;
		 System.out.println("PARSER: term % factor identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERM",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // TERM ::= FACTOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TERM",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // FACTOR ::= ADDITION FACTOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // FACTOR ::= SUBSTRACTION FACTOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // FACTOR ::= POWER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // POWER ::= AWAIT_PRIMARY DEGREE FACTOR 
            {
              Object RESULT =null;
		 System.out.println("PARSER: power identified"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("POWER",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // POWER ::= AWAIT_PRIMARY 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("POWER",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // AWAIT_PRIMARY ::= PRIMARY 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("AWAIT_PRIMARY",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // PRIMARY ::= ATOM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PRIMARY",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // ATOM ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ATOM",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // ATOM ::= INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ATOM",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // ATOM ::= FLOAT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ATOM",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // ATOM ::= BOOL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ATOM",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // ATOM ::= STR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ATOM",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
