package expressions;

public class IfExpression extends Expression{
    public BooleanExpression test;
    public Expression body;
    public Expression orelse;

    public IfExpression(BooleanExpression test, Expression body, Expression orelse, int line, int column, String fileLocation){
        super(line, column, fileLocation);
        this.test = test;
        this.body = body;
        this.orelse = orelse;
    }
}
