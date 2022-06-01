package visitor.own;

import visitor.JavaGrBaseVisitor;
import visitor.JavaGrParser;

public class JavaVisitor extends JavaGrBaseVisitor<String> {


    @Override
    public String visitProg(JavaGrParser.ProgContext ctx) {
        return "";
    }

}