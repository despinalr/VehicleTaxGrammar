/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Registro#getPropiedades <em>Propiedades</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getRegistro()
 * @model
 * @generated
 */
public interface Registro extends Entidad
{
  /**
   * Returns the value of the '<em><b>Propiedades</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Propiedades</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propiedades</em>' containment reference list.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getRegistro_Propiedades()
   * @model containment="true"
   * @generated
   */
  EList<Objeto> getPropiedades();

} // Registro
