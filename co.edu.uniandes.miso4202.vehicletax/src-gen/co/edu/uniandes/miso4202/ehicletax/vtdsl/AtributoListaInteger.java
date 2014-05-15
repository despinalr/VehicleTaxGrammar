/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo Lista Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaInteger#getValores <em>Valores</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getAtributoListaInteger()
 * @model
 * @generated
 */
public interface AtributoListaInteger extends Atributo
{
  /**
   * Returns the value of the '<em><b>Valores</b></em>' attribute list.
   * The list contents are of type {@link java.math.BigDecimal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valores</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valores</em>' attribute list.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getAtributoListaInteger_Valores()
   * @model unique="false"
   * @generated
   */
  EList<BigDecimal> getValores();

} // AtributoListaInteger
