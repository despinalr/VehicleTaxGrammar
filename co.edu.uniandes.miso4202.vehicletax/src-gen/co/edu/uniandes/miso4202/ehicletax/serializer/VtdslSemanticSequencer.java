package co.edu.uniandes.miso4202.ehicletax.serializer;

import co.edu.uniandes.miso4202.ehicletax.services.VtdslGrammarAccess;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaInteger;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaString;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoSimple;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Contacto;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Definition;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Div;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Evaluation;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Formula;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ID;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Minus;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Model;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Module;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Multi;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.NumberLiteral;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Pago;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Plus;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Registro;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.STRING;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class VtdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VtdslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VtdslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VtdslPackage.ATRIBUTO_INICIALIZADO:
				if(context == grammarAccess.getAtributoRule() ||
				   context == grammarAccess.getAtributoInicializadoRule() ||
				   context == grammarAccess.getPropiedadRule()) {
					sequence_AtributoInicializado(context, (AtributoInicializado) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.ATRIBUTO_LISTA_INTEGER:
				if(context == grammarAccess.getAtributoRule() ||
				   context == grammarAccess.getAtributoListaRule() ||
				   context == grammarAccess.getAtributoListaIntegerRule() ||
				   context == grammarAccess.getPropiedadRule()) {
					sequence_AtributoListaInteger(context, (AtributoListaInteger) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.ATRIBUTO_LISTA_STRING:
				if(context == grammarAccess.getAtributoRule() ||
				   context == grammarAccess.getAtributoListaRule() ||
				   context == grammarAccess.getAtributoListaStringRule() ||
				   context == grammarAccess.getPropiedadRule()) {
					sequence_AtributoListaString(context, (AtributoListaString) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.ATRIBUTO_SIMPLE:
				if(context == grammarAccess.getAtributoRule() ||
				   context == grammarAccess.getAtributoSimpleRule() ||
				   context == grammarAccess.getPropiedadRule()) {
					sequence_AtributoSimple(context, (AtributoSimple) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.CONTACTO:
				if(context == grammarAccess.getContactoRule() ||
				   context == grammarAccess.getEntidadRule()) {
					sequence_Contacto(context, (Contacto) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.DEFINITION:
				if(context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Definition(context, (Definition) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.DIV:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Multiplication(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.EVALUATION:
				if(context == grammarAccess.getEvaluationRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Evaluation(context, (Evaluation) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.FORMULA:
				if(context == grammarAccess.getAtributoRule() ||
				   context == grammarAccess.getFormulaRule() ||
				   context == grammarAccess.getPropiedadRule()) {
					sequence_Formula(context, (Formula) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.ID:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (ID) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.MINUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Addition(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.MULTI:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Multiplication(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.OBJETO:
				if(context == grammarAccess.getObjetoRule() ||
				   context == grammarAccess.getPropiedadRule()) {
					sequence_Objeto(context, (Objeto) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.PAGO:
				if(context == grammarAccess.getEntidadRule() ||
				   context == grammarAccess.getPagoRule()) {
					sequence_Pago(context, (Pago) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.PLUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Addition(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.REGISTRO:
				if(context == grammarAccess.getEntidadRule() ||
				   context == grammarAccess.getRegistroRule()) {
					sequence_Registro(context, (Registro) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.STRING:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (STRING) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Addition_Minus_1_0_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Plus_1_0_0_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((nombre=ID | nombre=STRING) tipo=DATATYPE valor=NUMBER)
	 */
	protected void sequence_AtributoInicializado(EObject context, AtributoInicializado semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((nombre=ID | nombre=STRING) valores+=NUMBER valores+=NUMBER*)
	 */
	protected void sequence_AtributoListaInteger(EObject context, AtributoListaInteger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((nombre=ID | nombre=STRING) valores+=STRING valores+=STRING*)
	 */
	protected void sequence_AtributoListaString(EObject context, AtributoListaString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((nombre=ID | nombre=STRING) tipo=DATATYPE)
	 */
	protected void sequence_AtributoSimple(EObject context, AtributoSimple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=STRING propiedades+=Atributo*)
	 */
	protected void sequence_Contacto(EObject context, Contacto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Definition(EObject context, Definition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.DEFINITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Evaluation(EObject context, Evaluation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.EVALUATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.EVALUATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=ID expresiones+=Expression*)
	 */
	protected void sequence_Formula(EObject context, Formula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=ID entidades+=Entidad*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID statements+=Statement*)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Div_1_0_1_0 right=PrimaryExpression)
	 */
	protected void sequence_Multiplication(EObject context, Div semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.DIV__LEFT));
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multi_1_0_0_0 right=PrimaryExpression)
	 */
	protected void sequence_Multiplication(EObject context, Multi semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.MULTI__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.MULTI__LEFT));
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.MULTI__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.MULTI__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=ID descripcion=STRING? propiedades+=Propiedad*)
	 */
	protected void sequence_Objeto(EObject context, Objeto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=STRING propiedades+=Atributo*)
	 */
	protected void sequence_Pago(EObject context, Pago semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_PrimaryExpression(EObject context, ID semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.ID__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.ID__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueIDTerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_PrimaryExpression(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_PrimaryExpression(EObject context, STRING semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VtdslPackage.Literals.STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VtdslPackage.Literals.STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nombre=STRING propiedades+=Objeto*)
	 */
	protected void sequence_Registro(EObject context, Registro semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
