// Generated from be\DateExpression.g4 by ANTLR 4.3
package be;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, PeriodExp=14, Year=15, Month=16, Week=17, 
		Day=18, WS=19, JavaLetter=20, DATE=21, INT4=22, INT2=23, INT=24, JAN=25, 
		FEB=26, MAR=27, APR=28, MAY=29, JUN=30, JUL=31, AUG=32, SEP=33, OCT=34, 
		NOV=35, DEC=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'today'", "'->'", "'yesterday'", "'tomorrow'", "'['", "'{'", 
		"']'", "'}'", "'TODAY'", "'YESTERDAY'", "'+'", "'TOMORROW'", "'-'", "PeriodExp", 
		"Year", "Month", "Week", "Day", "WS", "JavaLetter", "DATE", "INT4", "INT2", 
		"INT", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", 
		"OCT", "NOV", "DEC"
	};
	public static final int
		RULE_compileUnit = 0, RULE_eval = 1, RULE_assignExp = 2, RULE_assignOp = 3, 
		RULE_timeExp = 4, RULE_dateExp = 5, RULE_variable = 6, RULE_literal = 7, 
		RULE_number = 8, RULE_month = 9;
	public static final String[] ruleNames = {
		"compileUnit", "eval", "assignExp", "assignOp", "timeExp", "dateExp", 
		"variable", "literal", "number", "month"
	};

	@Override
	public String getGrammarFileName() { return "DateExpression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DateExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompileUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DateExpressionParser.EOF, 0); }
		public EvalContext eval() {
			return getRuleContext(EvalContext.class,0);
		}
		public CompileUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compileUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).enterCompileUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).exitCompileUnit(this);
		}
	}

	public final CompileUnitContext compileUnit() throws RecognitionException {
		CompileUnitContext _localctx = new CompileUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compileUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); eval();
			setState(21); match(EOF);
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

	public static class EvalContext extends ParserRuleContext {
		public long value;
		public TimeExpContext exp;
		public TimeExpContext timeExp() {
			return getRuleContext(TimeExpContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); ((EvalContext)_localctx).exp = timeExp();
			((EvalContext)_localctx).value =  ((EvalContext)_localctx).exp.value;
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

	public static class AssignExpContext extends ParserRuleContext {
		public long value;
		public VariableContext v;
		public DateExpContext l;
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public DateExpContext dateExp() {
			return getRuleContext(DateExpContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).exitAssignExp(this);
		}
	}

	public final AssignExpContext assignExp() throws RecognitionException {
		AssignExpContext _localctx = new AssignExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); ((AssignExpContext)_localctx).v = variable();
			setState(27); assignOp();
			setState(28); ((AssignExpContext)_localctx).l = dateExp();
			((AssignExpContext)_localctx).value =  DateHelper.addVariable((((AssignExpContext)_localctx).v!=null?_input.getText(((AssignExpContext)_localctx).v.start,((AssignExpContext)_localctx).v.stop):null).substring(1, (((AssignExpContext)_localctx).v!=null?_input.getText(((AssignExpContext)_localctx).v.start,((AssignExpContext)_localctx).v.stop):null).length()-1), ((AssignExpContext)_localctx).l.value);
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

	public static class AssignOpContext extends ParserRuleContext {
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).exitAssignOp(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(T__11);
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

	public static class TimeExpContext extends ParserRuleContext {
		public long value;
		public DateExpContext m1;
		public Token m2;
		public AssignExpContext exp;
		public Token p1;
		public Token p2;
		public AssignExpContext assignExp() {
			return getRuleContext(AssignExpContext.class,0);
		}
		public TerminalNode PeriodExp(int i) {
			return getToken(DateExpressionParser.PeriodExp, i);
		}
		public List<TerminalNode> PeriodExp() { return getTokens(DateExpressionParser.PeriodExp); }
		public DateExpContext dateExp() {
			return getRuleContext(DateExpContext.class,0);
		}
		public TimeExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).enterTimeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).exitTimeExp(this);
		}
	}

	public final TimeExpContext timeExp() throws RecognitionException {
		TimeExpContext _localctx = new TimeExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_timeExp);
		int _la;
		try {
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); ((TimeExpContext)_localctx).m1 = dateExp();
				((TimeExpContext)_localctx).value =   ((TimeExpContext)_localctx).m1.value;
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || _la==T__0) {
					{
					setState(41);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(35); match(T__2);
						setState(36); ((TimeExpContext)_localctx).m2 = match(PeriodExp);
						((TimeExpContext)_localctx).value =  DateHelper.addPeriod(_localctx.value,(((TimeExpContext)_localctx).m2!=null?((TimeExpContext)_localctx).m2.getText():null),true);
						}
						break;
					case T__0:
						{
						setState(38); match(T__0);
						setState(39); ((TimeExpContext)_localctx).m2 = match(PeriodExp);
						((TimeExpContext)_localctx).value =  DateHelper.addPeriod(_localctx.value,(((TimeExpContext)_localctx).m2!=null?((TimeExpContext)_localctx).m2.getText():null),false);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); ((TimeExpContext)_localctx).exp = assignExp();
				((TimeExpContext)_localctx).value =  ((TimeExpContext)_localctx).exp.value;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(49); match(T__2);
					}
				}

				setState(52); ((TimeExpContext)_localctx).p1 = match(PeriodExp);
				((TimeExpContext)_localctx).value =   DateHelper.addPeriod(DateHelper.today(),(((TimeExpContext)_localctx).p1!=null?((TimeExpContext)_localctx).p1.getText():null),true);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || _la==T__0) {
					{
					setState(60);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(54); match(T__2);
						setState(55); ((TimeExpContext)_localctx).p2 = match(PeriodExp);
						((TimeExpContext)_localctx).value =  DateHelper.addPeriod(_localctx.value,(((TimeExpContext)_localctx).p2!=null?((TimeExpContext)_localctx).p2.getText():null),true);
						}
						break;
					case T__0:
						{
						setState(57); match(T__0);
						setState(58); ((TimeExpContext)_localctx).p2 = match(PeriodExp);
						((TimeExpContext)_localctx).value =  DateHelper.addPeriod(_localctx.value,(((TimeExpContext)_localctx).p2!=null?((TimeExpContext)_localctx).p2.getText():null),false);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65); match(T__0);
				setState(66); ((TimeExpContext)_localctx).p1 = match(PeriodExp);
				((TimeExpContext)_localctx).value =   DateHelper.addPeriod(DateHelper.today(),(((TimeExpContext)_localctx).p1!=null?((TimeExpContext)_localctx).p1.getText():null),false);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || _la==T__0) {
					{
					setState(74);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(68); match(T__2);
						setState(69); ((TimeExpContext)_localctx).p2 = match(PeriodExp);
						((TimeExpContext)_localctx).value =  DateHelper.addPeriod(_localctx.value,(((TimeExpContext)_localctx).p2!=null?((TimeExpContext)_localctx).p2.getText():null),true);
						}
						break;
					case T__0:
						{
						setState(71); match(T__0);
						setState(72); ((TimeExpContext)_localctx).p2 = match(PeriodExp);
						((TimeExpContext)_localctx).value =  DateHelper.addPeriod(_localctx.value,(((TimeExpContext)_localctx).p2!=null?((TimeExpContext)_localctx).p2.getText():null),false);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class DateExpContext extends ParserRuleContext {
		public long value;
		public LiteralContext n;
		public VariableContext v;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DateExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).enterDateExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).exitDateExp(this);
		}
	}

	public final DateExpContext dateExp() throws RecognitionException {
		DateExpContext _localctx = new DateExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dateExp);
		int _la;
		try {
			setState(93);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); ((DateExpContext)_localctx).n = literal();
				((DateExpContext)_localctx).value =  DateHelper.parseDate((((DateExpContext)_localctx).n!=null?_input.getText(((DateExpContext)_localctx).n.start,((DateExpContext)_localctx).n.stop):null).substring(1, (((DateExpContext)_localctx).n!=null?_input.getText(((DateExpContext)_localctx).n.start,((DateExpContext)_localctx).n.stop):null).length()-1));
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); ((DateExpContext)_localctx).v = variable();
				((DateExpContext)_localctx).value =  DateHelper.getVariable((((DateExpContext)_localctx).v!=null?_input.getText(((DateExpContext)_localctx).v.start,((DateExpContext)_localctx).v.stop):null).substring(1, (((DateExpContext)_localctx).v!=null?_input.getText(((DateExpContext)_localctx).v.start,((DateExpContext)_localctx).v.stop):null).length()-1));
				}
				break;
			case T__12:
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				((DateExpContext)_localctx).value =   DateHelper.today();
				}
				break;
			case T__10:
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				((DateExpContext)_localctx).value =   DateHelper.yesterday();
				}
				break;
			case T__9:
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				((DateExpContext)_localctx).value =   DateHelper.tomorrow();
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> JavaLetter() { return getTokens(DateExpressionParser.JavaLetter); }
		public TerminalNode JavaLetter(int i) {
			return getToken(DateExpressionParser.JavaLetter, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(T__7);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JavaLetter) {
				{
				{
				setState(96); match(JavaLetter);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); match(T__5);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(DateExpressionParser.DATE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(T__8);
			setState(105); match(DATE);
			setState(106); match(T__6);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT4() { return getToken(DateExpressionParser.INT4, 0); }
		public TerminalNode INT() { return getToken(DateExpressionParser.INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==INT4 || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MonthContext extends ParserRuleContext {
		public TerminalNode NOV() { return getToken(DateExpressionParser.NOV, 0); }
		public TerminalNode DEC() { return getToken(DateExpressionParser.DEC, 0); }
		public TerminalNode AUG() { return getToken(DateExpressionParser.AUG, 0); }
		public TerminalNode APR() { return getToken(DateExpressionParser.APR, 0); }
		public TerminalNode MAR() { return getToken(DateExpressionParser.MAR, 0); }
		public TerminalNode SEP() { return getToken(DateExpressionParser.SEP, 0); }
		public TerminalNode JUN() { return getToken(DateExpressionParser.JUN, 0); }
		public TerminalNode JAN() { return getToken(DateExpressionParser.JAN, 0); }
		public TerminalNode JUL() { return getToken(DateExpressionParser.JUL, 0); }
		public TerminalNode MAY() { return getToken(DateExpressionParser.MAY, 0); }
		public TerminalNode FEB() { return getToken(DateExpressionParser.FEB, 0); }
		public TerminalNode OCT() { return getToken(DateExpressionParser.OCT, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DateExpressionListener ) ((DateExpressionListener)listener).exitMonth(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_month);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAN) | (1L << FEB) | (1L << MAR) | (1L << APR) | (1L << MAY) | (1L << JUN) | (1L << JUL) | (1L << AUG) | (1L << SEP) | (1L << OCT) | (1L << NOV) | (1L << DEC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&s\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6,\n\6\f\6\16\6/\13\6\3\6\3\6\3\6\3\6\5\6\65\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6?\n\6\f\6\16\6B\13\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\5\6R\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\7\bd\n\b\f\b\16\bg\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20"+
		"\22\24\2\7\4\2\3\3\13\13\4\2\5\5\f\f\4\2\6\6\16\16\4\2\30\30\32\32\3\2"+
		"\33&w\2\26\3\2\2\2\4\31\3\2\2\2\6\34\3\2\2\2\b!\3\2\2\2\nQ\3\2\2\2\f_"+
		"\3\2\2\2\16a\3\2\2\2\20j\3\2\2\2\22n\3\2\2\2\24p\3\2\2\2\26\27\5\4\3\2"+
		"\27\30\7\2\2\3\30\3\3\2\2\2\31\32\5\n\6\2\32\33\b\3\1\2\33\5\3\2\2\2\34"+
		"\35\5\16\b\2\35\36\5\b\5\2\36\37\5\f\7\2\37 \b\4\1\2 \7\3\2\2\2!\"\7\4"+
		"\2\2\"\t\3\2\2\2#$\5\f\7\2$-\b\6\1\2%&\7\r\2\2&\'\7\20\2\2\',\b\6\1\2"+
		"()\7\17\2\2)*\7\20\2\2*,\b\6\1\2+%\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2"+
		"\2-.\3\2\2\2.R\3\2\2\2/-\3\2\2\2\60\61\5\6\4\2\61\62\b\6\1\2\62R\3\2\2"+
		"\2\63\65\7\r\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\20"+
		"\2\2\67@\b\6\1\289\7\r\2\29:\7\20\2\2:?\b\6\1\2;<\7\17\2\2<=\7\20\2\2"+
		"=?\b\6\1\2>8\3\2\2\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AR\3\2\2\2"+
		"B@\3\2\2\2CD\7\17\2\2DE\7\20\2\2EN\b\6\1\2FG\7\r\2\2GH\7\20\2\2HM\b\6"+
		"\1\2IJ\7\17\2\2JK\7\20\2\2KM\b\6\1\2LF\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3"+
		"\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2Q#\3\2\2\2Q\60\3\2\2\2Q\64\3\2\2\2"+
		"QC\3\2\2\2R\13\3\2\2\2ST\5\20\t\2TU\b\7\1\2U`\3\2\2\2VW\5\16\b\2WX\b\7"+
		"\1\2X`\3\2\2\2YZ\t\2\2\2Z`\b\7\1\2[\\\t\3\2\2\\`\b\7\1\2]^\t\4\2\2^`\b"+
		"\7\1\2_S\3\2\2\2_V\3\2\2\2_Y\3\2\2\2_[\3\2\2\2_]\3\2\2\2`\r\3\2\2\2ae"+
		"\7\b\2\2bd\7\26\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2"+
		"ge\3\2\2\2hi\7\n\2\2i\17\3\2\2\2jk\7\7\2\2kl\7\27\2\2lm\7\t\2\2m\21\3"+
		"\2\2\2no\t\5\2\2o\23\3\2\2\2pq\t\6\2\2q\25\3\2\2\2\f+-\64>@LNQ_e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}