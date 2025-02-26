// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, LITENT=34, LITREAL=35, LITCHAR=36, IDENT=37, COMMENT=38, 
		LINE_COMMENT=39, WS=40;
	public static final int
		RULE_program = 0, RULE_sentencia = 1, RULE_sentencia_funcion = 2, RULE_definicion_global = 3, 
		RULE_definicion_local = 4, RULE_func_definicion = 5, RULE_struct_definicion = 6, 
		RULE_entrada = 7, RULE_func_call = 8, RULE_asignacion = 9, RULE_expresion = 10, 
		RULE_tipo = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencia", "sentencia_funcion", "definicion_global", "definicion_local", 
			"func_definicion", "struct_definicion", "entrada", "func_call", "asignacion", 
			"expresion", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "':'", "'['", "']'", "';'", "'('", "','", "')'", "'{'", 
			"'return'", "'}'", "'struct'", "'print'", "'printsp'", "'println'", "'='", 
			"'!'", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'<'", "'>'", "'<='", 
			"'>='", "'&&'", "'||'", "'.'", "'int'", "'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "LITENT", 
			"LITREAL", "LITCHAR", "IDENT", "COMMENT", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 257698230338L) != 0) {
				{
				{
				setState(24);
				sentencia();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public Definicion_globalContext definicion_global() {
			return getRuleContext(Definicion_globalContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Func_definicionContext func_definicion() {
			return getRuleContext(Func_definicionContext.class,0);
		}
		public Struct_definicionContext struct_definicion() {
			return getRuleContext(Struct_definicionContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(32);
				definicion_global();
				}
				break;
			case 2:
				{
				setState(33);
				asignacion();
				}
				break;
			case 3:
				{
				setState(34);
				func_definicion();
				}
				break;
			case 4:
				{
				setState(35);
				struct_definicion();
				}
				break;
			case 5:
				{
				setState(36);
				entrada();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_funcionContext extends ParserRuleContext {
		public Definicion_globalContext definicion_global() {
			return getRuleContext(Definicion_globalContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Sentencia_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_funcion; }
	}

	public final Sentencia_funcionContext sentencia_funcion() throws RecognitionException {
		Sentencia_funcionContext _localctx = new Sentencia_funcionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(39);
				definicion_global();
				}
				break;
			case 2:
				{
				setState(40);
				asignacion();
				}
				break;
			case 3:
				{
				setState(41);
				entrada();
				}
				break;
			case 4:
				{
				setState(42);
				func_call();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Definicion_globalContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> LITENT() { return getTokens(GrammarParser.LITENT); }
		public TerminalNode LITENT(int i) {
			return getToken(GrammarParser.LITENT, i);
		}
		public Definicion_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_global; }
	}

	public final Definicion_globalContext definicion_global() throws RecognitionException {
		Definicion_globalContext _localctx = new Definicion_globalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definicion_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(IDENT);
			setState(47);
			match(T__1);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(48);
				match(T__2);
				setState(49);
				match(LITENT);
				setState(50);
				match(T__3);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			tipo();
			setState(57);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Definicion_localContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> LITENT() { return getTokens(GrammarParser.LITENT); }
		public TerminalNode LITENT(int i) {
			return getToken(GrammarParser.LITENT, i);
		}
		public Definicion_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_local; }
	}

	public final Definicion_localContext definicion_local() throws RecognitionException {
		Definicion_localContext _localctx = new Definicion_localContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definicion_local);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IDENT);
			setState(60);
			match(T__1);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(61);
				match(T__2);
				setState(62);
				match(LITENT);
				setState(63);
				match(T__3);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_definicionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<Definicion_localContext> definicion_local() {
			return getRuleContexts(Definicion_localContext.class);
		}
		public Definicion_localContext definicion_local(int i) {
			return getRuleContext(Definicion_localContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<Sentencia_funcionContext> sentencia_funcion() {
			return getRuleContexts(Sentencia_funcionContext.class);
		}
		public Sentencia_funcionContext sentencia_funcion(int i) {
			return getRuleContext(Sentencia_funcionContext.class,i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Func_definicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_definicion; }
	}

	public final Func_definicionContext func_definicion() throws RecognitionException {
		Func_definicionContext _localctx = new Func_definicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_definicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IDENT);
			setState(72);
			match(T__5);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(73);
				definicion_local();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(74);
					match(T__6);
					setState(75);
					definicion_local();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(83);
			match(T__7);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(84);
				match(T__1);
				setState(85);
				tipo();
				}
			}

			setState(88);
			match(T__8);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 257698226242L) != 0) {
				{
				{
				setState(89);
				sentencia_funcion();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(95);
				match(T__9);
				setState(96);
				expresion(0);
				setState(97);
				match(T__4);
				}
			}

			setState(101);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_definicionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<Definicion_localContext> definicion_local() {
			return getRuleContexts(Definicion_localContext.class);
		}
		public Definicion_localContext definicion_local(int i) {
			return getRuleContext(Definicion_localContext.class,i);
		}
		public Struct_definicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_definicion; }
	}

	public final Struct_definicionContext struct_definicion() throws RecognitionException {
		Struct_definicionContext _localctx = new Struct_definicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_struct_definicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__11);
			setState(104);
			match(IDENT);
			setState(105);
			match(T__8);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(106);
				definicion_local();
				setState(107);
				match(T__4);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EntradaContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_entrada);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__12);
				setState(117);
				expresion(0);
				setState(118);
				match(T__4);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__13);
				setState(121);
				expresion(0);
				setState(122);
				match(T__4);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(T__14);
				setState(125);
				expresion(0);
				setState(126);
				match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IDENT);
			setState(131);
			match(T__5);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 257698168896L) != 0) {
				{
				setState(132);
				expresion(0);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(133);
					match(T__6);
					setState(134);
					expresion(0);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(142);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			expresion(0);
			setState(145);
			match(T__15);
			setState(146);
			expresion(0);
			setState(147);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITCHAR() { return getToken(GrammarParser.LITCHAR, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(150);
				match(T__5);
				setState(151);
				expresion(0);
				setState(152);
				match(T__7);
				}
				break;
			case IDENT:
				{
				setState(154);
				match(IDENT);
				}
				break;
			case LITENT:
				{
				setState(155);
				match(LITENT);
				}
				break;
			case LITCHAR:
				{
				setState(156);
				match(LITCHAR);
				}
				break;
			case LITREAL:
				{
				setState(157);
				match(LITREAL);
				}
				break;
			case T__16:
				{
				setState(158);
				match(T__16);
				setState(159);
				expresion(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(162);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(163);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(164);
						expresion(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(165);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(166);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						expresion(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(168);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(169);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						expresion(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(171);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(172);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						expresion(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(174);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(175);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						expresion(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(177);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(178);
						match(T__29);
						setState(179);
						expresion(2);
						}
						break;
					case 7:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(180);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(181);
						match(T__2);
						setState(182);
						expresion(0);
						setState(183);
						match(T__3);
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 152471339008L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001&\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002,\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004A\b\u0004\n\u0004\f\u0004D\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005M\b\u0005\n\u0005\f\u0005P\t\u0005\u0003\u0005"+
		"R\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005W\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005[\b\u0005\n\u0005\f\u0005^\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005d\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006n\b\u0006\n\u0006\f\u0006q\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0081\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0088\b\b\n\b\f\b\u008b\t\b\u0003\b\u008d\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00a1\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ba\b\n\n"+
		"\n\f\n\u00bd\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0001\u0014"+
		"\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0006"+
		"\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0017"+
		"\u0001\u0000\u0018\u001b\u0001\u0000\u001c\u001d\u0002\u0000\u001f!%%"+
		"\u00d4\u0000\u001b\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000"+
		"\u0004+\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b;\u0001"+
		"\u0000\u0000\u0000\nG\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000"+
		"\u000e\u0080\u0001\u0000\u0000\u0000\u0010\u0082\u0001\u0000\u0000\u0000"+
		"\u0012\u0090\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000\u0000\u0000"+
		"\u0016\u00be\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000"+
		"\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000"+
		" &\u0003\u0006\u0003\u0000!&\u0003\u0012\t\u0000\"&\u0003\n\u0005\u0000"+
		"#&\u0003\f\u0006\u0000$&\u0003\u000e\u0007\u0000% \u0001\u0000\u0000\u0000"+
		"%!\u0001\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%$\u0001\u0000\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\',\u0003"+
		"\u0006\u0003\u0000(,\u0003\u0012\t\u0000),\u0003\u000e\u0007\u0000*,\u0003"+
		"\u0010\b\u0000+\'\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000+)"+
		"\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0005\u0001\u0000"+
		"\u0000\u0000-.\u0005\u0001\u0000\u0000./\u0005%\u0000\u0000/5\u0005\u0002"+
		"\u0000\u000001\u0005\u0003\u0000\u000012\u0005\"\u0000\u000024\u0005\u0004"+
		"\u0000\u000030\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000089\u0003\u0016\u000b\u00009:\u0005\u0005\u0000"+
		"\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0005%\u0000\u0000<B\u0005\u0002"+
		"\u0000\u0000=>\u0005\u0003\u0000\u0000>?\u0005\"\u0000\u0000?A\u0005\u0004"+
		"\u0000\u0000@=\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000EF\u0003\u0016\u000b\u0000F\t\u0001\u0000\u0000"+
		"\u0000GH\u0005%\u0000\u0000HQ\u0005\u0006\u0000\u0000IN\u0003\b\u0004"+
		"\u0000JK\u0005\u0007\u0000\u0000KM\u0003\b\u0004\u0000LJ\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QI\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SV\u0005\b\u0000\u0000TU\u0005\u0002\u0000\u0000UW\u0003\u0016\u000b\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X\\\u0005\t\u0000\u0000Y[\u0003\u0004\u0002\u0000ZY\u0001\u0000"+
		"\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]c\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"_`\u0005\n\u0000\u0000`a\u0003\u0014\n\u0000ab\u0005\u0005\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0005\u000b\u0000\u0000f\u000b\u0001"+
		"\u0000\u0000\u0000gh\u0005\f\u0000\u0000hi\u0005%\u0000\u0000io\u0005"+
		"\t\u0000\u0000jk\u0003\b\u0004\u0000kl\u0005\u0005\u0000\u0000ln\u0001"+
		"\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rs\u0005\u000b\u0000\u0000s\r\u0001\u0000"+
		"\u0000\u0000tu\u0005\r\u0000\u0000uv\u0003\u0014\n\u0000vw\u0005\u0005"+
		"\u0000\u0000w\u0081\u0001\u0000\u0000\u0000xy\u0005\u000e\u0000\u0000"+
		"yz\u0003\u0014\n\u0000z{\u0005\u0005\u0000\u0000{\u0081\u0001\u0000\u0000"+
		"\u0000|}\u0005\u000f\u0000\u0000}~\u0003\u0014\n\u0000~\u007f\u0005\u0005"+
		"\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080t\u0001\u0000\u0000"+
		"\u0000\u0080x\u0001\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0081"+
		"\u000f\u0001\u0000\u0000\u0000\u0082\u0083\u0005%\u0000\u0000\u0083\u008c"+
		"\u0005\u0006\u0000\u0000\u0084\u0089\u0003\u0014\n\u0000\u0085\u0086\u0005"+
		"\u0007\u0000\u0000\u0086\u0088\u0003\u0014\n\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u0084\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\b\u0000\u0000\u008f\u0011\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091\u0092\u0005\u0010\u0000\u0000"+
		"\u0092\u0093\u0003\u0014\n\u0000\u0093\u0094\u0005\u0005\u0000\u0000\u0094"+
		"\u0013\u0001\u0000\u0000\u0000\u0095\u0096\u0006\n\uffff\uffff\u0000\u0096"+
		"\u0097\u0005\u0006\u0000\u0000\u0097\u0098\u0003\u0014\n\u0000\u0098\u0099"+
		"\u0005\b\u0000\u0000\u0099\u00a1\u0001\u0000\u0000\u0000\u009a\u00a1\u0005"+
		"%\u0000\u0000\u009b\u00a1\u0005\"\u0000\u0000\u009c\u00a1\u0005$\u0000"+
		"\u0000\u009d\u00a1\u0005#\u0000\u0000\u009e\u009f\u0005\u0011\u0000\u0000"+
		"\u009f\u00a1\u0003\u0014\n\u0007\u00a0\u0095\u0001\u0000\u0000\u0000\u00a0"+
		"\u009a\u0001\u0000\u0000\u0000\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0"+
		"\u009c\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a1\u00bb\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\n\u0006\u0000\u0000\u00a3\u00a4\u0007\u0000\u0000\u0000\u00a4\u00ba"+
		"\u0003\u0014\n\u0007\u00a5\u00a6\n\u0005\u0000\u0000\u00a6\u00a7\u0007"+
		"\u0001\u0000\u0000\u00a7\u00ba\u0003\u0014\n\u0006\u00a8\u00a9\n\u0004"+
		"\u0000\u0000\u00a9\u00aa\u0007\u0002\u0000\u0000\u00aa\u00ba\u0003\u0014"+
		"\n\u0005\u00ab\u00ac\n\u0003\u0000\u0000\u00ac\u00ad\u0007\u0003\u0000"+
		"\u0000\u00ad\u00ba\u0003\u0014\n\u0004\u00ae\u00af\n\u0002\u0000\u0000"+
		"\u00af\u00b0\u0007\u0004\u0000\u0000\u00b0\u00ba\u0003\u0014\n\u0003\u00b1"+
		"\u00b2\n\u0001\u0000\u0000\u00b2\u00b3\u0005\u001e\u0000\u0000\u00b3\u00ba"+
		"\u0003\u0014\n\u0002\u00b4\u00b5\n\b\u0000\u0000\u00b5\u00b6\u0005\u0003"+
		"\u0000\u0000\u00b6\u00b7\u0003\u0014\n\u0000\u00b7\u00b8\u0005\u0004\u0000"+
		"\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00a2\u0001\u0000\u0000"+
		"\u0000\u00b9\u00a5\u0001\u0000\u0000\u0000\u00b9\u00a8\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ab\u0001\u0000\u0000\u0000\u00b9\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b1\u0001\u0000\u0000\u0000\u00b9\u00b4\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u0015\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0007\u0005\u0000"+
		"\u0000\u00bf\u0017\u0001\u0000\u0000\u0000\u0011\u001b%+5BNQV\\co\u0080"+
		"\u0089\u008c\u00a0\u00b9\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}