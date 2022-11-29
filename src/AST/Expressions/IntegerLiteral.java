package src.ast.expressions;

public class IntegerLiteral extends Expression{
    public int value;

    public IntegerLiteral(int value, int line, int column, String fileLocation){
        super(line, column, fileLocation);
        this.value = value;
    }
}
