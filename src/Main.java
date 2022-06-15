import org.antlr.v4.runtime.*;
import visitor.JavaGrLexer;
import visitor.JavaGrParser;
import visitor.own.JavaVisitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//./src/tests/test1.txt
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter code file location: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String inputFile = reader.readLine();

        CharStream in = CharStreams.fromFileName(inputFile);
        JavaGrLexer lexer = new JavaGrLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaGrParser parser = new JavaGrParser(tokens);

        String str = new JavaVisitor().visit(parser.prog());
        System.out.println(str);

        try (PrintWriter out = new PrintWriter("output.c")) {
            out.println(str);
        }
        try (PrintWriter out = new PrintWriter("output.txt")) {
            out.println(str);
        }
    }



}
