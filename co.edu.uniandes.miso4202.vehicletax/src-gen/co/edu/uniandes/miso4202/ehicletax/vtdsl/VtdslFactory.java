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
   * Returns a new object of class '<em>Modelo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modelo</em>'.
   * @generated
   */
  Modelo createModelo();

  /**
   * Returns a new object of class '<em>Objeto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objeto</em>'.
   * @generated
   */
  Objeto createObjeto();

  /**
   * Returns a new object of class '<em>Atributo Normal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributo Normal</em>'.
   * @generated
   */
  AtributoNormal createAtributoNormal();

  /**
   * Returns a new object of class '<em>Atributo Objeto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributo Objeto</em>'.
   * @generated
   */
  AtributoObjeto createAtributoObjeto();

  /**
   * Returns a new object of class '<em>Atributo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributo</em>'.
   * @generated
   */
  Atributo createAtributo();

  /**
   * Returns a new object of class '<em>Valor Atributo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Valor Atributo</em>'.
   * @generated
   */
  ValorAtributo createValorAtributo();

  /**
   * Returns a new object of class '<em>Contenido</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contenido</em>'.
   * @generated
   */
  Contenido createContenido();

  /**
   * Returns a new object of class '<em>Valor Atributo Valor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Valor Atributo Valor</em>'.
   * @generated
   */
  ValorAtributoValor createValorAtributoValor();

  /**
   * Returns a new object of class '<em>Lista Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lista Integer</em>'.
   * @generated
   */
  ListaInteger createListaInteger();

  /**
   * Returns a new object of class '<em>Lista String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lista String</em>'.
   * @generated
   */
  ListaString createListaString();

  /**
   * Returns a new object of class '<em>Lista</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lista</em>'.
   * @generated
   */
  Lista createLista();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VtdslPackage getVtdslPackage();

} //VtdslFactory
