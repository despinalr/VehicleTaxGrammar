/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lista String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaString#getValores <em>Valores</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getListaString()
 * @model
 * @generated
 */
public interface ListaString extends Lista
{
  /**
   * Returns the value of the '<em><b>Valores</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valores</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valores</em>' attribute list.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getListaString_Valores()
   * @model unique="false"
   * @generated
   */
  EList<String> getValores();

} // ListaString
