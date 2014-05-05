/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslFactory
 * @model kind="package"
 * @generated
 */
public interface VtdslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "vtdsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.edu.co/uniandes/miso4202/ehicletax/Vtdsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "vtdsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VtdslPackage eINSTANCE = co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl.init();

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModelImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Componentes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMPONENTES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ComponenteImpl <em>Componente</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ComponenteImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getComponente()
   * @generated
   */
  int COMPONENTE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Componentes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE__COMPONENTES = 1;

  /**
   * The number of structural features of the '<em>Componente</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoSimpleImpl <em>Objeto Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoSimpleImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getObjetoSimple()
   * @generated
   */
  int OBJETO_SIMPLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO_SIMPLE__NAME = COMPONENTE__NAME;

  /**
   * The feature id for the '<em><b>Componentes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO_SIMPLE__COMPONENTES = COMPONENTE__COMPONENTES;

  /**
   * The number of structural features of the '<em>Objeto Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO_SIMPLE_FEATURE_COUNT = COMPONENTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoNombreImpl <em>Objeto Nombre</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoNombreImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getObjetoNombre()
   * @generated
   */
  int OBJETO_NOMBRE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO_NOMBRE__NAME = COMPONENTE__NAME;

  /**
   * The feature id for the '<em><b>Componentes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO_NOMBRE__COMPONENTES = COMPONENTE__COMPONENTES;

  /**
   * The feature id for the '<em><b>Descripcion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO_NOMBRE__DESCRIPCION = COMPONENTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Objeto Nombre</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO_NOMBRE_FEATURE_COUNT = COMPONENTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoImpl <em>Atributo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributo()
   * @generated
   */
  int ATRIBUTO = 4;

  /**
   * The number of structural features of the '<em>Atributo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.TipoSimpleImpl <em>Tipo Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.TipoSimpleImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getTipoSimple()
   * @generated
   */
  int TIPO_SIMPLE = 5;

  /**
   * The number of structural features of the '<em>Tipo Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIPO_SIMPLE_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.TipoValorImpl <em>Tipo Valor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.TipoValorImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getTipoValor()
   * @generated
   */
  int TIPO_VALOR = 6;

  /**
   * The number of structural features of the '<em>Tipo Valor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIPO_VALOR_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaImpl <em>Lista</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getLista()
   * @generated
   */
  int LISTA = 7;

  /**
   * The number of structural features of the '<em>Lista</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTA_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaIntImpl <em>Lista Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaIntImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getListaInt()
   * @generated
   */
  int LISTA_INT = 8;

  /**
   * The feature id for the '<em><b>Valores</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTA_INT__VALORES = LISTA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lista Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTA_INT_FEATURE_COUNT = LISTA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaStringImpl <em>Lista String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaStringImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getListaString()
   * @generated
   */
  int LISTA_STRING = 9;

  /**
   * The feature id for the '<em><b>Valores</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTA_STRING__VALORES = LISTA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lista String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTA_STRING_FEATURE_COUNT = LISTA_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Model#getComponentes <em>Componentes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Componentes</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Model#getComponentes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Componentes();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente <em>Componente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Componente</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente
   * @generated
   */
  EClass getComponente();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente#getName()
   * @see #getComponente()
   * @generated
   */
  EAttribute getComponente_Name();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente#getComponentes <em>Componentes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Componentes</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente#getComponentes()
   * @see #getComponente()
   * @generated
   */
  EReference getComponente_Componentes();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoSimple <em>Objeto Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objeto Simple</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoSimple
   * @generated
   */
  EClass getObjetoSimple();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoNombre <em>Objeto Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objeto Nombre</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoNombre
   * @generated
   */
  EClass getObjetoNombre();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoNombre#getDescripcion <em>Descripcion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descripcion</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoNombre#getDescripcion()
   * @see #getObjetoNombre()
   * @generated
   */
  EAttribute getObjetoNombre_Descripcion();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Atributo <em>Atributo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Atributo
   * @generated
   */
  EClass getAtributo();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoSimple <em>Tipo Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tipo Simple</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoSimple
   * @generated
   */
  EClass getTipoSimple();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoValor <em>Tipo Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tipo Valor</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoValor
   * @generated
   */
  EClass getTipoValor();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Lista <em>Lista</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lista</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Lista
   * @generated
   */
  EClass getLista();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInt <em>Lista Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lista Int</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInt
   * @generated
   */
  EClass getListaInt();

  /**
   * Returns the meta object for the attribute list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInt#getValores <em>Valores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Valores</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInt#getValores()
   * @see #getListaInt()
   * @generated
   */
  EAttribute getListaInt_Valores();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaString <em>Lista String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lista String</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaString
   * @generated
   */
  EClass getListaString();

  /**
   * Returns the meta object for the attribute list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaString#getValores <em>Valores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Valores</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaString#getValores()
   * @see #getListaString()
   * @generated
   */
  EAttribute getListaString_Valores();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VtdslFactory getVtdslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModelImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Componentes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMPONENTES = eINSTANCE.getModel_Componentes();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ComponenteImpl <em>Componente</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ComponenteImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getComponente()
     * @generated
     */
    EClass COMPONENTE = eINSTANCE.getComponente();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENTE__NAME = eINSTANCE.getComponente_Name();

    /**
     * The meta object literal for the '<em><b>Componentes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENTE__COMPONENTES = eINSTANCE.getComponente_Componentes();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoSimpleImpl <em>Objeto Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoSimpleImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getObjetoSimple()
     * @generated
     */
    EClass OBJETO_SIMPLE = eINSTANCE.getObjetoSimple();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoNombreImpl <em>Objeto Nombre</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoNombreImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getObjetoNombre()
     * @generated
     */
    EClass OBJETO_NOMBRE = eINSTANCE.getObjetoNombre();

    /**
     * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJETO_NOMBRE__DESCRIPCION = eINSTANCE.getObjetoNombre_Descripcion();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoImpl <em>Atributo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributo()
     * @generated
     */
    EClass ATRIBUTO = eINSTANCE.getAtributo();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.TipoSimpleImpl <em>Tipo Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.TipoSimpleImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getTipoSimple()
     * @generated
     */
    EClass TIPO_SIMPLE = eINSTANCE.getTipoSimple();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.TipoValorImpl <em>Tipo Valor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.TipoValorImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getTipoValor()
     * @generated
     */
    EClass TIPO_VALOR = eINSTANCE.getTipoValor();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaImpl <em>Lista</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getLista()
     * @generated
     */
    EClass LISTA = eINSTANCE.getLista();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaIntImpl <em>Lista Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaIntImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getListaInt()
     * @generated
     */
    EClass LISTA_INT = eINSTANCE.getListaInt();

    /**
     * The meta object literal for the '<em><b>Valores</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LISTA_INT__VALORES = eINSTANCE.getListaInt_Valores();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaStringImpl <em>Lista String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaStringImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getListaString()
     * @generated
     */
    EClass LISTA_STRING = eINSTANCE.getListaString();

    /**
     * The meta object literal for the '<em><b>Valores</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LISTA_STRING__VALORES = eINSTANCE.getListaString_Valores();

  }

} //VtdslPackage
