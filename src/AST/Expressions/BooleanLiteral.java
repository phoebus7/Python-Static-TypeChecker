package src.ast.expressions;

public class BooleanLiteral extends Expression{
    public boolean value;

    public BooleanLiteral(boolean value, int line, int column, String fileLocation){
        super(line, column, fileLocation);
        this.value = value;
    }
}
