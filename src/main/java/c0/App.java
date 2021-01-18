package c0;

import c0.analyser.C0Lexer;
import c0.analyser.C0Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) {
        ANTLRInputStream antlrInputStream = new ANTLRInputStream("");
        C0Lexer lexer = new C0Lexer(antlrInputStream);
        CommonTokenStream commonStream = new CommonTokenStream(lexer);
        C0Parser parseTree = new C0Parser(commonStream);
    }
}
