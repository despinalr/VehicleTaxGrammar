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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DATATYPE", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'Registro'", "'Contacto'", "'Pago'", "':'", "';'", "'='", "'List of String'", "','", "'List of Integer'", "'Formula'", "'def'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
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
    public static final int T__31=31;
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


    // $ANTLR start "entryRuleEntidad"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:88:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:89:1: ( ruleEntidad EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:90:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_ruleEntidad_in_entryRuleEntidad121);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntidad128); 

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
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:97:1: ruleEntidad : ( ( rule__Entidad__Alternatives ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:101:2: ( ( ( rule__Entidad__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:102:1: ( ( rule__Entidad__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:102:1: ( ( rule__Entidad__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:103:1: ( rule__Entidad__Alternatives )
            {
             before(grammarAccess.getEntidadAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:104:1: ( rule__Entidad__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:104:2: rule__Entidad__Alternatives
            {
            pushFollow(FOLLOW_rule__Entidad__Alternatives_in_ruleEntidad154);
            rule__Entidad__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleRegistro"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:116:1: entryRuleRegistro : ruleRegistro EOF ;
    public final void entryRuleRegistro() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:117:1: ( ruleRegistro EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:118:1: ruleRegistro EOF
            {
             before(grammarAccess.getRegistroRule()); 
            pushFollow(FOLLOW_ruleRegistro_in_entryRuleRegistro181);
            ruleRegistro();

            state._fsp--;

             after(grammarAccess.getRegistroRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegistro188); 

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
    // $ANTLR end "entryRuleRegistro"


    // $ANTLR start "ruleRegistro"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:125:1: ruleRegistro : ( ( rule__Registro__Group__0 ) ) ;
    public final void ruleRegistro() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:129:2: ( ( ( rule__Registro__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:130:1: ( ( rule__Registro__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:130:1: ( ( rule__Registro__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:131:1: ( rule__Registro__Group__0 )
            {
             before(grammarAccess.getRegistroAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:132:1: ( rule__Registro__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:132:2: rule__Registro__Group__0
            {
            pushFollow(FOLLOW_rule__Registro__Group__0_in_ruleRegistro214);
            rule__Registro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegistroAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegistro"


    // $ANTLR start "entryRuleContacto"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:144:1: entryRuleContacto : ruleContacto EOF ;
    public final void entryRuleContacto() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:145:1: ( ruleContacto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:146:1: ruleContacto EOF
            {
             before(grammarAccess.getContactoRule()); 
            pushFollow(FOLLOW_ruleContacto_in_entryRuleContacto241);
            ruleContacto();

            state._fsp--;

             after(grammarAccess.getContactoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContacto248); 

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
    // $ANTLR end "entryRuleContacto"


    // $ANTLR start "ruleContacto"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:153:1: ruleContacto : ( ( rule__Contacto__Group__0 ) ) ;
    public final void ruleContacto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:157:2: ( ( ( rule__Contacto__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:158:1: ( ( rule__Contacto__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:158:1: ( ( rule__Contacto__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:159:1: ( rule__Contacto__Group__0 )
            {
             before(grammarAccess.getContactoAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:160:1: ( rule__Contacto__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:160:2: rule__Contacto__Group__0
            {
            pushFollow(FOLLOW_rule__Contacto__Group__0_in_ruleContacto274);
            rule__Contacto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContactoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContacto"


    // $ANTLR start "entryRulePago"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:172:1: entryRulePago : rulePago EOF ;
    public final void entryRulePago() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:173:1: ( rulePago EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:174:1: rulePago EOF
            {
             before(grammarAccess.getPagoRule()); 
            pushFollow(FOLLOW_rulePago_in_entryRulePago301);
            rulePago();

            state._fsp--;

             after(grammarAccess.getPagoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePago308); 

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
    // $ANTLR end "entryRulePago"


    // $ANTLR start "rulePago"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:181:1: rulePago : ( ( rule__Pago__Group__0 ) ) ;
    public final void rulePago() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:185:2: ( ( ( rule__Pago__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:186:1: ( ( rule__Pago__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:186:1: ( ( rule__Pago__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:187:1: ( rule__Pago__Group__0 )
            {
             before(grammarAccess.getPagoAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:188:1: ( rule__Pago__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:188:2: rule__Pago__Group__0
            {
            pushFollow(FOLLOW_rule__Pago__Group__0_in_rulePago334);
            rule__Pago__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPagoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePago"


    // $ANTLR start "entryRulePropiedad"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:200:1: entryRulePropiedad : rulePropiedad EOF ;
    public final void entryRulePropiedad() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:201:1: ( rulePropiedad EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:202:1: rulePropiedad EOF
            {
             before(grammarAccess.getPropiedadRule()); 
            pushFollow(FOLLOW_rulePropiedad_in_entryRulePropiedad361);
            rulePropiedad();

            state._fsp--;

             after(grammarAccess.getPropiedadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropiedad368); 

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
    // $ANTLR end "entryRulePropiedad"


    // $ANTLR start "rulePropiedad"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:209:1: rulePropiedad : ( ( rule__Propiedad__Alternatives ) ) ;
    public final void rulePropiedad() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:213:2: ( ( ( rule__Propiedad__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:214:1: ( ( rule__Propiedad__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:214:1: ( ( rule__Propiedad__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:215:1: ( rule__Propiedad__Alternatives )
            {
             before(grammarAccess.getPropiedadAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:216:1: ( rule__Propiedad__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:216:2: rule__Propiedad__Alternatives
            {
            pushFollow(FOLLOW_rule__Propiedad__Alternatives_in_rulePropiedad394);
            rule__Propiedad__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropiedad"


    // $ANTLR start "entryRuleObjeto"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:228:1: entryRuleObjeto : ruleObjeto EOF ;
    public final void entryRuleObjeto() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:229:1: ( ruleObjeto EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:230:1: ruleObjeto EOF
            {
             before(grammarAccess.getObjetoRule()); 
            pushFollow(FOLLOW_ruleObjeto_in_entryRuleObjeto421);
            ruleObjeto();

            state._fsp--;

             after(grammarAccess.getObjetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjeto428); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:237:1: ruleObjeto : ( ( rule__Objeto__Group__0 ) ) ;
    public final void ruleObjeto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:241:2: ( ( ( rule__Objeto__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:242:1: ( ( rule__Objeto__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:242:1: ( ( rule__Objeto__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:243:1: ( rule__Objeto__Group__0 )
            {
             before(grammarAccess.getObjetoAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:244:1: ( rule__Objeto__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:244:2: rule__Objeto__Group__0
            {
            pushFollow(FOLLOW_rule__Objeto__Group__0_in_ruleObjeto454);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:256:1: entryRuleAtributoSimple : ruleAtributoSimple EOF ;
    public final void entryRuleAtributoSimple() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:257:1: ( ruleAtributoSimple EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:258:1: ruleAtributoSimple EOF
            {
             before(grammarAccess.getAtributoSimpleRule()); 
            pushFollow(FOLLOW_ruleAtributoSimple_in_entryRuleAtributoSimple481);
            ruleAtributoSimple();

            state._fsp--;

             after(grammarAccess.getAtributoSimpleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoSimple488); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:265:1: ruleAtributoSimple : ( ( rule__AtributoSimple__Group__0 ) ) ;
    public final void ruleAtributoSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:269:2: ( ( ( rule__AtributoSimple__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:270:1: ( ( rule__AtributoSimple__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:270:1: ( ( rule__AtributoSimple__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:271:1: ( rule__AtributoSimple__Group__0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:272:1: ( rule__AtributoSimple__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:272:2: rule__AtributoSimple__Group__0
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__0_in_ruleAtributoSimple514);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:284:1: entryRuleAtributoInicializado : ruleAtributoInicializado EOF ;
    public final void entryRuleAtributoInicializado() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:285:1: ( ruleAtributoInicializado EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:286:1: ruleAtributoInicializado EOF
            {
             before(grammarAccess.getAtributoInicializadoRule()); 
            pushFollow(FOLLOW_ruleAtributoInicializado_in_entryRuleAtributoInicializado541);
            ruleAtributoInicializado();

            state._fsp--;

             after(grammarAccess.getAtributoInicializadoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoInicializado548); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:293:1: ruleAtributoInicializado : ( ( rule__AtributoInicializado__Group__0 ) ) ;
    public final void ruleAtributoInicializado() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:297:2: ( ( ( rule__AtributoInicializado__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:298:1: ( ( rule__AtributoInicializado__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:298:1: ( ( rule__AtributoInicializado__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:299:1: ( rule__AtributoInicializado__Group__0 )
            {
             before(grammarAccess.getAtributoInicializadoAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:300:1: ( rule__AtributoInicializado__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:300:2: rule__AtributoInicializado__Group__0
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__0_in_ruleAtributoInicializado574);
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


    // $ANTLR start "entryRuleAtributoListaString"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:312:1: entryRuleAtributoListaString : ruleAtributoListaString EOF ;
    public final void entryRuleAtributoListaString() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:313:1: ( ruleAtributoListaString EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:314:1: ruleAtributoListaString EOF
            {
             before(grammarAccess.getAtributoListaStringRule()); 
            pushFollow(FOLLOW_ruleAtributoListaString_in_entryRuleAtributoListaString601);
            ruleAtributoListaString();

            state._fsp--;

             after(grammarAccess.getAtributoListaStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoListaString608); 

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
    // $ANTLR end "entryRuleAtributoListaString"


    // $ANTLR start "ruleAtributoListaString"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:321:1: ruleAtributoListaString : ( ( rule__AtributoListaString__Group__0 ) ) ;
    public final void ruleAtributoListaString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:325:2: ( ( ( rule__AtributoListaString__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:326:1: ( ( rule__AtributoListaString__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:326:1: ( ( rule__AtributoListaString__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:327:1: ( rule__AtributoListaString__Group__0 )
            {
             before(grammarAccess.getAtributoListaStringAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:328:1: ( rule__AtributoListaString__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:328:2: rule__AtributoListaString__Group__0
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group__0_in_ruleAtributoListaString634);
            rule__AtributoListaString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoListaStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoListaString"


    // $ANTLR start "entryRuleAtributoListaInteger"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:340:1: entryRuleAtributoListaInteger : ruleAtributoListaInteger EOF ;
    public final void entryRuleAtributoListaInteger() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:341:1: ( ruleAtributoListaInteger EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:342:1: ruleAtributoListaInteger EOF
            {
             before(grammarAccess.getAtributoListaIntegerRule()); 
            pushFollow(FOLLOW_ruleAtributoListaInteger_in_entryRuleAtributoListaInteger661);
            ruleAtributoListaInteger();

            state._fsp--;

             after(grammarAccess.getAtributoListaIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoListaInteger668); 

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
    // $ANTLR end "entryRuleAtributoListaInteger"


    // $ANTLR start "ruleAtributoListaInteger"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:349:1: ruleAtributoListaInteger : ( ( rule__AtributoListaInteger__Group__0 ) ) ;
    public final void ruleAtributoListaInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:353:2: ( ( ( rule__AtributoListaInteger__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:354:1: ( ( rule__AtributoListaInteger__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:354:1: ( ( rule__AtributoListaInteger__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:355:1: ( rule__AtributoListaInteger__Group__0 )
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:356:1: ( rule__AtributoListaInteger__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:356:2: rule__AtributoListaInteger__Group__0
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__0_in_ruleAtributoListaInteger694);
            rule__AtributoListaInteger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoListaIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoListaInteger"


    // $ANTLR start "entryRuleAtributoLista"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:368:1: entryRuleAtributoLista : ruleAtributoLista EOF ;
    public final void entryRuleAtributoLista() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:369:1: ( ruleAtributoLista EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:370:1: ruleAtributoLista EOF
            {
             before(grammarAccess.getAtributoListaRule()); 
            pushFollow(FOLLOW_ruleAtributoLista_in_entryRuleAtributoLista721);
            ruleAtributoLista();

            state._fsp--;

             after(grammarAccess.getAtributoListaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributoLista728); 

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
    // $ANTLR end "entryRuleAtributoLista"


    // $ANTLR start "ruleAtributoLista"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:377:1: ruleAtributoLista : ( ( rule__AtributoLista__Alternatives ) ) ;
    public final void ruleAtributoLista() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:381:2: ( ( ( rule__AtributoLista__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:382:1: ( ( rule__AtributoLista__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:382:1: ( ( rule__AtributoLista__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:383:1: ( rule__AtributoLista__Alternatives )
            {
             before(grammarAccess.getAtributoListaAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:384:1: ( rule__AtributoLista__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:384:2: rule__AtributoLista__Alternatives
            {
            pushFollow(FOLLOW_rule__AtributoLista__Alternatives_in_ruleAtributoLista754);
            rule__AtributoLista__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtributoListaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoLista"


    // $ANTLR start "entryRuleFormula"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:396:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:397:1: ( ruleFormula EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:398:1: ruleFormula EOF
            {
             before(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula781);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula788); 

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
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:405:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:409:2: ( ( ( rule__Formula__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:410:1: ( ( rule__Formula__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:410:1: ( ( rule__Formula__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:411:1: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:412:1: ( rule__Formula__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:412:2: rule__Formula__Group__0
            {
            pushFollow(FOLLOW_rule__Formula__Group__0_in_ruleFormula814);
            rule__Formula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleAtributo"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:424:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:425:1: ( ruleAtributo EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:426:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_ruleAtributo_in_entryRuleAtributo841);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtributo848); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:433:1: ruleAtributo : ( ( rule__Atributo__Alternatives ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:437:2: ( ( ( rule__Atributo__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:438:1: ( ( rule__Atributo__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:438:1: ( ( rule__Atributo__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:439:1: ( rule__Atributo__Alternatives )
            {
             before(grammarAccess.getAtributoAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:440:1: ( rule__Atributo__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:440:2: rule__Atributo__Alternatives
            {
            pushFollow(FOLLOW_rule__Atributo__Alternatives_in_ruleAtributo874);
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


    // $ANTLR start "entryRuleStatement"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:454:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:455:1: ( ruleStatement EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:456:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement903);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement910); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:463:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:467:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:468:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:468:1: ( ( rule__Statement__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:469:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:470:1: ( rule__Statement__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:470:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement936);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:482:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:483:1: ( ruleDefinition EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:484:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition963);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition970); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:491:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:495:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:496:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:496:1: ( ( rule__Definition__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:497:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:498:1: ( rule__Definition__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:498:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition996);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:510:1: entryRuleEvaluation : ruleEvaluation EOF ;
    public final void entryRuleEvaluation() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:511:1: ( ruleEvaluation EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:512:1: ruleEvaluation EOF
            {
             before(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation1023);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getEvaluationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation1030); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:519:1: ruleEvaluation : ( ( rule__Evaluation__Group__0 ) ) ;
    public final void ruleEvaluation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:523:2: ( ( ( rule__Evaluation__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:524:1: ( ( rule__Evaluation__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:524:1: ( ( rule__Evaluation__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:525:1: ( rule__Evaluation__Group__0 )
            {
             before(grammarAccess.getEvaluationAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:526:1: ( rule__Evaluation__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:526:2: rule__Evaluation__Group__0
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation1056);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:538:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:539:1: ( ruleExpression EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:540:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1083);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1090); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:547:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:551:2: ( ( ruleAddition ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:552:1: ( ruleAddition )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:552:1: ( ruleAddition )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:553:1: ruleAddition
            {
             before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_ruleAddition_in_ruleExpression1116);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:566:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:567:1: ( ruleAddition EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:568:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1142);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1149); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:575:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:579:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:580:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:580:1: ( ( rule__Addition__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:581:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:582:1: ( rule__Addition__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:582:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1175);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:594:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:595:1: ( ruleMultiplication EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:596:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1202);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1209); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:603:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:607:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:608:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:608:1: ( ( rule__Multiplication__Group__0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:609:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:610:1: ( rule__Multiplication__Group__0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:610:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1235);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:622:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:623:1: ( rulePrimaryExpression EOF )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:624:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1262);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1269); 

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:631:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:635:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:636:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:636:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:637:1: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:638:1: ( rule__PrimaryExpression__Alternatives )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:638:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1295);
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


    // $ANTLR start "rule__Entidad__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:650:1: rule__Entidad__Alternatives : ( ( ruleRegistro ) | ( ruleContacto ) | ( rulePago ) );
    public final void rule__Entidad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:654:1: ( ( ruleRegistro ) | ( ruleContacto ) | ( rulePago ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:655:1: ( ruleRegistro )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:655:1: ( ruleRegistro )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:656:1: ruleRegistro
                    {
                     before(grammarAccess.getEntidadAccess().getRegistroParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRegistro_in_rule__Entidad__Alternatives1331);
                    ruleRegistro();

                    state._fsp--;

                     after(grammarAccess.getEntidadAccess().getRegistroParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:661:6: ( ruleContacto )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:661:6: ( ruleContacto )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:662:1: ruleContacto
                    {
                     before(grammarAccess.getEntidadAccess().getContactoParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleContacto_in_rule__Entidad__Alternatives1348);
                    ruleContacto();

                    state._fsp--;

                     after(grammarAccess.getEntidadAccess().getContactoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:667:6: ( rulePago )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:667:6: ( rulePago )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:668:1: rulePago
                    {
                     before(grammarAccess.getEntidadAccess().getPagoParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePago_in_rule__Entidad__Alternatives1365);
                    rulePago();

                    state._fsp--;

                     after(grammarAccess.getEntidadAccess().getPagoParserRuleCall_2()); 

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
    // $ANTLR end "rule__Entidad__Alternatives"


    // $ANTLR start "rule__Propiedad__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:678:1: rule__Propiedad__Alternatives : ( ( ruleObjeto ) | ( ruleAtributo ) );
    public final void rule__Propiedad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:682:1: ( ( ruleObjeto ) | ( ruleAtributo ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_STRING||LA2_1==13) ) {
                    alt2=1;
                }
                else if ( (LA2_1==18) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:683:1: ( ruleObjeto )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:683:1: ( ruleObjeto )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:684:1: ruleObjeto
                    {
                     before(grammarAccess.getPropiedadAccess().getObjetoParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleObjeto_in_rule__Propiedad__Alternatives1397);
                    ruleObjeto();

                    state._fsp--;

                     after(grammarAccess.getPropiedadAccess().getObjetoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:689:6: ( ruleAtributo )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:689:6: ( ruleAtributo )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:690:1: ruleAtributo
                    {
                     before(grammarAccess.getPropiedadAccess().getAtributoParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtributo_in_rule__Propiedad__Alternatives1414);
                    ruleAtributo();

                    state._fsp--;

                     after(grammarAccess.getPropiedadAccess().getAtributoParserRuleCall_1()); 

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
    // $ANTLR end "rule__Propiedad__Alternatives"


    // $ANTLR start "rule__AtributoSimple__NombreAlternatives_1_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:700:1: rule__AtributoSimple__NombreAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__AtributoSimple__NombreAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:704:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:705:1: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:705:1: ( RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:706:1: RULE_ID
                    {
                     before(grammarAccess.getAtributoSimpleAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtributoSimple__NombreAlternatives_1_01446); 
                     after(grammarAccess.getAtributoSimpleAccess().getNombreIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:711:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:711:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:712:1: RULE_STRING
                    {
                     before(grammarAccess.getAtributoSimpleAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AtributoSimple__NombreAlternatives_1_01463); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:722:1: rule__AtributoInicializado__NombreAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__AtributoInicializado__NombreAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:726:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:727:1: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:727:1: ( RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:728:1: RULE_ID
                    {
                     before(grammarAccess.getAtributoInicializadoAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtributoInicializado__NombreAlternatives_1_01495); 
                     after(grammarAccess.getAtributoInicializadoAccess().getNombreIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:733:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:733:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:734:1: RULE_STRING
                    {
                     before(grammarAccess.getAtributoInicializadoAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AtributoInicializado__NombreAlternatives_1_01512); 
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


    // $ANTLR start "rule__AtributoListaString__NombreAlternatives_1_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:744:1: rule__AtributoListaString__NombreAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__AtributoListaString__NombreAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:748:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:749:1: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:749:1: ( RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:750:1: RULE_ID
                    {
                     before(grammarAccess.getAtributoListaStringAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtributoListaString__NombreAlternatives_1_01544); 
                     after(grammarAccess.getAtributoListaStringAccess().getNombreIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:755:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:755:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:756:1: RULE_STRING
                    {
                     before(grammarAccess.getAtributoListaStringAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AtributoListaString__NombreAlternatives_1_01561); 
                     after(grammarAccess.getAtributoListaStringAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__AtributoListaString__NombreAlternatives_1_0"


    // $ANTLR start "rule__AtributoListaInteger__NombreAlternatives_1_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:766:1: rule__AtributoListaInteger__NombreAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__AtributoListaInteger__NombreAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:770:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:771:1: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:771:1: ( RULE_ID )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:772:1: RULE_ID
                    {
                     before(grammarAccess.getAtributoListaIntegerAccess().getNombreIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtributoListaInteger__NombreAlternatives_1_01593); 
                     after(grammarAccess.getAtributoListaIntegerAccess().getNombreIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:777:6: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:777:6: ( RULE_STRING )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:778:1: RULE_STRING
                    {
                     before(grammarAccess.getAtributoListaIntegerAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AtributoListaInteger__NombreAlternatives_1_01610); 
                     after(grammarAccess.getAtributoListaIntegerAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__AtributoListaInteger__NombreAlternatives_1_0"


    // $ANTLR start "rule__AtributoLista__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:788:1: rule__AtributoLista__Alternatives : ( ( ruleAtributoListaString ) | ( ruleAtributoListaInteger ) );
    public final void rule__AtributoLista__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:792:1: ( ( ruleAtributoListaString ) | ( ruleAtributoListaInteger ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==18) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==21) ) {
                        alt7=1;
                    }
                    else if ( (LA7_3==23) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_STRING) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==18) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==21) ) {
                        alt7=1;
                    }
                    else if ( (LA7_3==23) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:793:1: ( ruleAtributoListaString )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:793:1: ( ruleAtributoListaString )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:794:1: ruleAtributoListaString
                    {
                     before(grammarAccess.getAtributoListaAccess().getAtributoListaStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtributoListaString_in_rule__AtributoLista__Alternatives1642);
                    ruleAtributoListaString();

                    state._fsp--;

                     after(grammarAccess.getAtributoListaAccess().getAtributoListaStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:799:6: ( ruleAtributoListaInteger )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:799:6: ( ruleAtributoListaInteger )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:800:1: ruleAtributoListaInteger
                    {
                     before(grammarAccess.getAtributoListaAccess().getAtributoListaIntegerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtributoListaInteger_in_rule__AtributoLista__Alternatives1659);
                    ruleAtributoListaInteger();

                    state._fsp--;

                     after(grammarAccess.getAtributoListaAccess().getAtributoListaIntegerParserRuleCall_1()); 

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
    // $ANTLR end "rule__AtributoLista__Alternatives"


    // $ANTLR start "rule__Atributo__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:810:1: rule__Atributo__Alternatives : ( ( ruleAtributoSimple ) | ( ruleAtributoInicializado ) | ( ruleAtributoLista ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:814:1: ( ( ruleAtributoSimple ) | ( ruleAtributoInicializado ) | ( ruleAtributoLista ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==18) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==RULE_DATATYPE) ) {
                        int LA8_4 = input.LA(4);

                        if ( (LA8_4==20) ) {
                            alt8=2;
                        }
                        else if ( (LA8_4==19) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA8_3==21||LA8_3==23) ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_STRING) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==18) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==RULE_DATATYPE) ) {
                        int LA8_4 = input.LA(4);

                        if ( (LA8_4==20) ) {
                            alt8=2;
                        }
                        else if ( (LA8_4==19) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA8_3==21||LA8_3==23) ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:815:1: ( ruleAtributoSimple )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:815:1: ( ruleAtributoSimple )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:816:1: ruleAtributoSimple
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAtributoSimple_in_rule__Atributo__Alternatives1691);
                    ruleAtributoSimple();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:821:6: ( ruleAtributoInicializado )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:821:6: ( ruleAtributoInicializado )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:822:1: ruleAtributoInicializado
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoInicializadoParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtributoInicializado_in_rule__Atributo__Alternatives1708);
                    ruleAtributoInicializado();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoInicializadoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:827:6: ( ruleAtributoLista )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:827:6: ( ruleAtributoLista )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:828:1: ruleAtributoLista
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoListaParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtributoLista_in_rule__Atributo__Alternatives1725);
                    ruleAtributoLista();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoListaParserRuleCall_2()); 

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


    // $ANTLR start "rule__Statement__Alternatives"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:838:1: rule__Statement__Alternatives : ( ( ruleDefinition ) | ( ruleEvaluation ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:842:1: ( ( ruleDefinition ) | ( ruleEvaluation ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==RULE_NUMBER||LA9_0==30) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:843:1: ( ruleDefinition )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:843:1: ( ruleDefinition )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:844:1: ruleDefinition
                    {
                     before(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefinition_in_rule__Statement__Alternatives1757);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:849:6: ( ruleEvaluation )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:849:6: ( ruleEvaluation )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:850:1: ruleEvaluation
                    {
                     before(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEvaluation_in_rule__Statement__Alternatives1774);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:860:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:864:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:865:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:865:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:866:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:867:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:867:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01806);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:871:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:871:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:872:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:873:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:873:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01824);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:882:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:886:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:887:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:887:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:888:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:889:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:889:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01857);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:893:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:893:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:894:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:895:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:895:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01875);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:904:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:908:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            case RULE_ID:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:909:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:909:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:910:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:911:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:911:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1908);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:915:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:915:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:916:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:917:1: ( rule__PrimaryExpression__Group_1__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:917:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1926);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:921:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:921:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:922:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:923:1: ( rule__PrimaryExpression__Group_2__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:923:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1944);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:927:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:927:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:928:1: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:929:1: ( rule__PrimaryExpression__Group_3__0 )
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:929:2: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives1962);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:940:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:944:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:945:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01993);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01996);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:952:1: rule__Model__Group__0__Impl : ( ( rule__Model__NombreAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:956:1: ( ( ( rule__Model__NombreAssignment_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:957:1: ( ( rule__Model__NombreAssignment_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:957:1: ( ( rule__Model__NombreAssignment_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:958:1: ( rule__Model__NombreAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getNombreAssignment_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:959:1: ( rule__Model__NombreAssignment_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:959:2: rule__Model__NombreAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__NombreAssignment_0_in_rule__Model__Group__0__Impl2023);
            rule__Model__NombreAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNombreAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:969:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:973:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:974:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12053);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12056);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:981:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:985:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:986:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:986:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:987:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Model__Group__1__Impl2084); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1000:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1004:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1005:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22115);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22118);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1012:1: rule__Model__Group__2__Impl : ( ( rule__Model__EntidadesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1016:1: ( ( ( rule__Model__EntidadesAssignment_2 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1017:1: ( ( rule__Model__EntidadesAssignment_2 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1017:1: ( ( rule__Model__EntidadesAssignment_2 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1018:1: ( rule__Model__EntidadesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getEntidadesAssignment_2()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1019:1: ( rule__Model__EntidadesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=15 && LA13_0<=17)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1019:2: rule__Model__EntidadesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__EntidadesAssignment_2_in_rule__Model__Group__2__Impl2145);
            	    rule__Model__EntidadesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntidadesAssignment_2()); 

            }


            }

        }
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1029:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1033:1: ( rule__Model__Group__3__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1034:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32176);
            rule__Model__Group__3__Impl();

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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1040:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1044:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1045:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1045:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1046:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Model__Group__3__Impl2204); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Registro__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1067:1: rule__Registro__Group__0 : rule__Registro__Group__0__Impl rule__Registro__Group__1 ;
    public final void rule__Registro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1071:1: ( rule__Registro__Group__0__Impl rule__Registro__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1072:2: rule__Registro__Group__0__Impl rule__Registro__Group__1
            {
            pushFollow(FOLLOW_rule__Registro__Group__0__Impl_in_rule__Registro__Group__02243);
            rule__Registro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Registro__Group__1_in_rule__Registro__Group__02246);
            rule__Registro__Group__1();

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
    // $ANTLR end "rule__Registro__Group__0"


    // $ANTLR start "rule__Registro__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1079:1: rule__Registro__Group__0__Impl : ( () ) ;
    public final void rule__Registro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1083:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1084:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1084:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1085:1: ()
            {
             before(grammarAccess.getRegistroAccess().getRegistroAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1086:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1088:1: 
            {
            }

             after(grammarAccess.getRegistroAccess().getRegistroAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__0__Impl"


    // $ANTLR start "rule__Registro__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1098:1: rule__Registro__Group__1 : rule__Registro__Group__1__Impl rule__Registro__Group__2 ;
    public final void rule__Registro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1102:1: ( rule__Registro__Group__1__Impl rule__Registro__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1103:2: rule__Registro__Group__1__Impl rule__Registro__Group__2
            {
            pushFollow(FOLLOW_rule__Registro__Group__1__Impl_in_rule__Registro__Group__12304);
            rule__Registro__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Registro__Group__2_in_rule__Registro__Group__12307);
            rule__Registro__Group__2();

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
    // $ANTLR end "rule__Registro__Group__1"


    // $ANTLR start "rule__Registro__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1110:1: rule__Registro__Group__1__Impl : ( 'Registro' ) ;
    public final void rule__Registro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1114:1: ( ( 'Registro' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1115:1: ( 'Registro' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1115:1: ( 'Registro' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1116:1: 'Registro'
            {
             before(grammarAccess.getRegistroAccess().getRegistroKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Registro__Group__1__Impl2335); 
             after(grammarAccess.getRegistroAccess().getRegistroKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__1__Impl"


    // $ANTLR start "rule__Registro__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1129:1: rule__Registro__Group__2 : rule__Registro__Group__2__Impl rule__Registro__Group__3 ;
    public final void rule__Registro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1133:1: ( rule__Registro__Group__2__Impl rule__Registro__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1134:2: rule__Registro__Group__2__Impl rule__Registro__Group__3
            {
            pushFollow(FOLLOW_rule__Registro__Group__2__Impl_in_rule__Registro__Group__22366);
            rule__Registro__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Registro__Group__3_in_rule__Registro__Group__22369);
            rule__Registro__Group__3();

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
    // $ANTLR end "rule__Registro__Group__2"


    // $ANTLR start "rule__Registro__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1141:1: rule__Registro__Group__2__Impl : ( ( rule__Registro__NombreAssignment_2 ) ) ;
    public final void rule__Registro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1145:1: ( ( ( rule__Registro__NombreAssignment_2 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1146:1: ( ( rule__Registro__NombreAssignment_2 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1146:1: ( ( rule__Registro__NombreAssignment_2 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1147:1: ( rule__Registro__NombreAssignment_2 )
            {
             before(grammarAccess.getRegistroAccess().getNombreAssignment_2()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1148:1: ( rule__Registro__NombreAssignment_2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1148:2: rule__Registro__NombreAssignment_2
            {
            pushFollow(FOLLOW_rule__Registro__NombreAssignment_2_in_rule__Registro__Group__2__Impl2396);
            rule__Registro__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegistroAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__2__Impl"


    // $ANTLR start "rule__Registro__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1158:1: rule__Registro__Group__3 : rule__Registro__Group__3__Impl rule__Registro__Group__4 ;
    public final void rule__Registro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1162:1: ( rule__Registro__Group__3__Impl rule__Registro__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1163:2: rule__Registro__Group__3__Impl rule__Registro__Group__4
            {
            pushFollow(FOLLOW_rule__Registro__Group__3__Impl_in_rule__Registro__Group__32426);
            rule__Registro__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Registro__Group__4_in_rule__Registro__Group__32429);
            rule__Registro__Group__4();

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
    // $ANTLR end "rule__Registro__Group__3"


    // $ANTLR start "rule__Registro__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1170:1: rule__Registro__Group__3__Impl : ( '{' ) ;
    public final void rule__Registro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1174:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1175:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1175:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1176:1: '{'
            {
             before(grammarAccess.getRegistroAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Registro__Group__3__Impl2457); 
             after(grammarAccess.getRegistroAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__3__Impl"


    // $ANTLR start "rule__Registro__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1189:1: rule__Registro__Group__4 : rule__Registro__Group__4__Impl rule__Registro__Group__5 ;
    public final void rule__Registro__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1193:1: ( rule__Registro__Group__4__Impl rule__Registro__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1194:2: rule__Registro__Group__4__Impl rule__Registro__Group__5
            {
            pushFollow(FOLLOW_rule__Registro__Group__4__Impl_in_rule__Registro__Group__42488);
            rule__Registro__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Registro__Group__5_in_rule__Registro__Group__42491);
            rule__Registro__Group__5();

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
    // $ANTLR end "rule__Registro__Group__4"


    // $ANTLR start "rule__Registro__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1201:1: rule__Registro__Group__4__Impl : ( ( rule__Registro__PropiedadesAssignment_4 )* ) ;
    public final void rule__Registro__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1205:1: ( ( ( rule__Registro__PropiedadesAssignment_4 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1206:1: ( ( rule__Registro__PropiedadesAssignment_4 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1206:1: ( ( rule__Registro__PropiedadesAssignment_4 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1207:1: ( rule__Registro__PropiedadesAssignment_4 )*
            {
             before(grammarAccess.getRegistroAccess().getPropiedadesAssignment_4()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1208:1: ( rule__Registro__PropiedadesAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1208:2: rule__Registro__PropiedadesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Registro__PropiedadesAssignment_4_in_rule__Registro__Group__4__Impl2518);
            	    rule__Registro__PropiedadesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRegistroAccess().getPropiedadesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__4__Impl"


    // $ANTLR start "rule__Registro__Group__5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1218:1: rule__Registro__Group__5 : rule__Registro__Group__5__Impl rule__Registro__Group__6 ;
    public final void rule__Registro__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1222:1: ( rule__Registro__Group__5__Impl rule__Registro__Group__6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1223:2: rule__Registro__Group__5__Impl rule__Registro__Group__6
            {
            pushFollow(FOLLOW_rule__Registro__Group__5__Impl_in_rule__Registro__Group__52549);
            rule__Registro__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Registro__Group__6_in_rule__Registro__Group__52552);
            rule__Registro__Group__6();

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
    // $ANTLR end "rule__Registro__Group__5"


    // $ANTLR start "rule__Registro__Group__5__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1230:1: rule__Registro__Group__5__Impl : ( ( rule__Registro__FormulaAssignment_5 ) ) ;
    public final void rule__Registro__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1234:1: ( ( ( rule__Registro__FormulaAssignment_5 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1235:1: ( ( rule__Registro__FormulaAssignment_5 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1235:1: ( ( rule__Registro__FormulaAssignment_5 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1236:1: ( rule__Registro__FormulaAssignment_5 )
            {
             before(grammarAccess.getRegistroAccess().getFormulaAssignment_5()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1237:1: ( rule__Registro__FormulaAssignment_5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1237:2: rule__Registro__FormulaAssignment_5
            {
            pushFollow(FOLLOW_rule__Registro__FormulaAssignment_5_in_rule__Registro__Group__5__Impl2579);
            rule__Registro__FormulaAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRegistroAccess().getFormulaAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__5__Impl"


    // $ANTLR start "rule__Registro__Group__6"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1247:1: rule__Registro__Group__6 : rule__Registro__Group__6__Impl ;
    public final void rule__Registro__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1251:1: ( rule__Registro__Group__6__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1252:2: rule__Registro__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Registro__Group__6__Impl_in_rule__Registro__Group__62609);
            rule__Registro__Group__6__Impl();

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
    // $ANTLR end "rule__Registro__Group__6"


    // $ANTLR start "rule__Registro__Group__6__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1258:1: rule__Registro__Group__6__Impl : ( '}' ) ;
    public final void rule__Registro__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1262:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1263:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1263:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1264:1: '}'
            {
             before(grammarAccess.getRegistroAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Registro__Group__6__Impl2637); 
             after(grammarAccess.getRegistroAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__6__Impl"


    // $ANTLR start "rule__Contacto__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1291:1: rule__Contacto__Group__0 : rule__Contacto__Group__0__Impl rule__Contacto__Group__1 ;
    public final void rule__Contacto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1295:1: ( rule__Contacto__Group__0__Impl rule__Contacto__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1296:2: rule__Contacto__Group__0__Impl rule__Contacto__Group__1
            {
            pushFollow(FOLLOW_rule__Contacto__Group__0__Impl_in_rule__Contacto__Group__02682);
            rule__Contacto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Contacto__Group__1_in_rule__Contacto__Group__02685);
            rule__Contacto__Group__1();

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
    // $ANTLR end "rule__Contacto__Group__0"


    // $ANTLR start "rule__Contacto__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1303:1: rule__Contacto__Group__0__Impl : ( () ) ;
    public final void rule__Contacto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1307:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1308:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1308:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1309:1: ()
            {
             before(grammarAccess.getContactoAccess().getContactoAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1310:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1312:1: 
            {
            }

             after(grammarAccess.getContactoAccess().getContactoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacto__Group__0__Impl"


    // $ANTLR start "rule__Contacto__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1322:1: rule__Contacto__Group__1 : rule__Contacto__Group__1__Impl rule__Contacto__Group__2 ;
    public final void rule__Contacto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1326:1: ( rule__Contacto__Group__1__Impl rule__Contacto__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1327:2: rule__Contacto__Group__1__Impl rule__Contacto__Group__2
            {
            pushFollow(FOLLOW_rule__Contacto__Group__1__Impl_in_rule__Contacto__Group__12743);
            rule__Contacto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Contacto__Group__2_in_rule__Contacto__Group__12746);
            rule__Contacto__Group__2();

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
    // $ANTLR end "rule__Contacto__Group__1"


    // $ANTLR start "rule__Contacto__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1334:1: rule__Contacto__Group__1__Impl : ( 'Contacto' ) ;
    public final void rule__Contacto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1338:1: ( ( 'Contacto' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1339:1: ( 'Contacto' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1339:1: ( 'Contacto' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1340:1: 'Contacto'
            {
             before(grammarAccess.getContactoAccess().getContactoKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Contacto__Group__1__Impl2774); 
             after(grammarAccess.getContactoAccess().getContactoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacto__Group__1__Impl"


    // $ANTLR start "rule__Contacto__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1353:1: rule__Contacto__Group__2 : rule__Contacto__Group__2__Impl rule__Contacto__Group__3 ;
    public final void rule__Contacto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1357:1: ( rule__Contacto__Group__2__Impl rule__Contacto__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1358:2: rule__Contacto__Group__2__Impl rule__Contacto__Group__3
            {
            pushFollow(FOLLOW_rule__Contacto__Group__2__Impl_in_rule__Contacto__Group__22805);
            rule__Contacto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Contacto__Group__3_in_rule__Contacto__Group__22808);
            rule__Contacto__Group__3();

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
    // $ANTLR end "rule__Contacto__Group__2"


    // $ANTLR start "rule__Contacto__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1365:1: rule__Contacto__Group__2__Impl : ( ( rule__Contacto__NombreAssignment_2 ) ) ;
    public final void rule__Contacto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1369:1: ( ( ( rule__Contacto__NombreAssignment_2 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1370:1: ( ( rule__Contacto__NombreAssignment_2 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1370:1: ( ( rule__Contacto__NombreAssignment_2 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1371:1: ( rule__Contacto__NombreAssignment_2 )
            {
             before(grammarAccess.getContactoAccess().getNombreAssignment_2()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1372:1: ( rule__Contacto__NombreAssignment_2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1372:2: rule__Contacto__NombreAssignment_2
            {
            pushFollow(FOLLOW_rule__Contacto__NombreAssignment_2_in_rule__Contacto__Group__2__Impl2835);
            rule__Contacto__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContactoAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacto__Group__2__Impl"


    // $ANTLR start "rule__Contacto__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1382:1: rule__Contacto__Group__3 : rule__Contacto__Group__3__Impl rule__Contacto__Group__4 ;
    public final void rule__Contacto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1386:1: ( rule__Contacto__Group__3__Impl rule__Contacto__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1387:2: rule__Contacto__Group__3__Impl rule__Contacto__Group__4
            {
            pushFollow(FOLLOW_rule__Contacto__Group__3__Impl_in_rule__Contacto__Group__32865);
            rule__Contacto__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Contacto__Group__4_in_rule__Contacto__Group__32868);
            rule__Contacto__Group__4();

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
    // $ANTLR end "rule__Contacto__Group__3"


    // $ANTLR start "rule__Contacto__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1394:1: rule__Contacto__Group__3__Impl : ( '{' ) ;
    public final void rule__Contacto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1398:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1399:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1399:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1400:1: '{'
            {
             before(grammarAccess.getContactoAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Contacto__Group__3__Impl2896); 
             after(grammarAccess.getContactoAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacto__Group__3__Impl"


    // $ANTLR start "rule__Contacto__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1413:1: rule__Contacto__Group__4 : rule__Contacto__Group__4__Impl rule__Contacto__Group__5 ;
    public final void rule__Contacto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1417:1: ( rule__Contacto__Group__4__Impl rule__Contacto__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1418:2: rule__Contacto__Group__4__Impl rule__Contacto__Group__5
            {
            pushFollow(FOLLOW_rule__Contacto__Group__4__Impl_in_rule__Contacto__Group__42927);
            rule__Contacto__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Contacto__Group__5_in_rule__Contacto__Group__42930);
            rule__Contacto__Group__5();

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
    // $ANTLR end "rule__Contacto__Group__4"


    // $ANTLR start "rule__Contacto__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1425:1: rule__Contacto__Group__4__Impl : ( ( rule__Contacto__PropiedadesAssignment_4 )* ) ;
    public final void rule__Contacto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1429:1: ( ( ( rule__Contacto__PropiedadesAssignment_4 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1430:1: ( ( rule__Contacto__PropiedadesAssignment_4 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1430:1: ( ( rule__Contacto__PropiedadesAssignment_4 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1431:1: ( rule__Contacto__PropiedadesAssignment_4 )*
            {
             before(grammarAccess.getContactoAccess().getPropiedadesAssignment_4()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1432:1: ( rule__Contacto__PropiedadesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1432:2: rule__Contacto__PropiedadesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Contacto__PropiedadesAssignment_4_in_rule__Contacto__Group__4__Impl2957);
            	    rule__Contacto__PropiedadesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getContactoAccess().getPropiedadesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacto__Group__4__Impl"


    // $ANTLR start "rule__Contacto__Group__5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1442:1: rule__Contacto__Group__5 : rule__Contacto__Group__5__Impl ;
    public final void rule__Contacto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1446:1: ( rule__Contacto__Group__5__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1447:2: rule__Contacto__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Contacto__Group__5__Impl_in_rule__Contacto__Group__52988);
            rule__Contacto__Group__5__Impl();

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
    // $ANTLR end "rule__Contacto__Group__5"


    // $ANTLR start "rule__Contacto__Group__5__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1453:1: rule__Contacto__Group__5__Impl : ( '}' ) ;
    public final void rule__Contacto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1457:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1458:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1458:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1459:1: '}'
            {
             before(grammarAccess.getContactoAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Contacto__Group__5__Impl3016); 
             after(grammarAccess.getContactoAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacto__Group__5__Impl"


    // $ANTLR start "rule__Pago__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1484:1: rule__Pago__Group__0 : rule__Pago__Group__0__Impl rule__Pago__Group__1 ;
    public final void rule__Pago__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1488:1: ( rule__Pago__Group__0__Impl rule__Pago__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1489:2: rule__Pago__Group__0__Impl rule__Pago__Group__1
            {
            pushFollow(FOLLOW_rule__Pago__Group__0__Impl_in_rule__Pago__Group__03059);
            rule__Pago__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pago__Group__1_in_rule__Pago__Group__03062);
            rule__Pago__Group__1();

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
    // $ANTLR end "rule__Pago__Group__0"


    // $ANTLR start "rule__Pago__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1496:1: rule__Pago__Group__0__Impl : ( () ) ;
    public final void rule__Pago__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1500:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1501:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1501:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1502:1: ()
            {
             before(grammarAccess.getPagoAccess().getPagoAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1503:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1505:1: 
            {
            }

             after(grammarAccess.getPagoAccess().getPagoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pago__Group__0__Impl"


    // $ANTLR start "rule__Pago__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1515:1: rule__Pago__Group__1 : rule__Pago__Group__1__Impl rule__Pago__Group__2 ;
    public final void rule__Pago__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1519:1: ( rule__Pago__Group__1__Impl rule__Pago__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1520:2: rule__Pago__Group__1__Impl rule__Pago__Group__2
            {
            pushFollow(FOLLOW_rule__Pago__Group__1__Impl_in_rule__Pago__Group__13120);
            rule__Pago__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pago__Group__2_in_rule__Pago__Group__13123);
            rule__Pago__Group__2();

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
    // $ANTLR end "rule__Pago__Group__1"


    // $ANTLR start "rule__Pago__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1527:1: rule__Pago__Group__1__Impl : ( 'Pago' ) ;
    public final void rule__Pago__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1531:1: ( ( 'Pago' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1532:1: ( 'Pago' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1532:1: ( 'Pago' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1533:1: 'Pago'
            {
             before(grammarAccess.getPagoAccess().getPagoKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Pago__Group__1__Impl3151); 
             after(grammarAccess.getPagoAccess().getPagoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pago__Group__1__Impl"


    // $ANTLR start "rule__Pago__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1546:1: rule__Pago__Group__2 : rule__Pago__Group__2__Impl rule__Pago__Group__3 ;
    public final void rule__Pago__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1550:1: ( rule__Pago__Group__2__Impl rule__Pago__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1551:2: rule__Pago__Group__2__Impl rule__Pago__Group__3
            {
            pushFollow(FOLLOW_rule__Pago__Group__2__Impl_in_rule__Pago__Group__23182);
            rule__Pago__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pago__Group__3_in_rule__Pago__Group__23185);
            rule__Pago__Group__3();

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
    // $ANTLR end "rule__Pago__Group__2"


    // $ANTLR start "rule__Pago__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1558:1: rule__Pago__Group__2__Impl : ( ( rule__Pago__NombreAssignment_2 ) ) ;
    public final void rule__Pago__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1562:1: ( ( ( rule__Pago__NombreAssignment_2 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1563:1: ( ( rule__Pago__NombreAssignment_2 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1563:1: ( ( rule__Pago__NombreAssignment_2 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1564:1: ( rule__Pago__NombreAssignment_2 )
            {
             before(grammarAccess.getPagoAccess().getNombreAssignment_2()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1565:1: ( rule__Pago__NombreAssignment_2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1565:2: rule__Pago__NombreAssignment_2
            {
            pushFollow(FOLLOW_rule__Pago__NombreAssignment_2_in_rule__Pago__Group__2__Impl3212);
            rule__Pago__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPagoAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pago__Group__2__Impl"


    // $ANTLR start "rule__Pago__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1575:1: rule__Pago__Group__3 : rule__Pago__Group__3__Impl rule__Pago__Group__4 ;
    public final void rule__Pago__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1579:1: ( rule__Pago__Group__3__Impl rule__Pago__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1580:2: rule__Pago__Group__3__Impl rule__Pago__Group__4
            {
            pushFollow(FOLLOW_rule__Pago__Group__3__Impl_in_rule__Pago__Group__33242);
            rule__Pago__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pago__Group__4_in_rule__Pago__Group__33245);
            rule__Pago__Group__4();

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
    // $ANTLR end "rule__Pago__Group__3"


    // $ANTLR start "rule__Pago__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1587:1: rule__Pago__Group__3__Impl : ( '{' ) ;
    public final void rule__Pago__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1591:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1592:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1592:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1593:1: '{'
            {
             before(grammarAccess.getPagoAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Pago__Group__3__Impl3273); 
             after(grammarAccess.getPagoAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pago__Group__3__Impl"


    // $ANTLR start "rule__Pago__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1606:1: rule__Pago__Group__4 : rule__Pago__Group__4__Impl rule__Pago__Group__5 ;
    public final void rule__Pago__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1610:1: ( rule__Pago__Group__4__Impl rule__Pago__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1611:2: rule__Pago__Group__4__Impl rule__Pago__Group__5
            {
            pushFollow(FOLLOW_rule__Pago__Group__4__Impl_in_rule__Pago__Group__43304);
            rule__Pago__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pago__Group__5_in_rule__Pago__Group__43307);
            rule__Pago__Group__5();

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
    // $ANTLR end "rule__Pago__Group__4"


    // $ANTLR start "rule__Pago__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1618:1: rule__Pago__Group__4__Impl : ( ( rule__Pago__PropiedadesAssignment_4 )* ) ;
    public final void rule__Pago__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1622:1: ( ( ( rule__Pago__PropiedadesAssignment_4 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1623:1: ( ( rule__Pago__PropiedadesAssignment_4 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1623:1: ( ( rule__Pago__PropiedadesAssignment_4 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1624:1: ( rule__Pago__PropiedadesAssignment_4 )*
            {
             before(grammarAccess.getPagoAccess().getPropiedadesAssignment_4()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1625:1: ( rule__Pago__PropiedadesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1625:2: rule__Pago__PropiedadesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Pago__PropiedadesAssignment_4_in_rule__Pago__Group__4__Impl3334);
            	    rule__Pago__PropiedadesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPagoAccess().getPropiedadesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pago__Group__4__Impl"


    // $ANTLR start "rule__Pago__Group__5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1635:1: rule__Pago__Group__5 : rule__Pago__Group__5__Impl ;
    public final void rule__Pago__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1639:1: ( rule__Pago__Group__5__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1640:2: rule__Pago__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Pago__Group__5__Impl_in_rule__Pago__Group__53365);
            rule__Pago__Group__5__Impl();

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
    // $ANTLR end "rule__Pago__Group__5"


    // $ANTLR start "rule__Pago__Group__5__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1646:1: rule__Pago__Group__5__Impl : ( '}' ) ;
    public final void rule__Pago__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1650:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1651:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1651:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1652:1: '}'
            {
             before(grammarAccess.getPagoAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Pago__Group__5__Impl3393); 
             after(grammarAccess.getPagoAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pago__Group__5__Impl"


    // $ANTLR start "rule__Objeto__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1677:1: rule__Objeto__Group__0 : rule__Objeto__Group__0__Impl rule__Objeto__Group__1 ;
    public final void rule__Objeto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1681:1: ( rule__Objeto__Group__0__Impl rule__Objeto__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1682:2: rule__Objeto__Group__0__Impl rule__Objeto__Group__1
            {
            pushFollow(FOLLOW_rule__Objeto__Group__0__Impl_in_rule__Objeto__Group__03436);
            rule__Objeto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__1_in_rule__Objeto__Group__03439);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1689:1: rule__Objeto__Group__0__Impl : ( () ) ;
    public final void rule__Objeto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1693:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1694:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1694:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1695:1: ()
            {
             before(grammarAccess.getObjetoAccess().getObjetoAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1696:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1698:1: 
            {
            }

             after(grammarAccess.getObjetoAccess().getObjetoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__0__Impl"


    // $ANTLR start "rule__Objeto__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1708:1: rule__Objeto__Group__1 : rule__Objeto__Group__1__Impl rule__Objeto__Group__2 ;
    public final void rule__Objeto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1712:1: ( rule__Objeto__Group__1__Impl rule__Objeto__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1713:2: rule__Objeto__Group__1__Impl rule__Objeto__Group__2
            {
            pushFollow(FOLLOW_rule__Objeto__Group__1__Impl_in_rule__Objeto__Group__13497);
            rule__Objeto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__2_in_rule__Objeto__Group__13500);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1720:1: rule__Objeto__Group__1__Impl : ( ( rule__Objeto__NombreAssignment_1 ) ) ;
    public final void rule__Objeto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1724:1: ( ( ( rule__Objeto__NombreAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1725:1: ( ( rule__Objeto__NombreAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1725:1: ( ( rule__Objeto__NombreAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1726:1: ( rule__Objeto__NombreAssignment_1 )
            {
             before(grammarAccess.getObjetoAccess().getNombreAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1727:1: ( rule__Objeto__NombreAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1727:2: rule__Objeto__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__Objeto__NombreAssignment_1_in_rule__Objeto__Group__1__Impl3527);
            rule__Objeto__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetoAccess().getNombreAssignment_1()); 

            }


            }

        }
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1737:1: rule__Objeto__Group__2 : rule__Objeto__Group__2__Impl rule__Objeto__Group__3 ;
    public final void rule__Objeto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1741:1: ( rule__Objeto__Group__2__Impl rule__Objeto__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1742:2: rule__Objeto__Group__2__Impl rule__Objeto__Group__3
            {
            pushFollow(FOLLOW_rule__Objeto__Group__2__Impl_in_rule__Objeto__Group__23557);
            rule__Objeto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__3_in_rule__Objeto__Group__23560);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1749:1: rule__Objeto__Group__2__Impl : ( ( rule__Objeto__DescripcionAssignment_2 )? ) ;
    public final void rule__Objeto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1753:1: ( ( ( rule__Objeto__DescripcionAssignment_2 )? ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1754:1: ( ( rule__Objeto__DescripcionAssignment_2 )? )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1754:1: ( ( rule__Objeto__DescripcionAssignment_2 )? )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1755:1: ( rule__Objeto__DescripcionAssignment_2 )?
            {
             before(grammarAccess.getObjetoAccess().getDescripcionAssignment_2()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1756:1: ( rule__Objeto__DescripcionAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1756:2: rule__Objeto__DescripcionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Objeto__DescripcionAssignment_2_in_rule__Objeto__Group__2__Impl3587);
                    rule__Objeto__DescripcionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetoAccess().getDescripcionAssignment_2()); 

            }


            }

        }
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1766:1: rule__Objeto__Group__3 : rule__Objeto__Group__3__Impl rule__Objeto__Group__4 ;
    public final void rule__Objeto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1770:1: ( rule__Objeto__Group__3__Impl rule__Objeto__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1771:2: rule__Objeto__Group__3__Impl rule__Objeto__Group__4
            {
            pushFollow(FOLLOW_rule__Objeto__Group__3__Impl_in_rule__Objeto__Group__33618);
            rule__Objeto__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__4_in_rule__Objeto__Group__33621);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1778:1: rule__Objeto__Group__3__Impl : ( '{' ) ;
    public final void rule__Objeto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1782:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1783:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1783:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1784:1: '{'
            {
             before(grammarAccess.getObjetoAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Objeto__Group__3__Impl3649); 
             after(grammarAccess.getObjetoAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1797:1: rule__Objeto__Group__4 : rule__Objeto__Group__4__Impl rule__Objeto__Group__5 ;
    public final void rule__Objeto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1801:1: ( rule__Objeto__Group__4__Impl rule__Objeto__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1802:2: rule__Objeto__Group__4__Impl rule__Objeto__Group__5
            {
            pushFollow(FOLLOW_rule__Objeto__Group__4__Impl_in_rule__Objeto__Group__43680);
            rule__Objeto__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__5_in_rule__Objeto__Group__43683);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1809:1: rule__Objeto__Group__4__Impl : ( ( rule__Objeto__PropiedadesAssignment_4 )* ) ;
    public final void rule__Objeto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1813:1: ( ( ( rule__Objeto__PropiedadesAssignment_4 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1814:1: ( ( rule__Objeto__PropiedadesAssignment_4 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1814:1: ( ( rule__Objeto__PropiedadesAssignment_4 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1815:1: ( rule__Objeto__PropiedadesAssignment_4 )*
            {
             before(grammarAccess.getObjetoAccess().getPropiedadesAssignment_4()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1816:1: ( rule__Objeto__PropiedadesAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1816:2: rule__Objeto__PropiedadesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Objeto__PropiedadesAssignment_4_in_rule__Objeto__Group__4__Impl3710);
            	    rule__Objeto__PropiedadesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getObjetoAccess().getPropiedadesAssignment_4()); 

            }


            }

        }
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1826:1: rule__Objeto__Group__5 : rule__Objeto__Group__5__Impl ;
    public final void rule__Objeto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1830:1: ( rule__Objeto__Group__5__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1831:2: rule__Objeto__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Objeto__Group__5__Impl_in_rule__Objeto__Group__53741);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1837:1: rule__Objeto__Group__5__Impl : ( '}' ) ;
    public final void rule__Objeto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1841:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1842:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1842:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1843:1: '}'
            {
             before(grammarAccess.getObjetoAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Objeto__Group__5__Impl3769); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1868:1: rule__AtributoSimple__Group__0 : rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 ;
    public final void rule__AtributoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1872:1: ( rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1873:2: rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__0__Impl_in_rule__AtributoSimple__Group__03812);
            rule__AtributoSimple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoSimple__Group__1_in_rule__AtributoSimple__Group__03815);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1880:1: rule__AtributoSimple__Group__0__Impl : ( () ) ;
    public final void rule__AtributoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1884:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1885:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1885:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1886:1: ()
            {
             before(grammarAccess.getAtributoSimpleAccess().getAtributoSimpleAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1887:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1889:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1899:1: rule__AtributoSimple__Group__1 : rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 ;
    public final void rule__AtributoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1903:1: ( rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1904:2: rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__1__Impl_in_rule__AtributoSimple__Group__13873);
            rule__AtributoSimple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoSimple__Group__2_in_rule__AtributoSimple__Group__13876);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1911:1: rule__AtributoSimple__Group__1__Impl : ( ( rule__AtributoSimple__NombreAssignment_1 ) ) ;
    public final void rule__AtributoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1915:1: ( ( ( rule__AtributoSimple__NombreAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1916:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1916:1: ( ( rule__AtributoSimple__NombreAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1917:1: ( rule__AtributoSimple__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNombreAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1918:1: ( rule__AtributoSimple__NombreAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1918:2: rule__AtributoSimple__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__AtributoSimple__NombreAssignment_1_in_rule__AtributoSimple__Group__1__Impl3903);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1928:1: rule__AtributoSimple__Group__2 : rule__AtributoSimple__Group__2__Impl rule__AtributoSimple__Group__3 ;
    public final void rule__AtributoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1932:1: ( rule__AtributoSimple__Group__2__Impl rule__AtributoSimple__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1933:2: rule__AtributoSimple__Group__2__Impl rule__AtributoSimple__Group__3
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__2__Impl_in_rule__AtributoSimple__Group__23933);
            rule__AtributoSimple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoSimple__Group__3_in_rule__AtributoSimple__Group__23936);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1940:1: rule__AtributoSimple__Group__2__Impl : ( ':' ) ;
    public final void rule__AtributoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1944:1: ( ( ':' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1945:1: ( ':' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1945:1: ( ':' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1946:1: ':'
            {
             before(grammarAccess.getAtributoSimpleAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__AtributoSimple__Group__2__Impl3964); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1959:1: rule__AtributoSimple__Group__3 : rule__AtributoSimple__Group__3__Impl rule__AtributoSimple__Group__4 ;
    public final void rule__AtributoSimple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1963:1: ( rule__AtributoSimple__Group__3__Impl rule__AtributoSimple__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1964:2: rule__AtributoSimple__Group__3__Impl rule__AtributoSimple__Group__4
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__3__Impl_in_rule__AtributoSimple__Group__33995);
            rule__AtributoSimple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoSimple__Group__4_in_rule__AtributoSimple__Group__33998);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1971:1: rule__AtributoSimple__Group__3__Impl : ( ( rule__AtributoSimple__TipoAssignment_3 ) ) ;
    public final void rule__AtributoSimple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1975:1: ( ( ( rule__AtributoSimple__TipoAssignment_3 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1976:1: ( ( rule__AtributoSimple__TipoAssignment_3 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1976:1: ( ( rule__AtributoSimple__TipoAssignment_3 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1977:1: ( rule__AtributoSimple__TipoAssignment_3 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1978:1: ( rule__AtributoSimple__TipoAssignment_3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1978:2: rule__AtributoSimple__TipoAssignment_3
            {
            pushFollow(FOLLOW_rule__AtributoSimple__TipoAssignment_3_in_rule__AtributoSimple__Group__3__Impl4025);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1988:1: rule__AtributoSimple__Group__4 : rule__AtributoSimple__Group__4__Impl ;
    public final void rule__AtributoSimple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1992:1: ( rule__AtributoSimple__Group__4__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1993:2: rule__AtributoSimple__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AtributoSimple__Group__4__Impl_in_rule__AtributoSimple__Group__44055);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:1999:1: rule__AtributoSimple__Group__4__Impl : ( ';' ) ;
    public final void rule__AtributoSimple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2003:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2004:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2004:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2005:1: ';'
            {
             before(grammarAccess.getAtributoSimpleAccess().getSemicolonKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__AtributoSimple__Group__4__Impl4083); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2028:1: rule__AtributoInicializado__Group__0 : rule__AtributoInicializado__Group__0__Impl rule__AtributoInicializado__Group__1 ;
    public final void rule__AtributoInicializado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2032:1: ( rule__AtributoInicializado__Group__0__Impl rule__AtributoInicializado__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2033:2: rule__AtributoInicializado__Group__0__Impl rule__AtributoInicializado__Group__1
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__0__Impl_in_rule__AtributoInicializado__Group__04124);
            rule__AtributoInicializado__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__1_in_rule__AtributoInicializado__Group__04127);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2040:1: rule__AtributoInicializado__Group__0__Impl : ( () ) ;
    public final void rule__AtributoInicializado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2044:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2045:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2045:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2046:1: ()
            {
             before(grammarAccess.getAtributoInicializadoAccess().getAtributoInicializadoAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2047:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2049:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2059:1: rule__AtributoInicializado__Group__1 : rule__AtributoInicializado__Group__1__Impl rule__AtributoInicializado__Group__2 ;
    public final void rule__AtributoInicializado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2063:1: ( rule__AtributoInicializado__Group__1__Impl rule__AtributoInicializado__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2064:2: rule__AtributoInicializado__Group__1__Impl rule__AtributoInicializado__Group__2
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__1__Impl_in_rule__AtributoInicializado__Group__14185);
            rule__AtributoInicializado__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__2_in_rule__AtributoInicializado__Group__14188);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2071:1: rule__AtributoInicializado__Group__1__Impl : ( ( rule__AtributoInicializado__NombreAssignment_1 ) ) ;
    public final void rule__AtributoInicializado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2075:1: ( ( ( rule__AtributoInicializado__NombreAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2076:1: ( ( rule__AtributoInicializado__NombreAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2076:1: ( ( rule__AtributoInicializado__NombreAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2077:1: ( rule__AtributoInicializado__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoInicializadoAccess().getNombreAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2078:1: ( rule__AtributoInicializado__NombreAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2078:2: rule__AtributoInicializado__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__NombreAssignment_1_in_rule__AtributoInicializado__Group__1__Impl4215);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2088:1: rule__AtributoInicializado__Group__2 : rule__AtributoInicializado__Group__2__Impl rule__AtributoInicializado__Group__3 ;
    public final void rule__AtributoInicializado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2092:1: ( rule__AtributoInicializado__Group__2__Impl rule__AtributoInicializado__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2093:2: rule__AtributoInicializado__Group__2__Impl rule__AtributoInicializado__Group__3
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__2__Impl_in_rule__AtributoInicializado__Group__24245);
            rule__AtributoInicializado__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__3_in_rule__AtributoInicializado__Group__24248);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2100:1: rule__AtributoInicializado__Group__2__Impl : ( ':' ) ;
    public final void rule__AtributoInicializado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2104:1: ( ( ':' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2105:1: ( ':' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2105:1: ( ':' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2106:1: ':'
            {
             before(grammarAccess.getAtributoInicializadoAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__AtributoInicializado__Group__2__Impl4276); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2119:1: rule__AtributoInicializado__Group__3 : rule__AtributoInicializado__Group__3__Impl rule__AtributoInicializado__Group__4 ;
    public final void rule__AtributoInicializado__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2123:1: ( rule__AtributoInicializado__Group__3__Impl rule__AtributoInicializado__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2124:2: rule__AtributoInicializado__Group__3__Impl rule__AtributoInicializado__Group__4
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__3__Impl_in_rule__AtributoInicializado__Group__34307);
            rule__AtributoInicializado__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__4_in_rule__AtributoInicializado__Group__34310);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2131:1: rule__AtributoInicializado__Group__3__Impl : ( ( rule__AtributoInicializado__TipoAssignment_3 ) ) ;
    public final void rule__AtributoInicializado__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2135:1: ( ( ( rule__AtributoInicializado__TipoAssignment_3 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2136:1: ( ( rule__AtributoInicializado__TipoAssignment_3 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2136:1: ( ( rule__AtributoInicializado__TipoAssignment_3 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2137:1: ( rule__AtributoInicializado__TipoAssignment_3 )
            {
             before(grammarAccess.getAtributoInicializadoAccess().getTipoAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2138:1: ( rule__AtributoInicializado__TipoAssignment_3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2138:2: rule__AtributoInicializado__TipoAssignment_3
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__TipoAssignment_3_in_rule__AtributoInicializado__Group__3__Impl4337);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2148:1: rule__AtributoInicializado__Group__4 : rule__AtributoInicializado__Group__4__Impl rule__AtributoInicializado__Group__5 ;
    public final void rule__AtributoInicializado__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2152:1: ( rule__AtributoInicializado__Group__4__Impl rule__AtributoInicializado__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2153:2: rule__AtributoInicializado__Group__4__Impl rule__AtributoInicializado__Group__5
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__4__Impl_in_rule__AtributoInicializado__Group__44367);
            rule__AtributoInicializado__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__5_in_rule__AtributoInicializado__Group__44370);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2160:1: rule__AtributoInicializado__Group__4__Impl : ( '=' ) ;
    public final void rule__AtributoInicializado__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2164:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2165:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2165:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2166:1: '='
            {
             before(grammarAccess.getAtributoInicializadoAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__AtributoInicializado__Group__4__Impl4398); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2179:1: rule__AtributoInicializado__Group__5 : rule__AtributoInicializado__Group__5__Impl rule__AtributoInicializado__Group__6 ;
    public final void rule__AtributoInicializado__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2183:1: ( rule__AtributoInicializado__Group__5__Impl rule__AtributoInicializado__Group__6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2184:2: rule__AtributoInicializado__Group__5__Impl rule__AtributoInicializado__Group__6
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__5__Impl_in_rule__AtributoInicializado__Group__54429);
            rule__AtributoInicializado__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoInicializado__Group__6_in_rule__AtributoInicializado__Group__54432);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2191:1: rule__AtributoInicializado__Group__5__Impl : ( ( rule__AtributoInicializado__ValorAssignment_5 ) ) ;
    public final void rule__AtributoInicializado__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2195:1: ( ( ( rule__AtributoInicializado__ValorAssignment_5 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2196:1: ( ( rule__AtributoInicializado__ValorAssignment_5 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2196:1: ( ( rule__AtributoInicializado__ValorAssignment_5 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2197:1: ( rule__AtributoInicializado__ValorAssignment_5 )
            {
             before(grammarAccess.getAtributoInicializadoAccess().getValorAssignment_5()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2198:1: ( rule__AtributoInicializado__ValorAssignment_5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2198:2: rule__AtributoInicializado__ValorAssignment_5
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__ValorAssignment_5_in_rule__AtributoInicializado__Group__5__Impl4459);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2208:1: rule__AtributoInicializado__Group__6 : rule__AtributoInicializado__Group__6__Impl ;
    public final void rule__AtributoInicializado__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2212:1: ( rule__AtributoInicializado__Group__6__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2213:2: rule__AtributoInicializado__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__Group__6__Impl_in_rule__AtributoInicializado__Group__64489);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2219:1: rule__AtributoInicializado__Group__6__Impl : ( ';' ) ;
    public final void rule__AtributoInicializado__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2223:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2224:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2224:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2225:1: ';'
            {
             before(grammarAccess.getAtributoInicializadoAccess().getSemicolonKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__AtributoInicializado__Group__6__Impl4517); 
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


    // $ANTLR start "rule__AtributoListaString__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2252:1: rule__AtributoListaString__Group__0 : rule__AtributoListaString__Group__0__Impl rule__AtributoListaString__Group__1 ;
    public final void rule__AtributoListaString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2256:1: ( rule__AtributoListaString__Group__0__Impl rule__AtributoListaString__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2257:2: rule__AtributoListaString__Group__0__Impl rule__AtributoListaString__Group__1
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group__0__Impl_in_rule__AtributoListaString__Group__04562);
            rule__AtributoListaString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaString__Group__1_in_rule__AtributoListaString__Group__04565);
            rule__AtributoListaString__Group__1();

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
    // $ANTLR end "rule__AtributoListaString__Group__0"


    // $ANTLR start "rule__AtributoListaString__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2264:1: rule__AtributoListaString__Group__0__Impl : ( () ) ;
    public final void rule__AtributoListaString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2268:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2269:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2269:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2270:1: ()
            {
             before(grammarAccess.getAtributoListaStringAccess().getAtributoListaStringAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2271:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2273:1: 
            {
            }

             after(grammarAccess.getAtributoListaStringAccess().getAtributoListaStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group__0__Impl"


    // $ANTLR start "rule__AtributoListaString__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2283:1: rule__AtributoListaString__Group__1 : rule__AtributoListaString__Group__1__Impl rule__AtributoListaString__Group__2 ;
    public final void rule__AtributoListaString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2287:1: ( rule__AtributoListaString__Group__1__Impl rule__AtributoListaString__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2288:2: rule__AtributoListaString__Group__1__Impl rule__AtributoListaString__Group__2
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group__1__Impl_in_rule__AtributoListaString__Group__14623);
            rule__AtributoListaString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaString__Group__2_in_rule__AtributoListaString__Group__14626);
            rule__AtributoListaString__Group__2();

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
    // $ANTLR end "rule__AtributoListaString__Group__1"


    // $ANTLR start "rule__AtributoListaString__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2295:1: rule__AtributoListaString__Group__1__Impl : ( ( rule__AtributoListaString__NombreAssignment_1 ) ) ;
    public final void rule__AtributoListaString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2299:1: ( ( ( rule__AtributoListaString__NombreAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2300:1: ( ( rule__AtributoListaString__NombreAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2300:1: ( ( rule__AtributoListaString__NombreAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2301:1: ( rule__AtributoListaString__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoListaStringAccess().getNombreAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2302:1: ( rule__AtributoListaString__NombreAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2302:2: rule__AtributoListaString__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__AtributoListaString__NombreAssignment_1_in_rule__AtributoListaString__Group__1__Impl4653);
            rule__AtributoListaString__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoListaStringAccess().getNombreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group__1__Impl"


    // $ANTLR start "rule__AtributoListaString__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2312:1: rule__AtributoListaString__Group__2 : rule__AtributoListaString__Group__2__Impl rule__AtributoListaString__Group__3 ;
    public final void rule__AtributoListaString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2316:1: ( rule__AtributoListaString__Group__2__Impl rule__AtributoListaString__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2317:2: rule__AtributoListaString__Group__2__Impl rule__AtributoListaString__Group__3
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group__2__Impl_in_rule__AtributoListaString__Group__24683);
            rule__AtributoListaString__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaString__Group__3_in_rule__AtributoListaString__Group__24686);
            rule__AtributoListaString__Group__3();

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
    // $ANTLR end "rule__AtributoListaString__Group__2"


    // $ANTLR start "rule__AtributoListaString__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2324:1: rule__AtributoListaString__Group__2__Impl : ( ':' ) ;
    public final void rule__AtributoListaString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2328:1: ( ( ':' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2329:1: ( ':' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2329:1: ( ':' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2330:1: ':'
            {
             before(grammarAccess.getAtributoListaStringAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__AtributoListaString__Group__2__Impl4714); 
             after(grammarAccess.getAtributoListaStringAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group__2__Impl"


    // $ANTLR start "rule__AtributoListaString__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2343:1: rule__AtributoListaString__Group__3 : rule__AtributoListaString__Group__3__Impl rule__AtributoListaString__Group__4 ;
    public final void rule__AtributoListaString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2347:1: ( rule__AtributoListaString__Group__3__Impl rule__AtributoListaString__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2348:2: rule__AtributoListaString__Group__3__Impl rule__AtributoListaString__Group__4
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group__3__Impl_in_rule__AtributoListaString__Group__34745);
            rule__AtributoListaString__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaString__Group__4_in_rule__AtributoListaString__Group__34748);
            rule__AtributoListaString__Group__4();

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
    // $ANTLR end "rule__AtributoListaString__Group__3"


    // $ANTLR start "rule__AtributoListaString__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2355:1: rule__AtributoListaString__Group__3__Impl : ( 'List of String' ) ;
    public final void rule__AtributoListaString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2359:1: ( ( 'List of String' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2360:1: ( 'List of String' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2360:1: ( 'List of String' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2361:1: 'List of String'
            {
             before(grammarAccess.getAtributoListaStringAccess().getListOfStringKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__AtributoListaString__Group__3__Impl4776); 
             after(grammarAccess.getAtributoListaStringAccess().getListOfStringKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group__3__Impl"


    // $ANTLR start "rule__AtributoListaString__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2374:1: rule__AtributoListaString__Group__4 : rule__AtributoListaString__Group__4__Impl rule__AtributoListaString__Group__5 ;
    public final void rule__AtributoListaString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2378:1: ( rule__AtributoListaString__Group__4__Impl rule__AtributoListaString__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2379:2: rule__AtributoListaString__Group__4__Impl rule__AtributoListaString__Group__5
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group__4__Impl_in_rule__AtributoListaString__Group__44807);
            rule__AtributoListaString__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaString__Group__5_in_rule__AtributoListaString__Group__44810);
            rule__AtributoListaString__Group__5();

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
    // $ANTLR end "rule__AtributoListaString__Group__4"


    // $ANTLR start "rule__AtributoListaString__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2386:1: rule__AtributoListaString__Group__4__Impl : ( '=' ) ;
    public final void rule__AtributoListaString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2390:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2391:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2391:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2392:1: '='
            {
             before(grammarAccess.getAtributoListaStringAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__AtributoListaString__Group__4__Impl4838); 
             after(grammarAccess.getAtributoListaStringAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group__4__Impl"


    // $ANTLR start "rule__AtributoListaString__Group__5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2405:1: rule__AtributoListaString__Group__5 : rule__AtributoListaString__Group__5__Impl rule__AtributoListaString__Group__6 ;
    public final void rule__AtributoListaString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2409:1: ( rule__AtributoListaString__Group__5__Impl rule__AtributoListaString__Group__6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2410:2: rule__AtributoListaString__Group__5__Impl rule__AtributoListaString__Group__6
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group__5__Impl_in_rule__AtributoListaString__Group__54869);
            rule__AtributoListaString__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaString__Group__6_in_rule__AtributoListaString__Group__54872);
            rule__AtributoListaString__Group__6();

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
    // $ANTLR end "rule__AtributoListaString__Group__5"


    // $ANTLR start "rule__AtributoListaString__Group__5__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2417:1: rule__AtributoListaString__Group__5__Impl : ( '{' ) ;
    public final void rule__AtributoListaString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2421:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2422:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2422:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2423:1: '{'
            {
             before(grammarAccess.getAtributoListaStringAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__AtributoListaString__Group__5__Impl4900); 
             after(grammarAccess.getAtributoListaStringAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group__5__Impl"


    // $ANTLR start "rule__AtributoListaString__Group__6"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2436:1: rule__AtributoListaString__Group__6 : rule__AtributoListaString__Group__6__Impl rule__AtributoListaString__Group__7 ;
    public final void rule__AtributoListaString__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2440:1: ( rule__AtributoListaString__Group__6__Impl rule__AtributoListaString__Group__7 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2441:2: rule__AtributoListaString__Group__6__Impl rule__AtributoListaString__Group__7
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group__6__Impl_in_rule__AtributoListaString__Group__64931);
            rule__AtributoListaString__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaString__Group__7_in_rule__AtributoListaString__Group__64934);
            rule__AtributoListaString__Group__7();

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
    // $ANTLR end "rule__AtributoListaString__Group__6"


    // $ANTLR start "rule__AtributoListaString__Group__6__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2448:1: rule__AtributoListaString__Group__6__Impl : ( ( rule__AtributoListaString__ValoresAssignment_6 ) ) ;
    public final void rule__AtributoListaString__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2452:1: ( ( ( rule__AtributoListaString__ValoresAssignment_6 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2453:1: ( ( rule__AtributoListaString__ValoresAssignment_6 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2453:1: ( ( rule__AtributoListaString__ValoresAssignment_6 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2454:1: ( rule__AtributoListaString__ValoresAssignment_6 )
            {
             before(grammarAccess.getAtributoListaStringAccess().getValoresAssignment_6()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2455:1: ( rule__AtributoListaString__ValoresAssignment_6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2455:2: rule__AtributoListaString__ValoresAssignment_6
            {
            pushFollow(FOLLOW_rule__AtributoListaString__ValoresAssignment_6_in_rule__AtributoListaString__Group__6__Impl4961);
            rule__AtributoListaString__ValoresAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAtributoListaStringAccess().getValoresAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group__6__Impl"


    // $ANTLR start "rule__AtributoListaString__Group__7"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2465:1: rule__AtributoListaString__Group__7 : rule__AtributoListaString__Group__7__Impl rule__AtributoListaString__Group__8 ;
    public final void rule__AtributoListaString__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2469:1: ( rule__AtributoListaString__Group__7__Impl rule__AtributoListaString__Group__8 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2470:2: rule__AtributoListaString__Group__7__Impl rule__AtributoListaString__Group__8
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group__7__Impl_in_rule__AtributoListaString__Group__74991);
            rule__AtributoListaString__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaString__Group__8_in_rule__AtributoListaString__Group__74994);
            rule__AtributoListaString__Group__8();

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
    // $ANTLR end "rule__AtributoListaString__Group__7"


    // $ANTLR start "rule__AtributoListaString__Group__7__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2477:1: rule__AtributoListaString__Group__7__Impl : ( ( rule__AtributoListaString__Group_7__0 )* ) ;
    public final void rule__AtributoListaString__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2481:1: ( ( ( rule__AtributoListaString__Group_7__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2482:1: ( ( rule__AtributoListaString__Group_7__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2482:1: ( ( rule__AtributoListaString__Group_7__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2483:1: ( rule__AtributoListaString__Group_7__0 )*
            {
             before(grammarAccess.getAtributoListaStringAccess().getGroup_7()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2484:1: ( rule__AtributoListaString__Group_7__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2484:2: rule__AtributoListaString__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__AtributoListaString__Group_7__0_in_rule__AtributoListaString__Group__7__Impl5021);
            	    rule__AtributoListaString__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAtributoListaStringAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group__7__Impl"


    // $ANTLR start "rule__AtributoListaString__Group__8"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2494:1: rule__AtributoListaString__Group__8 : rule__AtributoListaString__Group__8__Impl rule__AtributoListaString__Group__9 ;
    public final void rule__AtributoListaString__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2498:1: ( rule__AtributoListaString__Group__8__Impl rule__AtributoListaString__Group__9 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2499:2: rule__AtributoListaString__Group__8__Impl rule__AtributoListaString__Group__9
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group__8__Impl_in_rule__AtributoListaString__Group__85052);
            rule__AtributoListaString__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaString__Group__9_in_rule__AtributoListaString__Group__85055);
            rule__AtributoListaString__Group__9();

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
    // $ANTLR end "rule__AtributoListaString__Group__8"


    // $ANTLR start "rule__AtributoListaString__Group__8__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2506:1: rule__AtributoListaString__Group__8__Impl : ( '}' ) ;
    public final void rule__AtributoListaString__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2510:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2511:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2511:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2512:1: '}'
            {
             before(grammarAccess.getAtributoListaStringAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__AtributoListaString__Group__8__Impl5083); 
             after(grammarAccess.getAtributoListaStringAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group__8__Impl"


    // $ANTLR start "rule__AtributoListaString__Group__9"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2525:1: rule__AtributoListaString__Group__9 : rule__AtributoListaString__Group__9__Impl ;
    public final void rule__AtributoListaString__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2529:1: ( rule__AtributoListaString__Group__9__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2530:2: rule__AtributoListaString__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group__9__Impl_in_rule__AtributoListaString__Group__95114);
            rule__AtributoListaString__Group__9__Impl();

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
    // $ANTLR end "rule__AtributoListaString__Group__9"


    // $ANTLR start "rule__AtributoListaString__Group__9__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2536:1: rule__AtributoListaString__Group__9__Impl : ( ';' ) ;
    public final void rule__AtributoListaString__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2540:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2541:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2541:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2542:1: ';'
            {
             before(grammarAccess.getAtributoListaStringAccess().getSemicolonKeyword_9()); 
            match(input,19,FOLLOW_19_in_rule__AtributoListaString__Group__9__Impl5142); 
             after(grammarAccess.getAtributoListaStringAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group__9__Impl"


    // $ANTLR start "rule__AtributoListaString__Group_7__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2575:1: rule__AtributoListaString__Group_7__0 : rule__AtributoListaString__Group_7__0__Impl rule__AtributoListaString__Group_7__1 ;
    public final void rule__AtributoListaString__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2579:1: ( rule__AtributoListaString__Group_7__0__Impl rule__AtributoListaString__Group_7__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2580:2: rule__AtributoListaString__Group_7__0__Impl rule__AtributoListaString__Group_7__1
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group_7__0__Impl_in_rule__AtributoListaString__Group_7__05193);
            rule__AtributoListaString__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaString__Group_7__1_in_rule__AtributoListaString__Group_7__05196);
            rule__AtributoListaString__Group_7__1();

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
    // $ANTLR end "rule__AtributoListaString__Group_7__0"


    // $ANTLR start "rule__AtributoListaString__Group_7__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2587:1: rule__AtributoListaString__Group_7__0__Impl : ( ',' ) ;
    public final void rule__AtributoListaString__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2591:1: ( ( ',' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2592:1: ( ',' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2592:1: ( ',' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2593:1: ','
            {
             before(grammarAccess.getAtributoListaStringAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_22_in_rule__AtributoListaString__Group_7__0__Impl5224); 
             after(grammarAccess.getAtributoListaStringAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group_7__0__Impl"


    // $ANTLR start "rule__AtributoListaString__Group_7__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2606:1: rule__AtributoListaString__Group_7__1 : rule__AtributoListaString__Group_7__1__Impl ;
    public final void rule__AtributoListaString__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2610:1: ( rule__AtributoListaString__Group_7__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2611:2: rule__AtributoListaString__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__AtributoListaString__Group_7__1__Impl_in_rule__AtributoListaString__Group_7__15255);
            rule__AtributoListaString__Group_7__1__Impl();

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
    // $ANTLR end "rule__AtributoListaString__Group_7__1"


    // $ANTLR start "rule__AtributoListaString__Group_7__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2617:1: rule__AtributoListaString__Group_7__1__Impl : ( ( rule__AtributoListaString__ValoresAssignment_7_1 ) ) ;
    public final void rule__AtributoListaString__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2621:1: ( ( ( rule__AtributoListaString__ValoresAssignment_7_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2622:1: ( ( rule__AtributoListaString__ValoresAssignment_7_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2622:1: ( ( rule__AtributoListaString__ValoresAssignment_7_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2623:1: ( rule__AtributoListaString__ValoresAssignment_7_1 )
            {
             before(grammarAccess.getAtributoListaStringAccess().getValoresAssignment_7_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2624:1: ( rule__AtributoListaString__ValoresAssignment_7_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2624:2: rule__AtributoListaString__ValoresAssignment_7_1
            {
            pushFollow(FOLLOW_rule__AtributoListaString__ValoresAssignment_7_1_in_rule__AtributoListaString__Group_7__1__Impl5282);
            rule__AtributoListaString__ValoresAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoListaStringAccess().getValoresAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__Group_7__1__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2638:1: rule__AtributoListaInteger__Group__0 : rule__AtributoListaInteger__Group__0__Impl rule__AtributoListaInteger__Group__1 ;
    public final void rule__AtributoListaInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2642:1: ( rule__AtributoListaInteger__Group__0__Impl rule__AtributoListaInteger__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2643:2: rule__AtributoListaInteger__Group__0__Impl rule__AtributoListaInteger__Group__1
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__0__Impl_in_rule__AtributoListaInteger__Group__05316);
            rule__AtributoListaInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__1_in_rule__AtributoListaInteger__Group__05319);
            rule__AtributoListaInteger__Group__1();

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
    // $ANTLR end "rule__AtributoListaInteger__Group__0"


    // $ANTLR start "rule__AtributoListaInteger__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2650:1: rule__AtributoListaInteger__Group__0__Impl : ( () ) ;
    public final void rule__AtributoListaInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2654:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2655:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2655:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2656:1: ()
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getAtributoListaIntegerAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2657:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2659:1: 
            {
            }

             after(grammarAccess.getAtributoListaIntegerAccess().getAtributoListaIntegerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group__0__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2669:1: rule__AtributoListaInteger__Group__1 : rule__AtributoListaInteger__Group__1__Impl rule__AtributoListaInteger__Group__2 ;
    public final void rule__AtributoListaInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2673:1: ( rule__AtributoListaInteger__Group__1__Impl rule__AtributoListaInteger__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2674:2: rule__AtributoListaInteger__Group__1__Impl rule__AtributoListaInteger__Group__2
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__1__Impl_in_rule__AtributoListaInteger__Group__15377);
            rule__AtributoListaInteger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__2_in_rule__AtributoListaInteger__Group__15380);
            rule__AtributoListaInteger__Group__2();

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
    // $ANTLR end "rule__AtributoListaInteger__Group__1"


    // $ANTLR start "rule__AtributoListaInteger__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2681:1: rule__AtributoListaInteger__Group__1__Impl : ( ( rule__AtributoListaInteger__NombreAssignment_1 ) ) ;
    public final void rule__AtributoListaInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2685:1: ( ( ( rule__AtributoListaInteger__NombreAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2686:1: ( ( rule__AtributoListaInteger__NombreAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2686:1: ( ( rule__AtributoListaInteger__NombreAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2687:1: ( rule__AtributoListaInteger__NombreAssignment_1 )
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getNombreAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2688:1: ( rule__AtributoListaInteger__NombreAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2688:2: rule__AtributoListaInteger__NombreAssignment_1
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__NombreAssignment_1_in_rule__AtributoListaInteger__Group__1__Impl5407);
            rule__AtributoListaInteger__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoListaIntegerAccess().getNombreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group__1__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2698:1: rule__AtributoListaInteger__Group__2 : rule__AtributoListaInteger__Group__2__Impl rule__AtributoListaInteger__Group__3 ;
    public final void rule__AtributoListaInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2702:1: ( rule__AtributoListaInteger__Group__2__Impl rule__AtributoListaInteger__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2703:2: rule__AtributoListaInteger__Group__2__Impl rule__AtributoListaInteger__Group__3
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__2__Impl_in_rule__AtributoListaInteger__Group__25437);
            rule__AtributoListaInteger__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__3_in_rule__AtributoListaInteger__Group__25440);
            rule__AtributoListaInteger__Group__3();

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
    // $ANTLR end "rule__AtributoListaInteger__Group__2"


    // $ANTLR start "rule__AtributoListaInteger__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2710:1: rule__AtributoListaInteger__Group__2__Impl : ( ':' ) ;
    public final void rule__AtributoListaInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2714:1: ( ( ':' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2715:1: ( ':' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2715:1: ( ':' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2716:1: ':'
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__AtributoListaInteger__Group__2__Impl5468); 
             after(grammarAccess.getAtributoListaIntegerAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group__2__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2729:1: rule__AtributoListaInteger__Group__3 : rule__AtributoListaInteger__Group__3__Impl rule__AtributoListaInteger__Group__4 ;
    public final void rule__AtributoListaInteger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2733:1: ( rule__AtributoListaInteger__Group__3__Impl rule__AtributoListaInteger__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2734:2: rule__AtributoListaInteger__Group__3__Impl rule__AtributoListaInteger__Group__4
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__3__Impl_in_rule__AtributoListaInteger__Group__35499);
            rule__AtributoListaInteger__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__4_in_rule__AtributoListaInteger__Group__35502);
            rule__AtributoListaInteger__Group__4();

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
    // $ANTLR end "rule__AtributoListaInteger__Group__3"


    // $ANTLR start "rule__AtributoListaInteger__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2741:1: rule__AtributoListaInteger__Group__3__Impl : ( 'List of Integer' ) ;
    public final void rule__AtributoListaInteger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2745:1: ( ( 'List of Integer' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2746:1: ( 'List of Integer' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2746:1: ( 'List of Integer' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2747:1: 'List of Integer'
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getListOfIntegerKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__AtributoListaInteger__Group__3__Impl5530); 
             after(grammarAccess.getAtributoListaIntegerAccess().getListOfIntegerKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group__3__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2760:1: rule__AtributoListaInteger__Group__4 : rule__AtributoListaInteger__Group__4__Impl rule__AtributoListaInteger__Group__5 ;
    public final void rule__AtributoListaInteger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2764:1: ( rule__AtributoListaInteger__Group__4__Impl rule__AtributoListaInteger__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2765:2: rule__AtributoListaInteger__Group__4__Impl rule__AtributoListaInteger__Group__5
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__4__Impl_in_rule__AtributoListaInteger__Group__45561);
            rule__AtributoListaInteger__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__5_in_rule__AtributoListaInteger__Group__45564);
            rule__AtributoListaInteger__Group__5();

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
    // $ANTLR end "rule__AtributoListaInteger__Group__4"


    // $ANTLR start "rule__AtributoListaInteger__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2772:1: rule__AtributoListaInteger__Group__4__Impl : ( '=' ) ;
    public final void rule__AtributoListaInteger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2776:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2777:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2777:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2778:1: '='
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__AtributoListaInteger__Group__4__Impl5592); 
             after(grammarAccess.getAtributoListaIntegerAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group__4__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group__5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2791:1: rule__AtributoListaInteger__Group__5 : rule__AtributoListaInteger__Group__5__Impl rule__AtributoListaInteger__Group__6 ;
    public final void rule__AtributoListaInteger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2795:1: ( rule__AtributoListaInteger__Group__5__Impl rule__AtributoListaInteger__Group__6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2796:2: rule__AtributoListaInteger__Group__5__Impl rule__AtributoListaInteger__Group__6
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__5__Impl_in_rule__AtributoListaInteger__Group__55623);
            rule__AtributoListaInteger__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__6_in_rule__AtributoListaInteger__Group__55626);
            rule__AtributoListaInteger__Group__6();

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
    // $ANTLR end "rule__AtributoListaInteger__Group__5"


    // $ANTLR start "rule__AtributoListaInteger__Group__5__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2803:1: rule__AtributoListaInteger__Group__5__Impl : ( '{' ) ;
    public final void rule__AtributoListaInteger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2807:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2808:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2808:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2809:1: '{'
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__AtributoListaInteger__Group__5__Impl5654); 
             after(grammarAccess.getAtributoListaIntegerAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group__5__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group__6"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2822:1: rule__AtributoListaInteger__Group__6 : rule__AtributoListaInteger__Group__6__Impl rule__AtributoListaInteger__Group__7 ;
    public final void rule__AtributoListaInteger__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2826:1: ( rule__AtributoListaInteger__Group__6__Impl rule__AtributoListaInteger__Group__7 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2827:2: rule__AtributoListaInteger__Group__6__Impl rule__AtributoListaInteger__Group__7
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__6__Impl_in_rule__AtributoListaInteger__Group__65685);
            rule__AtributoListaInteger__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__7_in_rule__AtributoListaInteger__Group__65688);
            rule__AtributoListaInteger__Group__7();

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
    // $ANTLR end "rule__AtributoListaInteger__Group__6"


    // $ANTLR start "rule__AtributoListaInteger__Group__6__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2834:1: rule__AtributoListaInteger__Group__6__Impl : ( ( rule__AtributoListaInteger__ValoresAssignment_6 ) ) ;
    public final void rule__AtributoListaInteger__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2838:1: ( ( ( rule__AtributoListaInteger__ValoresAssignment_6 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2839:1: ( ( rule__AtributoListaInteger__ValoresAssignment_6 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2839:1: ( ( rule__AtributoListaInteger__ValoresAssignment_6 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2840:1: ( rule__AtributoListaInteger__ValoresAssignment_6 )
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getValoresAssignment_6()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2841:1: ( rule__AtributoListaInteger__ValoresAssignment_6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2841:2: rule__AtributoListaInteger__ValoresAssignment_6
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__ValoresAssignment_6_in_rule__AtributoListaInteger__Group__6__Impl5715);
            rule__AtributoListaInteger__ValoresAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAtributoListaIntegerAccess().getValoresAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group__6__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group__7"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2851:1: rule__AtributoListaInteger__Group__7 : rule__AtributoListaInteger__Group__7__Impl rule__AtributoListaInteger__Group__8 ;
    public final void rule__AtributoListaInteger__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2855:1: ( rule__AtributoListaInteger__Group__7__Impl rule__AtributoListaInteger__Group__8 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2856:2: rule__AtributoListaInteger__Group__7__Impl rule__AtributoListaInteger__Group__8
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__7__Impl_in_rule__AtributoListaInteger__Group__75745);
            rule__AtributoListaInteger__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__8_in_rule__AtributoListaInteger__Group__75748);
            rule__AtributoListaInteger__Group__8();

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
    // $ANTLR end "rule__AtributoListaInteger__Group__7"


    // $ANTLR start "rule__AtributoListaInteger__Group__7__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2863:1: rule__AtributoListaInteger__Group__7__Impl : ( ( rule__AtributoListaInteger__Group_7__0 )* ) ;
    public final void rule__AtributoListaInteger__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2867:1: ( ( ( rule__AtributoListaInteger__Group_7__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2868:1: ( ( rule__AtributoListaInteger__Group_7__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2868:1: ( ( rule__AtributoListaInteger__Group_7__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2869:1: ( rule__AtributoListaInteger__Group_7__0 )*
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getGroup_7()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2870:1: ( rule__AtributoListaInteger__Group_7__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2870:2: rule__AtributoListaInteger__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__AtributoListaInteger__Group_7__0_in_rule__AtributoListaInteger__Group__7__Impl5775);
            	    rule__AtributoListaInteger__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAtributoListaIntegerAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group__7__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group__8"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2880:1: rule__AtributoListaInteger__Group__8 : rule__AtributoListaInteger__Group__8__Impl rule__AtributoListaInteger__Group__9 ;
    public final void rule__AtributoListaInteger__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2884:1: ( rule__AtributoListaInteger__Group__8__Impl rule__AtributoListaInteger__Group__9 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2885:2: rule__AtributoListaInteger__Group__8__Impl rule__AtributoListaInteger__Group__9
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__8__Impl_in_rule__AtributoListaInteger__Group__85806);
            rule__AtributoListaInteger__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__9_in_rule__AtributoListaInteger__Group__85809);
            rule__AtributoListaInteger__Group__9();

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
    // $ANTLR end "rule__AtributoListaInteger__Group__8"


    // $ANTLR start "rule__AtributoListaInteger__Group__8__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2892:1: rule__AtributoListaInteger__Group__8__Impl : ( '}' ) ;
    public final void rule__AtributoListaInteger__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2896:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2897:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2897:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2898:1: '}'
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__AtributoListaInteger__Group__8__Impl5837); 
             after(grammarAccess.getAtributoListaIntegerAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group__8__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group__9"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2911:1: rule__AtributoListaInteger__Group__9 : rule__AtributoListaInteger__Group__9__Impl ;
    public final void rule__AtributoListaInteger__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2915:1: ( rule__AtributoListaInteger__Group__9__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2916:2: rule__AtributoListaInteger__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group__9__Impl_in_rule__AtributoListaInteger__Group__95868);
            rule__AtributoListaInteger__Group__9__Impl();

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
    // $ANTLR end "rule__AtributoListaInteger__Group__9"


    // $ANTLR start "rule__AtributoListaInteger__Group__9__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2922:1: rule__AtributoListaInteger__Group__9__Impl : ( ';' ) ;
    public final void rule__AtributoListaInteger__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2926:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2927:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2927:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2928:1: ';'
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getSemicolonKeyword_9()); 
            match(input,19,FOLLOW_19_in_rule__AtributoListaInteger__Group__9__Impl5896); 
             after(grammarAccess.getAtributoListaIntegerAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group__9__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group_7__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2961:1: rule__AtributoListaInteger__Group_7__0 : rule__AtributoListaInteger__Group_7__0__Impl rule__AtributoListaInteger__Group_7__1 ;
    public final void rule__AtributoListaInteger__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2965:1: ( rule__AtributoListaInteger__Group_7__0__Impl rule__AtributoListaInteger__Group_7__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2966:2: rule__AtributoListaInteger__Group_7__0__Impl rule__AtributoListaInteger__Group_7__1
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group_7__0__Impl_in_rule__AtributoListaInteger__Group_7__05947);
            rule__AtributoListaInteger__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtributoListaInteger__Group_7__1_in_rule__AtributoListaInteger__Group_7__05950);
            rule__AtributoListaInteger__Group_7__1();

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
    // $ANTLR end "rule__AtributoListaInteger__Group_7__0"


    // $ANTLR start "rule__AtributoListaInteger__Group_7__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2973:1: rule__AtributoListaInteger__Group_7__0__Impl : ( ',' ) ;
    public final void rule__AtributoListaInteger__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2977:1: ( ( ',' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2978:1: ( ',' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2978:1: ( ',' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2979:1: ','
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_22_in_rule__AtributoListaInteger__Group_7__0__Impl5978); 
             after(grammarAccess.getAtributoListaIntegerAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group_7__0__Impl"


    // $ANTLR start "rule__AtributoListaInteger__Group_7__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2992:1: rule__AtributoListaInteger__Group_7__1 : rule__AtributoListaInteger__Group_7__1__Impl ;
    public final void rule__AtributoListaInteger__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2996:1: ( rule__AtributoListaInteger__Group_7__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:2997:2: rule__AtributoListaInteger__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__Group_7__1__Impl_in_rule__AtributoListaInteger__Group_7__16009);
            rule__AtributoListaInteger__Group_7__1__Impl();

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
    // $ANTLR end "rule__AtributoListaInteger__Group_7__1"


    // $ANTLR start "rule__AtributoListaInteger__Group_7__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3003:1: rule__AtributoListaInteger__Group_7__1__Impl : ( ( rule__AtributoListaInteger__ValoresAssignment_7_1 ) ) ;
    public final void rule__AtributoListaInteger__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3007:1: ( ( ( rule__AtributoListaInteger__ValoresAssignment_7_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3008:1: ( ( rule__AtributoListaInteger__ValoresAssignment_7_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3008:1: ( ( rule__AtributoListaInteger__ValoresAssignment_7_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3009:1: ( rule__AtributoListaInteger__ValoresAssignment_7_1 )
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getValoresAssignment_7_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3010:1: ( rule__AtributoListaInteger__ValoresAssignment_7_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3010:2: rule__AtributoListaInteger__ValoresAssignment_7_1
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__ValoresAssignment_7_1_in_rule__AtributoListaInteger__Group_7__1__Impl6036);
            rule__AtributoListaInteger__ValoresAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoListaIntegerAccess().getValoresAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__Group_7__1__Impl"


    // $ANTLR start "rule__Formula__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3024:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3028:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3029:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__06070);
            rule__Formula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__06073);
            rule__Formula__Group__1();

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
    // $ANTLR end "rule__Formula__Group__0"


    // $ANTLR start "rule__Formula__Group__0__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3036:1: rule__Formula__Group__0__Impl : ( () ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3040:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3041:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3041:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3042:1: ()
            {
             before(grammarAccess.getFormulaAccess().getFormulaAction_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3043:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3045:1: 
            {
            }

             after(grammarAccess.getFormulaAccess().getFormulaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__0__Impl"


    // $ANTLR start "rule__Formula__Group__1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3055:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3059:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3060:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__16131);
            rule__Formula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__16134);
            rule__Formula__Group__2();

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
    // $ANTLR end "rule__Formula__Group__1"


    // $ANTLR start "rule__Formula__Group__1__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3067:1: rule__Formula__Group__1__Impl : ( 'Formula' ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3071:1: ( ( 'Formula' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3072:1: ( 'Formula' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3072:1: ( 'Formula' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3073:1: 'Formula'
            {
             before(grammarAccess.getFormulaAccess().getFormulaKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Formula__Group__1__Impl6162); 
             after(grammarAccess.getFormulaAccess().getFormulaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__1__Impl"


    // $ANTLR start "rule__Formula__Group__2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3086:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl rule__Formula__Group__3 ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3090:1: ( rule__Formula__Group__2__Impl rule__Formula__Group__3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3091:2: rule__Formula__Group__2__Impl rule__Formula__Group__3
            {
            pushFollow(FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__26193);
            rule__Formula__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__3_in_rule__Formula__Group__26196);
            rule__Formula__Group__3();

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
    // $ANTLR end "rule__Formula__Group__2"


    // $ANTLR start "rule__Formula__Group__2__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3098:1: rule__Formula__Group__2__Impl : ( '{' ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3102:1: ( ( '{' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3103:1: ( '{' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3103:1: ( '{' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3104:1: '{'
            {
             before(grammarAccess.getFormulaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Formula__Group__2__Impl6224); 
             after(grammarAccess.getFormulaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__2__Impl"


    // $ANTLR start "rule__Formula__Group__3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3117:1: rule__Formula__Group__3 : rule__Formula__Group__3__Impl rule__Formula__Group__4 ;
    public final void rule__Formula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3121:1: ( rule__Formula__Group__3__Impl rule__Formula__Group__4 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3122:2: rule__Formula__Group__3__Impl rule__Formula__Group__4
            {
            pushFollow(FOLLOW_rule__Formula__Group__3__Impl_in_rule__Formula__Group__36255);
            rule__Formula__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__4_in_rule__Formula__Group__36258);
            rule__Formula__Group__4();

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
    // $ANTLR end "rule__Formula__Group__3"


    // $ANTLR start "rule__Formula__Group__3__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3129:1: rule__Formula__Group__3__Impl : ( ( rule__Formula__NombreAssignment_3 ) ) ;
    public final void rule__Formula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3133:1: ( ( ( rule__Formula__NombreAssignment_3 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3134:1: ( ( rule__Formula__NombreAssignment_3 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3134:1: ( ( rule__Formula__NombreAssignment_3 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3135:1: ( rule__Formula__NombreAssignment_3 )
            {
             before(grammarAccess.getFormulaAccess().getNombreAssignment_3()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3136:1: ( rule__Formula__NombreAssignment_3 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3136:2: rule__Formula__NombreAssignment_3
            {
            pushFollow(FOLLOW_rule__Formula__NombreAssignment_3_in_rule__Formula__Group__3__Impl6285);
            rule__Formula__NombreAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getNombreAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__3__Impl"


    // $ANTLR start "rule__Formula__Group__4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3146:1: rule__Formula__Group__4 : rule__Formula__Group__4__Impl rule__Formula__Group__5 ;
    public final void rule__Formula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3150:1: ( rule__Formula__Group__4__Impl rule__Formula__Group__5 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3151:2: rule__Formula__Group__4__Impl rule__Formula__Group__5
            {
            pushFollow(FOLLOW_rule__Formula__Group__4__Impl_in_rule__Formula__Group__46315);
            rule__Formula__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__5_in_rule__Formula__Group__46318);
            rule__Formula__Group__5();

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
    // $ANTLR end "rule__Formula__Group__4"


    // $ANTLR start "rule__Formula__Group__4__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3158:1: rule__Formula__Group__4__Impl : ( '=' ) ;
    public final void rule__Formula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3162:1: ( ( '=' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3163:1: ( '=' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3163:1: ( '=' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3164:1: '='
            {
             before(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Formula__Group__4__Impl6346); 
             after(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__4__Impl"


    // $ANTLR start "rule__Formula__Group__5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3177:1: rule__Formula__Group__5 : rule__Formula__Group__5__Impl rule__Formula__Group__6 ;
    public final void rule__Formula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3181:1: ( rule__Formula__Group__5__Impl rule__Formula__Group__6 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3182:2: rule__Formula__Group__5__Impl rule__Formula__Group__6
            {
            pushFollow(FOLLOW_rule__Formula__Group__5__Impl_in_rule__Formula__Group__56377);
            rule__Formula__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__6_in_rule__Formula__Group__56380);
            rule__Formula__Group__6();

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
    // $ANTLR end "rule__Formula__Group__5"


    // $ANTLR start "rule__Formula__Group__5__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3189:1: rule__Formula__Group__5__Impl : ( ( rule__Formula__ExpresionesAssignment_5 )* ) ;
    public final void rule__Formula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3193:1: ( ( ( rule__Formula__ExpresionesAssignment_5 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3194:1: ( ( rule__Formula__ExpresionesAssignment_5 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3194:1: ( ( rule__Formula__ExpresionesAssignment_5 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3195:1: ( rule__Formula__ExpresionesAssignment_5 )*
            {
             before(grammarAccess.getFormulaAccess().getExpresionesAssignment_5()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3196:1: ( rule__Formula__ExpresionesAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||LA21_0==RULE_NUMBER||LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3196:2: rule__Formula__ExpresionesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Formula__ExpresionesAssignment_5_in_rule__Formula__Group__5__Impl6407);
            	    rule__Formula__ExpresionesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFormulaAccess().getExpresionesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__5__Impl"


    // $ANTLR start "rule__Formula__Group__6"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3206:1: rule__Formula__Group__6 : rule__Formula__Group__6__Impl rule__Formula__Group__7 ;
    public final void rule__Formula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3210:1: ( rule__Formula__Group__6__Impl rule__Formula__Group__7 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3211:2: rule__Formula__Group__6__Impl rule__Formula__Group__7
            {
            pushFollow(FOLLOW_rule__Formula__Group__6__Impl_in_rule__Formula__Group__66438);
            rule__Formula__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__7_in_rule__Formula__Group__66441);
            rule__Formula__Group__7();

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
    // $ANTLR end "rule__Formula__Group__6"


    // $ANTLR start "rule__Formula__Group__6__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3218:1: rule__Formula__Group__6__Impl : ( ';' ) ;
    public final void rule__Formula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3222:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3223:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3223:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3224:1: ';'
            {
             before(grammarAccess.getFormulaAccess().getSemicolonKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Formula__Group__6__Impl6469); 
             after(grammarAccess.getFormulaAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__6__Impl"


    // $ANTLR start "rule__Formula__Group__7"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3237:1: rule__Formula__Group__7 : rule__Formula__Group__7__Impl ;
    public final void rule__Formula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3241:1: ( rule__Formula__Group__7__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3242:2: rule__Formula__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Formula__Group__7__Impl_in_rule__Formula__Group__76500);
            rule__Formula__Group__7__Impl();

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
    // $ANTLR end "rule__Formula__Group__7"


    // $ANTLR start "rule__Formula__Group__7__Impl"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3248:1: rule__Formula__Group__7__Impl : ( '}' ) ;
    public final void rule__Formula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3252:1: ( ( '}' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3253:1: ( '}' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3253:1: ( '}' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3254:1: '}'
            {
             before(grammarAccess.getFormulaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__Formula__Group__7__Impl6528); 
             after(grammarAccess.getFormulaAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__7__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3284:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3288:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3289:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__06576);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__06579);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3296:1: rule__Definition__Group__0__Impl : ( 'def' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3300:1: ( ( 'def' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3301:1: ( 'def' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3301:1: ( 'def' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3302:1: 'def'
            {
             before(grammarAccess.getDefinitionAccess().getDefKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Definition__Group__0__Impl6607); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3315:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3319:1: ( rule__Definition__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3320:2: rule__Definition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__16638);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3326:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__NameAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3330:1: ( ( ( rule__Definition__NameAssignment_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3331:1: ( ( rule__Definition__NameAssignment_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3331:1: ( ( rule__Definition__NameAssignment_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3332:1: ( rule__Definition__NameAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3333:1: ( rule__Definition__NameAssignment_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3333:2: rule__Definition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl6665);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3347:1: rule__Evaluation__Group__0 : rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 ;
    public final void rule__Evaluation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3351:1: ( rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3352:2: rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__06699);
            rule__Evaluation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__06702);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3359:1: rule__Evaluation__Group__0__Impl : ( ( rule__Evaluation__ExpressionAssignment_0 ) ) ;
    public final void rule__Evaluation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3363:1: ( ( ( rule__Evaluation__ExpressionAssignment_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3364:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3364:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3365:1: ( rule__Evaluation__ExpressionAssignment_0 )
            {
             before(grammarAccess.getEvaluationAccess().getExpressionAssignment_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3366:1: ( rule__Evaluation__ExpressionAssignment_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3366:2: rule__Evaluation__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__Evaluation__ExpressionAssignment_0_in_rule__Evaluation__Group__0__Impl6729);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3376:1: rule__Evaluation__Group__1 : rule__Evaluation__Group__1__Impl ;
    public final void rule__Evaluation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3380:1: ( rule__Evaluation__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3381:2: rule__Evaluation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__16759);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3387:1: rule__Evaluation__Group__1__Impl : ( ';' ) ;
    public final void rule__Evaluation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3391:1: ( ( ';' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3392:1: ( ';' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3392:1: ( ';' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3393:1: ';'
            {
             before(grammarAccess.getEvaluationAccess().getSemicolonKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Evaluation__Group__1__Impl6787); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3410:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3414:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3415:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__06822);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__06825);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3422:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3426:1: ( ( ruleMultiplication ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3427:1: ( ruleMultiplication )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3427:1: ( ruleMultiplication )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3428:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl6852);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3439:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3443:1: ( rule__Addition__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3444:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__16881);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3450:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3454:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3455:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3455:1: ( ( rule__Addition__Group_1__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3456:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3457:1: ( rule__Addition__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=26 && LA22_0<=27)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3457:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl6908);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3471:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3475:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3476:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__06943);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__06946);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3483:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3487:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3488:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3488:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3489:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3490:1: ( rule__Addition__Alternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3490:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl6973);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3500:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3504:1: ( rule__Addition__Group_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3505:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__17003);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3511:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3515:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3516:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3516:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3517:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3518:1: ( rule__Addition__RightAssignment_1_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3518:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl7030);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3532:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3536:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3537:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__07064);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__07067);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3544:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3548:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3549:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3549:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3550:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3551:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3553:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3563:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3567:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3568:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__17125);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3574:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3578:1: ( ( '+' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3579:1: ( '+' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3579:1: ( '+' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3580:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,26,FOLLOW_26_in_rule__Addition__Group_1_0_0__1__Impl7153); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3597:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3601:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3602:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__07188);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__07191);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3609:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3613:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3614:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3614:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3615:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3616:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3618:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3628:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3632:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3633:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__17249);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3639:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3643:1: ( ( '-' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3644:1: ( '-' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3644:1: ( '-' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3645:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,27,FOLLOW_27_in_rule__Addition__Group_1_0_1__1__Impl7277); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3662:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3666:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3667:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__07312);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__07315);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3674:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3678:1: ( ( rulePrimaryExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3679:1: ( rulePrimaryExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3679:1: ( rulePrimaryExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3680:1: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl7342);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3691:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3695:1: ( rule__Multiplication__Group__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3696:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__17371);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3702:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3706:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3707:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3707:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3708:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3709:1: ( rule__Multiplication__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=28 && LA23_0<=29)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3709:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7398);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3723:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3727:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3728:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07433);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07436);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3735:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3739:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3740:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3740:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3741:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3742:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3742:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl7463);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3752:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3756:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3757:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17493);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3763:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3767:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3768:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3768:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3769:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3770:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3770:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl7520);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3784:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3788:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3789:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__07554);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__07557);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3796:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3800:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3801:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3801:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3802:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3803:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3805:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3815:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3819:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3820:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__17615);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3826:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3830:1: ( ( '*' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3831:1: ( '*' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3831:1: ( '*' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3832:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,28,FOLLOW_28_in_rule__Multiplication__Group_1_0_0__1__Impl7643); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3849:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3853:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3854:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__07678);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__07681);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3861:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3865:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3866:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3866:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3867:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3868:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3870:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3880:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3884:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3885:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__17739);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3891:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3895:1: ( ( '/' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3896:1: ( '/' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3896:1: ( '/' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3897:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,29,FOLLOW_29_in_rule__Multiplication__Group_1_0_1__1__Impl7767); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3914:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3918:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3919:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__07802);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__07805);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3926:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3930:1: ( ( '(' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3931:1: ( '(' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3931:1: ( '(' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3932:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__PrimaryExpression__Group_0__0__Impl7833); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3945:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3949:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3950:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__17864);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__17867);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3957:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3961:1: ( ( ruleExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3962:1: ( ruleExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3962:1: ( ruleExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3963:1: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl7894);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3974:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3978:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3979:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__27923);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3985:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3989:1: ( ( ')' ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3990:1: ( ')' )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3990:1: ( ')' )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:3991:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,31,FOLLOW_31_in_rule__PrimaryExpression__Group_0__2__Impl7951); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4010:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4014:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4015:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__07988);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__07991);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4022:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4026:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4027:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4027:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4028:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4029:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4031:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4041:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4045:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4046:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__18049);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4052:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4056:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4057:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4057:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4058:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4059:1: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4059:2: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl8076);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4073:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4077:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4078:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__08110);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__08113);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4085:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4089:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4090:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4090:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4091:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getSTRINGAction_2_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4092:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4094:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4104:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4108:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4109:2: rule__PrimaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__18171);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4115:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4119:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4120:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4120:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4121:1: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4122:1: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4122:2: rule__PrimaryExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl8198);
            rule__PrimaryExpression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 

            }


            }

        }
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4136:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4140:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4141:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__08232);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__08235);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4148:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4152:1: ( ( () ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4153:1: ( () )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4153:1: ( () )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4154:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getIDAction_3_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4155:1: ()
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4157:1: 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4167:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4171:1: ( rule__PrimaryExpression__Group_3__1__Impl )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4172:2: rule__PrimaryExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__18293);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4178:1: rule__PrimaryExpression__Group_3__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4182:1: ( ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4183:1: ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4183:1: ( ( rule__PrimaryExpression__ValueAssignment_3_1 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4184:1: ( rule__PrimaryExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_3_1()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4185:1: ( rule__PrimaryExpression__ValueAssignment_3_1 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4185:2: rule__PrimaryExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_3_1_in_rule__PrimaryExpression__Group_3__1__Impl8320);
            rule__PrimaryExpression__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__NombreAssignment_0"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4200:1: rule__Model__NombreAssignment_0 : ( RULE_ID ) ;
    public final void rule__Model__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4204:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4205:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4205:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4206:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNombreIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NombreAssignment_08359); 
             after(grammarAccess.getModelAccess().getNombreIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NombreAssignment_0"


    // $ANTLR start "rule__Model__EntidadesAssignment_2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4215:1: rule__Model__EntidadesAssignment_2 : ( ruleEntidad ) ;
    public final void rule__Model__EntidadesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4219:1: ( ( ruleEntidad ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4220:1: ( ruleEntidad )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4220:1: ( ruleEntidad )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4221:1: ruleEntidad
            {
             before(grammarAccess.getModelAccess().getEntidadesEntidadParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntidad_in_rule__Model__EntidadesAssignment_28390);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntidadesEntidadParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntidadesAssignment_2"


    // $ANTLR start "rule__Registro__NombreAssignment_2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4230:1: rule__Registro__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Registro__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4234:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4235:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4235:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4236:1: RULE_STRING
            {
             before(grammarAccess.getRegistroAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Registro__NombreAssignment_28421); 
             after(grammarAccess.getRegistroAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__NombreAssignment_2"


    // $ANTLR start "rule__Registro__PropiedadesAssignment_4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4245:1: rule__Registro__PropiedadesAssignment_4 : ( ruleObjeto ) ;
    public final void rule__Registro__PropiedadesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4249:1: ( ( ruleObjeto ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4250:1: ( ruleObjeto )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4250:1: ( ruleObjeto )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4251:1: ruleObjeto
            {
             before(grammarAccess.getRegistroAccess().getPropiedadesObjetoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleObjeto_in_rule__Registro__PropiedadesAssignment_48452);
            ruleObjeto();

            state._fsp--;

             after(grammarAccess.getRegistroAccess().getPropiedadesObjetoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__PropiedadesAssignment_4"


    // $ANTLR start "rule__Registro__FormulaAssignment_5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4260:1: rule__Registro__FormulaAssignment_5 : ( ruleFormula ) ;
    public final void rule__Registro__FormulaAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4264:1: ( ( ruleFormula ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4265:1: ( ruleFormula )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4265:1: ( ruleFormula )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4266:1: ruleFormula
            {
             before(grammarAccess.getRegistroAccess().getFormulaFormulaParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFormula_in_rule__Registro__FormulaAssignment_58483);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getRegistroAccess().getFormulaFormulaParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__FormulaAssignment_5"


    // $ANTLR start "rule__Contacto__NombreAssignment_2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4275:1: rule__Contacto__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Contacto__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4279:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4280:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4280:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4281:1: RULE_STRING
            {
             before(grammarAccess.getContactoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Contacto__NombreAssignment_28514); 
             after(grammarAccess.getContactoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacto__NombreAssignment_2"


    // $ANTLR start "rule__Contacto__PropiedadesAssignment_4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4290:1: rule__Contacto__PropiedadesAssignment_4 : ( ruleAtributo ) ;
    public final void rule__Contacto__PropiedadesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4294:1: ( ( ruleAtributo ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4295:1: ( ruleAtributo )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4295:1: ( ruleAtributo )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4296:1: ruleAtributo
            {
             before(grammarAccess.getContactoAccess().getPropiedadesAtributoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAtributo_in_rule__Contacto__PropiedadesAssignment_48545);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getContactoAccess().getPropiedadesAtributoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacto__PropiedadesAssignment_4"


    // $ANTLR start "rule__Pago__NombreAssignment_2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4305:1: rule__Pago__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Pago__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4309:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4310:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4310:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4311:1: RULE_STRING
            {
             before(grammarAccess.getPagoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pago__NombreAssignment_28576); 
             after(grammarAccess.getPagoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pago__NombreAssignment_2"


    // $ANTLR start "rule__Pago__PropiedadesAssignment_4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4320:1: rule__Pago__PropiedadesAssignment_4 : ( ruleAtributo ) ;
    public final void rule__Pago__PropiedadesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4324:1: ( ( ruleAtributo ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4325:1: ( ruleAtributo )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4325:1: ( ruleAtributo )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4326:1: ruleAtributo
            {
             before(grammarAccess.getPagoAccess().getPropiedadesAtributoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAtributo_in_rule__Pago__PropiedadesAssignment_48607);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getPagoAccess().getPropiedadesAtributoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pago__PropiedadesAssignment_4"


    // $ANTLR start "rule__Objeto__NombreAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4335:1: rule__Objeto__NombreAssignment_1 : ( RULE_ID ) ;
    public final void rule__Objeto__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4339:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4340:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4340:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4341:1: RULE_ID
            {
             before(grammarAccess.getObjetoAccess().getNombreIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Objeto__NombreAssignment_18638); 
             after(grammarAccess.getObjetoAccess().getNombreIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__NombreAssignment_1"


    // $ANTLR start "rule__Objeto__DescripcionAssignment_2"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4350:1: rule__Objeto__DescripcionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Objeto__DescripcionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4354:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4355:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4355:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4356:1: RULE_STRING
            {
             before(grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Objeto__DescripcionAssignment_28669); 
             after(grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__DescripcionAssignment_2"


    // $ANTLR start "rule__Objeto__PropiedadesAssignment_4"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4365:1: rule__Objeto__PropiedadesAssignment_4 : ( rulePropiedad ) ;
    public final void rule__Objeto__PropiedadesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4369:1: ( ( rulePropiedad ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4370:1: ( rulePropiedad )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4370:1: ( rulePropiedad )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4371:1: rulePropiedad
            {
             before(grammarAccess.getObjetoAccess().getPropiedadesPropiedadParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePropiedad_in_rule__Objeto__PropiedadesAssignment_48700);
            rulePropiedad();

            state._fsp--;

             after(grammarAccess.getObjetoAccess().getPropiedadesPropiedadParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__PropiedadesAssignment_4"


    // $ANTLR start "rule__AtributoSimple__NombreAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4380:1: rule__AtributoSimple__NombreAssignment_1 : ( ( rule__AtributoSimple__NombreAlternatives_1_0 ) ) ;
    public final void rule__AtributoSimple__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4384:1: ( ( ( rule__AtributoSimple__NombreAlternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4385:1: ( ( rule__AtributoSimple__NombreAlternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4385:1: ( ( rule__AtributoSimple__NombreAlternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4386:1: ( rule__AtributoSimple__NombreAlternatives_1_0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNombreAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4387:1: ( rule__AtributoSimple__NombreAlternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4387:2: rule__AtributoSimple__NombreAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AtributoSimple__NombreAlternatives_1_0_in_rule__AtributoSimple__NombreAssignment_18731);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4396:1: rule__AtributoSimple__TipoAssignment_3 : ( RULE_DATATYPE ) ;
    public final void rule__AtributoSimple__TipoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4400:1: ( ( RULE_DATATYPE ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4401:1: ( RULE_DATATYPE )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4401:1: ( RULE_DATATYPE )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4402:1: RULE_DATATYPE
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoDATATYPETerminalRuleCall_3_0()); 
            match(input,RULE_DATATYPE,FOLLOW_RULE_DATATYPE_in_rule__AtributoSimple__TipoAssignment_38764); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4411:1: rule__AtributoInicializado__NombreAssignment_1 : ( ( rule__AtributoInicializado__NombreAlternatives_1_0 ) ) ;
    public final void rule__AtributoInicializado__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4415:1: ( ( ( rule__AtributoInicializado__NombreAlternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4416:1: ( ( rule__AtributoInicializado__NombreAlternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4416:1: ( ( rule__AtributoInicializado__NombreAlternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4417:1: ( rule__AtributoInicializado__NombreAlternatives_1_0 )
            {
             before(grammarAccess.getAtributoInicializadoAccess().getNombreAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4418:1: ( rule__AtributoInicializado__NombreAlternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4418:2: rule__AtributoInicializado__NombreAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AtributoInicializado__NombreAlternatives_1_0_in_rule__AtributoInicializado__NombreAssignment_18795);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4427:1: rule__AtributoInicializado__TipoAssignment_3 : ( RULE_DATATYPE ) ;
    public final void rule__AtributoInicializado__TipoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4431:1: ( ( RULE_DATATYPE ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4432:1: ( RULE_DATATYPE )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4432:1: ( RULE_DATATYPE )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4433:1: RULE_DATATYPE
            {
             before(grammarAccess.getAtributoInicializadoAccess().getTipoDATATYPETerminalRuleCall_3_0()); 
            match(input,RULE_DATATYPE,FOLLOW_RULE_DATATYPE_in_rule__AtributoInicializado__TipoAssignment_38828); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4442:1: rule__AtributoInicializado__ValorAssignment_5 : ( RULE_NUMBER ) ;
    public final void rule__AtributoInicializado__ValorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4446:1: ( ( RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4447:1: ( RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4447:1: ( RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4448:1: RULE_NUMBER
            {
             before(grammarAccess.getAtributoInicializadoAccess().getValorNUMBERTerminalRuleCall_5_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__AtributoInicializado__ValorAssignment_58859); 
             after(grammarAccess.getAtributoInicializadoAccess().getValorNUMBERTerminalRuleCall_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AtributoListaString__NombreAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4457:1: rule__AtributoListaString__NombreAssignment_1 : ( ( rule__AtributoListaString__NombreAlternatives_1_0 ) ) ;
    public final void rule__AtributoListaString__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4461:1: ( ( ( rule__AtributoListaString__NombreAlternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4462:1: ( ( rule__AtributoListaString__NombreAlternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4462:1: ( ( rule__AtributoListaString__NombreAlternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4463:1: ( rule__AtributoListaString__NombreAlternatives_1_0 )
            {
             before(grammarAccess.getAtributoListaStringAccess().getNombreAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4464:1: ( rule__AtributoListaString__NombreAlternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4464:2: rule__AtributoListaString__NombreAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AtributoListaString__NombreAlternatives_1_0_in_rule__AtributoListaString__NombreAssignment_18890);
            rule__AtributoListaString__NombreAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoListaStringAccess().getNombreAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__NombreAssignment_1"


    // $ANTLR start "rule__AtributoListaString__ValoresAssignment_6"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4473:1: rule__AtributoListaString__ValoresAssignment_6 : ( RULE_STRING ) ;
    public final void rule__AtributoListaString__ValoresAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4477:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4478:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4478:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4479:1: RULE_STRING
            {
             before(grammarAccess.getAtributoListaStringAccess().getValoresSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AtributoListaString__ValoresAssignment_68923); 
             after(grammarAccess.getAtributoListaStringAccess().getValoresSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__ValoresAssignment_6"


    // $ANTLR start "rule__AtributoListaString__ValoresAssignment_7_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4488:1: rule__AtributoListaString__ValoresAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__AtributoListaString__ValoresAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4492:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4493:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4493:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4494:1: RULE_STRING
            {
             before(grammarAccess.getAtributoListaStringAccess().getValoresSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AtributoListaString__ValoresAssignment_7_18954); 
             after(grammarAccess.getAtributoListaStringAccess().getValoresSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaString__ValoresAssignment_7_1"


    // $ANTLR start "rule__AtributoListaInteger__NombreAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4503:1: rule__AtributoListaInteger__NombreAssignment_1 : ( ( rule__AtributoListaInteger__NombreAlternatives_1_0 ) ) ;
    public final void rule__AtributoListaInteger__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4507:1: ( ( ( rule__AtributoListaInteger__NombreAlternatives_1_0 ) ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4508:1: ( ( rule__AtributoListaInteger__NombreAlternatives_1_0 ) )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4508:1: ( ( rule__AtributoListaInteger__NombreAlternatives_1_0 ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4509:1: ( rule__AtributoListaInteger__NombreAlternatives_1_0 )
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getNombreAlternatives_1_0()); 
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4510:1: ( rule__AtributoListaInteger__NombreAlternatives_1_0 )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4510:2: rule__AtributoListaInteger__NombreAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AtributoListaInteger__NombreAlternatives_1_0_in_rule__AtributoListaInteger__NombreAssignment_18985);
            rule__AtributoListaInteger__NombreAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoListaIntegerAccess().getNombreAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__NombreAssignment_1"


    // $ANTLR start "rule__AtributoListaInteger__ValoresAssignment_6"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4519:1: rule__AtributoListaInteger__ValoresAssignment_6 : ( RULE_NUMBER ) ;
    public final void rule__AtributoListaInteger__ValoresAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4523:1: ( ( RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4524:1: ( RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4524:1: ( RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4525:1: RULE_NUMBER
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getValoresNUMBERTerminalRuleCall_6_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__AtributoListaInteger__ValoresAssignment_69018); 
             after(grammarAccess.getAtributoListaIntegerAccess().getValoresNUMBERTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__ValoresAssignment_6"


    // $ANTLR start "rule__AtributoListaInteger__ValoresAssignment_7_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4534:1: rule__AtributoListaInteger__ValoresAssignment_7_1 : ( RULE_NUMBER ) ;
    public final void rule__AtributoListaInteger__ValoresAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4538:1: ( ( RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4539:1: ( RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4539:1: ( RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4540:1: RULE_NUMBER
            {
             before(grammarAccess.getAtributoListaIntegerAccess().getValoresNUMBERTerminalRuleCall_7_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__AtributoListaInteger__ValoresAssignment_7_19049); 
             after(grammarAccess.getAtributoListaIntegerAccess().getValoresNUMBERTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoListaInteger__ValoresAssignment_7_1"


    // $ANTLR start "rule__Formula__NombreAssignment_3"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4549:1: rule__Formula__NombreAssignment_3 : ( RULE_ID ) ;
    public final void rule__Formula__NombreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4553:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4554:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4554:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4555:1: RULE_ID
            {
             before(grammarAccess.getFormulaAccess().getNombreIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Formula__NombreAssignment_39080); 
             after(grammarAccess.getFormulaAccess().getNombreIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__NombreAssignment_3"


    // $ANTLR start "rule__Formula__ExpresionesAssignment_5"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4564:1: rule__Formula__ExpresionesAssignment_5 : ( ruleExpression ) ;
    public final void rule__Formula__ExpresionesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4568:1: ( ( ruleExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4569:1: ( ruleExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4569:1: ( ruleExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4570:1: ruleExpression
            {
             before(grammarAccess.getFormulaAccess().getExpresionesExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Formula__ExpresionesAssignment_59111);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getExpresionesExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__ExpresionesAssignment_5"


    // $ANTLR start "rule__Definition__NameAssignment_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4581:1: rule__Definition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4585:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4586:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4586:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4587:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_19144); 
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4596:1: rule__Evaluation__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__Evaluation__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4600:1: ( ( ruleExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4601:1: ( ruleExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4601:1: ( ruleExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4602:1: ruleExpression
            {
             before(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Evaluation__ExpressionAssignment_09175);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4611:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4615:1: ( ( ruleMultiplication ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4616:1: ( ruleMultiplication )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4616:1: ( ruleMultiplication )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4617:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_19206);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4626:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4630:1: ( ( rulePrimaryExpression ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4631:1: ( rulePrimaryExpression )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4631:1: ( rulePrimaryExpression )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4632:1: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_19237);
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
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4641:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4645:1: ( ( RULE_NUMBER ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4646:1: ( RULE_NUMBER )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4646:1: ( RULE_NUMBER )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4647:1: RULE_NUMBER
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__PrimaryExpression__ValueAssignment_1_19268); 
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


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_2_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4656:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4660:1: ( ( RULE_STRING ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4661:1: ( RULE_STRING )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4661:1: ( RULE_STRING )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4662:1: RULE_STRING
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PrimaryExpression__ValueAssignment_2_19299); 
             after(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_3_1"
    // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4671:1: rule__PrimaryExpression__ValueAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__PrimaryExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4675:1: ( ( RULE_ID ) )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4676:1: ( RULE_ID )
            {
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4676:1: ( RULE_ID )
            // ../co.edu.uniandes.miso4202.vehicletax.ui/src-gen/co/edu/uniandes/miso4202/ehicletax/ui/contentassist/antlr/internal/InternalVtdsl.g:4677:1: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__ValueAssignment_3_19330); 
             after(grammarAccess.getPrimaryExpressionAccess().getValueIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntidad_in_entryRuleEntidad121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntidad128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entidad__Alternatives_in_ruleEntidad154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegistro_in_entryRuleRegistro181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegistro188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Registro__Group__0_in_ruleRegistro214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContacto_in_entryRuleContacto241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContacto248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contacto__Group__0_in_ruleContacto274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePago_in_entryRulePago301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePago308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pago__Group__0_in_rulePago334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropiedad_in_entryRulePropiedad361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropiedad368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Propiedad__Alternatives_in_rulePropiedad394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_entryRuleObjeto421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjeto428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__0_in_ruleObjeto454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoSimple_in_entryRuleAtributoSimple481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoSimple488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__0_in_ruleAtributoSimple514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoInicializado_in_entryRuleAtributoInicializado541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoInicializado548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__0_in_ruleAtributoInicializado574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaString_in_entryRuleAtributoListaString601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoListaString608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__0_in_ruleAtributoListaString634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaInteger_in_entryRuleAtributoListaInteger661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoListaInteger668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__0_in_ruleAtributoListaInteger694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoLista_in_entryRuleAtributoLista721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributoLista728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoLista__Alternatives_in_ruleAtributoLista754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0_in_ruleFormula814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_entryRuleAtributo841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtributo848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atributo__Alternatives_in_ruleAtributo874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegistro_in_rule__Entidad__Alternatives1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContacto_in_rule__Entidad__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePago_in_rule__Entidad__Alternatives1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_rule__Propiedad__Alternatives1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_rule__Propiedad__Alternatives1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtributoSimple__NombreAlternatives_1_01446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AtributoSimple__NombreAlternatives_1_01463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtributoInicializado__NombreAlternatives_1_01495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AtributoInicializado__NombreAlternatives_1_01512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtributoListaString__NombreAlternatives_1_01544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AtributoListaString__NombreAlternatives_1_01561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtributoListaInteger__NombreAlternatives_1_01593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AtributoListaInteger__NombreAlternatives_1_01610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaString_in_rule__AtributoLista__Alternatives1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoListaInteger_in_rule__AtributoLista__Alternatives1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoSimple_in_rule__Atributo__Alternatives1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoInicializado_in_rule__Atributo__Alternatives1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributoLista_in_rule__Atributo__Alternatives1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Statement__Alternatives1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_rule__Statement__Alternatives1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01993 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NombreAssignment_0_in_rule__Model__Group__0__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12053 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group__1__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22115 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EntidadesAssignment_2_in_rule__Model__Group__2__Impl2145 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__3__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Registro__Group__0__Impl_in_rule__Registro__Group__02243 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Registro__Group__1_in_rule__Registro__Group__02246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Registro__Group__1__Impl_in_rule__Registro__Group__12304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Registro__Group__2_in_rule__Registro__Group__12307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Registro__Group__1__Impl2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Registro__Group__2__Impl_in_rule__Registro__Group__22366 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Registro__Group__3_in_rule__Registro__Group__22369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Registro__NombreAssignment_2_in_rule__Registro__Group__2__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Registro__Group__3__Impl_in_rule__Registro__Group__32426 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Registro__Group__4_in_rule__Registro__Group__32429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Registro__Group__3__Impl2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Registro__Group__4__Impl_in_rule__Registro__Group__42488 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Registro__Group__5_in_rule__Registro__Group__42491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Registro__PropiedadesAssignment_4_in_rule__Registro__Group__4__Impl2518 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Registro__Group__5__Impl_in_rule__Registro__Group__52549 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Registro__Group__6_in_rule__Registro__Group__52552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Registro__FormulaAssignment_5_in_rule__Registro__Group__5__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Registro__Group__6__Impl_in_rule__Registro__Group__62609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Registro__Group__6__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contacto__Group__0__Impl_in_rule__Contacto__Group__02682 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Contacto__Group__1_in_rule__Contacto__Group__02685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contacto__Group__1__Impl_in_rule__Contacto__Group__12743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Contacto__Group__2_in_rule__Contacto__Group__12746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Contacto__Group__1__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contacto__Group__2__Impl_in_rule__Contacto__Group__22805 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Contacto__Group__3_in_rule__Contacto__Group__22808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contacto__NombreAssignment_2_in_rule__Contacto__Group__2__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contacto__Group__3__Impl_in_rule__Contacto__Group__32865 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Contacto__Group__4_in_rule__Contacto__Group__32868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Contacto__Group__3__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contacto__Group__4__Impl_in_rule__Contacto__Group__42927 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Contacto__Group__5_in_rule__Contacto__Group__42930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contacto__PropiedadesAssignment_4_in_rule__Contacto__Group__4__Impl2957 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Contacto__Group__5__Impl_in_rule__Contacto__Group__52988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Contacto__Group__5__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pago__Group__0__Impl_in_rule__Pago__Group__03059 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Pago__Group__1_in_rule__Pago__Group__03062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pago__Group__1__Impl_in_rule__Pago__Group__13120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Pago__Group__2_in_rule__Pago__Group__13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Pago__Group__1__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pago__Group__2__Impl_in_rule__Pago__Group__23182 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Pago__Group__3_in_rule__Pago__Group__23185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pago__NombreAssignment_2_in_rule__Pago__Group__2__Impl3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pago__Group__3__Impl_in_rule__Pago__Group__33242 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Pago__Group__4_in_rule__Pago__Group__33245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Pago__Group__3__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pago__Group__4__Impl_in_rule__Pago__Group__43304 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Pago__Group__5_in_rule__Pago__Group__43307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pago__PropiedadesAssignment_4_in_rule__Pago__Group__4__Impl3334 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Pago__Group__5__Impl_in_rule__Pago__Group__53365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Pago__Group__5__Impl3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__0__Impl_in_rule__Objeto__Group__03436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Objeto__Group__1_in_rule__Objeto__Group__03439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__1__Impl_in_rule__Objeto__Group__13497 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__Objeto__Group__2_in_rule__Objeto__Group__13500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__NombreAssignment_1_in_rule__Objeto__Group__1__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__2__Impl_in_rule__Objeto__Group__23557 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__Objeto__Group__3_in_rule__Objeto__Group__23560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__DescripcionAssignment_2_in_rule__Objeto__Group__2__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__3__Impl_in_rule__Objeto__Group__33618 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Objeto__Group__4_in_rule__Objeto__Group__33621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Objeto__Group__3__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__4__Impl_in_rule__Objeto__Group__43680 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__Objeto__Group__5_in_rule__Objeto__Group__43683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__PropiedadesAssignment_4_in_rule__Objeto__Group__4__Impl3710 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Objeto__Group__5__Impl_in_rule__Objeto__Group__53741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Objeto__Group__5__Impl3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__0__Impl_in_rule__AtributoSimple__Group__03812 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__1_in_rule__AtributoSimple__Group__03815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__1__Impl_in_rule__AtributoSimple__Group__13873 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__2_in_rule__AtributoSimple__Group__13876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__NombreAssignment_1_in_rule__AtributoSimple__Group__1__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__2__Impl_in_rule__AtributoSimple__Group__23933 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__3_in_rule__AtributoSimple__Group__23936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AtributoSimple__Group__2__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__3__Impl_in_rule__AtributoSimple__Group__33995 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__4_in_rule__AtributoSimple__Group__33998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__TipoAssignment_3_in_rule__AtributoSimple__Group__3__Impl4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__Group__4__Impl_in_rule__AtributoSimple__Group__44055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AtributoSimple__Group__4__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__0__Impl_in_rule__AtributoInicializado__Group__04124 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__1_in_rule__AtributoInicializado__Group__04127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__1__Impl_in_rule__AtributoInicializado__Group__14185 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__2_in_rule__AtributoInicializado__Group__14188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__NombreAssignment_1_in_rule__AtributoInicializado__Group__1__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__2__Impl_in_rule__AtributoInicializado__Group__24245 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__3_in_rule__AtributoInicializado__Group__24248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AtributoInicializado__Group__2__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__3__Impl_in_rule__AtributoInicializado__Group__34307 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__4_in_rule__AtributoInicializado__Group__34310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__TipoAssignment_3_in_rule__AtributoInicializado__Group__3__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__4__Impl_in_rule__AtributoInicializado__Group__44367 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__5_in_rule__AtributoInicializado__Group__44370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AtributoInicializado__Group__4__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__5__Impl_in_rule__AtributoInicializado__Group__54429 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__6_in_rule__AtributoInicializado__Group__54432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__ValorAssignment_5_in_rule__AtributoInicializado__Group__5__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__Group__6__Impl_in_rule__AtributoInicializado__Group__64489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AtributoInicializado__Group__6__Impl4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__0__Impl_in_rule__AtributoListaString__Group__04562 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__1_in_rule__AtributoListaString__Group__04565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__1__Impl_in_rule__AtributoListaString__Group__14623 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__2_in_rule__AtributoListaString__Group__14626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__NombreAssignment_1_in_rule__AtributoListaString__Group__1__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__2__Impl_in_rule__AtributoListaString__Group__24683 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__3_in_rule__AtributoListaString__Group__24686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AtributoListaString__Group__2__Impl4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__3__Impl_in_rule__AtributoListaString__Group__34745 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__4_in_rule__AtributoListaString__Group__34748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AtributoListaString__Group__3__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__4__Impl_in_rule__AtributoListaString__Group__44807 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__5_in_rule__AtributoListaString__Group__44810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AtributoListaString__Group__4__Impl4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__5__Impl_in_rule__AtributoListaString__Group__54869 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__6_in_rule__AtributoListaString__Group__54872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AtributoListaString__Group__5__Impl4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__6__Impl_in_rule__AtributoListaString__Group__64931 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__7_in_rule__AtributoListaString__Group__64934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__ValoresAssignment_6_in_rule__AtributoListaString__Group__6__Impl4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__7__Impl_in_rule__AtributoListaString__Group__74991 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__8_in_rule__AtributoListaString__Group__74994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group_7__0_in_rule__AtributoListaString__Group__7__Impl5021 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__8__Impl_in_rule__AtributoListaString__Group__85052 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__9_in_rule__AtributoListaString__Group__85055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AtributoListaString__Group__8__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group__9__Impl_in_rule__AtributoListaString__Group__95114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AtributoListaString__Group__9__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group_7__0__Impl_in_rule__AtributoListaString__Group_7__05193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group_7__1_in_rule__AtributoListaString__Group_7__05196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AtributoListaString__Group_7__0__Impl5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__Group_7__1__Impl_in_rule__AtributoListaString__Group_7__15255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__ValoresAssignment_7_1_in_rule__AtributoListaString__Group_7__1__Impl5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__0__Impl_in_rule__AtributoListaInteger__Group__05316 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__1_in_rule__AtributoListaInteger__Group__05319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__1__Impl_in_rule__AtributoListaInteger__Group__15377 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__2_in_rule__AtributoListaInteger__Group__15380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__NombreAssignment_1_in_rule__AtributoListaInteger__Group__1__Impl5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__2__Impl_in_rule__AtributoListaInteger__Group__25437 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__3_in_rule__AtributoListaInteger__Group__25440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AtributoListaInteger__Group__2__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__3__Impl_in_rule__AtributoListaInteger__Group__35499 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__4_in_rule__AtributoListaInteger__Group__35502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AtributoListaInteger__Group__3__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__4__Impl_in_rule__AtributoListaInteger__Group__45561 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__5_in_rule__AtributoListaInteger__Group__45564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AtributoListaInteger__Group__4__Impl5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__5__Impl_in_rule__AtributoListaInteger__Group__55623 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__6_in_rule__AtributoListaInteger__Group__55626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AtributoListaInteger__Group__5__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__6__Impl_in_rule__AtributoListaInteger__Group__65685 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__7_in_rule__AtributoListaInteger__Group__65688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__ValoresAssignment_6_in_rule__AtributoListaInteger__Group__6__Impl5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__7__Impl_in_rule__AtributoListaInteger__Group__75745 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__8_in_rule__AtributoListaInteger__Group__75748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group_7__0_in_rule__AtributoListaInteger__Group__7__Impl5775 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__8__Impl_in_rule__AtributoListaInteger__Group__85806 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__9_in_rule__AtributoListaInteger__Group__85809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AtributoListaInteger__Group__8__Impl5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group__9__Impl_in_rule__AtributoListaInteger__Group__95868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AtributoListaInteger__Group__9__Impl5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group_7__0__Impl_in_rule__AtributoListaInteger__Group_7__05947 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group_7__1_in_rule__AtributoListaInteger__Group_7__05950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AtributoListaInteger__Group_7__0__Impl5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__Group_7__1__Impl_in_rule__AtributoListaInteger__Group_7__16009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__ValoresAssignment_7_1_in_rule__AtributoListaInteger__Group_7__1__Impl6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__06070 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__06073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__16131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__16134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Formula__Group__1__Impl6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__26193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Formula__Group__3_in_rule__Formula__Group__26196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Formula__Group__2__Impl6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__3__Impl_in_rule__Formula__Group__36255 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Formula__Group__4_in_rule__Formula__Group__36258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__NombreAssignment_3_in_rule__Formula__Group__3__Impl6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__4__Impl_in_rule__Formula__Group__46315 = new BitSet(new long[]{0x00000000400800B0L});
    public static final BitSet FOLLOW_rule__Formula__Group__5_in_rule__Formula__Group__46318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Formula__Group__4__Impl6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__5__Impl_in_rule__Formula__Group__56377 = new BitSet(new long[]{0x00000000400800B0L});
    public static final BitSet FOLLOW_rule__Formula__Group__6_in_rule__Formula__Group__56380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__ExpresionesAssignment_5_in_rule__Formula__Group__5__Impl6407 = new BitSet(new long[]{0x00000000400000B2L});
    public static final BitSet FOLLOW_rule__Formula__Group__6__Impl_in_rule__Formula__Group__66438 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Formula__Group__7_in_rule__Formula__Group__66441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Formula__Group__6__Impl6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__7__Impl_in_rule__Formula__Group__76500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Formula__Group__7__Impl6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__06576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__06579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Definition__Group__0__Impl6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__16638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__06699 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__06702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__ExpressionAssignment_0_in_rule__Evaluation__Group__0__Impl6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__16759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Evaluation__Group__1__Impl6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__06822 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__06825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__16881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl6908 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__06943 = new BitSet(new long[]{0x00000000400000B0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__06946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl6973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__17003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__07064 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__07067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__17125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Addition__Group_1_0_0__1__Impl7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__07188 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__07191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__17249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Addition__Group_1_0_1__1__Impl7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__07312 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__07315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__Group__0__Impl7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__17371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7398 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07433 = new BitSet(new long[]{0x00000000400000B0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__07554 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__07557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__17615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Multiplication__Group_1_0_0__1__Impl7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__07678 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__07681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__17739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Multiplication__Group_1_0_1__1__Impl7767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__07802 = new BitSet(new long[]{0x00000000400000B0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__07805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PrimaryExpression__Group_0__0__Impl7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__17864 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__17867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__27923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PrimaryExpression__Group_0__2__Impl7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__07988 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__07991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__18049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl8076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__08110 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__08113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__18171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl8198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__08232 = new BitSet(new long[]{0x00000000400000B0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__08235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__18293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_3_1_in_rule__PrimaryExpression__Group_3__1__Impl8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NombreAssignment_08359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntidad_in_rule__Model__EntidadesAssignment_28390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Registro__NombreAssignment_28421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_rule__Registro__PropiedadesAssignment_48452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_rule__Registro__FormulaAssignment_58483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Contacto__NombreAssignment_28514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_rule__Contacto__PropiedadesAssignment_48545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pago__NombreAssignment_28576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtributo_in_rule__Pago__PropiedadesAssignment_48607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Objeto__NombreAssignment_18638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Objeto__DescripcionAssignment_28669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropiedad_in_rule__Objeto__PropiedadesAssignment_48700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoSimple__NombreAlternatives_1_0_in_rule__AtributoSimple__NombreAssignment_18731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATATYPE_in_rule__AtributoSimple__TipoAssignment_38764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoInicializado__NombreAlternatives_1_0_in_rule__AtributoInicializado__NombreAssignment_18795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATATYPE_in_rule__AtributoInicializado__TipoAssignment_38828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__AtributoInicializado__ValorAssignment_58859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaString__NombreAlternatives_1_0_in_rule__AtributoListaString__NombreAssignment_18890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AtributoListaString__ValoresAssignment_68923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AtributoListaString__ValoresAssignment_7_18954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtributoListaInteger__NombreAlternatives_1_0_in_rule__AtributoListaInteger__NombreAssignment_18985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__AtributoListaInteger__ValoresAssignment_69018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__AtributoListaInteger__ValoresAssignment_7_19049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Formula__NombreAssignment_39080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Formula__ExpresionesAssignment_59111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_19144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Evaluation__ExpressionAssignment_09175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_19206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Multiplication__RightAssignment_1_19237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__PrimaryExpression__ValueAssignment_1_19268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PrimaryExpression__ValueAssignment_2_19299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__ValueAssignment_3_19330 = new BitSet(new long[]{0x0000000000000002L});

}