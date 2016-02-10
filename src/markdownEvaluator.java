/**
 * Created by Aswin P J on 10-Feb-16.
 */

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class markdownEvaluator extends markdownBaseVisitor {

    @Override
    public Object visitProg(markdownParser.ProgContext ctx) {
        System.out.println("I have entered the program");
        return null;
    }

    @Override
    public Object visitItalic(markdownParser.ItalicContext ctx) {
        System.out.println("Visited Italic");
        return null;
    }

    @Override
    public Object visitBold(markdownParser.BoldContext ctx) {
        System.out.println("Visited Bold");
        return null;
    }

    @Override
    public Object visitBolditalic(markdownParser.BolditalicContext ctx) {
        System.out.println("Visited Bold Italic");
        return null;
    }
}
