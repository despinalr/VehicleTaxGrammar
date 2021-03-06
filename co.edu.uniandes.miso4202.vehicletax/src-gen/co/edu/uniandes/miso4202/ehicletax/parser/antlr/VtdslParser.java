/*
* generated by Xtext
*/
package co.edu.uniandes.miso4202.ehicletax.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import co.edu.uniandes.miso4202.ehicletax.services.VtdslGrammarAccess;

public class VtdslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private VtdslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected co.edu.uniandes.miso4202.ehicletax.parser.antlr.internal.InternalVtdslParser createParser(XtextTokenStream stream) {
		return new co.edu.uniandes.miso4202.ehicletax.parser.antlr.internal.InternalVtdslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public VtdslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VtdslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
