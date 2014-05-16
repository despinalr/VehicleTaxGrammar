package co.edu.uniandes.miso4202.ehicletax.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.miso4202.ehicletax.services.VtdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVtdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DATATYPE", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'Registro'", "'Contacto'", "'Pago'", "':'", "';'", "'='", "'List of String'", "','", "'List of Integer'", "'def'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int RULE_DATATYPE=6;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=7;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalVtdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVtdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVtdslParser.tokenNames; }
    public String getGrammarFileName() { return "../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g"; }



     	private VtdslGrammarAccess grammarAccess;
     	
        public InternalVtdslParser(TokenStream input, VtdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected VtdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entidades_2_0= ruleEntidad ) )* otherlv_3= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entidades_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:79:28: ( ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entidades_2_0= ruleEntidad ) )* otherlv_3= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:80:1: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entidades_2_0= ruleEntidad ) )* otherlv_3= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:80:1: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entidades_2_0= ruleEntidad ) )* otherlv_3= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:80:2: ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_entidades_2_0= ruleEntidad ) )* otherlv_3= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:80:2: ( (lv_nombre_0_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:81:1: (lv_nombre_0_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:81:1: (lv_nombre_0_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:82:3: lv_nombre_0_0= RULE_ID
            {
            lv_nombre_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel127); 

            			newLeafNode(lv_nombre_0_0, grammarAccess.getModelAccess().getNombreIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleModel144); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:102:1: ( (lv_entidades_2_0= ruleEntidad ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:103:1: (lv_entidades_2_0= ruleEntidad )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:103:1: (lv_entidades_2_0= ruleEntidad )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:104:3: lv_entidades_2_0= ruleEntidad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getEntidadesEntidadParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntidad_in_ruleModel165);
            	    lv_entidades_2_0=ruleEntidad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entidades",
            	            		lv_entidades_2_0, 
            	            		"Entidad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleModel178); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntidad"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:132:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:133:2: (iv_ruleEntidad= ruleEntidad EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:134:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_ruleEntidad_in_entryRuleEntidad214);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntidad224); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:141:1: ruleEntidad returns [EObject current=null] : (this_Registro_0= ruleRegistro | this_Contacto_1= ruleContacto | this_Pago_2= rulePago ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        EObject this_Registro_0 = null;

        EObject this_Contacto_1 = null;

        EObject this_Pago_2 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:144:28: ( (this_Registro_0= ruleRegistro | this_Contacto_1= ruleContacto | this_Pago_2= rulePago ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:145:1: (this_Registro_0= ruleRegistro | this_Contacto_1= ruleContacto | this_Pago_2= rulePago )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:145:1: (this_Registro_0= ruleRegistro | this_Contacto_1= ruleContacto | this_Pago_2= rulePago )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:146:5: this_Registro_0= ruleRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getEntidadAccess().getRegistroParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRegistro_in_ruleEntidad271);
                    this_Registro_0=ruleRegistro();

                    state._fsp--;

                     
                            current = this_Registro_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:156:5: this_Contacto_1= ruleContacto
                    {
                     
                            newCompositeNode(grammarAccess.getEntidadAccess().getContactoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContacto_in_ruleEntidad298);
                    this_Contacto_1=ruleContacto();

                    state._fsp--;

                     
                            current = this_Contacto_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:166:5: this_Pago_2= rulePago
                    {
                     
                            newCompositeNode(grammarAccess.getEntidadAccess().getPagoParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePago_in_ruleEntidad325);
                    this_Pago_2=rulePago();

                    state._fsp--;

                     
                            current = this_Pago_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleRegistro"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:182:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:183:2: (iv_ruleRegistro= ruleRegistro EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:184:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FOLLOW_ruleRegistro_in_entryRuleRegistro360);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegistro370); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegistro"


    // $ANTLR start "ruleRegistro"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:191:1: ruleRegistro returns [EObject current=null] : ( () otherlv_1= 'Registro' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleObjeto ) )* otherlv_5= '}' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nombre_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_propiedades_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:194:28: ( ( () otherlv_1= 'Registro' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleObjeto ) )* otherlv_5= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:195:1: ( () otherlv_1= 'Registro' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleObjeto ) )* otherlv_5= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:195:1: ( () otherlv_1= 'Registro' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleObjeto ) )* otherlv_5= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:195:2: () otherlv_1= 'Registro' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleObjeto ) )* otherlv_5= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:195:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:196:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRegistroAccess().getRegistroAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleRegistro416); 

                	newLeafNode(otherlv_1, grammarAccess.getRegistroAccess().getRegistroKeyword_1());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:205:1: ( (lv_nombre_2_0= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:206:1: (lv_nombre_2_0= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:206:1: (lv_nombre_2_0= RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:207:3: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegistro433); 

            			newLeafNode(lv_nombre_2_0, grammarAccess.getRegistroAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRegistroRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRegistro450); 

                	newLeafNode(otherlv_3, grammarAccess.getRegistroAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:227:1: ( (lv_propiedades_4_0= ruleObjeto ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:228:1: (lv_propiedades_4_0= ruleObjeto )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:228:1: (lv_propiedades_4_0= ruleObjeto )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:229:3: lv_propiedades_4_0= ruleObjeto
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getPropiedadesObjetoParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjeto_in_ruleRegistro471);
            	    lv_propiedades_4_0=ruleObjeto();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"propiedades",
            	            		lv_propiedades_4_0, 
            	            		"Objeto");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleRegistro484); 

                	newLeafNode(otherlv_5, grammarAccess.getRegistroAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegistro"


    // $ANTLR start "entryRuleContacto"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:257:1: entryRuleContacto returns [EObject current=null] : iv_ruleContacto= ruleContacto EOF ;
    public final EObject entryRuleContacto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContacto = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:258:2: (iv_ruleContacto= ruleContacto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:259:2: iv_ruleContacto= ruleContacto EOF
            {
             newCompositeNode(grammarAccess.getContactoRule()); 
            pushFollow(FOLLOW_ruleContacto_in_entryRuleContacto520);
            iv_ruleContacto=ruleContacto();

            state._fsp--;

             current =iv_ruleContacto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContacto530); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContacto"


    // $ANTLR start "ruleContacto"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:266:1: ruleContacto returns [EObject current=null] : ( () otherlv_1= 'Contacto' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleAtributo ) )* otherlv_5= '}' ) ;
    public final EObject ruleContacto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nombre_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_propiedades_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:269:28: ( ( () otherlv_1= 'Contacto' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleAtributo ) )* otherlv_5= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:270:1: ( () otherlv_1= 'Contacto' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleAtributo ) )* otherlv_5= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:270:1: ( () otherlv_1= 'Contacto' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleAtributo ) )* otherlv_5= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:270:2: () otherlv_1= 'Contacto' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleAtributo ) )* otherlv_5= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:270:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:271:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContactoAccess().getContactoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleContacto576); 

                	newLeafNode(otherlv_1, grammarAccess.getContactoAccess().getContactoKeyword_1());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:280:1: ( (lv_nombre_2_0= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:281:1: (lv_nombre_2_0= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:281:1: (lv_nombre_2_0= RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:282:3: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContacto593); 

            			newLeafNode(lv_nombre_2_0, grammarAccess.getContactoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContactoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleContacto610); 

                	newLeafNode(otherlv_3, grammarAccess.getContactoAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:302:1: ( (lv_propiedades_4_0= ruleAtributo ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:303:1: (lv_propiedades_4_0= ruleAtributo )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:303:1: (lv_propiedades_4_0= ruleAtributo )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:304:3: lv_propiedades_4_0= ruleAtributo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContactoAccess().getPropiedadesAtributoParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtributo_in_ruleContacto631);
            	    lv_propiedades_4_0=ruleAtributo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContactoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"propiedades",
            	            		lv_propiedades_4_0, 
            	            		"Atributo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleContacto644); 

                	newLeafNode(otherlv_5, grammarAccess.getContactoAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContacto"


    // $ANTLR start "entryRulePago"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:332:1: entryRulePago returns [EObject current=null] : iv_rulePago= rulePago EOF ;
    public final EObject entryRulePago() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePago = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:333:2: (iv_rulePago= rulePago EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:334:2: iv_rulePago= rulePago EOF
            {
             newCompositeNode(grammarAccess.getPagoRule()); 
            pushFollow(FOLLOW_rulePago_in_entryRulePago680);
            iv_rulePago=rulePago();

            state._fsp--;

             current =iv_rulePago; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePago690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePago"


    // $ANTLR start "rulePago"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:341:1: rulePago returns [EObject current=null] : ( () otherlv_1= 'Pago' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleAtributo ) )* otherlv_5= '}' ) ;
    public final EObject rulePago() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nombre_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_propiedades_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:344:28: ( ( () otherlv_1= 'Pago' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleAtributo ) )* otherlv_5= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:345:1: ( () otherlv_1= 'Pago' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleAtributo ) )* otherlv_5= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:345:1: ( () otherlv_1= 'Pago' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleAtributo ) )* otherlv_5= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:345:2: () otherlv_1= 'Pago' ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= ruleAtributo ) )* otherlv_5= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:345:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:346:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPagoAccess().getPagoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_rulePago736); 

                	newLeafNode(otherlv_1, grammarAccess.getPagoAccess().getPagoKeyword_1());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:355:1: ( (lv_nombre_2_0= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:356:1: (lv_nombre_2_0= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:356:1: (lv_nombre_2_0= RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:357:3: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePago753); 

            			newLeafNode(lv_nombre_2_0, grammarAccess.getPagoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPagoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePago770); 

                	newLeafNode(otherlv_3, grammarAccess.getPagoAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:377:1: ( (lv_propiedades_4_0= ruleAtributo ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:378:1: (lv_propiedades_4_0= ruleAtributo )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:378:1: (lv_propiedades_4_0= ruleAtributo )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:379:3: lv_propiedades_4_0= ruleAtributo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPagoAccess().getPropiedadesAtributoParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtributo_in_rulePago791);
            	    lv_propiedades_4_0=ruleAtributo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPagoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"propiedades",
            	            		lv_propiedades_4_0, 
            	            		"Atributo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_rulePago804); 

                	newLeafNode(otherlv_5, grammarAccess.getPagoAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePago"


    // $ANTLR start "entryRulePropiedad"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:407:1: entryRulePropiedad returns [EObject current=null] : iv_rulePropiedad= rulePropiedad EOF ;
    public final EObject entryRulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropiedad = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:408:2: (iv_rulePropiedad= rulePropiedad EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:409:2: iv_rulePropiedad= rulePropiedad EOF
            {
             newCompositeNode(grammarAccess.getPropiedadRule()); 
            pushFollow(FOLLOW_rulePropiedad_in_entryRulePropiedad840);
            iv_rulePropiedad=rulePropiedad();

            state._fsp--;

             current =iv_rulePropiedad; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropiedad850); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropiedad"


    // $ANTLR start "rulePropiedad"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:416:1: rulePropiedad returns [EObject current=null] : (this_Objeto_0= ruleObjeto | this_Atributo_1= ruleAtributo ) ;
    public final EObject rulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject this_Objeto_0 = null;

        EObject this_Atributo_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:419:28: ( (this_Objeto_0= ruleObjeto | this_Atributo_1= ruleAtributo ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:420:1: (this_Objeto_0= ruleObjeto | this_Atributo_1= ruleAtributo )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:420:1: (this_Objeto_0= ruleObjeto | this_Atributo_1= ruleAtributo )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==18||LA6_1==20) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_STRING||LA6_1==13) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:421:5: this_Objeto_0= ruleObjeto
                    {
                     
                            newCompositeNode(grammarAccess.getPropiedadAccess().getObjetoParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObjeto_in_rulePropiedad897);
                    this_Objeto_0=ruleObjeto();

                    state._fsp--;

                     
                            current = this_Objeto_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:431:5: this_Atributo_1= ruleAtributo
                    {
                     
                            newCompositeNode(grammarAccess.getPropiedadAccess().getAtributoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtributo_in_rulePropiedad924);
                    this_Atributo_1=ruleAtributo();

                    state._fsp--;

                     
                            current = this_Atributo_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropiedad"


    // $ANTLR start "entryRuleObjeto"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:447:1: entryRuleObjeto returns [EObject current=null] : iv_ruleObjeto= ruleObjeto EOF ;
    public final EObject entryRuleObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjeto = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:448:2: (iv_ruleObjeto= ruleObjeto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:449:2: iv_ruleObjeto= ruleObjeto EOF
            {
             newCompositeNode(grammarAccess.getObjetoRule()); 
            pushFollow(FOLLOW_ruleObjeto_in_entryRuleObjeto959);
            iv_ruleObjeto=ruleObjeto();

            state._fsp--;

             current =iv_ruleObjeto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjeto969); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjeto"


    // $ANTLR start "ruleObjeto"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:456:1: ruleObjeto returns [EObject current=null] : ( () ( (lv_nombre_1_0= RULE_ID ) ) ( (lv_descripcion_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_propiedades_4_0= rulePropiedad ) )* otherlv_5= '}' ) ;
    public final EObject ruleObjeto() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_0=null;
        Token lv_descripcion_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_propiedades_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:459:28: ( ( () ( (lv_nombre_1_0= RULE_ID ) ) ( (lv_descripcion_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_propiedades_4_0= rulePropiedad ) )* otherlv_5= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:460:1: ( () ( (lv_nombre_1_0= RULE_ID ) ) ( (lv_descripcion_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_propiedades_4_0= rulePropiedad ) )* otherlv_5= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:460:1: ( () ( (lv_nombre_1_0= RULE_ID ) ) ( (lv_descripcion_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_propiedades_4_0= rulePropiedad ) )* otherlv_5= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:460:2: () ( (lv_nombre_1_0= RULE_ID ) ) ( (lv_descripcion_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_propiedades_4_0= rulePropiedad ) )* otherlv_5= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:460:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:461:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getObjetoAccess().getObjetoAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:466:2: ( (lv_nombre_1_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:467:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:467:1: (lv_nombre_1_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:468:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjeto1020); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getObjetoAccess().getNombreIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjetoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"ID");
            	    

            }


            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:484:2: ( (lv_descripcion_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:485:1: (lv_descripcion_2_0= RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:485:1: (lv_descripcion_2_0= RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:486:3: lv_descripcion_2_0= RULE_STRING
                    {
                    lv_descripcion_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleObjeto1042); 

                    			newLeafNode(lv_descripcion_2_0, grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjetoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"descripcion",
                            		lv_descripcion_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleObjeto1060); 

                	newLeafNode(otherlv_3, grammarAccess.getObjetoAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:506:1: ( (lv_propiedades_4_0= rulePropiedad ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:507:1: (lv_propiedades_4_0= rulePropiedad )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:507:1: (lv_propiedades_4_0= rulePropiedad )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:508:3: lv_propiedades_4_0= rulePropiedad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjetoAccess().getPropiedadesPropiedadParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropiedad_in_ruleObjeto1081);
            	    lv_propiedades_4_0=rulePropiedad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjetoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"propiedades",
            	            		lv_propiedades_4_0, 
            	            		"Propiedad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleObjeto1094); 

                	newLeafNode(otherlv_5, grammarAccess.getObjetoAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjeto"


    // $ANTLR start "entryRuleAtributoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:536:1: entryRuleAtributoSimple returns [EObject current=null] : iv_ruleAtributoSimple= ruleAtributoSimple EOF ;
    public final EObject entryRuleAtributoSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoSimple = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:537:2: (iv_ruleAtributoSimple= ruleAtributoSimple EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:538:2: iv_ruleAtributoSimple= ruleAtributoSimple EOF
            {
             newCompositeNode(grammarAccess.getAtributoSimpleRule()); 
            pushFollow(FOLLOW_ruleAtributoSimple_in_entryRuleAtributoSimple1130);
            iv_ruleAtributoSimple=ruleAtributoSimple();

            state._fsp--;

             current =iv_ruleAtributoSimple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoSimple1140); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributoSimple"


    // $ANTLR start "ruleAtributoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:545:1: ruleAtributoSimple returns [EObject current=null] : ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= ';' ) ;
    public final EObject ruleAtributoSimple() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_1=null;
        Token lv_nombre_1_2=null;
        Token otherlv_2=null;
        Token lv_tipo_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:548:28: ( ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:549:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:549:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:549:2: () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:549:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:550:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoSimpleAccess().getAtributoSimpleAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:555:2: ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:556:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:556:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:557:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:557:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:558:3: lv_nombre_1_1= RULE_ID
                    {
                    lv_nombre_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributoSimple1193); 

                    			newLeafNode(lv_nombre_1_1, grammarAccess.getAtributoSimpleAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributoSimpleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:573:8: lv_nombre_1_2= RULE_STRING
                    {
                    lv_nombre_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoSimple1213); 

                    			newLeafNode(lv_nombre_1_2, grammarAccess.getAtributoSimpleAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributoSimpleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAtributoSimple1233); 

                	newLeafNode(otherlv_2, grammarAccess.getAtributoSimpleAccess().getColonKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:595:1: ( (lv_tipo_3_0= RULE_DATATYPE ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:596:1: (lv_tipo_3_0= RULE_DATATYPE )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:596:1: (lv_tipo_3_0= RULE_DATATYPE )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:597:3: lv_tipo_3_0= RULE_DATATYPE
            {
            lv_tipo_3_0=(Token)match(input,RULE_DATATYPE,FOLLOW_RULE_DATATYPE_in_ruleAtributoSimple1250); 

            			newLeafNode(lv_tipo_3_0, grammarAccess.getAtributoSimpleAccess().getTipoDATATYPETerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtributoSimpleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"tipo",
                    		lv_tipo_3_0, 
                    		"DATATYPE");
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAtributoSimple1267); 

                	newLeafNode(otherlv_4, grammarAccess.getAtributoSimpleAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributoSimple"


    // $ANTLR start "entryRuleAtributoInicializado"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:625:1: entryRuleAtributoInicializado returns [EObject current=null] : iv_ruleAtributoInicializado= ruleAtributoInicializado EOF ;
    public final EObject entryRuleAtributoInicializado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoInicializado = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:626:2: (iv_ruleAtributoInicializado= ruleAtributoInicializado EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:627:2: iv_ruleAtributoInicializado= ruleAtributoInicializado EOF
            {
             newCompositeNode(grammarAccess.getAtributoInicializadoRule()); 
            pushFollow(FOLLOW_ruleAtributoInicializado_in_entryRuleAtributoInicializado1303);
            iv_ruleAtributoInicializado=ruleAtributoInicializado();

            state._fsp--;

             current =iv_ruleAtributoInicializado; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoInicializado1313); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributoInicializado"


    // $ANTLR start "ruleAtributoInicializado"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:634:1: ruleAtributoInicializado returns [EObject current=null] : ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= '=' ( (lv_valor_5_0= RULE_NUMBER ) ) otherlv_6= ';' ) ;
    public final EObject ruleAtributoInicializado() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_1=null;
        Token lv_nombre_1_2=null;
        Token otherlv_2=null;
        Token lv_tipo_3_0=null;
        Token otherlv_4=null;
        Token lv_valor_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:637:28: ( ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= '=' ( (lv_valor_5_0= RULE_NUMBER ) ) otherlv_6= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:638:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= '=' ( (lv_valor_5_0= RULE_NUMBER ) ) otherlv_6= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:638:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= '=' ( (lv_valor_5_0= RULE_NUMBER ) ) otherlv_6= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:638:2: () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= '=' ( (lv_valor_5_0= RULE_NUMBER ) ) otherlv_6= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:638:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:639:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoInicializadoAccess().getAtributoInicializadoAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:644:2: ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:645:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:645:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:646:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:646:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:647:3: lv_nombre_1_1= RULE_ID
                    {
                    lv_nombre_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributoInicializado1366); 

                    			newLeafNode(lv_nombre_1_1, grammarAccess.getAtributoInicializadoAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributoInicializadoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:662:8: lv_nombre_1_2= RULE_STRING
                    {
                    lv_nombre_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoInicializado1386); 

                    			newLeafNode(lv_nombre_1_2, grammarAccess.getAtributoInicializadoAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributoInicializadoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAtributoInicializado1406); 

                	newLeafNode(otherlv_2, grammarAccess.getAtributoInicializadoAccess().getColonKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:684:1: ( (lv_tipo_3_0= RULE_DATATYPE ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:685:1: (lv_tipo_3_0= RULE_DATATYPE )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:685:1: (lv_tipo_3_0= RULE_DATATYPE )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:686:3: lv_tipo_3_0= RULE_DATATYPE
            {
            lv_tipo_3_0=(Token)match(input,RULE_DATATYPE,FOLLOW_RULE_DATATYPE_in_ruleAtributoInicializado1423); 

            			newLeafNode(lv_tipo_3_0, grammarAccess.getAtributoInicializadoAccess().getTipoDATATYPETerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtributoInicializadoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"tipo",
                    		lv_tipo_3_0, 
                    		"DATATYPE");
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleAtributoInicializado1440); 

                	newLeafNode(otherlv_4, grammarAccess.getAtributoInicializadoAccess().getEqualsSignKeyword_4());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:706:1: ( (lv_valor_5_0= RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:707:1: (lv_valor_5_0= RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:707:1: (lv_valor_5_0= RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:708:3: lv_valor_5_0= RULE_NUMBER
            {
            lv_valor_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAtributoInicializado1457); 

            			newLeafNode(lv_valor_5_0, grammarAccess.getAtributoInicializadoAccess().getValorNUMBERTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtributoInicializadoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"valor",
                    		lv_valor_5_0, 
                    		"NUMBER");
            	    

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleAtributoInicializado1474); 

                	newLeafNode(otherlv_6, grammarAccess.getAtributoInicializadoAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributoInicializado"


    // $ANTLR start "entryRuleAtributoListaString"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:736:1: entryRuleAtributoListaString returns [EObject current=null] : iv_ruleAtributoListaString= ruleAtributoListaString EOF ;
    public final EObject entryRuleAtributoListaString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoListaString = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:737:2: (iv_ruleAtributoListaString= ruleAtributoListaString EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:738:2: iv_ruleAtributoListaString= ruleAtributoListaString EOF
            {
             newCompositeNode(grammarAccess.getAtributoListaStringRule()); 
            pushFollow(FOLLOW_ruleAtributoListaString_in_entryRuleAtributoListaString1510);
            iv_ruleAtributoListaString=ruleAtributoListaString();

            state._fsp--;

             current =iv_ruleAtributoListaString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoListaString1520); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributoListaString"


    // $ANTLR start "ruleAtributoListaString"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:745:1: ruleAtributoListaString returns [EObject current=null] : ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of String' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )* otherlv_9= '}' otherlv_10= ';' ) ;
    public final EObject ruleAtributoListaString() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_1=null;
        Token lv_nombre_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_valores_6_0=null;
        Token otherlv_7=null;
        Token lv_valores_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:748:28: ( ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of String' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )* otherlv_9= '}' otherlv_10= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:749:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of String' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )* otherlv_9= '}' otherlv_10= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:749:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of String' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )* otherlv_9= '}' otherlv_10= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:749:2: () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of String' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )* otherlv_9= '}' otherlv_10= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:749:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:750:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoListaStringAccess().getAtributoListaStringAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:755:2: ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:756:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:756:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:757:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:757:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:758:3: lv_nombre_1_1= RULE_ID
                    {
                    lv_nombre_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributoListaString1573); 

                    			newLeafNode(lv_nombre_1_1, grammarAccess.getAtributoListaStringAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributoListaStringRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:773:8: lv_nombre_1_2= RULE_STRING
                    {
                    lv_nombre_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoListaString1593); 

                    			newLeafNode(lv_nombre_1_2, grammarAccess.getAtributoListaStringAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributoListaStringRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAtributoListaString1613); 

                	newLeafNode(otherlv_2, grammarAccess.getAtributoListaStringAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAtributoListaString1625); 

                	newLeafNode(otherlv_3, grammarAccess.getAtributoListaStringAccess().getListOfStringKeyword_3());
                
            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleAtributoListaString1637); 

                	newLeafNode(otherlv_4, grammarAccess.getAtributoListaStringAccess().getEqualsSignKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAtributoListaString1649); 

                	newLeafNode(otherlv_5, grammarAccess.getAtributoListaStringAccess().getLeftCurlyBracketKeyword_5());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:807:1: ( (lv_valores_6_0= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:808:1: (lv_valores_6_0= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:808:1: (lv_valores_6_0= RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:809:3: lv_valores_6_0= RULE_STRING
            {
            lv_valores_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoListaString1666); 

            			newLeafNode(lv_valores_6_0, grammarAccess.getAtributoListaStringAccess().getValoresSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtributoListaStringRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"valores",
                    		lv_valores_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:825:2: (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:825:4: otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleAtributoListaString1684); 

            	        	newLeafNode(otherlv_7, grammarAccess.getAtributoListaStringAccess().getCommaKeyword_7_0());
            	        
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:829:1: ( (lv_valores_8_0= RULE_STRING ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:830:1: (lv_valores_8_0= RULE_STRING )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:830:1: (lv_valores_8_0= RULE_STRING )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:831:3: lv_valores_8_0= RULE_STRING
            	    {
            	    lv_valores_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoListaString1701); 

            	    			newLeafNode(lv_valores_8_0, grammarAccess.getAtributoListaStringAccess().getValoresSTRINGTerminalRuleCall_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAtributoListaStringRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"valores",
            	            		lv_valores_8_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleAtributoListaString1720); 

                	newLeafNode(otherlv_9, grammarAccess.getAtributoListaStringAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleAtributoListaString1732); 

                	newLeafNode(otherlv_10, grammarAccess.getAtributoListaStringAccess().getSemicolonKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributoListaString"


    // $ANTLR start "entryRuleAtributoListaInteger"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:863:1: entryRuleAtributoListaInteger returns [EObject current=null] : iv_ruleAtributoListaInteger= ruleAtributoListaInteger EOF ;
    public final EObject entryRuleAtributoListaInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoListaInteger = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:864:2: (iv_ruleAtributoListaInteger= ruleAtributoListaInteger EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:865:2: iv_ruleAtributoListaInteger= ruleAtributoListaInteger EOF
            {
             newCompositeNode(grammarAccess.getAtributoListaIntegerRule()); 
            pushFollow(FOLLOW_ruleAtributoListaInteger_in_entryRuleAtributoListaInteger1768);
            iv_ruleAtributoListaInteger=ruleAtributoListaInteger();

            state._fsp--;

             current =iv_ruleAtributoListaInteger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoListaInteger1778); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributoListaInteger"


    // $ANTLR start "ruleAtributoListaInteger"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:872:1: ruleAtributoListaInteger returns [EObject current=null] : ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of Integer' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_NUMBER ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )* otherlv_9= '}' otherlv_10= ';' ) ;
    public final EObject ruleAtributoListaInteger() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_1=null;
        Token lv_nombre_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_valores_6_0=null;
        Token otherlv_7=null;
        Token lv_valores_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:875:28: ( ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of Integer' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_NUMBER ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )* otherlv_9= '}' otherlv_10= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:876:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of Integer' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_NUMBER ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )* otherlv_9= '}' otherlv_10= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:876:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of Integer' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_NUMBER ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )* otherlv_9= '}' otherlv_10= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:876:2: () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of Integer' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_NUMBER ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )* otherlv_9= '}' otherlv_10= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:876:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:877:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoListaIntegerAccess().getAtributoListaIntegerAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:882:2: ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:883:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:883:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:884:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:884:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:885:3: lv_nombre_1_1= RULE_ID
                    {
                    lv_nombre_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributoListaInteger1831); 

                    			newLeafNode(lv_nombre_1_1, grammarAccess.getAtributoListaIntegerAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributoListaIntegerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:900:8: lv_nombre_1_2= RULE_STRING
                    {
                    lv_nombre_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoListaInteger1851); 

                    			newLeafNode(lv_nombre_1_2, grammarAccess.getAtributoListaIntegerAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributoListaIntegerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAtributoListaInteger1871); 

                	newLeafNode(otherlv_2, grammarAccess.getAtributoListaIntegerAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleAtributoListaInteger1883); 

                	newLeafNode(otherlv_3, grammarAccess.getAtributoListaIntegerAccess().getListOfIntegerKeyword_3());
                
            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleAtributoListaInteger1895); 

                	newLeafNode(otherlv_4, grammarAccess.getAtributoListaIntegerAccess().getEqualsSignKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAtributoListaInteger1907); 

                	newLeafNode(otherlv_5, grammarAccess.getAtributoListaIntegerAccess().getLeftCurlyBracketKeyword_5());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:934:1: ( (lv_valores_6_0= RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:935:1: (lv_valores_6_0= RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:935:1: (lv_valores_6_0= RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:936:3: lv_valores_6_0= RULE_NUMBER
            {
            lv_valores_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAtributoListaInteger1924); 

            			newLeafNode(lv_valores_6_0, grammarAccess.getAtributoListaIntegerAccess().getValoresNUMBERTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtributoListaIntegerRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"valores",
                    		lv_valores_6_0, 
                    		"NUMBER");
            	    

            }


            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:952:2: (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:952:4: otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleAtributoListaInteger1942); 

            	        	newLeafNode(otherlv_7, grammarAccess.getAtributoListaIntegerAccess().getCommaKeyword_7_0());
            	        
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:956:1: ( (lv_valores_8_0= RULE_NUMBER ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:957:1: (lv_valores_8_0= RULE_NUMBER )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:957:1: (lv_valores_8_0= RULE_NUMBER )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:958:3: lv_valores_8_0= RULE_NUMBER
            	    {
            	    lv_valores_8_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAtributoListaInteger1959); 

            	    			newLeafNode(lv_valores_8_0, grammarAccess.getAtributoListaIntegerAccess().getValoresNUMBERTerminalRuleCall_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAtributoListaIntegerRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"valores",
            	            		lv_valores_8_0, 
            	            		"NUMBER");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleAtributoListaInteger1978); 

                	newLeafNode(otherlv_9, grammarAccess.getAtributoListaIntegerAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleAtributoListaInteger1990); 

                	newLeafNode(otherlv_10, grammarAccess.getAtributoListaIntegerAccess().getSemicolonKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributoListaInteger"


    // $ANTLR start "entryRuleAtributoLista"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:990:1: entryRuleAtributoLista returns [EObject current=null] : iv_ruleAtributoLista= ruleAtributoLista EOF ;
    public final EObject entryRuleAtributoLista() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoLista = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:991:2: (iv_ruleAtributoLista= ruleAtributoLista EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:992:2: iv_ruleAtributoLista= ruleAtributoLista EOF
            {
             newCompositeNode(grammarAccess.getAtributoListaRule()); 
            pushFollow(FOLLOW_ruleAtributoLista_in_entryRuleAtributoLista2026);
            iv_ruleAtributoLista=ruleAtributoLista();

            state._fsp--;

             current =iv_ruleAtributoLista; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoLista2036); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributoLista"


    // $ANTLR start "ruleAtributoLista"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:999:1: ruleAtributoLista returns [EObject current=null] : (this_AtributoListaString_0= ruleAtributoListaString | this_AtributoListaInteger_1= ruleAtributoListaInteger ) ;
    public final EObject ruleAtributoLista() throws RecognitionException {
        EObject current = null;

        EObject this_AtributoListaString_0 = null;

        EObject this_AtributoListaInteger_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1002:28: ( (this_AtributoListaString_0= ruleAtributoListaString | this_AtributoListaInteger_1= ruleAtributoListaInteger ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1003:1: (this_AtributoListaString_0= ruleAtributoListaString | this_AtributoListaInteger_1= ruleAtributoListaInteger )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1003:1: (this_AtributoListaString_0= ruleAtributoListaString | this_AtributoListaInteger_1= ruleAtributoListaInteger )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==18) ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==21) ) {
                        alt15=1;
                    }
                    else if ( (LA15_3==23) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==RULE_STRING) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==18) ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==21) ) {
                        alt15=1;
                    }
                    else if ( (LA15_3==23) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1004:5: this_AtributoListaString_0= ruleAtributoListaString
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoListaAccess().getAtributoListaStringParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtributoListaString_in_ruleAtributoLista2083);
                    this_AtributoListaString_0=ruleAtributoListaString();

                    state._fsp--;

                     
                            current = this_AtributoListaString_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1014:5: this_AtributoListaInteger_1= ruleAtributoListaInteger
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoListaAccess().getAtributoListaIntegerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtributoListaInteger_in_ruleAtributoLista2110);
                    this_AtributoListaInteger_1=ruleAtributoListaInteger();

                    state._fsp--;

                     
                            current = this_AtributoListaInteger_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributoLista"


    // $ANTLR start "entryRuleFormula"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1030:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1031:2: (iv_ruleFormula= ruleFormula EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1032:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula2145);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula2155); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1039:1: ruleFormula returns [EObject current=null] : ( () ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresiones_3_0= ruleExpression ) )* otherlv_4= ';' ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expresiones_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1042:28: ( ( () ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresiones_3_0= ruleExpression ) )* otherlv_4= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1043:1: ( () ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresiones_3_0= ruleExpression ) )* otherlv_4= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1043:1: ( () ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresiones_3_0= ruleExpression ) )* otherlv_4= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1043:2: () ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresiones_3_0= ruleExpression ) )* otherlv_4= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1043:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1044:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFormulaAccess().getFormulaAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1049:2: ( (lv_nombre_1_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1050:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1050:1: (lv_nombre_1_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1051:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormula2206); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getFormulaAccess().getNombreIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormulaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleFormula2223); 

                	newLeafNode(otherlv_2, grammarAccess.getFormulaAccess().getEqualsSignKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1071:1: ( (lv_expresiones_3_0= ruleExpression ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==RULE_NUMBER||LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1072:1: (lv_expresiones_3_0= ruleExpression )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1072:1: (lv_expresiones_3_0= ruleExpression )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1073:3: lv_expresiones_3_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFormulaAccess().getExpresionesExpressionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleFormula2244);
            	    lv_expresiones_3_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFormulaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expresiones",
            	            		lv_expresiones_3_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleFormula2257); 

                	newLeafNode(otherlv_4, grammarAccess.getFormulaAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1101:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1102:2: (iv_ruleAtributo= ruleAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1103:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_ruleAtributo_in_entryRuleAtributo2293);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributo2303); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1110:1: ruleAtributo returns [EObject current=null] : (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoInicializado_1= ruleAtributoInicializado | this_Formula_2= ruleFormula | this_AtributoLista_3= ruleAtributoLista ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        EObject this_AtributoSimple_0 = null;

        EObject this_AtributoInicializado_1 = null;

        EObject this_Formula_2 = null;

        EObject this_AtributoLista_3 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1113:28: ( (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoInicializado_1= ruleAtributoInicializado | this_Formula_2= ruleFormula | this_AtributoLista_3= ruleAtributoLista ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1114:1: (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoInicializado_1= ruleAtributoInicializado | this_Formula_2= ruleFormula | this_AtributoLista_3= ruleAtributoLista )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1114:1: (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoInicializado_1= ruleAtributoInicializado | this_Formula_2= ruleFormula | this_AtributoLista_3= ruleAtributoLista )
            int alt17=4;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==18) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==21||LA17_3==23) ) {
                        alt17=4;
                    }
                    else if ( (LA17_3==RULE_DATATYPE) ) {
                        int LA17_6 = input.LA(4);

                        if ( (LA17_6==19) ) {
                            alt17=1;
                        }
                        else if ( (LA17_6==20) ) {
                            alt17=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA17_1==20) ) {
                    alt17=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==RULE_STRING) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==18) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==21||LA17_3==23) ) {
                        alt17=4;
                    }
                    else if ( (LA17_3==RULE_DATATYPE) ) {
                        int LA17_6 = input.LA(4);

                        if ( (LA17_6==19) ) {
                            alt17=1;
                        }
                        else if ( (LA17_6==20) ) {
                            alt17=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1115:5: this_AtributoSimple_0= ruleAtributoSimple
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtributoSimple_in_ruleAtributo2350);
                    this_AtributoSimple_0=ruleAtributoSimple();

                    state._fsp--;

                     
                            current = this_AtributoSimple_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1125:5: this_AtributoInicializado_1= ruleAtributoInicializado
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getAtributoInicializadoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtributoInicializado_in_ruleAtributo2377);
                    this_AtributoInicializado_1=ruleAtributoInicializado();

                    state._fsp--;

                     
                            current = this_AtributoInicializado_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1135:5: this_Formula_2= ruleFormula
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getFormulaParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFormula_in_ruleAtributo2404);
                    this_Formula_2=ruleFormula();

                    state._fsp--;

                     
                            current = this_Formula_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1145:5: this_AtributoLista_3= ruleAtributoLista
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getAtributoListaParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAtributoLista_in_ruleAtributo2431);
                    this_AtributoLista_3=ruleAtributoLista();

                    state._fsp--;

                     
                            current = this_AtributoLista_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleStatement"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1163:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1164:2: (iv_ruleStatement= ruleStatement EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1165:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2468);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement2478); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1172:1: ruleStatement returns [EObject current=null] : (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Definition_0 = null;

        EObject this_Evaluation_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1175:28: ( (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1176:1: (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1176:1: (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==RULE_NUMBER||LA18_0==29) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1177:5: this_Definition_0= ruleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefinition_in_ruleStatement2525);
                    this_Definition_0=ruleDefinition();

                    state._fsp--;

                     
                            current = this_Definition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1187:5: this_Evaluation_1= ruleEvaluation
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEvaluation_in_ruleStatement2552);
                    this_Evaluation_1=ruleEvaluation();

                    state._fsp--;

                     
                            current = this_Evaluation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDefinition"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1203:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1204:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1205:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition2587);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition2597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1212:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1215:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1216:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1216:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1216:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleDefinition2634); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefKeyword_0());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1220:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1221:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1221:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1222:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition2651); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleEvaluation"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1246:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1247:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1248:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation2692);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation2702); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1255:1: ruleEvaluation returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1258:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1259:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1259:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1259:2: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1259:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1260:1: (lv_expression_0_0= ruleExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1260:1: (lv_expression_0_0= ruleExpression )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1261:3: lv_expression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleEvaluation2748);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEvaluationRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation2760); 

                	newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleExpression"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1289:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1290:2: (iv_ruleExpression= ruleExpression EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1291:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2796);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2806); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1298:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1301:28: (this_Addition_0= ruleAddition )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1303:5: this_Addition_0= ruleAddition
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleExpression2852);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1319:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1320:2: (iv_ruleAddition= ruleAddition EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1321:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition2886);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition2896); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1328:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1331:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1332:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1332:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1333:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2943);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1341:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=25 && LA20_0<=26)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1341:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1341:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==25) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==26) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1341:3: ( () otherlv_2= '+' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1341:3: ( () otherlv_2= '+' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1341:4: () otherlv_2= '+'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1341:4: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1342:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAddition2966); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1352:6: ( () otherlv_4= '-' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1352:6: ( () otherlv_4= '-' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1352:7: () otherlv_4= '-'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1352:7: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1353:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleAddition2995); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1362:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1363:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1363:1: (lv_right_5_0= ruleMultiplication )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1364:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3018);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Multiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1388:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1389:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1390:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication3056);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication3066); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1397:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1400:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1401:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1401:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1402:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication3113);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1410:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=27 && LA22_0<=28)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1410:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1410:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==27) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==28) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1410:3: ( () otherlv_2= '*' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1410:3: ( () otherlv_2= '*' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1410:4: () otherlv_2= '*'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1410:4: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1411:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleMultiplication3136); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1421:6: ( () otherlv_4= '/' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1421:6: ( () otherlv_4= '/' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1421:7: () otherlv_4= '/'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1421:7: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1422:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMultiplication3165); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1431:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1432:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1432:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1433:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication3188);
            	    lv_right_5_0=rulePrimaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"PrimaryExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1457:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1458:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1459:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3226);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1466:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_8_0=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1469:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1470:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1470:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt23=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt23=2;
                }
                break;
            case RULE_STRING:
                {
                alt23=3;
                }
                break;
            case RULE_ID:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1470:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1470:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1470:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_29_in_rulePrimaryExpression3274); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression3296);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePrimaryExpression3307); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1488:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1488:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1488:7: () ( (lv_value_4_0= RULE_NUMBER ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1488:7: ()
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1489:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1494:2: ( (lv_value_4_0= RULE_NUMBER ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1495:1: (lv_value_4_0= RULE_NUMBER )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1495:1: (lv_value_4_0= RULE_NUMBER )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1496:3: lv_value_4_0= RULE_NUMBER
                    {
                    lv_value_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePrimaryExpression3341); 

                    			newLeafNode(lv_value_4_0, grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1513:6: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1513:6: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1513:7: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1513:7: ()
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1514:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getSTRINGAction_2_0(),
                                current);
                        

                    }

                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1519:2: ( (lv_value_6_0= RULE_STRING ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1520:1: (lv_value_6_0= RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1520:1: (lv_value_6_0= RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1521:3: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrimaryExpression3380); 

                    			newLeafNode(lv_value_6_0, grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1538:6: ( () ( (lv_value_8_0= RULE_ID ) ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1538:6: ( () ( (lv_value_8_0= RULE_ID ) ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1538:7: () ( (lv_value_8_0= RULE_ID ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1538:7: ()
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1539:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getIDAction_3_0(),
                                current);
                        

                    }

                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1544:2: ( (lv_value_8_0= RULE_ID ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1545:1: (lv_value_8_0= RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1545:1: (lv_value_8_0= RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1546:3: lv_value_8_0= RULE_ID
                    {
                    lv_value_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3419); 

                    			newLeafNode(lv_value_8_0, grammarAccess.getPrimaryExpressionAccess().getValueIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_8_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel127 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel144 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleEntidad_in_ruleModel165 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_14_in_ruleModel178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntidad_in_entryRuleEntidad214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntidad224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegistro_in_ruleEntidad271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContacto_in_ruleEntidad298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePago_in_ruleEntidad325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegistro_in_entryRuleRegistro360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegistro370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRegistro416 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegistro433 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRegistro450 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleObjeto_in_ruleRegistro471 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleRegistro484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContacto_in_entryRuleContacto520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContacto530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleContacto576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContacto593 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContacto610 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_ruleAtributo_in_ruleContacto631 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_14_in_ruleContacto644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePago_in_entryRulePago680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePago690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePago736 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePago753 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePago770 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_ruleAtributo_in_rulePago791 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_14_in_rulePago804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropiedad_in_entryRulePropiedad840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropiedad850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_rulePropiedad897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_rulePropiedad924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_entryRuleObjeto959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjeto969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjeto1020 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObjeto1042 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleObjeto1060 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rulePropiedad_in_ruleObjeto1081 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_14_in_ruleObjeto1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoSimple_in_entryRuleAtributoSimple1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoSimple1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributoSimple1193 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoSimple1213 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtributoSimple1233 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DATATYPE_in_ruleAtributoSimple1250 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtributoSimple1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoInicializado_in_entryRuleAtributoInicializado1303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoInicializado1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributoInicializado1366 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoInicializado1386 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtributoInicializado1406 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DATATYPE_in_ruleAtributoInicializado1423 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAtributoInicializado1440 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAtributoInicializado1457 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtributoInicializado1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaString_in_entryRuleAtributoListaString1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoListaString1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributoListaString1573 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoListaString1593 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtributoListaString1613 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAtributoListaString1625 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAtributoListaString1637 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAtributoListaString1649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoListaString1666 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_22_in_ruleAtributoListaString1684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoListaString1701 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleAtributoListaString1720 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtributoListaString1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaInteger_in_entryRuleAtributoListaInteger1768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoListaInteger1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributoListaInteger1831 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoListaInteger1851 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtributoListaInteger1871 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtributoListaInteger1883 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAtributoListaInteger1895 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAtributoListaInteger1907 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAtributoListaInteger1924 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_22_in_ruleAtributoListaInteger1942 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAtributoListaInteger1959 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleAtributoListaInteger1978 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtributoListaInteger1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoLista_in_entryRuleAtributoLista2026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoLista2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaString_in_ruleAtributoLista2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaInteger_in_ruleAtributoLista2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula2145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormula2206 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFormula2223 = new BitSet(new long[]{0x00000000200800B0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFormula2244 = new BitSet(new long[]{0x00000000200800B0L});
    public static final BitSet FOLLOW_19_in_ruleFormula2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo2293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributo2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoSimple_in_ruleAtributo2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoInicializado_in_ruleAtributo2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_ruleAtributo2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoLista_in_ruleAtributo2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleStatement2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleStatement2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition2587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDefinition2634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation2692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEvaluation2748 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition2886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2943 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleAddition2966 = new BitSet(new long[]{0x00000000200000B0L});
    public static final BitSet FOLLOW_26_in_ruleAddition2995 = new BitSet(new long[]{0x00000000200000B0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3018 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication3056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication3113 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_27_in_ruleMultiplication3136 = new BitSet(new long[]{0x00000000200000B0L});
    public static final BitSet FOLLOW_28_in_ruleMultiplication3165 = new BitSet(new long[]{0x00000000200000B0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication3188 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrimaryExpression3274 = new BitSet(new long[]{0x00000000200000B0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression3296 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePrimaryExpression3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePrimaryExpression3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrimaryExpression3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3419 = new BitSet(new long[]{0x0000000000000002L});

}