// Generated from D:/Projects/Java/MarkdownParser/src\markdown.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class markdownParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TEXT=8, SPACE=9, 
		WS=10;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_text = 2, RULE_main_heading = 3, RULE_sub_heading = 4, 
		RULE_italic = 5, RULE_bold = 6, RULE_bolditalic = 7;
	public static final String[] ruleNames = {
		"prog", "stat", "text", "main_heading", "sub_heading", "italic", "bold", 
		"bolditalic"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'-'", "'*'", "'_'", "'**'", "'__'", "'***'", null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "TEXT", "SPACE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "markdown.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public markdownParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				stat();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << TEXT) | (1L << SPACE) | (1L << WS))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public Main_headingContext main_heading() {
			return getRuleContext(Main_headingContext.class,0);
		}
		public Sub_headingContext sub_heading() {
			return getRuleContext(Sub_headingContext.class,0);
		}
		public ItalicContext italic() {
			return getRuleContext(ItalicContext.class,0);
		}
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public BolditalicContext bolditalic() {
			return getRuleContext(BolditalicContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode WS() { return getToken(markdownParser.WS, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				main_heading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				sub_heading();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				italic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				bold();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(25);
				bolditalic();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(26);
				text();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(27);
				match(WS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(markdownParser.TEXT, 0); }
		public TerminalNode SPACE() { return getToken(markdownParser.SPACE, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==SPACE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_headingContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(markdownParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(markdownParser.WS, i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public Main_headingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterMain_heading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitMain_heading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitMain_heading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_headingContext main_heading() throws RecognitionException {
		Main_headingContext _localctx = new Main_headingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main_heading);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT || _la==SPACE) {
				{
				{
				setState(32);
				text();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(WS);
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				match(T__0);
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(45); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(44);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(47); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_headingContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(markdownParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(markdownParser.WS, i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public Sub_headingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterSub_heading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitSub_heading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitSub_heading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_headingContext sub_heading() throws RecognitionException {
		Sub_headingContext _localctx = new Sub_headingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sub_heading);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(49);
				match(WS);
				}
				break;
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT || _la==SPACE) {
				{
				{
				setState(52);
				text();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(WS);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				match(T__1);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(64);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItalicContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ItalicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterItalic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitItalic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitItalic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalicContext italic() throws RecognitionException {
		ItalicContext _localctx = new ItalicContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_italic);
		try {
			int _alt;
			setState(85);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(69);
				match(T__2);
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						stat();
						}
						} 
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(76);
				match(T__2);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(77);
				match(T__3);
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(78);
						stat();
						}
						} 
					}
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(84);
				match(T__3);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoldContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterBold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitBold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitBold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bold);
		try {
			int _alt;
			setState(103);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(87);
				match(T__4);
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88);
						stat();
						}
						} 
					}
					setState(93);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(94);
				match(T__4);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(95);
				match(T__5);
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(96);
						stat();
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(102);
				match(T__5);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BolditalicContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BolditalicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bolditalic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterBolditalic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitBolditalic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitBolditalic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BolditalicContext bolditalic() throws RecognitionException {
		BolditalicContext _localctx = new BolditalicContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bolditalic);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105);
			match(T__6);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					stat();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(112);
			match(T__6);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\fu\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2"+
		"\16\2\25\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\5\7\5$\n\5\f"+
		"\5\16\5\'\13\5\3\5\3\5\6\5+\n\5\r\5\16\5,\3\5\6\5\60\n\5\r\5\16\5\61\3"+
		"\6\5\6\65\n\6\3\6\7\68\n\6\f\6\16\6;\13\6\3\6\3\6\6\6?\n\6\r\6\16\6@\3"+
		"\6\6\6D\n\6\r\6\16\6E\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\7\3\7\3\7\7\7"+
		"R\n\7\f\7\16\7U\13\7\3\7\5\7X\n\7\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\b"+
		"\3\b\3\b\7\bd\n\b\f\b\16\bg\13\b\3\b\5\bj\n\b\3\t\3\t\7\tn\n\t\f\t\16"+
		"\tq\13\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\n\13\u0081\2\23\3"+
		"\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b%\3\2\2\2\n\64\3\2\2\2\fW\3\2\2\2\16i"+
		"\3\2\2\2\20k\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3"+
		"\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\37\5\b\5\2\30\37\5\n\6\2\31\37\5"+
		"\f\7\2\32\37\5\16\b\2\33\37\5\20\t\2\34\37\5\6\4\2\35\37\7\f\2\2\36\27"+
		"\3\2\2\2\36\30\3\2\2\2\36\31\3\2\2\2\36\32\3\2\2\2\36\33\3\2\2\2\36\34"+
		"\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\t\2\2\2!\7\3\2\2\2\"$\5\6\4\2#\""+
		"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(*\7\f\2\2"+
		")+\7\3\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\7\f\2"+
		"\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\t\3\2\2\2\63\65"+
		"\7\f\2\2\64\63\3\2\2\2\64\65\3\2\2\2\659\3\2\2\2\668\5\6\4\2\67\66\3\2"+
		"\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<>\7\f\2\2=?\7"+
		"\4\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\7\f\2\2CB\3"+
		"\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\13\3\2\2\2GK\7\5\2\2HJ\5\4\3\2I"+
		"H\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NX\7\5\2\2"+
		"OS\7\6\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2"+
		"US\3\2\2\2VX\7\6\2\2WG\3\2\2\2WO\3\2\2\2X\r\3\2\2\2Y]\7\7\2\2Z\\\5\4\3"+
		"\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`j\7\7"+
		"\2\2ae\7\b\2\2bd\5\4\3\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2"+
		"\2\2ge\3\2\2\2hj\7\b\2\2iY\3\2\2\2ia\3\2\2\2j\17\3\2\2\2ko\7\t\2\2ln\5"+
		"\4\3\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7"+
		"\t\2\2s\21\3\2\2\2\22\25\36%,\61\649@EKSW]eio";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}