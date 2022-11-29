package expressions;

import java.util.List;

public class BooleanExpression extends Expression {
    public String op;
    public List<Expression> values;

    public BooleanExpression(String op, List<Expression> values, int line, int column, String fileLocation){
        super(line, column, fileLocation);
        this.op = op;
        this.values = values;
    }
}
