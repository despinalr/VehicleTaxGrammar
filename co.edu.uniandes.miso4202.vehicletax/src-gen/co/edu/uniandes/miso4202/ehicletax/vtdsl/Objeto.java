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
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getObjetos <em>Objetos</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getObjeto()
 * @model
 * @generated
 */
public interface Objeto extends Contenido
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
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getObjeto_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Atributo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atributos</em>' containment reference list.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getObjeto_Atributos()
   * @model containment="true"
   * @generated
   */
  EList<Atributo> getAtributos();

  /**
   * Returns the value of the '<em><b>Objetos</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objetos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objetos</em>' containment reference list.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#getObjeto_Objetos()
   * @model containment="true"
   * @generated
   */
  EList<Objeto> getObjetos();

} // Objeto
