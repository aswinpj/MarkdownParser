/**
 * Created by Aswin P J on 10-Feb-16.
 */

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class markdownEvaluator extends markdownBaseVisitor {


    @Override
    public Object visitItalic(markdownParser.ItalicContext ctx) {
        int i=1;
        System.out.print("<i>");
        while(ctx.getChild(i)!=null)
        {
            visit(ctx.getChild(i));
            i++;
        }
        System.out.print("</i>");
        return null;
    }

    @Override
    public Object visitBold(markdownParser.BoldContext ctx) {
        int i=1;
        System.out.print("<strong>");
        while(ctx.getChild(i)!=null)
        {
            visit(ctx.getChild(i));
            i++;
        }
        System.out.print("</strong>");
        return null;
    }

    @Override
    public Object visitBolditalic(markdownParser.BolditalicContext ctx) {
        int i=1;
        System.out.print("<strong><i>");
        while(ctx.getChild(i)!=null)
        {
            visit(ctx.getChild(i));
            i++;
        }
        System.out.print("</i></strong>");
        return null;
    }

    @Override
    public Object visitText(markdownParser.TextContext ctx) {
        System.out.print(ctx.getText());
        return null;
    }
}
