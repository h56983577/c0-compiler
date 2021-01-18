// Generated from D:/大三上/编译技术/c0-compiler/src/main/resources\C0.g4 by ANTLR 4.9
package c0.analyser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class C0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FN_KW=1, LET_KW=2, CONST_KW=3, AS_KW=4, WHILE_KW=5, IF_KW=6, ELSE_KW=7, 
		RETURN_KW=8, BREAK_KW=9, CONTINUE_KW=10, WS=11, UINT_LITERAL=12, DOUBLE_LITERAL=13, 
		ESCAPE_SEQUENCE=14, STRING_REGULAR_CHAR=15, STRING_LITERAL=16, CHAR_REGULAR_CHAR=17, 
		CHAR_LITERAL=18, IDENT=19, PLUS=20, MINUS=21, MUL=22, DIV=23, ASSIGN=24, 
		EQ=25, NEQ=26, LT=27, GT=28, LE=29, GE=30, L_PAREN=31, R_PAREN=32, L_BRACE=33, 
		R_BRACE=34, ARROW=35, COMMA=36, COLON=37, SEMICOLON=38, COMMENT=39;
	public static final int
		RULE_program = 0, RULE_item = 1, RULE_expr = 2, RULE_expr1 = 3, RULE_expr2 = 4, 
		RULE_binary_operator = 5, RULE_operator_expr = 6, RULE_negate_expr = 7, 
		RULE_assign_expr = 8, RULE_as_expr = 9, RULE_call_param_list = 10, RULE_call_expr = 11, 
		RULE_literal_expr = 12, RULE_ident_expr = 13, RULE_group_expr = 14, RULE_l_expr = 15, 
		RULE_ty = 16, RULE_stmt = 17, RULE_expr_stmt = 18, RULE_let_decl_stmt = 19, 
		RULE_const_decl_stmt = 20, RULE_decl_stmt = 21, RULE_if_stmt = 22, RULE_while_stmt = 23, 
		RULE_break_stmt = 24, RULE_continue_stmt = 25, RULE_return_stmt = 26, 
		RULE_block_stmt = 27, RULE_empty_stmt = 28, RULE_function_param = 29, 
		RULE_function_param_list = 30, RULE_function = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "item", "expr", "expr1", "expr2", "binary_operator", "operator_expr", 
			"negate_expr", "assign_expr", "as_expr", "call_param_list", "call_expr", 
			"literal_expr", "ident_expr", "group_expr", "l_expr", "ty", "stmt", "expr_stmt", 
			"let_decl_stmt", "const_decl_stmt", "decl_stmt", "if_stmt", "while_stmt", 
			"break_stmt", "continue_stmt", "return_stmt", "block_stmt", "empty_stmt", 
			"function_param", "function_param_list", "function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fn'", "'let'", "'const'", "'as'", "'while'", "'if'", "'else'", 
			"'return'", "'break'", "'continue'", null, null, null, null, null, null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'='", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'('", "')'", "'{'", "'}'", "'->'", "','", 
			"':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FN_KW", "LET_KW", "CONST_KW", "AS_KW", "WHILE_KW", "IF_KW", "ELSE_KW", 
			"RETURN_KW", "BREAK_KW", "CONTINUE_KW", "WS", "UINT_LITERAL", "DOUBLE_LITERAL", 
			"ESCAPE_SEQUENCE", "STRING_REGULAR_CHAR", "STRING_LITERAL", "CHAR_REGULAR_CHAR", 
			"CHAR_LITERAL", "IDENT", "PLUS", "MINUS", "MUL", "DIV", "ASSIGN", "EQ", 
			"NEQ", "LT", "GT", "LE", "GE", "L_PAREN", "R_PAREN", "L_BRACE", "R_BRACE", 
			"ARROW", "COMMA", "COLON", "SEMICOLON", "COMMENT"
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
	public String getGrammarFileName() { return "C0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public C0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FN_KW) | (1L << LET_KW) | (1L << CONST_KW))) != 0)) {
				{
				{
				setState(64);
				item();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ItemContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Decl_stmtContext decl_stmt() {
			return getRuleContext(Decl_stmtContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_item);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FN_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				function();
				}
				break;
			case LET_KW:
			case CONST_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				decl_stmt();
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

	public static class ExprContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				expr1();
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

	public static class Expr1Context extends ParserRuleContext {
		public Negate_exprContext negate_expr() {
			return getRuleContext(Negate_exprContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public Literal_exprContext literal_expr() {
			return getRuleContext(Literal_exprContext.class,0);
		}
		public Ident_exprContext ident_expr() {
			return getRuleContext(Ident_exprContext.class,0);
		}
		public Group_exprContext group_expr() {
			return getRuleContext(Group_exprContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr1);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				negate_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				assign_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				call_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				literal_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				ident_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				group_expr();
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

	public static class Expr2Context extends ParserRuleContext {
		public Operator_exprContext operator_expr() {
			return getRuleContext(Operator_exprContext.class,0);
		}
		public As_exprContext as_expr() {
			return getRuleContext(As_exprContext.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr2);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				operator_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				as_expr();
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

	public static class Binary_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(C0Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(C0Parser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(C0Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(C0Parser.DIV, 0); }
		public TerminalNode EQ() { return getToken(C0Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(C0Parser.NEQ, 0); }
		public TerminalNode LT() { return getToken(C0Parser.LT, 0); }
		public TerminalNode GT() { return getToken(C0Parser.GT, 0); }
		public TerminalNode LE() { return getToken(C0Parser.LE, 0); }
		public TerminalNode GE() { return getToken(C0Parser.GE, 0); }
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV) | (1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
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

	public static class Operator_exprContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public List<Binary_operatorContext> binary_operator() {
			return getRuleContexts(Binary_operatorContext.class);
		}
		public Binary_operatorContext binary_operator(int i) {
			return getRuleContext(Binary_operatorContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Operator_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterOperator_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitOperator_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitOperator_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_exprContext operator_expr() throws RecognitionException {
		Operator_exprContext _localctx = new Operator_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operator_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			expr1();
			setState(96); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(93);
					binary_operator();
					setState(94);
					expr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Negate_exprContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(C0Parser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Negate_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterNegate_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitNegate_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitNegate_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negate_exprContext negate_expr() throws RecognitionException {
		Negate_exprContext _localctx = new Negate_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_negate_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(MINUS);
			setState(101);
			expr();
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

	public static class Assign_exprContext extends ParserRuleContext {
		public L_exprContext l_expr() {
			return getRuleContext(L_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(C0Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitAssign_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			l_expr();
			setState(104);
			match(ASSIGN);
			setState(105);
			expr();
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

	public static class As_exprContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public List<TerminalNode> AS_KW() { return getTokens(C0Parser.AS_KW); }
		public TerminalNode AS_KW(int i) {
			return getToken(C0Parser.AS_KW, i);
		}
		public List<TyContext> ty() {
			return getRuleContexts(TyContext.class);
		}
		public TyContext ty(int i) {
			return getRuleContext(TyContext.class,i);
		}
		public As_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterAs_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitAs_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitAs_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_exprContext as_expr() throws RecognitionException {
		As_exprContext _localctx = new As_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_as_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			expr1();
			setState(110); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(108);
					match(AS_KW);
					setState(109);
					ty();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Call_param_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(C0Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(C0Parser.COMMA, i);
		}
		public Call_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterCall_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitCall_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitCall_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_param_listContext call_param_list() throws RecognitionException {
		Call_param_listContext _localctx = new Call_param_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			expr();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				expr();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Call_exprContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public TerminalNode L_PAREN() { return getToken(C0Parser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(C0Parser.R_PAREN, 0); }
		public Call_param_listContext call_param_list() {
			return getRuleContext(Call_param_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitCall_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitCall_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_call_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENT);
			setState(123);
			match(L_PAREN);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UINT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << STRING_LITERAL) | (1L << CHAR_LITERAL) | (1L << IDENT) | (1L << MINUS) | (1L << L_PAREN))) != 0)) {
				{
				setState(124);
				call_param_list();
				}
			}

			setState(127);
			match(R_PAREN);
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

	public static class Literal_exprContext extends ParserRuleContext {
		public TerminalNode UINT_LITERAL() { return getToken(C0Parser.UINT_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(C0Parser.DOUBLE_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(C0Parser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(C0Parser.CHAR_LITERAL, 0); }
		public Literal_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterLiteral_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitLiteral_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitLiteral_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_exprContext literal_expr() throws RecognitionException {
		Literal_exprContext _localctx = new Literal_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UINT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << STRING_LITERAL) | (1L << CHAR_LITERAL))) != 0)) ) {
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

	public static class Ident_exprContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public Ident_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterIdent_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitIdent_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitIdent_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ident_exprContext ident_expr() throws RecognitionException {
		Ident_exprContext _localctx = new Ident_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ident_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENT);
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

	public static class Group_exprContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(C0Parser.L_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(C0Parser.R_PAREN, 0); }
		public Group_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterGroup_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitGroup_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitGroup_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_exprContext group_expr() throws RecognitionException {
		Group_exprContext _localctx = new Group_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_group_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(L_PAREN);
			setState(134);
			expr();
			setState(135);
			match(R_PAREN);
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

	public static class L_exprContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public L_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterL_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitL_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitL_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_exprContext l_expr() throws RecognitionException {
		L_exprContext _localctx = new L_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_l_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(IDENT);
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

	public static class TyContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public TyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterTy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitTy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitTy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyContext ty() throws RecognitionException {
		TyContext _localctx = new TyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IDENT);
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

	public static class StmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Decl_stmtContext decl_stmt() {
			return getRuleContext(Decl_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public Empty_stmtContext empty_stmt() {
			return getRuleContext(Empty_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UINT_LITERAL:
			case DOUBLE_LITERAL:
			case STRING_LITERAL:
			case CHAR_LITERAL:
			case IDENT:
			case MINUS:
			case L_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				expr_stmt();
				}
				break;
			case LET_KW:
			case CONST_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				decl_stmt();
				}
				break;
			case IF_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				if_stmt();
				}
				break;
			case WHILE_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				while_stmt();
				}
				break;
			case BREAK_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				break_stmt();
				}
				break;
			case CONTINUE_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				continue_stmt();
				}
				break;
			case RETURN_KW:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				return_stmt();
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				block_stmt();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 9);
				{
				setState(149);
				empty_stmt();
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(C0Parser.SEMICOLON, 0); }
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			expr();
			setState(153);
			match(SEMICOLON);
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

	public static class Let_decl_stmtContext extends ParserRuleContext {
		public TerminalNode LET_KW() { return getToken(C0Parser.LET_KW, 0); }
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(C0Parser.COLON, 0); }
		public TyContext ty() {
			return getRuleContext(TyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(C0Parser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(C0Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Let_decl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_decl_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterLet_decl_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitLet_decl_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitLet_decl_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_decl_stmtContext let_decl_stmt() throws RecognitionException {
		Let_decl_stmtContext _localctx = new Let_decl_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_let_decl_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LET_KW);
			setState(156);
			match(IDENT);
			setState(157);
			match(COLON);
			setState(158);
			ty();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(159);
				match(ASSIGN);
				setState(160);
				expr();
				}
			}

			setState(163);
			match(SEMICOLON);
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

	public static class Const_decl_stmtContext extends ParserRuleContext {
		public TerminalNode CONST_KW() { return getToken(C0Parser.CONST_KW, 0); }
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(C0Parser.COLON, 0); }
		public TyContext ty() {
			return getRuleContext(TyContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(C0Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(C0Parser.SEMICOLON, 0); }
		public Const_decl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterConst_decl_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitConst_decl_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitConst_decl_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_decl_stmtContext const_decl_stmt() throws RecognitionException {
		Const_decl_stmtContext _localctx = new Const_decl_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_const_decl_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(CONST_KW);
			setState(166);
			match(IDENT);
			setState(167);
			match(COLON);
			setState(168);
			ty();
			setState(169);
			match(ASSIGN);
			setState(170);
			expr();
			setState(171);
			match(SEMICOLON);
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

	public static class Decl_stmtContext extends ParserRuleContext {
		public Let_decl_stmtContext let_decl_stmt() {
			return getRuleContext(Let_decl_stmtContext.class,0);
		}
		public Const_decl_stmtContext const_decl_stmt() {
			return getRuleContext(Const_decl_stmtContext.class,0);
		}
		public Decl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterDecl_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitDecl_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitDecl_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_stmtContext decl_stmt() throws RecognitionException {
		Decl_stmtContext _localctx = new Decl_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_decl_stmt);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				let_decl_stmt();
				}
				break;
			case CONST_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				const_decl_stmt();
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

	public static class If_stmtContext extends ParserRuleContext {
		public List<TerminalNode> IF_KW() { return getTokens(C0Parser.IF_KW); }
		public TerminalNode IF_KW(int i) {
			return getToken(C0Parser.IF_KW, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Block_stmtContext> block_stmt() {
			return getRuleContexts(Block_stmtContext.class);
		}
		public Block_stmtContext block_stmt(int i) {
			return getRuleContext(Block_stmtContext.class,i);
		}
		public List<TerminalNode> ELSE_KW() { return getTokens(C0Parser.ELSE_KW); }
		public TerminalNode ELSE_KW(int i) {
			return getToken(C0Parser.ELSE_KW, i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IF_KW);
			setState(178);
			expr();
			setState(179);
			block_stmt();
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					match(ELSE_KW);
					setState(181);
					match(IF_KW);
					setState(182);
					expr();
					setState(183);
					block_stmt();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KW) {
				{
				setState(190);
				match(ELSE_KW);
				setState(191);
				block_stmt();
				}
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE_KW() { return getToken(C0Parser.WHILE_KW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(WHILE_KW);
			setState(195);
			expr();
			setState(196);
			block_stmt();
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

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK_KW() { return getToken(C0Parser.BREAK_KW, 0); }
		public TerminalNode SEMICOLON() { return getToken(C0Parser.SEMICOLON, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(BREAK_KW);
			setState(199);
			match(SEMICOLON);
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

	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE_KW() { return getToken(C0Parser.CONTINUE_KW, 0); }
		public TerminalNode SEMICOLON() { return getToken(C0Parser.SEMICOLON, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitContinue_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(CONTINUE_KW);
			setState(202);
			match(SEMICOLON);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN_KW() { return getToken(C0Parser.RETURN_KW, 0); }
		public TerminalNode SEMICOLON() { return getToken(C0Parser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(RETURN_KW);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UINT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << STRING_LITERAL) | (1L << CHAR_LITERAL) | (1L << IDENT) | (1L << MINUS) | (1L << L_PAREN))) != 0)) {
				{
				setState(205);
				expr();
				}
			}

			setState(208);
			match(SEMICOLON);
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

	public static class Block_stmtContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(C0Parser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(C0Parser.R_BRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterBlock_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitBlock_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitBlock_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_stmtContext block_stmt() throws RecognitionException {
		Block_stmtContext _localctx = new Block_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(L_BRACE);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET_KW) | (1L << CONST_KW) | (1L << WHILE_KW) | (1L << IF_KW) | (1L << RETURN_KW) | (1L << BREAK_KW) | (1L << CONTINUE_KW) | (1L << UINT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << STRING_LITERAL) | (1L << CHAR_LITERAL) | (1L << IDENT) | (1L << MINUS) | (1L << L_PAREN) | (1L << L_BRACE) | (1L << SEMICOLON))) != 0)) {
				{
				{
				setState(211);
				stmt();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(R_BRACE);
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

	public static class Empty_stmtContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(C0Parser.SEMICOLON, 0); }
		public Empty_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterEmpty_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitEmpty_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitEmpty_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_stmtContext empty_stmt() throws RecognitionException {
		Empty_stmtContext _localctx = new Empty_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_empty_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(SEMICOLON);
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

	public static class Function_paramContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(C0Parser.COLON, 0); }
		public TyContext ty() {
			return getRuleContext(TyContext.class,0);
		}
		public TerminalNode CONST_KW() { return getToken(C0Parser.CONST_KW, 0); }
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterFunction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitFunction_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitFunction_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST_KW) {
				{
				setState(221);
				match(CONST_KW);
				}
			}

			setState(224);
			match(IDENT);
			setState(225);
			match(COLON);
			setState(226);
			ty();
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

	public static class Function_param_listContext extends ParserRuleContext {
		public List<Function_paramContext> function_param() {
			return getRuleContexts(Function_paramContext.class);
		}
		public Function_paramContext function_param(int i) {
			return getRuleContext(Function_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(C0Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(C0Parser.COMMA, i);
		}
		public Function_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterFunction_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitFunction_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitFunction_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_param_listContext function_param_list() throws RecognitionException {
		Function_param_listContext _localctx = new Function_param_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			function_param();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(230);
				function_param();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FN_KW() { return getToken(C0Parser.FN_KW, 0); }
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public TerminalNode L_PAREN() { return getToken(C0Parser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(C0Parser.R_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(C0Parser.ARROW, 0); }
		public TyContext ty() {
			return getRuleContext(TyContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public Function_param_listContext function_param_list() {
			return getRuleContext(Function_param_listContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(FN_KW);
			setState(237);
			match(IDENT);
			setState(238);
			match(L_PAREN);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST_KW || _la==IDENT) {
				{
				setState(239);
				function_param_list();
				}
			}

			setState(242);
			match(R_PAREN);
			setState(243);
			match(ARROW);
			setState(244);
			ty();
			setState(245);
			block_stmt();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\5\3K\n\3\3\4\3\4\5\4O\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\5\6[\n\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\6\bc\n\b\r\b\16\bd\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13q\n"+
		"\13\r\13\16\13r\3\f\3\f\3\f\7\fx\n\f\f\f\16\f{\13\f\3\r\3\r\3\r\5\r\u0080"+
		"\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0099\n\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00a4\n\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00b2\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00bc\n\30\f\30\16\30\u00bf\13\30"+
		"\3\30\3\30\5\30\u00c3\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\5\34\u00d1\n\34\3\34\3\34\3\35\3\35\7\35\u00d7\n\35\f"+
		"\35\16\35\u00da\13\35\3\35\3\35\3\36\3\36\3\37\5\37\u00e1\n\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \7 \u00ea\n \f \16 \u00ed\13 \3!\3!\3!\3!\5!\u00f3"+
		"\n!\3!\3!\3!\3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@\2\4\4\2\26\31\33 \5\2\16\17\22\22\24\24\2\u00f7"+
		"\2E\3\2\2\2\4J\3\2\2\2\6N\3\2\2\2\bV\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16"+
		"^\3\2\2\2\20f\3\2\2\2\22i\3\2\2\2\24m\3\2\2\2\26t\3\2\2\2\30|\3\2\2\2"+
		"\32\u0083\3\2\2\2\34\u0085\3\2\2\2\36\u0087\3\2\2\2 \u008b\3\2\2\2\"\u008d"+
		"\3\2\2\2$\u0098\3\2\2\2&\u009a\3\2\2\2(\u009d\3\2\2\2*\u00a7\3\2\2\2,"+
		"\u00b1\3\2\2\2.\u00b3\3\2\2\2\60\u00c4\3\2\2\2\62\u00c8\3\2\2\2\64\u00cb"+
		"\3\2\2\2\66\u00ce\3\2\2\28\u00d4\3\2\2\2:\u00dd\3\2\2\2<\u00e0\3\2\2\2"+
		">\u00e6\3\2\2\2@\u00ee\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2"+
		"EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2HK\5@!\2IK\5,\27\2JH\3\2\2\2JI\3\2\2\2"+
		"K\5\3\2\2\2LO\5\n\6\2MO\5\b\5\2NL\3\2\2\2NM\3\2\2\2O\7\3\2\2\2PW\5\20"+
		"\t\2QW\5\22\n\2RW\5\30\r\2SW\5\32\16\2TW\5\34\17\2UW\5\36\20\2VP\3\2\2"+
		"\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\t\3\2\2\2X[\5\16"+
		"\b\2Y[\5\24\13\2ZX\3\2\2\2ZY\3\2\2\2[\13\3\2\2\2\\]\t\2\2\2]\r\3\2\2\2"+
		"^b\5\b\5\2_`\5\f\7\2`a\5\6\4\2ac\3\2\2\2b_\3\2\2\2cd\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2e\17\3\2\2\2fg\7\27\2\2gh\5\6\4\2h\21\3\2\2\2ij\5 \21\2jk\7"+
		"\32\2\2kl\5\6\4\2l\23\3\2\2\2mp\5\b\5\2no\7\6\2\2oq\5\"\22\2pn\3\2\2\2"+
		"qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\25\3\2\2\2ty\5\6\4\2uv\7&\2\2vx\5\6\4"+
		"\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\27\3\2\2\2{y\3\2\2\2|}\7\25"+
		"\2\2}\177\7!\2\2~\u0080\5\26\f\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\7\"\2\2\u0082\31\3\2\2\2\u0083\u0084\t\3\2"+
		"\2\u0084\33\3\2\2\2\u0085\u0086\7\25\2\2\u0086\35\3\2\2\2\u0087\u0088"+
		"\7!\2\2\u0088\u0089\5\6\4\2\u0089\u008a\7\"\2\2\u008a\37\3\2\2\2\u008b"+
		"\u008c\7\25\2\2\u008c!\3\2\2\2\u008d\u008e\7\25\2\2\u008e#\3\2\2\2\u008f"+
		"\u0099\5&\24\2\u0090\u0099\5,\27\2\u0091\u0099\5.\30\2\u0092\u0099\5\60"+
		"\31\2\u0093\u0099\5\62\32\2\u0094\u0099\5\64\33\2\u0095\u0099\5\66\34"+
		"\2\u0096\u0099\58\35\2\u0097\u0099\5:\36\2\u0098\u008f\3\2\2\2\u0098\u0090"+
		"\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0093\3\2\2\2\u0098"+
		"\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2"+
		"\2\2\u0099%\3\2\2\2\u009a\u009b\5\6\4\2\u009b\u009c\7(\2\2\u009c\'\3\2"+
		"\2\2\u009d\u009e\7\4\2\2\u009e\u009f\7\25\2\2\u009f\u00a0\7\'\2\2\u00a0"+
		"\u00a3\5\"\22\2\u00a1\u00a2\7\32\2\2\u00a2\u00a4\5\6\4\2\u00a3\u00a1\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7(\2\2\u00a6"+
		")\3\2\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\7\25\2\2\u00a9\u00aa\7\'\2\2"+
		"\u00aa\u00ab\5\"\22\2\u00ab\u00ac\7\32\2\2\u00ac\u00ad\5\6\4\2\u00ad\u00ae"+
		"\7(\2\2\u00ae+\3\2\2\2\u00af\u00b2\5(\25\2\u00b0\u00b2\5*\26\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2-\3\2\2\2\u00b3\u00b4\7\b\2\2\u00b4"+
		"\u00b5\5\6\4\2\u00b5\u00bd\58\35\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8\7\b"+
		"\2\2\u00b8\u00b9\5\6\4\2\u00b9\u00ba\58\35\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b6\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c2\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\t\2\2\u00c1"+
		"\u00c3\58\35\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3/\3\2\2\2"+
		"\u00c4\u00c5\7\7\2\2\u00c5\u00c6\5\6\4\2\u00c6\u00c7\58\35\2\u00c7\61"+
		"\3\2\2\2\u00c8\u00c9\7\13\2\2\u00c9\u00ca\7(\2\2\u00ca\63\3\2\2\2\u00cb"+
		"\u00cc\7\f\2\2\u00cc\u00cd\7(\2\2\u00cd\65\3\2\2\2\u00ce\u00d0\7\n\2\2"+
		"\u00cf\u00d1\5\6\4\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d3\7(\2\2\u00d3\67\3\2\2\2\u00d4\u00d8\7#\2\2\u00d5"+
		"\u00d7\5$\23\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\7$\2\2\u00dc9\3\2\2\2\u00dd\u00de\7(\2\2\u00de;\3\2\2\2\u00df\u00e1"+
		"\7\5\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7\25\2\2\u00e3\u00e4\7\'\2\2\u00e4\u00e5\5\"\22\2\u00e5=\3\2\2"+
		"\2\u00e6\u00eb\5<\37\2\u00e7\u00e8\7&\2\2\u00e8\u00ea\5<\37\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"?\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\3\2\2\u00ef\u00f0\7\25\2\2"+
		"\u00f0\u00f2\7!\2\2\u00f1\u00f3\5> \2\u00f2\u00f1\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\7%\2\2\u00f6"+
		"\u00f7\5\"\22\2\u00f7\u00f8\58\35\2\u00f8A\3\2\2\2\25EJNVZdry\177\u0098"+
		"\u00a3\u00b1\u00bd\u00c2\u00d0\u00d8\u00e0\u00eb\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}