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
   * Returns a new object of class '<em>Atributo Simple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributo Simple</em>'.
   * @generated
   */
  AtributoSimple createAtributoSimple();

  /**
   * Returns a new object of class '<em>Atributo Asignado</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributo Asignado</em>'.
   * @generated
   */
  AtributoAsignado createAtributoAsignado();

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
   * Returns a new object of class '<em>Valor Completo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Valor Completo</em>'.
   * @generated
   */
  ValorCompleto createValorCompleto();

  /**
   * Returns a new object of class '<em>Contenido</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contenido</em>'.
   * @generated
   */
  Contenido createContenido();

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
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  Definition createDefinition();

  /**
   * Returns a new object of class '<em>Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation</em>'.
   * @generated
   */
  Evaluation createEvaluation();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Atributo Tipado</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributo Tipado</em>'.
   * @generated
   */
  AtributoTipado createAtributoTipado();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi</em>'.
   * @generated
   */
  Multi createMulti();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>STRING</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>STRING</em>'.
   * @generated
   */
  STRING createSTRING();

  /**
   * Returns a new object of class '<em>ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ID</em>'.
   * @generated
   */
  ID createID();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VtdslPackage getVtdslPackage();

} //VtdslFactory
