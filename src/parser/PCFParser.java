// Generated from C:/Gits/PCF/src/parser\PCF.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PCFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		VAR=10, ASSIGN=11, OP1=12, OP2=13, LIT=14, WS=15, LINE_COMMENT=16;
	public static final int
		RULE_term = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'let'", "'in'", "'ifz'", "'then'", "'else'", "'fun'", 
			"'->'", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "VAR", "ASSIGN", 
			"OP1", "OP2", "LIT", "WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "PCF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PCFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public CondContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LitContext extends TermContext {
		public TerminalNode LIT() { return getToken(PCFParser.LIT, 0); }
		public LitContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends TermContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(PCFParser.ASSIGN, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public VarContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOpContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode OP2() { return getToken(PCFParser.OP2, 0); }
		public TerminalNode OP1() { return getToken(PCFParser.OP1, 0); }
		public BinOpContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarUseContext extends TermContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public VarUseContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitVarUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunContext extends TermContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FunContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunUseContext extends TermContext {
		public TerminalNode VAR() { return getToken(PCFParser.VAR, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public FunUseContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PCFVisitor ) return ((PCFVisitor<? extends T>)visitor).visitFunUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new LitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(3);
				match(LIT);
				}
				break;
			case 2:
				{
				_localctx = new VarUseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(4);
				match(VAR);
				}
				break;
			case 3:
				{
				_localctx = new FunUseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(5);
				match(VAR);
				setState(7); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(6);
						term(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(9); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				_localctx = new BinOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(11);
				match(T__0);
				setState(12);
				term(0);
				setState(13);
				match(OP2);
				setState(14);
				term(0);
				setState(15);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new BinOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				match(T__0);
				setState(18);
				term(0);
				setState(19);
				match(OP1);
				setState(20);
				term(0);
				setState(21);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				match(T__2);
				setState(24);
				match(VAR);
				setState(25);
				match(ASSIGN);
				setState(26);
				term(0);
				setState(27);
				match(T__3);
				setState(28);
				term(3);
				}
				break;
			case 7:
				{
				_localctx = new CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(T__4);
				setState(31);
				term(0);
				setState(32);
				match(T__5);
				setState(33);
				term(0);
				setState(34);
				match(T__6);
				setState(35);
				term(2);
				}
				break;
			case 8:
				{
				_localctx = new FunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(T__7);
				setState(38);
				match(VAR);
				setState(39);
				match(T__8);
				setState(40);
				term(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(49);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new BinOpContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(43);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(44);
						match(OP2);
						setState(45);
						term(6);
						}
						break;
					case 2:
						{
						_localctx = new BinOpContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(46);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(47);
						match(OP1);
						setState(48);
						term(5);
						}
						break;
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\229\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\6\2\n\n\2\r\2\16\2\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\64\n\2\f\2\16\2"+
		"\67\13\2\3\2\2\3\2\3\2\2\2\2A\2+\3\2\2\2\4\5\b\2\1\2\5,\7\20\2\2\6,\7"+
		"\f\2\2\7\t\7\f\2\2\b\n\5\2\2\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13"+
		"\f\3\2\2\2\f,\3\2\2\2\r\16\7\3\2\2\16\17\5\2\2\2\17\20\7\17\2\2\20\21"+
		"\5\2\2\2\21\22\7\4\2\2\22,\3\2\2\2\23\24\7\3\2\2\24\25\5\2\2\2\25\26\7"+
		"\16\2\2\26\27\5\2\2\2\27\30\7\4\2\2\30,\3\2\2\2\31\32\7\5\2\2\32\33\7"+
		"\f\2\2\33\34\7\r\2\2\34\35\5\2\2\2\35\36\7\6\2\2\36\37\5\2\2\5\37,\3\2"+
		"\2\2 !\7\7\2\2!\"\5\2\2\2\"#\7\b\2\2#$\5\2\2\2$%\7\t\2\2%&\5\2\2\4&,\3"+
		"\2\2\2\'(\7\n\2\2()\7\f\2\2)*\7\13\2\2*,\5\2\2\3+\4\3\2\2\2+\6\3\2\2\2"+
		"+\7\3\2\2\2+\r\3\2\2\2+\23\3\2\2\2+\31\3\2\2\2+ \3\2\2\2+\'\3\2\2\2,\65"+
		"\3\2\2\2-.\f\7\2\2./\7\17\2\2/\64\5\2\2\b\60\61\f\6\2\2\61\62\7\16\2\2"+
		"\62\64\5\2\2\7\63-\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65"+
		"\66\3\2\2\2\66\3\3\2\2\2\67\65\3\2\2\2\6\13+\63\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}