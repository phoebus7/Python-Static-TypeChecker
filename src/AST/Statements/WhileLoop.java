package statements;

import java.util.List;

import expressions.Expression;

public class WhileLoop extends Statement {
    public Expression condition;
    public List<Statement> body;
    public WhileLoop(Expression cond, List<Statement> bod, int line, int column, String fileLocation) {
        super(line, column, fileLocation);
        this.condition = cond;
        this.body = bod;
    }
}