package co.edu.uniandes.miso4202.ehicletax.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVtdslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int RULE_DATATYPE=6;
    public static final int T__17=17;
    public static final int RULE_NUMBER=7;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators

    public InternalVtdslLexer() {;} 
    public InternalVtdslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVtdslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:11:7: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:12:7: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:12:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:13:7: ( ':' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:13:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:14:7: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:15:7: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:16:7: ( 'List of String' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:16:9: 'List of String'
            {
            match("List of String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:17:7: ( ',' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:18:7: ( 'List of Integer' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:18:9: 'List of Integer'
            {
            match("List of Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:19:7: ( 'def' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:19:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:20:7: ( '+' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:20:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:21:7: ( '-' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:21:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:22:7: ( '*' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:22:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:23:7: ( '/' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:23:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:24:7: ( '(' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:24:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:25:7: ( ')' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:25:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1347:13: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1347:15: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1347:15: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1347:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1347:27: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1347:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1347:32: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1347:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1349:10: ( 'this one has been deactivated' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1349:12: 'this one has been deactivated'
            {
            match("this one has been deactivated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DATATYPE"
    public final void mRULE_DATATYPE() throws RecognitionException {
        try {
            int _type = RULE_DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1351:15: ( ( 'Real' | 'Int' | 'String' | 'List of Integer' | 'List of String' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1351:17: ( 'Real' | 'Int' | 'String' | 'List of Integer' | 'List of String' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1351:17: ( 'Real' | 'Int' | 'String' | 'List of Integer' | 'List of String' )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1351:18: 'Real'
                    {
                    match("Real"); 


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1351:25: 'Int'
                    {
                    match("Int"); 


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1351:31: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1351:40: 'List of Integer'
                    {
                    match("List of Integer"); 


                    }
                    break;
                case 5 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1351:58: 'List of String'
                    {
                    match("List of String"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATATYPE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1353:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1353:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1353:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1353:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1353:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1355:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1355:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1355:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1355:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1355:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1355:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1355:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1355:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1355:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1355:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1355:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1357:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1357:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1357:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1357:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1359:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1359:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1359:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1359:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1359:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1359:41: ( '\\r' )? '\\n'
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1359:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1359:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1361:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1361:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1361:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1363:16: ( . )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1363:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_NUMBER | RULE_INT | RULE_DATATYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=24;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:100: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 17 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:112: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:121: RULE_DATATYPE
                {
                mRULE_DATATYPE(); 

                }
                break;
            case 19 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:135: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:143: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:155: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:171: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:187: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1:195: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\1\111\3\uffff\1\151\1\163\1\164\1\40\1\157\1\146\1\40\1\111\2"+
        "\uffff";
    static final String DFA4_maxS =
        "\1\123\3\uffff\1\151\1\163\1\164\1\40\1\157\1\146\1\40\1\123\2"+
        "\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\10\uffff\1\4\1\5";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\2\uffff\1\4\5\uffff\1\1\1\3",
            "",
            "",
            "",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14\11\uffff\1\15",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1351:17: ( 'Real' | 'Int' | 'String' | 'List of Integer' | 'List of String' )";
        }
    }
    static final String DFA15_eotS =
        "\1\21\5\uffff\1\42\1\uffff\1\42\3\uffff\1\52\3\uffff\1\33\1\uffff"+
        "\4\42\1\33\1\uffff\2\33\7\uffff\1\42\2\uffff\1\42\10\uffff\4\42"+
        "\2\uffff\1\42\1\72\2\42\1\75\2\42\1\uffff\1\42\1\75\1\uffff\1\42"+
        "\2\uffff\1\42\1\uffff\1\75\21\uffff";
    static final String DFA15_eofS =
        "\125\uffff";
    static final String DFA15_minS =
        "\1\0\5\uffff\1\151\1\uffff\1\145\3\uffff\1\52\3\uffff\1\60\1\uffff"+
        "\1\150\1\145\1\156\1\164\1\101\1\uffff\2\0\7\uffff\1\163\2\uffff"+
        "\1\146\10\uffff\1\151\1\141\1\164\1\162\2\uffff\1\164\1\60\1\163"+
        "\1\154\1\60\1\151\1\40\1\uffff\1\40\1\60\1\uffff\1\156\1\157\1\uffff"+
        "\1\147\1\146\1\60\1\40\1\111\1\164\1\156\1\162\1\164\1\151\1\145"+
        "\1\156\2\147\1\145\1\uffff\1\162\3\uffff";
    static final String DFA15_maxS =
        "\1\uffff\5\uffff\1\151\1\uffff\1\145\3\uffff\1\57\3\uffff\1\71"+
        "\1\uffff\1\150\1\145\1\156\1\164\1\172\1\uffff\2\uffff\7\uffff\1"+
        "\163\2\uffff\1\146\10\uffff\1\151\1\141\1\164\1\162\2\uffff\1\164"+
        "\1\172\1\163\1\154\1\172\1\151\1\40\1\uffff\1\40\1\172\1\uffff\1"+
        "\156\1\157\1\uffff\1\147\1\146\1\172\1\40\1\123\1\164\1\156\1\162"+
        "\1\164\1\151\1\145\1\156\2\147\1\145\1\uffff\1\162\3\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\uffff\1\12\1\13\1\14"+
        "\1\uffff\1\16\1\17\1\20\1\uffff\1\20\5\uffff\1\23\2\uffff\1\27\1"+
        "\30\1\1\1\2\1\3\1\4\1\5\1\uffff\1\23\1\7\1\uffff\1\12\1\13\1\14"+
        "\1\25\1\26\1\15\1\16\1\17\4\uffff\1\24\1\27\7\uffff\1\11\2\uffff"+
        "\1\22\2\uffff\1\21\17\uffff\1\6\1\uffff\1\6\2\10";
    static final String DFA15_specialS =
        "\1\0\27\uffff\1\1\1\2\73\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\30\4\33\1\31\1\15\1"+
            "\16\1\13\1\11\1\7\1\12\1\20\1\14\12\17\1\3\1\4\1\33\1\5\3\33"+
            "\10\27\1\24\2\27\1\6\5\27\1\23\1\25\7\27\3\33\1\26\1\27\1\33"+
            "\3\27\1\10\17\27\1\22\6\27\1\1\1\33\1\2\uff82\33",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "",
            "\1\44",
            "",
            "",
            "",
            "\1\50\4\uffff\1\51",
            "",
            "",
            "",
            "\12\21",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\0\61",
            "\0\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "",
            "\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\71",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\73",
            "\1\74",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\105",
            "\1\107\11\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\123",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_NUMBER | RULE_INT | RULE_DATATYPE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='{') ) {s = 1;}

                        else if ( (LA15_0=='}') ) {s = 2;}

                        else if ( (LA15_0==':') ) {s = 3;}

                        else if ( (LA15_0==';') ) {s = 4;}

                        else if ( (LA15_0=='=') ) {s = 5;}

                        else if ( (LA15_0=='L') ) {s = 6;}

                        else if ( (LA15_0==',') ) {s = 7;}

                        else if ( (LA15_0=='d') ) {s = 8;}

                        else if ( (LA15_0=='+') ) {s = 9;}

                        else if ( (LA15_0=='-') ) {s = 10;}

                        else if ( (LA15_0=='*') ) {s = 11;}

                        else if ( (LA15_0=='/') ) {s = 12;}

                        else if ( (LA15_0=='(') ) {s = 13;}

                        else if ( (LA15_0==')') ) {s = 14;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 15;}

                        else if ( (LA15_0=='.') ) {s = 16;}

                        else if ( (LA15_0=='t') ) {s = 18;}

                        else if ( (LA15_0=='R') ) {s = 19;}

                        else if ( (LA15_0=='I') ) {s = 20;}

                        else if ( (LA15_0=='S') ) {s = 21;}

                        else if ( (LA15_0=='^') ) {s = 22;}

                        else if ( ((LA15_0>='A' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='K')||(LA15_0>='M' && LA15_0<='Q')||(LA15_0>='T' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='c')||(LA15_0>='e' && LA15_0<='s')||(LA15_0>='u' && LA15_0<='z')) ) {s = 23;}

                        else if ( (LA15_0=='\"') ) {s = 24;}

                        else if ( (LA15_0=='\'') ) {s = 25;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 26;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||LA15_0=='<'||(LA15_0>='>' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 27;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_24 = input.LA(1);

                        s = -1;
                        if ( ((LA15_24>='\u0000' && LA15_24<='\uFFFF')) ) {s = 49;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_25 = input.LA(1);

                        s = -1;
                        if ( ((LA15_25>='\u0000' && LA15_25<='\uFFFF')) ) {s = 49;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}