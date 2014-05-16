/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objeto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getPropiedades <em>Propiedades</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getObjeto()
 * @model
 * @generated
 */
public interface Objeto extends Propiedad
{
  /**
   * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descripcion</em>' attribute.
   * @see #setDescripcion(String)
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getObjeto_Descripcion()
   * @model
   * @generated
   */
  String getDescripcion();

  /**
   * Sets the value of the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getDescripcion <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Descripcion</em>' attribute.
   * @see #getDescripcion()
   * @generated
   */
  void setDescripcion(String value);

  /**
   * Returns the value of the '<em><b>Propiedades</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Propiedad}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Propiedades</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propiedades</em>' containment reference list.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getObjeto_Propiedades()
   * @model containment="true"
   * @generated
   */
  EList<Propiedad> getPropiedades();

} // Objeto
