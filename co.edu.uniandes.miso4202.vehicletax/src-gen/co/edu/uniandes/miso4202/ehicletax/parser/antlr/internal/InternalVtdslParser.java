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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DATATYPE", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "':'", "';'", "'='", "'List of String'", "','", "'List of Integer'", "'def'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
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
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
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

                if ( (LA1_0==RULE_ID) ) {
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:141:1: ruleEntidad returns [EObject current=null] : ( () ( (lv_nombre_1_0= RULE_ID ) ) ( (lv_descripcion_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= rulePropiedad ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_0=null;
        Token lv_descripcion_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_propiedades_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:144:28: ( ( () ( (lv_nombre_1_0= RULE_ID ) ) ( (lv_descripcion_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= rulePropiedad ) )* otherlv_5= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:145:1: ( () ( (lv_nombre_1_0= RULE_ID ) ) ( (lv_descripcion_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= rulePropiedad ) )* otherlv_5= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:145:1: ( () ( (lv_nombre_1_0= RULE_ID ) ) ( (lv_descripcion_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= rulePropiedad ) )* otherlv_5= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:145:2: () ( (lv_nombre_1_0= RULE_ID ) ) ( (lv_descripcion_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_propiedades_4_0= rulePropiedad ) )* otherlv_5= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:145:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:146:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntidadAccess().getEntidadAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:151:2: ( (lv_nombre_1_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:152:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:152:1: (lv_nombre_1_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:153:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntidad275); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getEntidadAccess().getNombreIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntidadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"ID");
            	    

            }


            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:169:2: ( (lv_descripcion_2_0= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:170:1: (lv_descripcion_2_0= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:170:1: (lv_descripcion_2_0= RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:171:3: lv_descripcion_2_0= RULE_STRING
            {
            lv_descripcion_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntidad297); 

            			newLeafNode(lv_descripcion_2_0, grammarAccess.getEntidadAccess().getDescripcionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntidadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"descripcion",
                    		lv_descripcion_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEntidad314); 

                	newLeafNode(otherlv_3, grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:191:1: ( (lv_propiedades_4_0= rulePropiedad ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:192:1: (lv_propiedades_4_0= rulePropiedad )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:192:1: (lv_propiedades_4_0= rulePropiedad )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:193:3: lv_propiedades_4_0= rulePropiedad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntidadAccess().getPropiedadesPropiedadParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropiedad_in_ruleEntidad335);
            	    lv_propiedades_4_0=rulePropiedad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntidadRule());
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
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEntidad348); 

                	newLeafNode(otherlv_5, grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRulePropiedad"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:221:1: entryRulePropiedad returns [EObject current=null] : iv_rulePropiedad= rulePropiedad EOF ;
    public final EObject entryRulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropiedad = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:222:2: (iv_rulePropiedad= rulePropiedad EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:223:2: iv_rulePropiedad= rulePropiedad EOF
            {
             newCompositeNode(grammarAccess.getPropiedadRule()); 
            pushFollow(FOLLOW_rulePropiedad_in_entryRulePropiedad384);
            iv_rulePropiedad=rulePropiedad();

            state._fsp--;

             current =iv_rulePropiedad; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropiedad394); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:230:1: rulePropiedad returns [EObject current=null] : (this_Objeto_0= ruleObjeto | this_Atributo_1= ruleAtributo ) ;
    public final EObject rulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject this_Objeto_0 = null;

        EObject this_Atributo_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:233:28: ( (this_Objeto_0= ruleObjeto | this_Atributo_1= ruleAtributo ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:234:1: (this_Objeto_0= ruleObjeto | this_Atributo_1= ruleAtributo )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:234:1: (this_Objeto_0= ruleObjeto | this_Atributo_1= ruleAtributo )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==15||LA3_1==17) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_STRING||LA3_1==13) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:235:5: this_Objeto_0= ruleObjeto
                    {
                     
                            newCompositeNode(grammarAccess.getPropiedadAccess().getObjetoParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObjeto_in_rulePropiedad441);
                    this_Objeto_0=ruleObjeto();

                    state._fsp--;

                     
                            current = this_Objeto_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:245:5: this_Atributo_1= ruleAtributo
                    {
                     
                            newCompositeNode(grammarAccess.getPropiedadAccess().getAtributoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtributo_in_rulePropiedad468);
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:261:1: entryRuleObjeto returns [EObject current=null] : iv_ruleObjeto= ruleObjeto EOF ;
    public final EObject entryRuleObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjeto = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:262:2: (iv_ruleObjeto= ruleObjeto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:263:2: iv_ruleObjeto= ruleObjeto EOF
            {
             newCompositeNode(grammarAccess.getObjetoRule()); 
            pushFollow(FOLLOW_ruleObjeto_in_entryRuleObjeto503);
            iv_ruleObjeto=ruleObjeto();

            state._fsp--;

             current =iv_ruleObjeto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjeto513); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:270:1: ruleObjeto returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_propieades_3_0= rulePropiedad ) )* otherlv_4= '}' ) ;
    public final EObject ruleObjeto() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_descripcion_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_propieades_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:273:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_propieades_3_0= rulePropiedad ) )* otherlv_4= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:274:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_propieades_3_0= rulePropiedad ) )* otherlv_4= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:274:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_propieades_3_0= rulePropiedad ) )* otherlv_4= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:274:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_propieades_3_0= rulePropiedad ) )* otherlv_4= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:274:2: ( (lv_name_0_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:275:1: (lv_name_0_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:275:1: (lv_name_0_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:276:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjeto555); 

            			newLeafNode(lv_name_0_0, grammarAccess.getObjetoAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjetoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:292:2: ( (lv_descripcion_1_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:293:1: (lv_descripcion_1_0= RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:293:1: (lv_descripcion_1_0= RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:294:3: lv_descripcion_1_0= RULE_STRING
                    {
                    lv_descripcion_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleObjeto577); 

                    			newLeafNode(lv_descripcion_1_0, grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjetoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"descripcion",
                            		lv_descripcion_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleObjeto595); 

                	newLeafNode(otherlv_2, grammarAccess.getObjetoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:314:1: ( (lv_propieades_3_0= rulePropiedad ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:315:1: (lv_propieades_3_0= rulePropiedad )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:315:1: (lv_propieades_3_0= rulePropiedad )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:316:3: lv_propieades_3_0= rulePropiedad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjetoAccess().getPropieadesPropiedadParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropiedad_in_ruleObjeto616);
            	    lv_propieades_3_0=rulePropiedad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjetoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"propieades",
            	            		lv_propieades_3_0, 
            	            		"Propiedad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleObjeto629); 

                	newLeafNode(otherlv_4, grammarAccess.getObjetoAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:344:1: entryRuleAtributoSimple returns [EObject current=null] : iv_ruleAtributoSimple= ruleAtributoSimple EOF ;
    public final EObject entryRuleAtributoSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoSimple = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:345:2: (iv_ruleAtributoSimple= ruleAtributoSimple EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:346:2: iv_ruleAtributoSimple= ruleAtributoSimple EOF
            {
             newCompositeNode(grammarAccess.getAtributoSimpleRule()); 
            pushFollow(FOLLOW_ruleAtributoSimple_in_entryRuleAtributoSimple665);
            iv_ruleAtributoSimple=ruleAtributoSimple();

            state._fsp--;

             current =iv_ruleAtributoSimple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoSimple675); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:353:1: ruleAtributoSimple returns [EObject current=null] : ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= ';' ) ;
    public final EObject ruleAtributoSimple() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_1=null;
        Token lv_nombre_1_2=null;
        Token otherlv_2=null;
        Token lv_tipo_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:356:28: ( ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:357:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:357:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:357:2: () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:357:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:358:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoSimpleAccess().getAtributoSimpleAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:363:2: ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:364:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:364:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:365:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:365:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
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
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:366:3: lv_nombre_1_1= RULE_ID
                    {
                    lv_nombre_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributoSimple728); 

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
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:381:8: lv_nombre_1_2= RULE_STRING
                    {
                    lv_nombre_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoSimple748); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAtributoSimple768); 

                	newLeafNode(otherlv_2, grammarAccess.getAtributoSimpleAccess().getColonKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:403:1: ( (lv_tipo_3_0= RULE_DATATYPE ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:404:1: (lv_tipo_3_0= RULE_DATATYPE )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:404:1: (lv_tipo_3_0= RULE_DATATYPE )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:405:3: lv_tipo_3_0= RULE_DATATYPE
            {
            lv_tipo_3_0=(Token)match(input,RULE_DATATYPE,FOLLOW_RULE_DATATYPE_in_ruleAtributoSimple785); 

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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleAtributoSimple802); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:433:1: entryRuleAtributoInicializado returns [EObject current=null] : iv_ruleAtributoInicializado= ruleAtributoInicializado EOF ;
    public final EObject entryRuleAtributoInicializado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoInicializado = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:434:2: (iv_ruleAtributoInicializado= ruleAtributoInicializado EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:435:2: iv_ruleAtributoInicializado= ruleAtributoInicializado EOF
            {
             newCompositeNode(grammarAccess.getAtributoInicializadoRule()); 
            pushFollow(FOLLOW_ruleAtributoInicializado_in_entryRuleAtributoInicializado838);
            iv_ruleAtributoInicializado=ruleAtributoInicializado();

            state._fsp--;

             current =iv_ruleAtributoInicializado; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoInicializado848); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:442:1: ruleAtributoInicializado returns [EObject current=null] : ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= '=' ( (lv_valor_5_0= RULE_NUMBER ) ) otherlv_6= ';' ) ;
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
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:445:28: ( ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= '=' ( (lv_valor_5_0= RULE_NUMBER ) ) otherlv_6= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:446:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= '=' ( (lv_valor_5_0= RULE_NUMBER ) ) otherlv_6= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:446:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= '=' ( (lv_valor_5_0= RULE_NUMBER ) ) otherlv_6= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:446:2: () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) otherlv_4= '=' ( (lv_valor_5_0= RULE_NUMBER ) ) otherlv_6= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:446:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:447:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoInicializadoAccess().getAtributoInicializadoAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:452:2: ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:453:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:453:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:454:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:454:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:455:3: lv_nombre_1_1= RULE_ID
                    {
                    lv_nombre_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributoInicializado901); 

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
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:470:8: lv_nombre_1_2= RULE_STRING
                    {
                    lv_nombre_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoInicializado921); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAtributoInicializado941); 

                	newLeafNode(otherlv_2, grammarAccess.getAtributoInicializadoAccess().getColonKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:492:1: ( (lv_tipo_3_0= RULE_DATATYPE ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:493:1: (lv_tipo_3_0= RULE_DATATYPE )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:493:1: (lv_tipo_3_0= RULE_DATATYPE )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:494:3: lv_tipo_3_0= RULE_DATATYPE
            {
            lv_tipo_3_0=(Token)match(input,RULE_DATATYPE,FOLLOW_RULE_DATATYPE_in_ruleAtributoInicializado958); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleAtributoInicializado975); 

                	newLeafNode(otherlv_4, grammarAccess.getAtributoInicializadoAccess().getEqualsSignKeyword_4());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:514:1: ( (lv_valor_5_0= RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:515:1: (lv_valor_5_0= RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:515:1: (lv_valor_5_0= RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:516:3: lv_valor_5_0= RULE_NUMBER
            {
            lv_valor_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAtributoInicializado992); 

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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleAtributoInicializado1009); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:544:1: entryRuleAtributoListaString returns [EObject current=null] : iv_ruleAtributoListaString= ruleAtributoListaString EOF ;
    public final EObject entryRuleAtributoListaString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoListaString = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:545:2: (iv_ruleAtributoListaString= ruleAtributoListaString EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:546:2: iv_ruleAtributoListaString= ruleAtributoListaString EOF
            {
             newCompositeNode(grammarAccess.getAtributoListaStringRule()); 
            pushFollow(FOLLOW_ruleAtributoListaString_in_entryRuleAtributoListaString1045);
            iv_ruleAtributoListaString=ruleAtributoListaString();

            state._fsp--;

             current =iv_ruleAtributoListaString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoListaString1055); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:553:1: ruleAtributoListaString returns [EObject current=null] : ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of String' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )* otherlv_9= '}' otherlv_10= ';' ) ;
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
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:556:28: ( ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of String' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )* otherlv_9= '}' otherlv_10= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:557:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of String' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )* otherlv_9= '}' otherlv_10= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:557:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of String' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )* otherlv_9= '}' otherlv_10= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:557:2: () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of String' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )* otherlv_9= '}' otherlv_10= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:557:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:558:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoListaStringAccess().getAtributoListaStringAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:563:2: ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:564:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:564:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:565:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:565:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:566:3: lv_nombre_1_1= RULE_ID
                    {
                    lv_nombre_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributoListaString1108); 

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
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:581:8: lv_nombre_1_2= RULE_STRING
                    {
                    lv_nombre_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoListaString1128); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAtributoListaString1148); 

                	newLeafNode(otherlv_2, grammarAccess.getAtributoListaStringAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleAtributoListaString1160); 

                	newLeafNode(otherlv_3, grammarAccess.getAtributoListaStringAccess().getListOfStringKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleAtributoListaString1172); 

                	newLeafNode(otherlv_4, grammarAccess.getAtributoListaStringAccess().getEqualsSignKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAtributoListaString1184); 

                	newLeafNode(otherlv_5, grammarAccess.getAtributoListaStringAccess().getLeftCurlyBracketKeyword_5());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:615:1: ( (lv_valores_6_0= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:616:1: (lv_valores_6_0= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:616:1: (lv_valores_6_0= RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:617:3: lv_valores_6_0= RULE_STRING
            {
            lv_valores_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoListaString1201); 

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

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:633:2: (otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:633:4: otherlv_7= ',' ( (lv_valores_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleAtributoListaString1219); 

            	        	newLeafNode(otherlv_7, grammarAccess.getAtributoListaStringAccess().getCommaKeyword_7_0());
            	        
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:637:1: ( (lv_valores_8_0= RULE_STRING ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:638:1: (lv_valores_8_0= RULE_STRING )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:638:1: (lv_valores_8_0= RULE_STRING )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:639:3: lv_valores_8_0= RULE_STRING
            	    {
            	    lv_valores_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoListaString1236); 

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
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleAtributoListaString1255); 

                	newLeafNode(otherlv_9, grammarAccess.getAtributoListaStringAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleAtributoListaString1267); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:671:1: entryRuleAtributoListaInteger returns [EObject current=null] : iv_ruleAtributoListaInteger= ruleAtributoListaInteger EOF ;
    public final EObject entryRuleAtributoListaInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoListaInteger = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:672:2: (iv_ruleAtributoListaInteger= ruleAtributoListaInteger EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:673:2: iv_ruleAtributoListaInteger= ruleAtributoListaInteger EOF
            {
             newCompositeNode(grammarAccess.getAtributoListaIntegerRule()); 
            pushFollow(FOLLOW_ruleAtributoListaInteger_in_entryRuleAtributoListaInteger1303);
            iv_ruleAtributoListaInteger=ruleAtributoListaInteger();

            state._fsp--;

             current =iv_ruleAtributoListaInteger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoListaInteger1313); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:680:1: ruleAtributoListaInteger returns [EObject current=null] : ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of Integer' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_NUMBER ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )* otherlv_9= '}' otherlv_10= ';' ) ;
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
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:683:28: ( ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of Integer' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_NUMBER ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )* otherlv_9= '}' otherlv_10= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:684:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of Integer' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_NUMBER ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )* otherlv_9= '}' otherlv_10= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:684:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of Integer' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_NUMBER ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )* otherlv_9= '}' otherlv_10= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:684:2: () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' otherlv_3= 'List of Integer' otherlv_4= '=' otherlv_5= '{' ( (lv_valores_6_0= RULE_NUMBER ) ) (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )* otherlv_9= '}' otherlv_10= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:684:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:685:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoListaIntegerAccess().getAtributoListaIntegerAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:690:2: ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:691:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:691:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:692:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:692:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
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
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:693:3: lv_nombre_1_1= RULE_ID
                    {
                    lv_nombre_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributoListaInteger1366); 

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
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:708:8: lv_nombre_1_2= RULE_STRING
                    {
                    lv_nombre_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoListaInteger1386); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAtributoListaInteger1406); 

                	newLeafNode(otherlv_2, grammarAccess.getAtributoListaIntegerAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAtributoListaInteger1418); 

                	newLeafNode(otherlv_3, grammarAccess.getAtributoListaIntegerAccess().getListOfIntegerKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleAtributoListaInteger1430); 

                	newLeafNode(otherlv_4, grammarAccess.getAtributoListaIntegerAccess().getEqualsSignKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAtributoListaInteger1442); 

                	newLeafNode(otherlv_5, grammarAccess.getAtributoListaIntegerAccess().getLeftCurlyBracketKeyword_5());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:742:1: ( (lv_valores_6_0= RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:743:1: (lv_valores_6_0= RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:743:1: (lv_valores_6_0= RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:744:3: lv_valores_6_0= RULE_NUMBER
            {
            lv_valores_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAtributoListaInteger1459); 

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

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:760:2: (otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:760:4: otherlv_7= ',' ( (lv_valores_8_0= RULE_NUMBER ) )
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleAtributoListaInteger1477); 

            	        	newLeafNode(otherlv_7, grammarAccess.getAtributoListaIntegerAccess().getCommaKeyword_7_0());
            	        
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:764:1: ( (lv_valores_8_0= RULE_NUMBER ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:765:1: (lv_valores_8_0= RULE_NUMBER )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:765:1: (lv_valores_8_0= RULE_NUMBER )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:766:3: lv_valores_8_0= RULE_NUMBER
            	    {
            	    lv_valores_8_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAtributoListaInteger1494); 

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
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleAtributoListaInteger1513); 

                	newLeafNode(otherlv_9, grammarAccess.getAtributoListaIntegerAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleAtributoListaInteger1525); 

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


    // $ANTLR start "entryRuleFormula"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:798:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:799:2: (iv_ruleFormula= ruleFormula EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:800:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula1561);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula1571); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:807:1: ruleFormula returns [EObject current=null] : ( () ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresiones_3_0= ruleExpression ) )* otherlv_4= ';' ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expresiones_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:810:28: ( ( () ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresiones_3_0= ruleExpression ) )* otherlv_4= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:811:1: ( () ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresiones_3_0= ruleExpression ) )* otherlv_4= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:811:1: ( () ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresiones_3_0= ruleExpression ) )* otherlv_4= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:811:2: () ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expresiones_3_0= ruleExpression ) )* otherlv_4= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:811:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:812:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFormulaAccess().getFormulaAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:817:2: ( (lv_nombre_1_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:818:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:818:1: (lv_nombre_1_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:819:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormula1622); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleFormula1639); 

                	newLeafNode(otherlv_2, grammarAccess.getFormulaAccess().getEqualsSignKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:839:1: ( (lv_expresiones_3_0= ruleExpression ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||LA12_0==RULE_NUMBER||LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:840:1: (lv_expresiones_3_0= ruleExpression )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:840:1: (lv_expresiones_3_0= ruleExpression )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:841:3: lv_expresiones_3_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFormulaAccess().getExpresionesExpressionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleFormula1660);
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
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleFormula1673); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:869:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:870:2: (iv_ruleAtributo= ruleAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:871:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_ruleAtributo_in_entryRuleAtributo1709);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributo1719); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:878:1: ruleAtributo returns [EObject current=null] : (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoInicializado_1= ruleAtributoInicializado | this_Formula_2= ruleFormula | this_AtributoListaString_3= ruleAtributoListaString | this_AtributoListaInteger_4= ruleAtributoListaInteger ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        EObject this_AtributoSimple_0 = null;

        EObject this_AtributoInicializado_1 = null;

        EObject this_Formula_2 = null;

        EObject this_AtributoListaString_3 = null;

        EObject this_AtributoListaInteger_4 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:881:28: ( (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoInicializado_1= ruleAtributoInicializado | this_Formula_2= ruleFormula | this_AtributoListaString_3= ruleAtributoListaString | this_AtributoListaInteger_4= ruleAtributoListaInteger ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:882:1: (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoInicializado_1= ruleAtributoInicializado | this_Formula_2= ruleFormula | this_AtributoListaString_3= ruleAtributoListaString | this_AtributoListaInteger_4= ruleAtributoListaInteger )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:882:1: (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoInicializado_1= ruleAtributoInicializado | this_Formula_2= ruleFormula | this_AtributoListaString_3= ruleAtributoListaString | this_AtributoListaInteger_4= ruleAtributoListaInteger )
            int alt13=5;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:883:5: this_AtributoSimple_0= ruleAtributoSimple
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtributoSimple_in_ruleAtributo1766);
                    this_AtributoSimple_0=ruleAtributoSimple();

                    state._fsp--;

                     
                            current = this_AtributoSimple_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:893:5: this_AtributoInicializado_1= ruleAtributoInicializado
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getAtributoInicializadoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtributoInicializado_in_ruleAtributo1793);
                    this_AtributoInicializado_1=ruleAtributoInicializado();

                    state._fsp--;

                     
                            current = this_AtributoInicializado_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:903:5: this_Formula_2= ruleFormula
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getFormulaParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFormula_in_ruleAtributo1820);
                    this_Formula_2=ruleFormula();

                    state._fsp--;

                     
                            current = this_Formula_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:913:5: this_AtributoListaString_3= ruleAtributoListaString
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getAtributoListaStringParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAtributoListaString_in_ruleAtributo1847);
                    this_AtributoListaString_3=ruleAtributoListaString();

                    state._fsp--;

                     
                            current = this_AtributoListaString_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:923:5: this_AtributoListaInteger_4= ruleAtributoListaInteger
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getAtributoListaIntegerParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAtributoListaInteger_in_ruleAtributo1874);
                    this_AtributoListaInteger_4=ruleAtributoListaInteger();

                    state._fsp--;

                     
                            current = this_AtributoListaInteger_4; 
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:941:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:942:2: (iv_ruleStatement= ruleStatement EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:943:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1911);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1921); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:950:1: ruleStatement returns [EObject current=null] : (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Definition_0 = null;

        EObject this_Evaluation_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:953:28: ( (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:954:1: (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:954:1: (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||LA14_0==RULE_NUMBER||LA14_0==26) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:955:5: this_Definition_0= ruleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefinition_in_ruleStatement1968);
                    this_Definition_0=ruleDefinition();

                    state._fsp--;

                     
                            current = this_Definition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:965:5: this_Evaluation_1= ruleEvaluation
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEvaluation_in_ruleStatement1995);
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:981:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:982:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:983:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition2030);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition2040); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:990:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:993:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:994:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:994:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:994:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleDefinition2077); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefKeyword_0());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:998:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:999:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:999:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1000:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition2094); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1024:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1025:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1026:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation2135);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation2145); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1033:1: ruleEvaluation returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1036:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1037:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1037:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1037:2: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1037:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1038:1: (lv_expression_0_0= ruleExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1038:1: (lv_expression_0_0= ruleExpression )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1039:3: lv_expression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleEvaluation2191);
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleEvaluation2203); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1067:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1068:2: (iv_ruleExpression= ruleExpression EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1069:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2239);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2249); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1076:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1079:28: (this_Addition_0= ruleAddition )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1081:5: this_Addition_0= ruleAddition
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleExpression2295);
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1097:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1098:2: (iv_ruleAddition= ruleAddition EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1099:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition2329);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition2339); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1106:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1109:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1110:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1110:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1111:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2386);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1119:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=22 && LA16_0<=23)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1119:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1119:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==22) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==23) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1119:3: ( () otherlv_2= '+' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1119:3: ( () otherlv_2= '+' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1119:4: () otherlv_2= '+'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1119:4: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1120:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAddition2409); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1130:6: ( () otherlv_4= '-' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1130:6: ( () otherlv_4= '-' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1130:7: () otherlv_4= '-'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1130:7: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1131:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleAddition2438); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1140:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1141:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1141:1: (lv_right_5_0= ruleMultiplication )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1142:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2461);
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
            	    break loop16;
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1166:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1167:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1168:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication2499);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication2509); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1175:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1178:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1179:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1179:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1180:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication2556);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1188:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=24 && LA18_0<=25)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1188:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1188:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==24) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==25) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1188:3: ( () otherlv_2= '*' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1188:3: ( () otherlv_2= '*' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1188:4: () otherlv_2= '*'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1188:4: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1189:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleMultiplication2579); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1199:6: ( () otherlv_4= '/' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1199:6: ( () otherlv_4= '/' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1199:7: () otherlv_4= '/'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1199:7: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1200:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleMultiplication2608); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1209:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1210:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1210:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1211:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication2631);
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
            	    break loop18;
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1235:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1236:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1237:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2669);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2679); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1244:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) ) ;
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
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1247:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1248:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1248:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( (lv_value_8_0= RULE_ID ) ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt19=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            case RULE_ID:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1248:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1248:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1248:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulePrimaryExpression2717); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression2739);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePrimaryExpression2750); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1266:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1266:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1266:7: () ( (lv_value_4_0= RULE_NUMBER ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1266:7: ()
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1267:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1272:2: ( (lv_value_4_0= RULE_NUMBER ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1273:1: (lv_value_4_0= RULE_NUMBER )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1273:1: (lv_value_4_0= RULE_NUMBER )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1274:3: lv_value_4_0= RULE_NUMBER
                    {
                    lv_value_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePrimaryExpression2784); 

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
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1291:6: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1291:6: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1291:7: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1291:7: ()
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1292:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getSTRINGAction_2_0(),
                                current);
                        

                    }

                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1297:2: ( (lv_value_6_0= RULE_STRING ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1298:1: (lv_value_6_0= RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1298:1: (lv_value_6_0= RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1299:3: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrimaryExpression2823); 

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
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1316:6: ( () ( (lv_value_8_0= RULE_ID ) ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1316:6: ( () ( (lv_value_8_0= RULE_ID ) ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1316:7: () ( (lv_value_8_0= RULE_ID ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1316:7: ()
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1317:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getIDAction_3_0(),
                                current);
                        

                    }

                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1322:2: ( (lv_value_8_0= RULE_ID ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1323:1: (lv_value_8_0= RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1323:1: (lv_value_8_0= RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1324:3: lv_value_8_0= RULE_ID
                    {
                    lv_value_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression2862); 

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\12\uffff";
    static final String DFA13_minS =
        "\1\4\2\17\1\6\2\uffff\1\20\3\uffff";
    static final String DFA13_maxS =
        "\1\5\1\21\1\17\1\24\2\uffff\1\21\3\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\3\1\4\1\uffff\1\5\1\2\1\1";
    static final String DFA13_specialS =
        "\12\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2",
            "\1\3\1\uffff\1\4",
            "\1\3",
            "\1\6\13\uffff\1\5\1\uffff\1\7",
            "",
            "",
            "\1\11\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "882:1: (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoInicializado_1= ruleAtributoInicializado | this_Formula_2= ruleFormula | this_AtributoListaString_3= ruleAtributoListaString | this_AtributoListaInteger_4= ruleAtributoListaInteger )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel127 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel144 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleEntidad_in_ruleModel165 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleModel178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntidad_in_entryRuleEntidad214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntidad224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntidad275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntidad297 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntidad314 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rulePropiedad_in_ruleEntidad335 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_14_in_ruleEntidad348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropiedad_in_entryRulePropiedad384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropiedad394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_rulePropiedad441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_rulePropiedad468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_entryRuleObjeto503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjeto513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjeto555 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObjeto577 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleObjeto595 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rulePropiedad_in_ruleObjeto616 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_14_in_ruleObjeto629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoSimple_in_entryRuleAtributoSimple665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoSimple675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributoSimple728 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoSimple748 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtributoSimple768 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DATATYPE_in_ruleAtributoSimple785 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAtributoSimple802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoInicializado_in_entryRuleAtributoInicializado838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoInicializado848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributoInicializado901 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoInicializado921 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtributoInicializado941 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DATATYPE_in_ruleAtributoInicializado958 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtributoInicializado975 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAtributoInicializado992 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAtributoInicializado1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaString_in_entryRuleAtributoListaString1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoListaString1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributoListaString1108 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoListaString1128 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtributoListaString1148 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAtributoListaString1160 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtributoListaString1172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAtributoListaString1184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoListaString1201 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_ruleAtributoListaString1219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoListaString1236 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_ruleAtributoListaString1255 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAtributoListaString1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaInteger_in_entryRuleAtributoListaInteger1303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoListaInteger1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributoListaInteger1366 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoListaInteger1386 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtributoListaInteger1406 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAtributoListaInteger1418 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtributoListaInteger1430 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAtributoListaInteger1442 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAtributoListaInteger1459 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_ruleAtributoListaInteger1477 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAtributoListaInteger1494 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_ruleAtributoListaInteger1513 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAtributoListaInteger1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormula1622 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFormula1639 = new BitSet(new long[]{0x00000000040100B0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFormula1660 = new BitSet(new long[]{0x00000000040100B0L});
    public static final BitSet FOLLOW_16_in_ruleFormula1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo1709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributo1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoSimple_in_ruleAtributo1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoInicializado_in_ruleAtributo1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_ruleAtributo1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaString_in_ruleAtributo1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaInteger_in_ruleAtributo1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleStatement1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleStatement1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition2030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDefinition2077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation2135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEvaluation2191 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEvaluation2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition2329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2386 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22_in_ruleAddition2409 = new BitSet(new long[]{0x00000000040000B0L});
    public static final BitSet FOLLOW_23_in_ruleAddition2438 = new BitSet(new long[]{0x00000000040000B0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2461 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication2499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication2556 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_ruleMultiplication2579 = new BitSet(new long[]{0x00000000040000B0L});
    public static final BitSet FOLLOW_25_in_ruleMultiplication2608 = new BitSet(new long[]{0x00000000040000B0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication2631 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimaryExpression2717 = new BitSet(new long[]{0x00000000040000B0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression2739 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePrimaryExpression2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePrimaryExpression2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrimaryExpression2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression2862 = new BitSet(new long[]{0x0000000000000002L});

}