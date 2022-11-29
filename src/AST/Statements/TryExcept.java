package statements;

import java.util.List;

public class TryExcept extends Statement{
    public List<Statement> tryBody;
    public List<Statement> exceptBody;
    
    public TryExcept(List<Statement> tryBody, List<Statement> exceptBody, int line, int column, String fileLocation) {
        super(line, column, fileLocation);
        this.tryBody = tryBody;
        this.exceptBody = exceptBody;
    }
}
