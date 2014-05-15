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
    	return "Model";	
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




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelAccess().getModelAction_0(),
            $current);
    }
)(
(
		lv_nombre_1_0=RULE_ID
		{
			newLeafNode(lv_nombre_1_0, grammarAccess.getModelAccess().getNombreIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombre",
        		lv_nombre_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getObjetosObjetoParserRuleCall_3_0()); 
	    }
		lv_objetos_3_0=ruleObjeto		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
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
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getObjetoAccess().getObjetosObjetoParserRuleCall_4_0()); 
	    }
		lv_objetos_4_0=ruleObjeto		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getObjetoRule());
	        }
       		add(
       			$current, 
       			"objetos",
        		lv_objetos_4_0, 
        		"Objeto");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getObjetoAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleAtributoSimple
entryRuleAtributoSimple returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtributoSimpleRule()); }
	 iv_ruleAtributoSimple=ruleAtributoSimple 
	 { $current=$iv_ruleAtributoSimple.current; } 
	 EOF 
;

// Rule AtributoSimple
ruleAtributoSimple returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtributoSimpleAccess().getAtributoSimpleAction_0(),
            $current);
    }
)(
(
(
		lv_nombre_1_1=RULE_ID
		{
			newLeafNode(lv_nombre_1_1, grammarAccess.getAtributoSimpleAccess().getNombreIDTerminalRuleCall_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoSimpleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombre",
        		lv_nombre_1_1, 
        		"ID");
	    }

    |		lv_nombre_1_2=RULE_STRING
		{
			newLeafNode(lv_nombre_1_2, grammarAccess.getAtributoSimpleAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoSimpleRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getAtributoSimpleAccess().getColonKeyword_2());
    }
(
(
		lv_tipo_3_0=RULE_DATATYPE
		{
			newLeafNode(lv_tipo_3_0, grammarAccess.getAtributoSimpleAccess().getTipoDATATYPETerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoSimpleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"tipo",
        		lv_tipo_3_0, 
        		"DATATYPE");
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAtributoSimpleAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleAtributoInicializado
entryRuleAtributoInicializado returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtributoInicializadoRule()); }
	 iv_ruleAtributoInicializado=ruleAtributoInicializado 
	 { $current=$iv_ruleAtributoInicializado.current; } 
	 EOF 
;

// Rule AtributoInicializado
ruleAtributoInicializado returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtributoInicializadoAccess().getAtributoInicializadoAction_0(),
            $current);
    }
)(
(
(
		lv_nombre_1_1=RULE_ID
		{
			newLeafNode(lv_nombre_1_1, grammarAccess.getAtributoInicializadoAccess().getNombreIDTerminalRuleCall_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoInicializadoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombre",
        		lv_nombre_1_1, 
        		"ID");
	    }

    |		lv_nombre_1_2=RULE_STRING
		{
			newLeafNode(lv_nombre_1_2, grammarAccess.getAtributoInicializadoAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoInicializadoRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getAtributoInicializadoAccess().getColonKeyword_2());
    }
(
(
		lv_tipo_3_0=RULE_DATATYPE
		{
			newLeafNode(lv_tipo_3_0, grammarAccess.getAtributoInicializadoAccess().getTipoDATATYPETerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoInicializadoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"tipo",
        		lv_tipo_3_0, 
        		"DATATYPE");
	    }

)
)	otherlv_4='=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAtributoInicializadoAccess().getEqualsSignKeyword_4());
    }
(
(
		lv_valor_5_0=RULE_NUMBER
		{
			newLeafNode(lv_valor_5_0, grammarAccess.getAtributoInicializadoAccess().getValorNUMBERTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoInicializadoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"valor",
        		lv_valor_5_0, 
        		"NUMBER");
	    }

)
)	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAtributoInicializadoAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleAtributoListaString
entryRuleAtributoListaString returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtributoListaStringRule()); }
	 iv_ruleAtributoListaString=ruleAtributoListaString 
	 { $current=$iv_ruleAtributoListaString.current; } 
	 EOF 
;

// Rule AtributoListaString
ruleAtributoListaString returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtributoListaStringAccess().getAtributoListaStringAction_0(),
            $current);
    }
)(
(
(
		lv_nombre_1_1=RULE_ID
		{
			newLeafNode(lv_nombre_1_1, grammarAccess.getAtributoListaStringAccess().getNombreIDTerminalRuleCall_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoListaStringRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombre",
        		lv_nombre_1_1, 
        		"ID");
	    }

    |		lv_nombre_1_2=RULE_STRING
		{
			newLeafNode(lv_nombre_1_2, grammarAccess.getAtributoListaStringAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoListaStringRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getAtributoListaStringAccess().getColonKeyword_2());
    }
	otherlv_3='List of String' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAtributoListaStringAccess().getListOfStringKeyword_3());
    }
	otherlv_4='=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAtributoListaStringAccess().getEqualsSignKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAtributoListaStringAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		lv_valores_6_0=RULE_STRING
		{
			newLeafNode(lv_valores_6_0, grammarAccess.getAtributoListaStringAccess().getValoresSTRINGTerminalRuleCall_6_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoListaStringRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"valores",
        		lv_valores_6_0, 
        		"STRING");
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getAtributoListaStringAccess().getCommaKeyword_7_0());
    }
(
(
		lv_valores_8_0=RULE_STRING
		{
			newLeafNode(lv_valores_8_0, grammarAccess.getAtributoListaStringAccess().getValoresSTRINGTerminalRuleCall_7_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoListaStringRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"valores",
        		lv_valores_8_0, 
        		"STRING");
	    }

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getAtributoListaStringAccess().getRightCurlyBracketKeyword_8());
    }
	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getAtributoListaStringAccess().getSemicolonKeyword_9());
    }
)
;





// Entry rule entryRuleAtributoListaInteger
entryRuleAtributoListaInteger returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtributoListaIntegerRule()); }
	 iv_ruleAtributoListaInteger=ruleAtributoListaInteger 
	 { $current=$iv_ruleAtributoListaInteger.current; } 
	 EOF 
;

// Rule AtributoListaInteger
ruleAtributoListaInteger returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtributoListaIntegerAccess().getAtributoListaIntegerAction_0(),
            $current);
    }
)(
(
(
		lv_nombre_1_1=RULE_ID
		{
			newLeafNode(lv_nombre_1_1, grammarAccess.getAtributoListaIntegerAccess().getNombreIDTerminalRuleCall_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoListaIntegerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombre",
        		lv_nombre_1_1, 
        		"ID");
	    }

    |		lv_nombre_1_2=RULE_STRING
		{
			newLeafNode(lv_nombre_1_2, grammarAccess.getAtributoListaIntegerAccess().getNombreSTRINGTerminalRuleCall_1_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoListaIntegerRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getAtributoListaIntegerAccess().getColonKeyword_2());
    }
	otherlv_3='List of Integer' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAtributoListaIntegerAccess().getListOfIntegerKeyword_3());
    }
	otherlv_4='=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAtributoListaIntegerAccess().getEqualsSignKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAtributoListaIntegerAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		lv_valores_6_0=RULE_NUMBER
		{
			newLeafNode(lv_valores_6_0, grammarAccess.getAtributoListaIntegerAccess().getValoresNUMBERTerminalRuleCall_6_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoListaIntegerRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"valores",
        		lv_valores_6_0, 
        		"NUMBER");
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getAtributoListaIntegerAccess().getCommaKeyword_7_0());
    }
(
(
		lv_valores_8_0=RULE_NUMBER
		{
			newLeafNode(lv_valores_8_0, grammarAccess.getAtributoListaIntegerAccess().getValoresNUMBERTerminalRuleCall_7_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtributoListaIntegerRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"valores",
        		lv_valores_8_0, 
        		"NUMBER");
	    }

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getAtributoListaIntegerAccess().getRightCurlyBracketKeyword_8());
    }
	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getAtributoListaIntegerAccess().getSemicolonKeyword_9());
    }
)
;





// Entry rule entryRuleFormula
entryRuleFormula returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFormulaRule()); }
	 iv_ruleFormula=ruleFormula 
	 { $current=$iv_ruleFormula.current; } 
	 EOF 
;

// Rule Formula
ruleFormula returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFormulaAccess().getFormulaAction_0(),
            $current);
    }
)(
(
		lv_nombre_1_0=RULE_ID
		{
			newLeafNode(lv_nombre_1_0, grammarAccess.getFormulaAccess().getNombreIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormulaRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getFormulaAccess().getEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFormulaAccess().getExpresionesExpressionParserRuleCall_3_0()); 
	    }
		lv_expresiones_3_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFormulaRule());
	        }
       		add(
       			$current, 
       			"expresiones",
        		lv_expresiones_3_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFormulaAccess().getSemicolonKeyword_4());
    }
)
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
        newCompositeNode(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_0()); 
    }
    this_AtributoSimple_0=ruleAtributoSimple
    { 
        $current = $this_AtributoSimple_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtributoAccess().getAtributoInicializadoParserRuleCall_1()); 
    }
    this_AtributoInicializado_1=ruleAtributoInicializado
    { 
        $current = $this_AtributoInicializado_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtributoAccess().getFormulaParserRuleCall_2()); 
    }
    this_Formula_2=ruleFormula
    { 
        $current = $this_Formula_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtributoAccess().getAtributoListaStringParserRuleCall_3()); 
    }
    this_AtributoListaString_3=ruleAtributoListaString
    { 
        $current = $this_AtributoListaString_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtributoAccess().getAtributoListaIntegerParserRuleCall_4()); 
    }
    this_AtributoListaInteger_4=ruleAtributoListaInteger
    { 
        $current = $this_AtributoListaInteger_4.current; 
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
)(
(
		lv_value_6_0=RULE_STRING
		{
			newLeafNode(lv_value_6_0, grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimaryExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_6_0, 
        		"STRING");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPrimaryExpressionAccess().getIDAction_3_0(),
            $current);
    }
)(
(
		lv_value_8_0=RULE_ID
		{
			newLeafNode(lv_value_8_0, grammarAccess.getPrimaryExpressionAccess().getValueIDTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimaryExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_8_0, 
        		"ID");
	    }

)
)))
;





RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

RULE_INT : 'this one has been deactivated';

RULE_DATATYPE : ('Real'|'Int'|'String'|'List of Integer'|'List of String');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


