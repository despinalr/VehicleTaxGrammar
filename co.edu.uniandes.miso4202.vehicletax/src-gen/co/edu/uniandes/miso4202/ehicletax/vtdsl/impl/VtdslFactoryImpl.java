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
      case VtdslPackage.MODELO: return createModelo();
      case VtdslPackage.OBJETO: return createObjeto();
      case VtdslPackage.ATRIBUTO_SIMPLE: return createAtributoSimple();
      case VtdslPackage.ATRIBUTO_ASIGNADO: return createAtributoAsignado();
      case VtdslPackage.ATRIBUTO: return createAtributo();
      case VtdslPackage.VALOR_ATRIBUTO: return createValorAtributo();
      case VtdslPackage.VALOR_COMPLETO: return createValorCompleto();
      case VtdslPackage.CONTENIDO: return createContenido();
      case VtdslPackage.LISTA_INTEGER: return createListaInteger();
      case VtdslPackage.LISTA_STRING: return createListaString();
      case VtdslPackage.LISTA: return createLista();
      case VtdslPackage.MODULE: return createModule();
      case VtdslPackage.STATEMENT: return createStatement();
      case VtdslPackage.DEFINITION: return createDefinition();
      case VtdslPackage.EVALUATION: return createEvaluation();
      case VtdslPackage.EXPRESSION: return createExpression();
      case VtdslPackage.ATRIBUTO_TIPADO: return createAtributoTipado();
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
  public Modelo createModelo()
  {
    ModeloImpl modelo = new ModeloImpl();
    return modelo;
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
  public AtributoAsignado createAtributoAsignado()
  {
    AtributoAsignadoImpl atributoAsignado = new AtributoAsignadoImpl();
    return atributoAsignado;
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
  public ValorAtributo createValorAtributo()
  {
    ValorAtributoImpl valorAtributo = new ValorAtributoImpl();
    return valorAtributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValorCompleto createValorCompleto()
  {
    ValorCompletoImpl valorCompleto = new ValorCompletoImpl();
    return valorCompleto;
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
  public ListaInteger createListaInteger()
  {
    ListaIntegerImpl listaInteger = new ListaIntegerImpl();
    return listaInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListaString createListaString()
  {
    ListaStringImpl listaString = new ListaStringImpl();
    return listaString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lista createLista()
  {
    ListaImpl lista = new ListaImpl();
    return lista;
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
  public AtributoTipado createAtributoTipado()
  {
    AtributoTipadoImpl atributoTipado = new AtributoTipadoImpl();
    return atributoTipado;
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
