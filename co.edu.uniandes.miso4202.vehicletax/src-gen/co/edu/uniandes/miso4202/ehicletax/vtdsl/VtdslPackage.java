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
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Objetos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OBJETOS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ContenidoImpl <em>Contenido</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ContenidoImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getContenido()
   * @generated
   */
  int CONTENIDO = 8;

  /**
   * The number of structural features of the '<em>Contenido</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENIDO_FEATURE_COUNT = 0;

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
  int OBJETO__NAME = CONTENIDO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Descripcion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO__DESCRIPCION = CONTENIDO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO__ATRIBUTOS = CONTENIDO_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Objetos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO__OBJETOS = CONTENIDO_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Objeto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJETO_FEATURE_COUNT = CONTENIDO_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoImpl <em>Atributo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributo()
   * @generated
   */
  int ATRIBUTO = 7;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO__NOMBRE = CONTENIDO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atributo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_FEATURE_COUNT = CONTENIDO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoSimpleImpl <em>Atributo Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoSimpleImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoSimple()
   * @generated
   */
  int ATRIBUTO_SIMPLE = 2;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_SIMPLE__NOMBRE = ATRIBUTO__NOMBRE;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_SIMPLE__TIPO = ATRIBUTO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atributo Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_SIMPLE_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoInicializadoImpl <em>Atributo Inicializado</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoInicializadoImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoInicializado()
   * @generated
   */
  int ATRIBUTO_INICIALIZADO = 3;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_INICIALIZADO__NOMBRE = ATRIBUTO__NOMBRE;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_INICIALIZADO__TIPO = ATRIBUTO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_INICIALIZADO__VALOR = ATRIBUTO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Atributo Inicializado</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_INICIALIZADO_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoListaStringImpl <em>Atributo Lista String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoListaStringImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoListaString()
   * @generated
   */
  int ATRIBUTO_LISTA_STRING = 4;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_LISTA_STRING__NOMBRE = ATRIBUTO__NOMBRE;

  /**
   * The feature id for the '<em><b>Valores</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_LISTA_STRING__VALORES = ATRIBUTO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atributo Lista String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_LISTA_STRING_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoListaIntegerImpl <em>Atributo Lista Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoListaIntegerImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoListaInteger()
   * @generated
   */
  int ATRIBUTO_LISTA_INTEGER = 5;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_LISTA_INTEGER__NOMBRE = ATRIBUTO__NOMBRE;

  /**
   * The feature id for the '<em><b>Valores</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_LISTA_INTEGER__VALORES = ATRIBUTO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atributo Lista Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_LISTA_INTEGER_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.FormulaImpl <em>Formula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.FormulaImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getFormula()
   * @generated
   */
  int FORMULA = 6;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA__NOMBRE = ATRIBUTO__NOMBRE;

  /**
   * The feature id for the '<em><b>Expresiones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA__EXPRESIONES = ATRIBUTO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Formula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ModuleImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getModule()
   * @generated
   */
  int MODULE = 9;

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
  int STATEMENT = 10;

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
  int DEFINITION = 11;

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
  int EVALUATION = 12;

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
  int EXPRESSION = 13;

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
  int PLUS = 14;

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
  int MINUS = 15;

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
  int MULTI = 16;

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
  int DIV = 17;

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
  int NUMBER_LITERAL = 18;

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
  int STRING = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>STRING</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.IDImpl <em>ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.IDImpl
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getID()
   * @generated
   */
  int ID = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


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
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Model#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Model#getNombre()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Nombre();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Model#getObjetos <em>Objetos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objetos</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Model#getObjetos()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Objetos();

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
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getObjetos <em>Objetos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objetos</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto#getObjetos()
   * @see #getObjeto()
   * @generated
   */
  EReference getObjeto_Objetos();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoSimple <em>Atributo Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo Simple</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoSimple
   * @generated
   */
  EClass getAtributoSimple();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoSimple#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoSimple#getTipo()
   * @see #getAtributoSimple()
   * @generated
   */
  EAttribute getAtributoSimple_Tipo();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado <em>Atributo Inicializado</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo Inicializado</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado
   * @generated
   */
  EClass getAtributoInicializado();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado#getTipo()
   * @see #getAtributoInicializado()
   * @generated
   */
  EAttribute getAtributoInicializado_Tipo();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado#getValor()
   * @see #getAtributoInicializado()
   * @generated
   */
  EAttribute getAtributoInicializado_Valor();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaString <em>Atributo Lista String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo Lista String</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaString
   * @generated
   */
  EClass getAtributoListaString();

  /**
   * Returns the meta object for the attribute list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaString#getValores <em>Valores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Valores</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaString#getValores()
   * @see #getAtributoListaString()
   * @generated
   */
  EAttribute getAtributoListaString_Valores();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaInteger <em>Atributo Lista Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo Lista Integer</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaInteger
   * @generated
   */
  EClass getAtributoListaInteger();

  /**
   * Returns the meta object for the attribute list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaInteger#getValores <em>Valores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Valores</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaInteger#getValores()
   * @see #getAtributoListaInteger()
   * @generated
   */
  EAttribute getAtributoListaInteger_Valores();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Formula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formula</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Formula
   * @generated
   */
  EClass getFormula();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Formula#getExpresiones <em>Expresiones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expresiones</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Formula#getExpresiones()
   * @see #getFormula()
   * @generated
   */
  EReference getFormula_Expresiones();

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
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Atributo#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Atributo#getNombre()
   * @see #getAtributo()
   * @generated
   */
  EAttribute getAtributo_Nombre();

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
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.STRING#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.STRING#getValue()
   * @see #getSTRING()
   * @generated
   */
  EAttribute getSTRING_Value();

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
   * Returns the meta object for the attribute '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ID#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ID#getValue()
   * @see #getID()
   * @generated
   */
  EAttribute getID_Value();

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
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NOMBRE = eINSTANCE.getModel_Nombre();

    /**
     * The meta object literal for the '<em><b>Objetos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__OBJETOS = eINSTANCE.getModel_Objetos();

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
     * The meta object literal for the '<em><b>Objetos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJETO__OBJETOS = eINSTANCE.getObjeto_Objetos();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoSimpleImpl <em>Atributo Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoSimpleImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoSimple()
     * @generated
     */
    EClass ATRIBUTO_SIMPLE = eINSTANCE.getAtributoSimple();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO_SIMPLE__TIPO = eINSTANCE.getAtributoSimple_Tipo();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoInicializadoImpl <em>Atributo Inicializado</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoInicializadoImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoInicializado()
     * @generated
     */
    EClass ATRIBUTO_INICIALIZADO = eINSTANCE.getAtributoInicializado();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO_INICIALIZADO__TIPO = eINSTANCE.getAtributoInicializado_Tipo();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO_INICIALIZADO__VALOR = eINSTANCE.getAtributoInicializado_Valor();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoListaStringImpl <em>Atributo Lista String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoListaStringImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoListaString()
     * @generated
     */
    EClass ATRIBUTO_LISTA_STRING = eINSTANCE.getAtributoListaString();

    /**
     * The meta object literal for the '<em><b>Valores</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO_LISTA_STRING__VALORES = eINSTANCE.getAtributoListaString_Valores();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoListaIntegerImpl <em>Atributo Lista Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoListaIntegerImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getAtributoListaInteger()
     * @generated
     */
    EClass ATRIBUTO_LISTA_INTEGER = eINSTANCE.getAtributoListaInteger();

    /**
     * The meta object literal for the '<em><b>Valores</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO_LISTA_INTEGER__VALORES = eINSTANCE.getAtributoListaInteger_Valores();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.FormulaImpl <em>Formula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.FormulaImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getFormula()
     * @generated
     */
    EClass FORMULA = eINSTANCE.getFormula();

    /**
     * The meta object literal for the '<em><b>Expresiones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA__EXPRESIONES = eINSTANCE.getFormula_Expresiones();

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
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING__VALUE = eINSTANCE.getSTRING_Value();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.IDImpl <em>ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.IDImpl
     * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.VtdslPackageImpl#getID()
     * @generated
     */
    EClass ID = eINSTANCE.getID();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID__VALUE = eINSTANCE.getID_Value();

  }

} //VtdslPackage
