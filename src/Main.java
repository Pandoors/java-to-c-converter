import org.antlr.v4.runtime.*;
import visitor.JavaGrLexer;
import visitor.JavaGrParser;
import visitor.own.JavaVisitor;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        CharStream in = CharStreams.fromFileName("./src/tests/test1.txt");
        JavaGrLexer lexer = new JavaGrLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaGrParser parser = new JavaGrParser(tokens);

        String str = new JavaVisitor().visit(parser.prog());
        System.out.println(str);

    }



}
