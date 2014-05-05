package co.edu.uniandes.miso4202.ehicletax.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import co.edu.uniandes.miso4202.ehicletax.services.VtdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVtdslParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g"; }


     
     	private VtdslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VtdslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:61:1: ( ruleModel EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:69:1: ruleModel : ( ( rule__Model__ComponentesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:73:2: ( ( ( rule__Model__ComponentesAssignment )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:74:1: ( ( rule__Model__ComponentesAssignment )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:74:1: ( ( rule__Model__ComponentesAssignment )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:75:1: ( rule__Model__ComponentesAssignment )*
            {
             before(grammarAccess.getModelAccess().getComponentesAssignment()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:76:1: ( rule__Model__ComponentesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:76:2: rule__Model__ComponentesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ComponentesAssignment_in_ruleModel94);
            	    rule__Model__ComponentesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getComponentesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleComponente"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:88:1: entryRuleComponente : ruleComponente EOF ;
    public final void entryRuleComponente() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:89:1: ( ruleComponente EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:90:1: ruleComponente EOF
            {
             before(grammarAccess.getComponenteRule()); 
            pushFollow(FOLLOW_ruleComponente_in_entryRuleComponente122);
            ruleComponente();

            state._fsp--;

             after(grammarAccess.getComponenteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponente129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponente"


    // $ANTLR start "ruleComponente"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:97:1: ruleComponente : ( ( rule__Componente__Alternatives ) ) ;
    public final void ruleComponente() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:101:2: ( ( ( rule__Componente__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:102:1: ( ( rule__Componente__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:102:1: ( ( rule__Componente__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:103:1: ( rule__Componente__Alternatives )
            {
             before(grammarAccess.getComponenteAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:104:1: ( rule__Componente__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:104:2: rule__Componente__Alternatives
            {
            pushFollow(FOLLOW_rule__Componente__Alternatives_in_ruleComponente155);
            rule__Componente__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponenteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponente"


    // $ANTLR start "entryRuleObjetoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:116:1: entryRuleObjetoSimple : ruleObjetoSimple EOF ;
    public final void entryRuleObjetoSimple() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:117:1: ( ruleObjetoSimple EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:118:1: ruleObjetoSimple EOF
            {
             before(grammarAccess.getObjetoSimpleRule()); 
            pushFollow(FOLLOW_ruleObjetoSimple_in_entryRuleObjetoSimple182);
            ruleObjetoSimple();

            state._fsp--;

             after(grammarAccess.getObjetoSimpleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjetoSimple189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjetoSimple"


    // $ANTLR start "ruleObjetoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:125:1: ruleObjetoSimple : ( ( rule__ObjetoSimple__Group__0 ) ) ;
    public final void ruleObjetoSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:129:2: ( ( ( rule__ObjetoSimple__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:130:1: ( ( rule__ObjetoSimple__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:130:1: ( ( rule__ObjetoSimple__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:131:1: ( rule__ObjetoSimple__Group__0 )
            {
             before(grammarAccess.getObjetoSimpleAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:132:1: ( rule__ObjetoSimple__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:132:2: rule__ObjetoSimple__Group__0
            {
            pushFollow(FOLLOW_rule__ObjetoSimple__Group__0_in_ruleObjetoSimple215);
            rule__ObjetoSimple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetoSimpleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjetoSimple"


    // $ANTLR start "entryRuleObjetoNombre"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:144:1: entryRuleObjetoNombre : ruleObjetoNombre EOF ;
    public final void entryRuleObjetoNombre() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:145:1: ( ruleObjetoNombre EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:146:1: ruleObjetoNombre EOF
            {
             before(grammarAccess.getObjetoNombreRule()); 
            pushFollow(FOLLOW_ruleObjetoNombre_in_entryRuleObjetoNombre242);
            ruleObjetoNombre();

            state._fsp--;

             after(grammarAccess.getObjetoNombreRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjetoNombre249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjetoNombre"


    // $ANTLR start "ruleObjetoNombre"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:153:1: ruleObjetoNombre : ( ( rule__ObjetoNombre__Group__0 ) ) ;
    public final void ruleObjetoNombre() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:157:2: ( ( ( rule__ObjetoNombre__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:158:1: ( ( rule__ObjetoNombre__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:158:1: ( ( rule__ObjetoNombre__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:159:1: ( rule__ObjetoNombre__Group__0 )
            {
             before(grammarAccess.getObjetoNombreAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:160:1: ( rule__ObjetoNombre__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:160:2: rule__ObjetoNombre__Group__0
            {
            pushFollow(FOLLOW_rule__ObjetoNombre__Group__0_in_ruleObjetoNombre275);
            rule__ObjetoNombre__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetoNombreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjetoNombre"


    // $ANTLR start "entryRuleTipoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:174:1: entryRuleTipoSimple : ruleTipoSimple EOF ;
    public final void entryRuleTipoSimple() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:175:1: ( ruleTipoSimple EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:176:1: ruleTipoSimple EOF
            {
             before(grammarAccess.getTipoSimpleRule()); 
            pushFollow(FOLLOW_ruleTipoSimple_in_entryRuleTipoSimple304);
            ruleTipoSimple();

            state._fsp--;

             after(grammarAccess.getTipoSimpleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTipoSimple311); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoSimple"


    // $ANTLR start "ruleTipoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:183:1: ruleTipoSimple : ( ( rule__TipoSimple__Group__0 ) ) ;
    public final void ruleTipoSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:187:2: ( ( ( rule__TipoSimple__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:188:1: ( ( rule__TipoSimple__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:188:1: ( ( rule__TipoSimple__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:189:1: ( rule__TipoSimple__Group__0 )
            {
             before(grammarAccess.getTipoSimpleAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:190:1: ( rule__TipoSimple__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:190:2: rule__TipoSimple__Group__0
            {
            pushFollow(FOLLOW_rule__TipoSimple__Group__0_in_ruleTipoSimple337);
            rule__TipoSimple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTipoSimpleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoSimple"


    // $ANTLR start "entryRuleTipoValor"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:202:1: entryRuleTipoValor : ruleTipoValor EOF ;
    public final void entryRuleTipoValor() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:203:1: ( ruleTipoValor EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:204:1: ruleTipoValor EOF
            {
             before(grammarAccess.getTipoValorRule()); 
            pushFollow(FOLLOW_ruleTipoValor_in_entryRuleTipoValor364);
            ruleTipoValor();

            state._fsp--;

             after(grammarAccess.getTipoValorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTipoValor371); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoValor"


    // $ANTLR start "ruleTipoValor"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:211:1: ruleTipoValor : ( ( rule__TipoValor__Group__0 ) ) ;
    public final void ruleTipoValor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:215:2: ( ( ( rule__TipoValor__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:216:1: ( ( rule__TipoValor__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:216:1: ( ( rule__TipoValor__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:217:1: ( rule__TipoValor__Group__0 )
            {
             before(grammarAccess.getTipoValorAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:218:1: ( rule__TipoValor__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:218:2: rule__TipoValor__Group__0
            {
            pushFollow(FOLLOW_rule__TipoValor__Group__0_in_ruleTipoValor397);
            rule__TipoValor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTipoValorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoValor"


    // $ANTLR start "entryRuleLista"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:230:1: entryRuleLista : ruleLista EOF ;
    public final void entryRuleLista() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:231:1: ( ruleLista EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:232:1: ruleLista EOF
            {
             before(grammarAccess.getListaRule()); 
            pushFollow(FOLLOW_ruleLista_in_entryRuleLista424);
            ruleLista();

            state._fsp--;

             after(grammarAccess.getListaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLista431); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLista"


    // $ANTLR start "ruleLista"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:239:1: ruleLista : ( ( rule__Lista__Alternatives ) ) ;
    public final void ruleLista() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:243:2: ( ( ( rule__Lista__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:244:1: ( ( rule__Lista__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:244:1: ( ( rule__Lista__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:245:1: ( rule__Lista__Alternatives )
            {
             before(grammarAccess.getListaAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:246:1: ( rule__Lista__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:246:2: rule__Lista__Alternatives
            {
            pushFollow(FOLLOW_rule__Lista__Alternatives_in_ruleLista457);
            rule__Lista__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLista"


    // $ANTLR start "entryRuleListaInt"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:258:1: entryRuleListaInt : ruleListaInt EOF ;
    public final void entryRuleListaInt() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:259:1: ( ruleListaInt EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:260:1: ruleListaInt EOF
            {
             before(grammarAccess.getListaIntRule()); 
            pushFollow(FOLLOW_ruleListaInt_in_entryRuleListaInt484);
            ruleListaInt();

            state._fsp--;

             after(grammarAccess.getListaIntRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaInt491); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListaInt"


    // $ANTLR start "ruleListaInt"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:267:1: ruleListaInt : ( ( rule__ListaInt__Group__0 ) ) ;
    public final void ruleListaInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:271:2: ( ( ( rule__ListaInt__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:272:1: ( ( rule__ListaInt__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:272:1: ( ( rule__ListaInt__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:273:1: ( rule__ListaInt__Group__0 )
            {
             before(grammarAccess.getListaIntAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:274:1: ( rule__ListaInt__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:274:2: rule__ListaInt__Group__0
            {
            pushFollow(FOLLOW_rule__ListaInt__Group__0_in_ruleListaInt517);
            rule__ListaInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListaIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListaInt"


    // $ANTLR start "entryRuleListaString"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:286:1: entryRuleListaString : ruleListaString EOF ;
    public final void entryRuleListaString() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:287:1: ( ruleListaString EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:288:1: ruleListaString EOF
            {
             before(grammarAccess.getListaStringRule()); 
            pushFollow(FOLLOW_ruleListaString_in_entryRuleListaString544);
            ruleListaString();

            state._fsp--;

             after(grammarAccess.getListaStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaString551); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListaString"


    // $ANTLR start "ruleListaString"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:295:1: ruleListaString : ( ( rule__ListaString__Group__0 ) ) ;
    public final void ruleListaString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:299:2: ( ( ( rule__ListaString__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:300:1: ( ( rule__ListaString__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:300:1: ( ( rule__ListaString__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:301:1: ( rule__ListaString__Group__0 )
            {
             before(grammarAccess.getListaStringAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:302:1: ( rule__ListaString__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:302:2: rule__ListaString__Group__0
            {
            pushFollow(FOLLOW_rule__ListaString__Group__0_in_ruleListaString577);
            rule__ListaString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListaStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListaString"


    // $ANTLR start "rule__Componente__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:314:1: rule__Componente__Alternatives : ( ( ruleObjetoSimple ) | ( ruleObjetoNombre ) );
    public final void rule__Componente__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:318:1: ( ( ruleObjetoSimple ) | ( ruleObjetoNombre ) )
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:319:1: ( ruleObjetoSimple )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:319:1: ( ruleObjetoSimple )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:320:1: ruleObjetoSimple
                    {
                     before(grammarAccess.getComponenteAccess().getObjetoSimpleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjetoSimple_in_rule__Componente__Alternatives613);
                    ruleObjetoSimple();

                    state._fsp--;

                     after(grammarAccess.getComponenteAccess().getObjetoSimpleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:325:6: ( ruleObjetoNombre )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:325:6: ( ruleObjetoNombre )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:326:1: ruleObjetoNombre
                    {
                     before(grammarAccess.getComponenteAccess().getObjetoNombreParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleObjetoNombre_in_rule__Componente__Alternatives630);
                    ruleObjetoNombre();

                    state._fsp--;

                     after(grammarAccess.getComponenteAccess().getObjetoNombreParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Alternatives"


    // $ANTLR start "rule__TipoSimple__Alternatives_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:338:1: rule__TipoSimple__Alternatives_1 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__TipoSimple__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:342:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:343:1: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:343:1: ( RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:344:1: RULE_ID
                    {
                     before(grammarAccess.getTipoSimpleAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TipoSimple__Alternatives_1664); 
                     after(grammarAccess.getTipoSimpleAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:349:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:349:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:350:1: RULE_STRING
                    {
                     before(grammarAccess.getTipoSimpleAccess().getSTRINGTerminalRuleCall_1_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TipoSimple__Alternatives_1681); 
                     after(grammarAccess.getTipoSimpleAccess().getSTRINGTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoSimple__Alternatives_1"


    // $ANTLR start "rule__Lista__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:360:1: rule__Lista__Alternatives : ( ( ruleListaInt ) | ( ruleListaString ) );
    public final void rule__Lista__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:364:1: ( ( ruleListaInt ) | ( ruleListaString ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:365:1: ( ruleListaInt )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:365:1: ( ruleListaInt )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:366:1: ruleListaInt
                    {
                     before(grammarAccess.getListaAccess().getListaIntParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleListaInt_in_rule__Lista__Alternatives713);
                    ruleListaInt();

                    state._fsp--;

                     after(grammarAccess.getListaAccess().getListaIntParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:371:6: ( ruleListaString )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:371:6: ( ruleListaString )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:372:1: ruleListaString
                    {
                     before(grammarAccess.getListaAccess().getListaStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleListaString_in_rule__Lista__Alternatives730);
                    ruleListaString();

                    state._fsp--;

                     after(grammarAccess.getListaAccess().getListaStringParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lista__Alternatives"


    // $ANTLR start "rule__ObjetoSimple__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:384:1: rule__ObjetoSimple__Group__0 : rule__ObjetoSimple__Group__0__Impl rule__ObjetoSimple__Group__1 ;
    public final void rule__ObjetoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:388:1: ( rule__ObjetoSimple__Group__0__Impl rule__ObjetoSimple__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:389:2: rule__ObjetoSimple__Group__0__Impl rule__ObjetoSimple__Group__1
            {
            pushFollow(FOLLOW_rule__ObjetoSimple__Group__0__Impl_in_rule__ObjetoSimple__Group__0760);
            rule__ObjetoSimple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjetoSimple__Group__1_in_rule__ObjetoSimple__Group__0763);
            rule__ObjetoSimple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoSimple__Group__0"


    // $ANTLR start "rule__ObjetoSimple__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:396:1: rule__ObjetoSimple__Group__0__Impl : ( ( rule__ObjetoSimple__NameAssignment_0 ) ) ;
    public final void rule__ObjetoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:400:1: ( ( ( rule__ObjetoSimple__NameAssignment_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:401:1: ( ( rule__ObjetoSimple__NameAssignment_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:401:1: ( ( rule__ObjetoSimple__NameAssignment_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:402:1: ( rule__ObjetoSimple__NameAssignment_0 )
            {
             before(grammarAccess.getObjetoSimpleAccess().getNameAssignment_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:403:1: ( rule__ObjetoSimple__NameAssignment_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:403:2: rule__ObjetoSimple__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjetoSimple__NameAssignment_0_in_rule__ObjetoSimple__Group__0__Impl790);
            rule__ObjetoSimple__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjetoSimpleAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoSimple__Group__0__Impl"


    // $ANTLR start "rule__ObjetoSimple__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:413:1: rule__ObjetoSimple__Group__1 : rule__ObjetoSimple__Group__1__Impl rule__ObjetoSimple__Group__2 ;
    public final void rule__ObjetoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:417:1: ( rule__ObjetoSimple__Group__1__Impl rule__ObjetoSimple__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:418:2: rule__ObjetoSimple__Group__1__Impl rule__ObjetoSimple__Group__2
            {
            pushFollow(FOLLOW_rule__ObjetoSimple__Group__1__Impl_in_rule__ObjetoSimple__Group__1820);
            rule__ObjetoSimple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjetoSimple__Group__2_in_rule__ObjetoSimple__Group__1823);
            rule__ObjetoSimple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoSimple__Group__1"


    // $ANTLR start "rule__ObjetoSimple__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:425:1: rule__ObjetoSimple__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjetoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:429:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:430:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:430:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:431:1: '{'
            {
             before(grammarAccess.getObjetoSimpleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__ObjetoSimple__Group__1__Impl851); 
             after(grammarAccess.getObjetoSimpleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoSimple__Group__1__Impl"


    // $ANTLR start "rule__ObjetoSimple__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:444:1: rule__ObjetoSimple__Group__2 : rule__ObjetoSimple__Group__2__Impl rule__ObjetoSimple__Group__3 ;
    public final void rule__ObjetoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:448:1: ( rule__ObjetoSimple__Group__2__Impl rule__ObjetoSimple__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:449:2: rule__ObjetoSimple__Group__2__Impl rule__ObjetoSimple__Group__3
            {
            pushFollow(FOLLOW_rule__ObjetoSimple__Group__2__Impl_in_rule__ObjetoSimple__Group__2882);
            rule__ObjetoSimple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjetoSimple__Group__3_in_rule__ObjetoSimple__Group__2885);
            rule__ObjetoSimple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoSimple__Group__2"


    // $ANTLR start "rule__ObjetoSimple__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:456:1: rule__ObjetoSimple__Group__2__Impl : ( ( rule__ObjetoSimple__ComponentesAssignment_2 )* ) ;
    public final void rule__ObjetoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:460:1: ( ( ( rule__ObjetoSimple__ComponentesAssignment_2 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:461:1: ( ( rule__ObjetoSimple__ComponentesAssignment_2 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:461:1: ( ( rule__ObjetoSimple__ComponentesAssignment_2 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:462:1: ( rule__ObjetoSimple__ComponentesAssignment_2 )*
            {
             before(grammarAccess.getObjetoSimpleAccess().getComponentesAssignment_2()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:463:1: ( rule__ObjetoSimple__ComponentesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:463:2: rule__ObjetoSimple__ComponentesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ObjetoSimple__ComponentesAssignment_2_in_rule__ObjetoSimple__Group__2__Impl912);
            	    rule__ObjetoSimple__ComponentesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getObjetoSimpleAccess().getComponentesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoSimple__Group__2__Impl"


    // $ANTLR start "rule__ObjetoSimple__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:473:1: rule__ObjetoSimple__Group__3 : rule__ObjetoSimple__Group__3__Impl ;
    public final void rule__ObjetoSimple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:477:1: ( rule__ObjetoSimple__Group__3__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:478:2: rule__ObjetoSimple__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ObjetoSimple__Group__3__Impl_in_rule__ObjetoSimple__Group__3943);
            rule__ObjetoSimple__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoSimple__Group__3"


    // $ANTLR start "rule__ObjetoSimple__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:484:1: rule__ObjetoSimple__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjetoSimple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:488:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:489:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:489:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:490:1: '}'
            {
             before(grammarAccess.getObjetoSimpleAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__ObjetoSimple__Group__3__Impl971); 
             after(grammarAccess.getObjetoSimpleAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoSimple__Group__3__Impl"


    // $ANTLR start "rule__ObjetoNombre__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:511:1: rule__ObjetoNombre__Group__0 : rule__ObjetoNombre__Group__0__Impl rule__ObjetoNombre__Group__1 ;
    public final void rule__ObjetoNombre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:515:1: ( rule__ObjetoNombre__Group__0__Impl rule__ObjetoNombre__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:516:2: rule__ObjetoNombre__Group__0__Impl rule__ObjetoNombre__Group__1
            {
            pushFollow(FOLLOW_rule__ObjetoNombre__Group__0__Impl_in_rule__ObjetoNombre__Group__01010);
            rule__ObjetoNombre__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjetoNombre__Group__1_in_rule__ObjetoNombre__Group__01013);
            rule__ObjetoNombre__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__Group__0"


    // $ANTLR start "rule__ObjetoNombre__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:523:1: rule__ObjetoNombre__Group__0__Impl : ( ( rule__ObjetoNombre__NameAssignment_0 ) ) ;
    public final void rule__ObjetoNombre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:527:1: ( ( ( rule__ObjetoNombre__NameAssignment_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:528:1: ( ( rule__ObjetoNombre__NameAssignment_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:528:1: ( ( rule__ObjetoNombre__NameAssignment_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:529:1: ( rule__ObjetoNombre__NameAssignment_0 )
            {
             before(grammarAccess.getObjetoNombreAccess().getNameAssignment_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:530:1: ( rule__ObjetoNombre__NameAssignment_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:530:2: rule__ObjetoNombre__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjetoNombre__NameAssignment_0_in_rule__ObjetoNombre__Group__0__Impl1040);
            rule__ObjetoNombre__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjetoNombreAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__Group__0__Impl"


    // $ANTLR start "rule__ObjetoNombre__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:540:1: rule__ObjetoNombre__Group__1 : rule__ObjetoNombre__Group__1__Impl rule__ObjetoNombre__Group__2 ;
    public final void rule__ObjetoNombre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:544:1: ( rule__ObjetoNombre__Group__1__Impl rule__ObjetoNombre__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:545:2: rule__ObjetoNombre__Group__1__Impl rule__ObjetoNombre__Group__2
            {
            pushFollow(FOLLOW_rule__ObjetoNombre__Group__1__Impl_in_rule__ObjetoNombre__Group__11070);
            rule__ObjetoNombre__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjetoNombre__Group__2_in_rule__ObjetoNombre__Group__11073);
            rule__ObjetoNombre__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__Group__1"


    // $ANTLR start "rule__ObjetoNombre__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:552:1: rule__ObjetoNombre__Group__1__Impl : ( ( rule__ObjetoNombre__DescripcionAssignment_1 ) ) ;
    public final void rule__ObjetoNombre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:556:1: ( ( ( rule__ObjetoNombre__DescripcionAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:557:1: ( ( rule__ObjetoNombre__DescripcionAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:557:1: ( ( rule__ObjetoNombre__DescripcionAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:558:1: ( rule__ObjetoNombre__DescripcionAssignment_1 )
            {
             before(grammarAccess.getObjetoNombreAccess().getDescripcionAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:559:1: ( rule__ObjetoNombre__DescripcionAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:559:2: rule__ObjetoNombre__DescripcionAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjetoNombre__DescripcionAssignment_1_in_rule__ObjetoNombre__Group__1__Impl1100);
            rule__ObjetoNombre__DescripcionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetoNombreAccess().getDescripcionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__Group__1__Impl"


    // $ANTLR start "rule__ObjetoNombre__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:569:1: rule__ObjetoNombre__Group__2 : rule__ObjetoNombre__Group__2__Impl rule__ObjetoNombre__Group__3 ;
    public final void rule__ObjetoNombre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:573:1: ( rule__ObjetoNombre__Group__2__Impl rule__ObjetoNombre__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:574:2: rule__ObjetoNombre__Group__2__Impl rule__ObjetoNombre__Group__3
            {
            pushFollow(FOLLOW_rule__ObjetoNombre__Group__2__Impl_in_rule__ObjetoNombre__Group__21130);
            rule__ObjetoNombre__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjetoNombre__Group__3_in_rule__ObjetoNombre__Group__21133);
            rule__ObjetoNombre__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__Group__2"


    // $ANTLR start "rule__ObjetoNombre__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:581:1: rule__ObjetoNombre__Group__2__Impl : ( '{' ) ;
    public final void rule__ObjetoNombre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:585:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:586:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:586:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:587:1: '{'
            {
             before(grammarAccess.getObjetoNombreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ObjetoNombre__Group__2__Impl1161); 
             after(grammarAccess.getObjetoNombreAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__Group__2__Impl"


    // $ANTLR start "rule__ObjetoNombre__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:600:1: rule__ObjetoNombre__Group__3 : rule__ObjetoNombre__Group__3__Impl rule__ObjetoNombre__Group__4 ;
    public final void rule__ObjetoNombre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:604:1: ( rule__ObjetoNombre__Group__3__Impl rule__ObjetoNombre__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:605:2: rule__ObjetoNombre__Group__3__Impl rule__ObjetoNombre__Group__4
            {
            pushFollow(FOLLOW_rule__ObjetoNombre__Group__3__Impl_in_rule__ObjetoNombre__Group__31192);
            rule__ObjetoNombre__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjetoNombre__Group__4_in_rule__ObjetoNombre__Group__31195);
            rule__ObjetoNombre__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__Group__3"


    // $ANTLR start "rule__ObjetoNombre__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:612:1: rule__ObjetoNombre__Group__3__Impl : ( ( rule__ObjetoNombre__ComponentesAssignment_3 )* ) ;
    public final void rule__ObjetoNombre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:616:1: ( ( ( rule__ObjetoNombre__ComponentesAssignment_3 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:617:1: ( ( rule__ObjetoNombre__ComponentesAssignment_3 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:617:1: ( ( rule__ObjetoNombre__ComponentesAssignment_3 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:618:1: ( rule__ObjetoNombre__ComponentesAssignment_3 )*
            {
             before(grammarAccess.getObjetoNombreAccess().getComponentesAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:619:1: ( rule__ObjetoNombre__ComponentesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:619:2: rule__ObjetoNombre__ComponentesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ObjetoNombre__ComponentesAssignment_3_in_rule__ObjetoNombre__Group__3__Impl1222);
            	    rule__ObjetoNombre__ComponentesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getObjetoNombreAccess().getComponentesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__Group__3__Impl"


    // $ANTLR start "rule__ObjetoNombre__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:629:1: rule__ObjetoNombre__Group__4 : rule__ObjetoNombre__Group__4__Impl ;
    public final void rule__ObjetoNombre__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:633:1: ( rule__ObjetoNombre__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:634:2: rule__ObjetoNombre__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ObjetoNombre__Group__4__Impl_in_rule__ObjetoNombre__Group__41253);
            rule__ObjetoNombre__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__Group__4"


    // $ANTLR start "rule__ObjetoNombre__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:640:1: rule__ObjetoNombre__Group__4__Impl : ( '}' ) ;
    public final void rule__ObjetoNombre__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:644:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:645:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:645:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:646:1: '}'
            {
             before(grammarAccess.getObjetoNombreAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ObjetoNombre__Group__4__Impl1281); 
             after(grammarAccess.getObjetoNombreAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__Group__4__Impl"


    // $ANTLR start "rule__TipoSimple__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:671:1: rule__TipoSimple__Group__0 : rule__TipoSimple__Group__0__Impl rule__TipoSimple__Group__1 ;
    public final void rule__TipoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:675:1: ( rule__TipoSimple__Group__0__Impl rule__TipoSimple__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:676:2: rule__TipoSimple__Group__0__Impl rule__TipoSimple__Group__1
            {
            pushFollow(FOLLOW_rule__TipoSimple__Group__0__Impl_in_rule__TipoSimple__Group__01324);
            rule__TipoSimple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TipoSimple__Group__1_in_rule__TipoSimple__Group__01327);
            rule__TipoSimple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoSimple__Group__0"


    // $ANTLR start "rule__TipoSimple__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:683:1: rule__TipoSimple__Group__0__Impl : ( () ) ;
    public final void rule__TipoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:687:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:688:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:688:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:689:1: ()
            {
             before(grammarAccess.getTipoSimpleAccess().getTipoSimpleAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:690:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:692:1: 
            {
            }

             after(grammarAccess.getTipoSimpleAccess().getTipoSimpleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoSimple__Group__0__Impl"


    // $ANTLR start "rule__TipoSimple__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:702:1: rule__TipoSimple__Group__1 : rule__TipoSimple__Group__1__Impl rule__TipoSimple__Group__2 ;
    public final void rule__TipoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:706:1: ( rule__TipoSimple__Group__1__Impl rule__TipoSimple__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:707:2: rule__TipoSimple__Group__1__Impl rule__TipoSimple__Group__2
            {
            pushFollow(FOLLOW_rule__TipoSimple__Group__1__Impl_in_rule__TipoSimple__Group__11385);
            rule__TipoSimple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TipoSimple__Group__2_in_rule__TipoSimple__Group__11388);
            rule__TipoSimple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoSimple__Group__1"


    // $ANTLR start "rule__TipoSimple__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:714:1: rule__TipoSimple__Group__1__Impl : ( ( rule__TipoSimple__Alternatives_1 ) ) ;
    public final void rule__TipoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:718:1: ( ( ( rule__TipoSimple__Alternatives_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:719:1: ( ( rule__TipoSimple__Alternatives_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:719:1: ( ( rule__TipoSimple__Alternatives_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:720:1: ( rule__TipoSimple__Alternatives_1 )
            {
             before(grammarAccess.getTipoSimpleAccess().getAlternatives_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:721:1: ( rule__TipoSimple__Alternatives_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:721:2: rule__TipoSimple__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TipoSimple__Alternatives_1_in_rule__TipoSimple__Group__1__Impl1415);
            rule__TipoSimple__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTipoSimpleAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoSimple__Group__1__Impl"


    // $ANTLR start "rule__TipoSimple__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:731:1: rule__TipoSimple__Group__2 : rule__TipoSimple__Group__2__Impl ;
    public final void rule__TipoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:735:1: ( rule__TipoSimple__Group__2__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:736:2: rule__TipoSimple__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TipoSimple__Group__2__Impl_in_rule__TipoSimple__Group__21445);
            rule__TipoSimple__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoSimple__Group__2"


    // $ANTLR start "rule__TipoSimple__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:742:1: rule__TipoSimple__Group__2__Impl : ( ';' ) ;
    public final void rule__TipoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:746:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:747:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:747:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:748:1: ';'
            {
             before(grammarAccess.getTipoSimpleAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__TipoSimple__Group__2__Impl1473); 
             after(grammarAccess.getTipoSimpleAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoSimple__Group__2__Impl"


    // $ANTLR start "rule__TipoValor__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:767:1: rule__TipoValor__Group__0 : rule__TipoValor__Group__0__Impl rule__TipoValor__Group__1 ;
    public final void rule__TipoValor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:771:1: ( rule__TipoValor__Group__0__Impl rule__TipoValor__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:772:2: rule__TipoValor__Group__0__Impl rule__TipoValor__Group__1
            {
            pushFollow(FOLLOW_rule__TipoValor__Group__0__Impl_in_rule__TipoValor__Group__01510);
            rule__TipoValor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TipoValor__Group__1_in_rule__TipoValor__Group__01513);
            rule__TipoValor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__0"


    // $ANTLR start "rule__TipoValor__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:779:1: rule__TipoValor__Group__0__Impl : ( () ) ;
    public final void rule__TipoValor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:783:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:784:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:784:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:785:1: ()
            {
             before(grammarAccess.getTipoValorAccess().getTipoValorAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:786:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:788:1: 
            {
            }

             after(grammarAccess.getTipoValorAccess().getTipoValorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__0__Impl"


    // $ANTLR start "rule__TipoValor__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:798:1: rule__TipoValor__Group__1 : rule__TipoValor__Group__1__Impl rule__TipoValor__Group__2 ;
    public final void rule__TipoValor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:802:1: ( rule__TipoValor__Group__1__Impl rule__TipoValor__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:803:2: rule__TipoValor__Group__1__Impl rule__TipoValor__Group__2
            {
            pushFollow(FOLLOW_rule__TipoValor__Group__1__Impl_in_rule__TipoValor__Group__11571);
            rule__TipoValor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TipoValor__Group__2_in_rule__TipoValor__Group__11574);
            rule__TipoValor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__1"


    // $ANTLR start "rule__TipoValor__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:810:1: rule__TipoValor__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__TipoValor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:814:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:815:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:815:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:816:1: RULE_ID
            {
             before(grammarAccess.getTipoValorAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TipoValor__Group__1__Impl1601); 
             after(grammarAccess.getTipoValorAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__1__Impl"


    // $ANTLR start "rule__TipoValor__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:827:1: rule__TipoValor__Group__2 : rule__TipoValor__Group__2__Impl rule__TipoValor__Group__3 ;
    public final void rule__TipoValor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:831:1: ( rule__TipoValor__Group__2__Impl rule__TipoValor__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:832:2: rule__TipoValor__Group__2__Impl rule__TipoValor__Group__3
            {
            pushFollow(FOLLOW_rule__TipoValor__Group__2__Impl_in_rule__TipoValor__Group__21630);
            rule__TipoValor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TipoValor__Group__3_in_rule__TipoValor__Group__21633);
            rule__TipoValor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__2"


    // $ANTLR start "rule__TipoValor__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:839:1: rule__TipoValor__Group__2__Impl : ( ':' ) ;
    public final void rule__TipoValor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:843:1: ( ( ':' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:844:1: ( ':' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:844:1: ( ':' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:845:1: ':'
            {
             before(grammarAccess.getTipoValorAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__TipoValor__Group__2__Impl1661); 
             after(grammarAccess.getTipoValorAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__2__Impl"


    // $ANTLR start "rule__TipoValor__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:858:1: rule__TipoValor__Group__3 : rule__TipoValor__Group__3__Impl rule__TipoValor__Group__4 ;
    public final void rule__TipoValor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:862:1: ( rule__TipoValor__Group__3__Impl rule__TipoValor__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:863:2: rule__TipoValor__Group__3__Impl rule__TipoValor__Group__4
            {
            pushFollow(FOLLOW_rule__TipoValor__Group__3__Impl_in_rule__TipoValor__Group__31692);
            rule__TipoValor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TipoValor__Group__4_in_rule__TipoValor__Group__31695);
            rule__TipoValor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__3"


    // $ANTLR start "rule__TipoValor__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:870:1: rule__TipoValor__Group__3__Impl : ( RULE_ID ) ;
    public final void rule__TipoValor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:874:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:875:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:875:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:876:1: RULE_ID
            {
             before(grammarAccess.getTipoValorAccess().getIDTerminalRuleCall_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TipoValor__Group__3__Impl1722); 
             after(grammarAccess.getTipoValorAccess().getIDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__3__Impl"


    // $ANTLR start "rule__TipoValor__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:887:1: rule__TipoValor__Group__4 : rule__TipoValor__Group__4__Impl rule__TipoValor__Group__5 ;
    public final void rule__TipoValor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:891:1: ( rule__TipoValor__Group__4__Impl rule__TipoValor__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:892:2: rule__TipoValor__Group__4__Impl rule__TipoValor__Group__5
            {
            pushFollow(FOLLOW_rule__TipoValor__Group__4__Impl_in_rule__TipoValor__Group__41751);
            rule__TipoValor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TipoValor__Group__5_in_rule__TipoValor__Group__41754);
            rule__TipoValor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__4"


    // $ANTLR start "rule__TipoValor__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:899:1: rule__TipoValor__Group__4__Impl : ( '=' ) ;
    public final void rule__TipoValor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:903:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:904:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:904:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:905:1: '='
            {
             before(grammarAccess.getTipoValorAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__TipoValor__Group__4__Impl1782); 
             after(grammarAccess.getTipoValorAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__4__Impl"


    // $ANTLR start "rule__TipoValor__Group__5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:918:1: rule__TipoValor__Group__5 : rule__TipoValor__Group__5__Impl rule__TipoValor__Group__6 ;
    public final void rule__TipoValor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:922:1: ( rule__TipoValor__Group__5__Impl rule__TipoValor__Group__6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:923:2: rule__TipoValor__Group__5__Impl rule__TipoValor__Group__6
            {
            pushFollow(FOLLOW_rule__TipoValor__Group__5__Impl_in_rule__TipoValor__Group__51813);
            rule__TipoValor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TipoValor__Group__6_in_rule__TipoValor__Group__51816);
            rule__TipoValor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__5"


    // $ANTLR start "rule__TipoValor__Group__5__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:930:1: rule__TipoValor__Group__5__Impl : ( RULE_DECIMAL ) ;
    public final void rule__TipoValor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:934:1: ( ( RULE_DECIMAL ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:935:1: ( RULE_DECIMAL )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:935:1: ( RULE_DECIMAL )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:936:1: RULE_DECIMAL
            {
             before(grammarAccess.getTipoValorAccess().getDECIMALTerminalRuleCall_5()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__TipoValor__Group__5__Impl1843); 
             after(grammarAccess.getTipoValorAccess().getDECIMALTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__5__Impl"


    // $ANTLR start "rule__TipoValor__Group__6"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:947:1: rule__TipoValor__Group__6 : rule__TipoValor__Group__6__Impl ;
    public final void rule__TipoValor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:951:1: ( rule__TipoValor__Group__6__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:952:2: rule__TipoValor__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TipoValor__Group__6__Impl_in_rule__TipoValor__Group__61872);
            rule__TipoValor__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__6"


    // $ANTLR start "rule__TipoValor__Group__6__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:958:1: rule__TipoValor__Group__6__Impl : ( ';' ) ;
    public final void rule__TipoValor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:962:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:963:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:963:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:964:1: ';'
            {
             before(grammarAccess.getTipoValorAccess().getSemicolonKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__TipoValor__Group__6__Impl1900); 
             after(grammarAccess.getTipoValorAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoValor__Group__6__Impl"


    // $ANTLR start "rule__ListaInt__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:991:1: rule__ListaInt__Group__0 : rule__ListaInt__Group__0__Impl rule__ListaInt__Group__1 ;
    public final void rule__ListaInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:995:1: ( rule__ListaInt__Group__0__Impl rule__ListaInt__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:996:2: rule__ListaInt__Group__0__Impl rule__ListaInt__Group__1
            {
            pushFollow(FOLLOW_rule__ListaInt__Group__0__Impl_in_rule__ListaInt__Group__01945);
            rule__ListaInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInt__Group__1_in_rule__ListaInt__Group__01948);
            rule__ListaInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group__0"


    // $ANTLR start "rule__ListaInt__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1003:1: rule__ListaInt__Group__0__Impl : ( () ) ;
    public final void rule__ListaInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1007:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1008:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1008:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1009:1: ()
            {
             before(grammarAccess.getListaIntAccess().getListaIntAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1010:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1012:1: 
            {
            }

             after(grammarAccess.getListaIntAccess().getListaIntAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group__0__Impl"


    // $ANTLR start "rule__ListaInt__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1022:1: rule__ListaInt__Group__1 : rule__ListaInt__Group__1__Impl rule__ListaInt__Group__2 ;
    public final void rule__ListaInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1026:1: ( rule__ListaInt__Group__1__Impl rule__ListaInt__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1027:2: rule__ListaInt__Group__1__Impl rule__ListaInt__Group__2
            {
            pushFollow(FOLLOW_rule__ListaInt__Group__1__Impl_in_rule__ListaInt__Group__12006);
            rule__ListaInt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInt__Group__2_in_rule__ListaInt__Group__12009);
            rule__ListaInt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group__1"


    // $ANTLR start "rule__ListaInt__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1034:1: rule__ListaInt__Group__1__Impl : ( 'List of Integer = {' ) ;
    public final void rule__ListaInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1038:1: ( ( 'List of Integer = {' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1039:1: ( 'List of Integer = {' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1039:1: ( 'List of Integer = {' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1040:1: 'List of Integer = {'
            {
             before(grammarAccess.getListaIntAccess().getListOfIntegerKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__ListaInt__Group__1__Impl2037); 
             after(grammarAccess.getListaIntAccess().getListOfIntegerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group__1__Impl"


    // $ANTLR start "rule__ListaInt__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1053:1: rule__ListaInt__Group__2 : rule__ListaInt__Group__2__Impl rule__ListaInt__Group__3 ;
    public final void rule__ListaInt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1057:1: ( rule__ListaInt__Group__2__Impl rule__ListaInt__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1058:2: rule__ListaInt__Group__2__Impl rule__ListaInt__Group__3
            {
            pushFollow(FOLLOW_rule__ListaInt__Group__2__Impl_in_rule__ListaInt__Group__22068);
            rule__ListaInt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInt__Group__3_in_rule__ListaInt__Group__22071);
            rule__ListaInt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group__2"


    // $ANTLR start "rule__ListaInt__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1065:1: rule__ListaInt__Group__2__Impl : ( ( rule__ListaInt__ValoresAssignment_2 ) ) ;
    public final void rule__ListaInt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1069:1: ( ( ( rule__ListaInt__ValoresAssignment_2 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1070:1: ( ( rule__ListaInt__ValoresAssignment_2 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1070:1: ( ( rule__ListaInt__ValoresAssignment_2 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1071:1: ( rule__ListaInt__ValoresAssignment_2 )
            {
             before(grammarAccess.getListaIntAccess().getValoresAssignment_2()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1072:1: ( rule__ListaInt__ValoresAssignment_2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1072:2: rule__ListaInt__ValoresAssignment_2
            {
            pushFollow(FOLLOW_rule__ListaInt__ValoresAssignment_2_in_rule__ListaInt__Group__2__Impl2098);
            rule__ListaInt__ValoresAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListaIntAccess().getValoresAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group__2__Impl"


    // $ANTLR start "rule__ListaInt__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1082:1: rule__ListaInt__Group__3 : rule__ListaInt__Group__3__Impl rule__ListaInt__Group__4 ;
    public final void rule__ListaInt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1086:1: ( rule__ListaInt__Group__3__Impl rule__ListaInt__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1087:2: rule__ListaInt__Group__3__Impl rule__ListaInt__Group__4
            {
            pushFollow(FOLLOW_rule__ListaInt__Group__3__Impl_in_rule__ListaInt__Group__32128);
            rule__ListaInt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInt__Group__4_in_rule__ListaInt__Group__32131);
            rule__ListaInt__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group__3"


    // $ANTLR start "rule__ListaInt__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1094:1: rule__ListaInt__Group__3__Impl : ( ( rule__ListaInt__Group_3__0 )* ) ;
    public final void rule__ListaInt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1098:1: ( ( ( rule__ListaInt__Group_3__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1099:1: ( ( rule__ListaInt__Group_3__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1099:1: ( ( rule__ListaInt__Group_3__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1100:1: ( rule__ListaInt__Group_3__0 )*
            {
             before(grammarAccess.getListaIntAccess().getGroup_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1101:1: ( rule__ListaInt__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1101:2: rule__ListaInt__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ListaInt__Group_3__0_in_rule__ListaInt__Group__3__Impl2158);
            	    rule__ListaInt__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getListaIntAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group__3__Impl"


    // $ANTLR start "rule__ListaInt__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1111:1: rule__ListaInt__Group__4 : rule__ListaInt__Group__4__Impl ;
    public final void rule__ListaInt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1115:1: ( rule__ListaInt__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1116:2: rule__ListaInt__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ListaInt__Group__4__Impl_in_rule__ListaInt__Group__42189);
            rule__ListaInt__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group__4"


    // $ANTLR start "rule__ListaInt__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1122:1: rule__ListaInt__Group__4__Impl : ( '}' ) ;
    public final void rule__ListaInt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1126:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1127:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1127:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1128:1: '}'
            {
             before(grammarAccess.getListaIntAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ListaInt__Group__4__Impl2217); 
             after(grammarAccess.getListaIntAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group__4__Impl"


    // $ANTLR start "rule__ListaInt__Group_3__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1151:1: rule__ListaInt__Group_3__0 : rule__ListaInt__Group_3__0__Impl rule__ListaInt__Group_3__1 ;
    public final void rule__ListaInt__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1155:1: ( rule__ListaInt__Group_3__0__Impl rule__ListaInt__Group_3__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1156:2: rule__ListaInt__Group_3__0__Impl rule__ListaInt__Group_3__1
            {
            pushFollow(FOLLOW_rule__ListaInt__Group_3__0__Impl_in_rule__ListaInt__Group_3__02258);
            rule__ListaInt__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInt__Group_3__1_in_rule__ListaInt__Group_3__02261);
            rule__ListaInt__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group_3__0"


    // $ANTLR start "rule__ListaInt__Group_3__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1163:1: rule__ListaInt__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ListaInt__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1167:1: ( ( ',' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1168:1: ( ',' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1168:1: ( ',' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1169:1: ','
            {
             before(grammarAccess.getListaIntAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__ListaInt__Group_3__0__Impl2289); 
             after(grammarAccess.getListaIntAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group_3__0__Impl"


    // $ANTLR start "rule__ListaInt__Group_3__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1182:1: rule__ListaInt__Group_3__1 : rule__ListaInt__Group_3__1__Impl ;
    public final void rule__ListaInt__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1186:1: ( rule__ListaInt__Group_3__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1187:2: rule__ListaInt__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ListaInt__Group_3__1__Impl_in_rule__ListaInt__Group_3__12320);
            rule__ListaInt__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group_3__1"


    // $ANTLR start "rule__ListaInt__Group_3__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1193:1: rule__ListaInt__Group_3__1__Impl : ( RULE_INT ) ;
    public final void rule__ListaInt__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1197:1: ( ( RULE_INT ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1198:1: ( RULE_INT )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1198:1: ( RULE_INT )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1199:1: RULE_INT
            {
             before(grammarAccess.getListaIntAccess().getINTTerminalRuleCall_3_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ListaInt__Group_3__1__Impl2347); 
             after(grammarAccess.getListaIntAccess().getINTTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__Group_3__1__Impl"


    // $ANTLR start "rule__ListaString__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1214:1: rule__ListaString__Group__0 : rule__ListaString__Group__0__Impl rule__ListaString__Group__1 ;
    public final void rule__ListaString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1218:1: ( rule__ListaString__Group__0__Impl rule__ListaString__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1219:2: rule__ListaString__Group__0__Impl rule__ListaString__Group__1
            {
            pushFollow(FOLLOW_rule__ListaString__Group__0__Impl_in_rule__ListaString__Group__02380);
            rule__ListaString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__1_in_rule__ListaString__Group__02383);
            rule__ListaString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group__0"


    // $ANTLR start "rule__ListaString__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1226:1: rule__ListaString__Group__0__Impl : ( () ) ;
    public final void rule__ListaString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1230:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1231:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1231:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1232:1: ()
            {
             before(grammarAccess.getListaStringAccess().getListaStringAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1233:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1235:1: 
            {
            }

             after(grammarAccess.getListaStringAccess().getListaStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group__0__Impl"


    // $ANTLR start "rule__ListaString__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1245:1: rule__ListaString__Group__1 : rule__ListaString__Group__1__Impl rule__ListaString__Group__2 ;
    public final void rule__ListaString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1249:1: ( rule__ListaString__Group__1__Impl rule__ListaString__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1250:2: rule__ListaString__Group__1__Impl rule__ListaString__Group__2
            {
            pushFollow(FOLLOW_rule__ListaString__Group__1__Impl_in_rule__ListaString__Group__12441);
            rule__ListaString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__2_in_rule__ListaString__Group__12444);
            rule__ListaString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group__1"


    // $ANTLR start "rule__ListaString__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1257:1: rule__ListaString__Group__1__Impl : ( 'List of String = {' ) ;
    public final void rule__ListaString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1261:1: ( ( 'List of String = {' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1262:1: ( 'List of String = {' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1262:1: ( 'List of String = {' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1263:1: 'List of String = {'
            {
             before(grammarAccess.getListaStringAccess().getListOfStringKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ListaString__Group__1__Impl2472); 
             after(grammarAccess.getListaStringAccess().getListOfStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group__1__Impl"


    // $ANTLR start "rule__ListaString__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1276:1: rule__ListaString__Group__2 : rule__ListaString__Group__2__Impl rule__ListaString__Group__3 ;
    public final void rule__ListaString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1280:1: ( rule__ListaString__Group__2__Impl rule__ListaString__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1281:2: rule__ListaString__Group__2__Impl rule__ListaString__Group__3
            {
            pushFollow(FOLLOW_rule__ListaString__Group__2__Impl_in_rule__ListaString__Group__22503);
            rule__ListaString__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__3_in_rule__ListaString__Group__22506);
            rule__ListaString__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group__2"


    // $ANTLR start "rule__ListaString__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1288:1: rule__ListaString__Group__2__Impl : ( ( rule__ListaString__ValoresAssignment_2 ) ) ;
    public final void rule__ListaString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1292:1: ( ( ( rule__ListaString__ValoresAssignment_2 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1293:1: ( ( rule__ListaString__ValoresAssignment_2 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1293:1: ( ( rule__ListaString__ValoresAssignment_2 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1294:1: ( rule__ListaString__ValoresAssignment_2 )
            {
             before(grammarAccess.getListaStringAccess().getValoresAssignment_2()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1295:1: ( rule__ListaString__ValoresAssignment_2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1295:2: rule__ListaString__ValoresAssignment_2
            {
            pushFollow(FOLLOW_rule__ListaString__ValoresAssignment_2_in_rule__ListaString__Group__2__Impl2533);
            rule__ListaString__ValoresAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListaStringAccess().getValoresAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group__2__Impl"


    // $ANTLR start "rule__ListaString__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1305:1: rule__ListaString__Group__3 : rule__ListaString__Group__3__Impl rule__ListaString__Group__4 ;
    public final void rule__ListaString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1309:1: ( rule__ListaString__Group__3__Impl rule__ListaString__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1310:2: rule__ListaString__Group__3__Impl rule__ListaString__Group__4
            {
            pushFollow(FOLLOW_rule__ListaString__Group__3__Impl_in_rule__ListaString__Group__32563);
            rule__ListaString__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__4_in_rule__ListaString__Group__32566);
            rule__ListaString__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group__3"


    // $ANTLR start "rule__ListaString__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1317:1: rule__ListaString__Group__3__Impl : ( ( rule__ListaString__Group_3__0 )* ) ;
    public final void rule__ListaString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1321:1: ( ( ( rule__ListaString__Group_3__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1322:1: ( ( rule__ListaString__Group_3__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1322:1: ( ( rule__ListaString__Group_3__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1323:1: ( rule__ListaString__Group_3__0 )*
            {
             before(grammarAccess.getListaStringAccess().getGroup_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1324:1: ( rule__ListaString__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1324:2: rule__ListaString__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ListaString__Group_3__0_in_rule__ListaString__Group__3__Impl2593);
            	    rule__ListaString__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getListaStringAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group__3__Impl"


    // $ANTLR start "rule__ListaString__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1334:1: rule__ListaString__Group__4 : rule__ListaString__Group__4__Impl ;
    public final void rule__ListaString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1338:1: ( rule__ListaString__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1339:2: rule__ListaString__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ListaString__Group__4__Impl_in_rule__ListaString__Group__42624);
            rule__ListaString__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group__4"


    // $ANTLR start "rule__ListaString__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1345:1: rule__ListaString__Group__4__Impl : ( '}' ) ;
    public final void rule__ListaString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1349:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1350:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1350:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1351:1: '}'
            {
             before(grammarAccess.getListaStringAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ListaString__Group__4__Impl2652); 
             after(grammarAccess.getListaStringAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group__4__Impl"


    // $ANTLR start "rule__ListaString__Group_3__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1374:1: rule__ListaString__Group_3__0 : rule__ListaString__Group_3__0__Impl rule__ListaString__Group_3__1 ;
    public final void rule__ListaString__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1378:1: ( rule__ListaString__Group_3__0__Impl rule__ListaString__Group_3__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1379:2: rule__ListaString__Group_3__0__Impl rule__ListaString__Group_3__1
            {
            pushFollow(FOLLOW_rule__ListaString__Group_3__0__Impl_in_rule__ListaString__Group_3__02693);
            rule__ListaString__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group_3__1_in_rule__ListaString__Group_3__02696);
            rule__ListaString__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group_3__0"


    // $ANTLR start "rule__ListaString__Group_3__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1386:1: rule__ListaString__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ListaString__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1390:1: ( ( ',' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1391:1: ( ',' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1391:1: ( ',' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1392:1: ','
            {
             before(grammarAccess.getListaStringAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__ListaString__Group_3__0__Impl2724); 
             after(grammarAccess.getListaStringAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group_3__0__Impl"


    // $ANTLR start "rule__ListaString__Group_3__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1405:1: rule__ListaString__Group_3__1 : rule__ListaString__Group_3__1__Impl ;
    public final void rule__ListaString__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1409:1: ( rule__ListaString__Group_3__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1410:2: rule__ListaString__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ListaString__Group_3__1__Impl_in_rule__ListaString__Group_3__12755);
            rule__ListaString__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group_3__1"


    // $ANTLR start "rule__ListaString__Group_3__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1416:1: rule__ListaString__Group_3__1__Impl : ( RULE_STRING ) ;
    public final void rule__ListaString__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1420:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1421:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1421:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1422:1: RULE_STRING
            {
             before(grammarAccess.getListaStringAccess().getSTRINGTerminalRuleCall_3_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListaString__Group_3__1__Impl2782); 
             after(grammarAccess.getListaStringAccess().getSTRINGTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__Group_3__1__Impl"


    // $ANTLR start "rule__Model__ComponentesAssignment"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1438:1: rule__Model__ComponentesAssignment : ( ruleComponente ) ;
    public final void rule__Model__ComponentesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1442:1: ( ( ruleComponente ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1443:1: ( ruleComponente )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1443:1: ( ruleComponente )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1444:1: ruleComponente
            {
             before(grammarAccess.getModelAccess().getComponentesComponenteParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComponente_in_rule__Model__ComponentesAssignment2820);
            ruleComponente();

            state._fsp--;

             after(grammarAccess.getModelAccess().getComponentesComponenteParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ComponentesAssignment"


    // $ANTLR start "rule__ObjetoSimple__NameAssignment_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1453:1: rule__ObjetoSimple__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObjetoSimple__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1457:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1458:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1458:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1459:1: RULE_ID
            {
             before(grammarAccess.getObjetoSimpleAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjetoSimple__NameAssignment_02851); 
             after(grammarAccess.getObjetoSimpleAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoSimple__NameAssignment_0"


    // $ANTLR start "rule__ObjetoSimple__ComponentesAssignment_2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1468:1: rule__ObjetoSimple__ComponentesAssignment_2 : ( ruleComponente ) ;
    public final void rule__ObjetoSimple__ComponentesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1472:1: ( ( ruleComponente ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1473:1: ( ruleComponente )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1473:1: ( ruleComponente )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1474:1: ruleComponente
            {
             before(grammarAccess.getObjetoSimpleAccess().getComponentesComponenteParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleComponente_in_rule__ObjetoSimple__ComponentesAssignment_22882);
            ruleComponente();

            state._fsp--;

             after(grammarAccess.getObjetoSimpleAccess().getComponentesComponenteParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoSimple__ComponentesAssignment_2"


    // $ANTLR start "rule__ObjetoNombre__NameAssignment_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1483:1: rule__ObjetoNombre__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObjetoNombre__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1487:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1488:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1488:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1489:1: RULE_ID
            {
             before(grammarAccess.getObjetoNombreAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjetoNombre__NameAssignment_02913); 
             after(grammarAccess.getObjetoNombreAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__NameAssignment_0"


    // $ANTLR start "rule__ObjetoNombre__DescripcionAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1498:1: rule__ObjetoNombre__DescripcionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ObjetoNombre__DescripcionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1502:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1503:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1503:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1504:1: RULE_STRING
            {
             before(grammarAccess.getObjetoNombreAccess().getDescripcionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ObjetoNombre__DescripcionAssignment_12944); 
             after(grammarAccess.getObjetoNombreAccess().getDescripcionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__DescripcionAssignment_1"


    // $ANTLR start "rule__ObjetoNombre__ComponentesAssignment_3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1513:1: rule__ObjetoNombre__ComponentesAssignment_3 : ( ruleComponente ) ;
    public final void rule__ObjetoNombre__ComponentesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1517:1: ( ( ruleComponente ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1518:1: ( ruleComponente )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1518:1: ( ruleComponente )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1519:1: ruleComponente
            {
             before(grammarAccess.getObjetoNombreAccess().getComponentesComponenteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComponente_in_rule__ObjetoNombre__ComponentesAssignment_32975);
            ruleComponente();

            state._fsp--;

             after(grammarAccess.getObjetoNombreAccess().getComponentesComponenteParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjetoNombre__ComponentesAssignment_3"


    // $ANTLR start "rule__ListaInt__ValoresAssignment_2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1528:1: rule__ListaInt__ValoresAssignment_2 : ( RULE_INT ) ;
    public final void rule__ListaInt__ValoresAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1532:1: ( ( RULE_INT ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1533:1: ( RULE_INT )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1533:1: ( RULE_INT )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1534:1: RULE_INT
            {
             before(grammarAccess.getListaIntAccess().getValoresINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ListaInt__ValoresAssignment_23006); 
             after(grammarAccess.getListaIntAccess().getValoresINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInt__ValoresAssignment_2"


    // $ANTLR start "rule__ListaString__ValoresAssignment_2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1543:1: rule__ListaString__ValoresAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListaString__ValoresAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1547:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1548:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1548:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1549:1: RULE_STRING
            {
             before(grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListaString__ValoresAssignment_23037); 
             after(grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaString__ValoresAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ComponentesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleComponente_in_entryRuleComponente122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponente129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Componente__Alternatives_in_ruleComponente155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjetoSimple_in_entryRuleObjetoSimple182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjetoSimple189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoSimple__Group__0_in_ruleObjetoSimple215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjetoNombre_in_entryRuleObjetoNombre242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjetoNombre249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__Group__0_in_ruleObjetoNombre275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTipoSimple_in_entryRuleTipoSimple304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTipoSimple311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoSimple__Group__0_in_ruleTipoSimple337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTipoValor_in_entryRuleTipoValor364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTipoValor371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__0_in_ruleTipoValor397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLista_in_entryRuleLista424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLista431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lista__Alternatives_in_ruleLista457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInt_in_entryRuleListaInt484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaInt491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInt__Group__0_in_ruleListaInt517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_entryRuleListaString544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaString551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__0_in_ruleListaString577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjetoSimple_in_rule__Componente__Alternatives613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjetoNombre_in_rule__Componente__Alternatives630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TipoSimple__Alternatives_1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TipoSimple__Alternatives_1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInt_in_rule__Lista__Alternatives713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_rule__Lista__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoSimple__Group__0__Impl_in_rule__ObjetoSimple__Group__0760 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ObjetoSimple__Group__1_in_rule__ObjetoSimple__Group__0763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoSimple__NameAssignment_0_in_rule__ObjetoSimple__Group__0__Impl790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoSimple__Group__1__Impl_in_rule__ObjetoSimple__Group__1820 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ObjetoSimple__Group__2_in_rule__ObjetoSimple__Group__1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ObjetoSimple__Group__1__Impl851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoSimple__Group__2__Impl_in_rule__ObjetoSimple__Group__2882 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ObjetoSimple__Group__3_in_rule__ObjetoSimple__Group__2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoSimple__ComponentesAssignment_2_in_rule__ObjetoSimple__Group__2__Impl912 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ObjetoSimple__Group__3__Impl_in_rule__ObjetoSimple__Group__3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ObjetoSimple__Group__3__Impl971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__Group__0__Impl_in_rule__ObjetoNombre__Group__01010 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__Group__1_in_rule__ObjetoNombre__Group__01013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__NameAssignment_0_in_rule__ObjetoNombre__Group__0__Impl1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__Group__1__Impl_in_rule__ObjetoNombre__Group__11070 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__Group__2_in_rule__ObjetoNombre__Group__11073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__DescripcionAssignment_1_in_rule__ObjetoNombre__Group__1__Impl1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__Group__2__Impl_in_rule__ObjetoNombre__Group__21130 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__Group__3_in_rule__ObjetoNombre__Group__21133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ObjetoNombre__Group__2__Impl1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__Group__3__Impl_in_rule__ObjetoNombre__Group__31192 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__Group__4_in_rule__ObjetoNombre__Group__31195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__ComponentesAssignment_3_in_rule__ObjetoNombre__Group__3__Impl1222 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ObjetoNombre__Group__4__Impl_in_rule__ObjetoNombre__Group__41253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ObjetoNombre__Group__4__Impl1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoSimple__Group__0__Impl_in_rule__TipoSimple__Group__01324 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TipoSimple__Group__1_in_rule__TipoSimple__Group__01327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoSimple__Group__1__Impl_in_rule__TipoSimple__Group__11385 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__TipoSimple__Group__2_in_rule__TipoSimple__Group__11388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoSimple__Alternatives_1_in_rule__TipoSimple__Group__1__Impl1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoSimple__Group__2__Impl_in_rule__TipoSimple__Group__21445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TipoSimple__Group__2__Impl1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__0__Impl_in_rule__TipoValor__Group__01510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__1_in_rule__TipoValor__Group__01513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__1__Impl_in_rule__TipoValor__Group__11571 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__2_in_rule__TipoValor__Group__11574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TipoValor__Group__1__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__2__Impl_in_rule__TipoValor__Group__21630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__3_in_rule__TipoValor__Group__21633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TipoValor__Group__2__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__3__Impl_in_rule__TipoValor__Group__31692 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__4_in_rule__TipoValor__Group__31695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TipoValor__Group__3__Impl1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__4__Impl_in_rule__TipoValor__Group__41751 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__5_in_rule__TipoValor__Group__41754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TipoValor__Group__4__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__5__Impl_in_rule__TipoValor__Group__51813 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__6_in_rule__TipoValor__Group__51816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__TipoValor__Group__5__Impl1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TipoValor__Group__6__Impl_in_rule__TipoValor__Group__61872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TipoValor__Group__6__Impl1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInt__Group__0__Impl_in_rule__ListaInt__Group__01945 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ListaInt__Group__1_in_rule__ListaInt__Group__01948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInt__Group__1__Impl_in_rule__ListaInt__Group__12006 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ListaInt__Group__2_in_rule__ListaInt__Group__12009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ListaInt__Group__1__Impl2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInt__Group__2__Impl_in_rule__ListaInt__Group__22068 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaInt__Group__3_in_rule__ListaInt__Group__22071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInt__ValoresAssignment_2_in_rule__ListaInt__Group__2__Impl2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInt__Group__3__Impl_in_rule__ListaInt__Group__32128 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaInt__Group__4_in_rule__ListaInt__Group__32131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInt__Group_3__0_in_rule__ListaInt__Group__3__Impl2158 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ListaInt__Group__4__Impl_in_rule__ListaInt__Group__42189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ListaInt__Group__4__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInt__Group_3__0__Impl_in_rule__ListaInt__Group_3__02258 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ListaInt__Group_3__1_in_rule__ListaInt__Group_3__02261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ListaInt__Group_3__0__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInt__Group_3__1__Impl_in_rule__ListaInt__Group_3__12320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ListaInt__Group_3__1__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__0__Impl_in_rule__ListaString__Group__02380 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__1_in_rule__ListaString__Group__02383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__1__Impl_in_rule__ListaString__Group__12441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListaString__Group__2_in_rule__ListaString__Group__12444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ListaString__Group__1__Impl2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__2__Impl_in_rule__ListaString__Group__22503 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__3_in_rule__ListaString__Group__22506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__ValoresAssignment_2_in_rule__ListaString__Group__2__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__3__Impl_in_rule__ListaString__Group__32563 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__4_in_rule__ListaString__Group__32566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_3__0_in_rule__ListaString__Group__3__Impl2593 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__4__Impl_in_rule__ListaString__Group__42624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ListaString__Group__4__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_3__0__Impl_in_rule__ListaString__Group_3__02693 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListaString__Group_3__1_in_rule__ListaString__Group_3__02696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ListaString__Group_3__0__Impl2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_3__1__Impl_in_rule__ListaString__Group_3__12755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListaString__Group_3__1__Impl2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponente_in_rule__Model__ComponentesAssignment2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjetoSimple__NameAssignment_02851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponente_in_rule__ObjetoSimple__ComponentesAssignment_22882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjetoNombre__NameAssignment_02913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ObjetoNombre__DescripcionAssignment_12944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponente_in_rule__ObjetoNombre__ComponentesAssignment_32975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ListaInt__ValoresAssignment_23006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListaString__ValoresAssignment_23037 = new BitSet(new long[]{0x0000000000000002L});

}