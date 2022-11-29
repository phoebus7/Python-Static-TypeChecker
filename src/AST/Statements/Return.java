package statements;

import expressions.Expression;
import main.Type;

public class Return extends Statement{
    public Type returntype; 
    public Expression returnValue;
    public Return(Type type, Expression value, int line, int column, String fileLocation) {
        super(line, column, fileLocation);
        this.returntype = type;
        this.returnValue = value;
    }

}
