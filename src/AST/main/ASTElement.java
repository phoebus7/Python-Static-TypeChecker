package src.ast.main;
public class ASTElement {
    public int line;
    public int column;
    public String fileLocation;

    public ASTElement(int line, int column, String fileLocation){
        this.line = line;
        this.column = column;
        this.fileLocation = fileLocation;
    }
}
