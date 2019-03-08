/* Generated By:JavaCC: Do not edit this line. MyParser.java */
import java.io.*;

public class MyParser implements MyParserConstants {
	public static void main(String[] args) {
		MyParser parser = null;
		try {
			if (args.length > 0)
				parser = new MyParser(new FileInputStream(args[0]));
			else
				parser = new MyParser(
						new FileInputStream("/home/cenez/workspace/gits/MiniJavaCompliler/src/fonte.txt")); // args[0]));
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + args[0]);
			return;
		}
		try {
			parser.Prog();// .Start();
		} catch (ParseException e) {
			System.out.println(e);
			return;
		} catch (TokenMgrError e) {
			System.out.println(e);
			return;
		}
		System.out.println("Successful parse");
	}

	static final public void Prog() throws ParseException {
		StmList();
		jj_consume_token(0);
	}

	static final public void StmList() throws ParseException {
		Stm();
		StmListPrime();
	}

	static final public void StmListPrime() throws ParseException {
		switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
		case SEMI:
			jj_consume_token(SEMI);
			Stm();
			StmListPrime();
			break;
		default:
			jj_la1[0] = jj_gen;
			;
		}
	}

	static final public void Stm() throws ParseException {
		switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
		case ID:
			jj_consume_token(ID);
			jj_consume_token(ASSIGN);
			jj_consume_token(ID);
			break;
		case WHILE:
			jj_consume_token(WHILE);
			jj_consume_token(ID);
			jj_consume_token(DO);
			Stm();
			break;
		case BEGIN:
			jj_consume_token(BEGIN);
			StmList();
			jj_consume_token(END);
			break;
		default:
			jj_la1[1] = jj_gen;
			if (jj_2_1(5)) {
				jj_consume_token(IF);
				jj_consume_token(ID);
				jj_consume_token(THEN);
				Stm();
			} else {
				switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
				case IF:
					jj_consume_token(IF);
					jj_consume_token(ID);
					jj_consume_token(THEN);
					Stm();
					jj_consume_token(ELSE);
					Stm();
					break;
				default:
					jj_la1[2] = jj_gen;
					jj_consume_token(-1);
					throw new ParseException();
				}
			}
		}
	}

	static private boolean jj_2_1(int xla) {
		jj_la = xla;
		jj_lastpos = jj_scanpos = token;
		try {
			return !jj_3_1();
		} catch (LookaheadSuccess ls) {
			return true;
		} finally {
			jj_save(0, xla);
		}
	}

	static private boolean jj_3R_6() {
		if (jj_3R_1())
			return true;
		return false;
	}

	static private boolean jj_3R_5() {
		if (jj_scan_token(IF))
			return true;
		if (jj_scan_token(ID))
			return true;
		return false;
	}

	static private boolean jj_3_1() {
		if (jj_scan_token(IF))
			return true;
		if (jj_scan_token(ID))
			return true;
		if (jj_scan_token(THEN))
			return true;
		if (jj_3R_1())
			return true;
		return false;
	}

	static private boolean jj_3R_4() {
		if (jj_scan_token(BEGIN))
			return true;
		if (jj_3R_6())
			return true;
		return false;
	}

	static private boolean jj_3R_3() {
		if (jj_scan_token(WHILE))
			return true;
		if (jj_scan_token(ID))
			return true;
		return false;
	}

	static private boolean jj_3R_2() {
		if (jj_scan_token(ID))
			return true;
		if (jj_scan_token(ASSIGN))
			return true;
		return false;
	}

	static private boolean jj_3R_1() {
		Token xsp;
		xsp = jj_scanpos;
		if (jj_3R_2()) {
			jj_scanpos = xsp;
			if (jj_3R_3()) {
				jj_scanpos = xsp;
				if (jj_3R_4()) {
					jj_scanpos = xsp;
					if (jj_3_1()) {
						jj_scanpos = xsp;
						if (jj_3R_5())
							return true;
					}
				}
			}
		}
		return false;
	}

	static private boolean jj_initialized_once = false;
	/** Generated Token Manager. */
	static public MyParserTokenManager token_source;
	static SimpleCharStream jj_input_stream;
	/** Current token. */
	static public Token token;
	/** Next token. */
	static public Token jj_nt;
	static private int jj_ntk;
	static private Token jj_scanpos, jj_lastpos;
	static private int jj_la;
	static private int jj_gen;
	static final private int[] jj_la1 = new int[3];
	static private int[] jj_la1_0;
	static {
		jj_la1_init_0();
	}

	private static void jj_la1_init_0() {
		jj_la1_0 = new int[] { 0x800, 0x2030, 0x100, };
	}

	static final private JJCalls[] jj_2_rtns = new JJCalls[1];
	static private boolean jj_rescan = false;
	static private int jj_gc = 0;

	/** Constructor with InputStream. */
	public MyParser(java.io.InputStream stream) {
		this(stream, null);
	}

	/** Constructor with InputStream and supplied encoding */
	public MyParser(java.io.InputStream stream, String encoding) {
		if (jj_initialized_once) {
			System.out.println("ERROR: Second call to constructor of static parser.  ");
			System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
			System.out.println("       during parser generation.");
			throw new Error();
		}
		jj_initialized_once = true;
		try {
			jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1);
		} catch (java.io.UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
		token_source = new MyParserTokenManager(jj_input_stream);
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 3; i++)
			jj_la1[i] = -1;
		for (int i = 0; i < jj_2_rtns.length; i++)
			jj_2_rtns[i] = new JJCalls();
	}

	/** Reinitialise. */
	static public void ReInit(java.io.InputStream stream) {
		ReInit(stream, null);
	}

	/** Reinitialise. */
	static public void ReInit(java.io.InputStream stream, String encoding) {
		try {
			jj_input_stream.ReInit(stream, encoding, 1, 1);
		} catch (java.io.UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
		token_source.ReInit(jj_input_stream);
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 3; i++)
			jj_la1[i] = -1;
		for (int i = 0; i < jj_2_rtns.length; i++)
			jj_2_rtns[i] = new JJCalls();
	}

	/** Constructor. */
	public MyParser(java.io.Reader stream) {
		if (jj_initialized_once) {
			System.out.println("ERROR: Second call to constructor of static parser. ");
			System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
			System.out.println("       during parser generation.");
			throw new Error();
		}
		jj_initialized_once = true;
		jj_input_stream = new SimpleCharStream(stream, 1, 1);
		token_source = new MyParserTokenManager(jj_input_stream);
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 3; i++)
			jj_la1[i] = -1;
		for (int i = 0; i < jj_2_rtns.length; i++)
			jj_2_rtns[i] = new JJCalls();
	}

	/** Reinitialise. */
	static public void ReInit(java.io.Reader stream) {
		jj_input_stream.ReInit(stream, 1, 1);
		token_source.ReInit(jj_input_stream);
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 3; i++)
			jj_la1[i] = -1;
		for (int i = 0; i < jj_2_rtns.length; i++)
			jj_2_rtns[i] = new JJCalls();
	}

	/** Constructor with generated Token Manager. */
	public MyParser(MyParserTokenManager tm) {
		if (jj_initialized_once) {
			System.out.println("ERROR: Second call to constructor of static parser. ");
			System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
			System.out.println("       during parser generation.");
			throw new Error();
		}
		jj_initialized_once = true;
		token_source = tm;
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 3; i++)
			jj_la1[i] = -1;
		for (int i = 0; i < jj_2_rtns.length; i++)
			jj_2_rtns[i] = new JJCalls();
	}

	/** Reinitialise. */
	public void ReInit(MyParserTokenManager tm) {
		token_source = tm;
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 3; i++)
			jj_la1[i] = -1;
		for (int i = 0; i < jj_2_rtns.length; i++)
			jj_2_rtns[i] = new JJCalls();
	}

	static private Token jj_consume_token(int kind) throws ParseException {
		Token oldToken;
		if ((oldToken = token).next != null)
			token = token.next;
		else
			token = token.next = token_source.getNextToken();
		jj_ntk = -1;
		if (token.kind == kind) {
			jj_gen++;
			if (++jj_gc > 100) {
				jj_gc = 0;
				for (int i = 0; i < jj_2_rtns.length; i++) {
					JJCalls c = jj_2_rtns[i];
					while (c != null) {
						if (c.gen < jj_gen)
							c.first = null;
						c = c.next;
					}
				}
			}
			return token;
		}
		token = oldToken;
		jj_kind = kind;
		throw generateParseException();
	}

	static private final class LookaheadSuccess extends java.lang.Error {
	}

	static final private LookaheadSuccess jj_ls = new LookaheadSuccess();

	static private boolean jj_scan_token(int kind) {
		if (jj_scanpos == jj_lastpos) {
			jj_la--;
			if (jj_scanpos.next == null) {
				jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
			} else {
				jj_lastpos = jj_scanpos = jj_scanpos.next;
			}
		} else {
			jj_scanpos = jj_scanpos.next;
		}
		if (jj_rescan) {
			int i = 0;
			Token tok = token;
			while (tok != null && tok != jj_scanpos) {
				i++;
				tok = tok.next;
			}
			if (tok != null)
				jj_add_error_token(kind, i);
		}
		if (jj_scanpos.kind != kind)
			return true;
		if (jj_la == 0 && jj_scanpos == jj_lastpos)
			throw jj_ls;
		return false;
	}

	/** Get the next Token. */
	static final public Token getNextToken() {
		if (token.next != null)
			token = token.next;
		else
			token = token.next = token_source.getNextToken();
		jj_ntk = -1;
		jj_gen++;
		return token;
	}

	/** Get the specific Token. */
	static final public Token getToken(int index) {
		Token t = token;
		for (int i = 0; i < index; i++) {
			if (t.next != null)
				t = t.next;
			else
				t = t.next = token_source.getNextToken();
		}
		return t;
	}

	static private int jj_ntk() {
		if ((jj_nt = token.next) == null)
			return (jj_ntk = (token.next = token_source.getNextToken()).kind);
		else
			return (jj_ntk = jj_nt.kind);
	}

	static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
	static private int[] jj_expentry;
	static private int jj_kind = -1;
	static private int[] jj_lasttokens = new int[100];
	static private int jj_endpos;

	static private void jj_add_error_token(int kind, int pos) {
		if (pos >= 100)
			return;
		if (pos == jj_endpos + 1) {
			jj_lasttokens[jj_endpos++] = kind;
		} else if (jj_endpos != 0) {
			jj_expentry = new int[jj_endpos];
			for (int i = 0; i < jj_endpos; i++) {
				jj_expentry[i] = jj_lasttokens[i];
			}
			jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
				int[] oldentry = (int[]) (it.next());
				if (oldentry.length == jj_expentry.length) {
					for (int i = 0; i < jj_expentry.length; i++) {
						if (oldentry[i] != jj_expentry[i]) {
							continue jj_entries_loop;
						}
					}
					jj_expentries.add(jj_expentry);
					break jj_entries_loop;
				}
			}
			if (pos != 0)
				jj_lasttokens[(jj_endpos = pos) - 1] = kind;
		}
	}

	/** Generate ParseException. */
	static public ParseException generateParseException() {
		jj_expentries.clear();
		boolean[] la1tokens = new boolean[14];
		if (jj_kind >= 0) {
			la1tokens[jj_kind] = true;
			jj_kind = -1;
		}
		for (int i = 0; i < 3; i++) {
			if (jj_la1[i] == jj_gen) {
				for (int j = 0; j < 32; j++) {
					if ((jj_la1_0[i] & (1 << j)) != 0) {
						la1tokens[j] = true;
					}
				}
			}
		}
		for (int i = 0; i < 14; i++) {
			if (la1tokens[i]) {
				jj_expentry = new int[1];
				jj_expentry[0] = i;
				jj_expentries.add(jj_expentry);
			}
		}
		jj_endpos = 0;
		jj_rescan_token();
		jj_add_error_token(0, 0);
		int[][] exptokseq = new int[jj_expentries.size()][];
		for (int i = 0; i < jj_expentries.size(); i++) {
			exptokseq[i] = jj_expentries.get(i);
		}
		return new ParseException(token, exptokseq, tokenImage);
	}

	/** Enable tracing. */
	static final public void enable_tracing() {
	}

	/** Disable tracing. */
	static final public void disable_tracing() {
	}

	static private void jj_rescan_token() {
		jj_rescan = true;
		for (int i = 0; i < 1; i++) {
			try {
				JJCalls p = jj_2_rtns[i];
				do {
					if (p.gen > jj_gen) {
						jj_la = p.arg;
						jj_lastpos = jj_scanpos = p.first;
						switch (i) {
						case 0:
							jj_3_1();
							break;
						}
					}
					p = p.next;
				} while (p != null);
			} catch (LookaheadSuccess ls) {
			}
		}
		jj_rescan = false;
	}

	static private void jj_save(int index, int xla) {
		JJCalls p = jj_2_rtns[index];
		while (p.gen > jj_gen) {
			if (p.next == null) {
				p = p.next = new JJCalls();
				break;
			}
			p = p.next;
		}
		p.gen = jj_gen + xla - jj_la;
		p.first = token;
		p.arg = xla;
	}

	static final class JJCalls {
		int gen;
		Token first;
		int arg;
		JJCalls next;
	}

}
