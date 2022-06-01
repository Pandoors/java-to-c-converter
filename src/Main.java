import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.JavaGrLexer;
import visitor.JavaGrParser;
import visitor.own.JavaVisitor;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        CharStream in = CharStreams.fromFileName("./src/tests/test1.txt");
        JavaGrLexer lexer = new JavaGrLexer(in);  //create a lexer object
        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
        JavaGrParser parser = new JavaGrParser(tokens);

        String str = new JavaVisitor().visit(parser.prog());
        System.out.println(parser.prog());
        System.out.println(str);

    }

}
