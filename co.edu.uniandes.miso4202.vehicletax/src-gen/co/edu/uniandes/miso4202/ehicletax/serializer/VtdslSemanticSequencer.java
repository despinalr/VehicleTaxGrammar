package co.edu.uniandes.miso4202.ehicletax.serializer;

import co.edu.uniandes.miso4202.ehicletax.services.VtdslGrammarAccess;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Atributo;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInt;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaString;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Model;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoNombre;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoSimple;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoSimple;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoValor;
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
			case VtdslPackage.ATRIBUTO:
				if(context == grammarAccess.getAtributoRule()) {
					sequence_Atributo(context, (Atributo) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.LISTA_INT:
				if(context == grammarAccess.getAtributoRule() ||
				   context == grammarAccess.getListaRule() ||
				   context == grammarAccess.getListaIntRule()) {
					sequence_ListaInt(context, (ListaInt) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.LISTA_STRING:
				if(context == grammarAccess.getAtributoRule() ||
				   context == grammarAccess.getListaRule() ||
				   context == grammarAccess.getListaStringRule()) {
					sequence_ListaString(context, (ListaString) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.OBJETO_NOMBRE:
				if(context == grammarAccess.getComponenteRule() ||
				   context == grammarAccess.getObjetoNombreRule()) {
					sequence_ObjetoNombre(context, (ObjetoNombre) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.OBJETO_SIMPLE:
				if(context == grammarAccess.getComponenteRule() ||
				   context == grammarAccess.getObjetoSimpleRule()) {
					sequence_ObjetoSimple(context, (ObjetoSimple) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.TIPO_SIMPLE:
				if(context == grammarAccess.getAtributoRule() ||
				   context == grammarAccess.getTipoSimpleRule()) {
					sequence_TipoSimple(context, (TipoSimple) semanticObject); 
					return; 
				}
				else break;
			case VtdslPackage.TIPO_VALOR:
				if(context == grammarAccess.getAtributoRule() ||
				   context == grammarAccess.getTipoValorRule()) {
					sequence_TipoValor(context, (TipoValor) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {Atributo}
	 */
	protected void sequence_Atributo(EObject context, Atributo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     valores+=INT
	 */
	protected void sequence_ListaInt(EObject context, ListaInt semanticObject) {
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
	 *     componentes+=Componente*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID descripcion=STRING componentes+=Componente*)
	 */
	protected void sequence_ObjetoNombre(EObject context, ObjetoNombre semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID componentes+=Componente*)
	 */
	protected void sequence_ObjetoSimple(EObject context, ObjetoSimple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {TipoSimple}
	 */
	protected void sequence_TipoSimple(EObject context, TipoSimple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {TipoValor}
	 */
	protected void sequence_TipoValor(EObject context, TipoValor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
