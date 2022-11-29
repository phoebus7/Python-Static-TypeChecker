package statements;

import java.util.List;

import expressions.Expression;

public class Lambda extends Statement {
    public List<String> args; 
    public Expression expression;

    public Lambda(List<String> arguments, Expression expr, int line, int column, String fileLocation) {
        super(line, column, fileLocation);
        this.args = arguments;
        this.expression = expr;
    }
}
