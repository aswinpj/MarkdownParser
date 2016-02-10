// Generated from D:/Projects/Java/MarkdownParser/src\markdown.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link markdownParser}.
 */
public interface markdownListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link markdownParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(markdownParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(markdownParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(markdownParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(markdownParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(markdownParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(markdownParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#main_heading}.
	 * @param ctx the parse tree
	 */
	void enterMain_heading(markdownParser.Main_headingContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#main_heading}.
	 * @param ctx the parse tree
	 */
	void exitMain_heading(markdownParser.Main_headingContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#sub_heading}.
	 * @param ctx the parse tree
	 */
	void enterSub_heading(markdownParser.Sub_headingContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#sub_heading}.
	 * @param ctx the parse tree
	 */
	void exitSub_heading(markdownParser.Sub_headingContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#italic}.
	 * @param ctx the parse tree
	 */
	void enterItalic(markdownParser.ItalicContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#italic}.
	 * @param ctx the parse tree
	 */
	void exitItalic(markdownParser.ItalicContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBold(markdownParser.BoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBold(markdownParser.BoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link markdownParser#bolditalic}.
	 * @param ctx the parse tree
	 */
	void enterBolditalic(markdownParser.BolditalicContext ctx);
	/**
	 * Exit a parse tree produced by {@link markdownParser#bolditalic}.
	 * @param ctx the parse tree
	 */
	void exitBolditalic(markdownParser.BolditalicContext ctx);
}