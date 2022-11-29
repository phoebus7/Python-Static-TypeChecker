package src.ast.expressions;

public class StringLiteral extends Expression{
    public String value;

    public StringLiteral(String value, int line, int column, String fileLocation){
        super(line, column, fileLocation);
        this.value = value;
    }
}
