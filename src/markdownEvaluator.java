/**
 * Created by Aswin P J on 10-Feb-16.
 */

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Objects;

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
    public Object visitSub_heading(markdownParser.Sub_headingContext ctx) {
        int i=0;
        System.out.print("<h2>");
        while(ctx.getChild(i)!=null)
        {
            visit(ctx.getChild(i));
            i++;
        }
        System.out.print("</h2>");
        System.out.println();
        return null;
    }

    @Override
    public Object visitCustom(markdownParser.CustomContext ctx) {
        int headernumber = 0;
        int i=0;
        while(Objects.equals(ctx.getChild(i).getText(), "#"))
        {
            headernumber++;
            i++;
        }
        System.out.print("<h"+String.valueOf(headernumber)+">");
        while (ctx.getChild(i)!=null)
        {
            visit(ctx.getChild(i));
            i++;
        }
        System.out.print("</h"+String.valueOf(headernumber)+">");
        return null;
    }

    @Override
    public Object visitMain_heading(markdownParser.Main_headingContext ctx) {
        int i=0;
        System.out.print("<h1>");
        while(ctx.getChild(i)!=null)
        {
            visit(ctx.getChild(i));
            i++;
        }
        System.out.print("</h1>");
        System.out.println();
        return null;
    }

    @Override
    public Object visitText(markdownParser.TextContext ctx) {
        System.out.print(ctx.getText());
        return null;
    }
}
