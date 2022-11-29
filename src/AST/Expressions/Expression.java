package src.ast.expressions;

import src.ast.main.ASTElement;

public class Expression extends ASTElement{ //extends ASTElement{
    public String type;  //need?

    public Expression(int line, int column, String fileLocation){
        super(line, column, fileLocation);
        //constructor
    }
}
