package src.ast.expressions;

public class FloatLiteral extends Expression{
    public float value;

    public FloatLiteral(float value, int line, int column, String fileLocation){
        super(line, column, fileLocation);
        this.value = value;
    }
}
