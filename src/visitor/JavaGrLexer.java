// Generated from /Users/bartosz/IdeaProjects/java-to-c-converter/src/antlr/JavaGr.g4 by ANTLR 4.10.1
package visitor;

package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, CHARACTER=2, IDENTIFIER=3, STRING_VAL=4, CHAR_VAL=5, INT_VAL=6, 
		FLOAT_VAL=7, DOUBLE_VAL=8, DO_=9, FLOAT=10, INT=11, DOUBLE=12, STRING=13, 
		CHAR=14, BOOL=15, PUBLIC=16, CLASS=17, TRUE=18, FALSE=19, EQUAL=20, NOT_EQUAL=21, 
		GREATER=22, LESS=23, GREATER_EQUAL=24, LESS_EQUAL=25, BRACKET_L=26, BRACKET_R=27, 
		SQ_BRACKET_L=28, SQ_BRACKET_R=29, PARENT_L=30, PARENT_R=31, ADD=32, SUBTRACT=33, 
		MULTIPLY=34, DIVIDE=35, MODULO=36, COMMENT=37, IF=38, ELSE=39, FOR=40, 
		WHILE=41, SEMICOLON=42, COMMA=43, NEWLINE=44, IMPORT=45, PACKAGE=46, RETURN=47, 
		PRIVATE_NEW_VAR=48, PROTECTED_NEW_VAR=49, STATIC_VAR=50, OR=51, AND=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "CHARACTER", "IDENTIFIER", "STRING_VAL", "CHAR_VAL", "INT_VAL", 
			"FLOAT_VAL", "DOUBLE_VAL", "DO_", "FLOAT", "INT", "DOUBLE", "STRING", 
			"CHAR", "BOOL", "PUBLIC", "CLASS", "TRUE", "FALSE", "EQUAL", "NOT_EQUAL", 
			"GREATER", "LESS", "GREATER_EQUAL", "LESS_EQUAL", "BRACKET_L", "BRACKET_R", 
			"SQ_BRACKET_L", "SQ_BRACKET_R", "PARENT_L", "PARENT_R", "ADD", "SUBTRACT", 
			"MULTIPLY", "DIVIDE", "MODULO", "COMMENT", "IF", "ELSE", "FOR", "WHILE", 
			"SEMICOLON", "COMMA", "NEWLINE", "IMPORT", "PACKAGE", "RETURN", "PRIVATE_NEW_VAR", 
			"PROTECTED_NEW_VAR", "STATIC_VAR", "OR", "AND"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'do'", "'float'", 
			"'int'", "'double'", "'string'", "'char'", "'boolean'", "'public'", "'class'", 
			"'true'", "'false'", "'='", "'!='", "'>'", "'<'", "'>='", "'<='", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			null, "'if'", "'else'", "'for'", "'while'", "';'", "','", "'\\n'", "'import'", 
			"'package'", "'return'", "'private'", "'protected'", "'static'", "'||'", 
			"'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "CHARACTER", "IDENTIFIER", "STRING_VAL", "CHAR_VAL", 
			"INT_VAL", "FLOAT_VAL", "DOUBLE_VAL", "DO_", "FLOAT", "INT", "DOUBLE", 
			"STRING", "CHAR", "BOOL", "PUBLIC", "CLASS", "TRUE", "FALSE", "EQUAL", 
			"NOT_EQUAL", "GREATER", "LESS", "GREATER_EQUAL", "LESS_EQUAL", "BRACKET_L", 
			"BRACKET_R", "SQ_BRACKET_L", "SQ_BRACKET_R", "PARENT_L", "PARENT_R", 
			"ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "MODULO", "COMMENT", "IF", "ELSE", 
			"FOR", "WHILE", "SEMICOLON", "COMMA", "NEWLINE", "IMPORT", "PACKAGE", 
			"RETURN", "PRIVATE_NEW_VAR", "PROTECTED_NEW_VAR", "STATIC_VAR", "OR", 
			"AND"
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


	public JavaGrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaGr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u00004\u0166\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002p\b\u0002\u000b"+
		"\u0002\f\u0002q\u0001\u0003\u0001\u0003\u0005\u0003v\b\u0003\n\u0003\f"+
		"\u0003y\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u0083\b\u0005\n"+
		"\u0005\f\u0005\u0086\t\u0005\u0001\u0006\u0003\u0006\u0089\b\u0006\u0001"+
		"\u0006\u0005\u0006\u008c\b\u0006\n\u0006\f\u0006\u008f\t\u0006\u0001\u0006"+
		"\u0003\u0006\u0092\b\u0006\u0001\u0006\u0004\u0006\u0095\b\u0006\u000b"+
		"\u0006\f\u0006\u0096\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u009c"+
		"\b\u0007\u0001\u0007\u0005\u0007\u009f\b\u0007\n\u0007\f\u0007\u00a2\t"+
		"\u0007\u0001\u0007\u0003\u0007\u00a5\b\u0007\u0001\u0007\u0004\u0007\u00a8"+
		"\b\u0007\u000b\u0007\f\u0007\u00a9\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u0115"+
		"\b$\n$\f$\u0118\t$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00012\u00013\u00013\u00013\u0000"+
		"\u00004\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4\u0001\u0000\u0007\u0001\u000009"+
		"\u0002\u0000AZaz\u0003\u000009AZaz\u0001\u0000..\u0001\u000019\u0002\u0000"+
		"++--\u0002\u0000\n\n\r\r\u0171\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W"+
		"\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000"+
		"\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000"+
		"\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e"+
		"\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0001i\u0001\u0000"+
		"\u0000\u0000\u0003k\u0001\u0000\u0000\u0000\u0005m\u0001\u0000\u0000\u0000"+
		"\u0007s\u0001\u0000\u0000\u0000\t|\u0001\u0000\u0000\u0000\u000b\u0080"+
		"\u0001\u0000\u0000\u0000\r\u0088\u0001\u0000\u0000\u0000\u000f\u009b\u0001"+
		"\u0000\u0000\u0000\u0011\u00ab\u0001\u0000\u0000\u0000\u0013\u00ae\u0001"+
		"\u0000\u0000\u0000\u0015\u00b4\u0001\u0000\u0000\u0000\u0017\u00b8\u0001"+
		"\u0000\u0000\u0000\u0019\u00bf\u0001\u0000\u0000\u0000\u001b\u00c6\u0001"+
		"\u0000\u0000\u0000\u001d\u00cb\u0001\u0000\u0000\u0000\u001f\u00d3\u0001"+
		"\u0000\u0000\u0000!\u00da\u0001\u0000\u0000\u0000#\u00e0\u0001\u0000\u0000"+
		"\u0000%\u00e5\u0001\u0000\u0000\u0000\'\u00eb\u0001\u0000\u0000\u0000"+
		")\u00ed\u0001\u0000\u0000\u0000+\u00f0\u0001\u0000\u0000\u0000-\u00f2"+
		"\u0001\u0000\u0000\u0000/\u00f4\u0001\u0000\u0000\u00001\u00f7\u0001\u0000"+
		"\u0000\u00003\u00fa\u0001\u0000\u0000\u00005\u00fc\u0001\u0000\u0000\u0000"+
		"7\u00fe\u0001\u0000\u0000\u00009\u0100\u0001\u0000\u0000\u0000;\u0102"+
		"\u0001\u0000\u0000\u0000=\u0104\u0001\u0000\u0000\u0000?\u0106\u0001\u0000"+
		"\u0000\u0000A\u0108\u0001\u0000\u0000\u0000C\u010a\u0001\u0000\u0000\u0000"+
		"E\u010c\u0001\u0000\u0000\u0000G\u010e\u0001\u0000\u0000\u0000I\u0110"+
		"\u0001\u0000\u0000\u0000K\u0119\u0001\u0000\u0000\u0000M\u011c\u0001\u0000"+
		"\u0000\u0000O\u0121\u0001\u0000\u0000\u0000Q\u0125\u0001\u0000\u0000\u0000"+
		"S\u012b\u0001\u0000\u0000\u0000U\u012d\u0001\u0000\u0000\u0000W\u012f"+
		"\u0001\u0000\u0000\u0000Y\u0131\u0001\u0000\u0000\u0000[\u0138\u0001\u0000"+
		"\u0000\u0000]\u0140\u0001\u0000\u0000\u0000_\u0147\u0001\u0000\u0000\u0000"+
		"a\u014f\u0001\u0000\u0000\u0000c\u0159\u0001\u0000\u0000\u0000e\u0160"+
		"\u0001\u0000\u0000\u0000g\u0163\u0001\u0000\u0000\u0000ij\u0007\u0000"+
		"\u0000\u0000j\u0002\u0001\u0000\u0000\u0000kl\u0007\u0001\u0000\u0000"+
		"l\u0004\u0001\u0000\u0000\u0000mo\u0007\u0001\u0000\u0000np\u0007\u0002"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0006\u0001\u0000\u0000"+
		"\u0000sw\u0005\"\u0000\u0000tv\u0007\u0003\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005"+
		"\"\u0000\u0000{\b\u0001\u0000\u0000\u0000|}\u0005\'\u0000\u0000}~\u0007"+
		"\u0003\u0000\u0000~\u007f\u0005\'\u0000\u0000\u007f\n\u0001\u0000\u0000"+
		"\u0000\u0080\u0084\u0007\u0004\u0000\u0000\u0081\u0083\u0007\u0000\u0000"+
		"\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\f\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0007\u0005\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0091\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0007\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0007\u0003\u0000\u0000"+
		"\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0095\u0007\u0000\u0000\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005f\u0000\u0000\u0099"+
		"\u000e\u0001\u0000\u0000\u0000\u009a\u009c\u0007\u0005\u0000\u0000\u009b"+
		"\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u00a4\u0001\u0000\u0000\u0000\u009d\u009f\u0007\u0000\u0000\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0007\u0003\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a8\u0007\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u0010\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005d\u0000\u0000\u00ac\u00ad\u0005o\u0000\u0000\u00ad\u0012\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0005f\u0000\u0000\u00af\u00b0\u0005l\u0000"+
		"\u0000\u00b0\u00b1\u0005o\u0000\u0000\u00b1\u00b2\u0005a\u0000\u0000\u00b2"+
		"\u00b3\u0005t\u0000\u0000\u00b3\u0014\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005i\u0000\u0000\u00b5\u00b6\u0005n\u0000\u0000\u00b6\u00b7\u0005t"+
		"\u0000\u0000\u00b7\u0016\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005d\u0000"+
		"\u0000\u00b9\u00ba\u0005o\u0000\u0000\u00ba\u00bb\u0005u\u0000\u0000\u00bb"+
		"\u00bc\u0005b\u0000\u0000\u00bc\u00bd\u0005l\u0000\u0000\u00bd\u00be\u0005"+
		"e\u0000\u0000\u00be\u0018\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005s\u0000"+
		"\u0000\u00c0\u00c1\u0005t\u0000\u0000\u00c1\u00c2\u0005r\u0000\u0000\u00c2"+
		"\u00c3\u0005i\u0000\u0000\u00c3\u00c4\u0005n\u0000\u0000\u00c4\u00c5\u0005"+
		"g\u0000\u0000\u00c5\u001a\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005c\u0000"+
		"\u0000\u00c7\u00c8\u0005h\u0000\u0000\u00c8\u00c9\u0005a\u0000\u0000\u00c9"+
		"\u00ca\u0005r\u0000\u0000\u00ca\u001c\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005b\u0000\u0000\u00cc\u00cd\u0005o\u0000\u0000\u00cd\u00ce\u0005o"+
		"\u0000\u0000\u00ce\u00cf\u0005l\u0000\u0000\u00cf\u00d0\u0005e\u0000\u0000"+
		"\u00d0\u00d1\u0005a\u0000\u0000\u00d1\u00d2\u0005n\u0000\u0000\u00d2\u001e"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005p\u0000\u0000\u00d4\u00d5\u0005"+
		"u\u0000\u0000\u00d5\u00d6\u0005b\u0000\u0000\u00d6\u00d7\u0005l\u0000"+
		"\u0000\u00d7\u00d8\u0005i\u0000\u0000\u00d8\u00d9\u0005c\u0000\u0000\u00d9"+
		" \u0001\u0000\u0000\u0000\u00da\u00db\u0005c\u0000\u0000\u00db\u00dc\u0005"+
		"l\u0000\u0000\u00dc\u00dd\u0005a\u0000\u0000\u00dd\u00de\u0005s\u0000"+
		"\u0000\u00de\u00df\u0005s\u0000\u0000\u00df\"\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005t\u0000\u0000\u00e1\u00e2\u0005r\u0000\u0000\u00e2\u00e3"+
		"\u0005u\u0000\u0000\u00e3\u00e4\u0005e\u0000\u0000\u00e4$\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005f\u0000\u0000\u00e6\u00e7\u0005a\u0000\u0000"+
		"\u00e7\u00e8\u0005l\u0000\u0000\u00e8\u00e9\u0005s\u0000\u0000\u00e9\u00ea"+
		"\u0005e\u0000\u0000\u00ea&\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005="+
		"\u0000\u0000\u00ec(\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005!\u0000\u0000"+
		"\u00ee\u00ef\u0005=\u0000\u0000\u00ef*\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0005>\u0000\u0000\u00f1,\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005<"+
		"\u0000\u0000\u00f3.\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005>\u0000\u0000"+
		"\u00f5\u00f6\u0005=\u0000\u0000\u00f60\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0005<\u0000\u0000\u00f8\u00f9\u0005=\u0000\u0000\u00f92\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0005(\u0000\u0000\u00fb4\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0005)\u0000\u0000\u00fd6\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005[\u0000\u0000\u00ff8\u0001\u0000\u0000\u0000\u0100\u0101\u0005]"+
		"\u0000\u0000\u0101:\u0001\u0000\u0000\u0000\u0102\u0103\u0005{\u0000\u0000"+
		"\u0103<\u0001\u0000\u0000\u0000\u0104\u0105\u0005}\u0000\u0000\u0105>"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0005+\u0000\u0000\u0107@\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0005-\u0000\u0000\u0109B\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0005*\u0000\u0000\u010bD\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0005/\u0000\u0000\u010dF\u0001\u0000\u0000\u0000\u010e\u010f\u0005%"+
		"\u0000\u0000\u010fH\u0001\u0000\u0000\u0000\u0110\u0111\u0005/\u0000\u0000"+
		"\u0111\u0112\u0005/\u0000\u0000\u0112\u0116\u0001\u0000\u0000\u0000\u0113"+
		"\u0115\b\u0006\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0118"+
		"\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0001\u0000\u0000\u0000\u0117J\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005i\u0000\u0000\u011a\u011b\u0005f\u0000"+
		"\u0000\u011bL\u0001\u0000\u0000\u0000\u011c\u011d\u0005e\u0000\u0000\u011d"+
		"\u011e\u0005l\u0000\u0000\u011e\u011f\u0005s\u0000\u0000\u011f\u0120\u0005"+
		"e\u0000\u0000\u0120N\u0001\u0000\u0000\u0000\u0121\u0122\u0005f\u0000"+
		"\u0000\u0122\u0123\u0005o\u0000\u0000\u0123\u0124\u0005r\u0000\u0000\u0124"+
		"P\u0001\u0000\u0000\u0000\u0125\u0126\u0005w\u0000\u0000\u0126\u0127\u0005"+
		"h\u0000\u0000\u0127\u0128\u0005i\u0000\u0000\u0128\u0129\u0005l\u0000"+
		"\u0000\u0129\u012a\u0005e\u0000\u0000\u012aR\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0005;\u0000\u0000\u012cT\u0001\u0000\u0000\u0000\u012d\u012e\u0005"+
		",\u0000\u0000\u012eV\u0001\u0000\u0000\u0000\u012f\u0130\u0005\n\u0000"+
		"\u0000\u0130X\u0001\u0000\u0000\u0000\u0131\u0132\u0005i\u0000\u0000\u0132"+
		"\u0133\u0005m\u0000\u0000\u0133\u0134\u0005p\u0000\u0000\u0134\u0135\u0005"+
		"o\u0000\u0000\u0135\u0136\u0005r\u0000\u0000\u0136\u0137\u0005t\u0000"+
		"\u0000\u0137Z\u0001\u0000\u0000\u0000\u0138\u0139\u0005p\u0000\u0000\u0139"+
		"\u013a\u0005a\u0000\u0000\u013a\u013b\u0005c\u0000\u0000\u013b\u013c\u0005"+
		"k\u0000\u0000\u013c\u013d\u0005a\u0000\u0000\u013d\u013e\u0005g\u0000"+
		"\u0000\u013e\u013f\u0005e\u0000\u0000\u013f\\\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0005r\u0000\u0000\u0141\u0142\u0005e\u0000\u0000\u0142\u0143"+
		"\u0005t\u0000\u0000\u0143\u0144\u0005u\u0000\u0000\u0144\u0145\u0005r"+
		"\u0000\u0000\u0145\u0146\u0005n\u0000\u0000\u0146^\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0005p\u0000\u0000\u0148\u0149\u0005r\u0000\u0000\u0149\u014a"+
		"\u0005i\u0000\u0000\u014a\u014b\u0005v\u0000\u0000\u014b\u014c\u0005a"+
		"\u0000\u0000\u014c\u014d\u0005t\u0000\u0000\u014d\u014e\u0005e\u0000\u0000"+
		"\u014e`\u0001\u0000\u0000\u0000\u014f\u0150\u0005p\u0000\u0000\u0150\u0151"+
		"\u0005r\u0000\u0000\u0151\u0152\u0005o\u0000\u0000\u0152\u0153\u0005t"+
		"\u0000\u0000\u0153\u0154\u0005e\u0000\u0000\u0154\u0155\u0005c\u0000\u0000"+
		"\u0155\u0156\u0005t\u0000\u0000\u0156\u0157\u0005e\u0000\u0000\u0157\u0158"+
		"\u0005d\u0000\u0000\u0158b\u0001\u0000\u0000\u0000\u0159\u015a\u0005s"+
		"\u0000\u0000\u015a\u015b\u0005t\u0000\u0000\u015b\u015c\u0005a\u0000\u0000"+
		"\u015c\u015d\u0005t\u0000\u0000\u015d\u015e\u0005i\u0000\u0000\u015e\u015f"+
		"\u0005c\u0000\u0000\u015fd\u0001\u0000\u0000\u0000\u0160\u0161\u0005|"+
		"\u0000\u0000\u0161\u0162\u0005|\u0000\u0000\u0162f\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0005&\u0000\u0000\u0164\u0165\u0005&\u0000\u0000\u0165h"+
		"\u0001\u0000\u0000\u0000\r\u0000qw\u0084\u0088\u008d\u0091\u0096\u009b"+
		"\u00a0\u00a4\u00a9\u0116\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}