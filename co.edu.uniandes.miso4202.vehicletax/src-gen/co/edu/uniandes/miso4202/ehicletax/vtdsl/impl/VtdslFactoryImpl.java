/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl.impl;

import co.edu.uniandes.miso4202.ehicletax.vtdsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VtdslFactoryImpl extends EFactoryImpl implements VtdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VtdslFactory init()
  {
    try
    {
      VtdslFactory theVtdslFactory = (VtdslFactory)EPackage.Registry.INSTANCE.getEFactory(VtdslPackage.eNS_URI);
      if (theVtdslFactory != null)
      {
        return theVtdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VtdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VtdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VtdslPackage.MODEL: return createModel();
      case VtdslPackage.OBJETO: return createObjeto();
      case VtdslPackage.ATRIBUTO_SIMPLE: return createAtributoSimple();
      case VtdslPackage.ATRIBUTO_INICIALIZADO: return createAtributoInicializado();
      case VtdslPackage.ATRIBUTO_LISTA_STRING: return createAtributoListaString();
      case VtdslPackage.ATRIBUTO_LISTA_INTEGER: return createAtributoListaInteger();
      case VtdslPackage.FORMULA: return createFormula();
      case VtdslPackage.ATRIBUTO: return createAtributo();
      case VtdslPackage.CONTENIDO: return createContenido();
      case VtdslPackage.MODULE: return createModule();
      case VtdslPackage.STATEMENT: return createStatement();
      case VtdslPackage.DEFINITION: return createDefinition();
      case VtdslPackage.EVALUATION: return createEvaluation();
      case VtdslPackage.EXPRESSION: return createExpression();
      case VtdslPackage.PLUS: return createPlus();
      case VtdslPackage.MINUS: return createMinus();
      case VtdslPackage.MULTI: return createMulti();
      case VtdslPackage.DIV: return createDiv();
      case VtdslPackage.NUMBER_LITERAL: return createNumberLiteral();
      case VtdslPackage.STRING: return createSTRING();
      case VtdslPackage.ID: return createID();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objeto createObjeto()
  {
    ObjetoImpl objeto = new ObjetoImpl();
    return objeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtributoSimple createAtributoSimple()
  {
    AtributoSimpleImpl atributoSimple = new AtributoSimpleImpl();
    return atributoSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtributoInicializado createAtributoInicializado()
  {
    AtributoInicializadoImpl atributoInicializado = new AtributoInicializadoImpl();
    return atributoInicializado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtributoListaString createAtributoListaString()
  {
    AtributoListaStringImpl atributoListaString = new AtributoListaStringImpl();
    return atributoListaString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtributoListaInteger createAtributoListaInteger()
  {
    AtributoListaIntegerImpl atributoListaInteger = new AtributoListaIntegerImpl();
    return atributoListaInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Formula createFormula()
  {
    FormulaImpl formula = new FormulaImpl();
    return formula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atributo createAtributo()
  {
    AtributoImpl atributo = new AtributoImpl();
    return atributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Contenido createContenido()
  {
    ContenidoImpl contenido = new ContenidoImpl();
    return contenido;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evaluation createEvaluation()
  {
    EvaluationImpl evaluation = new EvaluationImpl();
    return evaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING createSTRING()
  {
    STRINGImpl string = new STRINGImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ID createID()
  {
    IDImpl id = new IDImpl();
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VtdslPackage getVtdslPackage()
  {
    return (VtdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VtdslPackage getPackage()
  {
    return VtdslPackage.eINSTANCE;
  }

} //VtdslFactoryImpl
