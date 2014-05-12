/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo Asignado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoAsignado#getNombre <em>Nombre</em>}</li>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoAsignado#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getAtributoAsignado()
 * @model
 * @generated
 */
public interface AtributoAsignado extends Atributo
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getAtributoAsignado_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoAsignado#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Valor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' containment reference.
   * @see #setValor(Statement)
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getAtributoAsignado_Valor()
   * @model containment="true"
   * @generated
   */
  Statement getValor();

  /**
   * Sets the value of the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoAsignado#getValor <em>Valor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' containment reference.
   * @see #getValor()
   * @generated
   */
  void setValor(Statement value);

} // AtributoAsignado
