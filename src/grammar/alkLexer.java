// Generated from /home/alex/work/Alk/script/../src/grammar/parts/alk.g4 by ANTLR 4.7.1

    package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LINE_COMMENT=3, IF=4, ELSE=5, WHILE=6, DO=7, FOR=8, FORALL=9, 
		IN=10, OUT=11, CHOOSE=12, RETURN=13, SUCCESS=14, FAILURE=15, EMPTYSET=16, 
		EMPTYLIST=17, MODIFIES=18, XOR=19, AT=20, BELONGSTO=21, DELETE=22, EMPTY=23, 
		END=24, FIRST=25, INSERT=26, PRINT=27, POPBACK=28, POPFRONT=29, PUSHBACK=30, 
		PUSHFRONT=31, REMOVE=32, REMOVEALLEQTO=33, REMOVEAT=34, SINGLETONSET=35, 
		SIZE=36, TOPBACK=37, TOPFRONT=38, UPDATE=39, RANDOM=40, ARROW=41, UNION=42, 
		INTERSECT=43, SUBTRACT=44, INT=45, DOUBLE=46, BOOL=47, ID=48, PLUSPLUS=49, 
		MINUSMINUS=50, BITWISE_AND=51, PLUSMOD=52, MINUSMOD=53, PLUSPLUSMOD=54, 
		MINUSMINUSMOD=55, LOWER=56, GREATER=57, LOWEREQ=58, GREATEREQ=59, ISEQUAL=60, 
		NOTEQUAL=61, ASSIGNMENT_OPERATOR=62, MINUS=63, PLUS=64, MUL=65, DIV=66, 
		MOD=67, LPAR=68, RPAR=69, LEFTSHIFT=70, RIGHTSHIFT=71, OR=72, AND=73, 
		NOT=74, SEMICOLON=75, DPOINT=76, VBAR=77, LCB=78, RCB=79, COMMA=80, POINT=81, 
		LBRA=82, RBRA=83, QUOTE=84, QUESTION=85, STRING=86;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "LINE_COMMENT", "NONDIGIT", "DIGIT", "NONZERODIGIT", 
		"IF", "ELSE", "WHILE", "DO", "FOR", "FORALL", "IN", "OUT", "CHOOSE", "RETURN", 
		"SUCCESS", "FAILURE", "EMPTYSET", "EMPTYLIST", "MODIFIES", "XOR", "AT", 
		"BELONGSTO", "DELETE", "EMPTY", "END", "FIRST", "INSERT", "PRINT", "POPBACK", 
		"POPFRONT", "PUSHBACK", "PUSHFRONT", "REMOVE", "REMOVEALLEQTO", "REMOVEAT", 
		"SINGLETONSET", "SIZE", "TOPBACK", "TOPFRONT", "UPDATE", "RANDOM", "ARROW", 
		"UNION", "INTERSECT", "SUBTRACT", "INT", "DOUBLE", "BOOL", "ID", "PLUSPLUS", 
		"MINUSMINUS", "BITWISE_AND", "PLUSMOD", "MINUSMOD", "PLUSPLUSMOD", "MINUSMINUSMOD", 
		"LOWER", "GREATER", "LOWEREQ", "GREATEREQ", "ISEQUAL", "NOTEQUAL", "ASSIGNMENT_OPERATOR", 
		"MINUS", "PLUS", "MUL", "DIV", "MOD", "LPAR", "RPAR", "LEFTSHIFT", "RIGHTSHIFT", 
		"OR", "AND", "NOT", "SEMICOLON", "DPOINT", "VBAR", "LCB", "RCB", "COMMA", 
		"POINT", "LBRA", "RBRA", "QUOTE", "QUESTION", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'if'", "'else'", "'while'", "'do'", "'for'", 
		"'forall'", "'in'", "'out'", "'choose'", "'return'", "'success'", "'failure'", 
		"'emptySet'", "'emptyList'", "'modifies'", "'xor'", "'at'", "'belongsTo'", 
		"'delete'", "'empty'", "'end'", "'first'", "'insert'", "'print'", "'popBack'", 
		"'popFront'", "'pushBack'", "'pushFront'", "'remove'", "'removeAllEqTo'", 
		"'removeAt'", "'singletonSet'", "'size'", "'topBack'", "'topFront'", "'update'", 
		"'random'", "'->'", "'U'", "'^'", "'\\'", null, null, null, null, "'++'", 
		"'--'", "'&'", "'+%'", "'-%'", "'++%'", "'--%'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", null, "'-'", "'+'", "'*'", "'/'", "'%'", "'('", 
		"')'", "'<<'", "'>>'", "'||'", "'&&'", "'!'", "';'", "':'", "'|'", "'{'", 
		"'}'", "','", "'.'", "'['", "']'", "'\"'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LINE_COMMENT", "IF", "ELSE", "WHILE", "DO", "FOR", 
		"FORALL", "IN", "OUT", "CHOOSE", "RETURN", "SUCCESS", "FAILURE", "EMPTYSET", 
		"EMPTYLIST", "MODIFIES", "XOR", "AT", "BELONGSTO", "DELETE", "EMPTY", 
		"END", "FIRST", "INSERT", "PRINT", "POPBACK", "POPFRONT", "PUSHBACK", 
		"PUSHFRONT", "REMOVE", "REMOVEALLEQTO", "REMOVEAT", "SINGLETONSET", "SIZE", 
		"TOPBACK", "TOPFRONT", "UPDATE", "RANDOM", "ARROW", "UNION", "INTERSECT", 
		"SUBTRACT", "INT", "DOUBLE", "BOOL", "ID", "PLUSPLUS", "MINUSMINUS", "BITWISE_AND", 
		"PLUSMOD", "MINUSMOD", "PLUSPLUSMOD", "MINUSMINUSMOD", "LOWER", "GREATER", 
		"LOWEREQ", "GREATEREQ", "ISEQUAL", "NOTEQUAL", "ASSIGNMENT_OPERATOR", 
		"MINUS", "PLUS", "MUL", "DIV", "MOD", "LPAR", "RPAR", "LEFTSHIFT", "RIGHTSHIFT", 
		"OR", "AND", "NOT", "SEMICOLON", "DPOINT", "VBAR", "LCB", "RCB", "COMMA", 
		"POINT", "LBRA", "RBRA", "QUOTE", "QUESTION", "STRING"
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


	public alkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "alk.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2X\u0284\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\6\2\u00b7\n\2\r\2\16\2\u00b8"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u00c1\n\3\f\3\16\3\u00c4\13\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00cf\n\4\f\4\16\4\u00d2\13\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\6\61\u01eb\n\61\r\61\16\61\u01ec\3\62\6\62\u01f0\n\62\r"+
		"\62\16\62\u01f1\3\62\3\62\6\62\u01f6\n\62\r\62\16\62\u01f7\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0203\n\63\3\64\3\64\3\64\7\64"+
		"\u0208\n\64\f\64\16\64\u020b\13\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\38\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3=\3=\3>\3>\3>\3"+
		"?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\5B\u0248\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3"+
		"I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3"+
		"R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\7Z\u027e\nZ\fZ\16Z\u0281"+
		"\13Z\3Z\3Z\3\u00c2\2[\3\3\5\4\7\5\t\2\13\2\r\2\17\6\21\7\23\b\25\t\27"+
		"\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30"+
		"\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60"+
		"e\61g\62i\63k\64m\65o\66q\67s8u9w:y;{<}=\177>\u0081?\u0083@\u0085A\u0087"+
		"B\u0089C\u008bD\u008dE\u008fF\u0091G\u0093H\u0095I\u0097J\u0099K\u009b"+
		"L\u009dM\u009fN\u00a1O\u00a3P\u00a5Q\u00a7R\u00a9S\u00abT\u00adU\u00af"+
		"V\u00b1W\u00b3X\3\2\b\5\2\13\f\17\17\"\"\4\2\f\f\17\17\5\2C\\aac|\3\2"+
		"\62;\3\2\63;\5\2\f\f\17\17$$\2\u0293\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\3\u00b6\3\2\2\2\5\u00bc\3\2\2\2\7\u00ca\3\2\2\2\t\u00d5"+
		"\3\2\2\2\13\u00d7\3\2\2\2\r\u00d9\3\2\2\2\17\u00db\3\2\2\2\21\u00de\3"+
		"\2\2\2\23\u00e3\3\2\2\2\25\u00e9\3\2\2\2\27\u00ec\3\2\2\2\31\u00f0\3\2"+
		"\2\2\33\u00f7\3\2\2\2\35\u00fa\3\2\2\2\37\u00fe\3\2\2\2!\u0105\3\2\2\2"+
		"#\u010c\3\2\2\2%\u0114\3\2\2\2\'\u011c\3\2\2\2)\u0125\3\2\2\2+\u012f\3"+
		"\2\2\2-\u0138\3\2\2\2/\u013c\3\2\2\2\61\u013f\3\2\2\2\63\u0149\3\2\2\2"+
		"\65\u0150\3\2\2\2\67\u0156\3\2\2\29\u015a\3\2\2\2;\u0160\3\2\2\2=\u0167"+
		"\3\2\2\2?\u016d\3\2\2\2A\u0175\3\2\2\2C\u017e\3\2\2\2E\u0187\3\2\2\2G"+
		"\u0191\3\2\2\2I\u0198\3\2\2\2K\u01a6\3\2\2\2M\u01af\3\2\2\2O\u01bc\3\2"+
		"\2\2Q\u01c1\3\2\2\2S\u01c9\3\2\2\2U\u01d2\3\2\2\2W\u01d9\3\2\2\2Y\u01e0"+
		"\3\2\2\2[\u01e3\3\2\2\2]\u01e5\3\2\2\2_\u01e7\3\2\2\2a\u01ea\3\2\2\2c"+
		"\u01ef\3\2\2\2e\u0202\3\2\2\2g\u0204\3\2\2\2i\u020c\3\2\2\2k\u020f\3\2"+
		"\2\2m\u0212\3\2\2\2o\u0214\3\2\2\2q\u0217\3\2\2\2s\u021a\3\2\2\2u\u021e"+
		"\3\2\2\2w\u0222\3\2\2\2y\u0224\3\2\2\2{\u0226\3\2\2\2}\u0229\3\2\2\2\177"+
		"\u022c\3\2\2\2\u0081\u022f\3\2\2\2\u0083\u0247\3\2\2\2\u0085\u0249\3\2"+
		"\2\2\u0087\u024b\3\2\2\2\u0089\u024d\3\2\2\2\u008b\u024f\3\2\2\2\u008d"+
		"\u0251\3\2\2\2\u008f\u0253\3\2\2\2\u0091\u0255\3\2\2\2\u0093\u0257\3\2"+
		"\2\2\u0095\u025a\3\2\2\2\u0097\u025d\3\2\2\2\u0099\u0260\3\2\2\2\u009b"+
		"\u0263\3\2\2\2\u009d\u0265\3\2\2\2\u009f\u0267\3\2\2\2\u00a1\u0269\3\2"+
		"\2\2\u00a3\u026b\3\2\2\2\u00a5\u026d\3\2\2\2\u00a7\u026f\3\2\2\2\u00a9"+
		"\u0271\3\2\2\2\u00ab\u0273\3\2\2\2\u00ad\u0275\3\2\2\2\u00af\u0277\3\2"+
		"\2\2\u00b1\u0279\3\2\2\2\u00b3\u027b\3\2\2\2\u00b5\u00b7\t\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\2\2\2\u00bb\4\3\2\2\2\u00bc\u00bd"+
		"\7\61\2\2\u00bd\u00be\7,\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c1\13\2\2\2"+
		"\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6"+
		"\u00c7\7\61\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\3\2\2\u00c9\6\3\2\2"+
		"\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00d0\3\2\2\2\u00cd"+
		"\u00cf\n\3\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d4\b\4\2\2\u00d4\b\3\2\2\2\u00d5\u00d6\t\4\2\2\u00d6\n\3\2\2\2\u00d7"+
		"\u00d8\t\5\2\2\u00d8\f\3\2\2\2\u00d9\u00da\t\6\2\2\u00da\16\3\2\2\2\u00db"+
		"\u00dc\7k\2\2\u00dc\u00dd\7h\2\2\u00dd\20\3\2\2\2\u00de\u00df\7g\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2\22\3\2\2\2\u00e3"+
		"\u00e4\7y\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7n\2\2"+
		"\u00e7\u00e8\7g\2\2\u00e8\24\3\2\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7"+
		"q\2\2\u00eb\26\3\2\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7t\2\2\u00ef\30\3\2\2\2\u00f0\u00f1\7h\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3"+
		"\7t\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"\32\3\2\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7p\2\2\u00f9\34\3\2\2\2\u00fa"+
		"\u00fb\7q\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7v\2\2\u00fd\36\3\2\2\2\u00fe"+
		"\u00ff\7e\2\2\u00ff\u0100\7j\2\2\u0100\u0101\7q\2\2\u0101\u0102\7q\2\2"+
		"\u0102\u0103\7u\2\2\u0103\u0104\7g\2\2\u0104 \3\2\2\2\u0105\u0106\7t\2"+
		"\2\u0106\u0107\7g\2\2\u0107\u0108\7v\2\2\u0108\u0109\7w\2\2\u0109\u010a"+
		"\7t\2\2\u010a\u010b\7p\2\2\u010b\"\3\2\2\2\u010c\u010d\7u\2\2\u010d\u010e"+
		"\7w\2\2\u010e\u010f\7e\2\2\u010f\u0110\7e\2\2\u0110\u0111\7g\2\2\u0111"+
		"\u0112\7u\2\2\u0112\u0113\7u\2\2\u0113$\3\2\2\2\u0114\u0115\7h\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7k\2\2\u0117\u0118\7n\2\2\u0118\u0119\7w\2\2"+
		"\u0119\u011a\7t\2\2\u011a\u011b\7g\2\2\u011b&\3\2\2\2\u011c\u011d\7g\2"+
		"\2\u011d\u011e\7o\2\2\u011e\u011f\7r\2\2\u011f\u0120\7v\2\2\u0120\u0121"+
		"\7{\2\2\u0121\u0122\7U\2\2\u0122\u0123\7g\2\2\u0123\u0124\7v\2\2\u0124"+
		"(\3\2\2\2\u0125\u0126\7g\2\2\u0126\u0127\7o\2\2\u0127\u0128\7r\2\2\u0128"+
		"\u0129\7v\2\2\u0129\u012a\7{\2\2\u012a\u012b\7N\2\2\u012b\u012c\7k\2\2"+
		"\u012c\u012d\7u\2\2\u012d\u012e\7v\2\2\u012e*\3\2\2\2\u012f\u0130\7o\2"+
		"\2\u0130\u0131\7q\2\2\u0131\u0132\7f\2\2\u0132\u0133\7k\2\2\u0133\u0134"+
		"\7h\2\2\u0134\u0135\7k\2\2\u0135\u0136\7g\2\2\u0136\u0137\7u\2\2\u0137"+
		",\3\2\2\2\u0138\u0139\7z\2\2\u0139\u013a\7q\2\2\u013a\u013b\7t\2\2\u013b"+
		".\3\2\2\2\u013c\u013d\7c\2\2\u013d\u013e\7v\2\2\u013e\60\3\2\2\2\u013f"+
		"\u0140\7d\2\2\u0140\u0141\7g\2\2\u0141\u0142\7n\2\2\u0142\u0143\7q\2\2"+
		"\u0143\u0144\7p\2\2\u0144\u0145\7i\2\2\u0145\u0146\7u\2\2\u0146\u0147"+
		"\7V\2\2\u0147\u0148\7q\2\2\u0148\62\3\2\2\2\u0149\u014a\7f\2\2\u014a\u014b"+
		"\7g\2\2\u014b\u014c\7n\2\2\u014c\u014d\7g\2\2\u014d\u014e\7v\2\2\u014e"+
		"\u014f\7g\2\2\u014f\64\3\2\2\2\u0150\u0151\7g\2\2\u0151\u0152\7o\2\2\u0152"+
		"\u0153\7r\2\2\u0153\u0154\7v\2\2\u0154\u0155\7{\2\2\u0155\66\3\2\2\2\u0156"+
		"\u0157\7g\2\2\u0157\u0158\7p\2\2\u0158\u0159\7f\2\2\u01598\3\2\2\2\u015a"+
		"\u015b\7h\2\2\u015b\u015c\7k\2\2\u015c\u015d\7t\2\2\u015d\u015e\7u\2\2"+
		"\u015e\u015f\7v\2\2\u015f:\3\2\2\2\u0160\u0161\7k\2\2\u0161\u0162\7p\2"+
		"\2\u0162\u0163\7u\2\2\u0163\u0164\7g\2\2\u0164\u0165\7t\2\2\u0165\u0166"+
		"\7v\2\2\u0166<\3\2\2\2\u0167\u0168\7r\2\2\u0168\u0169\7t\2\2\u0169\u016a"+
		"\7k\2\2\u016a\u016b\7p\2\2\u016b\u016c\7v\2\2\u016c>\3\2\2\2\u016d\u016e"+
		"\7r\2\2\u016e\u016f\7q\2\2\u016f\u0170\7r\2\2\u0170\u0171\7D\2\2\u0171"+
		"\u0172\7c\2\2\u0172\u0173\7e\2\2\u0173\u0174\7m\2\2\u0174@\3\2\2\2\u0175"+
		"\u0176\7r\2\2\u0176\u0177\7q\2\2\u0177\u0178\7r\2\2\u0178\u0179\7H\2\2"+
		"\u0179\u017a\7t\2\2\u017a\u017b\7q\2\2\u017b\u017c\7p\2\2\u017c\u017d"+
		"\7v\2\2\u017dB\3\2\2\2\u017e\u017f\7r\2\2\u017f\u0180\7w\2\2\u0180\u0181"+
		"\7u\2\2\u0181\u0182\7j\2\2\u0182\u0183\7D\2\2\u0183\u0184\7c\2\2\u0184"+
		"\u0185\7e\2\2\u0185\u0186\7m\2\2\u0186D\3\2\2\2\u0187\u0188\7r\2\2\u0188"+
		"\u0189\7w\2\2\u0189\u018a\7u\2\2\u018a\u018b\7j\2\2\u018b\u018c\7H\2\2"+
		"\u018c\u018d\7t\2\2\u018d\u018e\7q\2\2\u018e\u018f\7p\2\2\u018f\u0190"+
		"\7v\2\2\u0190F\3\2\2\2\u0191\u0192\7t\2\2\u0192\u0193\7g\2\2\u0193\u0194"+
		"\7o\2\2\u0194\u0195\7q\2\2\u0195\u0196\7x\2\2\u0196\u0197\7g\2\2\u0197"+
		"H\3\2\2\2\u0198\u0199\7t\2\2\u0199\u019a\7g\2\2\u019a\u019b\7o\2\2\u019b"+
		"\u019c\7q\2\2\u019c\u019d\7x\2\2\u019d\u019e\7g\2\2\u019e\u019f\7C\2\2"+
		"\u019f\u01a0\7n\2\2\u01a0\u01a1\7n\2\2\u01a1\u01a2\7G\2\2\u01a2\u01a3"+
		"\7s\2\2\u01a3\u01a4\7V\2\2\u01a4\u01a5\7q\2\2\u01a5J\3\2\2\2\u01a6\u01a7"+
		"\7t\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7o\2\2\u01a9\u01aa\7q\2\2\u01aa"+
		"\u01ab\7x\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7C\2\2\u01ad\u01ae\7v\2\2"+
		"\u01aeL\3\2\2\2\u01af\u01b0\7u\2\2\u01b0\u01b1\7k\2\2\u01b1\u01b2\7p\2"+
		"\2\u01b2\u01b3\7i\2\2\u01b3\u01b4\7n\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6"+
		"\7v\2\2\u01b6\u01b7\7q\2\2\u01b7\u01b8\7p\2\2\u01b8\u01b9\7U\2\2\u01b9"+
		"\u01ba\7g\2\2\u01ba\u01bb\7v\2\2\u01bbN\3\2\2\2\u01bc\u01bd\7u\2\2\u01bd"+
		"\u01be\7k\2\2\u01be\u01bf\7|\2\2\u01bf\u01c0\7g\2\2\u01c0P\3\2\2\2\u01c1"+
		"\u01c2\7v\2\2\u01c2\u01c3\7q\2\2\u01c3\u01c4\7r\2\2\u01c4\u01c5\7D\2\2"+
		"\u01c5\u01c6\7c\2\2\u01c6\u01c7\7e\2\2\u01c7\u01c8\7m\2\2\u01c8R\3\2\2"+
		"\2\u01c9\u01ca\7v\2\2\u01ca\u01cb\7q\2\2\u01cb\u01cc\7r\2\2\u01cc\u01cd"+
		"\7H\2\2\u01cd\u01ce\7t\2\2\u01ce\u01cf\7q\2\2\u01cf\u01d0\7p\2\2\u01d0"+
		"\u01d1\7v\2\2\u01d1T\3\2\2\2\u01d2\u01d3\7w\2\2\u01d3\u01d4\7r\2\2\u01d4"+
		"\u01d5\7f\2\2\u01d5\u01d6\7c\2\2\u01d6\u01d7\7v\2\2\u01d7\u01d8\7g\2\2"+
		"\u01d8V\3\2\2\2\u01d9\u01da\7t\2\2\u01da\u01db\7c\2\2\u01db\u01dc\7p\2"+
		"\2\u01dc\u01dd\7f\2\2\u01dd\u01de\7q\2\2\u01de\u01df\7o\2\2\u01dfX\3\2"+
		"\2\2\u01e0\u01e1\7/\2\2\u01e1\u01e2\7@\2\2\u01e2Z\3\2\2\2\u01e3\u01e4"+
		"\7W\2\2\u01e4\\\3\2\2\2\u01e5\u01e6\7`\2\2\u01e6^\3\2\2\2\u01e7\u01e8"+
		"\7^\2\2\u01e8`\3\2\2\2\u01e9\u01eb\t\5\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edb\3\2\2\2\u01ee"+
		"\u01f0\t\5\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\5\u00a9U\2\u01f4"+
		"\u01f6\t\5\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8d\3\2\2\2\u01f9\u01fa\7v\2\2\u01fa\u01fb"+
		"\7t\2\2\u01fb\u01fc\7w\2\2\u01fc\u0203\7g\2\2\u01fd\u01fe\7h\2\2\u01fe"+
		"\u01ff\7c\2\2\u01ff\u0200\7n\2\2\u0200\u0201\7u\2\2\u0201\u0203\7g\2\2"+
		"\u0202\u01f9\3\2\2\2\u0202\u01fd\3\2\2\2\u0203f\3\2\2\2\u0204\u0209\5"+
		"\t\5\2\u0205\u0208\5\13\6\2\u0206\u0208\5\t\5\2\u0207\u0205\3\2\2\2\u0207"+
		"\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020ah\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7-\2\2\u020d\u020e"+
		"\7-\2\2\u020ej\3\2\2\2\u020f\u0210\7/\2\2\u0210\u0211\7/\2\2\u0211l\3"+
		"\2\2\2\u0212\u0213\7(\2\2\u0213n\3\2\2\2\u0214\u0215\7-\2\2\u0215\u0216"+
		"\7\'\2\2\u0216p\3\2\2\2\u0217\u0218\7/\2\2\u0218\u0219\7\'\2\2\u0219r"+
		"\3\2\2\2\u021a\u021b\7-\2\2\u021b\u021c\7-\2\2\u021c\u021d\7\'\2\2\u021d"+
		"t\3\2\2\2\u021e\u021f\7/\2\2\u021f\u0220\7/\2\2\u0220\u0221\7\'\2\2\u0221"+
		"v\3\2\2\2\u0222\u0223\7>\2\2\u0223x\3\2\2\2\u0224\u0225\7@\2\2\u0225z"+
		"\3\2\2\2\u0226\u0227\7>\2\2\u0227\u0228\7?\2\2\u0228|\3\2\2\2\u0229\u022a"+
		"\7@\2\2\u022a\u022b\7?\2\2\u022b~\3\2\2\2\u022c\u022d\7?\2\2\u022d\u022e"+
		"\7?\2\2\u022e\u0080\3\2\2\2\u022f\u0230\7#\2\2\u0230\u0231\7?\2\2\u0231"+
		"\u0082\3\2\2\2\u0232\u0248\7?\2\2\u0233\u0234\7-\2\2\u0234\u0248\7?\2"+
		"\2\u0235\u0236\7/\2\2\u0236\u0248\7?\2\2\u0237\u0238\7,\2\2\u0238\u0248"+
		"\7?\2\2\u0239\u023a\7\61\2\2\u023a\u0248\7?\2\2\u023b\u023c\7\'\2\2\u023c"+
		"\u0248\7?\2\2\u023d\u023e\7>\2\2\u023e\u023f\7>\2\2\u023f\u0248\7?\2\2"+
		"\u0240\u0241\7@\2\2\u0241\u0242\7@\2\2\u0242\u0248\7?\2\2\u0243\u0244"+
		"\7(\2\2\u0244\u0248\7?\2\2\u0245\u0246\7~\2\2\u0246\u0248\7?\2\2\u0247"+
		"\u0232\3\2\2\2\u0247\u0233\3\2\2\2\u0247\u0235\3\2\2\2\u0247\u0237\3\2"+
		"\2\2\u0247\u0239\3\2\2\2\u0247\u023b\3\2\2\2\u0247\u023d\3\2\2\2\u0247"+
		"\u0240\3\2\2\2\u0247\u0243\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0084\3\2"+
		"\2\2\u0249\u024a\7/\2\2\u024a\u0086\3\2\2\2\u024b\u024c\7-\2\2\u024c\u0088"+
		"\3\2\2\2\u024d\u024e\7,\2\2\u024e\u008a\3\2\2\2\u024f\u0250\7\61\2\2\u0250"+
		"\u008c\3\2\2\2\u0251\u0252\7\'\2\2\u0252\u008e\3\2\2\2\u0253\u0254\7*"+
		"\2\2\u0254\u0090\3\2\2\2\u0255\u0256\7+\2\2\u0256\u0092\3\2\2\2\u0257"+
		"\u0258\7>\2\2\u0258\u0259\7>\2\2\u0259\u0094\3\2\2\2\u025a\u025b\7@\2"+
		"\2\u025b\u025c\7@\2\2\u025c\u0096\3\2\2\2\u025d\u025e\7~\2\2\u025e\u025f"+
		"\7~\2\2\u025f\u0098\3\2\2\2\u0260\u0261\7(\2\2\u0261\u0262\7(\2\2\u0262"+
		"\u009a\3\2\2\2\u0263\u0264\7#\2\2\u0264\u009c\3\2\2\2\u0265\u0266\7=\2"+
		"\2\u0266\u009e\3\2\2\2\u0267\u0268\7<\2\2\u0268\u00a0\3\2\2\2\u0269\u026a"+
		"\7~\2\2\u026a\u00a2\3\2\2\2\u026b\u026c\7}\2\2\u026c\u00a4\3\2\2\2\u026d"+
		"\u026e\7\177\2\2\u026e\u00a6\3\2\2\2\u026f\u0270\7.\2\2\u0270\u00a8\3"+
		"\2\2\2\u0271\u0272\7\60\2\2\u0272\u00aa\3\2\2\2\u0273\u0274\7]\2\2\u0274"+
		"\u00ac\3\2\2\2\u0275\u0276\7_\2\2\u0276\u00ae\3\2\2\2\u0277\u0278\7$\2"+
		"\2\u0278\u00b0\3\2\2\2\u0279\u027a\7A\2\2\u027a\u00b2\3\2\2\2\u027b\u027f"+
		"\7$\2\2\u027c\u027e\n\7\2\2\u027d\u027c\3\2\2\2\u027e\u0281\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027f\3\2"+
		"\2\2\u0282\u0283\7$\2\2\u0283\u00b4\3\2\2\2\16\2\u00b8\u00c2\u00d0\u01ec"+
		"\u01f1\u01f7\u0202\u0207\u0209\u0247\u027f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}