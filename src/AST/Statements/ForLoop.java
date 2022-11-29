package statements;

import java.util.List;

import expressions.Expression;
import main.Type;

public class ForLoop extends Statement {
    public Expression iterator;
    public Type iterable; 
    public Expression range; //range(start, end, inc value)
    public List<Statement> body;

    public ForLoop(Expression it, Type field, Expression range, List<Statement> bod, int line, int column, String fileLocation) {
        super(line, column, fileLocation);
        this.iterator = it;
        this.iterable = field;
        this.range = range;
        this.body = bod;
    }
}
