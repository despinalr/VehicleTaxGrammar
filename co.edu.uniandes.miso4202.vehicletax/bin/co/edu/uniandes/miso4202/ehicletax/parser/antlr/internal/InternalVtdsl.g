/*
* generated by Xtext
*/
grammar InternalVtdsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package co.edu.uniandes.miso4202.ehicletax.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModelo
entryRuleModelo returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModeloRule()); }
	 iv_ruleModelo=ruleModelo 
	 { $current=$iv_ruleModelo.current; } 
	 EOF 
;

// Rule Modelo
ruleModelo returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModeloAccess().getModeloAction_0(),
            $current);
    }
)this_ID_1=RULE_ID
    { 
    newLeafNode(this_ID_1, grammarAccess.getModeloAccess().getIDTerminalRuleCall_1()); 
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModeloAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModeloAccess().getObjetosObjetoParserRuleCall_3_0()); 
	    }
		lv_objetos_3_0=ruleObjeto		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModeloRule());
	        }
       		add(
       			$current, 
       			"objetos",
        		lv_objetos_3_0, 
        		"Objeto");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModeloAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleObjeto
entryRuleObjeto returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getObjetoRule()); }
	 iv_ruleObjeto=ruleObjeto 
	 { $current=$iv_ruleObjeto.current; } 
	 EOF 
;

// Rule Objeto
ruleObjeto returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getObjetoAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getObjetoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)(
(
		lv_descripcion_1_0=RULE_STRING
		{
			newLeafNode(lv_descripcion_1_0, grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getObjetoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"descripcion",
        		lv_descripcion_1_0, 
        		"STRING");
	    }

)
)?	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getObjetoAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getObjetoAccess().getAtributosAtributoParserRuleCall_3_0()); 
	    }
		lv_atributos_3_0=ruleAtributo		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getObjetoRule());
	        }
       		add(
       			$current, 
       			"atributos",
        		lv_atributos_3_0, 
        		"Atributo");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getObjetoAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleAtributoNormal
entryRuleAtributoNormal returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtributoNormalRule()); }
	 iv_ruleAtributoNormal=ruleAtributoNormal 
	 { $current=$iv_ruleAtributoNormal.current; } 
	 EOF 
;

// Rule AtributoNormal
ruleAtributoNormal returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtributoNormalAccess().getAtributoNormalAction_0(),
            $current);
    }
)(
(
(
		lv_nombre_1_1=RULE_ID
		{
			newLeafNode(lv_nombre_1_1, grammarAccess.getAtributoNormalAccess().getNombreIDTerminalRuleCall_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoNormalRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombre",
        		lv_nombre_1_1, 
        		"ID");
	    }

    |		lv_nombre_1_2=RULE_STRING
		{
			newLeafNode(lv_nombre_1_2, grammarAccess.getAtributoNormalAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoNormalRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombre",
        		lv_nombre_1_2, 
        		"STRING");
	    }

)

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAtributoNormalAccess().getColonKeyword_2());
    }
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getAtributoNormalAccess().getValorValorAtributoParserRuleCall_3_0_0()); 
	    }
		lv_valor_3_1=ruleValorAtributo		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtributoNormalRule());
	        }
       		set(
       			$current, 
       			"valor",
        		lv_valor_3_1, 
        		"ValorAtributo");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getAtributoNormalAccess().getValorValorAtributoValorParserRuleCall_3_0_1()); 
	    }
		lv_valor_3_2=ruleValorAtributoValor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtributoNormalRule());
	        }
       		set(
       			$current, 
       			"valor",
        		lv_valor_3_2, 
        		"ValorAtributoValor");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getAtributoNormalAccess().getValorListaParserRuleCall_3_0_2()); 
	    }
		lv_valor_3_3=ruleLista		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtributoNormalRule());
	        }
       		set(
       			$current, 
       			"valor",
        		lv_valor_3_3, 
        		"Lista");
	        afterParserOrEnumRuleCall();
	    }

)

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAtributoNormalAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleAtributoAsignacion
entryRuleAtributoAsignacion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtributoAsignacionRule()); }
	 iv_ruleAtributoAsignacion=ruleAtributoAsignacion 
	 { $current=$iv_ruleAtributoAsignacion.current; } 
	 EOF 
;

// Rule AtributoAsignacion
ruleAtributoAsignacion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtributoAsignacionAccess().getAtributoAsignacionAction_0(),
            $current);
    }
)(
(
		lv_nombre_1_0=RULE_ID
		{
			newLeafNode(lv_nombre_1_0, grammarAccess.getAtributoAsignacionAccess().getNombreIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoAsignacionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombre",
        		lv_nombre_1_0, 
        		"ID");
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAtributoAsignacionAccess().getEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAtributoAsignacionAccess().getValorStatementParserRuleCall_3_0()); 
	    }
		lv_valor_3_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtributoAsignacionRule());
	        }
       		set(
       			$current, 
       			"valor",
        		lv_valor_3_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleAtributoObjeto
entryRuleAtributoObjeto returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtributoObjetoRule()); }
	 iv_ruleAtributoObjeto=ruleAtributoObjeto 
	 { $current=$iv_ruleAtributoObjeto.current; } 
	 EOF 
;

// Rule AtributoObjeto
ruleAtributoObjeto returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getAtributoObjetoAccess().getObjetoParserRuleCall()); 
    }
    this_Objeto_0=ruleObjeto
    { 
        $current = $this_Objeto_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleAtributo
entryRuleAtributo returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtributoRule()); }
	 iv_ruleAtributo=ruleAtributo 
	 { $current=$iv_ruleAtributo.current; } 
	 EOF 
;

// Rule Atributo
ruleAtributo returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAtributoAccess().getAtributoNormalParserRuleCall_0()); 
    }
    this_AtributoNormal_0=ruleAtributoNormal
    { 
        $current = $this_AtributoNormal_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtributoAccess().getAtributoObjetoParserRuleCall_1()); 
    }
    this_AtributoObjeto_1=ruleAtributoObjeto
    { 
        $current = $this_AtributoObjeto_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtributoAccess().getAtributoAsignacionParserRuleCall_2()); 
    }
    this_AtributoAsignacion_2=ruleAtributoAsignacion
    { 
        $current = $this_AtributoAsignacion_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleValorAtributo
entryRuleValorAtributo returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValorAtributoRule()); }
	 iv_ruleValorAtributo=ruleValorAtributo 
	 { $current=$iv_ruleValorAtributo.current; } 
	 EOF 
;

// Rule ValorAtributo
ruleValorAtributo returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getValorAtributoAccess().getValorAtributoAction_0(),
            $current);
    }
)(this_ID_1=RULE_ID
    { 
    newLeafNode(this_ID_1, grammarAccess.getValorAtributoAccess().getIDTerminalRuleCall_1_0()); 
    }

    |this_STRING_2=RULE_STRING
    { 
    newLeafNode(this_STRING_2, grammarAccess.getValorAtributoAccess().getSTRINGTerminalRuleCall_1_1()); 
    }

    |this_NUMBER_3=RULE_NUMBER
    { 
    newLeafNode(this_NUMBER_3, grammarAccess.getValorAtributoAccess().getNUMBERTerminalRuleCall_1_2()); 
    }
)+)
;







// Entry rule entryRuleValorAtributoValor
entryRuleValorAtributoValor returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValorAtributoValorRule()); }
	 iv_ruleValorAtributoValor=ruleValorAtributoValor 
	 { $current=$iv_ruleValorAtributoValor.current; } 
	 EOF 
;

// Rule ValorAtributoValor
ruleValorAtributoValor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getValorAtributoValorAccess().getValorAtributoValorAction_0(),
            $current);
    }
)this_ID_1=RULE_ID
    { 
    newLeafNode(this_ID_1, grammarAccess.getValorAtributoValorAccess().getIDTerminalRuleCall_1()); 
    }
	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getValorAtributoValorAccess().getEqualsSignKeyword_2());
    }
this_NUMBER_3=RULE_NUMBER
    { 
    newLeafNode(this_NUMBER_3, grammarAccess.getValorAtributoValorAccess().getNUMBERTerminalRuleCall_3()); 
    }
)
;





// Entry rule entryRuleListaInteger
entryRuleListaInteger returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getListaIntegerRule()); }
	 iv_ruleListaInteger=ruleListaInteger 
	 { $current=$iv_ruleListaInteger.current; } 
	 EOF 
;

// Rule ListaInteger
ruleListaInteger returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getListaIntegerAccess().getListaIntegerAction_0(),
            $current);
    }
)	otherlv_1='List of Integer' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getListaIntegerAccess().getListOfIntegerKeyword_1());
    }
	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getListaIntegerAccess().getEqualsSignKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getListaIntegerAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		lv_valores_4_0=RULE_NUMBER
		{
			newLeafNode(lv_valores_4_0, grammarAccess.getListaIntegerAccess().getValoresNUMBERTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getListaIntegerRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"valores",
        		lv_valores_4_0, 
        		"NUMBER");
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getListaIntegerAccess().getCommaKeyword_5_0());
    }
this_NUMBER_6=RULE_NUMBER
    { 
    newLeafNode(this_NUMBER_6, grammarAccess.getListaIntegerAccess().getNUMBERTerminalRuleCall_5_1()); 
    }
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getListaIntegerAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleListaString
entryRuleListaString returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getListaStringRule()); }
	 iv_ruleListaString=ruleListaString 
	 { $current=$iv_ruleListaString.current; } 
	 EOF 
;

// Rule ListaString
ruleListaString returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getListaStringAccess().getListaStringAction_0(),
            $current);
    }
)	otherlv_1='List of String' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getListaStringAccess().getListOfStringKeyword_1());
    }
	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getListaStringAccess().getEqualsSignKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getListaStringAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		lv_valores_4_0=RULE_STRING
		{
			newLeafNode(lv_valores_4_0, grammarAccess.getListaStringAccess().getValoresSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getListaStringRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"valores",
        		lv_valores_4_0, 
        		"STRING");
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getListaStringAccess().getCommaKeyword_5_0());
    }
this_STRING_6=RULE_STRING
    { 
    newLeafNode(this_STRING_6, grammarAccess.getListaStringAccess().getSTRINGTerminalRuleCall_5_1()); 
    }
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getListaStringAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleLista
entryRuleLista returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getListaRule()); }
	 iv_ruleLista=ruleLista 
	 { $current=$iv_ruleLista.current; } 
	 EOF 
;

// Rule Lista
ruleLista returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getListaAccess().getListaIntegerParserRuleCall_0()); 
    }
    this_ListaInteger_0=ruleListaInteger
    { 
        $current = $this_ListaInteger_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getListaAccess().getListaStringParserRuleCall_1()); 
    }
    this_ListaString_1=ruleListaString
    { 
        $current = $this_ListaString_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;







// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	 iv_ruleStatement=ruleStatement 
	 { $current=$iv_ruleStatement.current; } 
	 EOF 
;

// Rule Statement
ruleStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
    }
    this_Definition_0=ruleDefinition
    { 
        $current = $this_Definition_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 
    }
    this_Evaluation_1=ruleEvaluation
    { 
        $current = $this_Evaluation_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	 iv_ruleDefinition=ruleDefinition 
	 { $current=$iv_ruleDefinition.current; } 
	 EOF 
;

// Rule Definition
ruleDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='def' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleEvaluation
entryRuleEvaluation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEvaluationRule()); }
	 iv_ruleEvaluation=ruleEvaluation 
	 { $current=$iv_ruleEvaluation.current; } 
	 EOF 
;

// Rule Evaluation
ruleEvaluation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
	    }
		lv_expression_0_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEvaluationRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_0_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=';' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getSemicolonKeyword_1());
    }
)
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
    }
    this_Addition_0=ruleAddition
    { 
        $current = $this_Addition_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	 iv_ruleAddition=ruleAddition 
	 { $current=$iv_ruleAddition.current; } 
	 EOF 
;

// Rule Addition
ruleAddition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
    }
    this_Multiplication_0=ruleMultiplication
    { 
        $current = $this_Multiplication_0.current; 
        afterParserOrEnumRuleCall();
    }
((((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            $current);
    }
)	otherlv_2='+' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
    }
)
    |((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            $current);
    }
)	otherlv_4='-' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
    }
))(
(
		{ 
	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
	    }
		lv_right_5_0=ruleMultiplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdditionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_5_0, 
        		"Multiplication");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleMultiplication
entryRuleMultiplication returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultiplicationRule()); }
	 iv_ruleMultiplication=ruleMultiplication 
	 { $current=$iv_ruleMultiplication.current; } 
	 EOF 
;

// Rule Multiplication
ruleMultiplication returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
    }
    this_PrimaryExpression_0=rulePrimaryExpression
    { 
        $current = $this_PrimaryExpression_0.current; 
        afterParserOrEnumRuleCall();
    }
((((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            $current);
    }
)	otherlv_2='*' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
    }
)
    |((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            $current);
    }
)	otherlv_4='/' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
    }
))(
(
		{ 
	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
	    }
		lv_right_5_0=rulePrimaryExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultiplicationRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_5_0, 
        		"PrimaryExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	 iv_rulePrimaryExpression=rulePrimaryExpression 
	 { $current=$iv_rulePrimaryExpression.current; } 
	 EOF 
;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
    }

    { 
        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
    }
    this_Expression_1=ruleExpression
    { 
        $current = $this_Expression_1.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
    }
)
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
            $current);
    }
)(
(
		lv_value_4_0=RULE_NUMBER
		{
			newLeafNode(lv_value_4_0, grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimaryExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_4_0, 
        		"NUMBER");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPrimaryExpressionAccess().getSTRINGAction_2_0(),
            $current);
    }
)this_STRING_6=RULE_STRING
    { 
    newLeafNode(this_STRING_6, grammarAccess.getPrimaryExpressionAccess().getSTRINGTerminalRuleCall_2_1()); 
    }
)
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPrimaryExpressionAccess().getIDAction_3_0(),
            $current);
    }
)this_ID_8=RULE_ID
    { 
    newLeafNode(this_ID_8, grammarAccess.getPrimaryExpressionAccess().getIDTerminalRuleCall_3_1()); 
    }
))
;





RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

RULE_INT : 'this one has been deactivated';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


