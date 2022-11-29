package statements;
import java.beans.Expression;
import java.util.List;

public class IfStatement extends Statement {
    public Expression condition;
    public List<Statement> body;
    public List<Statement> elsebody;

    public IfStatement(Expression cond, List<Statement> body, List<Statement> elsebody, int line, int column, String fileLocation) {
        super(line, column, fileLocation);
        this.condition = cond;
        this.body = body;
        this.elsebody = elsebody;
    }
}
