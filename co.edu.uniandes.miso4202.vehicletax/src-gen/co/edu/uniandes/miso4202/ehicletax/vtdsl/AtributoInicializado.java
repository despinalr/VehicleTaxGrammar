/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo Inicializado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado#getTipo <em>Tipo</em>}</li>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getAtributoInicializado()
 * @model
 * @generated
 */
public interface AtributoInicializado extends Atributo
{
  /**
   * Returns the value of the '<em><b>Tipo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' attribute.
   * @see #setTipo(String)
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getAtributoInicializado_Tipo()
   * @model
   * @generated
   */
  String getTipo();

  /**
   * Sets the value of the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado#getTipo <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' attribute.
   * @see #getTipo()
   * @generated
   */
  void setTipo(String value);

  /**
   * Returns the value of the '<em><b>Valor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' containment reference.
   * @see #setValor(ValorCompleto)
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getAtributoInicializado_Valor()
   * @model containment="true"
   * @generated
   */
  ValorCompleto getValor();

  /**
   * Sets the value of the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado#getValor <em>Valor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' containment reference.
   * @see #getValor()
   * @generated
   */
  void setValor(ValorCompleto value);

} // AtributoInicializado
