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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "':'", "';'", "'='", "'List of Integer'", "','", "'List of String'", "'def'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

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


    // $ANTLR start "entryRuleAtributoAsignacion"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:144:1: entryRuleAtributoAsignacion : ruleAtributoAsignacion EOF ;
    public final void entryRuleAtributoAsignacion() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:145:1: ( ruleAtributoAsignacion EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:146:1: ruleAtributoAsignacion EOF
            {
             before(grammarAccess.getAtributoAsignacionRule()); 
            pushFollow(FOLLOW_ruleAtributoAsignacion_in_entryRuleAtributoAsignacion241);
            ruleAtributoAsignacion();

            state._fsp--;

             after(grammarAccess.getAtributoAsignacionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoAsignacion248); 

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
    // $ANTLR end "entryRuleAtributoAsignacion"


    // $ANTLR start "ruleAtributoAsignacion"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:153:1: ruleAtributoAsignacion : ( ( rule__AtributoAsignacion__Group__0 ) ) ;
    public final void ruleAtributoAsignacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:157:2: ( ( ( rule__AtributoAsignacion__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:158:1: ( ( rule__AtributoAsignacion__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:158:1: ( ( rule__AtributoAsignacion__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:159:1: ( rule__AtributoAsignacion__Group__0 )
            {
             before(grammarAccess.getAtributoAsignacionAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:160:1: ( rule__AtributoAsignacion__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:160:2: rule__AtributoAsignacion__Group__0
            {
            pushFollow(FOLLOW_rule__AtributoAsignacion__Group__0_in_ruleAtributoAsignacion274);
            rule__AtributoAsignacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAsignacionAccess().getGroup()); 

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
    // $ANTLR end "ruleAtributoAsignacion"


    // $ANTLR start "entryRuleAtributoObjeto"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:172:1: entryRuleAtributoObjeto : ruleAtributoObjeto EOF ;
    public final void entryRuleAtributoObjeto() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:173:1: ( ruleAtributoObjeto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:174:1: ruleAtributoObjeto EOF
            {
             before(grammarAccess.getAtributoObjetoRule()); 
            pushFollow(FOLLOW_ruleAtributoObjeto_in_entryRuleAtributoObjeto301);
            ruleAtributoObjeto();

            state._fsp--;

             after(grammarAccess.getAtributoObjetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoObjeto308); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:181:1: ruleAtributoObjeto : ( ruleObjeto ) ;
    public final void ruleAtributoObjeto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:185:2: ( ( ruleObjeto ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:186:1: ( ruleObjeto )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:186:1: ( ruleObjeto )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:187:1: ruleObjeto
            {
             before(grammarAccess.getAtributoObjetoAccess().getObjetoParserRuleCall()); 
            pushFollow(FOLLOW_ruleObjeto_in_ruleAtributoObjeto334);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:200:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:201:1: ( ruleAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:202:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_ruleAtributo_in_entryRuleAtributo360);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributo367); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:209:1: ruleAtributo : ( ( rule__Atributo__Alternatives ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:213:2: ( ( ( rule__Atributo__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:214:1: ( ( rule__Atributo__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:214:1: ( ( rule__Atributo__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:215:1: ( rule__Atributo__Alternatives )
            {
             before(grammarAccess.getAtributoAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:216:1: ( rule__Atributo__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:216:2: rule__Atributo__Alternatives
            {
            pushFollow(FOLLOW_rule__Atributo__Alternatives_in_ruleAtributo393);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:228:1: entryRuleValorAtributo : ruleValorAtributo EOF ;
    public final void entryRuleValorAtributo() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:229:1: ( ruleValorAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:230:1: ruleValorAtributo EOF
            {
             before(grammarAccess.getValorAtributoRule()); 
            pushFollow(FOLLOW_ruleValorAtributo_in_entryRuleValorAtributo420);
            ruleValorAtributo();

            state._fsp--;

             after(grammarAccess.getValorAtributoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorAtributo427); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:237:1: ruleValorAtributo : ( ( rule__ValorAtributo__Group__0 ) ) ;
    public final void ruleValorAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:241:2: ( ( ( rule__ValorAtributo__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:242:1: ( ( rule__ValorAtributo__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:242:1: ( ( rule__ValorAtributo__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:243:1: ( rule__ValorAtributo__Group__0 )
            {
             before(grammarAccess.getValorAtributoAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:244:1: ( rule__ValorAtributo__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:244:2: rule__ValorAtributo__Group__0
            {
            pushFollow(FOLLOW_rule__ValorAtributo__Group__0_in_ruleValorAtributo453);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:258:1: entryRuleValorAtributoValor : ruleValorAtributoValor EOF ;
    public final void entryRuleValorAtributoValor() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:259:1: ( ruleValorAtributoValor EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:260:1: ruleValorAtributoValor EOF
            {
             before(grammarAccess.getValorAtributoValorRule()); 
            pushFollow(FOLLOW_ruleValorAtributoValor_in_entryRuleValorAtributoValor482);
            ruleValorAtributoValor();

            state._fsp--;

             after(grammarAccess.getValorAtributoValorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorAtributoValor489); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:267:1: ruleValorAtributoValor : ( ( rule__ValorAtributoValor__Group__0 ) ) ;
    public final void ruleValorAtributoValor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:271:2: ( ( ( rule__ValorAtributoValor__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:272:1: ( ( rule__ValorAtributoValor__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:272:1: ( ( rule__ValorAtributoValor__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:273:1: ( rule__ValorAtributoValor__Group__0 )
            {
             before(grammarAccess.getValorAtributoValorAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:274:1: ( rule__ValorAtributoValor__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:274:2: rule__ValorAtributoValor__Group__0
            {
            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__0_in_ruleValorAtributoValor515);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:286:1: entryRuleListaInteger : ruleListaInteger EOF ;
    public final void entryRuleListaInteger() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:287:1: ( ruleListaInteger EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:288:1: ruleListaInteger EOF
            {
             before(grammarAccess.getListaIntegerRule()); 
            pushFollow(FOLLOW_ruleListaInteger_in_entryRuleListaInteger542);
            ruleListaInteger();

            state._fsp--;

             after(grammarAccess.getListaIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaInteger549); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:295:1: ruleListaInteger : ( ( rule__ListaInteger__Group__0 ) ) ;
    public final void ruleListaInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:299:2: ( ( ( rule__ListaInteger__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:300:1: ( ( rule__ListaInteger__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:300:1: ( ( rule__ListaInteger__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:301:1: ( rule__ListaInteger__Group__0 )
            {
             before(grammarAccess.getListaIntegerAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:302:1: ( rule__ListaInteger__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:302:2: rule__ListaInteger__Group__0
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__0_in_ruleListaInteger575);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:314:1: entryRuleListaString : ruleListaString EOF ;
    public final void entryRuleListaString() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:315:1: ( ruleListaString EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:316:1: ruleListaString EOF
            {
             before(grammarAccess.getListaStringRule()); 
            pushFollow(FOLLOW_ruleListaString_in_entryRuleListaString602);
            ruleListaString();

            state._fsp--;

             after(grammarAccess.getListaStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaString609); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:323:1: ruleListaString : ( ( rule__ListaString__Group__0 ) ) ;
    public final void ruleListaString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:327:2: ( ( ( rule__ListaString__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:328:1: ( ( rule__ListaString__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:328:1: ( ( rule__ListaString__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:329:1: ( rule__ListaString__Group__0 )
            {
             before(grammarAccess.getListaStringAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:330:1: ( rule__ListaString__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:330:2: rule__ListaString__Group__0
            {
            pushFollow(FOLLOW_rule__ListaString__Group__0_in_ruleListaString635);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:342:1: entryRuleLista : ruleLista EOF ;
    public final void entryRuleLista() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:343:1: ( ruleLista EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:344:1: ruleLista EOF
            {
             before(grammarAccess.getListaRule()); 
            pushFollow(FOLLOW_ruleLista_in_entryRuleLista662);
            ruleLista();

            state._fsp--;

             after(grammarAccess.getListaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLista669); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:351:1: ruleLista : ( ( rule__Lista__Alternatives ) ) ;
    public final void ruleLista() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:355:2: ( ( ( rule__Lista__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:356:1: ( ( rule__Lista__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:356:1: ( ( rule__Lista__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:357:1: ( rule__Lista__Alternatives )
            {
             before(grammarAccess.getListaAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:358:1: ( rule__Lista__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:358:2: rule__Lista__Alternatives
            {
            pushFollow(FOLLOW_rule__Lista__Alternatives_in_ruleLista695);
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


    // $ANTLR start "entryRuleStatement"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:372:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:373:1: ( ruleStatement EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:374:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement724);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement731); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:381:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:385:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:386:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:386:1: ( ( rule__Statement__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:387:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:388:1: ( rule__Statement__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:388:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement757);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDefinition"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:400:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:401:1: ( ruleDefinition EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:402:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition784);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition791); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:409:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:413:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:414:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:414:1: ( ( rule__Definition__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:415:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:416:1: ( rule__Definition__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:416:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition817);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleEvaluation"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:428:1: entryRuleEvaluation : ruleEvaluation EOF ;
    public final void entryRuleEvaluation() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:429:1: ( ruleEvaluation EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:430:1: ruleEvaluation EOF
            {
             before(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation844);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getEvaluationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation851); 

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
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:437:1: ruleEvaluation : ( ( rule__Evaluation__Group__0 ) ) ;
    public final void ruleEvaluation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:441:2: ( ( ( rule__Evaluation__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:442:1: ( ( rule__Evaluation__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:442:1: ( ( rule__Evaluation__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:443:1: ( rule__Evaluation__Group__0 )
            {
             before(grammarAccess.getEvaluationAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:444:1: ( rule__Evaluation__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:444:2: rule__Evaluation__Group__0
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation877);
            rule__Evaluation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getGroup()); 

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
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleExpression"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:456:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:457:1: ( ruleExpression EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:458:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression904);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression911); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:465:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:469:2: ( ( ruleAddition ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:470:1: ( ruleAddition )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:470:1: ( ruleAddition )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:471:1: ruleAddition
            {
             before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_ruleAddition_in_ruleExpression937);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:484:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:485:1: ( ruleAddition EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:486:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition963);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition970); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:493:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:497:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:498:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:498:1: ( ( rule__Addition__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:499:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:500:1: ( rule__Addition__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:500:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition996);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:512:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:513:1: ( ruleMultiplication EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:514:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1023);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1030); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:521:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:525:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:526:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:526:1: ( ( rule__Multiplication__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:527:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:528:1: ( rule__Multiplication__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:528:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1056);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:540:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:541:1: ( rulePrimaryExpression EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:542:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1083);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1090); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:549:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:553:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:554:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:554:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:555:1: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:556:1: ( rule__PrimaryExpression__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:556:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1116);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "rule__AtributoNormal__NombreAlternatives_1_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:568:1: rule__AtributoNormal__NombreAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__AtributoNormal__NombreAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:572:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:573:1: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:573:1: ( RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:574:1: RULE_ID
                    {
                     before(grammarAccess.getAtributoNormalAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtributoNormal__NombreAlternatives_1_01152); 
                     after(grammarAccess.getAtributoNormalAccess().getNombreIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:579:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:579:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:580:1: RULE_STRING
                    {
                     before(grammarAccess.getAtributoNormalAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AtributoNormal__NombreAlternatives_1_01169); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:590:1: rule__AtributoNormal__ValorAlternatives_3_0 : ( ( ruleValorAtributo ) | ( ruleValorAtributoValor ) | ( ruleLista ) );
    public final void rule__AtributoNormal__ValorAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:594:1: ( ( ruleValorAtributo ) | ( ruleValorAtributoValor ) | ( ruleLista ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=RULE_ID && LA2_1<=RULE_NUMBER)||LA2_1==15) ) {
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
            case RULE_NUMBER:
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:595:1: ( ruleValorAtributo )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:595:1: ( ruleValorAtributo )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:596:1: ruleValorAtributo
                    {
                     before(grammarAccess.getAtributoNormalAccess().getValorValorAtributoParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleValorAtributo_in_rule__AtributoNormal__ValorAlternatives_3_01201);
                    ruleValorAtributo();

                    state._fsp--;

                     after(grammarAccess.getAtributoNormalAccess().getValorValorAtributoParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:601:6: ( ruleValorAtributoValor )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:601:6: ( ruleValorAtributoValor )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:602:1: ruleValorAtributoValor
                    {
                     before(grammarAccess.getAtributoNormalAccess().getValorValorAtributoValorParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleValorAtributoValor_in_rule__AtributoNormal__ValorAlternatives_3_01218);
                    ruleValorAtributoValor();

                    state._fsp--;

                     after(grammarAccess.getAtributoNormalAccess().getValorValorAtributoValorParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:607:6: ( ruleLista )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:607:6: ( ruleLista )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:608:1: ruleLista
                    {
                     before(grammarAccess.getAtributoNormalAccess().getValorListaParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_ruleLista_in_rule__AtributoNormal__ValorAlternatives_3_01235);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:618:1: rule__Atributo__Alternatives : ( ( ruleAtributoNormal ) | ( ruleAtributoObjeto ) | ( ruleAtributoAsignacion ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:622:1: ( ( ruleAtributoNormal ) | ( ruleAtributoObjeto ) | ( ruleAtributoAsignacion ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt3=3;
                    }
                    break;
                case RULE_STRING:
                case 12:
                    {
                    alt3=2;
                    }
                    break;
                case 14:
                    {
                    alt3=1;
                    }
                    break;
                default:
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:623:1: ( ruleAtributoNormal )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:623:1: ( ruleAtributoNormal )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:624:1: ruleAtributoNormal
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoNormalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtributoNormal_in_rule__Atributo__Alternatives1267);
                    ruleAtributoNormal();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoNormalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:629:6: ( ruleAtributoObjeto )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:629:6: ( ruleAtributoObjeto )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:630:1: ruleAtributoObjeto
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoObjetoParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtributoObjeto_in_rule__Atributo__Alternatives1284);
                    ruleAtributoObjeto();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoObjetoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:635:6: ( ruleAtributoAsignacion )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:635:6: ( ruleAtributoAsignacion )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:636:1: ruleAtributoAsignacion
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoAsignacionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtributoAsignacion_in_rule__Atributo__Alternatives1301);
                    ruleAtributoAsignacion();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoAsignacionParserRuleCall_2()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:646:1: rule__ValorAtributo__Alternatives_1 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_NUMBER ) );
    public final void rule__ValorAtributo__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:650:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_NUMBER ) )
            int alt4=3;
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
            case RULE_NUMBER:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:651:1: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:651:1: ( RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:652:1: RULE_ID
                    {
                     before(grammarAccess.getValorAtributoAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValorAtributo__Alternatives_11333); 
                     after(grammarAccess.getValorAtributoAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:657:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:657:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:658:1: RULE_STRING
                    {
                     before(grammarAccess.getValorAtributoAccess().getSTRINGTerminalRuleCall_1_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ValorAtributo__Alternatives_11350); 
                     after(grammarAccess.getValorAtributoAccess().getSTRINGTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:663:6: ( RULE_NUMBER )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:663:6: ( RULE_NUMBER )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:664:1: RULE_NUMBER
                    {
                     before(grammarAccess.getValorAtributoAccess().getNUMBERTerminalRuleCall_1_2()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__ValorAtributo__Alternatives_11367); 
                     after(grammarAccess.getValorAtributoAccess().getNUMBERTerminalRuleCall_1_2()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:675:1: rule__Lista__Alternatives : ( ( ruleListaInteger ) | ( ruleListaString ) );
    public final void rule__Lista__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:679:1: ( ( ruleListaInteger ) | ( ruleListaString ) )
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:680:1: ( ruleListaInteger )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:680:1: ( ruleListaInteger )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:681:1: ruleListaInteger
                    {
                     before(grammarAccess.getListaAccess().getListaIntegerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleListaInteger_in_rule__Lista__Alternatives1400);
                    ruleListaInteger();

                    state._fsp--;

                     after(grammarAccess.getListaAccess().getListaIntegerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:686:6: ( ruleListaString )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:686:6: ( ruleListaString )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:687:1: ruleListaString
                    {
                     before(grammarAccess.getListaAccess().getListaStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleListaString_in_rule__Lista__Alternatives1417);
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


    // $ANTLR start "rule__Statement__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:697:1: rule__Statement__Alternatives : ( ( ruleDefinition ) | ( ruleEvaluation ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:701:1: ( ( ruleDefinition ) | ( ruleEvaluation ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_NUMBER)||LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:702:1: ( ruleDefinition )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:702:1: ( ruleDefinition )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:703:1: ruleDefinition
                    {
                     before(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefinition_in_rule__Statement__Alternatives1449);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:708:6: ( ruleEvaluation )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:708:6: ( ruleEvaluation )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:709:1: ruleEvaluation
                    {
                     before(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEvaluation_in_rule__Statement__Alternatives1466);
                    ruleEvaluation();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:719:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:723:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:724:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:724:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:725:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:726:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:726:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01498);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:730:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:730:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:731:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:732:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:732:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01516);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:741:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:745:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:746:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:746:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:747:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:748:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:748:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01549);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:752:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:752:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:753:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:754:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:754:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01567);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:763:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:767:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:768:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:768:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:769:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:770:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:770:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1600);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:774:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:774:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:775:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:776:1: ( rule__PrimaryExpression__Group_1__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:776:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1618);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:780:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:780:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:781:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:782:1: ( rule__PrimaryExpression__Group_2__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:782:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1636);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:786:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:786:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:787:1: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:788:1: ( rule__PrimaryExpression__Group_3__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:788:2: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives1654);
                    rule__PrimaryExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Modelo__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:799:1: rule__Modelo__Group__0 : rule__Modelo__Group__0__Impl rule__Modelo__Group__1 ;
    public final void rule__Modelo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:803:1: ( rule__Modelo__Group__0__Impl rule__Modelo__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:804:2: rule__Modelo__Group__0__Impl rule__Modelo__Group__1
            {
            pushFollow(FOLLOW_rule__Modelo__Group__0__Impl_in_rule__Modelo__Group__01685);
            rule__Modelo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Modelo__Group__1_in_rule__Modelo__Group__01688);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:811:1: rule__Modelo__Group__0__Impl : ( () ) ;
    public final void rule__Modelo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:815:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:816:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:816:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:817:1: ()
            {
             before(grammarAccess.getModeloAccess().getModeloAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:818:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:820:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:830:1: rule__Modelo__Group__1 : rule__Modelo__Group__1__Impl rule__Modelo__Group__2 ;
    public final void rule__Modelo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:834:1: ( rule__Modelo__Group__1__Impl rule__Modelo__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:835:2: rule__Modelo__Group__1__Impl rule__Modelo__Group__2
            {
            pushFollow(FOLLOW_rule__Modelo__Group__1__Impl_in_rule__Modelo__Group__11746);
            rule__Modelo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Modelo__Group__2_in_rule__Modelo__Group__11749);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:842:1: rule__Modelo__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Modelo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:846:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:847:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:847:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:848:1: RULE_ID
            {
             before(grammarAccess.getModeloAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Modelo__Group__1__Impl1776); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:859:1: rule__Modelo__Group__2 : rule__Modelo__Group__2__Impl rule__Modelo__Group__3 ;
    public final void rule__Modelo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:863:1: ( rule__Modelo__Group__2__Impl rule__Modelo__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:864:2: rule__Modelo__Group__2__Impl rule__Modelo__Group__3
            {
            pushFollow(FOLLOW_rule__Modelo__Group__2__Impl_in_rule__Modelo__Group__21805);
            rule__Modelo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Modelo__Group__3_in_rule__Modelo__Group__21808);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:871:1: rule__Modelo__Group__2__Impl : ( '{' ) ;
    public final void rule__Modelo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:875:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:876:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:876:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:877:1: '{'
            {
             before(grammarAccess.getModeloAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Modelo__Group__2__Impl1836); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:890:1: rule__Modelo__Group__3 : rule__Modelo__Group__3__Impl rule__Modelo__Group__4 ;
    public final void rule__Modelo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:894:1: ( rule__Modelo__Group__3__Impl rule__Modelo__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:895:2: rule__Modelo__Group__3__Impl rule__Modelo__Group__4
            {
            pushFollow(FOLLOW_rule__Modelo__Group__3__Impl_in_rule__Modelo__Group__31867);
            rule__Modelo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Modelo__Group__4_in_rule__Modelo__Group__31870);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:902:1: rule__Modelo__Group__3__Impl : ( ( rule__Modelo__ObjetosAssignment_3 )* ) ;
    public final void rule__Modelo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:906:1: ( ( ( rule__Modelo__ObjetosAssignment_3 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:907:1: ( ( rule__Modelo__ObjetosAssignment_3 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:907:1: ( ( rule__Modelo__ObjetosAssignment_3 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:908:1: ( rule__Modelo__ObjetosAssignment_3 )*
            {
             before(grammarAccess.getModeloAccess().getObjetosAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:909:1: ( rule__Modelo__ObjetosAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:909:2: rule__Modelo__ObjetosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Modelo__ObjetosAssignment_3_in_rule__Modelo__Group__3__Impl1897);
            	    rule__Modelo__ObjetosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:919:1: rule__Modelo__Group__4 : rule__Modelo__Group__4__Impl ;
    public final void rule__Modelo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:923:1: ( rule__Modelo__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:924:2: rule__Modelo__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Modelo__Group__4__Impl_in_rule__Modelo__Group__41928);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:930:1: rule__Modelo__Group__4__Impl : ( '}' ) ;
    public final void rule__Modelo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:934:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:935:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:935:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:936:1: '}'
            {
             before(grammarAccess.getModeloAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Modelo__Group__4__Impl1956); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:959:1: rule__Objeto__Group__0 : rule__Objeto__Group__0__Impl rule__Objeto__Group__1 ;
    public final void rule__Objeto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:963:1: ( rule__Objeto__Group__0__Impl rule__Objeto__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:964:2: rule__Objeto__Group__0__Impl rule__Objeto__Group__1
            {
            pushFollow(FOLLOW_rule__Objeto__Group__0__Impl_in_rule__Objeto__Group__01997);
            rule__Objeto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__1_in_rule__Objeto__Group__02000);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:971:1: rule__Objeto__Group__0__Impl : ( ( rule__Objeto__NameAssignment_0 ) ) ;
    public final void rule__Objeto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:975:1: ( ( ( rule__Objeto__NameAssignment_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:976:1: ( ( rule__Objeto__NameAssignment_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:976:1: ( ( rule__Objeto__NameAssignment_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:977:1: ( rule__Objeto__NameAssignment_0 )
            {
             before(grammarAccess.getObjetoAccess().getNameAssignment_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:978:1: ( rule__Objeto__NameAssignment_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:978:2: rule__Objeto__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Objeto__NameAssignment_0_in_rule__Objeto__Group__0__Impl2027);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:988:1: rule__Objeto__Group__1 : rule__Objeto__Group__1__Impl rule__Objeto__Group__2 ;
    public final void rule__Objeto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:992:1: ( rule__Objeto__Group__1__Impl rule__Objeto__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:993:2: rule__Objeto__Group__1__Impl rule__Objeto__Group__2
            {
            pushFollow(FOLLOW_rule__Objeto__Group__1__Impl_in_rule__Objeto__Group__12057);
            rule__Objeto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__2_in_rule__Objeto__Group__12060);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1000:1: rule__Objeto__Group__1__Impl : ( ( rule__Objeto__DescripcionAssignment_1 )? ) ;
    public final void rule__Objeto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1004:1: ( ( ( rule__Objeto__DescripcionAssignment_1 )? ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1005:1: ( ( rule__Objeto__DescripcionAssignment_1 )? )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1005:1: ( ( rule__Objeto__DescripcionAssignment_1 )? )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1006:1: ( rule__Objeto__DescripcionAssignment_1 )?
            {
             before(grammarAccess.getObjetoAccess().getDescripcionAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1007:1: ( rule__Objeto__DescripcionAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1007:2: rule__Objeto__DescripcionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Objeto__DescripcionAssignment_1_in_rule__Objeto__Group__1__Impl2087);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1017:1: rule__Objeto__Group__2 : rule__Objeto__Group__2__Impl rule__Objeto__Group__3 ;
    public final void rule__Objeto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1021:1: ( rule__Objeto__Group__2__Impl rule__Objeto__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1022:2: rule__Objeto__Group__2__Impl rule__Objeto__Group__3
            {
            pushFollow(FOLLOW_rule__Objeto__Group__2__Impl_in_rule__Objeto__Group__22118);
            rule__Objeto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__3_in_rule__Objeto__Group__22121);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1029:1: rule__Objeto__Group__2__Impl : ( '{' ) ;
    public final void rule__Objeto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1033:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1034:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1034:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1035:1: '{'
            {
             before(grammarAccess.getObjetoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Objeto__Group__2__Impl2149); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1048:1: rule__Objeto__Group__3 : rule__Objeto__Group__3__Impl rule__Objeto__Group__4 ;
    public final void rule__Objeto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1052:1: ( rule__Objeto__Group__3__Impl rule__Objeto__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1053:2: rule__Objeto__Group__3__Impl rule__Objeto__Group__4
            {
            pushFollow(FOLLOW_rule__Objeto__Group__3__Impl_in_rule__Objeto__Group__32180);
            rule__Objeto__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__4_in_rule__Objeto__Group__32183);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1060:1: rule__Objeto__Group__3__Impl : ( ( rule__Objeto__AtributosAssignment_3 )* ) ;
    public final void rule__Objeto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1064:1: ( ( ( rule__Objeto__AtributosAssignment_3 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1065:1: ( ( rule__Objeto__AtributosAssignment_3 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1065:1: ( ( rule__Objeto__AtributosAssignment_3 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1066:1: ( rule__Objeto__AtributosAssignment_3 )*
            {
             before(grammarAccess.getObjetoAccess().getAtributosAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1067:1: ( rule__Objeto__AtributosAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1067:2: rule__Objeto__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Objeto__AtributosAssignment_3_in_rule__Objeto__Group__3__Impl2210);
            	    rule__Objeto__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1077:1: rule__Objeto__Group__4 : rule__Objeto__Group__4__Impl ;
    public final void rule__Objeto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1081:1: ( rule__Objeto__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1082:2: rule__Objeto__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Objeto__Group__4__Impl_in_rule__Objeto__Group__42241);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1088:1: rule__Objeto__Group__4__Impl : ( '}' ) ;
    public final void rule__Objeto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1092:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1093:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1093:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1094:1: '}'
            {
             before(grammarAccess.getObjetoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Objeto__Group__4__Impl2269); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1117:1: rule__AtributoNormal__Group__0 : rule__AtributoNormal__Group__0__Impl rule__AtributoNormal__Group__1 ;
    public final void rule__AtributoNormal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1121:1: ( rule__AtributoNormal__Group__0__Impl rule__AtributoNormal__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1122:2: rule__AtributoNormal__Group__0__Impl rule__AtributoNormal__Group__1
            {
            pushFollow(FOLLOW_rule__AtributoNormal__Group__0__Impl_in_rule__AtributoNormal__Group__02310);
            rule__AtributoNormal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoNormal__Group__1_in_rule__AtributoNormal__Group__02313);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1129:1: rule__AtributoNormal__Group__0__Impl : ( () ) ;
    public final void rule__AtributoNormal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1133:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1134:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1134:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1135:1: ()
            {
             before(grammarAccess.getAtributoNormalAccess().getAtributoNormalAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1136:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1138:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1148:1: rule__AtributoNormal__Group__1 : rule__AtributoNormal__Group__1__Impl rule__AtributoNormal__Group__2 ;
    public final void rule__AtributoNormal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1152:1: ( rule__AtributoNormal__Group__1__Impl rule__AtributoNormal__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1153:2: rule__AtributoNormal__Group__1__Impl rule__AtributoNormal__Group__2
            {
            pushFollow(FOLLOW_rule__AtributoNormal__Group__1__Impl_in_rule__AtributoNormal__Group__12371);
            rule__AtributoNormal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoNormal__Group__2_in_rule__AtributoNormal__Group__12374);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1160:1: rule__AtributoNormal__Group__1__Impl : ( ( rule__AtributoNormal__NombreAssignment_1 ) ) ;
    public final void rule__AtributoNormal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1164:1: ( ( ( rule__AtributoNormal__NombreAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1165:1: ( ( rule__AtributoNormal__NombreAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1165:1: ( ( rule__AtributoNormal__NombreAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1166:1: ( rule__AtributoNormal__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoNormalAccess().getNombreAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1167:1: ( rule__AtributoNormal__NombreAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1167:2: rule__AtributoNormal__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__AtributoNormal__NombreAssignment_1_in_rule__AtributoNormal__Group__1__Impl2401);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1177:1: rule__AtributoNormal__Group__2 : rule__AtributoNormal__Group__2__Impl rule__AtributoNormal__Group__3 ;
    public final void rule__AtributoNormal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1181:1: ( rule__AtributoNormal__Group__2__Impl rule__AtributoNormal__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1182:2: rule__AtributoNormal__Group__2__Impl rule__AtributoNormal__Group__3
            {
            pushFollow(FOLLOW_rule__AtributoNormal__Group__2__Impl_in_rule__AtributoNormal__Group__22431);
            rule__AtributoNormal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoNormal__Group__3_in_rule__AtributoNormal__Group__22434);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1189:1: rule__AtributoNormal__Group__2__Impl : ( ':' ) ;
    public final void rule__AtributoNormal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1193:1: ( ( ':' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1194:1: ( ':' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1194:1: ( ':' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1195:1: ':'
            {
             before(grammarAccess.getAtributoNormalAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__AtributoNormal__Group__2__Impl2462); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1208:1: rule__AtributoNormal__Group__3 : rule__AtributoNormal__Group__3__Impl rule__AtributoNormal__Group__4 ;
    public final void rule__AtributoNormal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1212:1: ( rule__AtributoNormal__Group__3__Impl rule__AtributoNormal__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1213:2: rule__AtributoNormal__Group__3__Impl rule__AtributoNormal__Group__4
            {
            pushFollow(FOLLOW_rule__AtributoNormal__Group__3__Impl_in_rule__AtributoNormal__Group__32493);
            rule__AtributoNormal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoNormal__Group__4_in_rule__AtributoNormal__Group__32496);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1220:1: rule__AtributoNormal__Group__3__Impl : ( ( rule__AtributoNormal__ValorAssignment_3 ) ) ;
    public final void rule__AtributoNormal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1224:1: ( ( ( rule__AtributoNormal__ValorAssignment_3 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1225:1: ( ( rule__AtributoNormal__ValorAssignment_3 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1225:1: ( ( rule__AtributoNormal__ValorAssignment_3 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1226:1: ( rule__AtributoNormal__ValorAssignment_3 )
            {
             before(grammarAccess.getAtributoNormalAccess().getValorAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1227:1: ( rule__AtributoNormal__ValorAssignment_3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1227:2: rule__AtributoNormal__ValorAssignment_3
            {
            pushFollow(FOLLOW_rule__AtributoNormal__ValorAssignment_3_in_rule__AtributoNormal__Group__3__Impl2523);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1237:1: rule__AtributoNormal__Group__4 : rule__AtributoNormal__Group__4__Impl ;
    public final void rule__AtributoNormal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1241:1: ( rule__AtributoNormal__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1242:2: rule__AtributoNormal__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AtributoNormal__Group__4__Impl_in_rule__AtributoNormal__Group__42553);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1248:1: rule__AtributoNormal__Group__4__Impl : ( ';' ) ;
    public final void rule__AtributoNormal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1252:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1253:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1253:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1254:1: ';'
            {
             before(grammarAccess.getAtributoNormalAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__AtributoNormal__Group__4__Impl2581); 
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


    // $ANTLR start "rule__AtributoAsignacion__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1277:1: rule__AtributoAsignacion__Group__0 : rule__AtributoAsignacion__Group__0__Impl rule__AtributoAsignacion__Group__1 ;
    public final void rule__AtributoAsignacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1281:1: ( rule__AtributoAsignacion__Group__0__Impl rule__AtributoAsignacion__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1282:2: rule__AtributoAsignacion__Group__0__Impl rule__AtributoAsignacion__Group__1
            {
            pushFollow(FOLLOW_rule__AtributoAsignacion__Group__0__Impl_in_rule__AtributoAsignacion__Group__02622);
            rule__AtributoAsignacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoAsignacion__Group__1_in_rule__AtributoAsignacion__Group__02625);
            rule__AtributoAsignacion__Group__1();

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
    // $ANTLR end "rule__AtributoAsignacion__Group__0"


    // $ANTLR start "rule__AtributoAsignacion__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1289:1: rule__AtributoAsignacion__Group__0__Impl : ( () ) ;
    public final void rule__AtributoAsignacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1293:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1294:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1294:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1295:1: ()
            {
             before(grammarAccess.getAtributoAsignacionAccess().getAtributoAsignacionAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1296:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1298:1: 
            {
            }

             after(grammarAccess.getAtributoAsignacionAccess().getAtributoAsignacionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoAsignacion__Group__0__Impl"


    // $ANTLR start "rule__AtributoAsignacion__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1308:1: rule__AtributoAsignacion__Group__1 : rule__AtributoAsignacion__Group__1__Impl rule__AtributoAsignacion__Group__2 ;
    public final void rule__AtributoAsignacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1312:1: ( rule__AtributoAsignacion__Group__1__Impl rule__AtributoAsignacion__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1313:2: rule__AtributoAsignacion__Group__1__Impl rule__AtributoAsignacion__Group__2
            {
            pushFollow(FOLLOW_rule__AtributoAsignacion__Group__1__Impl_in_rule__AtributoAsignacion__Group__12683);
            rule__AtributoAsignacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoAsignacion__Group__2_in_rule__AtributoAsignacion__Group__12686);
            rule__AtributoAsignacion__Group__2();

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
    // $ANTLR end "rule__AtributoAsignacion__Group__1"


    // $ANTLR start "rule__AtributoAsignacion__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1320:1: rule__AtributoAsignacion__Group__1__Impl : ( ( rule__AtributoAsignacion__NombreAssignment_1 ) ) ;
    public final void rule__AtributoAsignacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1324:1: ( ( ( rule__AtributoAsignacion__NombreAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1325:1: ( ( rule__AtributoAsignacion__NombreAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1325:1: ( ( rule__AtributoAsignacion__NombreAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1326:1: ( rule__AtributoAsignacion__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoAsignacionAccess().getNombreAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1327:1: ( rule__AtributoAsignacion__NombreAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1327:2: rule__AtributoAsignacion__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__AtributoAsignacion__NombreAssignment_1_in_rule__AtributoAsignacion__Group__1__Impl2713);
            rule__AtributoAsignacion__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAsignacionAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__AtributoAsignacion__Group__1__Impl"


    // $ANTLR start "rule__AtributoAsignacion__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1337:1: rule__AtributoAsignacion__Group__2 : rule__AtributoAsignacion__Group__2__Impl rule__AtributoAsignacion__Group__3 ;
    public final void rule__AtributoAsignacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1341:1: ( rule__AtributoAsignacion__Group__2__Impl rule__AtributoAsignacion__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1342:2: rule__AtributoAsignacion__Group__2__Impl rule__AtributoAsignacion__Group__3
            {
            pushFollow(FOLLOW_rule__AtributoAsignacion__Group__2__Impl_in_rule__AtributoAsignacion__Group__22743);
            rule__AtributoAsignacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoAsignacion__Group__3_in_rule__AtributoAsignacion__Group__22746);
            rule__AtributoAsignacion__Group__3();

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
    // $ANTLR end "rule__AtributoAsignacion__Group__2"


    // $ANTLR start "rule__AtributoAsignacion__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1349:1: rule__AtributoAsignacion__Group__2__Impl : ( '=' ) ;
    public final void rule__AtributoAsignacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1353:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1354:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1354:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1355:1: '='
            {
             before(grammarAccess.getAtributoAsignacionAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__AtributoAsignacion__Group__2__Impl2774); 
             after(grammarAccess.getAtributoAsignacionAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__AtributoAsignacion__Group__2__Impl"


    // $ANTLR start "rule__AtributoAsignacion__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1368:1: rule__AtributoAsignacion__Group__3 : rule__AtributoAsignacion__Group__3__Impl ;
    public final void rule__AtributoAsignacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1372:1: ( rule__AtributoAsignacion__Group__3__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1373:2: rule__AtributoAsignacion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AtributoAsignacion__Group__3__Impl_in_rule__AtributoAsignacion__Group__32805);
            rule__AtributoAsignacion__Group__3__Impl();

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
    // $ANTLR end "rule__AtributoAsignacion__Group__3"


    // $ANTLR start "rule__AtributoAsignacion__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1379:1: rule__AtributoAsignacion__Group__3__Impl : ( ( rule__AtributoAsignacion__ValorAssignment_3 ) ) ;
    public final void rule__AtributoAsignacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1383:1: ( ( ( rule__AtributoAsignacion__ValorAssignment_3 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1384:1: ( ( rule__AtributoAsignacion__ValorAssignment_3 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1384:1: ( ( rule__AtributoAsignacion__ValorAssignment_3 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1385:1: ( rule__AtributoAsignacion__ValorAssignment_3 )
            {
             before(grammarAccess.getAtributoAsignacionAccess().getValorAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1386:1: ( rule__AtributoAsignacion__ValorAssignment_3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1386:2: rule__AtributoAsignacion__ValorAssignment_3
            {
            pushFollow(FOLLOW_rule__AtributoAsignacion__ValorAssignment_3_in_rule__AtributoAsignacion__Group__3__Impl2832);
            rule__AtributoAsignacion__ValorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAsignacionAccess().getValorAssignment_3()); 

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
    // $ANTLR end "rule__AtributoAsignacion__Group__3__Impl"


    // $ANTLR start "rule__ValorAtributo__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1404:1: rule__ValorAtributo__Group__0 : rule__ValorAtributo__Group__0__Impl rule__ValorAtributo__Group__1 ;
    public final void rule__ValorAtributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1408:1: ( rule__ValorAtributo__Group__0__Impl rule__ValorAtributo__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1409:2: rule__ValorAtributo__Group__0__Impl rule__ValorAtributo__Group__1
            {
            pushFollow(FOLLOW_rule__ValorAtributo__Group__0__Impl_in_rule__ValorAtributo__Group__02870);
            rule__ValorAtributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValorAtributo__Group__1_in_rule__ValorAtributo__Group__02873);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1416:1: rule__ValorAtributo__Group__0__Impl : ( () ) ;
    public final void rule__ValorAtributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1420:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1421:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1421:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1422:1: ()
            {
             before(grammarAccess.getValorAtributoAccess().getValorAtributoAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1423:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1425:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1435:1: rule__ValorAtributo__Group__1 : rule__ValorAtributo__Group__1__Impl ;
    public final void rule__ValorAtributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1439:1: ( rule__ValorAtributo__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1440:2: rule__ValorAtributo__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ValorAtributo__Group__1__Impl_in_rule__ValorAtributo__Group__12931);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1446:1: rule__ValorAtributo__Group__1__Impl : ( ( ( rule__ValorAtributo__Alternatives_1 ) ) ( ( rule__ValorAtributo__Alternatives_1 )* ) ) ;
    public final void rule__ValorAtributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1450:1: ( ( ( ( rule__ValorAtributo__Alternatives_1 ) ) ( ( rule__ValorAtributo__Alternatives_1 )* ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1451:1: ( ( ( rule__ValorAtributo__Alternatives_1 ) ) ( ( rule__ValorAtributo__Alternatives_1 )* ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1451:1: ( ( ( rule__ValorAtributo__Alternatives_1 ) ) ( ( rule__ValorAtributo__Alternatives_1 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1452:1: ( ( rule__ValorAtributo__Alternatives_1 ) ) ( ( rule__ValorAtributo__Alternatives_1 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1452:1: ( ( rule__ValorAtributo__Alternatives_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1453:1: ( rule__ValorAtributo__Alternatives_1 )
            {
             before(grammarAccess.getValorAtributoAccess().getAlternatives_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1454:1: ( rule__ValorAtributo__Alternatives_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1454:2: rule__ValorAtributo__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ValorAtributo__Alternatives_1_in_rule__ValorAtributo__Group__1__Impl2960);
            rule__ValorAtributo__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getValorAtributoAccess().getAlternatives_1()); 

            }

            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1457:1: ( ( rule__ValorAtributo__Alternatives_1 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1458:1: ( rule__ValorAtributo__Alternatives_1 )*
            {
             before(grammarAccess.getValorAtributoAccess().getAlternatives_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1459:1: ( rule__ValorAtributo__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_NUMBER)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1459:2: rule__ValorAtributo__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__ValorAtributo__Alternatives_1_in_rule__ValorAtributo__Group__1__Impl2972);
            	    rule__ValorAtributo__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1474:1: rule__ValorAtributoValor__Group__0 : rule__ValorAtributoValor__Group__0__Impl rule__ValorAtributoValor__Group__1 ;
    public final void rule__ValorAtributoValor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1478:1: ( rule__ValorAtributoValor__Group__0__Impl rule__ValorAtributoValor__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1479:2: rule__ValorAtributoValor__Group__0__Impl rule__ValorAtributoValor__Group__1
            {
            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__0__Impl_in_rule__ValorAtributoValor__Group__03009);
            rule__ValorAtributoValor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__1_in_rule__ValorAtributoValor__Group__03012);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1486:1: rule__ValorAtributoValor__Group__0__Impl : ( () ) ;
    public final void rule__ValorAtributoValor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1490:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1491:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1491:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1492:1: ()
            {
             before(grammarAccess.getValorAtributoValorAccess().getValorAtributoValorAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1493:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1495:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1505:1: rule__ValorAtributoValor__Group__1 : rule__ValorAtributoValor__Group__1__Impl rule__ValorAtributoValor__Group__2 ;
    public final void rule__ValorAtributoValor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1509:1: ( rule__ValorAtributoValor__Group__1__Impl rule__ValorAtributoValor__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1510:2: rule__ValorAtributoValor__Group__1__Impl rule__ValorAtributoValor__Group__2
            {
            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__1__Impl_in_rule__ValorAtributoValor__Group__13070);
            rule__ValorAtributoValor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__2_in_rule__ValorAtributoValor__Group__13073);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1517:1: rule__ValorAtributoValor__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__ValorAtributoValor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1521:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1522:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1522:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1523:1: RULE_ID
            {
             before(grammarAccess.getValorAtributoValorAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValorAtributoValor__Group__1__Impl3100); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1534:1: rule__ValorAtributoValor__Group__2 : rule__ValorAtributoValor__Group__2__Impl rule__ValorAtributoValor__Group__3 ;
    public final void rule__ValorAtributoValor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1538:1: ( rule__ValorAtributoValor__Group__2__Impl rule__ValorAtributoValor__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1539:2: rule__ValorAtributoValor__Group__2__Impl rule__ValorAtributoValor__Group__3
            {
            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__2__Impl_in_rule__ValorAtributoValor__Group__23129);
            rule__ValorAtributoValor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__3_in_rule__ValorAtributoValor__Group__23132);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1546:1: rule__ValorAtributoValor__Group__2__Impl : ( '=' ) ;
    public final void rule__ValorAtributoValor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1550:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1551:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1551:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1552:1: '='
            {
             before(grammarAccess.getValorAtributoValorAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__ValorAtributoValor__Group__2__Impl3160); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1565:1: rule__ValorAtributoValor__Group__3 : rule__ValorAtributoValor__Group__3__Impl ;
    public final void rule__ValorAtributoValor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1569:1: ( rule__ValorAtributoValor__Group__3__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1570:2: rule__ValorAtributoValor__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ValorAtributoValor__Group__3__Impl_in_rule__ValorAtributoValor__Group__33191);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1576:1: rule__ValorAtributoValor__Group__3__Impl : ( RULE_NUMBER ) ;
    public final void rule__ValorAtributoValor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1580:1: ( ( RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1581:1: ( RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1581:1: ( RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1582:1: RULE_NUMBER
            {
             before(grammarAccess.getValorAtributoValorAccess().getNUMBERTerminalRuleCall_3()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__ValorAtributoValor__Group__3__Impl3218); 
             after(grammarAccess.getValorAtributoValorAccess().getNUMBERTerminalRuleCall_3()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1601:1: rule__ListaInteger__Group__0 : rule__ListaInteger__Group__0__Impl rule__ListaInteger__Group__1 ;
    public final void rule__ListaInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1605:1: ( rule__ListaInteger__Group__0__Impl rule__ListaInteger__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1606:2: rule__ListaInteger__Group__0__Impl rule__ListaInteger__Group__1
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__0__Impl_in_rule__ListaInteger__Group__03255);
            rule__ListaInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__1_in_rule__ListaInteger__Group__03258);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1613:1: rule__ListaInteger__Group__0__Impl : ( () ) ;
    public final void rule__ListaInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1617:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1618:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1618:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1619:1: ()
            {
             before(grammarAccess.getListaIntegerAccess().getListaIntegerAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1620:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1622:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1632:1: rule__ListaInteger__Group__1 : rule__ListaInteger__Group__1__Impl rule__ListaInteger__Group__2 ;
    public final void rule__ListaInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1636:1: ( rule__ListaInteger__Group__1__Impl rule__ListaInteger__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1637:2: rule__ListaInteger__Group__1__Impl rule__ListaInteger__Group__2
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__1__Impl_in_rule__ListaInteger__Group__13316);
            rule__ListaInteger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__2_in_rule__ListaInteger__Group__13319);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1644:1: rule__ListaInteger__Group__1__Impl : ( 'List of Integer' ) ;
    public final void rule__ListaInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1648:1: ( ( 'List of Integer' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1649:1: ( 'List of Integer' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1649:1: ( 'List of Integer' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1650:1: 'List of Integer'
            {
             before(grammarAccess.getListaIntegerAccess().getListOfIntegerKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__ListaInteger__Group__1__Impl3347); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1663:1: rule__ListaInteger__Group__2 : rule__ListaInteger__Group__2__Impl rule__ListaInteger__Group__3 ;
    public final void rule__ListaInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1667:1: ( rule__ListaInteger__Group__2__Impl rule__ListaInteger__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1668:2: rule__ListaInteger__Group__2__Impl rule__ListaInteger__Group__3
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__2__Impl_in_rule__ListaInteger__Group__23378);
            rule__ListaInteger__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__3_in_rule__ListaInteger__Group__23381);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1675:1: rule__ListaInteger__Group__2__Impl : ( '=' ) ;
    public final void rule__ListaInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1679:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1680:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1680:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1681:1: '='
            {
             before(grammarAccess.getListaIntegerAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__ListaInteger__Group__2__Impl3409); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1694:1: rule__ListaInteger__Group__3 : rule__ListaInteger__Group__3__Impl rule__ListaInteger__Group__4 ;
    public final void rule__ListaInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1698:1: ( rule__ListaInteger__Group__3__Impl rule__ListaInteger__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1699:2: rule__ListaInteger__Group__3__Impl rule__ListaInteger__Group__4
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__3__Impl_in_rule__ListaInteger__Group__33440);
            rule__ListaInteger__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__4_in_rule__ListaInteger__Group__33443);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1706:1: rule__ListaInteger__Group__3__Impl : ( '{' ) ;
    public final void rule__ListaInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1710:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1711:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1711:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1712:1: '{'
            {
             before(grammarAccess.getListaIntegerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__ListaInteger__Group__3__Impl3471); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1725:1: rule__ListaInteger__Group__4 : rule__ListaInteger__Group__4__Impl rule__ListaInteger__Group__5 ;
    public final void rule__ListaInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1729:1: ( rule__ListaInteger__Group__4__Impl rule__ListaInteger__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1730:2: rule__ListaInteger__Group__4__Impl rule__ListaInteger__Group__5
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__4__Impl_in_rule__ListaInteger__Group__43502);
            rule__ListaInteger__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__5_in_rule__ListaInteger__Group__43505);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1737:1: rule__ListaInteger__Group__4__Impl : ( ( rule__ListaInteger__ValoresAssignment_4 ) ) ;
    public final void rule__ListaInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1741:1: ( ( ( rule__ListaInteger__ValoresAssignment_4 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1742:1: ( ( rule__ListaInteger__ValoresAssignment_4 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1742:1: ( ( rule__ListaInteger__ValoresAssignment_4 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1743:1: ( rule__ListaInteger__ValoresAssignment_4 )
            {
             before(grammarAccess.getListaIntegerAccess().getValoresAssignment_4()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1744:1: ( rule__ListaInteger__ValoresAssignment_4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1744:2: rule__ListaInteger__ValoresAssignment_4
            {
            pushFollow(FOLLOW_rule__ListaInteger__ValoresAssignment_4_in_rule__ListaInteger__Group__4__Impl3532);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1754:1: rule__ListaInteger__Group__5 : rule__ListaInteger__Group__5__Impl rule__ListaInteger__Group__6 ;
    public final void rule__ListaInteger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1758:1: ( rule__ListaInteger__Group__5__Impl rule__ListaInteger__Group__6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1759:2: rule__ListaInteger__Group__5__Impl rule__ListaInteger__Group__6
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__5__Impl_in_rule__ListaInteger__Group__53562);
            rule__ListaInteger__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__6_in_rule__ListaInteger__Group__53565);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1766:1: rule__ListaInteger__Group__5__Impl : ( ( rule__ListaInteger__Group_5__0 )* ) ;
    public final void rule__ListaInteger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1770:1: ( ( ( rule__ListaInteger__Group_5__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1771:1: ( ( rule__ListaInteger__Group_5__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1771:1: ( ( rule__ListaInteger__Group_5__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1772:1: ( rule__ListaInteger__Group_5__0 )*
            {
             before(grammarAccess.getListaIntegerAccess().getGroup_5()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1773:1: ( rule__ListaInteger__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1773:2: rule__ListaInteger__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ListaInteger__Group_5__0_in_rule__ListaInteger__Group__5__Impl3592);
            	    rule__ListaInteger__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1783:1: rule__ListaInteger__Group__6 : rule__ListaInteger__Group__6__Impl ;
    public final void rule__ListaInteger__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1787:1: ( rule__ListaInteger__Group__6__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1788:2: rule__ListaInteger__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__6__Impl_in_rule__ListaInteger__Group__63623);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1794:1: rule__ListaInteger__Group__6__Impl : ( '}' ) ;
    public final void rule__ListaInteger__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1798:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1799:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1799:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1800:1: '}'
            {
             before(grammarAccess.getListaIntegerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__ListaInteger__Group__6__Impl3651); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1827:1: rule__ListaInteger__Group_5__0 : rule__ListaInteger__Group_5__0__Impl rule__ListaInteger__Group_5__1 ;
    public final void rule__ListaInteger__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1831:1: ( rule__ListaInteger__Group_5__0__Impl rule__ListaInteger__Group_5__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1832:2: rule__ListaInteger__Group_5__0__Impl rule__ListaInteger__Group_5__1
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group_5__0__Impl_in_rule__ListaInteger__Group_5__03696);
            rule__ListaInteger__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group_5__1_in_rule__ListaInteger__Group_5__03699);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1839:1: rule__ListaInteger__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ListaInteger__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1843:1: ( ( ',' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1844:1: ( ',' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1844:1: ( ',' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1845:1: ','
            {
             before(grammarAccess.getListaIntegerAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_18_in_rule__ListaInteger__Group_5__0__Impl3727); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1858:1: rule__ListaInteger__Group_5__1 : rule__ListaInteger__Group_5__1__Impl ;
    public final void rule__ListaInteger__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1862:1: ( rule__ListaInteger__Group_5__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1863:2: rule__ListaInteger__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group_5__1__Impl_in_rule__ListaInteger__Group_5__13758);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1869:1: rule__ListaInteger__Group_5__1__Impl : ( RULE_NUMBER ) ;
    public final void rule__ListaInteger__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1873:1: ( ( RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1874:1: ( RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1874:1: ( RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1875:1: RULE_NUMBER
            {
             before(grammarAccess.getListaIntegerAccess().getNUMBERTerminalRuleCall_5_1()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__ListaInteger__Group_5__1__Impl3785); 
             after(grammarAccess.getListaIntegerAccess().getNUMBERTerminalRuleCall_5_1()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1890:1: rule__ListaString__Group__0 : rule__ListaString__Group__0__Impl rule__ListaString__Group__1 ;
    public final void rule__ListaString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1894:1: ( rule__ListaString__Group__0__Impl rule__ListaString__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1895:2: rule__ListaString__Group__0__Impl rule__ListaString__Group__1
            {
            pushFollow(FOLLOW_rule__ListaString__Group__0__Impl_in_rule__ListaString__Group__03818);
            rule__ListaString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__1_in_rule__ListaString__Group__03821);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1902:1: rule__ListaString__Group__0__Impl : ( () ) ;
    public final void rule__ListaString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1906:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1907:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1907:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1908:1: ()
            {
             before(grammarAccess.getListaStringAccess().getListaStringAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1909:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1911:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1921:1: rule__ListaString__Group__1 : rule__ListaString__Group__1__Impl rule__ListaString__Group__2 ;
    public final void rule__ListaString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1925:1: ( rule__ListaString__Group__1__Impl rule__ListaString__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1926:2: rule__ListaString__Group__1__Impl rule__ListaString__Group__2
            {
            pushFollow(FOLLOW_rule__ListaString__Group__1__Impl_in_rule__ListaString__Group__13879);
            rule__ListaString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__2_in_rule__ListaString__Group__13882);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1933:1: rule__ListaString__Group__1__Impl : ( 'List of String' ) ;
    public final void rule__ListaString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1937:1: ( ( 'List of String' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1938:1: ( 'List of String' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1938:1: ( 'List of String' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1939:1: 'List of String'
            {
             before(grammarAccess.getListaStringAccess().getListOfStringKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ListaString__Group__1__Impl3910); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1952:1: rule__ListaString__Group__2 : rule__ListaString__Group__2__Impl rule__ListaString__Group__3 ;
    public final void rule__ListaString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1956:1: ( rule__ListaString__Group__2__Impl rule__ListaString__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1957:2: rule__ListaString__Group__2__Impl rule__ListaString__Group__3
            {
            pushFollow(FOLLOW_rule__ListaString__Group__2__Impl_in_rule__ListaString__Group__23941);
            rule__ListaString__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__3_in_rule__ListaString__Group__23944);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1964:1: rule__ListaString__Group__2__Impl : ( '=' ) ;
    public final void rule__ListaString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1968:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1969:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1969:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1970:1: '='
            {
             before(grammarAccess.getListaStringAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__ListaString__Group__2__Impl3972); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1983:1: rule__ListaString__Group__3 : rule__ListaString__Group__3__Impl rule__ListaString__Group__4 ;
    public final void rule__ListaString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1987:1: ( rule__ListaString__Group__3__Impl rule__ListaString__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1988:2: rule__ListaString__Group__3__Impl rule__ListaString__Group__4
            {
            pushFollow(FOLLOW_rule__ListaString__Group__3__Impl_in_rule__ListaString__Group__34003);
            rule__ListaString__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__4_in_rule__ListaString__Group__34006);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1995:1: rule__ListaString__Group__3__Impl : ( '{' ) ;
    public final void rule__ListaString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1999:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2000:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2000:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2001:1: '{'
            {
             before(grammarAccess.getListaStringAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__ListaString__Group__3__Impl4034); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2014:1: rule__ListaString__Group__4 : rule__ListaString__Group__4__Impl rule__ListaString__Group__5 ;
    public final void rule__ListaString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2018:1: ( rule__ListaString__Group__4__Impl rule__ListaString__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2019:2: rule__ListaString__Group__4__Impl rule__ListaString__Group__5
            {
            pushFollow(FOLLOW_rule__ListaString__Group__4__Impl_in_rule__ListaString__Group__44065);
            rule__ListaString__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__5_in_rule__ListaString__Group__44068);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2026:1: rule__ListaString__Group__4__Impl : ( ( rule__ListaString__ValoresAssignment_4 ) ) ;
    public final void rule__ListaString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2030:1: ( ( ( rule__ListaString__ValoresAssignment_4 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2031:1: ( ( rule__ListaString__ValoresAssignment_4 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2031:1: ( ( rule__ListaString__ValoresAssignment_4 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2032:1: ( rule__ListaString__ValoresAssignment_4 )
            {
             before(grammarAccess.getListaStringAccess().getValoresAssignment_4()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2033:1: ( rule__ListaString__ValoresAssignment_4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2033:2: rule__ListaString__ValoresAssignment_4
            {
            pushFollow(FOLLOW_rule__ListaString__ValoresAssignment_4_in_rule__ListaString__Group__4__Impl4095);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2043:1: rule__ListaString__Group__5 : rule__ListaString__Group__5__Impl rule__ListaString__Group__6 ;
    public final void rule__ListaString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2047:1: ( rule__ListaString__Group__5__Impl rule__ListaString__Group__6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2048:2: rule__ListaString__Group__5__Impl rule__ListaString__Group__6
            {
            pushFollow(FOLLOW_rule__ListaString__Group__5__Impl_in_rule__ListaString__Group__54125);
            rule__ListaString__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__6_in_rule__ListaString__Group__54128);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2055:1: rule__ListaString__Group__5__Impl : ( ( rule__ListaString__Group_5__0 )* ) ;
    public final void rule__ListaString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2059:1: ( ( ( rule__ListaString__Group_5__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2060:1: ( ( rule__ListaString__Group_5__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2060:1: ( ( rule__ListaString__Group_5__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2061:1: ( rule__ListaString__Group_5__0 )*
            {
             before(grammarAccess.getListaStringAccess().getGroup_5()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2062:1: ( rule__ListaString__Group_5__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2062:2: rule__ListaString__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ListaString__Group_5__0_in_rule__ListaString__Group__5__Impl4155);
            	    rule__ListaString__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2072:1: rule__ListaString__Group__6 : rule__ListaString__Group__6__Impl ;
    public final void rule__ListaString__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2076:1: ( rule__ListaString__Group__6__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2077:2: rule__ListaString__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ListaString__Group__6__Impl_in_rule__ListaString__Group__64186);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2083:1: rule__ListaString__Group__6__Impl : ( '}' ) ;
    public final void rule__ListaString__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2087:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2088:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2088:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2089:1: '}'
            {
             before(grammarAccess.getListaStringAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__ListaString__Group__6__Impl4214); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2116:1: rule__ListaString__Group_5__0 : rule__ListaString__Group_5__0__Impl rule__ListaString__Group_5__1 ;
    public final void rule__ListaString__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2120:1: ( rule__ListaString__Group_5__0__Impl rule__ListaString__Group_5__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2121:2: rule__ListaString__Group_5__0__Impl rule__ListaString__Group_5__1
            {
            pushFollow(FOLLOW_rule__ListaString__Group_5__0__Impl_in_rule__ListaString__Group_5__04259);
            rule__ListaString__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group_5__1_in_rule__ListaString__Group_5__04262);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2128:1: rule__ListaString__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ListaString__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2132:1: ( ( ',' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2133:1: ( ',' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2133:1: ( ',' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2134:1: ','
            {
             before(grammarAccess.getListaStringAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_18_in_rule__ListaString__Group_5__0__Impl4290); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2147:1: rule__ListaString__Group_5__1 : rule__ListaString__Group_5__1__Impl ;
    public final void rule__ListaString__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2151:1: ( rule__ListaString__Group_5__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2152:2: rule__ListaString__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ListaString__Group_5__1__Impl_in_rule__ListaString__Group_5__14321);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2158:1: rule__ListaString__Group_5__1__Impl : ( RULE_STRING ) ;
    public final void rule__ListaString__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2162:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2163:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2163:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2164:1: RULE_STRING
            {
             before(grammarAccess.getListaStringAccess().getSTRINGTerminalRuleCall_5_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListaString__Group_5__1__Impl4348); 
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


    // $ANTLR start "rule__Definition__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2180:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2184:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2185:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__04382);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__04385);
            rule__Definition__Group__1();

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
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2192:1: rule__Definition__Group__0__Impl : ( 'def' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2196:1: ( ( 'def' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2197:1: ( 'def' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2197:1: ( 'def' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2198:1: 'def'
            {
             before(grammarAccess.getDefinitionAccess().getDefKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Definition__Group__0__Impl4413); 
             after(grammarAccess.getDefinitionAccess().getDefKeyword_0()); 

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
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2211:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2215:1: ( rule__Definition__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2216:2: rule__Definition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__14444);
            rule__Definition__Group__1__Impl();

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
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2222:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__NameAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2226:1: ( ( ( rule__Definition__NameAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2227:1: ( ( rule__Definition__NameAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2227:1: ( ( rule__Definition__NameAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2228:1: ( rule__Definition__NameAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2229:1: ( rule__Definition__NameAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2229:2: rule__Definition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl4471);
            rule__Definition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Evaluation__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2243:1: rule__Evaluation__Group__0 : rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 ;
    public final void rule__Evaluation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2247:1: ( rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2248:2: rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__04505);
            rule__Evaluation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__04508);
            rule__Evaluation__Group__1();

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
    // $ANTLR end "rule__Evaluation__Group__0"


    // $ANTLR start "rule__Evaluation__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2255:1: rule__Evaluation__Group__0__Impl : ( ( rule__Evaluation__ExpressionAssignment_0 ) ) ;
    public final void rule__Evaluation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2259:1: ( ( ( rule__Evaluation__ExpressionAssignment_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2260:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2260:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2261:1: ( rule__Evaluation__ExpressionAssignment_0 )
            {
             before(grammarAccess.getEvaluationAccess().getExpressionAssignment_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2262:1: ( rule__Evaluation__ExpressionAssignment_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2262:2: rule__Evaluation__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__Evaluation__ExpressionAssignment_0_in_rule__Evaluation__Group__0__Impl4535);
            rule__Evaluation__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getExpressionAssignment_0()); 

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
    // $ANTLR end "rule__Evaluation__Group__0__Impl"


    // $ANTLR start "rule__Evaluation__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2272:1: rule__Evaluation__Group__1 : rule__Evaluation__Group__1__Impl ;
    public final void rule__Evaluation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2276:1: ( rule__Evaluation__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2277:2: rule__Evaluation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__14565);
            rule__Evaluation__Group__1__Impl();

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
    // $ANTLR end "rule__Evaluation__Group__1"


    // $ANTLR start "rule__Evaluation__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2283:1: rule__Evaluation__Group__1__Impl : ( ';' ) ;
    public final void rule__Evaluation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2287:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2288:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2288:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2289:1: ';'
            {
             before(grammarAccess.getEvaluationAccess().getSemicolonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Evaluation__Group__1__Impl4593); 
             after(grammarAccess.getEvaluationAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Evaluation__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2306:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2310:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2311:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04628);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04631);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2318:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2322:1: ( ( ruleMultiplication ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2323:1: ( ruleMultiplication )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2323:1: ( ruleMultiplication )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2324:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4658);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2335:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2339:1: ( rule__Addition__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2340:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__14687);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2346:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2350:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2351:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2351:1: ( ( rule__Addition__Group_1__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2352:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2353:1: ( rule__Addition__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=21 && LA16_0<=22)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2353:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl4714);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2367:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2371:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2372:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__04749);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__04752);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2379:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2383:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2384:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2384:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2385:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2386:1: ( rule__Addition__Alternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2386:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl4779);
            rule__Addition__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2396:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2400:1: ( rule__Addition__Group_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2401:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__14809);
            rule__Addition__Group_1__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2407:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2411:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2412:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2412:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2413:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2414:1: ( rule__Addition__RightAssignment_1_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2414:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl4836);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2428:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2432:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2433:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__04870);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__04873);
            rule__Addition__Group_1_0_0__1();

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
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2440:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2444:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2445:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2445:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2446:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2447:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2449:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2459:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2463:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2464:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__14931);
            rule__Addition__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2470:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2474:1: ( ( '+' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2475:1: ( '+' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2475:1: ( '+' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2476:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,21,FOLLOW_21_in_rule__Addition__Group_1_0_0__1__Impl4959); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2493:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2497:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2498:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__04994);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__04997);
            rule__Addition__Group_1_0_1__1();

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
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2505:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2509:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2510:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2510:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2511:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2512:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2514:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2524:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2528:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2529:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15055);
            rule__Addition__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2535:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2539:1: ( ( '-' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2540:1: ( '-' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2540:1: ( '-' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2541:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,22,FOLLOW_22_in_rule__Addition__Group_1_0_1__1__Impl5083); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2558:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2562:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2563:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05118);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05121);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2570:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2574:1: ( ( rulePrimaryExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2575:1: ( rulePrimaryExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2575:1: ( rulePrimaryExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2576:1: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl5148);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2587:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2591:1: ( rule__Multiplication__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2592:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15177);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2598:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2602:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2603:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2603:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2604:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2605:1: ( rule__Multiplication__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=23 && LA17_0<=24)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2605:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5204);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2619:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2623:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2624:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05239);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05242);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2631:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2635:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2636:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2636:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2637:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2638:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2638:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl5269);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2648:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2652:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2653:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15299);
            rule__Multiplication__Group_1__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2659:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2663:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2664:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2664:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2665:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2666:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2666:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5326);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2680:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2684:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2685:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__05360);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__05363);
            rule__Multiplication__Group_1_0_0__1();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2692:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2696:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2697:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2697:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2698:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2699:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2701:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2711:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2715:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2716:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__15421);
            rule__Multiplication__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2722:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2726:1: ( ( '*' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2727:1: ( '*' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2727:1: ( '*' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2728:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,23,FOLLOW_23_in_rule__Multiplication__Group_1_0_0__1__Impl5449); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2745:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2749:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2750:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__05484);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__05487);
            rule__Multiplication__Group_1_0_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2757:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2761:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2762:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2762:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2763:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2764:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2766:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2776:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2780:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2781:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__15545);
            rule__Multiplication__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2787:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2791:1: ( ( '/' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2792:1: ( '/' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2792:1: ( '/' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2793:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,24,FOLLOW_24_in_rule__Multiplication__Group_1_0_1__1__Impl5573); 
             after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2810:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2814:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2815:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__05608);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__05611);
            rule__PrimaryExpression__Group_0__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2822:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2826:1: ( ( '(' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2827:1: ( '(' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2827:1: ( '(' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2828:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__PrimaryExpression__Group_0__0__Impl5639); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2841:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2845:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2846:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__15670);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__15673);
            rule__PrimaryExpression__Group_0__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2853:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2857:1: ( ( ruleExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2858:1: ( ruleExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2858:1: ( ruleExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2859:1: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl5700);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2870:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2874:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2875:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__25729);
            rule__PrimaryExpression__Group_0__2__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2881:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2885:1: ( ( ')' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2886:1: ( ')' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2886:1: ( ')' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2887:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,26,FOLLOW_26_in_rule__PrimaryExpression__Group_0__2__Impl5757); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2906:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2910:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2911:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__05794);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__05797);
            rule__PrimaryExpression__Group_1__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2918:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2922:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2923:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2923:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2924:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2925:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2927:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2937:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2941:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2942:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__15855);
            rule__PrimaryExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2948:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2952:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2953:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2953:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2954:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2955:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2955:2: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl5882);
            rule__PrimaryExpression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2969:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2973:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2974:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__05916);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__05919);
            rule__PrimaryExpression__Group_2__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2981:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2985:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2986:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2986:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2987:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getSTRINGAction_2_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2988:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2990:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getSTRINGAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3000:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3004:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3005:2: rule__PrimaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__15977);
            rule__PrimaryExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3011:1: rule__PrimaryExpression__Group_2__1__Impl : ( RULE_STRING ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3015:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3016:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3016:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3017:1: RULE_STRING
            {
             before(grammarAccess.getPrimaryExpressionAccess().getSTRINGTerminalRuleCall_2_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PrimaryExpression__Group_2__1__Impl6004); 
             after(grammarAccess.getPrimaryExpressionAccess().getSTRINGTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3032:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3036:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3037:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__06037);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__06040);
            rule__PrimaryExpression__Group_3__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__0"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3044:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3048:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3049:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3049:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3050:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIDAction_3_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3051:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3053:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getIDAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3063:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3067:1: ( rule__PrimaryExpression__Group_3__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3068:2: rule__PrimaryExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__16098);
            rule__PrimaryExpression__Group_3__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__1"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3074:1: rule__PrimaryExpression__Group_3__1__Impl : ( RULE_ID ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3078:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3079:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3079:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3080:1: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIDTerminalRuleCall_3_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__Group_3__1__Impl6125); 
             after(grammarAccess.getPrimaryExpressionAccess().getIDTerminalRuleCall_3_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__Modelo__ObjetosAssignment_3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3096:1: rule__Modelo__ObjetosAssignment_3 : ( ruleObjeto ) ;
    public final void rule__Modelo__ObjetosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3100:1: ( ( ruleObjeto ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3101:1: ( ruleObjeto )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3101:1: ( ruleObjeto )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3102:1: ruleObjeto
            {
             before(grammarAccess.getModeloAccess().getObjetosObjetoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleObjeto_in_rule__Modelo__ObjetosAssignment_36163);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3111:1: rule__Objeto__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Objeto__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3115:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3116:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3116:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3117:1: RULE_ID
            {
             before(grammarAccess.getObjetoAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Objeto__NameAssignment_06194); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3126:1: rule__Objeto__DescripcionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Objeto__DescripcionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3130:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3131:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3131:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3132:1: RULE_STRING
            {
             before(grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Objeto__DescripcionAssignment_16225); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3141:1: rule__Objeto__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__Objeto__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3145:1: ( ( ruleAtributo ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3146:1: ( ruleAtributo )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3146:1: ( ruleAtributo )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3147:1: ruleAtributo
            {
             before(grammarAccess.getObjetoAccess().getAtributosAtributoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAtributo_in_rule__Objeto__AtributosAssignment_36256);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3156:1: rule__AtributoNormal__NombreAssignment_1 : ( ( rule__AtributoNormal__NombreAlternatives_1_0 ) ) ;
    public final void rule__AtributoNormal__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3160:1: ( ( ( rule__AtributoNormal__NombreAlternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3161:1: ( ( rule__AtributoNormal__NombreAlternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3161:1: ( ( rule__AtributoNormal__NombreAlternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3162:1: ( rule__AtributoNormal__NombreAlternatives_1_0 )
            {
             before(grammarAccess.getAtributoNormalAccess().getNombreAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3163:1: ( rule__AtributoNormal__NombreAlternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3163:2: rule__AtributoNormal__NombreAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AtributoNormal__NombreAlternatives_1_0_in_rule__AtributoNormal__NombreAssignment_16287);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3172:1: rule__AtributoNormal__ValorAssignment_3 : ( ( rule__AtributoNormal__ValorAlternatives_3_0 ) ) ;
    public final void rule__AtributoNormal__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3176:1: ( ( ( rule__AtributoNormal__ValorAlternatives_3_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3177:1: ( ( rule__AtributoNormal__ValorAlternatives_3_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3177:1: ( ( rule__AtributoNormal__ValorAlternatives_3_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3178:1: ( rule__AtributoNormal__ValorAlternatives_3_0 )
            {
             before(grammarAccess.getAtributoNormalAccess().getValorAlternatives_3_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3179:1: ( rule__AtributoNormal__ValorAlternatives_3_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3179:2: rule__AtributoNormal__ValorAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__AtributoNormal__ValorAlternatives_3_0_in_rule__AtributoNormal__ValorAssignment_36320);
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


    // $ANTLR start "rule__AtributoAsignacion__NombreAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3188:1: rule__AtributoAsignacion__NombreAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtributoAsignacion__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3192:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3193:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3193:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3194:1: RULE_ID
            {
             before(grammarAccess.getAtributoAsignacionAccess().getNombreIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtributoAsignacion__NombreAssignment_16353); 
             after(grammarAccess.getAtributoAsignacionAccess().getNombreIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AtributoAsignacion__NombreAssignment_1"


    // $ANTLR start "rule__AtributoAsignacion__ValorAssignment_3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3203:1: rule__AtributoAsignacion__ValorAssignment_3 : ( ruleStatement ) ;
    public final void rule__AtributoAsignacion__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3207:1: ( ( ruleStatement ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3208:1: ( ruleStatement )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3208:1: ( ruleStatement )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3209:1: ruleStatement
            {
             before(grammarAccess.getAtributoAsignacionAccess().getValorStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__AtributoAsignacion__ValorAssignment_36384);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getAtributoAsignacionAccess().getValorStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AtributoAsignacion__ValorAssignment_3"


    // $ANTLR start "rule__ListaInteger__ValoresAssignment_4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3218:1: rule__ListaInteger__ValoresAssignment_4 : ( RULE_NUMBER ) ;
    public final void rule__ListaInteger__ValoresAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3222:1: ( ( RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3223:1: ( RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3223:1: ( RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3224:1: RULE_NUMBER
            {
             before(grammarAccess.getListaIntegerAccess().getValoresNUMBERTerminalRuleCall_4_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__ListaInteger__ValoresAssignment_46415); 
             after(grammarAccess.getListaIntegerAccess().getValoresNUMBERTerminalRuleCall_4_0()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3233:1: rule__ListaString__ValoresAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ListaString__ValoresAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3237:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3238:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3238:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3239:1: RULE_STRING
            {
             before(grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListaString__ValoresAssignment_46446); 
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


    // $ANTLR start "rule__Definition__NameAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3250:1: rule__Definition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3254:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3255:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3255:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3256:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_16479); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Definition__NameAssignment_1"


    // $ANTLR start "rule__Evaluation__ExpressionAssignment_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3265:1: rule__Evaluation__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__Evaluation__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3269:1: ( ( ruleExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3270:1: ( ruleExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3270:1: ( ruleExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3271:1: ruleExpression
            {
             before(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Evaluation__ExpressionAssignment_06510);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Evaluation__ExpressionAssignment_0"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3280:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3284:1: ( ( ruleMultiplication ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3285:1: ( ruleMultiplication )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3285:1: ( ruleMultiplication )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3286:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_16541);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3295:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3299:1: ( ( rulePrimaryExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3300:1: ( rulePrimaryExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3300:1: ( rulePrimaryExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3301:1: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_16572);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_1_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3310:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3314:1: ( ( RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3315:1: ( RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3315:1: ( RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3316:1: RULE_NUMBER
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__PrimaryExpression__ValueAssignment_1_16603); 
             after(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_1_1"

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
    public static final BitSet FOLLOW_ruleAtributoAsignacion_in_entryRuleAtributoAsignacion241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoAsignacion248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignacion__Group__0_in_ruleAtributoAsignacion274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoObjeto_in_entryRuleAtributoObjeto301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoObjeto308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_ruleAtributoObjeto334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributo367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atributo__Alternatives_in_ruleAtributo393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributo_in_entryRuleValorAtributo420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorAtributo427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__0_in_ruleValorAtributo453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributoValor_in_entryRuleValorAtributoValor482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorAtributoValor489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__0_in_ruleValorAtributoValor515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInteger_in_entryRuleListaInteger542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaInteger549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__0_in_ruleListaInteger575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_entryRuleListaString602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaString609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__0_in_ruleListaString635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLista_in_entryRuleLista662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLista669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lista__Alternatives_in_ruleLista695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtributoNormal__NombreAlternatives_1_01152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AtributoNormal__NombreAlternatives_1_01169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributo_in_rule__AtributoNormal__ValorAlternatives_3_01201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributoValor_in_rule__AtributoNormal__ValorAlternatives_3_01218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLista_in_rule__AtributoNormal__ValorAlternatives_3_01235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoNormal_in_rule__Atributo__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoObjeto_in_rule__Atributo__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoAsignacion_in_rule__Atributo__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValorAtributo__Alternatives_11333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ValorAtributo__Alternatives_11350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__ValorAtributo__Alternatives_11367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInteger_in_rule__Lista__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_rule__Lista__Alternatives1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Statement__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_rule__Statement__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modelo__Group__0__Impl_in_rule__Modelo__Group__01685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Modelo__Group__1_in_rule__Modelo__Group__01688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modelo__Group__1__Impl_in_rule__Modelo__Group__11746 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Modelo__Group__2_in_rule__Modelo__Group__11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Modelo__Group__1__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modelo__Group__2__Impl_in_rule__Modelo__Group__21805 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Modelo__Group__3_in_rule__Modelo__Group__21808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Modelo__Group__2__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modelo__Group__3__Impl_in_rule__Modelo__Group__31867 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Modelo__Group__4_in_rule__Modelo__Group__31870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Modelo__ObjetosAssignment_3_in_rule__Modelo__Group__3__Impl1897 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Modelo__Group__4__Impl_in_rule__Modelo__Group__41928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Modelo__Group__4__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__0__Impl_in_rule__Objeto__Group__01997 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Objeto__Group__1_in_rule__Objeto__Group__02000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__NameAssignment_0_in_rule__Objeto__Group__0__Impl2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__1__Impl_in_rule__Objeto__Group__12057 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_rule__Objeto__Group__2_in_rule__Objeto__Group__12060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__DescripcionAssignment_1_in_rule__Objeto__Group__1__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__2__Impl_in_rule__Objeto__Group__22118 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_rule__Objeto__Group__3_in_rule__Objeto__Group__22121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Objeto__Group__2__Impl2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__3__Impl_in_rule__Objeto__Group__32180 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_rule__Objeto__Group__4_in_rule__Objeto__Group__32183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__AtributosAssignment_3_in_rule__Objeto__Group__3__Impl2210 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Objeto__Group__4__Impl_in_rule__Objeto__Group__42241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Objeto__Group__4__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__0__Impl_in_rule__AtributoNormal__Group__02310 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__1_in_rule__AtributoNormal__Group__02313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__1__Impl_in_rule__AtributoNormal__Group__12371 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__2_in_rule__AtributoNormal__Group__12374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__NombreAssignment_1_in_rule__AtributoNormal__Group__1__Impl2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__2__Impl_in_rule__AtributoNormal__Group__22431 = new BitSet(new long[]{0x00000000000A0070L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__3_in_rule__AtributoNormal__Group__22434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AtributoNormal__Group__2__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__3__Impl_in_rule__AtributoNormal__Group__32493 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__4_in_rule__AtributoNormal__Group__32496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__ValorAssignment_3_in_rule__AtributoNormal__Group__3__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__Group__4__Impl_in_rule__AtributoNormal__Group__42553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AtributoNormal__Group__4__Impl2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignacion__Group__0__Impl_in_rule__AtributoAsignacion__Group__02622 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AtributoAsignacion__Group__1_in_rule__AtributoAsignacion__Group__02625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignacion__Group__1__Impl_in_rule__AtributoAsignacion__Group__12683 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AtributoAsignacion__Group__2_in_rule__AtributoAsignacion__Group__12686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignacion__NombreAssignment_1_in_rule__AtributoAsignacion__Group__1__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignacion__Group__2__Impl_in_rule__AtributoAsignacion__Group__22743 = new BitSet(new long[]{0x0000000002100070L});
    public static final BitSet FOLLOW_rule__AtributoAsignacion__Group__3_in_rule__AtributoAsignacion__Group__22746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AtributoAsignacion__Group__2__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignacion__Group__3__Impl_in_rule__AtributoAsignacion__Group__32805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignacion__ValorAssignment_3_in_rule__AtributoAsignacion__Group__3__Impl2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__0__Impl_in_rule__ValorAtributo__Group__02870 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__1_in_rule__ValorAtributo__Group__02873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__1__Impl_in_rule__ValorAtributo__Group__12931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Alternatives_1_in_rule__ValorAtributo__Group__1__Impl2960 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Alternatives_1_in_rule__ValorAtributo__Group__1__Impl2972 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__0__Impl_in_rule__ValorAtributoValor__Group__03009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__1_in_rule__ValorAtributoValor__Group__03012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__1__Impl_in_rule__ValorAtributoValor__Group__13070 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__2_in_rule__ValorAtributoValor__Group__13073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValorAtributoValor__Group__1__Impl3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__2__Impl_in_rule__ValorAtributoValor__Group__23129 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__3_in_rule__ValorAtributoValor__Group__23132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ValorAtributoValor__Group__2__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributoValor__Group__3__Impl_in_rule__ValorAtributoValor__Group__33191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__ValorAtributoValor__Group__3__Impl3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__0__Impl_in_rule__ListaInteger__Group__03255 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__1_in_rule__ListaInteger__Group__03258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__1__Impl_in_rule__ListaInteger__Group__13316 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__2_in_rule__ListaInteger__Group__13319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ListaInteger__Group__1__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__2__Impl_in_rule__ListaInteger__Group__23378 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__3_in_rule__ListaInteger__Group__23381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ListaInteger__Group__2__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__3__Impl_in_rule__ListaInteger__Group__33440 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__4_in_rule__ListaInteger__Group__33443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ListaInteger__Group__3__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__4__Impl_in_rule__ListaInteger__Group__43502 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__5_in_rule__ListaInteger__Group__43505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__ValoresAssignment_4_in_rule__ListaInteger__Group__4__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__5__Impl_in_rule__ListaInteger__Group__53562 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__6_in_rule__ListaInteger__Group__53565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_5__0_in_rule__ListaInteger__Group__5__Impl3592 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__6__Impl_in_rule__ListaInteger__Group__63623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ListaInteger__Group__6__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_5__0__Impl_in_rule__ListaInteger__Group_5__03696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_5__1_in_rule__ListaInteger__Group_5__03699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ListaInteger__Group_5__0__Impl3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_5__1__Impl_in_rule__ListaInteger__Group_5__13758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__ListaInteger__Group_5__1__Impl3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__0__Impl_in_rule__ListaString__Group__03818 = new BitSet(new long[]{0x00000000000A0070L});
    public static final BitSet FOLLOW_rule__ListaString__Group__1_in_rule__ListaString__Group__03821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__1__Impl_in_rule__ListaString__Group__13879 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__2_in_rule__ListaString__Group__13882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ListaString__Group__1__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__2__Impl_in_rule__ListaString__Group__23941 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__3_in_rule__ListaString__Group__23944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ListaString__Group__2__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__3__Impl_in_rule__ListaString__Group__34003 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListaString__Group__4_in_rule__ListaString__Group__34006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ListaString__Group__3__Impl4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__4__Impl_in_rule__ListaString__Group__44065 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__5_in_rule__ListaString__Group__44068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__ValoresAssignment_4_in_rule__ListaString__Group__4__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__5__Impl_in_rule__ListaString__Group__54125 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__6_in_rule__ListaString__Group__54128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_5__0_in_rule__ListaString__Group__5__Impl4155 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__6__Impl_in_rule__ListaString__Group__64186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ListaString__Group__6__Impl4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_5__0__Impl_in_rule__ListaString__Group_5__04259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListaString__Group_5__1_in_rule__ListaString__Group_5__04262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ListaString__Group_5__0__Impl4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_5__1__Impl_in_rule__ListaString__Group_5__14321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListaString__Group_5__1__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__04382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__04385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Definition__Group__0__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__14444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__04505 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__04508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__ExpressionAssignment_0_in_rule__Evaluation__Group__0__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__14565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Evaluation__Group__1__Impl4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04628 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__14687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl4714 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__04749 = new BitSet(new long[]{0x0000000002100070L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__04752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__14809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__04870 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__04873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__14931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Addition__Group_1_0_0__1__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__04994 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__04997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Addition__Group_1_0_1__1__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05118 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5204 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05239 = new BitSet(new long[]{0x0000000002100070L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__05360 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__05363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__15421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Multiplication__Group_1_0_0__1__Impl5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__05484 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__05487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__15545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Multiplication__Group_1_0_1__1__Impl5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__05608 = new BitSet(new long[]{0x0000000002100070L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__05611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrimaryExpression__Group_0__0__Impl5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__15670 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__15673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__25729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrimaryExpression__Group_0__2__Impl5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__05794 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__05797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__15855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__05916 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__05919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__15977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PrimaryExpression__Group_2__1__Impl6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__06037 = new BitSet(new long[]{0x0000000002100070L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__06040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__16098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__Group_3__1__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_rule__Modelo__ObjetosAssignment_36163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Objeto__NameAssignment_06194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Objeto__DescripcionAssignment_16225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_rule__Objeto__AtributosAssignment_36256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__NombreAlternatives_1_0_in_rule__AtributoNormal__NombreAssignment_16287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoNormal__ValorAlternatives_3_0_in_rule__AtributoNormal__ValorAssignment_36320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtributoAsignacion__NombreAssignment_16353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__AtributoAsignacion__ValorAssignment_36384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__ListaInteger__ValoresAssignment_46415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListaString__ValoresAssignment_46446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_16479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Evaluation__ExpressionAssignment_06510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_16541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_16572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__PrimaryExpression__ValueAssignment_1_16603 = new BitSet(new long[]{0x0000000000000002L});

}