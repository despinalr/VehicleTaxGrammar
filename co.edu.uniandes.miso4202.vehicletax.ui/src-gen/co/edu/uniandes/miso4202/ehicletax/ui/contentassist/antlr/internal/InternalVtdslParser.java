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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_DATATYPE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "':'", "';'", "'='", "','", "'def'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
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
    public static final int RULE_DATATYPE=7;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:76:1: ( rule__Model__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAtributoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:116:1: entryRuleAtributoSimple : ruleAtributoSimple EOF ;
    public final void entryRuleAtributoSimple() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:117:1: ( ruleAtributoSimple EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:118:1: ruleAtributoSimple EOF
            {
             before(grammarAccess.getAtributoSimpleRule()); 
            pushFollow(FOLLOW_ruleAtributoSimple_in_entryRuleAtributoSimple181);
            ruleAtributoSimple();

            state._fsp--;

             after(grammarAccess.getAtributoSimpleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoSimple188); 

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
    // $ANTLR end "entryRuleAtributoSimple"


    // $ANTLR start "ruleAtributoSimple"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:125:1: ruleAtributoSimple : ( ( rule__AtributoSimple__Group__0 ) ) ;
    public final void ruleAtributoSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:129:2: ( ( ( rule__AtributoSimple__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:130:1: ( ( rule__AtributoSimple__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:130:1: ( ( rule__AtributoSimple__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:131:1: ( rule__AtributoSimple__Group__0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:132:1: ( rule__AtributoSimple__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:132:2: rule__AtributoSimple__Group__0
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__0_in_ruleAtributoSimple214);
            rule__AtributoSimple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getGroup()); 

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
    // $ANTLR end "ruleAtributoSimple"


    // $ANTLR start "entryRuleAtributoInicializado"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:144:1: entryRuleAtributoInicializado : ruleAtributoInicializado EOF ;
    public final void entryRuleAtributoInicializado() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:145:1: ( ruleAtributoInicializado EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:146:1: ruleAtributoInicializado EOF
            {
             before(grammarAccess.getAtributoInicializadoRule()); 
            pushFollow(FOLLOW_ruleAtributoInicializado_in_entryRuleAtributoInicializado241);
            ruleAtributoInicializado();

            state._fsp--;

             after(grammarAccess.getAtributoInicializadoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoInicializado248); 

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
    // $ANTLR end "entryRuleAtributoInicializado"


    // $ANTLR start "ruleAtributoInicializado"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:153:1: ruleAtributoInicializado : ( ( rule__AtributoInicializado__Group__0 ) ) ;
    public final void ruleAtributoInicializado() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:157:2: ( ( ( rule__AtributoInicializado__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:158:1: ( ( rule__AtributoInicializado__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:158:1: ( ( rule__AtributoInicializado__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:159:1: ( rule__AtributoInicializado__Group__0 )
            {
             before(grammarAccess.getAtributoInicializadoAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:160:1: ( rule__AtributoInicializado__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:160:2: rule__AtributoInicializado__Group__0
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__0_in_ruleAtributoInicializado274);
            rule__AtributoInicializado__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoInicializadoAccess().getGroup()); 

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
    // $ANTLR end "ruleAtributoInicializado"


    // $ANTLR start "entryRuleAtributoAsignado"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:172:1: entryRuleAtributoAsignado : ruleAtributoAsignado EOF ;
    public final void entryRuleAtributoAsignado() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:173:1: ( ruleAtributoAsignado EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:174:1: ruleAtributoAsignado EOF
            {
             before(grammarAccess.getAtributoAsignadoRule()); 
            pushFollow(FOLLOW_ruleAtributoAsignado_in_entryRuleAtributoAsignado301);
            ruleAtributoAsignado();

            state._fsp--;

             after(grammarAccess.getAtributoAsignadoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoAsignado308); 

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
    // $ANTLR end "entryRuleAtributoAsignado"


    // $ANTLR start "ruleAtributoAsignado"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:181:1: ruleAtributoAsignado : ( ( rule__AtributoAsignado__Group__0 ) ) ;
    public final void ruleAtributoAsignado() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:185:2: ( ( ( rule__AtributoAsignado__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:186:1: ( ( rule__AtributoAsignado__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:186:1: ( ( rule__AtributoAsignado__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:187:1: ( rule__AtributoAsignado__Group__0 )
            {
             before(grammarAccess.getAtributoAsignadoAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:188:1: ( rule__AtributoAsignado__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:188:2: rule__AtributoAsignado__Group__0
            {
            pushFollow(FOLLOW_rule__AtributoAsignado__Group__0_in_ruleAtributoAsignado334);
            rule__AtributoAsignado__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAsignadoAccess().getGroup()); 

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
    // $ANTLR end "ruleAtributoAsignado"


    // $ANTLR start "entryRuleAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:200:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:201:1: ( ruleAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:202:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_ruleAtributo_in_entryRuleAtributo361);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributo368); 

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
            pushFollow(FOLLOW_rule__Atributo__Alternatives_in_ruleAtributo394);
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
            pushFollow(FOLLOW_ruleValorAtributo_in_entryRuleValorAtributo421);
            ruleValorAtributo();

            state._fsp--;

             after(grammarAccess.getValorAtributoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorAtributo428); 

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
            pushFollow(FOLLOW_rule__ValorAtributo__Group__0_in_ruleValorAtributo454);
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


    // $ANTLR start "entryRuleValorCompleto"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:256:1: entryRuleValorCompleto : ruleValorCompleto EOF ;
    public final void entryRuleValorCompleto() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:257:1: ( ruleValorCompleto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:258:1: ruleValorCompleto EOF
            {
             before(grammarAccess.getValorCompletoRule()); 
            pushFollow(FOLLOW_ruleValorCompleto_in_entryRuleValorCompleto481);
            ruleValorCompleto();

            state._fsp--;

             after(grammarAccess.getValorCompletoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorCompleto488); 

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
    // $ANTLR end "entryRuleValorCompleto"


    // $ANTLR start "ruleValorCompleto"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:265:1: ruleValorCompleto : ( ( rule__ValorCompleto__Alternatives ) ) ;
    public final void ruleValorCompleto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:269:2: ( ( ( rule__ValorCompleto__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:270:1: ( ( rule__ValorCompleto__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:270:1: ( ( rule__ValorCompleto__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:271:1: ( rule__ValorCompleto__Alternatives )
            {
             before(grammarAccess.getValorCompletoAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:272:1: ( rule__ValorCompleto__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:272:2: rule__ValorCompleto__Alternatives
            {
            pushFollow(FOLLOW_rule__ValorCompleto__Alternatives_in_ruleValorCompleto514);
            rule__ValorCompleto__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValorCompletoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValorCompleto"


    // $ANTLR start "entryRuleListaInteger"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:286:1: entryRuleListaInteger : ruleListaInteger EOF ;
    public final void entryRuleListaInteger() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:287:1: ( ruleListaInteger EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:288:1: ruleListaInteger EOF
            {
             before(grammarAccess.getListaIntegerRule()); 
            pushFollow(FOLLOW_ruleListaInteger_in_entryRuleListaInteger543);
            ruleListaInteger();

            state._fsp--;

             after(grammarAccess.getListaIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaInteger550); 

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
            pushFollow(FOLLOW_rule__ListaInteger__Group__0_in_ruleListaInteger576);
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
            pushFollow(FOLLOW_ruleListaString_in_entryRuleListaString603);
            ruleListaString();

            state._fsp--;

             after(grammarAccess.getListaStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListaString610); 

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
            pushFollow(FOLLOW_rule__ListaString__Group__0_in_ruleListaString636);
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
            pushFollow(FOLLOW_ruleLista_in_entryRuleLista663);
            ruleLista();

            state._fsp--;

             after(grammarAccess.getListaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLista670); 

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
            pushFollow(FOLLOW_rule__Lista__Alternatives_in_ruleLista696);
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
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement725);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement732); 

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
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement758);
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
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition785);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition792); 

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
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition818);
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
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation845);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getEvaluationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation852); 

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
            pushFollow(FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation878);
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
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression905);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression912); 

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
            pushFollow(FOLLOW_ruleAddition_in_ruleExpression938);
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
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition964);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition971); 

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
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition997);
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
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1024);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1031); 

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
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1057);
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
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1084);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1091); 

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
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1117);
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


    // $ANTLR start "rule__AtributoSimple__NombreAlternatives_1_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:568:1: rule__AtributoSimple__NombreAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__AtributoSimple__NombreAlternatives_1_0() throws RecognitionException {

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
                     before(grammarAccess.getAtributoSimpleAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtributoSimple__NombreAlternatives_1_01153); 
                     after(grammarAccess.getAtributoSimpleAccess().getNombreIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:579:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:579:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:580:1: RULE_STRING
                    {
                     before(grammarAccess.getAtributoSimpleAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AtributoSimple__NombreAlternatives_1_01170); 
                     after(grammarAccess.getAtributoSimpleAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__AtributoSimple__NombreAlternatives_1_0"


    // $ANTLR start "rule__AtributoInicializado__NombreAlternatives_1_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:590:1: rule__AtributoInicializado__NombreAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__AtributoInicializado__NombreAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:594:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:595:1: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:595:1: ( RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:596:1: RULE_ID
                    {
                     before(grammarAccess.getAtributoInicializadoAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtributoInicializado__NombreAlternatives_1_01202); 
                     after(grammarAccess.getAtributoInicializadoAccess().getNombreIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:601:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:601:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:602:1: RULE_STRING
                    {
                     before(grammarAccess.getAtributoInicializadoAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AtributoInicializado__NombreAlternatives_1_01219); 
                     after(grammarAccess.getAtributoInicializadoAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__AtributoInicializado__NombreAlternatives_1_0"


    // $ANTLR start "rule__Atributo__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:612:1: rule__Atributo__Alternatives : ( ( ruleAtributoSimple ) | ( ruleAtributoInicializado ) | ( ruleAtributoAsignado ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:616:1: ( ( ruleAtributoSimple ) | ( ruleAtributoInicializado ) | ( ruleAtributoAsignado ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==15) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==RULE_DATATYPE) ) {
                        int LA3_5 = input.LA(4);

                        if ( (LA3_5==17) ) {
                            alt3=2;
                        }
                        else if ( (LA3_5==16) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==17) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_STRING) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==15) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==RULE_DATATYPE) ) {
                        int LA3_5 = input.LA(4);

                        if ( (LA3_5==17) ) {
                            alt3=2;
                        }
                        else if ( (LA3_5==16) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:617:1: ( ruleAtributoSimple )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:617:1: ( ruleAtributoSimple )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:618:1: ruleAtributoSimple
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtributoSimple_in_rule__Atributo__Alternatives1251);
                    ruleAtributoSimple();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:623:6: ( ruleAtributoInicializado )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:623:6: ( ruleAtributoInicializado )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:624:1: ruleAtributoInicializado
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoInicializadoParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtributoInicializado_in_rule__Atributo__Alternatives1268);
                    ruleAtributoInicializado();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoInicializadoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:629:6: ( ruleAtributoAsignado )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:629:6: ( ruleAtributoAsignado )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:630:1: ruleAtributoAsignado
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoAsignadoParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtributoAsignado_in_rule__Atributo__Alternatives1285);
                    ruleAtributoAsignado();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoAsignadoParserRuleCall_2()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:640:1: rule__ValorAtributo__Alternatives_1 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_NUMBER ) );
    public final void rule__ValorAtributo__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:644:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_NUMBER ) )
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:645:1: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:645:1: ( RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:646:1: RULE_ID
                    {
                     before(grammarAccess.getValorAtributoAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValorAtributo__Alternatives_11317); 
                     after(grammarAccess.getValorAtributoAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:651:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:651:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:652:1: RULE_STRING
                    {
                     before(grammarAccess.getValorAtributoAccess().getSTRINGTerminalRuleCall_1_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ValorAtributo__Alternatives_11334); 
                     after(grammarAccess.getValorAtributoAccess().getSTRINGTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:657:6: ( RULE_NUMBER )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:657:6: ( RULE_NUMBER )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:658:1: RULE_NUMBER
                    {
                     before(grammarAccess.getValorAtributoAccess().getNUMBERTerminalRuleCall_1_2()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__ValorAtributo__Alternatives_11351); 
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


    // $ANTLR start "rule__ValorCompleto__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:668:1: rule__ValorCompleto__Alternatives : ( ( ruleValorAtributo ) | ( ruleLista ) );
    public final void rule__ValorCompleto__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:672:1: ( ( ruleValorAtributo ) | ( ruleLista ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_NUMBER)) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:673:1: ( ruleValorAtributo )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:673:1: ( ruleValorAtributo )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:674:1: ruleValorAtributo
                    {
                     before(grammarAccess.getValorCompletoAccess().getValorAtributoParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleValorAtributo_in_rule__ValorCompleto__Alternatives1383);
                    ruleValorAtributo();

                    state._fsp--;

                     after(grammarAccess.getValorCompletoAccess().getValorAtributoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:679:6: ( ruleLista )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:679:6: ( ruleLista )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:680:1: ruleLista
                    {
                     before(grammarAccess.getValorCompletoAccess().getListaParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLista_in_rule__ValorCompleto__Alternatives1400);
                    ruleLista();

                    state._fsp--;

                     after(grammarAccess.getValorCompletoAccess().getListaParserRuleCall_1()); 

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
    // $ANTLR end "rule__ValorCompleto__Alternatives"


    // $ANTLR start "rule__Lista__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:691:1: rule__Lista__Alternatives : ( ( ruleListaInteger ) | ( ruleListaString ) );
    public final void rule__Lista__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:695:1: ( ( ruleListaInteger ) | ( ruleListaString ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_STRING) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_NUMBER) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:696:1: ( ruleListaInteger )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:696:1: ( ruleListaInteger )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:697:1: ruleListaInteger
                    {
                     before(grammarAccess.getListaAccess().getListaIntegerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleListaInteger_in_rule__Lista__Alternatives1433);
                    ruleListaInteger();

                    state._fsp--;

                     after(grammarAccess.getListaAccess().getListaIntegerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:702:6: ( ruleListaString )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:702:6: ( ruleListaString )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:703:1: ruleListaString
                    {
                     before(grammarAccess.getListaAccess().getListaStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleListaString_in_rule__Lista__Alternatives1450);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:713:1: rule__Statement__Alternatives : ( ( ruleDefinition ) | ( ruleEvaluation ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:717:1: ( ( ruleDefinition ) | ( ruleEvaluation ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_NUMBER)||LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:718:1: ( ruleDefinition )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:718:1: ( ruleDefinition )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:719:1: ruleDefinition
                    {
                     before(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefinition_in_rule__Statement__Alternatives1482);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:724:6: ( ruleEvaluation )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:724:6: ( ruleEvaluation )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:725:1: ruleEvaluation
                    {
                     before(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEvaluation_in_rule__Statement__Alternatives1499);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:735:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:739:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:740:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:740:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:741:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:742:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:742:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01531);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:746:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:746:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:747:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:748:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:748:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01549);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:757:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:761:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:762:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:762:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:763:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:764:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:764:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01582);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:768:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:768:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:769:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:770:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:770:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01600);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:779:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:783:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt10=2;
                }
                break;
            case RULE_STRING:
                {
                alt10=3;
                }
                break;
            case RULE_ID:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:784:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:784:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:785:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:786:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:786:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1633);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:790:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:790:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:791:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:792:1: ( rule__PrimaryExpression__Group_1__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:792:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1651);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:796:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:796:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:797:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:798:1: ( rule__PrimaryExpression__Group_2__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:798:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1669);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:802:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:802:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:803:1: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:804:1: ( rule__PrimaryExpression__Group_3__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:804:2: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives1687);
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


    // $ANTLR start "rule__Model__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:815:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:819:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:820:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01718);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01721);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:827:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:831:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:832:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:832:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:833:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:834:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:836:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:846:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:850:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:851:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11779);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11782);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:858:1: rule__Model__Group__1__Impl : ( ( rule__Model__NombreAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:862:1: ( ( ( rule__Model__NombreAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:863:1: ( ( rule__Model__NombreAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:863:1: ( ( rule__Model__NombreAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:864:1: ( rule__Model__NombreAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNombreAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:865:1: ( rule__Model__NombreAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:865:2: rule__Model__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NombreAssignment_1_in_rule__Model__Group__1__Impl1809);
            rule__Model__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:875:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:879:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:880:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21839);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21842);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:887:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:891:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:892:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:892:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:893:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group__2__Impl1870); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:906:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:910:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:911:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31901);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31904);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:918:1: rule__Model__Group__3__Impl : ( ( rule__Model__ObjetosAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:922:1: ( ( ( rule__Model__ObjetosAssignment_3 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:923:1: ( ( rule__Model__ObjetosAssignment_3 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:923:1: ( ( rule__Model__ObjetosAssignment_3 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:924:1: ( rule__Model__ObjetosAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getObjetosAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:925:1: ( rule__Model__ObjetosAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:925:2: rule__Model__ObjetosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ObjetosAssignment_3_in_rule__Model__Group__3__Impl1931);
            	    rule__Model__ObjetosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getObjetosAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:935:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:939:1: ( rule__Model__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:940:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41962);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:946:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:950:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:951:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:951:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:952:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Model__Group__4__Impl1990); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Objeto__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:975:1: rule__Objeto__Group__0 : rule__Objeto__Group__0__Impl rule__Objeto__Group__1 ;
    public final void rule__Objeto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:979:1: ( rule__Objeto__Group__0__Impl rule__Objeto__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:980:2: rule__Objeto__Group__0__Impl rule__Objeto__Group__1
            {
            pushFollow(FOLLOW_rule__Objeto__Group__0__Impl_in_rule__Objeto__Group__02031);
            rule__Objeto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__1_in_rule__Objeto__Group__02034);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:987:1: rule__Objeto__Group__0__Impl : ( ( rule__Objeto__NameAssignment_0 ) ) ;
    public final void rule__Objeto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:991:1: ( ( ( rule__Objeto__NameAssignment_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:992:1: ( ( rule__Objeto__NameAssignment_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:992:1: ( ( rule__Objeto__NameAssignment_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:993:1: ( rule__Objeto__NameAssignment_0 )
            {
             before(grammarAccess.getObjetoAccess().getNameAssignment_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:994:1: ( rule__Objeto__NameAssignment_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:994:2: rule__Objeto__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Objeto__NameAssignment_0_in_rule__Objeto__Group__0__Impl2061);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1004:1: rule__Objeto__Group__1 : rule__Objeto__Group__1__Impl rule__Objeto__Group__2 ;
    public final void rule__Objeto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1008:1: ( rule__Objeto__Group__1__Impl rule__Objeto__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1009:2: rule__Objeto__Group__1__Impl rule__Objeto__Group__2
            {
            pushFollow(FOLLOW_rule__Objeto__Group__1__Impl_in_rule__Objeto__Group__12091);
            rule__Objeto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__2_in_rule__Objeto__Group__12094);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1016:1: rule__Objeto__Group__1__Impl : ( ( rule__Objeto__DescripcionAssignment_1 )? ) ;
    public final void rule__Objeto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1020:1: ( ( ( rule__Objeto__DescripcionAssignment_1 )? ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1021:1: ( ( rule__Objeto__DescripcionAssignment_1 )? )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1021:1: ( ( rule__Objeto__DescripcionAssignment_1 )? )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1022:1: ( rule__Objeto__DescripcionAssignment_1 )?
            {
             before(grammarAccess.getObjetoAccess().getDescripcionAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1023:1: ( rule__Objeto__DescripcionAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1023:2: rule__Objeto__DescripcionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Objeto__DescripcionAssignment_1_in_rule__Objeto__Group__1__Impl2121);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1033:1: rule__Objeto__Group__2 : rule__Objeto__Group__2__Impl rule__Objeto__Group__3 ;
    public final void rule__Objeto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1037:1: ( rule__Objeto__Group__2__Impl rule__Objeto__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1038:2: rule__Objeto__Group__2__Impl rule__Objeto__Group__3
            {
            pushFollow(FOLLOW_rule__Objeto__Group__2__Impl_in_rule__Objeto__Group__22152);
            rule__Objeto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__3_in_rule__Objeto__Group__22155);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1045:1: rule__Objeto__Group__2__Impl : ( '{' ) ;
    public final void rule__Objeto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1049:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1050:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1050:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1051:1: '{'
            {
             before(grammarAccess.getObjetoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Objeto__Group__2__Impl2183); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1064:1: rule__Objeto__Group__3 : rule__Objeto__Group__3__Impl rule__Objeto__Group__4 ;
    public final void rule__Objeto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1068:1: ( rule__Objeto__Group__3__Impl rule__Objeto__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1069:2: rule__Objeto__Group__3__Impl rule__Objeto__Group__4
            {
            pushFollow(FOLLOW_rule__Objeto__Group__3__Impl_in_rule__Objeto__Group__32214);
            rule__Objeto__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__4_in_rule__Objeto__Group__32217);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1076:1: rule__Objeto__Group__3__Impl : ( ( rule__Objeto__AtributosAssignment_3 )* ) ;
    public final void rule__Objeto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1080:1: ( ( ( rule__Objeto__AtributosAssignment_3 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1081:1: ( ( rule__Objeto__AtributosAssignment_3 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1081:1: ( ( rule__Objeto__AtributosAssignment_3 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1082:1: ( rule__Objeto__AtributosAssignment_3 )*
            {
             before(grammarAccess.getObjetoAccess().getAtributosAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1083:1: ( rule__Objeto__AtributosAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==15||LA13_1==17) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1083:2: rule__Objeto__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Objeto__AtributosAssignment_3_in_rule__Objeto__Group__3__Impl2244);
            	    rule__Objeto__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1093:1: rule__Objeto__Group__4 : rule__Objeto__Group__4__Impl rule__Objeto__Group__5 ;
    public final void rule__Objeto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1097:1: ( rule__Objeto__Group__4__Impl rule__Objeto__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1098:2: rule__Objeto__Group__4__Impl rule__Objeto__Group__5
            {
            pushFollow(FOLLOW_rule__Objeto__Group__4__Impl_in_rule__Objeto__Group__42275);
            rule__Objeto__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__5_in_rule__Objeto__Group__42278);
            rule__Objeto__Group__5();

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1105:1: rule__Objeto__Group__4__Impl : ( ( rule__Objeto__ObjetosAssignment_4 )* ) ;
    public final void rule__Objeto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1109:1: ( ( ( rule__Objeto__ObjetosAssignment_4 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1110:1: ( ( rule__Objeto__ObjetosAssignment_4 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1110:1: ( ( rule__Objeto__ObjetosAssignment_4 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1111:1: ( rule__Objeto__ObjetosAssignment_4 )*
            {
             before(grammarAccess.getObjetoAccess().getObjetosAssignment_4()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1112:1: ( rule__Objeto__ObjetosAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1112:2: rule__Objeto__ObjetosAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Objeto__ObjetosAssignment_4_in_rule__Objeto__Group__4__Impl2305);
            	    rule__Objeto__ObjetosAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getObjetoAccess().getObjetosAssignment_4()); 

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


    // $ANTLR start "rule__Objeto__Group__5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1122:1: rule__Objeto__Group__5 : rule__Objeto__Group__5__Impl ;
    public final void rule__Objeto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1126:1: ( rule__Objeto__Group__5__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1127:2: rule__Objeto__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Objeto__Group__5__Impl_in_rule__Objeto__Group__52336);
            rule__Objeto__Group__5__Impl();

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
    // $ANTLR end "rule__Objeto__Group__5"


    // $ANTLR start "rule__Objeto__Group__5__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1133:1: rule__Objeto__Group__5__Impl : ( '}' ) ;
    public final void rule__Objeto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1137:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1138:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1138:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1139:1: '}'
            {
             before(grammarAccess.getObjetoAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Objeto__Group__5__Impl2364); 
             after(grammarAccess.getObjetoAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Objeto__Group__5__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1164:1: rule__AtributoSimple__Group__0 : rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 ;
    public final void rule__AtributoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1168:1: ( rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1169:2: rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__0__Impl_in_rule__AtributoSimple__Group__02407);
            rule__AtributoSimple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoSimple__Group__1_in_rule__AtributoSimple__Group__02410);
            rule__AtributoSimple__Group__1();

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
    // $ANTLR end "rule__AtributoSimple__Group__0"


    // $ANTLR start "rule__AtributoSimple__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1176:1: rule__AtributoSimple__Group__0__Impl : ( () ) ;
    public final void rule__AtributoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1180:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1181:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1181:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1182:1: ()
            {
             before(grammarAccess.getAtributoSimpleAccess().getAtributoSimpleAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1183:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1185:1: 
            {
            }

             after(grammarAccess.getAtributoSimpleAccess().getAtributoSimpleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__0__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1195:1: rule__AtributoSimple__Group__1 : rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 ;
    public final void rule__AtributoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1199:1: ( rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1200:2: rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__1__Impl_in_rule__AtributoSimple__Group__12468);
            rule__AtributoSimple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoSimple__Group__2_in_rule__AtributoSimple__Group__12471);
            rule__AtributoSimple__Group__2();

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
    // $ANTLR end "rule__AtributoSimple__Group__1"


    // $ANTLR start "rule__AtributoSimple__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1207:1: rule__AtributoSimple__Group__1__Impl : ( ( rule__AtributoSimple__NombreAssignment_1 ) ) ;
    public final void rule__AtributoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1211:1: ( ( ( rule__AtributoSimple__NombreAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1212:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1212:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1213:1: ( rule__AtributoSimple__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNombreAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1214:1: ( rule__AtributoSimple__NombreAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1214:2: rule__AtributoSimple__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__AtributoSimple__NombreAssignment_1_in_rule__AtributoSimple__Group__1__Impl2498);
            rule__AtributoSimple__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__AtributoSimple__Group__1__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1224:1: rule__AtributoSimple__Group__2 : rule__AtributoSimple__Group__2__Impl rule__AtributoSimple__Group__3 ;
    public final void rule__AtributoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1228:1: ( rule__AtributoSimple__Group__2__Impl rule__AtributoSimple__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1229:2: rule__AtributoSimple__Group__2__Impl rule__AtributoSimple__Group__3
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__2__Impl_in_rule__AtributoSimple__Group__22528);
            rule__AtributoSimple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoSimple__Group__3_in_rule__AtributoSimple__Group__22531);
            rule__AtributoSimple__Group__3();

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
    // $ANTLR end "rule__AtributoSimple__Group__2"


    // $ANTLR start "rule__AtributoSimple__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1236:1: rule__AtributoSimple__Group__2__Impl : ( ':' ) ;
    public final void rule__AtributoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1240:1: ( ( ':' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1241:1: ( ':' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1241:1: ( ':' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1242:1: ':'
            {
             before(grammarAccess.getAtributoSimpleAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__AtributoSimple__Group__2__Impl2559); 
             after(grammarAccess.getAtributoSimpleAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__AtributoSimple__Group__2__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1255:1: rule__AtributoSimple__Group__3 : rule__AtributoSimple__Group__3__Impl rule__AtributoSimple__Group__4 ;
    public final void rule__AtributoSimple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1259:1: ( rule__AtributoSimple__Group__3__Impl rule__AtributoSimple__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1260:2: rule__AtributoSimple__Group__3__Impl rule__AtributoSimple__Group__4
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__3__Impl_in_rule__AtributoSimple__Group__32590);
            rule__AtributoSimple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoSimple__Group__4_in_rule__AtributoSimple__Group__32593);
            rule__AtributoSimple__Group__4();

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
    // $ANTLR end "rule__AtributoSimple__Group__3"


    // $ANTLR start "rule__AtributoSimple__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1267:1: rule__AtributoSimple__Group__3__Impl : ( ( rule__AtributoSimple__TipoAssignment_3 ) ) ;
    public final void rule__AtributoSimple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1271:1: ( ( ( rule__AtributoSimple__TipoAssignment_3 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1272:1: ( ( rule__AtributoSimple__TipoAssignment_3 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1272:1: ( ( rule__AtributoSimple__TipoAssignment_3 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1273:1: ( rule__AtributoSimple__TipoAssignment_3 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1274:1: ( rule__AtributoSimple__TipoAssignment_3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1274:2: rule__AtributoSimple__TipoAssignment_3
            {
            pushFollow(FOLLOW_rule__AtributoSimple__TipoAssignment_3_in_rule__AtributoSimple__Group__3__Impl2620);
            rule__AtributoSimple__TipoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_3()); 

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
    // $ANTLR end "rule__AtributoSimple__Group__3__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1284:1: rule__AtributoSimple__Group__4 : rule__AtributoSimple__Group__4__Impl ;
    public final void rule__AtributoSimple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1288:1: ( rule__AtributoSimple__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1289:2: rule__AtributoSimple__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__4__Impl_in_rule__AtributoSimple__Group__42650);
            rule__AtributoSimple__Group__4__Impl();

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
    // $ANTLR end "rule__AtributoSimple__Group__4"


    // $ANTLR start "rule__AtributoSimple__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1295:1: rule__AtributoSimple__Group__4__Impl : ( ';' ) ;
    public final void rule__AtributoSimple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1299:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1300:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1300:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1301:1: ';'
            {
             before(grammarAccess.getAtributoSimpleAccess().getSemicolonKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__AtributoSimple__Group__4__Impl2678); 
             after(grammarAccess.getAtributoSimpleAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__AtributoSimple__Group__4__Impl"


    // $ANTLR start "rule__AtributoInicializado__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1324:1: rule__AtributoInicializado__Group__0 : rule__AtributoInicializado__Group__0__Impl rule__AtributoInicializado__Group__1 ;
    public final void rule__AtributoInicializado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1328:1: ( rule__AtributoInicializado__Group__0__Impl rule__AtributoInicializado__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1329:2: rule__AtributoInicializado__Group__0__Impl rule__AtributoInicializado__Group__1
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__0__Impl_in_rule__AtributoInicializado__Group__02719);
            rule__AtributoInicializado__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__1_in_rule__AtributoInicializado__Group__02722);
            rule__AtributoInicializado__Group__1();

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
    // $ANTLR end "rule__AtributoInicializado__Group__0"


    // $ANTLR start "rule__AtributoInicializado__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1336:1: rule__AtributoInicializado__Group__0__Impl : ( () ) ;
    public final void rule__AtributoInicializado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1340:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1341:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1341:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1342:1: ()
            {
             before(grammarAccess.getAtributoInicializadoAccess().getAtributoInicializadoAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1343:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1345:1: 
            {
            }

             after(grammarAccess.getAtributoInicializadoAccess().getAtributoInicializadoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoInicializado__Group__0__Impl"


    // $ANTLR start "rule__AtributoInicializado__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1355:1: rule__AtributoInicializado__Group__1 : rule__AtributoInicializado__Group__1__Impl rule__AtributoInicializado__Group__2 ;
    public final void rule__AtributoInicializado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1359:1: ( rule__AtributoInicializado__Group__1__Impl rule__AtributoInicializado__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1360:2: rule__AtributoInicializado__Group__1__Impl rule__AtributoInicializado__Group__2
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__1__Impl_in_rule__AtributoInicializado__Group__12780);
            rule__AtributoInicializado__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__2_in_rule__AtributoInicializado__Group__12783);
            rule__AtributoInicializado__Group__2();

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
    // $ANTLR end "rule__AtributoInicializado__Group__1"


    // $ANTLR start "rule__AtributoInicializado__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1367:1: rule__AtributoInicializado__Group__1__Impl : ( ( rule__AtributoInicializado__NombreAssignment_1 ) ) ;
    public final void rule__AtributoInicializado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1371:1: ( ( ( rule__AtributoInicializado__NombreAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1372:1: ( ( rule__AtributoInicializado__NombreAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1372:1: ( ( rule__AtributoInicializado__NombreAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1373:1: ( rule__AtributoInicializado__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoInicializadoAccess().getNombreAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1374:1: ( rule__AtributoInicializado__NombreAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1374:2: rule__AtributoInicializado__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__NombreAssignment_1_in_rule__AtributoInicializado__Group__1__Impl2810);
            rule__AtributoInicializado__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoInicializadoAccess().getNombreAssignment_1()); 

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
    // $ANTLR end "rule__AtributoInicializado__Group__1__Impl"


    // $ANTLR start "rule__AtributoInicializado__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1384:1: rule__AtributoInicializado__Group__2 : rule__AtributoInicializado__Group__2__Impl rule__AtributoInicializado__Group__3 ;
    public final void rule__AtributoInicializado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1388:1: ( rule__AtributoInicializado__Group__2__Impl rule__AtributoInicializado__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1389:2: rule__AtributoInicializado__Group__2__Impl rule__AtributoInicializado__Group__3
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__2__Impl_in_rule__AtributoInicializado__Group__22840);
            rule__AtributoInicializado__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__3_in_rule__AtributoInicializado__Group__22843);
            rule__AtributoInicializado__Group__3();

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
    // $ANTLR end "rule__AtributoInicializado__Group__2"


    // $ANTLR start "rule__AtributoInicializado__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1396:1: rule__AtributoInicializado__Group__2__Impl : ( ':' ) ;
    public final void rule__AtributoInicializado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1400:1: ( ( ':' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1401:1: ( ':' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1401:1: ( ':' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1402:1: ':'
            {
             before(grammarAccess.getAtributoInicializadoAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__AtributoInicializado__Group__2__Impl2871); 
             after(grammarAccess.getAtributoInicializadoAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__AtributoInicializado__Group__2__Impl"


    // $ANTLR start "rule__AtributoInicializado__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1415:1: rule__AtributoInicializado__Group__3 : rule__AtributoInicializado__Group__3__Impl rule__AtributoInicializado__Group__4 ;
    public final void rule__AtributoInicializado__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1419:1: ( rule__AtributoInicializado__Group__3__Impl rule__AtributoInicializado__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1420:2: rule__AtributoInicializado__Group__3__Impl rule__AtributoInicializado__Group__4
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__3__Impl_in_rule__AtributoInicializado__Group__32902);
            rule__AtributoInicializado__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__4_in_rule__AtributoInicializado__Group__32905);
            rule__AtributoInicializado__Group__4();

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
    // $ANTLR end "rule__AtributoInicializado__Group__3"


    // $ANTLR start "rule__AtributoInicializado__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1427:1: rule__AtributoInicializado__Group__3__Impl : ( ( rule__AtributoInicializado__TipoAssignment_3 ) ) ;
    public final void rule__AtributoInicializado__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1431:1: ( ( ( rule__AtributoInicializado__TipoAssignment_3 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1432:1: ( ( rule__AtributoInicializado__TipoAssignment_3 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1432:1: ( ( rule__AtributoInicializado__TipoAssignment_3 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1433:1: ( rule__AtributoInicializado__TipoAssignment_3 )
            {
             before(grammarAccess.getAtributoInicializadoAccess().getTipoAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1434:1: ( rule__AtributoInicializado__TipoAssignment_3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1434:2: rule__AtributoInicializado__TipoAssignment_3
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__TipoAssignment_3_in_rule__AtributoInicializado__Group__3__Impl2932);
            rule__AtributoInicializado__TipoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtributoInicializadoAccess().getTipoAssignment_3()); 

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
    // $ANTLR end "rule__AtributoInicializado__Group__3__Impl"


    // $ANTLR start "rule__AtributoInicializado__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1444:1: rule__AtributoInicializado__Group__4 : rule__AtributoInicializado__Group__4__Impl rule__AtributoInicializado__Group__5 ;
    public final void rule__AtributoInicializado__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1448:1: ( rule__AtributoInicializado__Group__4__Impl rule__AtributoInicializado__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1449:2: rule__AtributoInicializado__Group__4__Impl rule__AtributoInicializado__Group__5
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__4__Impl_in_rule__AtributoInicializado__Group__42962);
            rule__AtributoInicializado__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__5_in_rule__AtributoInicializado__Group__42965);
            rule__AtributoInicializado__Group__5();

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
    // $ANTLR end "rule__AtributoInicializado__Group__4"


    // $ANTLR start "rule__AtributoInicializado__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1456:1: rule__AtributoInicializado__Group__4__Impl : ( '=' ) ;
    public final void rule__AtributoInicializado__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1460:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1461:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1461:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1462:1: '='
            {
             before(grammarAccess.getAtributoInicializadoAccess().getEqualsSignKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__AtributoInicializado__Group__4__Impl2993); 
             after(grammarAccess.getAtributoInicializadoAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__AtributoInicializado__Group__4__Impl"


    // $ANTLR start "rule__AtributoInicializado__Group__5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1475:1: rule__AtributoInicializado__Group__5 : rule__AtributoInicializado__Group__5__Impl rule__AtributoInicializado__Group__6 ;
    public final void rule__AtributoInicializado__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1479:1: ( rule__AtributoInicializado__Group__5__Impl rule__AtributoInicializado__Group__6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1480:2: rule__AtributoInicializado__Group__5__Impl rule__AtributoInicializado__Group__6
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__5__Impl_in_rule__AtributoInicializado__Group__53024);
            rule__AtributoInicializado__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__6_in_rule__AtributoInicializado__Group__53027);
            rule__AtributoInicializado__Group__6();

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
    // $ANTLR end "rule__AtributoInicializado__Group__5"


    // $ANTLR start "rule__AtributoInicializado__Group__5__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1487:1: rule__AtributoInicializado__Group__5__Impl : ( ( rule__AtributoInicializado__ValorAssignment_5 ) ) ;
    public final void rule__AtributoInicializado__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1491:1: ( ( ( rule__AtributoInicializado__ValorAssignment_5 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1492:1: ( ( rule__AtributoInicializado__ValorAssignment_5 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1492:1: ( ( rule__AtributoInicializado__ValorAssignment_5 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1493:1: ( rule__AtributoInicializado__ValorAssignment_5 )
            {
             before(grammarAccess.getAtributoInicializadoAccess().getValorAssignment_5()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1494:1: ( rule__AtributoInicializado__ValorAssignment_5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1494:2: rule__AtributoInicializado__ValorAssignment_5
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__ValorAssignment_5_in_rule__AtributoInicializado__Group__5__Impl3054);
            rule__AtributoInicializado__ValorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAtributoInicializadoAccess().getValorAssignment_5()); 

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
    // $ANTLR end "rule__AtributoInicializado__Group__5__Impl"


    // $ANTLR start "rule__AtributoInicializado__Group__6"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1504:1: rule__AtributoInicializado__Group__6 : rule__AtributoInicializado__Group__6__Impl ;
    public final void rule__AtributoInicializado__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1508:1: ( rule__AtributoInicializado__Group__6__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1509:2: rule__AtributoInicializado__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__6__Impl_in_rule__AtributoInicializado__Group__63084);
            rule__AtributoInicializado__Group__6__Impl();

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
    // $ANTLR end "rule__AtributoInicializado__Group__6"


    // $ANTLR start "rule__AtributoInicializado__Group__6__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1515:1: rule__AtributoInicializado__Group__6__Impl : ( ';' ) ;
    public final void rule__AtributoInicializado__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1519:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1520:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1520:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1521:1: ';'
            {
             before(grammarAccess.getAtributoInicializadoAccess().getSemicolonKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__AtributoInicializado__Group__6__Impl3112); 
             after(grammarAccess.getAtributoInicializadoAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__AtributoInicializado__Group__6__Impl"


    // $ANTLR start "rule__AtributoAsignado__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1548:1: rule__AtributoAsignado__Group__0 : rule__AtributoAsignado__Group__0__Impl rule__AtributoAsignado__Group__1 ;
    public final void rule__AtributoAsignado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1552:1: ( rule__AtributoAsignado__Group__0__Impl rule__AtributoAsignado__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1553:2: rule__AtributoAsignado__Group__0__Impl rule__AtributoAsignado__Group__1
            {
            pushFollow(FOLLOW_rule__AtributoAsignado__Group__0__Impl_in_rule__AtributoAsignado__Group__03157);
            rule__AtributoAsignado__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoAsignado__Group__1_in_rule__AtributoAsignado__Group__03160);
            rule__AtributoAsignado__Group__1();

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
    // $ANTLR end "rule__AtributoAsignado__Group__0"


    // $ANTLR start "rule__AtributoAsignado__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1560:1: rule__AtributoAsignado__Group__0__Impl : ( ( rule__AtributoAsignado__NombreAssignment_0 ) ) ;
    public final void rule__AtributoAsignado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1564:1: ( ( ( rule__AtributoAsignado__NombreAssignment_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1565:1: ( ( rule__AtributoAsignado__NombreAssignment_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1565:1: ( ( rule__AtributoAsignado__NombreAssignment_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1566:1: ( rule__AtributoAsignado__NombreAssignment_0 )
            {
             before(grammarAccess.getAtributoAsignadoAccess().getNombreAssignment_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1567:1: ( rule__AtributoAsignado__NombreAssignment_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1567:2: rule__AtributoAsignado__NombreAssignment_0
            {
            pushFollow(FOLLOW_rule__AtributoAsignado__NombreAssignment_0_in_rule__AtributoAsignado__Group__0__Impl3187);
            rule__AtributoAsignado__NombreAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAsignadoAccess().getNombreAssignment_0()); 

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
    // $ANTLR end "rule__AtributoAsignado__Group__0__Impl"


    // $ANTLR start "rule__AtributoAsignado__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1577:1: rule__AtributoAsignado__Group__1 : rule__AtributoAsignado__Group__1__Impl rule__AtributoAsignado__Group__2 ;
    public final void rule__AtributoAsignado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1581:1: ( rule__AtributoAsignado__Group__1__Impl rule__AtributoAsignado__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1582:2: rule__AtributoAsignado__Group__1__Impl rule__AtributoAsignado__Group__2
            {
            pushFollow(FOLLOW_rule__AtributoAsignado__Group__1__Impl_in_rule__AtributoAsignado__Group__13217);
            rule__AtributoAsignado__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoAsignado__Group__2_in_rule__AtributoAsignado__Group__13220);
            rule__AtributoAsignado__Group__2();

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
    // $ANTLR end "rule__AtributoAsignado__Group__1"


    // $ANTLR start "rule__AtributoAsignado__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1589:1: rule__AtributoAsignado__Group__1__Impl : ( '=' ) ;
    public final void rule__AtributoAsignado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1593:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1594:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1594:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1595:1: '='
            {
             before(grammarAccess.getAtributoAsignadoAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__AtributoAsignado__Group__1__Impl3248); 
             after(grammarAccess.getAtributoAsignadoAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__AtributoAsignado__Group__1__Impl"


    // $ANTLR start "rule__AtributoAsignado__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1608:1: rule__AtributoAsignado__Group__2 : rule__AtributoAsignado__Group__2__Impl ;
    public final void rule__AtributoAsignado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1612:1: ( rule__AtributoAsignado__Group__2__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1613:2: rule__AtributoAsignado__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AtributoAsignado__Group__2__Impl_in_rule__AtributoAsignado__Group__23279);
            rule__AtributoAsignado__Group__2__Impl();

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
    // $ANTLR end "rule__AtributoAsignado__Group__2"


    // $ANTLR start "rule__AtributoAsignado__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1619:1: rule__AtributoAsignado__Group__2__Impl : ( ( rule__AtributoAsignado__ValorAssignment_2 )* ) ;
    public final void rule__AtributoAsignado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1623:1: ( ( ( rule__AtributoAsignado__ValorAssignment_2 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1624:1: ( ( rule__AtributoAsignado__ValorAssignment_2 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1624:1: ( ( rule__AtributoAsignado__ValorAssignment_2 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1625:1: ( rule__AtributoAsignado__ValorAssignment_2 )*
            {
             before(grammarAccess.getAtributoAsignadoAccess().getValorAssignment_2()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1626:1: ( rule__AtributoAsignado__ValorAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==16||(LA15_2>=20 && LA15_2<=23)) ) {
                        alt15=1;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==16||(LA15_3>=20 && LA15_3<=23)) ) {
                        alt15=1;
                    }


                    }
                    break;
                case RULE_NUMBER:
                case 19:
                case 24:
                    {
                    alt15=1;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1626:2: rule__AtributoAsignado__ValorAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AtributoAsignado__ValorAssignment_2_in_rule__AtributoAsignado__Group__2__Impl3306);
            	    rule__AtributoAsignado__ValorAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAtributoAsignadoAccess().getValorAssignment_2()); 

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
    // $ANTLR end "rule__AtributoAsignado__Group__2__Impl"


    // $ANTLR start "rule__ValorAtributo__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1642:1: rule__ValorAtributo__Group__0 : rule__ValorAtributo__Group__0__Impl rule__ValorAtributo__Group__1 ;
    public final void rule__ValorAtributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1646:1: ( rule__ValorAtributo__Group__0__Impl rule__ValorAtributo__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1647:2: rule__ValorAtributo__Group__0__Impl rule__ValorAtributo__Group__1
            {
            pushFollow(FOLLOW_rule__ValorAtributo__Group__0__Impl_in_rule__ValorAtributo__Group__03343);
            rule__ValorAtributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValorAtributo__Group__1_in_rule__ValorAtributo__Group__03346);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1654:1: rule__ValorAtributo__Group__0__Impl : ( () ) ;
    public final void rule__ValorAtributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1658:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1659:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1659:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1660:1: ()
            {
             before(grammarAccess.getValorAtributoAccess().getValorAtributoAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1661:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1663:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1673:1: rule__ValorAtributo__Group__1 : rule__ValorAtributo__Group__1__Impl ;
    public final void rule__ValorAtributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1677:1: ( rule__ValorAtributo__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1678:2: rule__ValorAtributo__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ValorAtributo__Group__1__Impl_in_rule__ValorAtributo__Group__13404);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1684:1: rule__ValorAtributo__Group__1__Impl : ( ( rule__ValorAtributo__Alternatives_1 ) ) ;
    public final void rule__ValorAtributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1688:1: ( ( ( rule__ValorAtributo__Alternatives_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1689:1: ( ( rule__ValorAtributo__Alternatives_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1689:1: ( ( rule__ValorAtributo__Alternatives_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1690:1: ( rule__ValorAtributo__Alternatives_1 )
            {
             before(grammarAccess.getValorAtributoAccess().getAlternatives_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1691:1: ( rule__ValorAtributo__Alternatives_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1691:2: rule__ValorAtributo__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ValorAtributo__Alternatives_1_in_rule__ValorAtributo__Group__1__Impl3431);
            rule__ValorAtributo__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getValorAtributoAccess().getAlternatives_1()); 

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


    // $ANTLR start "rule__ListaInteger__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1705:1: rule__ListaInteger__Group__0 : rule__ListaInteger__Group__0__Impl rule__ListaInteger__Group__1 ;
    public final void rule__ListaInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1709:1: ( rule__ListaInteger__Group__0__Impl rule__ListaInteger__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1710:2: rule__ListaInteger__Group__0__Impl rule__ListaInteger__Group__1
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__0__Impl_in_rule__ListaInteger__Group__03465);
            rule__ListaInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__1_in_rule__ListaInteger__Group__03468);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1717:1: rule__ListaInteger__Group__0__Impl : ( () ) ;
    public final void rule__ListaInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1721:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1722:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1722:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1723:1: ()
            {
             before(grammarAccess.getListaIntegerAccess().getListaIntegerAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1724:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1726:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1736:1: rule__ListaInteger__Group__1 : rule__ListaInteger__Group__1__Impl rule__ListaInteger__Group__2 ;
    public final void rule__ListaInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1740:1: ( rule__ListaInteger__Group__1__Impl rule__ListaInteger__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1741:2: rule__ListaInteger__Group__1__Impl rule__ListaInteger__Group__2
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__1__Impl_in_rule__ListaInteger__Group__13526);
            rule__ListaInteger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__2_in_rule__ListaInteger__Group__13529);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1748:1: rule__ListaInteger__Group__1__Impl : ( '{' ) ;
    public final void rule__ListaInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1752:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1753:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1753:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1754:1: '{'
            {
             before(grammarAccess.getListaIntegerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__ListaInteger__Group__1__Impl3557); 
             after(grammarAccess.getListaIntegerAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1767:1: rule__ListaInteger__Group__2 : rule__ListaInteger__Group__2__Impl rule__ListaInteger__Group__3 ;
    public final void rule__ListaInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1771:1: ( rule__ListaInteger__Group__2__Impl rule__ListaInteger__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1772:2: rule__ListaInteger__Group__2__Impl rule__ListaInteger__Group__3
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__2__Impl_in_rule__ListaInteger__Group__23588);
            rule__ListaInteger__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__3_in_rule__ListaInteger__Group__23591);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1779:1: rule__ListaInteger__Group__2__Impl : ( ( rule__ListaInteger__ValoresAssignment_2 ) ) ;
    public final void rule__ListaInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1783:1: ( ( ( rule__ListaInteger__ValoresAssignment_2 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1784:1: ( ( rule__ListaInteger__ValoresAssignment_2 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1784:1: ( ( rule__ListaInteger__ValoresAssignment_2 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1785:1: ( rule__ListaInteger__ValoresAssignment_2 )
            {
             before(grammarAccess.getListaIntegerAccess().getValoresAssignment_2()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1786:1: ( rule__ListaInteger__ValoresAssignment_2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1786:2: rule__ListaInteger__ValoresAssignment_2
            {
            pushFollow(FOLLOW_rule__ListaInteger__ValoresAssignment_2_in_rule__ListaInteger__Group__2__Impl3618);
            rule__ListaInteger__ValoresAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListaIntegerAccess().getValoresAssignment_2()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1796:1: rule__ListaInteger__Group__3 : rule__ListaInteger__Group__3__Impl rule__ListaInteger__Group__4 ;
    public final void rule__ListaInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1800:1: ( rule__ListaInteger__Group__3__Impl rule__ListaInteger__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1801:2: rule__ListaInteger__Group__3__Impl rule__ListaInteger__Group__4
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__3__Impl_in_rule__ListaInteger__Group__33648);
            rule__ListaInteger__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group__4_in_rule__ListaInteger__Group__33651);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1808:1: rule__ListaInteger__Group__3__Impl : ( ( rule__ListaInteger__Group_3__0 )* ) ;
    public final void rule__ListaInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1812:1: ( ( ( rule__ListaInteger__Group_3__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1813:1: ( ( rule__ListaInteger__Group_3__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1813:1: ( ( rule__ListaInteger__Group_3__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1814:1: ( rule__ListaInteger__Group_3__0 )*
            {
             before(grammarAccess.getListaIntegerAccess().getGroup_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1815:1: ( rule__ListaInteger__Group_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1815:2: rule__ListaInteger__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ListaInteger__Group_3__0_in_rule__ListaInteger__Group__3__Impl3678);
            	    rule__ListaInteger__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getListaIntegerAccess().getGroup_3()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1825:1: rule__ListaInteger__Group__4 : rule__ListaInteger__Group__4__Impl ;
    public final void rule__ListaInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1829:1: ( rule__ListaInteger__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1830:2: rule__ListaInteger__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group__4__Impl_in_rule__ListaInteger__Group__43709);
            rule__ListaInteger__Group__4__Impl();

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1836:1: rule__ListaInteger__Group__4__Impl : ( '}' ) ;
    public final void rule__ListaInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1840:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1841:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1841:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1842:1: '}'
            {
             before(grammarAccess.getListaIntegerAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__ListaInteger__Group__4__Impl3737); 
             after(grammarAccess.getListaIntegerAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__ListaInteger__Group_3__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1865:1: rule__ListaInteger__Group_3__0 : rule__ListaInteger__Group_3__0__Impl rule__ListaInteger__Group_3__1 ;
    public final void rule__ListaInteger__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1869:1: ( rule__ListaInteger__Group_3__0__Impl rule__ListaInteger__Group_3__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1870:2: rule__ListaInteger__Group_3__0__Impl rule__ListaInteger__Group_3__1
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group_3__0__Impl_in_rule__ListaInteger__Group_3__03778);
            rule__ListaInteger__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaInteger__Group_3__1_in_rule__ListaInteger__Group_3__03781);
            rule__ListaInteger__Group_3__1();

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
    // $ANTLR end "rule__ListaInteger__Group_3__0"


    // $ANTLR start "rule__ListaInteger__Group_3__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1877:1: rule__ListaInteger__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ListaInteger__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1881:1: ( ( ',' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1882:1: ( ',' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1882:1: ( ',' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1883:1: ','
            {
             before(grammarAccess.getListaIntegerAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__ListaInteger__Group_3__0__Impl3809); 
             after(grammarAccess.getListaIntegerAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ListaInteger__Group_3__0__Impl"


    // $ANTLR start "rule__ListaInteger__Group_3__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1896:1: rule__ListaInteger__Group_3__1 : rule__ListaInteger__Group_3__1__Impl ;
    public final void rule__ListaInteger__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1900:1: ( rule__ListaInteger__Group_3__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1901:2: rule__ListaInteger__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ListaInteger__Group_3__1__Impl_in_rule__ListaInteger__Group_3__13840);
            rule__ListaInteger__Group_3__1__Impl();

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
    // $ANTLR end "rule__ListaInteger__Group_3__1"


    // $ANTLR start "rule__ListaInteger__Group_3__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1907:1: rule__ListaInteger__Group_3__1__Impl : ( ( rule__ListaInteger__ValoresAssignment_3_1 ) ) ;
    public final void rule__ListaInteger__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1911:1: ( ( ( rule__ListaInteger__ValoresAssignment_3_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1912:1: ( ( rule__ListaInteger__ValoresAssignment_3_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1912:1: ( ( rule__ListaInteger__ValoresAssignment_3_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1913:1: ( rule__ListaInteger__ValoresAssignment_3_1 )
            {
             before(grammarAccess.getListaIntegerAccess().getValoresAssignment_3_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1914:1: ( rule__ListaInteger__ValoresAssignment_3_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1914:2: rule__ListaInteger__ValoresAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ListaInteger__ValoresAssignment_3_1_in_rule__ListaInteger__Group_3__1__Impl3867);
            rule__ListaInteger__ValoresAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getListaIntegerAccess().getValoresAssignment_3_1()); 

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
    // $ANTLR end "rule__ListaInteger__Group_3__1__Impl"


    // $ANTLR start "rule__ListaString__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1928:1: rule__ListaString__Group__0 : rule__ListaString__Group__0__Impl rule__ListaString__Group__1 ;
    public final void rule__ListaString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1932:1: ( rule__ListaString__Group__0__Impl rule__ListaString__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1933:2: rule__ListaString__Group__0__Impl rule__ListaString__Group__1
            {
            pushFollow(FOLLOW_rule__ListaString__Group__0__Impl_in_rule__ListaString__Group__03901);
            rule__ListaString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__1_in_rule__ListaString__Group__03904);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1940:1: rule__ListaString__Group__0__Impl : ( () ) ;
    public final void rule__ListaString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1944:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1945:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1945:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1946:1: ()
            {
             before(grammarAccess.getListaStringAccess().getListaStringAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1947:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1949:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1959:1: rule__ListaString__Group__1 : rule__ListaString__Group__1__Impl rule__ListaString__Group__2 ;
    public final void rule__ListaString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1963:1: ( rule__ListaString__Group__1__Impl rule__ListaString__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1964:2: rule__ListaString__Group__1__Impl rule__ListaString__Group__2
            {
            pushFollow(FOLLOW_rule__ListaString__Group__1__Impl_in_rule__ListaString__Group__13962);
            rule__ListaString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__2_in_rule__ListaString__Group__13965);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1971:1: rule__ListaString__Group__1__Impl : ( '{' ) ;
    public final void rule__ListaString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1975:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1976:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1976:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1977:1: '{'
            {
             before(grammarAccess.getListaStringAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__ListaString__Group__1__Impl3993); 
             after(grammarAccess.getListaStringAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1990:1: rule__ListaString__Group__2 : rule__ListaString__Group__2__Impl rule__ListaString__Group__3 ;
    public final void rule__ListaString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1994:1: ( rule__ListaString__Group__2__Impl rule__ListaString__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1995:2: rule__ListaString__Group__2__Impl rule__ListaString__Group__3
            {
            pushFollow(FOLLOW_rule__ListaString__Group__2__Impl_in_rule__ListaString__Group__24024);
            rule__ListaString__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__3_in_rule__ListaString__Group__24027);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2002:1: rule__ListaString__Group__2__Impl : ( ( rule__ListaString__ValoresAssignment_2 ) ) ;
    public final void rule__ListaString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2006:1: ( ( ( rule__ListaString__ValoresAssignment_2 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2007:1: ( ( rule__ListaString__ValoresAssignment_2 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2007:1: ( ( rule__ListaString__ValoresAssignment_2 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2008:1: ( rule__ListaString__ValoresAssignment_2 )
            {
             before(grammarAccess.getListaStringAccess().getValoresAssignment_2()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2009:1: ( rule__ListaString__ValoresAssignment_2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2009:2: rule__ListaString__ValoresAssignment_2
            {
            pushFollow(FOLLOW_rule__ListaString__ValoresAssignment_2_in_rule__ListaString__Group__2__Impl4054);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2019:1: rule__ListaString__Group__3 : rule__ListaString__Group__3__Impl rule__ListaString__Group__4 ;
    public final void rule__ListaString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2023:1: ( rule__ListaString__Group__3__Impl rule__ListaString__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2024:2: rule__ListaString__Group__3__Impl rule__ListaString__Group__4
            {
            pushFollow(FOLLOW_rule__ListaString__Group__3__Impl_in_rule__ListaString__Group__34084);
            rule__ListaString__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group__4_in_rule__ListaString__Group__34087);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2031:1: rule__ListaString__Group__3__Impl : ( ( rule__ListaString__Group_3__0 )* ) ;
    public final void rule__ListaString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2035:1: ( ( ( rule__ListaString__Group_3__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2036:1: ( ( rule__ListaString__Group_3__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2036:1: ( ( rule__ListaString__Group_3__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2037:1: ( rule__ListaString__Group_3__0 )*
            {
             before(grammarAccess.getListaStringAccess().getGroup_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2038:1: ( rule__ListaString__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2038:2: rule__ListaString__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ListaString__Group_3__0_in_rule__ListaString__Group__3__Impl4114);
            	    rule__ListaString__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2048:1: rule__ListaString__Group__4 : rule__ListaString__Group__4__Impl ;
    public final void rule__ListaString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2052:1: ( rule__ListaString__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2053:2: rule__ListaString__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ListaString__Group__4__Impl_in_rule__ListaString__Group__44145);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2059:1: rule__ListaString__Group__4__Impl : ( '}' ) ;
    public final void rule__ListaString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2063:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2064:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2064:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2065:1: '}'
            {
             before(grammarAccess.getListaStringAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__ListaString__Group__4__Impl4173); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2088:1: rule__ListaString__Group_3__0 : rule__ListaString__Group_3__0__Impl rule__ListaString__Group_3__1 ;
    public final void rule__ListaString__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2092:1: ( rule__ListaString__Group_3__0__Impl rule__ListaString__Group_3__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2093:2: rule__ListaString__Group_3__0__Impl rule__ListaString__Group_3__1
            {
            pushFollow(FOLLOW_rule__ListaString__Group_3__0__Impl_in_rule__ListaString__Group_3__04214);
            rule__ListaString__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListaString__Group_3__1_in_rule__ListaString__Group_3__04217);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2100:1: rule__ListaString__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ListaString__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2104:1: ( ( ',' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2105:1: ( ',' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2105:1: ( ',' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2106:1: ','
            {
             before(grammarAccess.getListaStringAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__ListaString__Group_3__0__Impl4245); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2119:1: rule__ListaString__Group_3__1 : rule__ListaString__Group_3__1__Impl ;
    public final void rule__ListaString__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2123:1: ( rule__ListaString__Group_3__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2124:2: rule__ListaString__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ListaString__Group_3__1__Impl_in_rule__ListaString__Group_3__14276);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2130:1: rule__ListaString__Group_3__1__Impl : ( ( rule__ListaString__ValoresAssignment_3_1 ) ) ;
    public final void rule__ListaString__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2134:1: ( ( ( rule__ListaString__ValoresAssignment_3_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2135:1: ( ( rule__ListaString__ValoresAssignment_3_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2135:1: ( ( rule__ListaString__ValoresAssignment_3_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2136:1: ( rule__ListaString__ValoresAssignment_3_1 )
            {
             before(grammarAccess.getListaStringAccess().getValoresAssignment_3_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2137:1: ( rule__ListaString__ValoresAssignment_3_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2137:2: rule__ListaString__ValoresAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ListaString__ValoresAssignment_3_1_in_rule__ListaString__Group_3__1__Impl4303);
            rule__ListaString__ValoresAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getListaStringAccess().getValoresAssignment_3_1()); 

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


    // $ANTLR start "rule__Definition__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2152:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2156:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2157:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__04338);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__04341);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2164:1: rule__Definition__Group__0__Impl : ( 'def' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2168:1: ( ( 'def' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2169:1: ( 'def' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2169:1: ( 'def' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2170:1: 'def'
            {
             before(grammarAccess.getDefinitionAccess().getDefKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Definition__Group__0__Impl4369); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2183:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2187:1: ( rule__Definition__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2188:2: rule__Definition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__14400);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2194:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__NameAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2198:1: ( ( ( rule__Definition__NameAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2199:1: ( ( rule__Definition__NameAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2199:1: ( ( rule__Definition__NameAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2200:1: ( rule__Definition__NameAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2201:1: ( rule__Definition__NameAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2201:2: rule__Definition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl4427);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2215:1: rule__Evaluation__Group__0 : rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 ;
    public final void rule__Evaluation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2219:1: ( rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2220:2: rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__04461);
            rule__Evaluation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__04464);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2227:1: rule__Evaluation__Group__0__Impl : ( ( rule__Evaluation__ExpressionAssignment_0 ) ) ;
    public final void rule__Evaluation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2231:1: ( ( ( rule__Evaluation__ExpressionAssignment_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2232:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2232:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2233:1: ( rule__Evaluation__ExpressionAssignment_0 )
            {
             before(grammarAccess.getEvaluationAccess().getExpressionAssignment_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2234:1: ( rule__Evaluation__ExpressionAssignment_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2234:2: rule__Evaluation__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__Evaluation__ExpressionAssignment_0_in_rule__Evaluation__Group__0__Impl4491);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2244:1: rule__Evaluation__Group__1 : rule__Evaluation__Group__1__Impl ;
    public final void rule__Evaluation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2248:1: ( rule__Evaluation__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2249:2: rule__Evaluation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__14521);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2255:1: rule__Evaluation__Group__1__Impl : ( ';' ) ;
    public final void rule__Evaluation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2259:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2260:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2260:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2261:1: ';'
            {
             before(grammarAccess.getEvaluationAccess().getSemicolonKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Evaluation__Group__1__Impl4549); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2278:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2282:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2283:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04584);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04587);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2290:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2294:1: ( ( ruleMultiplication ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2295:1: ( ruleMultiplication )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2295:1: ( ruleMultiplication )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2296:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4614);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2307:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2311:1: ( rule__Addition__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2312:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__14643);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2318:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2322:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2323:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2323:1: ( ( rule__Addition__Group_1__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2324:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2325:1: ( rule__Addition__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=20 && LA18_0<=21)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2325:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl4670);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2339:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2343:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2344:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__04705);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__04708);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2351:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2355:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2356:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2356:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2357:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2358:1: ( rule__Addition__Alternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2358:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl4735);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2368:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2372:1: ( rule__Addition__Group_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2373:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__14765);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2379:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2383:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2384:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2384:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2385:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2386:1: ( rule__Addition__RightAssignment_1_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2386:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl4792);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2400:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2404:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2405:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__04826);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__04829);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2412:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2416:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2417:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2417:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2418:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2419:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2421:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2431:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2435:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2436:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__14887);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2442:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2446:1: ( ( '+' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2447:1: ( '+' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2447:1: ( '+' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2448:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,20,FOLLOW_20_in_rule__Addition__Group_1_0_0__1__Impl4915); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2465:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2469:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2470:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__04950);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__04953);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2477:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2481:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2482:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2482:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2483:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2484:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2486:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2496:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2500:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2501:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15011);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2507:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2511:1: ( ( '-' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2512:1: ( '-' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2512:1: ( '-' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2513:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,21,FOLLOW_21_in_rule__Addition__Group_1_0_1__1__Impl5039); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2530:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2534:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2535:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05074);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05077);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2542:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2546:1: ( ( rulePrimaryExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2547:1: ( rulePrimaryExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2547:1: ( rulePrimaryExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2548:1: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl5104);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2559:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2563:1: ( rule__Multiplication__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2564:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15133);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2570:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2574:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2575:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2575:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2576:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2577:1: ( rule__Multiplication__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=22 && LA19_0<=23)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2577:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5160);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2591:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2595:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2596:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05195);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05198);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2603:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2607:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2608:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2608:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2609:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2610:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2610:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl5225);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2620:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2624:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2625:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15255);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2631:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2635:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2636:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2636:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2637:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2638:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2638:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5282);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2652:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2656:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2657:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__05316);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__05319);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2664:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2668:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2669:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2669:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2670:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2671:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2673:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2683:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2687:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2688:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__15377);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2694:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2698:1: ( ( '*' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2699:1: ( '*' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2699:1: ( '*' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2700:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,22,FOLLOW_22_in_rule__Multiplication__Group_1_0_0__1__Impl5405); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2717:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2721:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2722:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__05440);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__05443);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2729:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2733:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2734:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2734:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2735:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2736:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2738:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2748:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2752:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2753:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__15501);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2759:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2763:1: ( ( '/' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2764:1: ( '/' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2764:1: ( '/' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2765:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,23,FOLLOW_23_in_rule__Multiplication__Group_1_0_1__1__Impl5529); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2782:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2786:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2787:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__05564);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__05567);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2794:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2798:1: ( ( '(' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2799:1: ( '(' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2799:1: ( '(' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2800:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__PrimaryExpression__Group_0__0__Impl5595); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2813:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2817:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2818:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__15626);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__15629);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2825:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2829:1: ( ( ruleExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2830:1: ( ruleExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2830:1: ( ruleExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2831:1: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl5656);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2842:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2846:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2847:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__25685);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2853:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2857:1: ( ( ')' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2858:1: ( ')' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2858:1: ( ')' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2859:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,25,FOLLOW_25_in_rule__PrimaryExpression__Group_0__2__Impl5713); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2878:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2882:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2883:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__05750);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__05753);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2890:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2894:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2895:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2895:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2896:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2897:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2899:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2909:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2913:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2914:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__15811);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2920:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2924:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2925:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2925:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2926:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2927:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2927:2: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl5838);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2941:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2945:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2946:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__05872);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__05875);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2953:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2957:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2958:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2958:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2959:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getSTRINGAction_2_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2960:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2962:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2972:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2976:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2977:2: rule__PrimaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__15933);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2983:1: rule__PrimaryExpression__Group_2__1__Impl : ( RULE_STRING ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2987:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2988:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2988:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2989:1: RULE_STRING
            {
             before(grammarAccess.getPrimaryExpressionAccess().getSTRINGTerminalRuleCall_2_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PrimaryExpression__Group_2__1__Impl5960); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3004:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3008:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3009:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__05993);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__05996);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3016:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3020:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3021:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3021:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3022:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIDAction_3_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3023:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3025:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3035:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3039:1: ( rule__PrimaryExpression__Group_3__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3040:2: rule__PrimaryExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__16054);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3046:1: rule__PrimaryExpression__Group_3__1__Impl : ( RULE_ID ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3050:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3051:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3051:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3052:1: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIDTerminalRuleCall_3_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__Group_3__1__Impl6081); 
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


    // $ANTLR start "rule__Model__NombreAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3068:1: rule__Model__NombreAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3072:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3073:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3073:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3074:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNombreIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NombreAssignment_16119); 
             after(grammarAccess.getModelAccess().getNombreIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NombreAssignment_1"


    // $ANTLR start "rule__Model__ObjetosAssignment_3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3083:1: rule__Model__ObjetosAssignment_3 : ( ruleObjeto ) ;
    public final void rule__Model__ObjetosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3087:1: ( ( ruleObjeto ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3088:1: ( ruleObjeto )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3088:1: ( ruleObjeto )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3089:1: ruleObjeto
            {
             before(grammarAccess.getModelAccess().getObjetosObjetoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleObjeto_in_rule__Model__ObjetosAssignment_36150);
            ruleObjeto();

            state._fsp--;

             after(grammarAccess.getModelAccess().getObjetosObjetoParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__ObjetosAssignment_3"


    // $ANTLR start "rule__Objeto__NameAssignment_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3098:1: rule__Objeto__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Objeto__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3102:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3103:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3103:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3104:1: RULE_ID
            {
             before(grammarAccess.getObjetoAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Objeto__NameAssignment_06181); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3113:1: rule__Objeto__DescripcionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Objeto__DescripcionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3117:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3118:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3118:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3119:1: RULE_STRING
            {
             before(grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Objeto__DescripcionAssignment_16212); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3128:1: rule__Objeto__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__Objeto__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3132:1: ( ( ruleAtributo ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3133:1: ( ruleAtributo )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3133:1: ( ruleAtributo )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3134:1: ruleAtributo
            {
             before(grammarAccess.getObjetoAccess().getAtributosAtributoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAtributo_in_rule__Objeto__AtributosAssignment_36243);
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


    // $ANTLR start "rule__Objeto__ObjetosAssignment_4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3143:1: rule__Objeto__ObjetosAssignment_4 : ( ruleObjeto ) ;
    public final void rule__Objeto__ObjetosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3147:1: ( ( ruleObjeto ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3148:1: ( ruleObjeto )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3148:1: ( ruleObjeto )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3149:1: ruleObjeto
            {
             before(grammarAccess.getObjetoAccess().getObjetosObjetoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleObjeto_in_rule__Objeto__ObjetosAssignment_46274);
            ruleObjeto();

            state._fsp--;

             after(grammarAccess.getObjetoAccess().getObjetosObjetoParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Objeto__ObjetosAssignment_4"


    // $ANTLR start "rule__AtributoSimple__NombreAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3158:1: rule__AtributoSimple__NombreAssignment_1 : ( ( rule__AtributoSimple__NombreAlternatives_1_0 ) ) ;
    public final void rule__AtributoSimple__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3162:1: ( ( ( rule__AtributoSimple__NombreAlternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3163:1: ( ( rule__AtributoSimple__NombreAlternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3163:1: ( ( rule__AtributoSimple__NombreAlternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3164:1: ( rule__AtributoSimple__NombreAlternatives_1_0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNombreAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3165:1: ( rule__AtributoSimple__NombreAlternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3165:2: rule__AtributoSimple__NombreAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AtributoSimple__NombreAlternatives_1_0_in_rule__AtributoSimple__NombreAssignment_16305);
            rule__AtributoSimple__NombreAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getNombreAlternatives_1_0()); 

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
    // $ANTLR end "rule__AtributoSimple__NombreAssignment_1"


    // $ANTLR start "rule__AtributoSimple__TipoAssignment_3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3174:1: rule__AtributoSimple__TipoAssignment_3 : ( RULE_DATATYPE ) ;
    public final void rule__AtributoSimple__TipoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3178:1: ( ( RULE_DATATYPE ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3179:1: ( RULE_DATATYPE )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3179:1: ( RULE_DATATYPE )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3180:1: RULE_DATATYPE
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoDATATYPETerminalRuleCall_3_0()); 
            match(input,RULE_DATATYPE,FOLLOW_RULE_DATATYPE_in_rule__AtributoSimple__TipoAssignment_36338); 
             after(grammarAccess.getAtributoSimpleAccess().getTipoDATATYPETerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__AtributoSimple__TipoAssignment_3"


    // $ANTLR start "rule__AtributoInicializado__NombreAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3189:1: rule__AtributoInicializado__NombreAssignment_1 : ( ( rule__AtributoInicializado__NombreAlternatives_1_0 ) ) ;
    public final void rule__AtributoInicializado__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3193:1: ( ( ( rule__AtributoInicializado__NombreAlternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3194:1: ( ( rule__AtributoInicializado__NombreAlternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3194:1: ( ( rule__AtributoInicializado__NombreAlternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3195:1: ( rule__AtributoInicializado__NombreAlternatives_1_0 )
            {
             before(grammarAccess.getAtributoInicializadoAccess().getNombreAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3196:1: ( rule__AtributoInicializado__NombreAlternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3196:2: rule__AtributoInicializado__NombreAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__NombreAlternatives_1_0_in_rule__AtributoInicializado__NombreAssignment_16369);
            rule__AtributoInicializado__NombreAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoInicializadoAccess().getNombreAlternatives_1_0()); 

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
    // $ANTLR end "rule__AtributoInicializado__NombreAssignment_1"


    // $ANTLR start "rule__AtributoInicializado__TipoAssignment_3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3205:1: rule__AtributoInicializado__TipoAssignment_3 : ( RULE_DATATYPE ) ;
    public final void rule__AtributoInicializado__TipoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3209:1: ( ( RULE_DATATYPE ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3210:1: ( RULE_DATATYPE )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3210:1: ( RULE_DATATYPE )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3211:1: RULE_DATATYPE
            {
             before(grammarAccess.getAtributoInicializadoAccess().getTipoDATATYPETerminalRuleCall_3_0()); 
            match(input,RULE_DATATYPE,FOLLOW_RULE_DATATYPE_in_rule__AtributoInicializado__TipoAssignment_36402); 
             after(grammarAccess.getAtributoInicializadoAccess().getTipoDATATYPETerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__AtributoInicializado__TipoAssignment_3"


    // $ANTLR start "rule__AtributoInicializado__ValorAssignment_5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3220:1: rule__AtributoInicializado__ValorAssignment_5 : ( ruleValorCompleto ) ;
    public final void rule__AtributoInicializado__ValorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3224:1: ( ( ruleValorCompleto ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3225:1: ( ruleValorCompleto )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3225:1: ( ruleValorCompleto )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3226:1: ruleValorCompleto
            {
             before(grammarAccess.getAtributoInicializadoAccess().getValorValorCompletoParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleValorCompleto_in_rule__AtributoInicializado__ValorAssignment_56433);
            ruleValorCompleto();

            state._fsp--;

             after(grammarAccess.getAtributoInicializadoAccess().getValorValorCompletoParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__AtributoInicializado__ValorAssignment_5"


    // $ANTLR start "rule__AtributoAsignado__NombreAssignment_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3235:1: rule__AtributoAsignado__NombreAssignment_0 : ( RULE_ID ) ;
    public final void rule__AtributoAsignado__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3239:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3240:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3240:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3241:1: RULE_ID
            {
             before(grammarAccess.getAtributoAsignadoAccess().getNombreIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtributoAsignado__NombreAssignment_06464); 
             after(grammarAccess.getAtributoAsignadoAccess().getNombreIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AtributoAsignado__NombreAssignment_0"


    // $ANTLR start "rule__AtributoAsignado__ValorAssignment_2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3250:1: rule__AtributoAsignado__ValorAssignment_2 : ( ruleStatement ) ;
    public final void rule__AtributoAsignado__ValorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3254:1: ( ( ruleStatement ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3255:1: ( ruleStatement )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3255:1: ( ruleStatement )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3256:1: ruleStatement
            {
             before(grammarAccess.getAtributoAsignadoAccess().getValorStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__AtributoAsignado__ValorAssignment_26495);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getAtributoAsignadoAccess().getValorStatementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AtributoAsignado__ValorAssignment_2"


    // $ANTLR start "rule__ListaInteger__ValoresAssignment_2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3265:1: rule__ListaInteger__ValoresAssignment_2 : ( RULE_NUMBER ) ;
    public final void rule__ListaInteger__ValoresAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3269:1: ( ( RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3270:1: ( RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3270:1: ( RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3271:1: RULE_NUMBER
            {
             before(grammarAccess.getListaIntegerAccess().getValoresNUMBERTerminalRuleCall_2_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__ListaInteger__ValoresAssignment_26526); 
             after(grammarAccess.getListaIntegerAccess().getValoresNUMBERTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ListaInteger__ValoresAssignment_2"


    // $ANTLR start "rule__ListaInteger__ValoresAssignment_3_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3280:1: rule__ListaInteger__ValoresAssignment_3_1 : ( RULE_NUMBER ) ;
    public final void rule__ListaInteger__ValoresAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3284:1: ( ( RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3285:1: ( RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3285:1: ( RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3286:1: RULE_NUMBER
            {
             before(grammarAccess.getListaIntegerAccess().getValoresNUMBERTerminalRuleCall_3_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__ListaInteger__ValoresAssignment_3_16557); 
             after(grammarAccess.getListaIntegerAccess().getValoresNUMBERTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ListaInteger__ValoresAssignment_3_1"


    // $ANTLR start "rule__ListaString__ValoresAssignment_2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3295:1: rule__ListaString__ValoresAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ListaString__ValoresAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3299:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3300:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3300:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3301:1: RULE_STRING
            {
             before(grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListaString__ValoresAssignment_26588); 
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


    // $ANTLR start "rule__ListaString__ValoresAssignment_3_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3310:1: rule__ListaString__ValoresAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ListaString__ValoresAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3314:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3315:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3315:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3316:1: RULE_STRING
            {
             before(grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListaString__ValoresAssignment_3_16619); 
             after(grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ListaString__ValoresAssignment_3_1"


    // $ANTLR start "rule__Definition__NameAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3327:1: rule__Definition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3331:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3332:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3332:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3333:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_16652); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3342:1: rule__Evaluation__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__Evaluation__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3346:1: ( ( ruleExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3347:1: ( ruleExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3347:1: ( ruleExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3348:1: ruleExpression
            {
             before(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Evaluation__ExpressionAssignment_06683);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3357:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3361:1: ( ( ruleMultiplication ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3362:1: ( ruleMultiplication )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3362:1: ( ruleMultiplication )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3363:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_16714);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3372:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3376:1: ( ( rulePrimaryExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3377:1: ( rulePrimaryExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3377:1: ( rulePrimaryExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3378:1: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_16745);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3387:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3391:1: ( ( RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3392:1: ( RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3392:1: ( RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3393:1: RULE_NUMBER
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__PrimaryExpression__ValueAssignment_1_16776); 
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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_entryRuleObjeto121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjeto128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__0_in_ruleObjeto154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoSimple_in_entryRuleAtributoSimple181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoSimple188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__0_in_ruleAtributoSimple214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoInicializado_in_entryRuleAtributoInicializado241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoInicializado248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__0_in_ruleAtributoInicializado274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoAsignado_in_entryRuleAtributoAsignado301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoAsignado308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignado__Group__0_in_ruleAtributoAsignado334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributo368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atributo__Alternatives_in_ruleAtributo394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributo_in_entryRuleValorAtributo421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorAtributo428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__0_in_ruleValorAtributo454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorCompleto_in_entryRuleValorCompleto481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorCompleto488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorCompleto__Alternatives_in_ruleValorCompleto514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInteger_in_entryRuleListaInteger543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaInteger550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__0_in_ruleListaInteger576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_entryRuleListaString603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListaString610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__0_in_ruleListaString636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLista_in_entryRuleLista663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLista670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lista__Alternatives_in_ruleLista696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtributoSimple__NombreAlternatives_1_01153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AtributoSimple__NombreAlternatives_1_01170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtributoInicializado__NombreAlternatives_1_01202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AtributoInicializado__NombreAlternatives_1_01219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoSimple_in_rule__Atributo__Alternatives1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoInicializado_in_rule__Atributo__Alternatives1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoAsignado_in_rule__Atributo__Alternatives1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValorAtributo__Alternatives_11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ValorAtributo__Alternatives_11334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__ValorAtributo__Alternatives_11351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorAtributo_in_rule__ValorCompleto__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLista_in_rule__ValorCompleto__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaInteger_in_rule__Lista__Alternatives1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListaString_in_rule__Lista__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Statement__Alternatives1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_rule__Statement__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11779 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NombreAssignment_1_in_rule__Model__Group__1__Impl1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21839 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__2__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31901 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ObjetosAssignment_3_in_rule__Model__Group__3__Impl1931 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__4__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__0__Impl_in_rule__Objeto__Group__02031 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__Objeto__Group__1_in_rule__Objeto__Group__02034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__NameAssignment_0_in_rule__Objeto__Group__0__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__1__Impl_in_rule__Objeto__Group__12091 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__Objeto__Group__2_in_rule__Objeto__Group__12094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__DescripcionAssignment_1_in_rule__Objeto__Group__1__Impl2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__2__Impl_in_rule__Objeto__Group__22152 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Objeto__Group__3_in_rule__Objeto__Group__22155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Objeto__Group__2__Impl2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__3__Impl_in_rule__Objeto__Group__32214 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Objeto__Group__4_in_rule__Objeto__Group__32217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__AtributosAssignment_3_in_rule__Objeto__Group__3__Impl2244 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Objeto__Group__4__Impl_in_rule__Objeto__Group__42275 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Objeto__Group__5_in_rule__Objeto__Group__42278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__ObjetosAssignment_4_in_rule__Objeto__Group__4__Impl2305 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Objeto__Group__5__Impl_in_rule__Objeto__Group__52336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Objeto__Group__5__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__0__Impl_in_rule__AtributoSimple__Group__02407 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__1_in_rule__AtributoSimple__Group__02410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__1__Impl_in_rule__AtributoSimple__Group__12468 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__2_in_rule__AtributoSimple__Group__12471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__NombreAssignment_1_in_rule__AtributoSimple__Group__1__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__2__Impl_in_rule__AtributoSimple__Group__22528 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__3_in_rule__AtributoSimple__Group__22531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AtributoSimple__Group__2__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__3__Impl_in_rule__AtributoSimple__Group__32590 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__4_in_rule__AtributoSimple__Group__32593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__TipoAssignment_3_in_rule__AtributoSimple__Group__3__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__4__Impl_in_rule__AtributoSimple__Group__42650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AtributoSimple__Group__4__Impl2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__0__Impl_in_rule__AtributoInicializado__Group__02719 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__1_in_rule__AtributoInicializado__Group__02722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__1__Impl_in_rule__AtributoInicializado__Group__12780 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__2_in_rule__AtributoInicializado__Group__12783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__NombreAssignment_1_in_rule__AtributoInicializado__Group__1__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__2__Impl_in_rule__AtributoInicializado__Group__22840 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__3_in_rule__AtributoInicializado__Group__22843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AtributoInicializado__Group__2__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__3__Impl_in_rule__AtributoInicializado__Group__32902 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__4_in_rule__AtributoInicializado__Group__32905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__TipoAssignment_3_in_rule__AtributoInicializado__Group__3__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__4__Impl_in_rule__AtributoInicializado__Group__42962 = new BitSet(new long[]{0x0000000000002070L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__5_in_rule__AtributoInicializado__Group__42965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AtributoInicializado__Group__4__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__5__Impl_in_rule__AtributoInicializado__Group__53024 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__6_in_rule__AtributoInicializado__Group__53027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__ValorAssignment_5_in_rule__AtributoInicializado__Group__5__Impl3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__6__Impl_in_rule__AtributoInicializado__Group__63084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AtributoInicializado__Group__6__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignado__Group__0__Impl_in_rule__AtributoAsignado__Group__03157 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AtributoAsignado__Group__1_in_rule__AtributoAsignado__Group__03160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignado__NombreAssignment_0_in_rule__AtributoAsignado__Group__0__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignado__Group__1__Impl_in_rule__AtributoAsignado__Group__13217 = new BitSet(new long[]{0x0000000001080070L});
    public static final BitSet FOLLOW_rule__AtributoAsignado__Group__2_in_rule__AtributoAsignado__Group__13220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AtributoAsignado__Group__1__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignado__Group__2__Impl_in_rule__AtributoAsignado__Group__23279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoAsignado__ValorAssignment_2_in_rule__AtributoAsignado__Group__2__Impl3306 = new BitSet(new long[]{0x0000000001080072L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__0__Impl_in_rule__ValorAtributo__Group__03343 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__1_in_rule__ValorAtributo__Group__03346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Group__1__Impl_in_rule__ValorAtributo__Group__13404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorAtributo__Alternatives_1_in_rule__ValorAtributo__Group__1__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__0__Impl_in_rule__ListaInteger__Group__03465 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__1_in_rule__ListaInteger__Group__03468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__1__Impl_in_rule__ListaInteger__Group__13526 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__2_in_rule__ListaInteger__Group__13529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ListaInteger__Group__1__Impl3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__2__Impl_in_rule__ListaInteger__Group__23588 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__3_in_rule__ListaInteger__Group__23591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__ValoresAssignment_2_in_rule__ListaInteger__Group__2__Impl3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__3__Impl_in_rule__ListaInteger__Group__33648 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__4_in_rule__ListaInteger__Group__33651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_3__0_in_rule__ListaInteger__Group__3__Impl3678 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group__4__Impl_in_rule__ListaInteger__Group__43709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ListaInteger__Group__4__Impl3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_3__0__Impl_in_rule__ListaInteger__Group_3__03778 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_3__1_in_rule__ListaInteger__Group_3__03781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ListaInteger__Group_3__0__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__Group_3__1__Impl_in_rule__ListaInteger__Group_3__13840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaInteger__ValoresAssignment_3_1_in_rule__ListaInteger__Group_3__1__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__0__Impl_in_rule__ListaString__Group__03901 = new BitSet(new long[]{0x0000000000002070L});
    public static final BitSet FOLLOW_rule__ListaString__Group__1_in_rule__ListaString__Group__03904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__1__Impl_in_rule__ListaString__Group__13962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListaString__Group__2_in_rule__ListaString__Group__13965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ListaString__Group__1__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__2__Impl_in_rule__ListaString__Group__24024 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__3_in_rule__ListaString__Group__24027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__ValoresAssignment_2_in_rule__ListaString__Group__2__Impl4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__3__Impl_in_rule__ListaString__Group__34084 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_rule__ListaString__Group__4_in_rule__ListaString__Group__34087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_3__0_in_rule__ListaString__Group__3__Impl4114 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ListaString__Group__4__Impl_in_rule__ListaString__Group__44145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ListaString__Group__4__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_3__0__Impl_in_rule__ListaString__Group_3__04214 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ListaString__Group_3__1_in_rule__ListaString__Group_3__04217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ListaString__Group_3__0__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__Group_3__1__Impl_in_rule__ListaString__Group_3__14276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListaString__ValoresAssignment_3_1_in_rule__ListaString__Group_3__1__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__04338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__04341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group__0__Impl4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__14400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__04461 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__04464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__ExpressionAssignment_0_in_rule__Evaluation__Group__0__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__14521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Evaluation__Group__1__Impl4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04584 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__14643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl4670 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__04705 = new BitSet(new long[]{0x0000000001080070L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__04708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__14765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__04826 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__04829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__14887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Addition__Group_1_0_0__1__Impl4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__04950 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__04953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Addition__Group_1_0_1__1__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05074 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5160 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05195 = new BitSet(new long[]{0x0000000001080070L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__05316 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__05319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__15377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Multiplication__Group_1_0_0__1__Impl5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__05440 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__05443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__15501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Multiplication__Group_1_0_1__1__Impl5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__05564 = new BitSet(new long[]{0x0000000001080070L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__05567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PrimaryExpression__Group_0__0__Impl5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__15626 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__15629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__25685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrimaryExpression__Group_0__2__Impl5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__05750 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__05753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__15811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__05872 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__05875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__15933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PrimaryExpression__Group_2__1__Impl5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__05993 = new BitSet(new long[]{0x0000000001080070L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__05996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__16054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__Group_3__1__Impl6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NombreAssignment_16119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_rule__Model__ObjetosAssignment_36150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Objeto__NameAssignment_06181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Objeto__DescripcionAssignment_16212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_rule__Objeto__AtributosAssignment_36243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_rule__Objeto__ObjetosAssignment_46274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__NombreAlternatives_1_0_in_rule__AtributoSimple__NombreAssignment_16305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATATYPE_in_rule__AtributoSimple__TipoAssignment_36338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__NombreAlternatives_1_0_in_rule__AtributoInicializado__NombreAssignment_16369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATATYPE_in_rule__AtributoInicializado__TipoAssignment_36402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorCompleto_in_rule__AtributoInicializado__ValorAssignment_56433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtributoAsignado__NombreAssignment_06464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__AtributoAsignado__ValorAssignment_26495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__ListaInteger__ValoresAssignment_26526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__ListaInteger__ValoresAssignment_3_16557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListaString__ValoresAssignment_26588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListaString__ValoresAssignment_3_16619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_16652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Evaluation__ExpressionAssignment_06683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_16714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_16745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__PrimaryExpression__ValueAssignment_1_16776 = new BitSet(new long[]{0x0000000000000002L});

}