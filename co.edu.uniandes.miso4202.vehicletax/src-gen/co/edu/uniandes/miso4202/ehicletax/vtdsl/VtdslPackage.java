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
  int CONTENIDO = 7;

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
  int ATRIBUTO = 5;

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
  int ATRIBUTO_OBJETO = 4;

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
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoAsignacionImpl <em>Atributo Asignacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoAsignacionImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoAsignacion()
   * @generated
   */
  int ATRIBUTO_ASIGNACION = 3;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_ASIGNACION__NOMBRE = ATRIBUTO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Valor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_ASIGNACION__VALOR = ATRIBUTO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Atributo Asignacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_ASIGNACION_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ValorAtributoImpl <em>Valor Atributo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ValorAtributoImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getValorAtributo()
   * @generated
   */
  int VALOR_ATRIBUTO = 6;

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
  int VALOR_ATRIBUTO_VALOR = 8;

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
  int LISTA = 11;

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
  int LISTA_INTEGER = 9;

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
  int LISTA_STRING = 10;

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
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModuleImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getModule()
   * @generated
   */
  int MODULE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.StatementImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 13;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.DefinitionImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.EvaluationImpl <em>Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.EvaluationImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getEvaluation()
   * @generated
   */
  int EVALUATION = 15;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ExpressionImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 16;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.PlusImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.MinusImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.MultiImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.DivImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getDiv()
   * @generated
   */
  int DIV = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.NumberLiteralImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.STRINGImpl <em>STRING</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.STRINGImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getSTRING()
   * @generated
   */
  int STRING = 22;

  /**
   * The number of structural features of the '<em>STRING</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.IDImpl <em>ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.IDImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getID()
   * @generated
   */
  int ID = 23;

  /**
   * The number of structural features of the '<em>ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;


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
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoAsignacion <em>Atributo Asignacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo Asignacion</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoAsignacion
   * @generated
   */
  EClass getAtributoAsignacion();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoAsignacion#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoAsignacion#getNombre()
   * @see #getAtributoAsignacion()
   * @generated
   */
  EAttribute getAtributoAsignacion_Nombre();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoAsignacion#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Valor</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoAsignacion#getValor()
   * @see #getAtributoAsignacion()
   * @generated
   */
  EReference getAtributoAsignacion_Valor();

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
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Module#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Module#getStatements()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Statements();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Definition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Definition#getName()
   * @see #getDefinition()
   * @generated
   */
  EAttribute getDefinition_Name();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Evaluation
   * @generated
   */
  EClass getEvaluation();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Evaluation#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Evaluation#getExpression()
   * @see #getEvaluation()
   * @generated
   */
  EReference getEvaluation_Expression();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.STRING <em>STRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STRING</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.STRING
   * @generated
   */
  EClass getSTRING();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ID
   * @generated
   */
  EClass getID();

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
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoAsignacionImpl <em>Atributo Asignacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoAsignacionImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoAsignacion()
     * @generated
     */
    EClass ATRIBUTO_ASIGNACION = eINSTANCE.getAtributoAsignacion();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO_ASIGNACION__NOMBRE = eINSTANCE.getAtributoAsignacion_Nombre();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATRIBUTO_ASIGNACION__VALOR = eINSTANCE.getAtributoAsignacion_Valor();

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

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModuleImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__STATEMENTS = eINSTANCE.getModule_Statements();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.StatementImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.DefinitionImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__NAME = eINSTANCE.getDefinition_Name();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.EvaluationImpl <em>Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.EvaluationImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getEvaluation()
     * @generated
     */
    EClass EVALUATION = eINSTANCE.getEvaluation();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION__EXPRESSION = eINSTANCE.getEvaluation_Expression();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ExpressionImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.PlusImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.MinusImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.MultiImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.DivImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.NumberLiteralImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.STRINGImpl <em>STRING</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.STRINGImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getSTRING()
     * @generated
     */
    EClass STRING = eINSTANCE.getSTRING();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.IDImpl <em>ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.IDImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getID()
     * @generated
     */
    EClass ID = eINSTANCE.getID();

  }

} //VtdslPackage
