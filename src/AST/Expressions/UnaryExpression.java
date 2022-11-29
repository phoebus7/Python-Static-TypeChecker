package expressions;

public class UnaryExpression extends Expression {
    public Expression operand;
    public String op;

    public UnaryExpression(Expression operand, String operator, int line, int column, String fileLocation){
        super(line, column, fileLocation);
        this.operand = operand;
        this.op = operator;
    }
}
