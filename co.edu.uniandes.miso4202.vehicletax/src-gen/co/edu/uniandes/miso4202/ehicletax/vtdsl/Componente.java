/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Componente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente#getComponentes <em>Componentes</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getComponente()
 * @model
 * @generated
 */
public interface Componente extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getComponente_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getComponente_Componentes()
   * @model containment="true"
   * @generated
   */
  EList<Componente> getComponentes();

} // Componente
