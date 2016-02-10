/**
 * Created by Aswin P J on 10-Feb-16.
 */

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class markdownEvaluator extends markdownBaseVisitor {


    @Override
    public Object visitItalic(markdownParser.ItalicContext ctx) {
        System.out.println("<i>"+ctx.getText()+"</i>");
        return ctx.getText();
    }

    @Override
    public Object visitBold(markdownParser.BoldContext ctx) {
        System.out.println("<strong>"+ctx.getText()+"</strong>");
        return ctx.getText();
    }

    @Override
    public Object visitBolditalic(markdownParser.BolditalicContext ctx) {
        System.out.println("<strong><i>"+ctx.getText()+"</i></strong>");
        return ctx.getText();
    }
}
