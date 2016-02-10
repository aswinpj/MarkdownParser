/**
 * Created by Aswin P J on 10-Feb-16.
 */

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) {

        ANTLRInputStream inputStream = new ANTLRInputStream("This is **an bold** *example italic* sentence");
        markdownLexer lexer = new markdownLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        markdownParser parser = new markdownParser(tokenStream);
        ParseTree tree = parser.prog();
        markdownEvaluator evaluator = new markdownEvaluator();
        evaluator.visit(tree);

    }
}
