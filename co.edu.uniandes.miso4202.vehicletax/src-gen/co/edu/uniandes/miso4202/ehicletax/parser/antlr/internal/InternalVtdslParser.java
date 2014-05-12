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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DATATYPE", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "':'", "'='", "';'", "','", "'def'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=4;
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
        	return "Modelo";	
       	}
       	
       	@Override
       	protected VtdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModelo"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:67:1: entryRuleModelo returns [EObject current=null] : iv_ruleModelo= ruleModelo EOF ;
    public final EObject entryRuleModelo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelo = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:68:2: (iv_ruleModelo= ruleModelo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:69:2: iv_ruleModelo= ruleModelo EOF
            {
             newCompositeNode(grammarAccess.getModeloRule()); 
            pushFollow(FOLLOW_ruleModelo_in_entryRuleModelo75);
            iv_ruleModelo=ruleModelo();

            state._fsp--;

             current =iv_ruleModelo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelo85); 

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
    // $ANTLR end "entryRuleModelo"


    // $ANTLR start "ruleModelo"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:76:1: ruleModelo returns [EObject current=null] : ( () this_ID_1= RULE_ID otherlv_2= '{' ( (lv_objetos_3_0= ruleObjeto ) )* otherlv_4= '}' ) ;
    public final EObject ruleModelo() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_objetos_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:79:28: ( ( () this_ID_1= RULE_ID otherlv_2= '{' ( (lv_objetos_3_0= ruleObjeto ) )* otherlv_4= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:80:1: ( () this_ID_1= RULE_ID otherlv_2= '{' ( (lv_objetos_3_0= ruleObjeto ) )* otherlv_4= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:80:1: ( () this_ID_1= RULE_ID otherlv_2= '{' ( (lv_objetos_3_0= ruleObjeto ) )* otherlv_4= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:80:2: () this_ID_1= RULE_ID otherlv_2= '{' ( (lv_objetos_3_0= ruleObjeto ) )* otherlv_4= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:80:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModeloAccess().getModeloAction_0(),
                        current);
                

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelo130); 
             
                newLeafNode(this_ID_1, grammarAccess.getModeloAccess().getIDTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModelo141); 

                	newLeafNode(otherlv_2, grammarAccess.getModeloAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:94:1: ( (lv_objetos_3_0= ruleObjeto ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:95:1: (lv_objetos_3_0= ruleObjeto )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:95:1: (lv_objetos_3_0= ruleObjeto )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:96:3: lv_objetos_3_0= ruleObjeto
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModeloAccess().getObjetosObjetoParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjeto_in_ruleModelo162);
            	    lv_objetos_3_0=ruleObjeto();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModeloRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"objetos",
            	            		lv_objetos_3_0, 
            	            		"Objeto");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleModelo175); 

                	newLeafNode(otherlv_4, grammarAccess.getModeloAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleModelo"


    // $ANTLR start "entryRuleObjeto"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:124:1: entryRuleObjeto returns [EObject current=null] : iv_ruleObjeto= ruleObjeto EOF ;
    public final EObject entryRuleObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjeto = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:125:2: (iv_ruleObjeto= ruleObjeto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:126:2: iv_ruleObjeto= ruleObjeto EOF
            {
             newCompositeNode(grammarAccess.getObjetoRule()); 
            pushFollow(FOLLOW_ruleObjeto_in_entryRuleObjeto211);
            iv_ruleObjeto=ruleObjeto();

            state._fsp--;

             current =iv_ruleObjeto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjeto221); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:133:1: ruleObjeto returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* ( (lv_objetos_4_0= ruleObjeto ) )* otherlv_5= '}' ) ;
    public final EObject ruleObjeto() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_descripcion_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_atributos_3_0 = null;

        EObject lv_objetos_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:136:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* ( (lv_objetos_4_0= ruleObjeto ) )* otherlv_5= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:137:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* ( (lv_objetos_4_0= ruleObjeto ) )* otherlv_5= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:137:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* ( (lv_objetos_4_0= ruleObjeto ) )* otherlv_5= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:137:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* ( (lv_objetos_4_0= ruleObjeto ) )* otherlv_5= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:137:2: ( (lv_name_0_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:138:1: (lv_name_0_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:138:1: (lv_name_0_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:139:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjeto263); 

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

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:155:2: ( (lv_descripcion_1_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:156:1: (lv_descripcion_1_0= RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:156:1: (lv_descripcion_1_0= RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:157:3: lv_descripcion_1_0= RULE_STRING
                    {
                    lv_descripcion_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleObjeto285); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleObjeto303); 

                	newLeafNode(otherlv_2, grammarAccess.getObjetoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:177:1: ( (lv_atributos_3_0= ruleAtributo ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    int LA3_1 = input.LA(2);

                    if ( ((LA3_1>=15 && LA3_1<=16)) ) {
                        alt3=1;
                    }


                }
                else if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:178:1: (lv_atributos_3_0= ruleAtributo )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:178:1: (lv_atributos_3_0= ruleAtributo )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:179:3: lv_atributos_3_0= ruleAtributo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjetoAccess().getAtributosAtributoParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtributo_in_ruleObjeto324);
            	    lv_atributos_3_0=ruleAtributo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjetoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atributos",
            	            		lv_atributos_3_0, 
            	            		"Atributo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:195:3: ( (lv_objetos_4_0= ruleObjeto ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:196:1: (lv_objetos_4_0= ruleObjeto )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:196:1: (lv_objetos_4_0= ruleObjeto )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:197:3: lv_objetos_4_0= ruleObjeto
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjetoAccess().getObjetosObjetoParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjeto_in_ruleObjeto346);
            	    lv_objetos_4_0=ruleObjeto();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjetoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"objetos",
            	            		lv_objetos_4_0, 
            	            		"Objeto");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleObjeto359); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:225:1: entryRuleAtributoSimple returns [EObject current=null] : iv_ruleAtributoSimple= ruleAtributoSimple EOF ;
    public final EObject entryRuleAtributoSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoSimple = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:226:2: (iv_ruleAtributoSimple= ruleAtributoSimple EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:227:2: iv_ruleAtributoSimple= ruleAtributoSimple EOF
            {
             newCompositeNode(grammarAccess.getAtributoSimpleRule()); 
            pushFollow(FOLLOW_ruleAtributoSimple_in_entryRuleAtributoSimple395);
            iv_ruleAtributoSimple=ruleAtributoSimple();

            state._fsp--;

             current =iv_ruleAtributoSimple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoSimple405); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:234:1: ruleAtributoSimple returns [EObject current=null] : ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) (otherlv_4= '=' ( (lv_valor_5_0= ruleValorCompleto ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleAtributoSimple() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_1=null;
        Token lv_nombre_1_2=null;
        Token otherlv_2=null;
        Token lv_tipo_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_valor_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:237:28: ( ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) (otherlv_4= '=' ( (lv_valor_5_0= ruleValorCompleto ) ) )? otherlv_6= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:238:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) (otherlv_4= '=' ( (lv_valor_5_0= ruleValorCompleto ) ) )? otherlv_6= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:238:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) (otherlv_4= '=' ( (lv_valor_5_0= ruleValorCompleto ) ) )? otherlv_6= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:238:2: () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( (lv_tipo_3_0= RULE_DATATYPE ) ) (otherlv_4= '=' ( (lv_valor_5_0= ruleValorCompleto ) ) )? otherlv_6= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:238:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:239:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoSimpleAccess().getAtributoTipadoAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:244:2: ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:245:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:245:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:246:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:246:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:247:3: lv_nombre_1_1= RULE_ID
                    {
                    lv_nombre_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributoSimple458); 

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
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:262:8: lv_nombre_1_2= RULE_STRING
                    {
                    lv_nombre_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoSimple478); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAtributoSimple498); 

                	newLeafNode(otherlv_2, grammarAccess.getAtributoSimpleAccess().getColonKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:284:1: ( (lv_tipo_3_0= RULE_DATATYPE ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:285:1: (lv_tipo_3_0= RULE_DATATYPE )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:285:1: (lv_tipo_3_0= RULE_DATATYPE )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:286:3: lv_tipo_3_0= RULE_DATATYPE
            {
            lv_tipo_3_0=(Token)match(input,RULE_DATATYPE,FOLLOW_RULE_DATATYPE_in_ruleAtributoSimple515); 

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

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:302:2: (otherlv_4= '=' ( (lv_valor_5_0= ruleValorCompleto ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:302:4: otherlv_4= '=' ( (lv_valor_5_0= ruleValorCompleto ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleAtributoSimple533); 

                        	newLeafNode(otherlv_4, grammarAccess.getAtributoSimpleAccess().getEqualsSignKeyword_4_0());
                        
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:306:1: ( (lv_valor_5_0= ruleValorCompleto ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:307:1: (lv_valor_5_0= ruleValorCompleto )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:307:1: (lv_valor_5_0= ruleValorCompleto )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:308:3: lv_valor_5_0= ruleValorCompleto
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtributoSimpleAccess().getValorValorCompletoParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValorCompleto_in_ruleAtributoSimple554);
                    lv_valor_5_0=ruleValorCompleto();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtributoSimpleRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_5_0, 
                            		"ValorCompleto");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleAtributoSimple568); 

                	newLeafNode(otherlv_6, grammarAccess.getAtributoSimpleAccess().getSemicolonKeyword_5());
                

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


    // $ANTLR start "entryRuleAtributoAsignado"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:336:1: entryRuleAtributoAsignado returns [EObject current=null] : iv_ruleAtributoAsignado= ruleAtributoAsignado EOF ;
    public final EObject entryRuleAtributoAsignado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoAsignado = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:337:2: (iv_ruleAtributoAsignado= ruleAtributoAsignado EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:338:2: iv_ruleAtributoAsignado= ruleAtributoAsignado EOF
            {
             newCompositeNode(grammarAccess.getAtributoAsignadoRule()); 
            pushFollow(FOLLOW_ruleAtributoAsignado_in_entryRuleAtributoAsignado604);
            iv_ruleAtributoAsignado=ruleAtributoAsignado();

            state._fsp--;

             current =iv_ruleAtributoAsignado; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoAsignado614); 

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
    // $ANTLR end "entryRuleAtributoAsignado"


    // $ANTLR start "ruleAtributoAsignado"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:345:1: ruleAtributoAsignado returns [EObject current=null] : ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valor_2_0= ruleStatement ) ) ) ;
    public final EObject ruleAtributoAsignado() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;
        Token otherlv_1=null;
        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:348:28: ( ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valor_2_0= ruleStatement ) ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:349:1: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valor_2_0= ruleStatement ) ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:349:1: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valor_2_0= ruleStatement ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:349:2: ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valor_2_0= ruleStatement ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:349:2: ( (lv_nombre_0_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:350:1: (lv_nombre_0_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:350:1: (lv_nombre_0_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:351:3: lv_nombre_0_0= RULE_ID
            {
            lv_nombre_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributoAsignado656); 

            			newLeafNode(lv_nombre_0_0, grammarAccess.getAtributoAsignadoAccess().getNombreIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtributoAsignadoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAtributoAsignado673); 

                	newLeafNode(otherlv_1, grammarAccess.getAtributoAsignadoAccess().getEqualsSignKeyword_1());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:371:1: ( (lv_valor_2_0= ruleStatement ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:372:1: (lv_valor_2_0= ruleStatement )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:372:1: (lv_valor_2_0= ruleStatement )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:373:3: lv_valor_2_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getAtributoAsignadoAccess().getValorStatementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleAtributoAsignado694);
            lv_valor_2_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtributoAsignadoRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAtributoAsignado"


    // $ANTLR start "entryRuleAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:397:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:398:2: (iv_ruleAtributo= ruleAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:399:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_ruleAtributo_in_entryRuleAtributo730);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributo740); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:406:1: ruleAtributo returns [EObject current=null] : (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoAsignado_1= ruleAtributoAsignado ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        EObject this_AtributoSimple_0 = null;

        EObject this_AtributoAsignado_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:409:28: ( (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoAsignado_1= ruleAtributoAsignado ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:410:1: (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoAsignado_1= ruleAtributoAsignado )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:410:1: (this_AtributoSimple_0= ruleAtributoSimple | this_AtributoAsignado_1= ruleAtributoAsignado )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==16) ) {
                    alt7=2;
                }
                else if ( (LA7_1==15) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:411:5: this_AtributoSimple_0= ruleAtributoSimple
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtributoSimple_in_ruleAtributo787);
                    this_AtributoSimple_0=ruleAtributoSimple();

                    state._fsp--;

                     
                            current = this_AtributoSimple_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:421:5: this_AtributoAsignado_1= ruleAtributoAsignado
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getAtributoAsignadoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtributoAsignado_in_ruleAtributo814);
                    this_AtributoAsignado_1=ruleAtributoAsignado();

                    state._fsp--;

                     
                            current = this_AtributoAsignado_1; 
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


    // $ANTLR start "entryRuleValorAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:437:1: entryRuleValorAtributo returns [EObject current=null] : iv_ruleValorAtributo= ruleValorAtributo EOF ;
    public final EObject entryRuleValorAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorAtributo = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:438:2: (iv_ruleValorAtributo= ruleValorAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:439:2: iv_ruleValorAtributo= ruleValorAtributo EOF
            {
             newCompositeNode(grammarAccess.getValorAtributoRule()); 
            pushFollow(FOLLOW_ruleValorAtributo_in_entryRuleValorAtributo849);
            iv_ruleValorAtributo=ruleValorAtributo();

            state._fsp--;

             current =iv_ruleValorAtributo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorAtributo859); 

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
    // $ANTLR end "entryRuleValorAtributo"


    // $ANTLR start "ruleValorAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:446:1: ruleValorAtributo returns [EObject current=null] : ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_NUMBER_3= RULE_NUMBER ) ) ;
    public final EObject ruleValorAtributo() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token this_NUMBER_3=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:449:28: ( ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_NUMBER_3= RULE_NUMBER ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:450:1: ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_NUMBER_3= RULE_NUMBER ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:450:1: ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_NUMBER_3= RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:450:2: () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_NUMBER_3= RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:450:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:451:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getValorAtributoAccess().getValorAtributoAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:456:2: (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_NUMBER_3= RULE_NUMBER )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:456:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValorAtributo905); 
                     
                        newLeafNode(this_ID_1, grammarAccess.getValorAtributoAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:461:6: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValorAtributo921); 
                     
                        newLeafNode(this_STRING_2, grammarAccess.getValorAtributoAccess().getSTRINGTerminalRuleCall_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:466:6: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleValorAtributo937); 
                     
                        newLeafNode(this_NUMBER_3, grammarAccess.getValorAtributoAccess().getNUMBERTerminalRuleCall_1_2()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleValorAtributo"


    // $ANTLR start "entryRuleValorCompleto"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:478:1: entryRuleValorCompleto returns [EObject current=null] : iv_ruleValorCompleto= ruleValorCompleto EOF ;
    public final EObject entryRuleValorCompleto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorCompleto = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:479:2: (iv_ruleValorCompleto= ruleValorCompleto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:480:2: iv_ruleValorCompleto= ruleValorCompleto EOF
            {
             newCompositeNode(grammarAccess.getValorCompletoRule()); 
            pushFollow(FOLLOW_ruleValorCompleto_in_entryRuleValorCompleto973);
            iv_ruleValorCompleto=ruleValorCompleto();

            state._fsp--;

             current =iv_ruleValorCompleto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorCompleto983); 

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
    // $ANTLR end "entryRuleValorCompleto"


    // $ANTLR start "ruleValorCompleto"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:487:1: ruleValorCompleto returns [EObject current=null] : (this_ValorAtributo_0= ruleValorAtributo | this_Lista_1= ruleLista ) ;
    public final EObject ruleValorCompleto() throws RecognitionException {
        EObject current = null;

        EObject this_ValorAtributo_0 = null;

        EObject this_Lista_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:490:28: ( (this_ValorAtributo_0= ruleValorAtributo | this_Lista_1= ruleLista ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:491:1: (this_ValorAtributo_0= ruleValorAtributo | this_Lista_1= ruleLista )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:491:1: (this_ValorAtributo_0= ruleValorAtributo | this_Lista_1= ruleLista )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==RULE_NUMBER) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:492:5: this_ValorAtributo_0= ruleValorAtributo
                    {
                     
                            newCompositeNode(grammarAccess.getValorCompletoAccess().getValorAtributoParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleValorAtributo_in_ruleValorCompleto1030);
                    this_ValorAtributo_0=ruleValorAtributo();

                    state._fsp--;

                     
                            current = this_ValorAtributo_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:502:5: this_Lista_1= ruleLista
                    {
                     
                            newCompositeNode(grammarAccess.getValorCompletoAccess().getListaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLista_in_ruleValorCompleto1057);
                    this_Lista_1=ruleLista();

                    state._fsp--;

                     
                            current = this_Lista_1; 
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
    // $ANTLR end "ruleValorCompleto"


    // $ANTLR start "entryRuleListaInteger"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:520:1: entryRuleListaInteger returns [EObject current=null] : iv_ruleListaInteger= ruleListaInteger EOF ;
    public final EObject entryRuleListaInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaInteger = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:521:2: (iv_ruleListaInteger= ruleListaInteger EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:522:2: iv_ruleListaInteger= ruleListaInteger EOF
            {
             newCompositeNode(grammarAccess.getListaIntegerRule()); 
            pushFollow(FOLLOW_ruleListaInteger_in_entryRuleListaInteger1094);
            iv_ruleListaInteger=ruleListaInteger();

            state._fsp--;

             current =iv_ruleListaInteger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaInteger1104); 

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
    // $ANTLR end "entryRuleListaInteger"


    // $ANTLR start "ruleListaInteger"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:529:1: ruleListaInteger returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_valores_2_0= RULE_NUMBER ) ) (otherlv_3= ',' ( (lv_valores_4_0= RULE_NUMBER ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleListaInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_valores_2_0=null;
        Token otherlv_3=null;
        Token lv_valores_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:532:28: ( ( () otherlv_1= '{' ( (lv_valores_2_0= RULE_NUMBER ) ) (otherlv_3= ',' ( (lv_valores_4_0= RULE_NUMBER ) ) )* otherlv_5= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:533:1: ( () otherlv_1= '{' ( (lv_valores_2_0= RULE_NUMBER ) ) (otherlv_3= ',' ( (lv_valores_4_0= RULE_NUMBER ) ) )* otherlv_5= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:533:1: ( () otherlv_1= '{' ( (lv_valores_2_0= RULE_NUMBER ) ) (otherlv_3= ',' ( (lv_valores_4_0= RULE_NUMBER ) ) )* otherlv_5= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:533:2: () otherlv_1= '{' ( (lv_valores_2_0= RULE_NUMBER ) ) (otherlv_3= ',' ( (lv_valores_4_0= RULE_NUMBER ) ) )* otherlv_5= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:533:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:534:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListaIntegerAccess().getListaIntegerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleListaInteger1150); 

                	newLeafNode(otherlv_1, grammarAccess.getListaIntegerAccess().getLeftCurlyBracketKeyword_1());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:543:1: ( (lv_valores_2_0= RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:544:1: (lv_valores_2_0= RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:544:1: (lv_valores_2_0= RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:545:3: lv_valores_2_0= RULE_NUMBER
            {
            lv_valores_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleListaInteger1167); 

            			newLeafNode(lv_valores_2_0, grammarAccess.getListaIntegerAccess().getValoresNUMBERTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListaIntegerRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"valores",
                    		lv_valores_2_0, 
                    		"NUMBER");
            	    

            }


            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:561:2: (otherlv_3= ',' ( (lv_valores_4_0= RULE_NUMBER ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:561:4: otherlv_3= ',' ( (lv_valores_4_0= RULE_NUMBER ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleListaInteger1185); 

            	        	newLeafNode(otherlv_3, grammarAccess.getListaIntegerAccess().getCommaKeyword_3_0());
            	        
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:565:1: ( (lv_valores_4_0= RULE_NUMBER ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:566:1: (lv_valores_4_0= RULE_NUMBER )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:566:1: (lv_valores_4_0= RULE_NUMBER )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:567:3: lv_valores_4_0= RULE_NUMBER
            	    {
            	    lv_valores_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleListaInteger1202); 

            	    			newLeafNode(lv_valores_4_0, grammarAccess.getListaIntegerAccess().getValoresNUMBERTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getListaIntegerRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"valores",
            	            		lv_valores_4_0, 
            	            		"NUMBER");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleListaInteger1221); 

                	newLeafNode(otherlv_5, grammarAccess.getListaIntegerAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleListaInteger"


    // $ANTLR start "entryRuleListaString"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:595:1: entryRuleListaString returns [EObject current=null] : iv_ruleListaString= ruleListaString EOF ;
    public final EObject entryRuleListaString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaString = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:596:2: (iv_ruleListaString= ruleListaString EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:597:2: iv_ruleListaString= ruleListaString EOF
            {
             newCompositeNode(grammarAccess.getListaStringRule()); 
            pushFollow(FOLLOW_ruleListaString_in_entryRuleListaString1257);
            iv_ruleListaString=ruleListaString();

            state._fsp--;

             current =iv_ruleListaString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaString1267); 

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
    // $ANTLR end "entryRuleListaString"


    // $ANTLR start "ruleListaString"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:604:1: ruleListaString returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_valores_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_valores_4_0= RULE_STRING ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleListaString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_valores_2_0=null;
        Token otherlv_3=null;
        Token lv_valores_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:607:28: ( ( () otherlv_1= '{' ( (lv_valores_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_valores_4_0= RULE_STRING ) ) )* otherlv_5= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:608:1: ( () otherlv_1= '{' ( (lv_valores_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_valores_4_0= RULE_STRING ) ) )* otherlv_5= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:608:1: ( () otherlv_1= '{' ( (lv_valores_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_valores_4_0= RULE_STRING ) ) )* otherlv_5= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:608:2: () otherlv_1= '{' ( (lv_valores_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_valores_4_0= RULE_STRING ) ) )* otherlv_5= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:608:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:609:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListaStringAccess().getListaStringAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleListaString1313); 

                	newLeafNode(otherlv_1, grammarAccess.getListaStringAccess().getLeftCurlyBracketKeyword_1());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:618:1: ( (lv_valores_2_0= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:619:1: (lv_valores_2_0= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:619:1: (lv_valores_2_0= RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:620:3: lv_valores_2_0= RULE_STRING
            {
            lv_valores_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleListaString1330); 

            			newLeafNode(lv_valores_2_0, grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListaStringRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"valores",
                    		lv_valores_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:636:2: (otherlv_3= ',' ( (lv_valores_4_0= RULE_STRING ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:636:4: otherlv_3= ',' ( (lv_valores_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleListaString1348); 

            	        	newLeafNode(otherlv_3, grammarAccess.getListaStringAccess().getCommaKeyword_3_0());
            	        
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:640:1: ( (lv_valores_4_0= RULE_STRING ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:641:1: (lv_valores_4_0= RULE_STRING )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:641:1: (lv_valores_4_0= RULE_STRING )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:642:3: lv_valores_4_0= RULE_STRING
            	    {
            	    lv_valores_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleListaString1365); 

            	    			newLeafNode(lv_valores_4_0, grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getListaStringRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"valores",
            	            		lv_valores_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleListaString1384); 

                	newLeafNode(otherlv_5, grammarAccess.getListaStringAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleListaString"


    // $ANTLR start "entryRuleLista"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:670:1: entryRuleLista returns [EObject current=null] : iv_ruleLista= ruleLista EOF ;
    public final EObject entryRuleLista() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLista = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:671:2: (iv_ruleLista= ruleLista EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:672:2: iv_ruleLista= ruleLista EOF
            {
             newCompositeNode(grammarAccess.getListaRule()); 
            pushFollow(FOLLOW_ruleLista_in_entryRuleLista1420);
            iv_ruleLista=ruleLista();

            state._fsp--;

             current =iv_ruleLista; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLista1430); 

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
    // $ANTLR end "entryRuleLista"


    // $ANTLR start "ruleLista"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:679:1: ruleLista returns [EObject current=null] : (this_ListaInteger_0= ruleListaInteger | this_ListaString_1= ruleListaString ) ;
    public final EObject ruleLista() throws RecognitionException {
        EObject current = null;

        EObject this_ListaInteger_0 = null;

        EObject this_ListaString_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:682:28: ( (this_ListaInteger_0= ruleListaInteger | this_ListaString_1= ruleListaString ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:683:1: (this_ListaInteger_0= ruleListaInteger | this_ListaString_1= ruleListaString )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:683:1: (this_ListaInteger_0= ruleListaInteger | this_ListaString_1= ruleListaString )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_NUMBER) ) {
                    alt12=1;
                }
                else if ( (LA12_1==RULE_STRING) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:684:5: this_ListaInteger_0= ruleListaInteger
                    {
                     
                            newCompositeNode(grammarAccess.getListaAccess().getListaIntegerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleListaInteger_in_ruleLista1477);
                    this_ListaInteger_0=ruleListaInteger();

                    state._fsp--;

                     
                            current = this_ListaInteger_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:694:5: this_ListaString_1= ruleListaString
                    {
                     
                            newCompositeNode(grammarAccess.getListaAccess().getListaStringParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleListaString_in_ruleLista1504);
                    this_ListaString_1=ruleListaString();

                    state._fsp--;

                     
                            current = this_ListaString_1; 
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
    // $ANTLR end "ruleLista"


    // $ANTLR start "entryRuleStatement"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:712:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:713:2: (iv_ruleStatement= ruleStatement EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:714:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1541);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1551); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:721:1: ruleStatement returns [EObject current=null] : (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Definition_0 = null;

        EObject this_Evaluation_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:724:28: ( (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:725:1: (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:725:1: (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||LA13_0==RULE_NUMBER||LA13_0==24) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:726:5: this_Definition_0= ruleDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefinition_in_ruleStatement1598);
                    this_Definition_0=ruleDefinition();

                    state._fsp--;

                     
                            current = this_Definition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:736:5: this_Evaluation_1= ruleEvaluation
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEvaluation_in_ruleStatement1625);
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:752:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:753:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:754:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1660);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1670); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:761:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:764:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:765:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:765:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:765:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleDefinition1707); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefKeyword_0());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:769:1: ( (lv_name_1_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:770:1: (lv_name_1_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:770:1: (lv_name_1_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:771:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition1724); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:795:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:796:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:797:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation1765);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation1775); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:804:1: ruleEvaluation returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:807:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:808:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:808:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:808:2: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:808:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:809:1: (lv_expression_0_0= ruleExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:809:1: (lv_expression_0_0= ruleExpression )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:810:3: lv_expression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleEvaluation1821);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleEvaluation1833); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:838:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:839:2: (iv_ruleExpression= ruleExpression EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:840:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1869);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1879); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:847:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:850:28: (this_Addition_0= ruleAddition )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:852:5: this_Addition_0= ruleAddition
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleExpression1925);
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:868:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:869:2: (iv_ruleAddition= ruleAddition EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:870:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1959);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1969); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:877:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:880:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:881:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:881:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:882:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2016);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:890:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=20 && LA15_0<=21)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:890:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:890:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==20) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==21) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:890:3: ( () otherlv_2= '+' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:890:3: ( () otherlv_2= '+' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:890:4: () otherlv_2= '+'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:890:4: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:891:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAddition2039); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:901:6: ( () otherlv_4= '-' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:901:6: ( () otherlv_4= '-' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:901:7: () otherlv_4= '-'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:901:7: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:902:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAddition2068); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:911:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:912:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:912:1: (lv_right_5_0= ruleMultiplication )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:913:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2091);
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
            	    break loop15;
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:937:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:938:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:939:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication2129);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication2139); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:946:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:949:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:950:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:950:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:951:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication2186);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:959:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=22 && LA17_0<=23)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:959:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:959:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==22) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==23) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:959:3: ( () otherlv_2= '*' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:959:3: ( () otherlv_2= '*' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:959:4: () otherlv_2= '*'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:959:4: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:960:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleMultiplication2209); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:970:6: ( () otherlv_4= '/' )
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:970:6: ( () otherlv_4= '/' )
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:970:7: () otherlv_4= '/'
            	            {
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:970:7: ()
            	            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:971:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleMultiplication2238); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:980:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:981:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:981:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:982:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication2261);
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
            	    break loop17;
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1006:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1007:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1008:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2299);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2309); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1015:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () this_STRING_6= RULE_STRING ) | ( () this_ID_8= RULE_ID ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token this_STRING_6=null;
        Token this_ID_8=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1018:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () this_STRING_6= RULE_STRING ) | ( () this_ID_8= RULE_ID ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1019:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () this_STRING_6= RULE_STRING ) | ( () this_ID_8= RULE_ID ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1019:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () this_STRING_6= RULE_STRING ) | ( () this_ID_8= RULE_ID ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt18=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt18=2;
                }
                break;
            case RULE_STRING:
                {
                alt18=3;
                }
                break;
            case RULE_ID:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1019:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1019:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1019:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulePrimaryExpression2347); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression2369);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_rulePrimaryExpression2380); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1037:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1037:6: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1037:7: () ( (lv_value_4_0= RULE_NUMBER ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1037:7: ()
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1038:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1043:2: ( (lv_value_4_0= RULE_NUMBER ) )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1044:1: (lv_value_4_0= RULE_NUMBER )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1044:1: (lv_value_4_0= RULE_NUMBER )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1045:3: lv_value_4_0= RULE_NUMBER
                    {
                    lv_value_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePrimaryExpression2414); 

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
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1062:6: ( () this_STRING_6= RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1062:6: ( () this_STRING_6= RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1062:7: () this_STRING_6= RULE_STRING
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1062:7: ()
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1063:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getSTRINGAction_2_0(),
                                current);
                        

                    }

                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrimaryExpression2447); 
                     
                        newLeafNode(this_STRING_6, grammarAccess.getPrimaryExpressionAccess().getSTRINGTerminalRuleCall_2_1()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1073:6: ( () this_ID_8= RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1073:6: ( () this_ID_8= RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1073:7: () this_ID_8= RULE_ID
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1073:7: ()
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:1074:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getIDAction_3_0(),
                                current);
                        

                    }

                    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression2474); 
                     
                        newLeafNode(this_ID_8, grammarAccess.getPrimaryExpressionAccess().getIDTerminalRuleCall_3_1()); 
                        

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


 

    public static final BitSet FOLLOW_ruleModelo_in_entryRuleModelo75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelo85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelo130 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModelo141 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleObjeto_in_ruleModelo162 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleModelo175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_entryRuleObjeto211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjeto221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjeto263 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObjeto285 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleObjeto303 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_ruleAtributo_in_ruleObjeto324 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_ruleObjeto_in_ruleObjeto346 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleObjeto359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoSimple_in_entryRuleAtributoSimple395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoSimple405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributoSimple458 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoSimple478 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtributoSimple498 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DATATYPE_in_ruleAtributoSimple515 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleAtributoSimple533 = new BitSet(new long[]{0x00000000000020B0L});
    public static final BitSet FOLLOW_ruleValorCompleto_in_ruleAtributoSimple554 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtributoSimple568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoAsignado_in_entryRuleAtributoAsignado604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoAsignado614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributoAsignado656 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAtributoAsignado673 = new BitSet(new long[]{0x00000000010800B0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleAtributoAsignado694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributo740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoSimple_in_ruleAtributo787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoAsignado_in_ruleAtributo814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributo_in_entryRuleValorAtributo849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorAtributo859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValorAtributo905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValorAtributo921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleValorAtributo937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorCompleto_in_entryRuleValorCompleto973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorCompleto983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributo_in_ruleValorCompleto1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLista_in_ruleValorCompleto1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInteger_in_entryRuleListaInteger1094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaInteger1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleListaInteger1150 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleListaInteger1167 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_18_in_ruleListaInteger1185 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleListaInteger1202 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14_in_ruleListaInteger1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_entryRuleListaString1257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaString1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleListaString1313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleListaString1330 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_18_in_ruleListaString1348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleListaString1365 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14_in_ruleListaString1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLista_in_entryRuleLista1420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLista1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInteger_in_ruleLista1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_ruleLista1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleStatement1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleStatement1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDefinition1707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation1765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEvaluation1821 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluation1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2016 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleAddition2039 = new BitSet(new long[]{0x00000000010800B0L});
    public static final BitSet FOLLOW_21_in_ruleAddition2068 = new BitSet(new long[]{0x00000000010800B0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2091 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication2129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication2186 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22_in_ruleMultiplication2209 = new BitSet(new long[]{0x00000000010800B0L});
    public static final BitSet FOLLOW_23_in_ruleMultiplication2238 = new BitSet(new long[]{0x00000000010800B0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication2261 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimaryExpression2347 = new BitSet(new long[]{0x00000000010800B0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression2369 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePrimaryExpression2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePrimaryExpression2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrimaryExpression2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression2474 = new BitSet(new long[]{0x0000000000000002L});

}