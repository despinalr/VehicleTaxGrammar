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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DECIMAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "';'", "':'", "'='", "'List of Integer = {'", "','", "'List of String = {'"
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
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_DECIMAL=6;
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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_componentes_0_0= ruleComponente ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_componentes_0_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:79:28: ( ( (lv_componentes_0_0= ruleComponente ) )* )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:80:1: ( (lv_componentes_0_0= ruleComponente ) )*
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:80:1: ( (lv_componentes_0_0= ruleComponente ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:81:1: (lv_componentes_0_0= ruleComponente )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:81:1: (lv_componentes_0_0= ruleComponente )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:82:3: lv_componentes_0_0= ruleComponente
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getComponentesComponenteParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponente_in_ruleModel130);
            	    lv_componentes_0_0=ruleComponente();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"componentes",
            	            		lv_componentes_0_0, 
            	            		"Componente");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleComponente"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:106:1: entryRuleComponente returns [EObject current=null] : iv_ruleComponente= ruleComponente EOF ;
    public final EObject entryRuleComponente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponente = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:107:2: (iv_ruleComponente= ruleComponente EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:108:2: iv_ruleComponente= ruleComponente EOF
            {
             newCompositeNode(grammarAccess.getComponenteRule()); 
            pushFollow(FOLLOW_ruleComponente_in_entryRuleComponente166);
            iv_ruleComponente=ruleComponente();

            state._fsp--;

             current =iv_ruleComponente; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponente176); 

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
    // $ANTLR end "entryRuleComponente"


    // $ANTLR start "ruleComponente"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:115:1: ruleComponente returns [EObject current=null] : (this_ObjetoSimple_0= ruleObjetoSimple | this_ObjetoNombre_1= ruleObjetoNombre ) ;
    public final EObject ruleComponente() throws RecognitionException {
        EObject current = null;

        EObject this_ObjetoSimple_0 = null;

        EObject this_ObjetoNombre_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:118:28: ( (this_ObjetoSimple_0= ruleObjetoSimple | this_ObjetoNombre_1= ruleObjetoNombre ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:119:1: (this_ObjetoSimple_0= ruleObjetoSimple | this_ObjetoNombre_1= ruleObjetoNombre )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:119:1: (this_ObjetoSimple_0= ruleObjetoSimple | this_ObjetoNombre_1= ruleObjetoNombre )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==12) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_STRING) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:120:5: this_ObjetoSimple_0= ruleObjetoSimple
                    {
                     
                            newCompositeNode(grammarAccess.getComponenteAccess().getObjetoSimpleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleObjetoSimple_in_ruleComponente223);
                    this_ObjetoSimple_0=ruleObjetoSimple();

                    state._fsp--;

                     
                            current = this_ObjetoSimple_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:130:5: this_ObjetoNombre_1= ruleObjetoNombre
                    {
                     
                            newCompositeNode(grammarAccess.getComponenteAccess().getObjetoNombreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleObjetoNombre_in_ruleComponente250);
                    this_ObjetoNombre_1=ruleObjetoNombre();

                    state._fsp--;

                     
                            current = this_ObjetoNombre_1; 
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
    // $ANTLR end "ruleComponente"


    // $ANTLR start "entryRuleObjetoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:146:1: entryRuleObjetoSimple returns [EObject current=null] : iv_ruleObjetoSimple= ruleObjetoSimple EOF ;
    public final EObject entryRuleObjetoSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetoSimple = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:147:2: (iv_ruleObjetoSimple= ruleObjetoSimple EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:148:2: iv_ruleObjetoSimple= ruleObjetoSimple EOF
            {
             newCompositeNode(grammarAccess.getObjetoSimpleRule()); 
            pushFollow(FOLLOW_ruleObjetoSimple_in_entryRuleObjetoSimple285);
            iv_ruleObjetoSimple=ruleObjetoSimple();

            state._fsp--;

             current =iv_ruleObjetoSimple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjetoSimple295); 

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
    // $ANTLR end "entryRuleObjetoSimple"


    // $ANTLR start "ruleObjetoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:155:1: ruleObjetoSimple returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_componentes_2_0= ruleComponente ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjetoSimple() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_componentes_2_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:158:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_componentes_2_0= ruleComponente ) )* otherlv_3= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:159:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_componentes_2_0= ruleComponente ) )* otherlv_3= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:159:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_componentes_2_0= ruleComponente ) )* otherlv_3= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:159:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_componentes_2_0= ruleComponente ) )* otherlv_3= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:159:2: ( (lv_name_0_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:160:1: (lv_name_0_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:160:1: (lv_name_0_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:161:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjetoSimple337); 

            			newLeafNode(lv_name_0_0, grammarAccess.getObjetoSimpleAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjetoSimpleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleObjetoSimple354); 

                	newLeafNode(otherlv_1, grammarAccess.getObjetoSimpleAccess().getLeftCurlyBracketKeyword_1());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:181:1: ( (lv_componentes_2_0= ruleComponente ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:182:1: (lv_componentes_2_0= ruleComponente )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:182:1: (lv_componentes_2_0= ruleComponente )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:183:3: lv_componentes_2_0= ruleComponente
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjetoSimpleAccess().getComponentesComponenteParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponente_in_ruleObjetoSimple375);
            	    lv_componentes_2_0=ruleComponente();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjetoSimpleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"componentes",
            	            		lv_componentes_2_0, 
            	            		"Componente");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleObjetoSimple388); 

                	newLeafNode(otherlv_3, grammarAccess.getObjetoSimpleAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleObjetoSimple"


    // $ANTLR start "entryRuleObjetoNombre"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:211:1: entryRuleObjetoNombre returns [EObject current=null] : iv_ruleObjetoNombre= ruleObjetoNombre EOF ;
    public final EObject entryRuleObjetoNombre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjetoNombre = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:212:2: (iv_ruleObjetoNombre= ruleObjetoNombre EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:213:2: iv_ruleObjetoNombre= ruleObjetoNombre EOF
            {
             newCompositeNode(grammarAccess.getObjetoNombreRule()); 
            pushFollow(FOLLOW_ruleObjetoNombre_in_entryRuleObjetoNombre424);
            iv_ruleObjetoNombre=ruleObjetoNombre();

            state._fsp--;

             current =iv_ruleObjetoNombre; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjetoNombre434); 

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
    // $ANTLR end "entryRuleObjetoNombre"


    // $ANTLR start "ruleObjetoNombre"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:220:1: ruleObjetoNombre returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_componentes_3_0= ruleComponente ) )* otherlv_4= '}' ) ;
    public final EObject ruleObjetoNombre() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_descripcion_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_componentes_3_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:223:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_componentes_3_0= ruleComponente ) )* otherlv_4= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:224:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_componentes_3_0= ruleComponente ) )* otherlv_4= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:224:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_componentes_3_0= ruleComponente ) )* otherlv_4= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:224:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_descripcion_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_componentes_3_0= ruleComponente ) )* otherlv_4= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:224:2: ( (lv_name_0_0= RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:225:1: (lv_name_0_0= RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:225:1: (lv_name_0_0= RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:226:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjetoNombre476); 

            			newLeafNode(lv_name_0_0, grammarAccess.getObjetoNombreAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjetoNombreRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:242:2: ( (lv_descripcion_1_0= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:243:1: (lv_descripcion_1_0= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:243:1: (lv_descripcion_1_0= RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:244:3: lv_descripcion_1_0= RULE_STRING
            {
            lv_descripcion_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleObjetoNombre498); 

            			newLeafNode(lv_descripcion_1_0, grammarAccess.getObjetoNombreAccess().getDescripcionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjetoNombreRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"descripcion",
                    		lv_descripcion_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleObjetoNombre515); 

                	newLeafNode(otherlv_2, grammarAccess.getObjetoNombreAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:264:1: ( (lv_componentes_3_0= ruleComponente ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:265:1: (lv_componentes_3_0= ruleComponente )
            	    {
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:265:1: (lv_componentes_3_0= ruleComponente )
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:266:3: lv_componentes_3_0= ruleComponente
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjetoNombreAccess().getComponentesComponenteParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponente_in_ruleObjetoNombre536);
            	    lv_componentes_3_0=ruleComponente();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjetoNombreRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"componentes",
            	            		lv_componentes_3_0, 
            	            		"Componente");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleObjetoNombre549); 

                	newLeafNode(otherlv_4, grammarAccess.getObjetoNombreAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleObjetoNombre"


    // $ANTLR start "entryRuleTipoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:296:1: entryRuleTipoSimple returns [EObject current=null] : iv_ruleTipoSimple= ruleTipoSimple EOF ;
    public final EObject entryRuleTipoSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoSimple = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:297:2: (iv_ruleTipoSimple= ruleTipoSimple EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:298:2: iv_ruleTipoSimple= ruleTipoSimple EOF
            {
             newCompositeNode(grammarAccess.getTipoSimpleRule()); 
            pushFollow(FOLLOW_ruleTipoSimple_in_entryRuleTipoSimple587);
            iv_ruleTipoSimple=ruleTipoSimple();

            state._fsp--;

             current =iv_ruleTipoSimple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTipoSimple597); 

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
    // $ANTLR end "entryRuleTipoSimple"


    // $ANTLR start "ruleTipoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:305:1: ruleTipoSimple returns [EObject current=null] : ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) otherlv_3= ';' ) ;
    public final EObject ruleTipoSimple() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:308:28: ( ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) otherlv_3= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:309:1: ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) otherlv_3= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:309:1: ( () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) otherlv_3= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:309:2: () (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) otherlv_3= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:309:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:310:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTipoSimpleAccess().getTipoSimpleAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:315:2: (this_ID_1= RULE_ID | this_STRING_2= RULE_STRING )
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
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:315:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTipoSimple643); 
                     
                        newLeafNode(this_ID_1, grammarAccess.getTipoSimpleAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:320:6: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTipoSimple659); 
                     
                        newLeafNode(this_STRING_2, grammarAccess.getTipoSimpleAccess().getSTRINGTerminalRuleCall_1_1()); 
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleTipoSimple671); 

                	newLeafNode(otherlv_3, grammarAccess.getTipoSimpleAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleTipoSimple"


    // $ANTLR start "entryRuleTipoValor"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:336:1: entryRuleTipoValor returns [EObject current=null] : iv_ruleTipoValor= ruleTipoValor EOF ;
    public final EObject entryRuleTipoValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoValor = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:337:2: (iv_ruleTipoValor= ruleTipoValor EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:338:2: iv_ruleTipoValor= ruleTipoValor EOF
            {
             newCompositeNode(grammarAccess.getTipoValorRule()); 
            pushFollow(FOLLOW_ruleTipoValor_in_entryRuleTipoValor707);
            iv_ruleTipoValor=ruleTipoValor();

            state._fsp--;

             current =iv_ruleTipoValor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTipoValor717); 

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
    // $ANTLR end "entryRuleTipoValor"


    // $ANTLR start "ruleTipoValor"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:345:1: ruleTipoValor returns [EObject current=null] : ( () this_ID_1= RULE_ID otherlv_2= ':' this_ID_3= RULE_ID otherlv_4= '=' this_DECIMAL_5= RULE_DECIMAL otherlv_6= ';' ) ;
    public final EObject ruleTipoValor() throws RecognitionException {
        EObject current = null;

        Token this_ID_1=null;
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token otherlv_4=null;
        Token this_DECIMAL_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:348:28: ( ( () this_ID_1= RULE_ID otherlv_2= ':' this_ID_3= RULE_ID otherlv_4= '=' this_DECIMAL_5= RULE_DECIMAL otherlv_6= ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:349:1: ( () this_ID_1= RULE_ID otherlv_2= ':' this_ID_3= RULE_ID otherlv_4= '=' this_DECIMAL_5= RULE_DECIMAL otherlv_6= ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:349:1: ( () this_ID_1= RULE_ID otherlv_2= ':' this_ID_3= RULE_ID otherlv_4= '=' this_DECIMAL_5= RULE_DECIMAL otherlv_6= ';' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:349:2: () this_ID_1= RULE_ID otherlv_2= ':' this_ID_3= RULE_ID otherlv_4= '=' this_DECIMAL_5= RULE_DECIMAL otherlv_6= ';'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:349:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:350:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTipoValorAccess().getTipoValorAction_0(),
                        current);
                

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTipoValor762); 
             
                newLeafNode(this_ID_1, grammarAccess.getTipoValorAccess().getIDTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTipoValor773); 

                	newLeafNode(otherlv_2, grammarAccess.getTipoValorAccess().getColonKeyword_2());
                
            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTipoValor784); 
             
                newLeafNode(this_ID_3, grammarAccess.getTipoValorAccess().getIDTerminalRuleCall_3()); 
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleTipoValor795); 

                	newLeafNode(otherlv_4, grammarAccess.getTipoValorAccess().getEqualsSignKeyword_4());
                
            this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleTipoValor806); 
             
                newLeafNode(this_DECIMAL_5, grammarAccess.getTipoValorAccess().getDECIMALTerminalRuleCall_5()); 
                
            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleTipoValor817); 

                	newLeafNode(otherlv_6, grammarAccess.getTipoValorAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleTipoValor"


    // $ANTLR start "entryRuleLista"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:387:1: entryRuleLista returns [EObject current=null] : iv_ruleLista= ruleLista EOF ;
    public final EObject entryRuleLista() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLista = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:388:2: (iv_ruleLista= ruleLista EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:389:2: iv_ruleLista= ruleLista EOF
            {
             newCompositeNode(grammarAccess.getListaRule()); 
            pushFollow(FOLLOW_ruleLista_in_entryRuleLista853);
            iv_ruleLista=ruleLista();

            state._fsp--;

             current =iv_ruleLista; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLista863); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:396:1: ruleLista returns [EObject current=null] : (this_ListaInt_0= ruleListaInt | this_ListaString_1= ruleListaString ) ;
    public final EObject ruleLista() throws RecognitionException {
        EObject current = null;

        EObject this_ListaInt_0 = null;

        EObject this_ListaString_1 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:399:28: ( (this_ListaInt_0= ruleListaInt | this_ListaString_1= ruleListaString ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:400:1: (this_ListaInt_0= ruleListaInt | this_ListaString_1= ruleListaString )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:400:1: (this_ListaInt_0= ruleListaInt | this_ListaString_1= ruleListaString )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:401:5: this_ListaInt_0= ruleListaInt
                    {
                     
                            newCompositeNode(grammarAccess.getListaAccess().getListaIntParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleListaInt_in_ruleLista910);
                    this_ListaInt_0=ruleListaInt();

                    state._fsp--;

                     
                            current = this_ListaInt_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:411:5: this_ListaString_1= ruleListaString
                    {
                     
                            newCompositeNode(grammarAccess.getListaAccess().getListaStringParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleListaString_in_ruleLista937);
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


    // $ANTLR start "entryRuleListaInt"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:427:1: entryRuleListaInt returns [EObject current=null] : iv_ruleListaInt= ruleListaInt EOF ;
    public final EObject entryRuleListaInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaInt = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:428:2: (iv_ruleListaInt= ruleListaInt EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:429:2: iv_ruleListaInt= ruleListaInt EOF
            {
             newCompositeNode(grammarAccess.getListaIntRule()); 
            pushFollow(FOLLOW_ruleListaInt_in_entryRuleListaInt972);
            iv_ruleListaInt=ruleListaInt();

            state._fsp--;

             current =iv_ruleListaInt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaInt982); 

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
    // $ANTLR end "entryRuleListaInt"


    // $ANTLR start "ruleListaInt"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:436:1: ruleListaInt returns [EObject current=null] : ( () otherlv_1= 'List of Integer = {' ( (lv_valores_2_0= RULE_INT ) ) (otherlv_3= ',' this_INT_4= RULE_INT )* otherlv_5= '}' ) ;
    public final EObject ruleListaInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_valores_2_0=null;
        Token otherlv_3=null;
        Token this_INT_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:439:28: ( ( () otherlv_1= 'List of Integer = {' ( (lv_valores_2_0= RULE_INT ) ) (otherlv_3= ',' this_INT_4= RULE_INT )* otherlv_5= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:440:1: ( () otherlv_1= 'List of Integer = {' ( (lv_valores_2_0= RULE_INT ) ) (otherlv_3= ',' this_INT_4= RULE_INT )* otherlv_5= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:440:1: ( () otherlv_1= 'List of Integer = {' ( (lv_valores_2_0= RULE_INT ) ) (otherlv_3= ',' this_INT_4= RULE_INT )* otherlv_5= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:440:2: () otherlv_1= 'List of Integer = {' ( (lv_valores_2_0= RULE_INT ) ) (otherlv_3= ',' this_INT_4= RULE_INT )* otherlv_5= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:440:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:441:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListaIntAccess().getListaIntAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleListaInt1028); 

                	newLeafNode(otherlv_1, grammarAccess.getListaIntAccess().getListOfIntegerKeyword_1());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:450:1: ( (lv_valores_2_0= RULE_INT ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:451:1: (lv_valores_2_0= RULE_INT )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:451:1: (lv_valores_2_0= RULE_INT )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:452:3: lv_valores_2_0= RULE_INT
            {
            lv_valores_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleListaInt1045); 

            			newLeafNode(lv_valores_2_0, grammarAccess.getListaIntAccess().getValoresINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getListaIntRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"valores",
                    		lv_valores_2_0, 
                    		"INT");
            	    

            }


            }

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:468:2: (otherlv_3= ',' this_INT_4= RULE_INT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:468:4: otherlv_3= ',' this_INT_4= RULE_INT
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleListaInt1063); 

            	        	newLeafNode(otherlv_3, grammarAccess.getListaIntAccess().getCommaKeyword_3_0());
            	        
            	    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleListaInt1074); 
            	     
            	        newLeafNode(this_INT_4, grammarAccess.getListaIntAccess().getINTTerminalRuleCall_3_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleListaInt1087); 

                	newLeafNode(otherlv_5, grammarAccess.getListaIntAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleListaInt"


    // $ANTLR start "entryRuleListaString"
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:488:1: entryRuleListaString returns [EObject current=null] : iv_ruleListaString= ruleListaString EOF ;
    public final EObject entryRuleListaString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaString = null;


        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:489:2: (iv_ruleListaString= ruleListaString EOF )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:490:2: iv_ruleListaString= ruleListaString EOF
            {
             newCompositeNode(grammarAccess.getListaStringRule()); 
            pushFollow(FOLLOW_ruleListaString_in_entryRuleListaString1123);
            iv_ruleListaString=ruleListaString();

            state._fsp--;

             current =iv_ruleListaString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaString1133); 

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
    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:497:1: ruleListaString returns [EObject current=null] : ( () otherlv_1= 'List of String = {' ( (lv_valores_2_0= RULE_STRING ) ) (otherlv_3= ',' this_STRING_4= RULE_STRING )* otherlv_5= '}' ) ;
    public final EObject ruleListaString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_valores_2_0=null;
        Token otherlv_3=null;
        Token this_STRING_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:500:28: ( ( () otherlv_1= 'List of String = {' ( (lv_valores_2_0= RULE_STRING ) ) (otherlv_3= ',' this_STRING_4= RULE_STRING )* otherlv_5= '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:501:1: ( () otherlv_1= 'List of String = {' ( (lv_valores_2_0= RULE_STRING ) ) (otherlv_3= ',' this_STRING_4= RULE_STRING )* otherlv_5= '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:501:1: ( () otherlv_1= 'List of String = {' ( (lv_valores_2_0= RULE_STRING ) ) (otherlv_3= ',' this_STRING_4= RULE_STRING )* otherlv_5= '}' )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:501:2: () otherlv_1= 'List of String = {' ( (lv_valores_2_0= RULE_STRING ) ) (otherlv_3= ',' this_STRING_4= RULE_STRING )* otherlv_5= '}'
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:501:2: ()
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:502:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListaStringAccess().getListaStringAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleListaString1179); 

                	newLeafNode(otherlv_1, grammarAccess.getListaStringAccess().getListOfStringKeyword_1());
                
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:511:1: ( (lv_valores_2_0= RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:512:1: (lv_valores_2_0= RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:512:1: (lv_valores_2_0= RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:513:3: lv_valores_2_0= RULE_STRING
            {
            lv_valores_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleListaString1196); 

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

            // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:529:2: (otherlv_3= ',' this_STRING_4= RULE_STRING )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax/src-gen/co/edu/uniandes/miso4202/ehicletax/parser/antlr/internal/InternalVtdsl.g:529:4: otherlv_3= ',' this_STRING_4= RULE_STRING
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleListaString1214); 

            	        	newLeafNode(otherlv_3, grammarAccess.getListaStringAccess().getCommaKeyword_3_0());
            	        
            	    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleListaString1225); 
            	     
            	        newLeafNode(this_STRING_4, grammarAccess.getListaStringAccess().getSTRINGTerminalRuleCall_3_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleListaString1238); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponente_in_ruleModel130 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleComponente_in_entryRuleComponente166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponente176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjetoSimple_in_ruleComponente223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjetoNombre_in_ruleComponente250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjetoSimple_in_entryRuleObjetoSimple285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjetoSimple295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjetoSimple337 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleObjetoSimple354 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleComponente_in_ruleObjetoSimple375 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleObjetoSimple388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjetoNombre_in_entryRuleObjetoNombre424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjetoNombre434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjetoNombre476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObjetoNombre498 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleObjetoNombre515 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleComponente_in_ruleObjetoNombre536 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleObjetoNombre549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTipoSimple_in_entryRuleTipoSimple587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTipoSimple597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTipoSimple643 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTipoSimple659 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTipoSimple671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTipoValor_in_entryRuleTipoValor707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTipoValor717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTipoValor762 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTipoValor773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTipoValor784 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTipoValor795 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleTipoValor806 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTipoValor817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLista_in_entryRuleLista853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLista863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInt_in_ruleLista910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_ruleLista937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInt_in_entryRuleListaInt972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaInt982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleListaInt1028 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleListaInt1045 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleListaInt1063 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleListaInt1074 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleListaInt1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_entryRuleListaString1123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaString1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleListaString1179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleListaString1196 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleListaString1214 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleListaString1225 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleListaString1238 = new BitSet(new long[]{0x0000000000000002L});

}