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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "':'", "';'", "'='", "'List of Integer'", "','", "'List of String'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_DECIMAL=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

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
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModelo141); 

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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModelo175); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:133:1: ruleObjeto returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' ) ;
    public final EObject ruleObjeto() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_descripcion_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_atributos_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:136:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:137:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:137:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:137:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) )? otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}'
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleObjeto303); 

                	newLeafNode(otherlv_2, grammarAccess.getObjetoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:177:1: ( (lv_atributos_3_0= ruleAtributo ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleObjeto337); 

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


    // $ANTLR start "entryRuleAtributoNormal"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:207:1: entryRuleAtributoNormal returns [EObject current=null] : iv_ruleAtributoNormal= ruleAtributoNormal EOF ;
    public final EObject entryRuleAtributoNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoNormal = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:208:2: (iv_ruleAtributoNormal= ruleAtributoNormal EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:209:2: iv_ruleAtributoNormal= ruleAtributoNormal EOF
            {
             newCompositeNode(grammarAccess.getAtributoNormalRule()); 
            pushFollow(FOLLOW_ruleAtributoNormal_in_entryRuleAtributoNormal373);
            iv_ruleAtributoNormal=ruleAtributoNormal();

            state._fsp--;

             current =iv_ruleAtributoNormal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoNormal383); 

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
    // $ANTLR end "entryRuleAtributoNormal"


    // $ANTLR start "ruleAtributoNormal"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:216:1: ruleAtributoNormal returns [EObject current=null] : ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( ( (lv_valor_3_1= ruleValorAtributo | lv_valor_3_2= ruleValorAtributoValor | lv_valor_3_3= ruleLista ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleAtributoNormal() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_1=null;
        Token lv_nombre_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_valor_3_1 = null;

        EObject lv_valor_3_2 = null;

        EObject lv_valor_3_3 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:219:28: ( ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( ( (lv_valor_3_1= ruleValorAtributo | lv_valor_3_2= ruleValorAtributoValor | lv_valor_3_3= ruleLista ) ) ) otherlv_4= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:220:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( ( (lv_valor_3_1= ruleValorAtributo | lv_valor_3_2= ruleValorAtributoValor | lv_valor_3_3= ruleLista ) ) ) otherlv_4= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:220:1: ( () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( ( (lv_valor_3_1= ruleValorAtributo | lv_valor_3_2= ruleValorAtributoValor | lv_valor_3_3= ruleLista ) ) ) otherlv_4= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:220:2: () ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) ) otherlv_2= ':' ( ( (lv_valor_3_1= ruleValorAtributo | lv_valor_3_2= ruleValorAtributoValor | lv_valor_3_3= ruleLista ) ) ) otherlv_4= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:220:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:221:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtributoNormalAccess().getAtributoNormalAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:226:2: ( ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:227:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:227:1: ( (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:228:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:228:1: (lv_nombre_1_1= RULE_ID | lv_nombre_1_2= RULE_STRING )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:229:3: lv_nombre_1_1= RULE_ID
                    {
                    lv_nombre_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtributoNormal436); 

                    			newLeafNode(lv_nombre_1_1, grammarAccess.getAtributoNormalAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributoNormalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:244:8: lv_nombre_1_2= RULE_STRING
                    {
                    lv_nombre_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtributoNormal456); 

                    			newLeafNode(lv_nombre_1_2, grammarAccess.getAtributoNormalAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtributoNormalRule());
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleAtributoNormal476); 

                	newLeafNode(otherlv_2, grammarAccess.getAtributoNormalAccess().getColonKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:266:1: ( ( (lv_valor_3_1= ruleValorAtributo | lv_valor_3_2= ruleValorAtributoValor | lv_valor_3_3= ruleLista ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:267:1: ( (lv_valor_3_1= ruleValorAtributo | lv_valor_3_2= ruleValorAtributoValor | lv_valor_3_3= ruleLista ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:267:1: ( (lv_valor_3_1= ruleValorAtributo | lv_valor_3_2= ruleValorAtributoValor | lv_valor_3_3= ruleLista ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:268:1: (lv_valor_3_1= ruleValorAtributo | lv_valor_3_2= ruleValorAtributoValor | lv_valor_3_3= ruleLista )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:268:1: (lv_valor_3_1= ruleValorAtributo | lv_valor_3_2= ruleValorAtributoValor | lv_valor_3_3= ruleLista )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=RULE_ID && LA5_1<=RULE_DECIMAL)||LA5_1==15) ) {
                    alt5=1;
                }
                else if ( (LA5_1==16) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt5=1;
                }
                break;
            case 17:
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:269:3: lv_valor_3_1= ruleValorAtributo
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtributoNormalAccess().getValorValorAtributoParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValorAtributo_in_ruleAtributoNormal499);
                    lv_valor_3_1=ruleValorAtributo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtributoNormalRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_3_1, 
                            		"ValorAtributo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:284:8: lv_valor_3_2= ruleValorAtributoValor
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtributoNormalAccess().getValorValorAtributoValorParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleValorAtributoValor_in_ruleAtributoNormal518);
                    lv_valor_3_2=ruleValorAtributoValor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtributoNormalRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_3_2, 
                            		"ValorAtributoValor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:299:8: lv_valor_3_3= ruleLista
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtributoNormalAccess().getValorListaParserRuleCall_3_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleLista_in_ruleAtributoNormal537);
                    lv_valor_3_3=ruleLista();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtributoNormalRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_3_3, 
                            		"Lista");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAtributoNormal552); 

                	newLeafNode(otherlv_4, grammarAccess.getAtributoNormalAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleAtributoNormal"


    // $ANTLR start "entryRuleAtributoObjeto"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:329:1: entryRuleAtributoObjeto returns [EObject current=null] : iv_ruleAtributoObjeto= ruleAtributoObjeto EOF ;
    public final EObject entryRuleAtributoObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoObjeto = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:330:2: (iv_ruleAtributoObjeto= ruleAtributoObjeto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:331:2: iv_ruleAtributoObjeto= ruleAtributoObjeto EOF
            {
             newCompositeNode(grammarAccess.getAtributoObjetoRule()); 
            pushFollow(FOLLOW_ruleAtributoObjeto_in_entryRuleAtributoObjeto588);
            iv_ruleAtributoObjeto=ruleAtributoObjeto();

            state._fsp--;

             current =iv_ruleAtributoObjeto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoObjeto598); 

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
    // $ANTLR end "entryRuleAtributoObjeto"


    // $ANTLR start "ruleAtributoObjeto"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:338:1: ruleAtributoObjeto returns [EObject current=null] : this_Objeto_0= ruleObjeto ;
    public final EObject ruleAtributoObjeto() throws RecognitionException {
        EObject current = null;

        EObject this_Objeto_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:341:28: (this_Objeto_0= ruleObjeto )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:343:5: this_Objeto_0= ruleObjeto
            {
             
                    newCompositeNode(grammarAccess.getAtributoObjetoAccess().getObjetoParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleObjeto_in_ruleAtributoObjeto644);
            this_Objeto_0=ruleObjeto();

            state._fsp--;

             
                    current = this_Objeto_0; 
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
    // $ANTLR end "ruleAtributoObjeto"


    // $ANTLR start "entryRuleAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:359:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:360:2: (iv_ruleAtributo= ruleAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:361:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_ruleAtributo_in_entryRuleAtributo678);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributo688); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:368:1: ruleAtributo returns [EObject current=null] : (this_AtributoNormal_0= ruleAtributoNormal | this_AtributoObjeto_1= ruleAtributoObjeto ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        EObject this_AtributoNormal_0 = null;

        EObject this_AtributoObjeto_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:371:28: ( (this_AtributoNormal_0= ruleAtributoNormal | this_AtributoObjeto_1= ruleAtributoObjeto ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:372:1: (this_AtributoNormal_0= ruleAtributoNormal | this_AtributoObjeto_1= ruleAtributoObjeto )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:372:1: (this_AtributoNormal_0= ruleAtributoNormal | this_AtributoObjeto_1= ruleAtributoObjeto )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==14) ) {
                    alt6=1;
                }
                else if ( (LA6_1==RULE_STRING||LA6_1==12) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:373:5: this_AtributoNormal_0= ruleAtributoNormal
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getAtributoNormalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtributoNormal_in_ruleAtributo735);
                    this_AtributoNormal_0=ruleAtributoNormal();

                    state._fsp--;

                     
                            current = this_AtributoNormal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:383:5: this_AtributoObjeto_1= ruleAtributoObjeto
                    {
                     
                            newCompositeNode(grammarAccess.getAtributoAccess().getAtributoObjetoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtributoObjeto_in_ruleAtributo762);
                    this_AtributoObjeto_1=ruleAtributoObjeto();

                    state._fsp--;

                     
                            current = this_AtributoObjeto_1; 
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:399:1: entryRuleValorAtributo returns [EObject current=null] : iv_ruleValorAtributo= ruleValorAtributo EOF ;
    public final EObject entryRuleValorAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorAtributo = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:400:2: (iv_ruleValorAtributo= ruleValorAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:401:2: iv_ruleValorAtributo= ruleValorAtributo EOF
            {
             newCompositeNode(grammarAccess.getValorAtributoRule()); 
            pushFollow(FOLLOW_ruleValorAtributo_in_entryRuleValorAtributo797);
            iv_ruleValorAtributo=ruleValorAtributo();

            state._fsp--;

             current =iv_ruleValorAtributo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorAtributo807); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:408:1: ruleValorAtributo returns [EObject current=null] : ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | this_DECIMAL_4= RULE_DECIMAL )+ ) ;
    public final EObject ruleValorAtributo() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token this_INT_3=null;
        Token this_DECIMAL_4=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:411:28: ( ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | this_DECIMAL_4= RULE_DECIMAL )+ ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:412:1: ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | this_DECIMAL_4= RULE_DECIMAL )+ )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:412:1: ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | this_DECIMAL_4= RULE_DECIMAL )+ )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:412:2: () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | this_DECIMAL_4= RULE_DECIMAL )+
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:412:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:413:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getValorAtributoAccess().getValorAtributoAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:418:2: (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_INT_3= RULE_INT | this_DECIMAL_4= RULE_DECIMAL )+
            int cnt7=0;
            loop7:
            do {
                int alt7=5;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt7=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt7=2;
                    }
                    break;
                case RULE_INT:
                    {
                    alt7=3;
                    }
                    break;
                case RULE_DECIMAL:
                    {
                    alt7=4;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:418:3: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValorAtributo853); 
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getValorAtributoAccess().getIDTerminalRuleCall_1_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:423:6: this_STRING_2= RULE_STRING
            	    {
            	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValorAtributo869); 
            	     
            	        newLeafNode(this_STRING_2, grammarAccess.getValorAtributoAccess().getSTRINGTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:428:6: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValorAtributo885); 
            	     
            	        newLeafNode(this_INT_3, grammarAccess.getValorAtributoAccess().getINTTerminalRuleCall_1_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:433:6: this_DECIMAL_4= RULE_DECIMAL
            	    {
            	    this_DECIMAL_4=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleValorAtributo901); 
            	     
            	        newLeafNode(this_DECIMAL_4, grammarAccess.getValorAtributoAccess().getDECIMALTerminalRuleCall_1_3()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruleValorAtributo"


    // $ANTLR start "entryRuleValorAtributoValor"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:447:1: entryRuleValorAtributoValor returns [EObject current=null] : iv_ruleValorAtributoValor= ruleValorAtributoValor EOF ;
    public final EObject entryRuleValorAtributoValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorAtributoValor = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:448:2: (iv_ruleValorAtributoValor= ruleValorAtributoValor EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:449:2: iv_ruleValorAtributoValor= ruleValorAtributoValor EOF
            {
             newCompositeNode(grammarAccess.getValorAtributoValorRule()); 
            pushFollow(FOLLOW_ruleValorAtributoValor_in_entryRuleValorAtributoValor940);
            iv_ruleValorAtributoValor=ruleValorAtributoValor();

            state._fsp--;

             current =iv_ruleValorAtributoValor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorAtributoValor950); 

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
    // $ANTLR end "entryRuleValorAtributoValor"


    // $ANTLR start "ruleValorAtributoValor"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:456:1: ruleValorAtributoValor returns [EObject current=null] : ( () this_ID_1= RULE_ID otherlv_2= '=' this_DECIMAL_3= RULE_DECIMAL ) ;
    public final EObject ruleValorAtributoValor() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token otherlv_2=null;
        Token this_DECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:459:28: ( ( () this_ID_1= RULE_ID otherlv_2= '=' this_DECIMAL_3= RULE_DECIMAL ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:460:1: ( () this_ID_1= RULE_ID otherlv_2= '=' this_DECIMAL_3= RULE_DECIMAL )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:460:1: ( () this_ID_1= RULE_ID otherlv_2= '=' this_DECIMAL_3= RULE_DECIMAL )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:460:2: () this_ID_1= RULE_ID otherlv_2= '=' this_DECIMAL_3= RULE_DECIMAL
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:460:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:461:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getValorAtributoValorAccess().getValorAtributoValorAction_0(),
                        current);
                

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValorAtributoValor995); 
             
                newLeafNode(this_ID_1, grammarAccess.getValorAtributoValorAccess().getIDTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleValorAtributoValor1006); 

                	newLeafNode(otherlv_2, grammarAccess.getValorAtributoValorAccess().getEqualsSignKeyword_2());
                
            this_DECIMAL_3=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleValorAtributoValor1017); 
             
                newLeafNode(this_DECIMAL_3, grammarAccess.getValorAtributoValorAccess().getDECIMALTerminalRuleCall_3()); 
                

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
    // $ANTLR end "ruleValorAtributoValor"


    // $ANTLR start "entryRuleListaInteger"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:486:1: entryRuleListaInteger returns [EObject current=null] : iv_ruleListaInteger= ruleListaInteger EOF ;
    public final EObject entryRuleListaInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaInteger = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:487:2: (iv_ruleListaInteger= ruleListaInteger EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:488:2: iv_ruleListaInteger= ruleListaInteger EOF
            {
             newCompositeNode(grammarAccess.getListaIntegerRule()); 
            pushFollow(FOLLOW_ruleListaInteger_in_entryRuleListaInteger1052);
            iv_ruleListaInteger=ruleListaInteger();

            state._fsp--;

             current =iv_ruleListaInteger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaInteger1062); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:495:1: ruleListaInteger returns [EObject current=null] : ( () otherlv_1= 'List of Integer' otherlv_2= '=' otherlv_3= '{' ( (lv_valores_4_0= RULE_INT ) ) (otherlv_5= ',' this_INT_6= RULE_INT )* otherlv_7= '}' ) ;
    public final EObject ruleListaInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_valores_4_0=null;
        Token otherlv_5=null;
        Token this_INT_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:498:28: ( ( () otherlv_1= 'List of Integer' otherlv_2= '=' otherlv_3= '{' ( (lv_valores_4_0= RULE_INT ) ) (otherlv_5= ',' this_INT_6= RULE_INT )* otherlv_7= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:499:1: ( () otherlv_1= 'List of Integer' otherlv_2= '=' otherlv_3= '{' ( (lv_valores_4_0= RULE_INT ) ) (otherlv_5= ',' this_INT_6= RULE_INT )* otherlv_7= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:499:1: ( () otherlv_1= 'List of Integer' otherlv_2= '=' otherlv_3= '{' ( (lv_valores_4_0= RULE_INT ) ) (otherlv_5= ',' this_INT_6= RULE_INT )* otherlv_7= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:499:2: () otherlv_1= 'List of Integer' otherlv_2= '=' otherlv_3= '{' ( (lv_valores_4_0= RULE_INT ) ) (otherlv_5= ',' this_INT_6= RULE_INT )* otherlv_7= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:499:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:500:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListaIntegerAccess().getListaIntegerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleListaInteger1108); 

                	newLeafNode(otherlv_1, grammarAccess.getListaIntegerAccess().getListOfIntegerKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleListaInteger1120); 

                	newLeafNode(otherlv_2, grammarAccess.getListaIntegerAccess().getEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleListaInteger1132); 

                	newLeafNode(otherlv_3, grammarAccess.getListaIntegerAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:517:1: ( (lv_valores_4_0= RULE_INT ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:518:1: (lv_valores_4_0= RULE_INT )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:518:1: (lv_valores_4_0= RULE_INT )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:519:3: lv_valores_4_0= RULE_INT
            {
            lv_valores_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleListaInteger1149); 

            			newLeafNode(lv_valores_4_0, grammarAccess.getListaIntegerAccess().getValoresINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListaIntegerRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"valores",
                    		lv_valores_4_0, 
                    		"INT");
            	    

            }


            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:535:2: (otherlv_5= ',' this_INT_6= RULE_INT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:535:4: otherlv_5= ',' this_INT_6= RULE_INT
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleListaInteger1167); 

            	        	newLeafNode(otherlv_5, grammarAccess.getListaIntegerAccess().getCommaKeyword_5_0());
            	        
            	    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleListaInteger1178); 
            	     
            	        newLeafNode(this_INT_6, grammarAccess.getListaIntegerAccess().getINTTerminalRuleCall_5_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleListaInteger1191); 

                	newLeafNode(otherlv_7, grammarAccess.getListaIntegerAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:555:1: entryRuleListaString returns [EObject current=null] : iv_ruleListaString= ruleListaString EOF ;
    public final EObject entryRuleListaString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaString = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:556:2: (iv_ruleListaString= ruleListaString EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:557:2: iv_ruleListaString= ruleListaString EOF
            {
             newCompositeNode(grammarAccess.getListaStringRule()); 
            pushFollow(FOLLOW_ruleListaString_in_entryRuleListaString1227);
            iv_ruleListaString=ruleListaString();

            state._fsp--;

             current =iv_ruleListaString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaString1237); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:564:1: ruleListaString returns [EObject current=null] : ( () otherlv_1= 'List of String' otherlv_2= '=' otherlv_3= '{' ( (lv_valores_4_0= RULE_STRING ) ) (otherlv_5= ',' this_STRING_6= RULE_STRING )* otherlv_7= '}' ) ;
    public final EObject ruleListaString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_valores_4_0=null;
        Token otherlv_5=null;
        Token this_STRING_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:567:28: ( ( () otherlv_1= 'List of String' otherlv_2= '=' otherlv_3= '{' ( (lv_valores_4_0= RULE_STRING ) ) (otherlv_5= ',' this_STRING_6= RULE_STRING )* otherlv_7= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:568:1: ( () otherlv_1= 'List of String' otherlv_2= '=' otherlv_3= '{' ( (lv_valores_4_0= RULE_STRING ) ) (otherlv_5= ',' this_STRING_6= RULE_STRING )* otherlv_7= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:568:1: ( () otherlv_1= 'List of String' otherlv_2= '=' otherlv_3= '{' ( (lv_valores_4_0= RULE_STRING ) ) (otherlv_5= ',' this_STRING_6= RULE_STRING )* otherlv_7= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:568:2: () otherlv_1= 'List of String' otherlv_2= '=' otherlv_3= '{' ( (lv_valores_4_0= RULE_STRING ) ) (otherlv_5= ',' this_STRING_6= RULE_STRING )* otherlv_7= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:568:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:569:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListaStringAccess().getListaStringAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleListaString1283); 

                	newLeafNode(otherlv_1, grammarAccess.getListaStringAccess().getListOfStringKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleListaString1295); 

                	newLeafNode(otherlv_2, grammarAccess.getListaStringAccess().getEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleListaString1307); 

                	newLeafNode(otherlv_3, grammarAccess.getListaStringAccess().getLeftCurlyBracketKeyword_3());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:586:1: ( (lv_valores_4_0= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:587:1: (lv_valores_4_0= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:587:1: (lv_valores_4_0= RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:588:3: lv_valores_4_0= RULE_STRING
            {
            lv_valores_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleListaString1324); 

            			newLeafNode(lv_valores_4_0, grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_4_0()); 
            		

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

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:604:2: (otherlv_5= ',' this_STRING_6= RULE_STRING )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:604:4: otherlv_5= ',' this_STRING_6= RULE_STRING
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleListaString1342); 

            	        	newLeafNode(otherlv_5, grammarAccess.getListaStringAccess().getCommaKeyword_5_0());
            	        
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleListaString1353); 
            	     
            	        newLeafNode(this_STRING_6, grammarAccess.getListaStringAccess().getSTRINGTerminalRuleCall_5_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleListaString1366); 

                	newLeafNode(otherlv_7, grammarAccess.getListaStringAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:624:1: entryRuleLista returns [EObject current=null] : iv_ruleLista= ruleLista EOF ;
    public final EObject entryRuleLista() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLista = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:625:2: (iv_ruleLista= ruleLista EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:626:2: iv_ruleLista= ruleLista EOF
            {
             newCompositeNode(grammarAccess.getListaRule()); 
            pushFollow(FOLLOW_ruleLista_in_entryRuleLista1402);
            iv_ruleLista=ruleLista();

            state._fsp--;

             current =iv_ruleLista; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLista1412); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:633:1: ruleLista returns [EObject current=null] : (this_ListaInteger_0= ruleListaInteger | this_ListaString_1= ruleListaString ) ;
    public final EObject ruleLista() throws RecognitionException {
        EObject current = null;

        EObject this_ListaInteger_0 = null;

        EObject this_ListaString_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:636:28: ( (this_ListaInteger_0= ruleListaInteger | this_ListaString_1= ruleListaString ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:637:1: (this_ListaInteger_0= ruleListaInteger | this_ListaString_1= ruleListaString )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:637:1: (this_ListaInteger_0= ruleListaInteger | this_ListaString_1= ruleListaString )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:638:5: this_ListaInteger_0= ruleListaInteger
                    {
                     
                            newCompositeNode(grammarAccess.getListaAccess().getListaIntegerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleListaInteger_in_ruleLista1459);
                    this_ListaInteger_0=ruleListaInteger();

                    state._fsp--;

                     
                            current = this_ListaInteger_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:648:5: this_ListaString_1= ruleListaString
                    {
                     
                            newCompositeNode(grammarAccess.getListaAccess().getListaStringParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleListaString_in_ruleLista1486);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModelo_in_entryRuleModelo75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelo85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelo130 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModelo141 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleObjeto_in_ruleModelo162 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleModelo175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_entryRuleObjeto211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjeto221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjeto263 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObjeto285 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleObjeto303 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_ruleAtributo_in_ruleObjeto324 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_13_in_ruleObjeto337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoNormal_in_entryRuleAtributoNormal373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoNormal383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtributoNormal436 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtributoNormal456 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAtributoNormal476 = new BitSet(new long[]{0x00000000000A00F0L});
    public static final BitSet FOLLOW_ruleValorAtributo_in_ruleAtributoNormal499 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleValorAtributoValor_in_ruleAtributoNormal518 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleLista_in_ruleAtributoNormal537 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtributoNormal552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoObjeto_in_entryRuleAtributoObjeto588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoObjeto598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_ruleAtributoObjeto644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributo688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoNormal_in_ruleAtributo735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoObjeto_in_ruleAtributo762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributo_in_entryRuleValorAtributo797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorAtributo807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValorAtributo853 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValorAtributo869 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValorAtributo885 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleValorAtributo901 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_ruleValorAtributoValor_in_entryRuleValorAtributoValor940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorAtributoValor950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValorAtributoValor995 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleValorAtributoValor1006 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleValorAtributoValor1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInteger_in_entryRuleListaInteger1052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaInteger1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleListaInteger1108 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleListaInteger1120 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleListaInteger1132 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleListaInteger1149 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleListaInteger1167 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleListaInteger1178 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleListaInteger1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_entryRuleListaString1227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaString1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleListaString1283 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleListaString1295 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleListaString1307 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleListaString1324 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleListaString1342 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleListaString1353 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleListaString1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLista_in_entryRuleLista1402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLista1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInteger_in_ruleLista1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_ruleLista1486 = new BitSet(new long[]{0x0000000000000002L});

}