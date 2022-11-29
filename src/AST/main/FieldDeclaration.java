package main;
public class FieldDeclaration {
    public Type fieldType;
    public String fieldName;

    public FieldDeclaration(Type field, String name) {
        this.fieldType = field;
        this.fieldName = name;
    }
}