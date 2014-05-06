package co.edu.uniandes.miso4202.ehicletax.serializer;

import co.edu.uniandes.miso4202.ehicletax.services.VtdslGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class VtdslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VtdslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ListaInt___CommaKeyword_3_0_INTTerminalRuleCall_3_1__a;
	protected AbstractElementAlias match_ListaString___CommaKeyword_3_0_STRINGTerminalRuleCall_3_1__a;
	protected AbstractElementAlias match_TipoSimple_IDTerminalRuleCall_1_0_or_STRINGTerminalRuleCall_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VtdslGrammarAccess) access;
		match_ListaInt___CommaKeyword_3_0_INTTerminalRuleCall_3_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getListaIntAccess().getCommaKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getListaIntAccess().getINTTerminalRuleCall_3_1()));
		match_ListaString___CommaKeyword_3_0_STRINGTerminalRuleCall_3_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getListaStringAccess().getCommaKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getListaStringAccess().getSTRINGTerminalRuleCall_3_1()));
		match_TipoSimple_IDTerminalRuleCall_1_0_or_STRINGTerminalRuleCall_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTipoSimpleAccess().getIDTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getTipoSimpleAccess().getSTRINGTerminalRuleCall_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getDECIMALRule())
			return getDECIMALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal DECIMAL:
	 * 	INT '.' INT
	 * ;
	 */
	protected String getDECIMALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ListaInt___CommaKeyword_3_0_INTTerminalRuleCall_3_1__a.equals(syntax))
				emit_ListaInt___CommaKeyword_3_0_INTTerminalRuleCall_3_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ListaString___CommaKeyword_3_0_STRINGTerminalRuleCall_3_1__a.equals(syntax))
				emit_ListaString___CommaKeyword_3_0_STRINGTerminalRuleCall_3_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TipoSimple_IDTerminalRuleCall_1_0_or_STRINGTerminalRuleCall_1_1.equals(syntax))
				emit_TipoSimple_IDTerminalRuleCall_1_0_or_STRINGTerminalRuleCall_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (',' INT)*
	 */
	protected void emit_ListaInt___CommaKeyword_3_0_INTTerminalRuleCall_3_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' STRING)*
	 */
	protected void emit_ListaString___CommaKeyword_3_0_STRINGTerminalRuleCall_3_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ID | STRING
	 */
	protected void emit_TipoSimple_IDTerminalRuleCall_1_0_or_STRINGTerminalRuleCall_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
