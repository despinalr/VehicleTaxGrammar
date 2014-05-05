package co.edu.uniandes.miso4202.ehicletax.serializer;

import co.edu.uniandes.miso4202.ehicletax.services.VtdslGrammarAccess;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoNormal;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInteger;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaString;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Modelo;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributo;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributoValor;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class VtdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VtdslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VtdslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VtdslPackage.ATRIBUTO_NORMAL:
				if(context == grammarAccess.getAtributoRule() ||
				   context == grammarAccess.getAtributoNormalRule() ||
				   context == grammarAccess.getContenidoRule()) {
					sequence_AtributoNormal(context, (AtributoNormal) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.LISTA_INTEGER:
				if(context == grammarAccess.getListaRule() ||
				   context == grammarAccess.getListaIntegerRule()) {
					sequence_ListaInteger(context, (ListaInteger) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.LISTA_STRING:
				if(context == grammarAccess.getListaRule() ||
				   context == grammarAccess.getListaStringRule()) {
					sequence_ListaString(context, (ListaString) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.MODELO:
				if(context == grammarAccess.getModeloRule()) {
					sequence_Modelo(context, (Modelo) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.OBJETO:
				if(context == grammarAccess.getAtributoRule() ||
				   context == grammarAccess.getAtributoObjetoRule() ||
				   context == grammarAccess.getContenidoRule() ||
				   context == grammarAccess.getObjetoRule()) {
					sequence_Objeto(context, (Objeto) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.VALOR_ATRIBUTO:
				if(context == grammarAccess.getValorAtributoRule()) {
					sequence_ValorAtributo(context, (ValorAtributo) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.VALOR_ATRIBUTO_VALOR:
				if(context == grammarAccess.getValorAtributoValorRule()) {
					sequence_ValorAtributoValor(context, (ValorAtributoValor) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((nombre=ID | nombre=STRING) (valor=ValorAtributo | valor=ValorAtributoValor | valor=Lista))
	 */
	protected void sequence_AtributoNormal(EObject context, AtributoNormal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     valores+=INT
	 */
	protected void sequence_ListaInteger(EObject context, ListaInteger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     valores+=STRING
	 */
	protected void sequence_ListaString(EObject context, ListaString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (objetos+=Objeto*)
	 */
	protected void sequence_Modelo(EObject context, Modelo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID descripcion=STRING? atributos+=Atributo*)
	 */
	protected void sequence_Objeto(EObject context, Objeto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ValorAtributoValor}
	 */
	protected void sequence_ValorAtributoValor(EObject context, ValorAtributoValor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ValorAtributo}
	 */
	protected void sequence_ValorAtributo(EObject context, ValorAtributo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
