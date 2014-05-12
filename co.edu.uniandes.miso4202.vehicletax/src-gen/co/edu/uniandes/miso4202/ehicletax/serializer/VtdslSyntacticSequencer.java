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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class VtdslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VtdslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_ValorAtributo_IDTerminalRuleCall_1_0_or_NUMBERTerminalRuleCall_1_2_or_STRINGTerminalRuleCall_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VtdslGrammarAccess) access;
		match_PrimaryExpression_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_PrimaryExpression_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_ValorAtributo_IDTerminalRuleCall_1_0_or_NUMBERTerminalRuleCall_1_2_or_STRINGTerminalRuleCall_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getValorAtributoAccess().getIDTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getValorAtributoAccess().getNUMBERTerminalRuleCall_1_2()), new TokenAlias(false, false, grammarAccess.getValorAtributoAccess().getSTRINGTerminalRuleCall_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNUMBERRule())
			return getNUMBERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
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
	 * terminal NUMBER returns ecore::EBigDecimal:
	 * 	('0'..'9')* ('.' ('0'..'9')+)?;
	 */
	protected String getNUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
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
			if(match_PrimaryExpression_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrimaryExpression_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ValorAtributo_IDTerminalRuleCall_1_0_or_NUMBERTerminalRuleCall_1_2_or_STRINGTerminalRuleCall_1_1.equals(syntax))
				emit_ValorAtributo_IDTerminalRuleCall_1_0_or_NUMBERTerminalRuleCall_1_2_or_STRINGTerminalRuleCall_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     NUMBER | STRING | ID
	 */
	protected void emit_ValorAtributo_IDTerminalRuleCall_1_0_or_NUMBERTerminalRuleCall_1_2_or_STRINGTerminalRuleCall_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
