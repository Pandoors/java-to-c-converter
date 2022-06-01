// Generated from /Users/bartosz/IdeaProjects/java-to-c-converter/src/antlr/JavaGr.g4 by ANTLR 4.10.1
package visitor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, STRING_VAL=2, CHAR_VAL=3, INT_VAL=4, FLOAT_VAL=5, DOUBLE_VAL=6, 
		DO_=7, FLOAT=8, INT=9, DOUBLE=10, STRING=11, CHAR=12, BOOL=13, PUBLIC=14, 
		CLASS=15, TRUE=16, FALSE=17, EQUAL=18, NOT_EQUAL=19, GREATER=20, LESS=21, 
		GREATER_EQUAL=22, LESS_EQUAL=23, BRACKET_L=24, BRACKET_R=25, SQ_BRACKET_L=26, 
		SQ_BRACKET_R=27, PARENT_L=28, PARENT_R=29, ADD=30, SUBTRACT=31, MULTIPLY=32, 
		DIVIDE=33, MODULO=34, COMMENT=35, IF=36, ELSE=37, FOR=38, WHILE=39, SEMICOLON=40, 
		COMMA=41, IMPORT=42, PACKAGE=43, RETURN=44, PRIVATE_NEW_VAR=45, PROTECTED_NEW_VAR=46, 
		STATIC_VAR=47, OR=48, AND=49, VOID=50, IDENTIFIER=51, WS=52;
	public static final int
		RULE_prog = 0, RULE_numeric_type = 1, RULE_text_type = 2, RULE_datatype = 3, 
		RULE_bool_val = 4, RULE_num_val = 5, RULE_declaration_var = 6, RULE_input_vars = 7, 
		RULE_function_in = 8, RULE_function_to_ret = 9, RULE_return_statement = 10, 
		RULE_elif_statement = 11, RULE_instruction = 12, RULE_instruction_general = 13, 
		RULE_function_body = 14, RULE_function = 15, RULE_class = 16, RULE_math_symbol = 17, 
		RULE_add_equals = 18, RULE_subtract_equals = 19, RULE_multiply_equals = 20, 
		RULE_divide_equals = 21, RULE_modulo_equals = 22, RULE_math_modification = 23, 
		RULE_math_expr = 24, RULE_declaration = 25, RULE_assignment = 26, RULE_add_double = 27, 
		RULE_subtract_double = 28, RULE_modification = 29, RULE_comparator = 30, 
		RULE_comparison = 31, RULE_logic_statement = 32, RULE_logic_operator = 33, 
		RULE_logic_condition = 34, RULE_if_statement = 35, RULE_while_loop = 36, 
		RULE_do_while_loop = 37, RULE_for_loop = 38, RULE_package = 39, RULE_import_op = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "numeric_type", "text_type", "datatype", "bool_val", "num_val", 
			"declaration_var", "input_vars", "function_in", "function_to_ret", "return_statement", 
			"elif_statement", "instruction", "instruction_general", "function_body", 
			"function", "class", "math_symbol", "add_equals", "subtract_equals", 
			"multiply_equals", "divide_equals", "modulo_equals", "math_modification", 
			"math_expr", "declaration", "assignment", "add_double", "subtract_double", 
			"modification", "comparator", "comparison", "logic_statement", "logic_operator", 
			"logic_condition", "if_statement", "while_loop", "do_while_loop", "for_loop", 
			"package", "import_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'do'", "'float'", "'int'", 
			"'double'", "'string'", "'char'", "'boolean'", "'public'", "'class'", 
			"'true'", "'false'", "'='", "'!='", "'>'", "'<'", "'>='", "'<='", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			null, "'if'", "'else'", "'for'", "'while'", "';'", "','", "'import'", 
			"'package'", "'return'", "'private'", "'protected'", "'static'", "'||'", 
			"'&&'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "STRING_VAL", "CHAR_VAL", "INT_VAL", "FLOAT_VAL", "DOUBLE_VAL", 
			"DO_", "FLOAT", "INT", "DOUBLE", "STRING", "CHAR", "BOOL", "PUBLIC", 
			"CLASS", "TRUE", "FALSE", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "GREATER_EQUAL", 
			"LESS_EQUAL", "BRACKET_L", "BRACKET_R", "SQ_BRACKET_L", "SQ_BRACKET_R", 
			"PARENT_L", "PARENT_R", "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "MODULO", 
			"COMMENT", "IF", "ELSE", "FOR", "WHILE", "SEMICOLON", "COMMA", "IMPORT", 
			"PACKAGE", "RETURN", "PRIVATE_NEW_VAR", "PROTECTED_NEW_VAR", "STATIC_VAR", 
			"OR", "AND", "VOID", "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "JavaGr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaGrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public PackageContext package_() {
			return getRuleContext(PackageContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public List<Import_opContext> import_op() {
			return getRuleContexts(Import_opContext.class);
		}
		public Import_opContext import_op(int i) {
			return getRuleContext(Import_opContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitProg(this);
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
			setState(82);
			package_();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(83);
				import_op();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			class_();
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

	public static class Numeric_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaGrParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JavaGrParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaGrParser.DOUBLE, 0); }
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitNumeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_numeric_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << DOUBLE))) != 0)) ) {
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

	public static class Text_typeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(JavaGrParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(JavaGrParser.STRING, 0); }
		public Text_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitText_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_typeContext text_type() throws RecognitionException {
		Text_typeContext _localctx = new Text_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==CHAR) ) {
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

	public static class DatatypeContext extends ParserRuleContext {
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public Text_typeContext text_type() {
			return getRuleContext(Text_typeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(JavaGrParser.BOOL, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_datatype);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				numeric_type();
				}
				break;
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				text_type();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(BOOL);
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

	public static class Bool_valContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(JavaGrParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JavaGrParser.FALSE, 0); }
		public Bool_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_val; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitBool_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valContext bool_val() throws RecognitionException {
		Bool_valContext _localctx = new Bool_valContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class Num_valContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(JavaGrParser.INT_VAL, 0); }
		public TerminalNode DOUBLE_VAL() { return getToken(JavaGrParser.DOUBLE_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(JavaGrParser.FLOAT_VAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public Num_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_val; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitNum_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_valContext num_val() throws RecognitionException {
		Num_valContext _localctx = new Num_valContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_num_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_VAL) | (1L << FLOAT_VAL) | (1L << DOUBLE_VAL) | (1L << IDENTIFIER))) != 0)) ) {
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

	public static class Declaration_varContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaGrParser.SEMICOLON, 0); }
		public TerminalNode PUBLIC() { return getToken(JavaGrParser.PUBLIC, 0); }
		public TerminalNode PRIVATE_NEW_VAR() { return getToken(JavaGrParser.PRIVATE_NEW_VAR, 0); }
		public TerminalNode PROTECTED_NEW_VAR() { return getToken(JavaGrParser.PROTECTED_NEW_VAR, 0); }
		public TerminalNode STATIC_VAR() { return getToken(JavaGrParser.STATIC_VAR, 0); }
		public Declaration_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitDeclaration_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_varContext declaration_var() throws RecognitionException {
		Declaration_varContext _localctx = new Declaration_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE_NEW_VAR) | (1L << PROTECTED_NEW_VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC_VAR) {
				{
				setState(105);
				match(STATIC_VAR);
				}
			}

			setState(108);
			datatype();
			setState(109);
			match(IDENTIFIER);
			setState(110);
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

	public static class Input_varsContext extends ParserRuleContext {
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaGrParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaGrParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaGrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaGrParser.COMMA, i);
		}
		public Input_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_vars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitInput_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_varsContext input_vars() throws RecognitionException {
		Input_varsContext _localctx = new Input_varsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_input_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			datatype();
			setState(113);
			match(IDENTIFIER);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				setState(115);
				datatype();
				setState(116);
				match(IDENTIFIER);
				}
				}
				setState(122);
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

	public static class Function_inContext extends ParserRuleContext {
		public TerminalNode BRACKET_L() { return getToken(JavaGrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(JavaGrParser.BRACKET_R, 0); }
		public Input_varsContext input_vars() {
			return getRuleContext(Input_varsContext.class,0);
		}
		public Function_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_in; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitFunction_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_inContext function_in() throws RecognitionException {
		Function_inContext _localctx = new Function_inContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(BRACKET_L);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOL))) != 0)) {
				{
				setState(124);
				input_vars();
				}
			}

			setState(127);
			match(BRACKET_R);
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

	public static class Function_to_retContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public Function_inContext function_in() {
			return getRuleContext(Function_inContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaGrParser.PUBLIC, 0); }
		public TerminalNode PRIVATE_NEW_VAR() { return getToken(JavaGrParser.PRIVATE_NEW_VAR, 0); }
		public TerminalNode PROTECTED_NEW_VAR() { return getToken(JavaGrParser.PROTECTED_NEW_VAR, 0); }
		public TerminalNode STATIC_VAR() { return getToken(JavaGrParser.STATIC_VAR, 0); }
		public Function_to_retContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_to_ret; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitFunction_to_ret(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_to_retContext function_to_ret() throws RecognitionException {
		Function_to_retContext _localctx = new Function_to_retContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_to_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE_NEW_VAR) | (1L << PROTECTED_NEW_VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC_VAR) {
				{
				setState(130);
				match(STATIC_VAR);
				}
			}

			setState(133);
			datatype();
			setState(134);
			match(IDENTIFIER);
			setState(135);
			function_in();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaGrParser.RETURN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public Bool_valContext bool_val() {
			return getRuleContext(Bool_valContext.class,0);
		}
		public TerminalNode CHAR_VAL() { return getToken(JavaGrParser.CHAR_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(JavaGrParser.STRING_VAL, 0); }
		public Function_to_retContext function_to_ret() {
			return getRuleContext(Function_to_retContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(RETURN);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(138);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(139);
				math_expr(0);
				}
				break;
			case 3:
				{
				setState(140);
				bool_val();
				}
				break;
			case 4:
				{
				setState(141);
				match(CHAR_VAL);
				}
				break;
			case 5:
				{
				setState(142);
				match(STRING_VAL);
				}
				break;
			case 6:
				{
				setState(143);
				function_to_ret();
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

	public static class Elif_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(JavaGrParser.ELSE, 0); }
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitElif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			if_statement();
			setState(147);
			match(ELSE);
			setState(148);
			elif_statement();
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

	public static class InstructionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaGrParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ModificationContext modification() {
			return getRuleContext(ModificationContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instruction);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				declaration();
				setState(151);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				assignment();
				setState(154);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				modification();
				setState(157);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				elif_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				while_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				do_while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(163);
				for_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(164);
				return_statement();
				setState(165);
				match(SEMICOLON);
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

	public static class Instruction_generalContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(JavaGrParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(JavaGrParser.COMMENT, i);
		}
		public Instruction_generalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_general; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitInstruction_general(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_generalContext instruction_general() throws RecognitionException {
		Instruction_generalContext _localctx = new Instruction_generalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instruction_general);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DO_) | (1L << FLOAT) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOL) | (1L << COMMENT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DO_:
				case FLOAT:
				case INT:
				case DOUBLE:
				case STRING:
				case CHAR:
				case BOOL:
				case IF:
				case FOR:
				case WHILE:
				case RETURN:
				case IDENTIFIER:
					{
					setState(169);
					instruction();
					}
					break;
				case COMMENT:
					{
					setState(170);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(175);
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

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode PARENT_L() { return getToken(JavaGrParser.PARENT_L, 0); }
		public Instruction_generalContext instruction_general() {
			return getRuleContext(Instruction_generalContext.class,0);
		}
		public TerminalNode PARENT_R() { return getToken(JavaGrParser.PARENT_R, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(PARENT_L);
			setState(177);
			instruction_general();
			setState(178);
			match(PARENT_R);
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
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public Function_inContext function_in() {
			return getRuleContext(Function_inContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaGrParser.PUBLIC, 0); }
		public TerminalNode PRIVATE_NEW_VAR() { return getToken(JavaGrParser.PRIVATE_NEW_VAR, 0); }
		public TerminalNode PROTECTED_NEW_VAR() { return getToken(JavaGrParser.PROTECTED_NEW_VAR, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaGrParser.VOID, 0); }
		public TerminalNode STATIC_VAR() { return getToken(JavaGrParser.STATIC_VAR, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE_NEW_VAR) | (1L << PROTECTED_NEW_VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC_VAR) {
				{
				setState(181);
				match(STATIC_VAR);
				}
			}

			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case DOUBLE:
			case STRING:
			case CHAR:
			case BOOL:
				{
				setState(184);
				datatype();
				}
				break;
			case VOID:
				{
				setState(185);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(188);
			match(IDENTIFIER);
			setState(189);
			function_in();
			setState(190);
			function_body();
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

	public static class ClassContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaGrParser.PUBLIC, 0); }
		public TerminalNode CLASS() { return getToken(JavaGrParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public TerminalNode PARENT_L() { return getToken(JavaGrParser.PARENT_L, 0); }
		public TerminalNode PARENT_R() { return getToken(JavaGrParser.PARENT_R, 0); }
		public List<Declaration_varContext> declaration_var() {
			return getRuleContexts(Declaration_varContext.class);
		}
		public Declaration_varContext declaration_var(int i) {
			return getRuleContext(Declaration_varContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(PUBLIC);
			setState(193);
			match(CLASS);
			setState(194);
			match(IDENTIFIER);
			setState(195);
			match(PARENT_L);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE_NEW_VAR) | (1L << PROTECTED_NEW_VAR))) != 0)) {
				{
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(196);
					declaration_var();
					}
					break;
				case 2:
					{
					setState(197);
					function();
					}
					break;
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(PARENT_R);
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

	public static class Math_symbolContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(JavaGrParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(JavaGrParser.SUBTRACT, 0); }
		public TerminalNode MULTIPLY() { return getToken(JavaGrParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(JavaGrParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(JavaGrParser.MODULO, 0); }
		public Math_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_symbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitMath_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_symbolContext math_symbol() throws RecognitionException {
		Math_symbolContext _localctx = new Math_symbolContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_math_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
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

	public static class Add_equalsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(JavaGrParser.ADD, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Add_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitAdd_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_equalsContext add_equals() throws RecognitionException {
		Add_equalsContext _localctx = new Add_equalsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_add_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(ADD);
			setState(208);
			match(EQUAL);
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

	public static class Subtract_equalsContext extends ParserRuleContext {
		public TerminalNode SUBTRACT() { return getToken(JavaGrParser.SUBTRACT, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Subtract_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtract_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitSubtract_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subtract_equalsContext subtract_equals() throws RecognitionException {
		Subtract_equalsContext _localctx = new Subtract_equalsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_subtract_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(SUBTRACT);
			setState(211);
			match(EQUAL);
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

	public static class Multiply_equalsContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(JavaGrParser.MULTIPLY, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Multiply_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitMultiply_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiply_equalsContext multiply_equals() throws RecognitionException {
		Multiply_equalsContext _localctx = new Multiply_equalsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiply_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(MULTIPLY);
			setState(214);
			match(EQUAL);
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

	public static class Divide_equalsContext extends ParserRuleContext {
		public TerminalNode DIVIDE() { return getToken(JavaGrParser.DIVIDE, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Divide_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitDivide_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Divide_equalsContext divide_equals() throws RecognitionException {
		Divide_equalsContext _localctx = new Divide_equalsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_divide_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(DIVIDE);
			setState(217);
			match(EQUAL);
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

	public static class Modulo_equalsContext extends ParserRuleContext {
		public TerminalNode MODULO() { return getToken(JavaGrParser.MODULO, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Modulo_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo_equals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitModulo_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modulo_equalsContext modulo_equals() throws RecognitionException {
		Modulo_equalsContext _localctx = new Modulo_equalsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modulo_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(MODULO);
			setState(220);
			match(EQUAL);
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

	public static class Math_modificationContext extends ParserRuleContext {
		public Add_equalsContext add_equals() {
			return getRuleContext(Add_equalsContext.class,0);
		}
		public Subtract_equalsContext subtract_equals() {
			return getRuleContext(Subtract_equalsContext.class,0);
		}
		public Multiply_equalsContext multiply_equals() {
			return getRuleContext(Multiply_equalsContext.class,0);
		}
		public Divide_equalsContext divide_equals() {
			return getRuleContext(Divide_equalsContext.class,0);
		}
		public Modulo_equalsContext modulo_equals() {
			return getRuleContext(Modulo_equalsContext.class,0);
		}
		public Math_modificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_modification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitMath_modification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_modificationContext math_modification() throws RecognitionException {
		Math_modificationContext _localctx = new Math_modificationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_math_modification);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				add_equals();
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				subtract_equals();
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				multiply_equals();
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				divide_equals();
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				modulo_equals();
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

	public static class Math_exprContext extends ParserRuleContext {
		public Num_valContext num_val() {
			return getRuleContext(Num_valContext.class,0);
		}
		public TerminalNode BRACKET_L() { return getToken(JavaGrParser.BRACKET_L, 0); }
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public TerminalNode BRACKET_R() { return getToken(JavaGrParser.BRACKET_R, 0); }
		public Math_symbolContext math_symbol() {
			return getRuleContext(Math_symbolContext.class,0);
		}
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		return math_expr(0);
	}

	private Math_exprContext math_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_exprContext _localctx = new Math_exprContext(_ctx, _parentState);
		Math_exprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_math_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
			case FLOAT_VAL:
			case DOUBLE_VAL:
			case IDENTIFIER:
				{
				setState(230);
				num_val();
				}
				break;
			case BRACKET_L:
				{
				setState(231);
				match(BRACKET_L);
				setState(232);
				math_expr(0);
				setState(233);
				match(BRACKET_R);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Math_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
					setState(237);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(238);
					math_symbol();
					setState(239);
					math_expr(4);
					}
					} 
				}
				setState(245);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaGrParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaGrParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaGrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaGrParser.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			datatype();
			setState(247);
			match(IDENTIFIER);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(248);
				match(COMMA);
				setState(249);
				match(IDENTIFIER);
				}
				}
				setState(254);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(JavaGrParser.CHAR, 0); }
		public TerminalNode CHAR_VAL() { return getToken(JavaGrParser.CHAR_VAL, 0); }
		public TerminalNode STRING() { return getToken(JavaGrParser.STRING, 0); }
		public TerminalNode STRING_VAL() { return getToken(JavaGrParser.STRING_VAL, 0); }
		public TerminalNode BOOL() { return getToken(JavaGrParser.BOOL, 0); }
		public Bool_valContext bool_val() {
			return getRuleContext(Bool_valContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				numeric_type();
				setState(256);
				match(IDENTIFIER);
				setState(257);
				match(EQUAL);
				setState(258);
				math_expr(0);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(CHAR);
				setState(261);
				match(IDENTIFIER);
				setState(262);
				match(EQUAL);
				setState(263);
				match(CHAR_VAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(STRING);
				setState(265);
				match(IDENTIFIER);
				setState(266);
				match(EQUAL);
				setState(267);
				match(STRING_VAL);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(BOOL);
				setState(269);
				match(IDENTIFIER);
				setState(270);
				match(EQUAL);
				setState(271);
				bool_val();
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

	public static class Add_doubleContext extends ParserRuleContext {
		public List<TerminalNode> ADD() { return getTokens(JavaGrParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JavaGrParser.ADD, i);
		}
		public Add_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_double; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitAdd_double(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_doubleContext add_double() throws RecognitionException {
		Add_doubleContext _localctx = new Add_doubleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_add_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(ADD);
			setState(275);
			match(ADD);
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

	public static class Subtract_doubleContext extends ParserRuleContext {
		public List<TerminalNode> SUBTRACT() { return getTokens(JavaGrParser.SUBTRACT); }
		public TerminalNode SUBTRACT(int i) {
			return getToken(JavaGrParser.SUBTRACT, i);
		}
		public Subtract_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtract_double; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitSubtract_double(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subtract_doubleContext subtract_double() throws RecognitionException {
		Subtract_doubleContext _localctx = new Subtract_doubleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subtract_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(SUBTRACT);
			setState(278);
			match(SUBTRACT);
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

	public static class ModificationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public Math_modificationContext math_modification() {
			return getRuleContext(Math_modificationContext.class,0);
		}
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public Add_doubleContext add_double() {
			return getRuleContext(Add_doubleContext.class,0);
		}
		public Subtract_doubleContext subtract_double() {
			return getRuleContext(Subtract_doubleContext.class,0);
		}
		public ModificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitModification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModificationContext modification() throws RecognitionException {
		ModificationContext _localctx = new ModificationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_modification);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(IDENTIFIER);
				setState(281);
				math_modification();
				setState(282);
				math_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(IDENTIFIER);
				setState(285);
				add_double();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(IDENTIFIER);
				setState(287);
				subtract_double();
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(JavaGrParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(JavaGrParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(JavaGrParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(JavaGrParser.LESS, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(JavaGrParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(JavaGrParser.LESS_EQUAL, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) ) {
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<Num_valContext> num_val() {
			return getRuleContexts(Num_valContext.class);
		}
		public Num_valContext num_val(int i) {
			return getRuleContext(Num_valContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			num_val();
			setState(293);
			comparator();
			setState(294);
			num_val();
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

	public static class Logic_statementContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Bool_valContext bool_val() {
			return getRuleContext(Bool_valContext.class,0);
		}
		public Logic_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitLogic_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_statementContext logic_statement() throws RecognitionException {
		Logic_statementContext _localctx = new Logic_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_logic_statement);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
			case FLOAT_VAL:
			case DOUBLE_VAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				comparison();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				bool_val();
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

	public static class Logic_operatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(JavaGrParser.OR, 0); }
		public TerminalNode AND() { return getToken(JavaGrParser.AND, 0); }
		public Logic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitLogic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operatorContext logic_operator() throws RecognitionException {
		Logic_operatorContext _localctx = new Logic_operatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_logic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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

	public static class Logic_conditionContext extends ParserRuleContext {
		public TerminalNode BRACKET_L() { return getToken(JavaGrParser.BRACKET_L, 0); }
		public List<Logic_statementContext> logic_statement() {
			return getRuleContexts(Logic_statementContext.class);
		}
		public Logic_statementContext logic_statement(int i) {
			return getRuleContext(Logic_statementContext.class,i);
		}
		public TerminalNode BRACKET_R() { return getToken(JavaGrParser.BRACKET_R, 0); }
		public List<Logic_operatorContext> logic_operator() {
			return getRuleContexts(Logic_operatorContext.class);
		}
		public Logic_operatorContext logic_operator(int i) {
			return getRuleContext(Logic_operatorContext.class,i);
		}
		public Logic_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitLogic_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_conditionContext logic_condition() throws RecognitionException {
		Logic_conditionContext _localctx = new Logic_conditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logic_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(BRACKET_L);
			setState(303);
			logic_statement();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(304);
				logic_operator();
				setState(305);
				logic_statement();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			match(BRACKET_R);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaGrParser.IF, 0); }
		public Logic_conditionContext logic_condition() {
			return getRuleContext(Logic_conditionContext.class,0);
		}
		public TerminalNode PARENT_L() { return getToken(JavaGrParser.PARENT_L, 0); }
		public Instruction_generalContext instruction_general() {
			return getRuleContext(Instruction_generalContext.class,0);
		}
		public TerminalNode PARENT_R() { return getToken(JavaGrParser.PARENT_R, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(IF);
			setState(315);
			logic_condition();
			setState(316);
			match(PARENT_L);
			setState(317);
			instruction_general();
			setState(318);
			match(PARENT_R);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaGrParser.WHILE, 0); }
		public Logic_conditionContext logic_condition() {
			return getRuleContext(Logic_conditionContext.class,0);
		}
		public TerminalNode PARENT_L() { return getToken(JavaGrParser.PARENT_L, 0); }
		public Instruction_generalContext instruction_general() {
			return getRuleContext(Instruction_generalContext.class,0);
		}
		public TerminalNode PARENT_R() { return getToken(JavaGrParser.PARENT_R, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(WHILE);
			setState(321);
			logic_condition();
			setState(322);
			match(PARENT_L);
			setState(323);
			instruction_general();
			setState(324);
			match(PARENT_R);
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

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode DO_() { return getToken(JavaGrParser.DO_, 0); }
		public TerminalNode PARENT_L() { return getToken(JavaGrParser.PARENT_L, 0); }
		public Instruction_generalContext instruction_general() {
			return getRuleContext(Instruction_generalContext.class,0);
		}
		public TerminalNode PARENT_R() { return getToken(JavaGrParser.PARENT_R, 0); }
		public TerminalNode WHILE() { return getToken(JavaGrParser.WHILE, 0); }
		public Logic_conditionContext logic_condition() {
			return getRuleContext(Logic_conditionContext.class,0);
		}
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitDo_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(DO_);
			setState(327);
			match(PARENT_L);
			setState(328);
			instruction_general();
			setState(329);
			match(PARENT_R);
			setState(330);
			match(WHILE);
			setState(331);
			logic_condition();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaGrParser.FOR, 0); }
		public TerminalNode BRACKET_L() { return getToken(JavaGrParser.BRACKET_L, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(JavaGrParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JavaGrParser.SEMICOLON, i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ModificationContext modification() {
			return getRuleContext(ModificationContext.class,0);
		}
		public TerminalNode BRACKET_R() { return getToken(JavaGrParser.BRACKET_R, 0); }
		public TerminalNode PARENT_L() { return getToken(JavaGrParser.PARENT_L, 0); }
		public Instruction_generalContext instruction_general() {
			return getRuleContext(Instruction_generalContext.class,0);
		}
		public TerminalNode PARENT_R() { return getToken(JavaGrParser.PARENT_R, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(FOR);
			setState(334);
			match(BRACKET_L);
			setState(335);
			assignment();
			setState(336);
			match(SEMICOLON);
			setState(337);
			comparison();
			setState(338);
			match(SEMICOLON);
			setState(339);
			modification();
			setState(340);
			match(BRACKET_R);
			setState(341);
			match(PARENT_L);
			setState(342);
			instruction_general();
			setState(343);
			match(PARENT_R);
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

	public static class PackageContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaGrParser.PACKAGE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaGrParser.SEMICOLON, 0); }
		public PackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageContext package_() throws RecognitionException {
		PackageContext _localctx = new PackageContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(PACKAGE);
			setState(346);
			match(IDENTIFIER);
			setState(347);
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

	public static class Import_opContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaGrParser.IMPORT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaGrParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaGrParser.SEMICOLON, 0); }
		public Import_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrVisitor ) return ((JavaGrVisitor<? extends T>)visitor).visitImport_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_opContext import_op() throws RecognitionException {
		Import_opContext _localctx = new Import_opContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_import_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(IMPORT);
			setState(350);
			match(IDENTIFIER);
			setState(351);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return math_expr_sempred((Math_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_expr_sempred(Math_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0001\u0000\u0005\u0000U\b\u0000\n\u0000\f\u0000"+
		"X\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003c\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006k\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007w\b\u0007\n\u0007\f\u0007z\t\u0007\u0001\b\u0001\b\u0003\b"+
		"~\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u0084\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0091\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a8"+
		"\b\f\u0001\r\u0001\r\u0005\r\u00ac\b\r\n\r\f\r\u00af\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00b7"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00bb\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00c7\b\u0010\n\u0010"+
		"\f\u0010\u00ca\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00e4\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00ec\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00f2\b\u0018"+
		"\n\u0018\f\u0018\u00f5\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u00fb\b\u0019\n\u0019\f\u0019\u00fe\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0111\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0121\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 "+
		"\u012b\b \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u0134\b\"\n\"\f\"\u0137\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0000\u00010)\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNP\u0000\b\u0001\u0000\b\n\u0001\u0000\u000b\f"+
		"\u0001\u0000\u0010\u0011\u0002\u0000\u0004\u000633\u0002\u0000\u000e\u000e"+
		"-.\u0001\u0000\u001e\"\u0001\u0000\u0012\u0017\u0001\u000001\u0161\u0000"+
		"R\u0001\u0000\u0000\u0000\u0002[\u0001\u0000\u0000\u0000\u0004]\u0001"+
		"\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000"+
		"\u0000\nf\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000\u0000\u000ep\u0001"+
		"\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000"+
		"\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u0092\u0001\u0000"+
		"\u0000\u0000\u0018\u00a7\u0001\u0000\u0000\u0000\u001a\u00ad\u0001\u0000"+
		"\u0000\u0000\u001c\u00b0\u0001\u0000\u0000\u0000\u001e\u00b4\u0001\u0000"+
		"\u0000\u0000 \u00c0\u0001\u0000\u0000\u0000\"\u00cd\u0001\u0000\u0000"+
		"\u0000$\u00cf\u0001\u0000\u0000\u0000&\u00d2\u0001\u0000\u0000\u0000("+
		"\u00d5\u0001\u0000\u0000\u0000*\u00d8\u0001\u0000\u0000\u0000,\u00db\u0001"+
		"\u0000\u0000\u0000.\u00e3\u0001\u0000\u0000\u00000\u00eb\u0001\u0000\u0000"+
		"\u00002\u00f6\u0001\u0000\u0000\u00004\u0110\u0001\u0000\u0000\u00006"+
		"\u0112\u0001\u0000\u0000\u00008\u0115\u0001\u0000\u0000\u0000:\u0120\u0001"+
		"\u0000\u0000\u0000<\u0122\u0001\u0000\u0000\u0000>\u0124\u0001\u0000\u0000"+
		"\u0000@\u012a\u0001\u0000\u0000\u0000B\u012c\u0001\u0000\u0000\u0000D"+
		"\u012e\u0001\u0000\u0000\u0000F\u013a\u0001\u0000\u0000\u0000H\u0140\u0001"+
		"\u0000\u0000\u0000J\u0146\u0001\u0000\u0000\u0000L\u014d\u0001\u0000\u0000"+
		"\u0000N\u0159\u0001\u0000\u0000\u0000P\u015d\u0001\u0000\u0000\u0000R"+
		"V\u0003N\'\u0000SU\u0003P(\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0003 \u0010\u0000Z\u0001"+
		"\u0001\u0000\u0000\u0000[\\\u0007\u0000\u0000\u0000\\\u0003\u0001\u0000"+
		"\u0000\u0000]^\u0007\u0001\u0000\u0000^\u0005\u0001\u0000\u0000\u0000"+
		"_c\u0003\u0002\u0001\u0000`c\u0003\u0004\u0002\u0000ac\u0005\r\u0000\u0000"+
		"b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000c\u0007\u0001\u0000\u0000\u0000de\u0007\u0002\u0000\u0000e\t\u0001"+
		"\u0000\u0000\u0000fg\u0007\u0003\u0000\u0000g\u000b\u0001\u0000\u0000"+
		"\u0000hj\u0007\u0004\u0000\u0000ik\u0005/\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0003\u0006"+
		"\u0003\u0000mn\u00053\u0000\u0000no\u0005(\u0000\u0000o\r\u0001\u0000"+
		"\u0000\u0000pq\u0003\u0006\u0003\u0000qx\u00053\u0000\u0000rs\u0005)\u0000"+
		"\u0000st\u0003\u0006\u0003\u0000tu\u00053\u0000\u0000uw\u0001\u0000\u0000"+
		"\u0000vr\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\u000f\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000{}\u0005\u0018\u0000\u0000|~\u0003\u000e\u0007"+
		"\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\u0019\u0000\u0000\u0080\u0011\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0007\u0004\u0000\u0000\u0082\u0084\u0005"+
		"/\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u0006"+
		"\u0003\u0000\u0086\u0087\u00053\u0000\u0000\u0087\u0088\u0003\u0010\b"+
		"\u0000\u0088\u0013\u0001\u0000\u0000\u0000\u0089\u0090\u0005,\u0000\u0000"+
		"\u008a\u0091\u00053\u0000\u0000\u008b\u0091\u00030\u0018\u0000\u008c\u0091"+
		"\u0003\b\u0004\u0000\u008d\u0091\u0005\u0003\u0000\u0000\u008e\u0091\u0005"+
		"\u0002\u0000\u0000\u008f\u0091\u0003\u0012\t\u0000\u0090\u008a\u0001\u0000"+
		"\u0000\u0000\u0090\u008b\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000"+
		"\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0015\u0001\u0000\u0000\u0000\u0092\u0093\u0003F#\u0000"+
		"\u0093\u0094\u0005%\u0000\u0000\u0094\u0095\u0003\u0016\u000b\u0000\u0095"+
		"\u0017\u0001\u0000\u0000\u0000\u0096\u0097\u00032\u0019\u0000\u0097\u0098"+
		"\u0005(\u0000\u0000\u0098\u00a8\u0001\u0000\u0000\u0000\u0099\u009a\u0003"+
		"4\u001a\u0000\u009a\u009b\u0005(\u0000\u0000\u009b\u00a8\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0003:\u001d\u0000\u009d\u009e\u0005(\u0000\u0000\u009e"+
		"\u00a8\u0001\u0000\u0000\u0000\u009f\u00a8\u0003F#\u0000\u00a0\u00a8\u0003"+
		"\u0016\u000b\u0000\u00a1\u00a8\u0003H$\u0000\u00a2\u00a8\u0003J%\u0000"+
		"\u00a3\u00a8\u0003L&\u0000\u00a4\u00a5\u0003\u0014\n\u0000\u00a5\u00a6"+
		"\u0005(\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u0096\u0001"+
		"\u0000\u0000\u0000\u00a7\u0099\u0001\u0000\u0000\u0000\u00a7\u009c\u0001"+
		"\u0000\u0000\u0000\u00a7\u009f\u0001\u0000\u0000\u0000\u00a7\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a8\u0019\u0001\u0000\u0000\u0000\u00a9\u00ac\u0003"+
		"\u0018\f\u0000\u00aa\u00ac\u0005#\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u001b\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\u001c\u0000\u0000\u00b1\u00b2\u0003\u001a"+
		"\r\u0000\u00b2\u00b3\u0005\u001d\u0000\u0000\u00b3\u001d\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b6\u0007\u0004\u0000\u0000\u00b5\u00b7\u0005/\u0000\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00bb\u0003\u0006\u0003\u0000"+
		"\u00b9\u00bb\u00052\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u00053\u0000\u0000\u00bd\u00be\u0003\u0010\b\u0000\u00be\u00bf"+
		"\u0003\u001c\u000e\u0000\u00bf\u001f\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\u000e\u0000\u0000\u00c1\u00c2\u0005\u000f\u0000\u0000\u00c2\u00c3"+
		"\u00053\u0000\u0000\u00c3\u00c8\u0005\u001c\u0000\u0000\u00c4\u00c7\u0003"+
		"\f\u0006\u0000\u00c5\u00c7\u0003\u001e\u000f\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0005\u001d\u0000\u0000\u00cc!\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0007\u0005\u0000\u0000\u00ce#\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0005\u001e\u0000\u0000\u00d0\u00d1\u0005\u0012\u0000\u0000"+
		"\u00d1%\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001f\u0000\u0000\u00d3"+
		"\u00d4\u0005\u0012\u0000\u0000\u00d4\'\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005 \u0000\u0000\u00d6\u00d7\u0005\u0012\u0000\u0000\u00d7)\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005!\u0000\u0000\u00d9\u00da\u0005\u0012\u0000"+
		"\u0000\u00da+\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\"\u0000\u0000"+
		"\u00dc\u00dd\u0005\u0012\u0000\u0000\u00dd-\u0001\u0000\u0000\u0000\u00de"+
		"\u00e4\u0003$\u0012\u0000\u00df\u00e4\u0003&\u0013\u0000\u00e0\u00e4\u0003"+
		"(\u0014\u0000\u00e1\u00e4\u0003*\u0015\u0000\u00e2\u00e4\u0003,\u0016"+
		"\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e3\u00df\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4/\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0006\u0018\uffff\uffff\u0000\u00e6\u00ec\u0003\n\u0005\u0000"+
		"\u00e7\u00e8\u0005\u0018\u0000\u0000\u00e8\u00e9\u00030\u0018\u0000\u00e9"+
		"\u00ea\u0005\u0019\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e5\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00ec"+
		"\u00f3\u0001\u0000\u0000\u0000\u00ed\u00ee\n\u0003\u0000\u0000\u00ee\u00ef"+
		"\u0003\"\u0011\u0000\u00ef\u00f0\u00030\u0018\u0004\u00f0\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f41\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0003\u0006\u0003\u0000\u00f7\u00fc\u00053\u0000"+
		"\u0000\u00f8\u00f9\u0005)\u0000\u0000\u00f9\u00fb\u00053\u0000\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"3\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0003\u0002\u0001\u0000\u0100\u0101\u00053\u0000\u0000\u0101\u0102\u0005"+
		"\u0012\u0000\u0000\u0102\u0103\u00030\u0018\u0000\u0103\u0111\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005\f\u0000\u0000\u0105\u0106\u00053\u0000"+
		"\u0000\u0106\u0107\u0005\u0012\u0000\u0000\u0107\u0111\u0005\u0003\u0000"+
		"\u0000\u0108\u0109\u0005\u000b\u0000\u0000\u0109\u010a\u00053\u0000\u0000"+
		"\u010a\u010b\u0005\u0012\u0000\u0000\u010b\u0111\u0005\u0002\u0000\u0000"+
		"\u010c\u010d\u0005\r\u0000\u0000\u010d\u010e\u00053\u0000\u0000\u010e"+
		"\u010f\u0005\u0012\u0000\u0000\u010f\u0111\u0003\b\u0004\u0000\u0110\u00ff"+
		"\u0001\u0000\u0000\u0000\u0110\u0104\u0001\u0000\u0000\u0000\u0110\u0108"+
		"\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u01115\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0005\u001e\u0000\u0000\u0113\u0114\u0005"+
		"\u001e\u0000\u0000\u01147\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u001f"+
		"\u0000\u0000\u0116\u0117\u0005\u001f\u0000\u0000\u01179\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u00053\u0000\u0000\u0119\u011a\u0003.\u0017\u0000\u011a"+
		"\u011b\u00030\u0018\u0000\u011b\u0121\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u00053\u0000\u0000\u011d\u0121\u00036\u001b\u0000\u011e\u011f\u00053"+
		"\u0000\u0000\u011f\u0121\u00038\u001c\u0000\u0120\u0118\u0001\u0000\u0000"+
		"\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0121;\u0001\u0000\u0000\u0000\u0122\u0123\u0007\u0006\u0000\u0000"+
		"\u0123=\u0001\u0000\u0000\u0000\u0124\u0125\u0003\n\u0005\u0000\u0125"+
		"\u0126\u0003<\u001e\u0000\u0126\u0127\u0003\n\u0005\u0000\u0127?\u0001"+
		"\u0000\u0000\u0000\u0128\u012b\u0003>\u001f\u0000\u0129\u012b\u0003\b"+
		"\u0004\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000"+
		"\u0000\u0000\u012bA\u0001\u0000\u0000\u0000\u012c\u012d\u0007\u0007\u0000"+
		"\u0000\u012dC\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0018\u0000\u0000"+
		"\u012f\u0135\u0003@ \u0000\u0130\u0131\u0003B!\u0000\u0131\u0132\u0003"+
		"@ \u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000\u0000"+
		"\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000"+
		"\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u0019\u0000"+
		"\u0000\u0139E\u0001\u0000\u0000\u0000\u013a\u013b\u0005$\u0000\u0000\u013b"+
		"\u013c\u0003D\"\u0000\u013c\u013d\u0005\u001c\u0000\u0000\u013d\u013e"+
		"\u0003\u001a\r\u0000\u013e\u013f\u0005\u001d\u0000\u0000\u013fG\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0005\'\u0000\u0000\u0141\u0142\u0003D"+
		"\"\u0000\u0142\u0143\u0005\u001c\u0000\u0000\u0143\u0144\u0003\u001a\r"+
		"\u0000\u0144\u0145\u0005\u001d\u0000\u0000\u0145I\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0005\u0007\u0000\u0000\u0147\u0148\u0005\u001c\u0000\u0000"+
		"\u0148\u0149\u0003\u001a\r\u0000\u0149\u014a\u0005\u001d\u0000\u0000\u014a"+
		"\u014b\u0005\'\u0000\u0000\u014b\u014c\u0003D\"\u0000\u014cK\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005&\u0000\u0000\u014e\u014f\u0005\u0018\u0000"+
		"\u0000\u014f\u0150\u00034\u001a\u0000\u0150\u0151\u0005(\u0000\u0000\u0151"+
		"\u0152\u0003>\u001f\u0000\u0152\u0153\u0005(\u0000\u0000\u0153\u0154\u0003"+
		":\u001d\u0000\u0154\u0155\u0005\u0019\u0000\u0000\u0155\u0156\u0005\u001c"+
		"\u0000\u0000\u0156\u0157\u0003\u001a\r\u0000\u0157\u0158\u0005\u001d\u0000"+
		"\u0000\u0158M\u0001\u0000\u0000\u0000\u0159\u015a\u0005+\u0000\u0000\u015a"+
		"\u015b\u00053\u0000\u0000\u015b\u015c\u0005(\u0000\u0000\u015cO\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0005*\u0000\u0000\u015e\u015f\u00053\u0000"+
		"\u0000\u015f\u0160\u0005(\u0000\u0000\u0160Q\u0001\u0000\u0000\u0000\u0016"+
		"Vbjx}\u0083\u0090\u00a7\u00ab\u00ad\u00b6\u00ba\u00c6\u00c8\u00e3\u00eb"+
		"\u00f3\u00fc\u0110\u0120\u012a\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}