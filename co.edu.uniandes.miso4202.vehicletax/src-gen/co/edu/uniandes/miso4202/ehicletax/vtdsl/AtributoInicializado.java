/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl;

import java.math.BigDecimal;

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
   * Returns the value of the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' attribute.
   * @see #setValor(BigDecimal)
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getAtributoInicializado_Valor()
   * @model
   * @generated
   */
  BigDecimal getValor();

  /**
   * Sets the value of the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado#getValor <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' attribute.
   * @see #getValor()
   * @generated
   */
  void setValor(BigDecimal value);

} // AtributoInicializado
