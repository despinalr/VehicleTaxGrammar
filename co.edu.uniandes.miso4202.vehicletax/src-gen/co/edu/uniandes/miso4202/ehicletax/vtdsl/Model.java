/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Model#getComponentes <em>Componentes</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Componentes</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Componentes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Componentes</em>' containment reference list.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getModel_Componentes()
   * @model containment="true"
   * @generated
   */
  EList<Componente> getComponentes();

} // Model
