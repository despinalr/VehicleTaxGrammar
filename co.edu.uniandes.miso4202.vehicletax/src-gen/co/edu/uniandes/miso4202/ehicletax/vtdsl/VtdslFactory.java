/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage
 * @generated
 */
public interface VtdslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VtdslFactory eINSTANCE = co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Componente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Componente</em>'.
   * @generated
   */
  Componente createComponente();

  /**
   * Returns a new object of class '<em>Objeto Simple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objeto Simple</em>'.
   * @generated
   */
  ObjetoSimple createObjetoSimple();

  /**
   * Returns a new object of class '<em>Objeto Nombre</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objeto Nombre</em>'.
   * @generated
   */
  ObjetoNombre createObjetoNombre();

  /**
   * Returns a new object of class '<em>Atributo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributo</em>'.
   * @generated
   */
  Atributo createAtributo();

  /**
   * Returns a new object of class '<em>Tipo Simple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tipo Simple</em>'.
   * @generated
   */
  TipoSimple createTipoSimple();

  /**
   * Returns a new object of class '<em>Tipo Valor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tipo Valor</em>'.
   * @generated
   */
  TipoValor createTipoValor();

  /**
   * Returns a new object of class '<em>Lista</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lista</em>'.
   * @generated
   */
  Lista createLista();

  /**
   * Returns a new object of class '<em>Lista Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lista Int</em>'.
   * @generated
   */
  ListaInt createListaInt();

  /**
   * Returns a new object of class '<em>Lista String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lista String</em>'.
   * @generated
   */
  ListaString createListaString();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VtdslPackage getVtdslPackage();

} //VtdslFactory
