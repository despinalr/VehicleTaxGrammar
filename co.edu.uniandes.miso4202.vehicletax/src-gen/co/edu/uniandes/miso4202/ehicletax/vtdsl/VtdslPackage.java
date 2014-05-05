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
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModeloImpl <em>Modelo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModeloImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getModelo()
   * @generated
   */
  int MODELO = 0;

  /**
   * The feature id for the '<em><b>Objetos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODELO__OBJETOS = 0;

  /**
   * The number of structural features of the '<em>Modelo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODELO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ContenidoImpl <em>Contenido</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ContenidoImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getContenido()
   * @generated
   */
  int CONTENIDO = 6;

  /**
   * The number of structural features of the '<em>Contenido</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENIDO_FEATURE_COUNT = 0;

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
  int ATRIBUTO_FEATURE_COUNT = CONTENIDO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoObjetoImpl <em>Atributo Objeto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoObjetoImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoObjeto()
   * @generated
   */
  int ATRIBUTO_OBJETO = 3;

  /**
   * The number of structural features of the '<em>Atributo Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_OBJETO_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoImpl <em>Objeto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getObjeto()
   * @generated
   */
  int OBJETO = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO__NAME = ATRIBUTO_OBJETO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Descripcion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO__DESCRIPCION = ATRIBUTO_OBJETO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO__ATRIBUTOS = ATRIBUTO_OBJETO_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO_FEATURE_COUNT = ATRIBUTO_OBJETO_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoNormalImpl <em>Atributo Normal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoNormalImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoNormal()
   * @generated
   */
  int ATRIBUTO_NORMAL = 2;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_NORMAL__NOMBRE = ATRIBUTO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Valor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_NORMAL__VALOR = ATRIBUTO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Atributo Normal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_NORMAL_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ValorAtributoImpl <em>Valor Atributo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ValorAtributoImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getValorAtributo()
   * @generated
   */
  int VALOR_ATRIBUTO = 5;

  /**
   * The number of structural features of the '<em>Valor Atributo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALOR_ATRIBUTO_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ValorAtributoValorImpl <em>Valor Atributo Valor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ValorAtributoValorImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getValorAtributoValor()
   * @generated
   */
  int VALOR_ATRIBUTO_VALOR = 7;

  /**
   * The number of structural features of the '<em>Valor Atributo Valor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALOR_ATRIBUTO_VALOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaImpl <em>Lista</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getLista()
   * @generated
   */
  int LISTA = 10;

  /**
   * The number of structural features of the '<em>Lista</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTA_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaIntegerImpl <em>Lista Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaIntegerImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getListaInteger()
   * @generated
   */
  int LISTA_INTEGER = 8;

  /**
   * The feature id for the '<em><b>Valores</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTA_INTEGER__VALORES = LISTA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lista Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTA_INTEGER_FEATURE_COUNT = LISTA_FEATURE_COUNT + 1;

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
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Modelo <em>Modelo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modelo</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Modelo
   * @generated
   */
  EClass getModelo();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Modelo#getObjetos <em>Objetos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objetos</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Modelo#getObjetos()
   * @see #getModelo()
   * @generated
   */
  EReference getModelo_Objetos();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto <em>Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objeto</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto
   * @generated
   */
  EClass getObjeto();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getName()
   * @see #getObjeto()
   * @generated
   */
  EAttribute getObjeto_Name();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getDescripcion <em>Descripcion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descripcion</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getDescripcion()
   * @see #getObjeto()
   * @generated
   */
  EAttribute getObjeto_Descripcion();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getAtributos <em>Atributos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atributos</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getAtributos()
   * @see #getObjeto()
   * @generated
   */
  EReference getObjeto_Atributos();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoNormal <em>Atributo Normal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo Normal</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoNormal
   * @generated
   */
  EClass getAtributoNormal();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoNormal#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoNormal#getNombre()
   * @see #getAtributoNormal()
   * @generated
   */
  EAttribute getAtributoNormal_Nombre();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoNormal#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Valor</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoNormal#getValor()
   * @see #getAtributoNormal()
   * @generated
   */
  EReference getAtributoNormal_Valor();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoObjeto <em>Atributo Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo Objeto</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoObjeto
   * @generated
   */
  EClass getAtributoObjeto();

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
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributo <em>Valor Atributo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Valor Atributo</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributo
   * @generated
   */
  EClass getValorAtributo();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Contenido <em>Contenido</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contenido</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Contenido
   * @generated
   */
  EClass getContenido();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributoValor <em>Valor Atributo Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Valor Atributo Valor</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributoValor
   * @generated
   */
  EClass getValorAtributoValor();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInteger <em>Lista Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lista Integer</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInteger
   * @generated
   */
  EClass getListaInteger();

  /**
   * Returns the meta object for the attribute list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInteger#getValores <em>Valores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Valores</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInteger#getValores()
   * @see #getListaInteger()
   * @generated
   */
  EAttribute getListaInteger_Valores();

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
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Lista <em>Lista</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lista</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Lista
   * @generated
   */
  EClass getLista();

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
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModeloImpl <em>Modelo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModeloImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getModelo()
     * @generated
     */
    EClass MODELO = eINSTANCE.getModelo();

    /**
     * The meta object literal for the '<em><b>Objetos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODELO__OBJETOS = eINSTANCE.getModelo_Objetos();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoImpl <em>Objeto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getObjeto()
     * @generated
     */
    EClass OBJETO = eINSTANCE.getObjeto();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJETO__NAME = eINSTANCE.getObjeto_Name();

    /**
     * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJETO__DESCRIPCION = eINSTANCE.getObjeto_Descripcion();

    /**
     * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJETO__ATRIBUTOS = eINSTANCE.getObjeto_Atributos();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoNormalImpl <em>Atributo Normal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoNormalImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoNormal()
     * @generated
     */
    EClass ATRIBUTO_NORMAL = eINSTANCE.getAtributoNormal();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO_NORMAL__NOMBRE = eINSTANCE.getAtributoNormal_Nombre();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATRIBUTO_NORMAL__VALOR = eINSTANCE.getAtributoNormal_Valor();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoObjetoImpl <em>Atributo Objeto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoObjetoImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoObjeto()
     * @generated
     */
    EClass ATRIBUTO_OBJETO = eINSTANCE.getAtributoObjeto();

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
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ValorAtributoImpl <em>Valor Atributo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ValorAtributoImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getValorAtributo()
     * @generated
     */
    EClass VALOR_ATRIBUTO = eINSTANCE.getValorAtributo();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ContenidoImpl <em>Contenido</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ContenidoImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getContenido()
     * @generated
     */
    EClass CONTENIDO = eINSTANCE.getContenido();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ValorAtributoValorImpl <em>Valor Atributo Valor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ValorAtributoValorImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getValorAtributoValor()
     * @generated
     */
    EClass VALOR_ATRIBUTO_VALOR = eINSTANCE.getValorAtributoValor();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaIntegerImpl <em>Lista Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaIntegerImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getListaInteger()
     * @generated
     */
    EClass LISTA_INTEGER = eINSTANCE.getListaInteger();

    /**
     * The meta object literal for the '<em><b>Valores</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LISTA_INTEGER__VALORES = eINSTANCE.getListaInteger_Valores();

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

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaImpl <em>Lista</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ListaImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getLista()
     * @generated
     */
    EClass LISTA = eINSTANCE.getLista();

  }

} //VtdslPackage
