// Generated from D:/Projects/Java/MarkdownParser/src\markdown.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link markdownParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface markdownVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link markdownParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(markdownParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(markdownParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(markdownParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#main_heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_heading(markdownParser.Main_headingContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#sub_heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_heading(markdownParser.Sub_headingContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#italic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalic(markdownParser.ItalicContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBold(markdownParser.BoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link markdownParser#bolditalic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBolditalic(markdownParser.BolditalicContext ctx);
}