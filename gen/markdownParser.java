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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TEXT=9, 
		SPACE=10, WS=11;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_text = 2, RULE_main_heading = 3, RULE_sub_heading = 4, 
		RULE_custom = 5, RULE_italic = 6, RULE_bold = 7, RULE_bolditalic = 8;
	public static final String[] ruleNames = {
		"prog", "stat", "text", "main_heading", "sub_heading", "custom", "italic", 
		"bold", "bolditalic"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'-'", "'#'", "'*'", "'_'", "'**'", "'__'", "'***'", null, 
		"' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "TEXT", "SPACE", 
		"WS"
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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				stat();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << TEXT) | (1L << SPACE) | (1L << WS))) != 0) );
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
		public CustomContext custom() {
			return getRuleContext(CustomContext.class,0);
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
			setState(31);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				main_heading();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				sub_heading();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				custom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				italic();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				bold();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(28);
				bolditalic();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(29);
				text();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(30);
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
			setState(33);
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT || _la==SPACE) {
				{
				{
				setState(35);
				text();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(WS);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				match(T__0);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(48); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(47);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(50); 
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
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(52);
				match(WS);
				}
				break;
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT || _la==SPACE) {
				{
				{
				setState(55);
				text();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(WS);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(T__1);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(68); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(67);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(70); 
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

	public static class CustomContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode WS() { return getToken(markdownParser.WS, 0); }
		public CustomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).enterCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof markdownListener ) ((markdownListener)listener).exitCustom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof markdownVisitor ) return ((markdownVisitor<? extends T>)visitor).visitCustom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomContext custom() throws RecognitionException {
		CustomContext _localctx = new CustomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_custom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				match(T__2);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(77);
			text();
			setState(78);
			match(WS);
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
		enterRule(_localctx, 12, RULE_italic);
		try {
			int _alt;
			setState(96);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(80);
				match(T__3);
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						stat();
						}
						} 
					}
					setState(86);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(87);
				match(T__3);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(88);
				match(T__4);
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						stat();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(95);
				match(T__4);
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
		enterRule(_localctx, 14, RULE_bold);
		try {
			int _alt;
			setState(114);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(98);
				match(T__5);
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(99);
						stat();
						}
						} 
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(105);
				match(T__5);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(106);
				match(T__6);
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(107);
						stat();
						}
						} 
					}
					setState(112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(113);
				match(T__6);
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
		enterRule(_localctx, 16, RULE_bolditalic);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(116);
			match(T__7);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					stat();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(123);
			match(T__7);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\u0080\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2"+
		"\26\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4"+
		"\3\5\7\5\'\n\5\f\5\16\5*\13\5\3\5\3\5\6\5.\n\5\r\5\16\5/\3\5\6\5\63\n"+
		"\5\r\5\16\5\64\3\6\5\68\n\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\6\3\6\6\6B\n"+
		"\6\r\6\16\6C\3\6\6\6G\n\6\r\6\16\6H\3\7\6\7L\n\7\r\7\16\7M\3\7\3\7\3\7"+
		"\3\b\3\b\7\bU\n\b\f\b\16\bX\13\b\3\b\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\3"+
		"\b\5\bc\n\b\3\t\3\t\7\tg\n\t\f\t\16\tj\13\t\3\t\3\t\3\t\7\to\n\t\f\t\16"+
		"\tr\13\t\3\t\5\tu\n\t\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\n\2\2"+
		"\13\2\4\6\b\n\f\16\20\22\2\3\3\2\13\f\u008d\2\25\3\2\2\2\4!\3\2\2\2\6"+
		"#\3\2\2\2\b(\3\2\2\2\n\67\3\2\2\2\fK\3\2\2\2\16b\3\2\2\2\20t\3\2\2\2\22"+
		"v\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\3\3\2\2\2\31\"\5\b\5\2\32\"\5\n\6\2\33\"\5\f\7\2\34\"\5\16"+
		"\b\2\35\"\5\20\t\2\36\"\5\22\n\2\37\"\5\6\4\2 \"\7\r\2\2!\31\3\2\2\2!"+
		"\32\3\2\2\2!\33\3\2\2\2!\34\3\2\2\2!\35\3\2\2\2!\36\3\2\2\2!\37\3\2\2"+
		"\2! \3\2\2\2\"\5\3\2\2\2#$\t\2\2\2$\7\3\2\2\2%\'\5\6\4\2&%\3\2\2\2\'*"+
		"\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+-\7\r\2\2,.\7\3\2\2-"+
		",\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61\63\7\r\2\2"+
		"\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\t\3\2\2\2"+
		"\668\7\r\2\2\67\66\3\2\2\2\678\3\2\2\28<\3\2\2\29;\5\6\4\2:9\3\2\2\2;"+
		">\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?A\7\r\2\2@B\7\4\2\2"+
		"A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\7\r\2\2FE\3\2\2\2"+
		"GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\13\3\2\2\2JL\7\5\2\2KJ\3\2\2\2LM\3\2\2"+
		"\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\5\6\4\2PQ\7\r\2\2Q\r\3\2\2\2RV\7\6"+
		"\2\2SU\5\4\3\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2"+
		"\2\2Yc\7\6\2\2Z^\7\7\2\2[]\5\4\3\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3"+
		"\2\2\2_a\3\2\2\2`^\3\2\2\2ac\7\7\2\2bR\3\2\2\2bZ\3\2\2\2c\17\3\2\2\2d"+
		"h\7\b\2\2eg\5\4\3\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2"+
		"jh\3\2\2\2ku\7\b\2\2lp\7\t\2\2mo\5\4\3\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2"+
		"pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2su\7\t\2\2td\3\2\2\2tl\3\2\2\2u\21\3\2\2"+
		"\2vz\7\n\2\2wy\5\4\3\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2"+
		"\2|z\3\2\2\2}~\7\n\2\2~\23\3\2\2\2\23\27!(/\64\67<CHMV^bhptz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}