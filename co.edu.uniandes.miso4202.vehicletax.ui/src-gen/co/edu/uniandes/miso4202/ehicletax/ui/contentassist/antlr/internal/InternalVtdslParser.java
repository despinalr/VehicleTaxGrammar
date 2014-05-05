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




    // $ANTLR start "entryRuleModelo"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:60:1: entryRuleModelo : ruleModelo EOF ;
    public final void entryRuleModelo() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:61:1: ( ruleModelo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:62:1: ruleModelo EOF
            {
             before(grammarAccess.getModeloRule()); 
            pushFollow(FOLLOW_ruleModelo_in_entryRuleModelo61);
            ruleModelo();

            state._fsp--;

             after(grammarAccess.getModeloRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelo68); 

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
    // $ANTLR end "entryRuleModelo"


    // $ANTLR start "ruleModelo"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:69:1: ruleModelo : ( ( rule__Modelo__Group__0 ) ) ;
    public final void ruleModelo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:73:2: ( ( ( rule__Modelo__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:74:1: ( ( rule__Modelo__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:74:1: ( ( rule__Modelo__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:75:1: ( rule__Modelo__Group__0 )
            {
             before(grammarAccess.getModeloAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:76:1: ( rule__Modelo__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:76:2: rule__Modelo__Group__0
            {
            pushFollow(FOLLOW_rule__Modelo__Group__0_in_ruleModelo94);
            rule__Modelo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModeloAccess().getGroup()); 

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
    // $ANTLR end "ruleModelo"


    // $ANTLR start "entryRuleObjeto"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:88:1: entryRuleObjeto : ruleObjeto EOF ;
    public final void entryRuleObjeto() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:89:1: ( ruleObjeto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:90:1: ruleObjeto EOF
            {
             before(grammarAccess.getObjetoRule()); 
            pushFollow(FOLLOW_ruleObjeto_in_entryRuleObjeto121);
            ruleObjeto();

            state._fsp--;

             after(grammarAccess.getObjetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjeto128); 

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
    // $ANTLR end "entryRuleObjeto"


    // $ANTLR start "ruleObjeto"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:97:1: ruleObjeto : ( ( rule__Objeto__Group__0 ) ) ;
    public final void ruleObjeto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:101:2: ( ( ( rule__Objeto__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:102:1: ( ( rule__Objeto__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:102:1: ( ( rule__Objeto__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:103:1: ( rule__Objeto__Group__0 )
            {
             before(grammarAccess.getObjetoAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:104:1: ( rule__Objeto__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:104:2: rule__Objeto__Group__0
            {
            pushFollow(FOLLOW_rule__Objeto__Group__0_in_ruleObjeto154);
            rule__Objeto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetoAccess().getGroup()); 

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
    // $ANTLR end "ruleObjeto"


    // $ANTLR start "entryRuleAtributoNormal"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:116:1: entryRuleAtributoNormal : ruleAtributoNormal EOF ;
    public final void entryRuleAtributoNormal() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:117:1: ( ruleAtributoNormal EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:118:1: ruleAtributoNormal EOF
            {
             before(grammarAccess.getAtributoNormalRule()); 
            pushFollow(FOLLOW_ruleAtributoNormal_in_entryRuleAtributoNormal181);
            ruleAtributoNormal();

            state._fsp--;

             after(grammarAccess.getAtributoNormalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoNormal188); 

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
    // $ANTLR end "entryRuleAtributoNormal"


    // $ANTLR start "ruleAtributoNormal"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:125:1: ruleAtributoNormal : ( ( rule__AtributoNormal__Group__0 ) ) ;
    public final void ruleAtributoNormal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:129:2: ( ( ( rule__AtributoNormal__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:130:1: ( ( rule__AtributoNormal__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:130:1: ( ( rule__AtributoNormal__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:131:1: ( rule__AtributoNormal__Group__0 )
            {
             before(grammarAccess.getAtributoNormalAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:132:1: ( rule__AtributoNormal__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:132:2: rule__AtributoNormal__Group__0
            {
            pushFollow(FOLLOW_rule__AtributoNormal__Group__0_in_ruleAtributoNormal214);
            rule__AtributoNormal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoNormalAccess().getGroup()); 

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
    // $ANTLR end "ruleAtributoNormal"


    // $ANTLR start "entryRuleAtributoObjeto"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:144:1: entryRuleAtributoObjeto : ruleAtributoObjeto EOF ;
    public final void entryRuleAtributoObjeto() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:145:1: ( ruleAtributoObjeto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:146:1: ruleAtributoObjeto EOF
            {
             before(grammarAccess.getAtributoObjetoRule()); 
            pushFollow(FOLLOW_ruleAtributoObjeto_in_entryRuleAtributoObjeto241);
            ruleAtributoObjeto();

            state._fsp--;

             after(grammarAccess.getAtributoObjetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoObjeto248); 

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
    // $ANTLR end "entryRuleAtributoObjeto"


    // $ANTLR start "ruleAtributoObjeto"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:153:1: ruleAtributoObjeto : ( ruleObjeto ) ;
    public final void ruleAtributoObjeto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:157:2: ( ( ruleObjeto ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:158:1: ( ruleObjeto )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:158:1: ( ruleObjeto )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:159:1: ruleObjeto
            {
             before(grammarAccess.getAtributoObjetoAccess().getObjetoParserRuleCall()); 
            pushFollow(FOLLOW_ruleObjeto_in_ruleAtributoObjeto274);
            ruleObjeto();

            state._fsp--;

             after(grammarAccess.getAtributoObjetoAccess().getObjetoParserRuleCall()); 

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
    // $ANTLR end "ruleAtributoObjeto"


    // $ANTLR start "entryRuleAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:172:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:173:1: ( ruleAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:174:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_ruleAtributo_in_entryRuleAtributo300);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributo307); 

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
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:181:1: ruleAtributo : ( ( rule__Atributo__Alternatives ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:185:2: ( ( ( rule__Atributo__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:186:1: ( ( rule__Atributo__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:186:1: ( ( rule__Atributo__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:187:1: ( rule__Atributo__Alternatives )
            {
             before(grammarAccess.getAtributoAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:188:1: ( rule__Atributo__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:188:2: rule__Atributo__Alternatives
            {
            pushFollow(FOLLOW_rule__Atributo__Alternatives_in_ruleAtributo333);
            rule__Atributo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleValorAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:200:1: entryRuleValorAtributo : ruleValorAtributo EOF ;
    public final void entryRuleValorAtributo() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:201:1: ( ruleValorAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:202:1: ruleValorAtributo EOF
            {
             before(grammarAccess.getValorAtributoRule()); 
            pushFollow(FOLLOW_ruleValorAtributo_in_entryRuleValorAtributo360);
            ruleValorAtributo();

            state._fsp--;

             after(grammarAccess.getValorAtributoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorAtributo367); 

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
    // $ANTLR end "entryRuleValorAtributo"


    // $ANTLR start "ruleValorAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:209:1: ruleValorAtributo : ( ( rule__ValorAtributo__Group__0 ) ) ;
    public final void ruleValorAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:213:2: ( ( ( rule__ValorAtributo__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:214:1: ( ( rule__ValorAtributo__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:214:1: ( ( rule__ValorAtributo__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:215:1: ( rule__ValorAtributo__Group__0 )
            {
             before(grammarAccess.getValorAtributoAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:216:1: ( rule__ValorAtributo__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:216:2: rule__ValorAtributo__Group__0
            {
            pushFollow(FOLLOW_rule__ValorAtributo__Group__0_in_ruleValorAtributo393);
            rule__ValorAtributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValorAtributoAccess().getGroup()); 

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
    // $ANTLR end "ruleValorAtributo"


    // $ANTLR start "entryRuleValorAtributoValor"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:230:1: entryRuleValorAtributoValor : ruleValorAtributoValor EOF ;
    public final void entryRuleValorAtributoValor() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:231:1: ( ruleValorAtributoValor EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:232:1: ruleValorAtributoValor EOF
            {
             before(grammarAccess.getValorAtributoValorRule()); 
            pushFollow(FOLLOW_ruleValorAtributoValor_in_entryRuleValorAtributoValor422);
            ruleValorAtributoValor();

            state._fsp--;

             after(grammarAccess.getValorAtributoValorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorAtributoValor429); 

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
    // $ANTLR end "entryRuleValorAtributoValor"


    // $ANTLR start "ruleValorAtributoValor"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:239:1: ruleValorAtributoValor : ( ( rule__ValorAtributoValor__Group__0 ) ) ;
    public final void ruleValorAtributoValor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:243:2: ( ( ( rule__ValorAtributoValor__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:244:1: ( ( rule__ValorAtributoValor__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:244:1: ( ( rule__ValorAtributoValor__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:245:1: ( rule__ValorAtributoValor__Group__0 )
            {
             before(grammarAccess.getValorAtributoValorAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:246:1: ( rule__ValorAtributoValor__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:246:2: rule__ValorAtributoValor__Group__0
            {
            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__0_in_ruleValorAtributoValor455);
            rule__ValorAtributoValor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValorAtributoValorAccess().getGroup()); 

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
    // $ANTLR end "ruleValorAtributoValor"


    // $ANTLR start "entryRuleListaInteger"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:258:1: entryRuleListaInteger : ruleListaInteger EOF ;
    public final void entryRuleListaInteger() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:259:1: ( ruleListaInteger EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:260:1: ruleListaInteger EOF
            {
             before(grammarAccess.getListaIntegerRule()); 
            pushFollow(FOLLOW_ruleListaInteger_in_entryRuleListaInteger482);
            ruleListaInteger();

            state._fsp--;

             after(grammarAccess.getListaIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaInteger489); 

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
    // $ANTLR end "entryRuleListaInteger"


    // $ANTLR start "ruleListaInteger"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:267:1: ruleListaInteger : ( ( rule__ListaInteger__Group__0 ) ) ;
    public final void ruleListaInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:271:2: ( ( ( rule__ListaInteger__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:272:1: ( ( rule__ListaInteger__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:272:1: ( ( rule__ListaInteger__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:273:1: ( rule__ListaInteger__Group__0 )
            {
             before(grammarAccess.getListaIntegerAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:274:1: ( rule__ListaInteger__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:274:2: rule__ListaInteger__Group__0
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__0_in_ruleListaInteger515);
            rule__ListaInteger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListaIntegerAccess().getGroup()); 

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
    // $ANTLR end "ruleListaInteger"


    // $ANTLR start "entryRuleListaString"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:286:1: entryRuleListaString : ruleListaString EOF ;
    public final void entryRuleListaString() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:287:1: ( ruleListaString EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:288:1: ruleListaString EOF
            {
             before(grammarAccess.getListaStringRule()); 
            pushFollow(FOLLOW_ruleListaString_in_entryRuleListaString542);
            ruleListaString();

            state._fsp--;

             after(grammarAccess.getListaStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaString549); 

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
            pushFollow(FOLLOW_rule__ListaString__Group__0_in_ruleListaString575);
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


    // $ANTLR start "entryRuleLista"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:314:1: entryRuleLista : ruleLista EOF ;
    public final void entryRuleLista() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:315:1: ( ruleLista EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:316:1: ruleLista EOF
            {
             before(grammarAccess.getListaRule()); 
            pushFollow(FOLLOW_ruleLista_in_entryRuleLista602);
            ruleLista();

            state._fsp--;

             after(grammarAccess.getListaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLista609); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:323:1: ruleLista : ( ( rule__Lista__Alternatives ) ) ;
    public final void ruleLista() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:327:2: ( ( ( rule__Lista__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:328:1: ( ( rule__Lista__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:328:1: ( ( rule__Lista__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:329:1: ( rule__Lista__Alternatives )
            {
             before(grammarAccess.getListaAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:330:1: ( rule__Lista__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:330:2: rule__Lista__Alternatives
            {
            pushFollow(FOLLOW_rule__Lista__Alternatives_in_ruleLista635);
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


    // $ANTLR start "rule__AtributoNormal__NombreAlternatives_1_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:342:1: rule__AtributoNormal__NombreAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__AtributoNormal__NombreAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:346:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:347:1: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:347:1: ( RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:348:1: RULE_ID
                    {
                     before(grammarAccess.getAtributoNormalAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtributoNormal__NombreAlternatives_1_0671); 
                     after(grammarAccess.getAtributoNormalAccess().getNombreIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:353:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:353:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:354:1: RULE_STRING
                    {
                     before(grammarAccess.getAtributoNormalAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AtributoNormal__NombreAlternatives_1_0688); 
                     after(grammarAccess.getAtributoNormalAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__AtributoNormal__NombreAlternatives_1_0"


    // $ANTLR start "rule__AtributoNormal__ValorAlternatives_3_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:364:1: rule__AtributoNormal__ValorAlternatives_3_0 : ( ( ruleValorAtributo ) | ( ruleValorAtributoValor ) | ( ruleLista ) );
    public final void rule__AtributoNormal__ValorAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:368:1: ( ( ruleValorAtributo ) | ( ruleValorAtributoValor ) | ( ruleLista ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=RULE_ID && LA2_1<=RULE_DECIMAL)||LA2_1==15) ) {
                    alt2=1;
                }
                else if ( (LA2_1==16) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt2=1;
                }
                break;
            case 17:
            case 19:
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:369:1: ( ruleValorAtributo )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:369:1: ( ruleValorAtributo )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:370:1: ruleValorAtributo
                    {
                     before(grammarAccess.getAtributoNormalAccess().getValorValorAtributoParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleValorAtributo_in_rule__AtributoNormal__ValorAlternatives_3_0720);
                    ruleValorAtributo();

                    state._fsp--;

                     after(grammarAccess.getAtributoNormalAccess().getValorValorAtributoParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:375:6: ( ruleValorAtributoValor )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:375:6: ( ruleValorAtributoValor )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:376:1: ruleValorAtributoValor
                    {
                     before(grammarAccess.getAtributoNormalAccess().getValorValorAtributoValorParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleValorAtributoValor_in_rule__AtributoNormal__ValorAlternatives_3_0737);
                    ruleValorAtributoValor();

                    state._fsp--;

                     after(grammarAccess.getAtributoNormalAccess().getValorValorAtributoValorParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:381:6: ( ruleLista )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:381:6: ( ruleLista )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:382:1: ruleLista
                    {
                     before(grammarAccess.getAtributoNormalAccess().getValorListaParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_ruleLista_in_rule__AtributoNormal__ValorAlternatives_3_0754);
                    ruleLista();

                    state._fsp--;

                     after(grammarAccess.getAtributoNormalAccess().getValorListaParserRuleCall_3_0_2()); 

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
    // $ANTLR end "rule__AtributoNormal__ValorAlternatives_3_0"


    // $ANTLR start "rule__Atributo__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:392:1: rule__Atributo__Alternatives : ( ( ruleAtributoNormal ) | ( ruleAtributoObjeto ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:396:1: ( ( ruleAtributoNormal ) | ( ruleAtributoObjeto ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_STRING||LA3_1==12) ) {
                    alt3=2;
                }
                else if ( (LA3_1==14) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:397:1: ( ruleAtributoNormal )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:397:1: ( ruleAtributoNormal )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:398:1: ruleAtributoNormal
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoNormalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtributoNormal_in_rule__Atributo__Alternatives786);
                    ruleAtributoNormal();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoNormalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:403:6: ( ruleAtributoObjeto )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:403:6: ( ruleAtributoObjeto )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:404:1: ruleAtributoObjeto
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoObjetoParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtributoObjeto_in_rule__Atributo__Alternatives803);
                    ruleAtributoObjeto();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoObjetoParserRuleCall_1()); 

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
    // $ANTLR end "rule__Atributo__Alternatives"


    // $ANTLR start "rule__ValorAtributo__Alternatives_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:414:1: rule__ValorAtributo__Alternatives_1 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__ValorAtributo__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:418:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_DECIMAL ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            case RULE_DECIMAL:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:419:1: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:419:1: ( RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:420:1: RULE_ID
                    {
                     before(grammarAccess.getValorAtributoAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValorAtributo__Alternatives_1835); 
                     after(grammarAccess.getValorAtributoAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:425:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:425:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:426:1: RULE_STRING
                    {
                     before(grammarAccess.getValorAtributoAccess().getSTRINGTerminalRuleCall_1_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ValorAtributo__Alternatives_1852); 
                     after(grammarAccess.getValorAtributoAccess().getSTRINGTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:431:6: ( RULE_INT )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:431:6: ( RULE_INT )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:432:1: RULE_INT
                    {
                     before(grammarAccess.getValorAtributoAccess().getINTTerminalRuleCall_1_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ValorAtributo__Alternatives_1869); 
                     after(grammarAccess.getValorAtributoAccess().getINTTerminalRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:437:6: ( RULE_DECIMAL )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:437:6: ( RULE_DECIMAL )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:438:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getValorAtributoAccess().getDECIMALTerminalRuleCall_1_3()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__ValorAtributo__Alternatives_1886); 
                     after(grammarAccess.getValorAtributoAccess().getDECIMALTerminalRuleCall_1_3()); 

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
    // $ANTLR end "rule__ValorAtributo__Alternatives_1"


    // $ANTLR start "rule__Lista__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:449:1: rule__Lista__Alternatives : ( ( ruleListaInteger ) | ( ruleListaString ) );
    public final void rule__Lista__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:453:1: ( ( ruleListaInteger ) | ( ruleListaString ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:454:1: ( ruleListaInteger )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:454:1: ( ruleListaInteger )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:455:1: ruleListaInteger
                    {
                     before(grammarAccess.getListaAccess().getListaIntegerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleListaInteger_in_rule__Lista__Alternatives919);
                    ruleListaInteger();

                    state._fsp--;

                     after(grammarAccess.getListaAccess().getListaIntegerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:460:6: ( ruleListaString )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:460:6: ( ruleListaString )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:461:1: ruleListaString
                    {
                     before(grammarAccess.getListaAccess().getListaStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleListaString_in_rule__Lista__Alternatives936);
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


    // $ANTLR start "rule__Modelo__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:473:1: rule__Modelo__Group__0 : rule__Modelo__Group__0__Impl rule__Modelo__Group__1 ;
    public final void rule__Modelo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:477:1: ( rule__Modelo__Group__0__Impl rule__Modelo__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:478:2: rule__Modelo__Group__0__Impl rule__Modelo__Group__1
            {
            pushFollow(FOLLOW_rule__Modelo__Group__0__Impl_in_rule__Modelo__Group__0966);
            rule__Modelo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Modelo__Group__1_in_rule__Modelo__Group__0969);
            rule__Modelo__Group__1();

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
    // $ANTLR end "rule__Modelo__Group__0"


    // $ANTLR start "rule__Modelo__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:485:1: rule__Modelo__Group__0__Impl : ( () ) ;
    public final void rule__Modelo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:489:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:490:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:490:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:491:1: ()
            {
             before(grammarAccess.getModeloAccess().getModeloAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:492:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:494:1: 
            {
            }

             after(grammarAccess.getModeloAccess().getModeloAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelo__Group__0__Impl"


    // $ANTLR start "rule__Modelo__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:504:1: rule__Modelo__Group__1 : rule__Modelo__Group__1__Impl rule__Modelo__Group__2 ;
    public final void rule__Modelo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:508:1: ( rule__Modelo__Group__1__Impl rule__Modelo__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:509:2: rule__Modelo__Group__1__Impl rule__Modelo__Group__2
            {
            pushFollow(FOLLOW_rule__Modelo__Group__1__Impl_in_rule__Modelo__Group__11027);
            rule__Modelo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Modelo__Group__2_in_rule__Modelo__Group__11030);
            rule__Modelo__Group__2();

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
    // $ANTLR end "rule__Modelo__Group__1"


    // $ANTLR start "rule__Modelo__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:516:1: rule__Modelo__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Modelo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:520:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:521:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:521:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:522:1: RULE_ID
            {
             before(grammarAccess.getModeloAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Modelo__Group__1__Impl1057); 
             after(grammarAccess.getModeloAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Modelo__Group__1__Impl"


    // $ANTLR start "rule__Modelo__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:533:1: rule__Modelo__Group__2 : rule__Modelo__Group__2__Impl rule__Modelo__Group__3 ;
    public final void rule__Modelo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:537:1: ( rule__Modelo__Group__2__Impl rule__Modelo__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:538:2: rule__Modelo__Group__2__Impl rule__Modelo__Group__3
            {
            pushFollow(FOLLOW_rule__Modelo__Group__2__Impl_in_rule__Modelo__Group__21086);
            rule__Modelo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Modelo__Group__3_in_rule__Modelo__Group__21089);
            rule__Modelo__Group__3();

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
    // $ANTLR end "rule__Modelo__Group__2"


    // $ANTLR start "rule__Modelo__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:545:1: rule__Modelo__Group__2__Impl : ( '{' ) ;
    public final void rule__Modelo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:549:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:550:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:550:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:551:1: '{'
            {
             before(grammarAccess.getModeloAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Modelo__Group__2__Impl1117); 
             after(grammarAccess.getModeloAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Modelo__Group__2__Impl"


    // $ANTLR start "rule__Modelo__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:564:1: rule__Modelo__Group__3 : rule__Modelo__Group__3__Impl rule__Modelo__Group__4 ;
    public final void rule__Modelo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:568:1: ( rule__Modelo__Group__3__Impl rule__Modelo__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:569:2: rule__Modelo__Group__3__Impl rule__Modelo__Group__4
            {
            pushFollow(FOLLOW_rule__Modelo__Group__3__Impl_in_rule__Modelo__Group__31148);
            rule__Modelo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Modelo__Group__4_in_rule__Modelo__Group__31151);
            rule__Modelo__Group__4();

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
    // $ANTLR end "rule__Modelo__Group__3"


    // $ANTLR start "rule__Modelo__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:576:1: rule__Modelo__Group__3__Impl : ( ( rule__Modelo__ObjetosAssignment_3 )* ) ;
    public final void rule__Modelo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:580:1: ( ( ( rule__Modelo__ObjetosAssignment_3 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:581:1: ( ( rule__Modelo__ObjetosAssignment_3 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:581:1: ( ( rule__Modelo__ObjetosAssignment_3 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:582:1: ( rule__Modelo__ObjetosAssignment_3 )*
            {
             before(grammarAccess.getModeloAccess().getObjetosAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:583:1: ( rule__Modelo__ObjetosAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:583:2: rule__Modelo__ObjetosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Modelo__ObjetosAssignment_3_in_rule__Modelo__Group__3__Impl1178);
            	    rule__Modelo__ObjetosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModeloAccess().getObjetosAssignment_3()); 

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
    // $ANTLR end "rule__Modelo__Group__3__Impl"


    // $ANTLR start "rule__Modelo__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:593:1: rule__Modelo__Group__4 : rule__Modelo__Group__4__Impl ;
    public final void rule__Modelo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:597:1: ( rule__Modelo__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:598:2: rule__Modelo__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Modelo__Group__4__Impl_in_rule__Modelo__Group__41209);
            rule__Modelo__Group__4__Impl();

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
    // $ANTLR end "rule__Modelo__Group__4"


    // $ANTLR start "rule__Modelo__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:604:1: rule__Modelo__Group__4__Impl : ( '}' ) ;
    public final void rule__Modelo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:608:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:609:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:609:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:610:1: '}'
            {
             before(grammarAccess.getModeloAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Modelo__Group__4__Impl1237); 
             after(grammarAccess.getModeloAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Modelo__Group__4__Impl"


    // $ANTLR start "rule__Objeto__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:633:1: rule__Objeto__Group__0 : rule__Objeto__Group__0__Impl rule__Objeto__Group__1 ;
    public final void rule__Objeto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:637:1: ( rule__Objeto__Group__0__Impl rule__Objeto__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:638:2: rule__Objeto__Group__0__Impl rule__Objeto__Group__1
            {
            pushFollow(FOLLOW_rule__Objeto__Group__0__Impl_in_rule__Objeto__Group__01278);
            rule__Objeto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__1_in_rule__Objeto__Group__01281);
            rule__Objeto__Group__1();

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
    // $ANTLR end "rule__Objeto__Group__0"


    // $ANTLR start "rule__Objeto__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:645:1: rule__Objeto__Group__0__Impl : ( ( rule__Objeto__NameAssignment_0 ) ) ;
    public final void rule__Objeto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:649:1: ( ( ( rule__Objeto__NameAssignment_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:650:1: ( ( rule__Objeto__NameAssignment_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:650:1: ( ( rule__Objeto__NameAssignment_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:651:1: ( rule__Objeto__NameAssignment_0 )
            {
             before(grammarAccess.getObjetoAccess().getNameAssignment_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:652:1: ( rule__Objeto__NameAssignment_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:652:2: rule__Objeto__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Objeto__NameAssignment_0_in_rule__Objeto__Group__0__Impl1308);
            rule__Objeto__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjetoAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Objeto__Group__0__Impl"


    // $ANTLR start "rule__Objeto__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:662:1: rule__Objeto__Group__1 : rule__Objeto__Group__1__Impl rule__Objeto__Group__2 ;
    public final void rule__Objeto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:666:1: ( rule__Objeto__Group__1__Impl rule__Objeto__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:667:2: rule__Objeto__Group__1__Impl rule__Objeto__Group__2
            {
            pushFollow(FOLLOW_rule__Objeto__Group__1__Impl_in_rule__Objeto__Group__11338);
            rule__Objeto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__2_in_rule__Objeto__Group__11341);
            rule__Objeto__Group__2();

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
    // $ANTLR end "rule__Objeto__Group__1"


    // $ANTLR start "rule__Objeto__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:674:1: rule__Objeto__Group__1__Impl : ( ( rule__Objeto__DescripcionAssignment_1 )? ) ;
    public final void rule__Objeto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:678:1: ( ( ( rule__Objeto__DescripcionAssignment_1 )? ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:679:1: ( ( rule__Objeto__DescripcionAssignment_1 )? )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:679:1: ( ( rule__Objeto__DescripcionAssignment_1 )? )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:680:1: ( rule__Objeto__DescripcionAssignment_1 )?
            {
             before(grammarAccess.getObjetoAccess().getDescripcionAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:681:1: ( rule__Objeto__DescripcionAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:681:2: rule__Objeto__DescripcionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Objeto__DescripcionAssignment_1_in_rule__Objeto__Group__1__Impl1368);
                    rule__Objeto__DescripcionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetoAccess().getDescripcionAssignment_1()); 

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
    // $ANTLR end "rule__Objeto__Group__1__Impl"


    // $ANTLR start "rule__Objeto__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:691:1: rule__Objeto__Group__2 : rule__Objeto__Group__2__Impl rule__Objeto__Group__3 ;
    public final void rule__Objeto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:695:1: ( rule__Objeto__Group__2__Impl rule__Objeto__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:696:2: rule__Objeto__Group__2__Impl rule__Objeto__Group__3
            {
            pushFollow(FOLLOW_rule__Objeto__Group__2__Impl_in_rule__Objeto__Group__21399);
            rule__Objeto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__3_in_rule__Objeto__Group__21402);
            rule__Objeto__Group__3();

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
    // $ANTLR end "rule__Objeto__Group__2"


    // $ANTLR start "rule__Objeto__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:703:1: rule__Objeto__Group__2__Impl : ( '{' ) ;
    public final void rule__Objeto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:707:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:708:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:708:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:709:1: '{'
            {
             before(grammarAccess.getObjetoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Objeto__Group__2__Impl1430); 
             after(grammarAccess.getObjetoAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Objeto__Group__2__Impl"


    // $ANTLR start "rule__Objeto__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:722:1: rule__Objeto__Group__3 : rule__Objeto__Group__3__Impl rule__Objeto__Group__4 ;
    public final void rule__Objeto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:726:1: ( rule__Objeto__Group__3__Impl rule__Objeto__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:727:2: rule__Objeto__Group__3__Impl rule__Objeto__Group__4
            {
            pushFollow(FOLLOW_rule__Objeto__Group__3__Impl_in_rule__Objeto__Group__31461);
            rule__Objeto__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__4_in_rule__Objeto__Group__31464);
            rule__Objeto__Group__4();

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
    // $ANTLR end "rule__Objeto__Group__3"


    // $ANTLR start "rule__Objeto__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:734:1: rule__Objeto__Group__3__Impl : ( ( rule__Objeto__AtributosAssignment_3 )* ) ;
    public final void rule__Objeto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:738:1: ( ( ( rule__Objeto__AtributosAssignment_3 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:739:1: ( ( rule__Objeto__AtributosAssignment_3 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:739:1: ( ( rule__Objeto__AtributosAssignment_3 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:740:1: ( rule__Objeto__AtributosAssignment_3 )*
            {
             before(grammarAccess.getObjetoAccess().getAtributosAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:741:1: ( rule__Objeto__AtributosAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:741:2: rule__Objeto__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Objeto__AtributosAssignment_3_in_rule__Objeto__Group__3__Impl1491);
            	    rule__Objeto__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getObjetoAccess().getAtributosAssignment_3()); 

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
    // $ANTLR end "rule__Objeto__Group__3__Impl"


    // $ANTLR start "rule__Objeto__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:751:1: rule__Objeto__Group__4 : rule__Objeto__Group__4__Impl ;
    public final void rule__Objeto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:755:1: ( rule__Objeto__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:756:2: rule__Objeto__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Objeto__Group__4__Impl_in_rule__Objeto__Group__41522);
            rule__Objeto__Group__4__Impl();

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
    // $ANTLR end "rule__Objeto__Group__4"


    // $ANTLR start "rule__Objeto__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:762:1: rule__Objeto__Group__4__Impl : ( '}' ) ;
    public final void rule__Objeto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:766:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:767:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:767:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:768:1: '}'
            {
             before(grammarAccess.getObjetoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Objeto__Group__4__Impl1550); 
             after(grammarAccess.getObjetoAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Objeto__Group__4__Impl"


    // $ANTLR start "rule__AtributoNormal__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:791:1: rule__AtributoNormal__Group__0 : rule__AtributoNormal__Group__0__Impl rule__AtributoNormal__Group__1 ;
    public final void rule__AtributoNormal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:795:1: ( rule__AtributoNormal__Group__0__Impl rule__AtributoNormal__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:796:2: rule__AtributoNormal__Group__0__Impl rule__AtributoNormal__Group__1
            {
            pushFollow(FOLLOW_rule__AtributoNormal__Group__0__Impl_in_rule__AtributoNormal__Group__01591);
            rule__AtributoNormal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoNormal__Group__1_in_rule__AtributoNormal__Group__01594);
            rule__AtributoNormal__Group__1();

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
    // $ANTLR end "rule__AtributoNormal__Group__0"


    // $ANTLR start "rule__AtributoNormal__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:803:1: rule__AtributoNormal__Group__0__Impl : ( () ) ;
    public final void rule__AtributoNormal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:807:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:808:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:808:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:809:1: ()
            {
             before(grammarAccess.getAtributoNormalAccess().getAtributoNormalAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:810:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:812:1: 
            {
            }

             after(grammarAccess.getAtributoNormalAccess().getAtributoNormalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoNormal__Group__0__Impl"


    // $ANTLR start "rule__AtributoNormal__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:822:1: rule__AtributoNormal__Group__1 : rule__AtributoNormal__Group__1__Impl rule__AtributoNormal__Group__2 ;
    public final void rule__AtributoNormal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:826:1: ( rule__AtributoNormal__Group__1__Impl rule__AtributoNormal__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:827:2: rule__AtributoNormal__Group__1__Impl rule__AtributoNormal__Group__2
            {
            pushFollow(FOLLOW_rule__AtributoNormal__Group__1__Impl_in_rule__AtributoNormal__Group__11652);
            rule__AtributoNormal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoNormal__Group__2_in_rule__AtributoNormal__Group__11655);
            rule__AtributoNormal__Group__2();

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
    // $ANTLR end "rule__AtributoNormal__Group__1"


    // $ANTLR start "rule__AtributoNormal__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:834:1: rule__AtributoNormal__Group__1__Impl : ( ( rule__AtributoNormal__NombreAssignment_1 ) ) ;
    public final void rule__AtributoNormal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:838:1: ( ( ( rule__AtributoNormal__NombreAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:839:1: ( ( rule__AtributoNormal__NombreAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:839:1: ( ( rule__AtributoNormal__NombreAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:840:1: ( rule__AtributoNormal__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoNormalAccess().getNombreAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:841:1: ( rule__AtributoNormal__NombreAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:841:2: rule__AtributoNormal__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__AtributoNormal__NombreAssignment_1_in_rule__AtributoNormal__Group__1__Impl1682);
            rule__AtributoNormal__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoNormalAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__AtributoNormal__Group__1__Impl"


    // $ANTLR start "rule__AtributoNormal__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:851:1: rule__AtributoNormal__Group__2 : rule__AtributoNormal__Group__2__Impl rule__AtributoNormal__Group__3 ;
    public final void rule__AtributoNormal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:855:1: ( rule__AtributoNormal__Group__2__Impl rule__AtributoNormal__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:856:2: rule__AtributoNormal__Group__2__Impl rule__AtributoNormal__Group__3
            {
            pushFollow(FOLLOW_rule__AtributoNormal__Group__2__Impl_in_rule__AtributoNormal__Group__21712);
            rule__AtributoNormal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoNormal__Group__3_in_rule__AtributoNormal__Group__21715);
            rule__AtributoNormal__Group__3();

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
    // $ANTLR end "rule__AtributoNormal__Group__2"


    // $ANTLR start "rule__AtributoNormal__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:863:1: rule__AtributoNormal__Group__2__Impl : ( ':' ) ;
    public final void rule__AtributoNormal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:867:1: ( ( ':' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:868:1: ( ':' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:868:1: ( ':' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:869:1: ':'
            {
             before(grammarAccess.getAtributoNormalAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__AtributoNormal__Group__2__Impl1743); 
             after(grammarAccess.getAtributoNormalAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__AtributoNormal__Group__2__Impl"


    // $ANTLR start "rule__AtributoNormal__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:882:1: rule__AtributoNormal__Group__3 : rule__AtributoNormal__Group__3__Impl rule__AtributoNormal__Group__4 ;
    public final void rule__AtributoNormal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:886:1: ( rule__AtributoNormal__Group__3__Impl rule__AtributoNormal__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:887:2: rule__AtributoNormal__Group__3__Impl rule__AtributoNormal__Group__4
            {
            pushFollow(FOLLOW_rule__AtributoNormal__Group__3__Impl_in_rule__AtributoNormal__Group__31774);
            rule__AtributoNormal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoNormal__Group__4_in_rule__AtributoNormal__Group__31777);
            rule__AtributoNormal__Group__4();

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
    // $ANTLR end "rule__AtributoNormal__Group__3"


    // $ANTLR start "rule__AtributoNormal__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:894:1: rule__AtributoNormal__Group__3__Impl : ( ( rule__AtributoNormal__ValorAssignment_3 ) ) ;
    public final void rule__AtributoNormal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:898:1: ( ( ( rule__AtributoNormal__ValorAssignment_3 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:899:1: ( ( rule__AtributoNormal__ValorAssignment_3 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:899:1: ( ( rule__AtributoNormal__ValorAssignment_3 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:900:1: ( rule__AtributoNormal__ValorAssignment_3 )
            {
             before(grammarAccess.getAtributoNormalAccess().getValorAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:901:1: ( rule__AtributoNormal__ValorAssignment_3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:901:2: rule__AtributoNormal__ValorAssignment_3
            {
            pushFollow(FOLLOW_rule__AtributoNormal__ValorAssignment_3_in_rule__AtributoNormal__Group__3__Impl1804);
            rule__AtributoNormal__ValorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtributoNormalAccess().getValorAssignment_3()); 

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
    // $ANTLR end "rule__AtributoNormal__Group__3__Impl"


    // $ANTLR start "rule__AtributoNormal__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:911:1: rule__AtributoNormal__Group__4 : rule__AtributoNormal__Group__4__Impl ;
    public final void rule__AtributoNormal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:915:1: ( rule__AtributoNormal__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:916:2: rule__AtributoNormal__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AtributoNormal__Group__4__Impl_in_rule__AtributoNormal__Group__41834);
            rule__AtributoNormal__Group__4__Impl();

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
    // $ANTLR end "rule__AtributoNormal__Group__4"


    // $ANTLR start "rule__AtributoNormal__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:922:1: rule__AtributoNormal__Group__4__Impl : ( ';' ) ;
    public final void rule__AtributoNormal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:926:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:927:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:927:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:928:1: ';'
            {
             before(grammarAccess.getAtributoNormalAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__AtributoNormal__Group__4__Impl1862); 
             after(grammarAccess.getAtributoNormalAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__AtributoNormal__Group__4__Impl"


    // $ANTLR start "rule__ValorAtributo__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:951:1: rule__ValorAtributo__Group__0 : rule__ValorAtributo__Group__0__Impl rule__ValorAtributo__Group__1 ;
    public final void rule__ValorAtributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:955:1: ( rule__ValorAtributo__Group__0__Impl rule__ValorAtributo__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:956:2: rule__ValorAtributo__Group__0__Impl rule__ValorAtributo__Group__1
            {
            pushFollow(FOLLOW_rule__ValorAtributo__Group__0__Impl_in_rule__ValorAtributo__Group__01903);
            rule__ValorAtributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValorAtributo__Group__1_in_rule__ValorAtributo__Group__01906);
            rule__ValorAtributo__Group__1();

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
    // $ANTLR end "rule__ValorAtributo__Group__0"


    // $ANTLR start "rule__ValorAtributo__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:963:1: rule__ValorAtributo__Group__0__Impl : ( () ) ;
    public final void rule__ValorAtributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:967:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:968:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:968:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:969:1: ()
            {
             before(grammarAccess.getValorAtributoAccess().getValorAtributoAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:970:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:972:1: 
            {
            }

             after(grammarAccess.getValorAtributoAccess().getValorAtributoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValorAtributo__Group__0__Impl"


    // $ANTLR start "rule__ValorAtributo__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:982:1: rule__ValorAtributo__Group__1 : rule__ValorAtributo__Group__1__Impl ;
    public final void rule__ValorAtributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:986:1: ( rule__ValorAtributo__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:987:2: rule__ValorAtributo__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ValorAtributo__Group__1__Impl_in_rule__ValorAtributo__Group__11964);
            rule__ValorAtributo__Group__1__Impl();

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
    // $ANTLR end "rule__ValorAtributo__Group__1"


    // $ANTLR start "rule__ValorAtributo__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:993:1: rule__ValorAtributo__Group__1__Impl : ( ( ( rule__ValorAtributo__Alternatives_1 ) ) ( ( rule__ValorAtributo__Alternatives_1 )* ) ) ;
    public final void rule__ValorAtributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:997:1: ( ( ( ( rule__ValorAtributo__Alternatives_1 ) ) ( ( rule__ValorAtributo__Alternatives_1 )* ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:998:1: ( ( ( rule__ValorAtributo__Alternatives_1 ) ) ( ( rule__ValorAtributo__Alternatives_1 )* ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:998:1: ( ( ( rule__ValorAtributo__Alternatives_1 ) ) ( ( rule__ValorAtributo__Alternatives_1 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:999:1: ( ( rule__ValorAtributo__Alternatives_1 ) ) ( ( rule__ValorAtributo__Alternatives_1 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:999:1: ( ( rule__ValorAtributo__Alternatives_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1000:1: ( rule__ValorAtributo__Alternatives_1 )
            {
             before(grammarAccess.getValorAtributoAccess().getAlternatives_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1001:1: ( rule__ValorAtributo__Alternatives_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1001:2: rule__ValorAtributo__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ValorAtributo__Alternatives_1_in_rule__ValorAtributo__Group__1__Impl1993);
            rule__ValorAtributo__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getValorAtributoAccess().getAlternatives_1()); 

            }

            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1004:1: ( ( rule__ValorAtributo__Alternatives_1 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1005:1: ( rule__ValorAtributo__Alternatives_1 )*
            {
             before(grammarAccess.getValorAtributoAccess().getAlternatives_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1006:1: ( rule__ValorAtributo__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_DECIMAL)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1006:2: rule__ValorAtributo__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__ValorAtributo__Alternatives_1_in_rule__ValorAtributo__Group__1__Impl2005);
            	    rule__ValorAtributo__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getValorAtributoAccess().getAlternatives_1()); 

            }


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
    // $ANTLR end "rule__ValorAtributo__Group__1__Impl"


    // $ANTLR start "rule__ValorAtributoValor__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1021:1: rule__ValorAtributoValor__Group__0 : rule__ValorAtributoValor__Group__0__Impl rule__ValorAtributoValor__Group__1 ;
    public final void rule__ValorAtributoValor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1025:1: ( rule__ValorAtributoValor__Group__0__Impl rule__ValorAtributoValor__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1026:2: rule__ValorAtributoValor__Group__0__Impl rule__ValorAtributoValor__Group__1
            {
            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__0__Impl_in_rule__ValorAtributoValor__Group__02042);
            rule__ValorAtributoValor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__1_in_rule__ValorAtributoValor__Group__02045);
            rule__ValorAtributoValor__Group__1();

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
    // $ANTLR end "rule__ValorAtributoValor__Group__0"


    // $ANTLR start "rule__ValorAtributoValor__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1033:1: rule__ValorAtributoValor__Group__0__Impl : ( () ) ;
    public final void rule__ValorAtributoValor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1037:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1038:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1038:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1039:1: ()
            {
             before(grammarAccess.getValorAtributoValorAccess().getValorAtributoValorAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1040:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1042:1: 
            {
            }

             after(grammarAccess.getValorAtributoValorAccess().getValorAtributoValorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValorAtributoValor__Group__0__Impl"


    // $ANTLR start "rule__ValorAtributoValor__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1052:1: rule__ValorAtributoValor__Group__1 : rule__ValorAtributoValor__Group__1__Impl rule__ValorAtributoValor__Group__2 ;
    public final void rule__ValorAtributoValor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1056:1: ( rule__ValorAtributoValor__Group__1__Impl rule__ValorAtributoValor__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1057:2: rule__ValorAtributoValor__Group__1__Impl rule__ValorAtributoValor__Group__2
            {
            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__1__Impl_in_rule__ValorAtributoValor__Group__12103);
            rule__ValorAtributoValor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__2_in_rule__ValorAtributoValor__Group__12106);
            rule__ValorAtributoValor__Group__2();

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
    // $ANTLR end "rule__ValorAtributoValor__Group__1"


    // $ANTLR start "rule__ValorAtributoValor__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1064:1: rule__ValorAtributoValor__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__ValorAtributoValor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1068:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1069:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1069:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1070:1: RULE_ID
            {
             before(grammarAccess.getValorAtributoValorAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValorAtributoValor__Group__1__Impl2133); 
             after(grammarAccess.getValorAtributoValorAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ValorAtributoValor__Group__1__Impl"


    // $ANTLR start "rule__ValorAtributoValor__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1081:1: rule__ValorAtributoValor__Group__2 : rule__ValorAtributoValor__Group__2__Impl rule__ValorAtributoValor__Group__3 ;
    public final void rule__ValorAtributoValor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1085:1: ( rule__ValorAtributoValor__Group__2__Impl rule__ValorAtributoValor__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1086:2: rule__ValorAtributoValor__Group__2__Impl rule__ValorAtributoValor__Group__3
            {
            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__2__Impl_in_rule__ValorAtributoValor__Group__22162);
            rule__ValorAtributoValor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__3_in_rule__ValorAtributoValor__Group__22165);
            rule__ValorAtributoValor__Group__3();

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
    // $ANTLR end "rule__ValorAtributoValor__Group__2"


    // $ANTLR start "rule__ValorAtributoValor__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1093:1: rule__ValorAtributoValor__Group__2__Impl : ( '=' ) ;
    public final void rule__ValorAtributoValor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1097:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1098:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1098:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1099:1: '='
            {
             before(grammarAccess.getValorAtributoValorAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__ValorAtributoValor__Group__2__Impl2193); 
             after(grammarAccess.getValorAtributoValorAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__ValorAtributoValor__Group__2__Impl"


    // $ANTLR start "rule__ValorAtributoValor__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1112:1: rule__ValorAtributoValor__Group__3 : rule__ValorAtributoValor__Group__3__Impl ;
    public final void rule__ValorAtributoValor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1116:1: ( rule__ValorAtributoValor__Group__3__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1117:2: rule__ValorAtributoValor__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__3__Impl_in_rule__ValorAtributoValor__Group__32224);
            rule__ValorAtributoValor__Group__3__Impl();

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
    // $ANTLR end "rule__ValorAtributoValor__Group__3"


    // $ANTLR start "rule__ValorAtributoValor__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1123:1: rule__ValorAtributoValor__Group__3__Impl : ( RULE_DECIMAL ) ;
    public final void rule__ValorAtributoValor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1127:1: ( ( RULE_DECIMAL ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1128:1: ( RULE_DECIMAL )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1128:1: ( RULE_DECIMAL )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1129:1: RULE_DECIMAL
            {
             before(grammarAccess.getValorAtributoValorAccess().getDECIMALTerminalRuleCall_3()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__ValorAtributoValor__Group__3__Impl2251); 
             after(grammarAccess.getValorAtributoValorAccess().getDECIMALTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__ValorAtributoValor__Group__3__Impl"


    // $ANTLR start "rule__ListaInteger__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1148:1: rule__ListaInteger__Group__0 : rule__ListaInteger__Group__0__Impl rule__ListaInteger__Group__1 ;
    public final void rule__ListaInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1152:1: ( rule__ListaInteger__Group__0__Impl rule__ListaInteger__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1153:2: rule__ListaInteger__Group__0__Impl rule__ListaInteger__Group__1
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__0__Impl_in_rule__ListaInteger__Group__02288);
            rule__ListaInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__1_in_rule__ListaInteger__Group__02291);
            rule__ListaInteger__Group__1();

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
    // $ANTLR end "rule__ListaInteger__Group__0"


    // $ANTLR start "rule__ListaInteger__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1160:1: rule__ListaInteger__Group__0__Impl : ( () ) ;
    public final void rule__ListaInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1164:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1165:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1165:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1166:1: ()
            {
             before(grammarAccess.getListaIntegerAccess().getListaIntegerAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1167:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1169:1: 
            {
            }

             after(grammarAccess.getListaIntegerAccess().getListaIntegerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaInteger__Group__0__Impl"


    // $ANTLR start "rule__ListaInteger__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1179:1: rule__ListaInteger__Group__1 : rule__ListaInteger__Group__1__Impl rule__ListaInteger__Group__2 ;
    public final void rule__ListaInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1183:1: ( rule__ListaInteger__Group__1__Impl rule__ListaInteger__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1184:2: rule__ListaInteger__Group__1__Impl rule__ListaInteger__Group__2
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__1__Impl_in_rule__ListaInteger__Group__12349);
            rule__ListaInteger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__2_in_rule__ListaInteger__Group__12352);
            rule__ListaInteger__Group__2();

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
    // $ANTLR end "rule__ListaInteger__Group__1"


    // $ANTLR start "rule__ListaInteger__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1191:1: rule__ListaInteger__Group__1__Impl : ( 'List of Integer' ) ;
    public final void rule__ListaInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1195:1: ( ( 'List of Integer' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1196:1: ( 'List of Integer' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1196:1: ( 'List of Integer' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1197:1: 'List of Integer'
            {
             before(grammarAccess.getListaIntegerAccess().getListOfIntegerKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__ListaInteger__Group__1__Impl2380); 
             after(grammarAccess.getListaIntegerAccess().getListOfIntegerKeyword_1()); 

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
    // $ANTLR end "rule__ListaInteger__Group__1__Impl"


    // $ANTLR start "rule__ListaInteger__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1210:1: rule__ListaInteger__Group__2 : rule__ListaInteger__Group__2__Impl rule__ListaInteger__Group__3 ;
    public final void rule__ListaInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1214:1: ( rule__ListaInteger__Group__2__Impl rule__ListaInteger__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1215:2: rule__ListaInteger__Group__2__Impl rule__ListaInteger__Group__3
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__2__Impl_in_rule__ListaInteger__Group__22411);
            rule__ListaInteger__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__3_in_rule__ListaInteger__Group__22414);
            rule__ListaInteger__Group__3();

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
    // $ANTLR end "rule__ListaInteger__Group__2"


    // $ANTLR start "rule__ListaInteger__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1222:1: rule__ListaInteger__Group__2__Impl : ( '=' ) ;
    public final void rule__ListaInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1226:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1227:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1227:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1228:1: '='
            {
             before(grammarAccess.getListaIntegerAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__ListaInteger__Group__2__Impl2442); 
             after(grammarAccess.getListaIntegerAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__ListaInteger__Group__2__Impl"


    // $ANTLR start "rule__ListaInteger__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1241:1: rule__ListaInteger__Group__3 : rule__ListaInteger__Group__3__Impl rule__ListaInteger__Group__4 ;
    public final void rule__ListaInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1245:1: ( rule__ListaInteger__Group__3__Impl rule__ListaInteger__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1246:2: rule__ListaInteger__Group__3__Impl rule__ListaInteger__Group__4
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__3__Impl_in_rule__ListaInteger__Group__32473);
            rule__ListaInteger__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__4_in_rule__ListaInteger__Group__32476);
            rule__ListaInteger__Group__4();

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
    // $ANTLR end "rule__ListaInteger__Group__3"


    // $ANTLR start "rule__ListaInteger__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1253:1: rule__ListaInteger__Group__3__Impl : ( '{' ) ;
    public final void rule__ListaInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1257:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1258:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1258:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1259:1: '{'
            {
             before(grammarAccess.getListaIntegerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__ListaInteger__Group__3__Impl2504); 
             after(grammarAccess.getListaIntegerAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ListaInteger__Group__3__Impl"


    // $ANTLR start "rule__ListaInteger__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1272:1: rule__ListaInteger__Group__4 : rule__ListaInteger__Group__4__Impl rule__ListaInteger__Group__5 ;
    public final void rule__ListaInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1276:1: ( rule__ListaInteger__Group__4__Impl rule__ListaInteger__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1277:2: rule__ListaInteger__Group__4__Impl rule__ListaInteger__Group__5
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__4__Impl_in_rule__ListaInteger__Group__42535);
            rule__ListaInteger__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__5_in_rule__ListaInteger__Group__42538);
            rule__ListaInteger__Group__5();

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
    // $ANTLR end "rule__ListaInteger__Group__4"


    // $ANTLR start "rule__ListaInteger__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1284:1: rule__ListaInteger__Group__4__Impl : ( ( rule__ListaInteger__ValoresAssignment_4 ) ) ;
    public final void rule__ListaInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1288:1: ( ( ( rule__ListaInteger__ValoresAssignment_4 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1289:1: ( ( rule__ListaInteger__ValoresAssignment_4 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1289:1: ( ( rule__ListaInteger__ValoresAssignment_4 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1290:1: ( rule__ListaInteger__ValoresAssignment_4 )
            {
             before(grammarAccess.getListaIntegerAccess().getValoresAssignment_4()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1291:1: ( rule__ListaInteger__ValoresAssignment_4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1291:2: rule__ListaInteger__ValoresAssignment_4
            {
            pushFollow(FOLLOW_rule__ListaInteger__ValoresAssignment_4_in_rule__ListaInteger__Group__4__Impl2565);
            rule__ListaInteger__ValoresAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getListaIntegerAccess().getValoresAssignment_4()); 

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
    // $ANTLR end "rule__ListaInteger__Group__4__Impl"


    // $ANTLR start "rule__ListaInteger__Group__5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1301:1: rule__ListaInteger__Group__5 : rule__ListaInteger__Group__5__Impl rule__ListaInteger__Group__6 ;
    public final void rule__ListaInteger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1305:1: ( rule__ListaInteger__Group__5__Impl rule__ListaInteger__Group__6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1306:2: rule__ListaInteger__Group__5__Impl rule__ListaInteger__Group__6
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__5__Impl_in_rule__ListaInteger__Group__52595);
            rule__ListaInteger__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__6_in_rule__ListaInteger__Group__52598);
            rule__ListaInteger__Group__6();

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
    // $ANTLR end "rule__ListaInteger__Group__5"


    // $ANTLR start "rule__ListaInteger__Group__5__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1313:1: rule__ListaInteger__Group__5__Impl : ( ( rule__ListaInteger__Group_5__0 )* ) ;
    public final void rule__ListaInteger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1317:1: ( ( ( rule__ListaInteger__Group_5__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1318:1: ( ( rule__ListaInteger__Group_5__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1318:1: ( ( rule__ListaInteger__Group_5__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1319:1: ( rule__ListaInteger__Group_5__0 )*
            {
             before(grammarAccess.getListaIntegerAccess().getGroup_5()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1320:1: ( rule__ListaInteger__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1320:2: rule__ListaInteger__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ListaInteger__Group_5__0_in_rule__ListaInteger__Group__5__Impl2625);
            	    rule__ListaInteger__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getListaIntegerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ListaInteger__Group__5__Impl"


    // $ANTLR start "rule__ListaInteger__Group__6"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1330:1: rule__ListaInteger__Group__6 : rule__ListaInteger__Group__6__Impl ;
    public final void rule__ListaInteger__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1334:1: ( rule__ListaInteger__Group__6__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1335:2: rule__ListaInteger__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__6__Impl_in_rule__ListaInteger__Group__62656);
            rule__ListaInteger__Group__6__Impl();

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
    // $ANTLR end "rule__ListaInteger__Group__6"


    // $ANTLR start "rule__ListaInteger__Group__6__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1341:1: rule__ListaInteger__Group__6__Impl : ( '}' ) ;
    public final void rule__ListaInteger__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1345:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1346:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1346:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1347:1: '}'
            {
             before(grammarAccess.getListaIntegerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__ListaInteger__Group__6__Impl2684); 
             after(grammarAccess.getListaIntegerAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ListaInteger__Group__6__Impl"


    // $ANTLR start "rule__ListaInteger__Group_5__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1374:1: rule__ListaInteger__Group_5__0 : rule__ListaInteger__Group_5__0__Impl rule__ListaInteger__Group_5__1 ;
    public final void rule__ListaInteger__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1378:1: ( rule__ListaInteger__Group_5__0__Impl rule__ListaInteger__Group_5__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1379:2: rule__ListaInteger__Group_5__0__Impl rule__ListaInteger__Group_5__1
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group_5__0__Impl_in_rule__ListaInteger__Group_5__02729);
            rule__ListaInteger__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group_5__1_in_rule__ListaInteger__Group_5__02732);
            rule__ListaInteger__Group_5__1();

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
    // $ANTLR end "rule__ListaInteger__Group_5__0"


    // $ANTLR start "rule__ListaInteger__Group_5__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1386:1: rule__ListaInteger__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ListaInteger__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1390:1: ( ( ',' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1391:1: ( ',' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1391:1: ( ',' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1392:1: ','
            {
             before(grammarAccess.getListaIntegerAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_18_in_rule__ListaInteger__Group_5__0__Impl2760); 
             after(grammarAccess.getListaIntegerAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__ListaInteger__Group_5__0__Impl"


    // $ANTLR start "rule__ListaInteger__Group_5__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1405:1: rule__ListaInteger__Group_5__1 : rule__ListaInteger__Group_5__1__Impl ;
    public final void rule__ListaInteger__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1409:1: ( rule__ListaInteger__Group_5__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1410:2: rule__ListaInteger__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group_5__1__Impl_in_rule__ListaInteger__Group_5__12791);
            rule__ListaInteger__Group_5__1__Impl();

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
    // $ANTLR end "rule__ListaInteger__Group_5__1"


    // $ANTLR start "rule__ListaInteger__Group_5__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1416:1: rule__ListaInteger__Group_5__1__Impl : ( RULE_INT ) ;
    public final void rule__ListaInteger__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1420:1: ( ( RULE_INT ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1421:1: ( RULE_INT )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1421:1: ( RULE_INT )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1422:1: RULE_INT
            {
             before(grammarAccess.getListaIntegerAccess().getINTTerminalRuleCall_5_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ListaInteger__Group_5__1__Impl2818); 
             after(grammarAccess.getListaIntegerAccess().getINTTerminalRuleCall_5_1()); 

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
    // $ANTLR end "rule__ListaInteger__Group_5__1__Impl"


    // $ANTLR start "rule__ListaString__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1437:1: rule__ListaString__Group__0 : rule__ListaString__Group__0__Impl rule__ListaString__Group__1 ;
    public final void rule__ListaString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1441:1: ( rule__ListaString__Group__0__Impl rule__ListaString__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1442:2: rule__ListaString__Group__0__Impl rule__ListaString__Group__1
            {
            pushFollow(FOLLOW_rule__ListaString__Group__0__Impl_in_rule__ListaString__Group__02851);
            rule__ListaString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__1_in_rule__ListaString__Group__02854);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1449:1: rule__ListaString__Group__0__Impl : ( () ) ;
    public final void rule__ListaString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1453:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1454:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1454:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1455:1: ()
            {
             before(grammarAccess.getListaStringAccess().getListaStringAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1456:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1458:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1468:1: rule__ListaString__Group__1 : rule__ListaString__Group__1__Impl rule__ListaString__Group__2 ;
    public final void rule__ListaString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1472:1: ( rule__ListaString__Group__1__Impl rule__ListaString__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1473:2: rule__ListaString__Group__1__Impl rule__ListaString__Group__2
            {
            pushFollow(FOLLOW_rule__ListaString__Group__1__Impl_in_rule__ListaString__Group__12912);
            rule__ListaString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__2_in_rule__ListaString__Group__12915);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1480:1: rule__ListaString__Group__1__Impl : ( 'List of String' ) ;
    public final void rule__ListaString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1484:1: ( ( 'List of String' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1485:1: ( 'List of String' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1485:1: ( 'List of String' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1486:1: 'List of String'
            {
             before(grammarAccess.getListaStringAccess().getListOfStringKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ListaString__Group__1__Impl2943); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1499:1: rule__ListaString__Group__2 : rule__ListaString__Group__2__Impl rule__ListaString__Group__3 ;
    public final void rule__ListaString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1503:1: ( rule__ListaString__Group__2__Impl rule__ListaString__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1504:2: rule__ListaString__Group__2__Impl rule__ListaString__Group__3
            {
            pushFollow(FOLLOW_rule__ListaString__Group__2__Impl_in_rule__ListaString__Group__22974);
            rule__ListaString__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__3_in_rule__ListaString__Group__22977);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1511:1: rule__ListaString__Group__2__Impl : ( '=' ) ;
    public final void rule__ListaString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1515:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1516:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1516:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1517:1: '='
            {
             before(grammarAccess.getListaStringAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__ListaString__Group__2__Impl3005); 
             after(grammarAccess.getListaStringAccess().getEqualsSignKeyword_2()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1530:1: rule__ListaString__Group__3 : rule__ListaString__Group__3__Impl rule__ListaString__Group__4 ;
    public final void rule__ListaString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1534:1: ( rule__ListaString__Group__3__Impl rule__ListaString__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1535:2: rule__ListaString__Group__3__Impl rule__ListaString__Group__4
            {
            pushFollow(FOLLOW_rule__ListaString__Group__3__Impl_in_rule__ListaString__Group__33036);
            rule__ListaString__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__4_in_rule__ListaString__Group__33039);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1542:1: rule__ListaString__Group__3__Impl : ( '{' ) ;
    public final void rule__ListaString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1546:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1547:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1547:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1548:1: '{'
            {
             before(grammarAccess.getListaStringAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__ListaString__Group__3__Impl3067); 
             after(grammarAccess.getListaStringAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1561:1: rule__ListaString__Group__4 : rule__ListaString__Group__4__Impl rule__ListaString__Group__5 ;
    public final void rule__ListaString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1565:1: ( rule__ListaString__Group__4__Impl rule__ListaString__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1566:2: rule__ListaString__Group__4__Impl rule__ListaString__Group__5
            {
            pushFollow(FOLLOW_rule__ListaString__Group__4__Impl_in_rule__ListaString__Group__43098);
            rule__ListaString__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__5_in_rule__ListaString__Group__43101);
            rule__ListaString__Group__5();

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1573:1: rule__ListaString__Group__4__Impl : ( ( rule__ListaString__ValoresAssignment_4 ) ) ;
    public final void rule__ListaString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1577:1: ( ( ( rule__ListaString__ValoresAssignment_4 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1578:1: ( ( rule__ListaString__ValoresAssignment_4 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1578:1: ( ( rule__ListaString__ValoresAssignment_4 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1579:1: ( rule__ListaString__ValoresAssignment_4 )
            {
             before(grammarAccess.getListaStringAccess().getValoresAssignment_4()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1580:1: ( rule__ListaString__ValoresAssignment_4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1580:2: rule__ListaString__ValoresAssignment_4
            {
            pushFollow(FOLLOW_rule__ListaString__ValoresAssignment_4_in_rule__ListaString__Group__4__Impl3128);
            rule__ListaString__ValoresAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getListaStringAccess().getValoresAssignment_4()); 

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


    // $ANTLR start "rule__ListaString__Group__5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1590:1: rule__ListaString__Group__5 : rule__ListaString__Group__5__Impl rule__ListaString__Group__6 ;
    public final void rule__ListaString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1594:1: ( rule__ListaString__Group__5__Impl rule__ListaString__Group__6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1595:2: rule__ListaString__Group__5__Impl rule__ListaString__Group__6
            {
            pushFollow(FOLLOW_rule__ListaString__Group__5__Impl_in_rule__ListaString__Group__53158);
            rule__ListaString__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__6_in_rule__ListaString__Group__53161);
            rule__ListaString__Group__6();

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
    // $ANTLR end "rule__ListaString__Group__5"


    // $ANTLR start "rule__ListaString__Group__5__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1602:1: rule__ListaString__Group__5__Impl : ( ( rule__ListaString__Group_5__0 )* ) ;
    public final void rule__ListaString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1606:1: ( ( ( rule__ListaString__Group_5__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1607:1: ( ( rule__ListaString__Group_5__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1607:1: ( ( rule__ListaString__Group_5__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1608:1: ( rule__ListaString__Group_5__0 )*
            {
             before(grammarAccess.getListaStringAccess().getGroup_5()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1609:1: ( rule__ListaString__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1609:2: rule__ListaString__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ListaString__Group_5__0_in_rule__ListaString__Group__5__Impl3188);
            	    rule__ListaString__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getListaStringAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ListaString__Group__5__Impl"


    // $ANTLR start "rule__ListaString__Group__6"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1619:1: rule__ListaString__Group__6 : rule__ListaString__Group__6__Impl ;
    public final void rule__ListaString__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1623:1: ( rule__ListaString__Group__6__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1624:2: rule__ListaString__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ListaString__Group__6__Impl_in_rule__ListaString__Group__63219);
            rule__ListaString__Group__6__Impl();

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
    // $ANTLR end "rule__ListaString__Group__6"


    // $ANTLR start "rule__ListaString__Group__6__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1630:1: rule__ListaString__Group__6__Impl : ( '}' ) ;
    public final void rule__ListaString__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1634:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1635:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1635:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1636:1: '}'
            {
             before(grammarAccess.getListaStringAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__ListaString__Group__6__Impl3247); 
             after(grammarAccess.getListaStringAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ListaString__Group__6__Impl"


    // $ANTLR start "rule__ListaString__Group_5__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1663:1: rule__ListaString__Group_5__0 : rule__ListaString__Group_5__0__Impl rule__ListaString__Group_5__1 ;
    public final void rule__ListaString__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1667:1: ( rule__ListaString__Group_5__0__Impl rule__ListaString__Group_5__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1668:2: rule__ListaString__Group_5__0__Impl rule__ListaString__Group_5__1
            {
            pushFollow(FOLLOW_rule__ListaString__Group_5__0__Impl_in_rule__ListaString__Group_5__03292);
            rule__ListaString__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group_5__1_in_rule__ListaString__Group_5__03295);
            rule__ListaString__Group_5__1();

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
    // $ANTLR end "rule__ListaString__Group_5__0"


    // $ANTLR start "rule__ListaString__Group_5__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1675:1: rule__ListaString__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ListaString__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1679:1: ( ( ',' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1680:1: ( ',' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1680:1: ( ',' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1681:1: ','
            {
             before(grammarAccess.getListaStringAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_18_in_rule__ListaString__Group_5__0__Impl3323); 
             after(grammarAccess.getListaStringAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__ListaString__Group_5__0__Impl"


    // $ANTLR start "rule__ListaString__Group_5__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1694:1: rule__ListaString__Group_5__1 : rule__ListaString__Group_5__1__Impl ;
    public final void rule__ListaString__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1698:1: ( rule__ListaString__Group_5__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1699:2: rule__ListaString__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ListaString__Group_5__1__Impl_in_rule__ListaString__Group_5__13354);
            rule__ListaString__Group_5__1__Impl();

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
    // $ANTLR end "rule__ListaString__Group_5__1"


    // $ANTLR start "rule__ListaString__Group_5__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1705:1: rule__ListaString__Group_5__1__Impl : ( RULE_STRING ) ;
    public final void rule__ListaString__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1709:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1710:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1710:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1711:1: RULE_STRING
            {
             before(grammarAccess.getListaStringAccess().getSTRINGTerminalRuleCall_5_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListaString__Group_5__1__Impl3381); 
             after(grammarAccess.getListaStringAccess().getSTRINGTerminalRuleCall_5_1()); 

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
    // $ANTLR end "rule__ListaString__Group_5__1__Impl"


    // $ANTLR start "rule__Modelo__ObjetosAssignment_3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1727:1: rule__Modelo__ObjetosAssignment_3 : ( ruleObjeto ) ;
    public final void rule__Modelo__ObjetosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1731:1: ( ( ruleObjeto ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1732:1: ( ruleObjeto )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1732:1: ( ruleObjeto )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1733:1: ruleObjeto
            {
             before(grammarAccess.getModeloAccess().getObjetosObjetoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleObjeto_in_rule__Modelo__ObjetosAssignment_33419);
            ruleObjeto();

            state._fsp--;

             after(grammarAccess.getModeloAccess().getObjetosObjetoParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Modelo__ObjetosAssignment_3"


    // $ANTLR start "rule__Objeto__NameAssignment_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1742:1: rule__Objeto__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Objeto__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1746:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1747:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1747:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1748:1: RULE_ID
            {
             before(grammarAccess.getObjetoAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Objeto__NameAssignment_03450); 
             after(grammarAccess.getObjetoAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Objeto__NameAssignment_0"


    // $ANTLR start "rule__Objeto__DescripcionAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1757:1: rule__Objeto__DescripcionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Objeto__DescripcionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1761:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1762:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1762:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1763:1: RULE_STRING
            {
             before(grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Objeto__DescripcionAssignment_13481); 
             after(grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Objeto__DescripcionAssignment_1"


    // $ANTLR start "rule__Objeto__AtributosAssignment_3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1772:1: rule__Objeto__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__Objeto__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1776:1: ( ( ruleAtributo ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1777:1: ( ruleAtributo )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1777:1: ( ruleAtributo )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1778:1: ruleAtributo
            {
             before(grammarAccess.getObjetoAccess().getAtributosAtributoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAtributo_in_rule__Objeto__AtributosAssignment_33512);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getObjetoAccess().getAtributosAtributoParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Objeto__AtributosAssignment_3"


    // $ANTLR start "rule__AtributoNormal__NombreAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1787:1: rule__AtributoNormal__NombreAssignment_1 : ( ( rule__AtributoNormal__NombreAlternatives_1_0 ) ) ;
    public final void rule__AtributoNormal__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1791:1: ( ( ( rule__AtributoNormal__NombreAlternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1792:1: ( ( rule__AtributoNormal__NombreAlternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1792:1: ( ( rule__AtributoNormal__NombreAlternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1793:1: ( rule__AtributoNormal__NombreAlternatives_1_0 )
            {
             before(grammarAccess.getAtributoNormalAccess().getNombreAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1794:1: ( rule__AtributoNormal__NombreAlternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1794:2: rule__AtributoNormal__NombreAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AtributoNormal__NombreAlternatives_1_0_in_rule__AtributoNormal__NombreAssignment_13543);
            rule__AtributoNormal__NombreAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoNormalAccess().getNombreAlternatives_1_0()); 

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
    // $ANTLR end "rule__AtributoNormal__NombreAssignment_1"


    // $ANTLR start "rule__AtributoNormal__ValorAssignment_3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1803:1: rule__AtributoNormal__ValorAssignment_3 : ( ( rule__AtributoNormal__ValorAlternatives_3_0 ) ) ;
    public final void rule__AtributoNormal__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1807:1: ( ( ( rule__AtributoNormal__ValorAlternatives_3_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1808:1: ( ( rule__AtributoNormal__ValorAlternatives_3_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1808:1: ( ( rule__AtributoNormal__ValorAlternatives_3_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1809:1: ( rule__AtributoNormal__ValorAlternatives_3_0 )
            {
             before(grammarAccess.getAtributoNormalAccess().getValorAlternatives_3_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1810:1: ( rule__AtributoNormal__ValorAlternatives_3_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1810:2: rule__AtributoNormal__ValorAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__AtributoNormal__ValorAlternatives_3_0_in_rule__AtributoNormal__ValorAssignment_33576);
            rule__AtributoNormal__ValorAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoNormalAccess().getValorAlternatives_3_0()); 

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
    // $ANTLR end "rule__AtributoNormal__ValorAssignment_3"


    // $ANTLR start "rule__ListaInteger__ValoresAssignment_4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1819:1: rule__ListaInteger__ValoresAssignment_4 : ( RULE_INT ) ;
    public final void rule__ListaInteger__ValoresAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1823:1: ( ( RULE_INT ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1824:1: ( RULE_INT )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1824:1: ( RULE_INT )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1825:1: RULE_INT
            {
             before(grammarAccess.getListaIntegerAccess().getValoresINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ListaInteger__ValoresAssignment_43609); 
             after(grammarAccess.getListaIntegerAccess().getValoresINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ListaInteger__ValoresAssignment_4"


    // $ANTLR start "rule__ListaString__ValoresAssignment_4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1834:1: rule__ListaString__ValoresAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ListaString__ValoresAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1838:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1839:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1839:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1840:1: RULE_STRING
            {
             before(grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListaString__ValoresAssignment_43640); 
             after(grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ListaString__ValoresAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModelo_in_entryRuleModelo61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelo68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modelo__Group__0_in_ruleModelo94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_entryRuleObjeto121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjeto128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__0_in_ruleObjeto154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoNormal_in_entryRuleAtributoNormal181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoNormal188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__0_in_ruleAtributoNormal214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoObjeto_in_entryRuleAtributoObjeto241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoObjeto248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_ruleAtributoObjeto274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributo307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atributo__Alternatives_in_ruleAtributo333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributo_in_entryRuleValorAtributo360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorAtributo367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__0_in_ruleValorAtributo393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributoValor_in_entryRuleValorAtributoValor422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorAtributoValor429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__0_in_ruleValorAtributoValor455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInteger_in_entryRuleListaInteger482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaInteger489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__0_in_ruleListaInteger515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_entryRuleListaString542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaString549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__0_in_ruleListaString575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLista_in_entryRuleLista602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLista609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lista__Alternatives_in_ruleLista635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtributoNormal__NombreAlternatives_1_0671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AtributoNormal__NombreAlternatives_1_0688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributo_in_rule__AtributoNormal__ValorAlternatives_3_0720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributoValor_in_rule__AtributoNormal__ValorAlternatives_3_0737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLista_in_rule__AtributoNormal__ValorAlternatives_3_0754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoNormal_in_rule__Atributo__Alternatives786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoObjeto_in_rule__Atributo__Alternatives803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValorAtributo__Alternatives_1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ValorAtributo__Alternatives_1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ValorAtributo__Alternatives_1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__ValorAtributo__Alternatives_1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInteger_in_rule__Lista__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_rule__Lista__Alternatives936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modelo__Group__0__Impl_in_rule__Modelo__Group__0966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Modelo__Group__1_in_rule__Modelo__Group__0969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modelo__Group__1__Impl_in_rule__Modelo__Group__11027 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Modelo__Group__2_in_rule__Modelo__Group__11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Modelo__Group__1__Impl1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modelo__Group__2__Impl_in_rule__Modelo__Group__21086 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Modelo__Group__3_in_rule__Modelo__Group__21089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Modelo__Group__2__Impl1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modelo__Group__3__Impl_in_rule__Modelo__Group__31148 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Modelo__Group__4_in_rule__Modelo__Group__31151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modelo__ObjetosAssignment_3_in_rule__Modelo__Group__3__Impl1178 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Modelo__Group__4__Impl_in_rule__Modelo__Group__41209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Modelo__Group__4__Impl1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__0__Impl_in_rule__Objeto__Group__01278 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Objeto__Group__1_in_rule__Objeto__Group__01281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__NameAssignment_0_in_rule__Objeto__Group__0__Impl1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__1__Impl_in_rule__Objeto__Group__11338 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Objeto__Group__2_in_rule__Objeto__Group__11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__DescripcionAssignment_1_in_rule__Objeto__Group__1__Impl1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__2__Impl_in_rule__Objeto__Group__21399 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_rule__Objeto__Group__3_in_rule__Objeto__Group__21402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Objeto__Group__2__Impl1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__3__Impl_in_rule__Objeto__Group__31461 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_rule__Objeto__Group__4_in_rule__Objeto__Group__31464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__AtributosAssignment_3_in_rule__Objeto__Group__3__Impl1491 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Objeto__Group__4__Impl_in_rule__Objeto__Group__41522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Objeto__Group__4__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__0__Impl_in_rule__AtributoNormal__Group__01591 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__1_in_rule__AtributoNormal__Group__01594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__1__Impl_in_rule__AtributoNormal__Group__11652 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__2_in_rule__AtributoNormal__Group__11655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__NombreAssignment_1_in_rule__AtributoNormal__Group__1__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__2__Impl_in_rule__AtributoNormal__Group__21712 = new BitSet(new long[]{0x00000000000A00F0L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__3_in_rule__AtributoNormal__Group__21715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AtributoNormal__Group__2__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__3__Impl_in_rule__AtributoNormal__Group__31774 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__4_in_rule__AtributoNormal__Group__31777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__ValorAssignment_3_in_rule__AtributoNormal__Group__3__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__4__Impl_in_rule__AtributoNormal__Group__41834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AtributoNormal__Group__4__Impl1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__0__Impl_in_rule__ValorAtributo__Group__01903 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__1_in_rule__ValorAtributo__Group__01906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__1__Impl_in_rule__ValorAtributo__Group__11964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Alternatives_1_in_rule__ValorAtributo__Group__1__Impl1993 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Alternatives_1_in_rule__ValorAtributo__Group__1__Impl2005 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__0__Impl_in_rule__ValorAtributoValor__Group__02042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__1_in_rule__ValorAtributoValor__Group__02045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__1__Impl_in_rule__ValorAtributoValor__Group__12103 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__2_in_rule__ValorAtributoValor__Group__12106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValorAtributoValor__Group__1__Impl2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__2__Impl_in_rule__ValorAtributoValor__Group__22162 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__3_in_rule__ValorAtributoValor__Group__22165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ValorAtributoValor__Group__2__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__3__Impl_in_rule__ValorAtributoValor__Group__32224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__ValorAtributoValor__Group__3__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__0__Impl_in_rule__ListaInteger__Group__02288 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__1_in_rule__ListaInteger__Group__02291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__1__Impl_in_rule__ListaInteger__Group__12349 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__2_in_rule__ListaInteger__Group__12352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ListaInteger__Group__1__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__2__Impl_in_rule__ListaInteger__Group__22411 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__3_in_rule__ListaInteger__Group__22414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ListaInteger__Group__2__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__3__Impl_in_rule__ListaInteger__Group__32473 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__4_in_rule__ListaInteger__Group__32476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ListaInteger__Group__3__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__4__Impl_in_rule__ListaInteger__Group__42535 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__5_in_rule__ListaInteger__Group__42538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__ValoresAssignment_4_in_rule__ListaInteger__Group__4__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__5__Impl_in_rule__ListaInteger__Group__52595 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__6_in_rule__ListaInteger__Group__52598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_5__0_in_rule__ListaInteger__Group__5__Impl2625 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__6__Impl_in_rule__ListaInteger__Group__62656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ListaInteger__Group__6__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_5__0__Impl_in_rule__ListaInteger__Group_5__02729 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_5__1_in_rule__ListaInteger__Group_5__02732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ListaInteger__Group_5__0__Impl2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_5__1__Impl_in_rule__ListaInteger__Group_5__12791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ListaInteger__Group_5__1__Impl2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__0__Impl_in_rule__ListaString__Group__02851 = new BitSet(new long[]{0x00000000000A00F0L});
    public static final BitSet FOLLOW_rule__ListaString__Group__1_in_rule__ListaString__Group__02854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__1__Impl_in_rule__ListaString__Group__12912 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__2_in_rule__ListaString__Group__12915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ListaString__Group__1__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__2__Impl_in_rule__ListaString__Group__22974 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__3_in_rule__ListaString__Group__22977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ListaString__Group__2__Impl3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__3__Impl_in_rule__ListaString__Group__33036 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListaString__Group__4_in_rule__ListaString__Group__33039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ListaString__Group__3__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__4__Impl_in_rule__ListaString__Group__43098 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__5_in_rule__ListaString__Group__43101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__ValoresAssignment_4_in_rule__ListaString__Group__4__Impl3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__5__Impl_in_rule__ListaString__Group__53158 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__6_in_rule__ListaString__Group__53161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_5__0_in_rule__ListaString__Group__5__Impl3188 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__6__Impl_in_rule__ListaString__Group__63219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ListaString__Group__6__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_5__0__Impl_in_rule__ListaString__Group_5__03292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListaString__Group_5__1_in_rule__ListaString__Group_5__03295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ListaString__Group_5__0__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_5__1__Impl_in_rule__ListaString__Group_5__13354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListaString__Group_5__1__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_rule__Modelo__ObjetosAssignment_33419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Objeto__NameAssignment_03450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Objeto__DescripcionAssignment_13481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_rule__Objeto__AtributosAssignment_33512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__NombreAlternatives_1_0_in_rule__AtributoNormal__NombreAssignment_13543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__ValorAlternatives_3_0_in_rule__AtributoNormal__ValorAssignment_33576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ListaInteger__ValoresAssignment_43609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListaString__ValoresAssignment_43640 = new BitSet(new long[]{0x0000000000000002L});

}