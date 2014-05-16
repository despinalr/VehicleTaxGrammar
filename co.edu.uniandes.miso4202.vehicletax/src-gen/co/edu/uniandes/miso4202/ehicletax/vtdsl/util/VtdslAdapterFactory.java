/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl.util;

import co.edu.uniandes.miso4202.ehicletax.vtdsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage
 * @generated
 */
public class VtdslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VtdslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VtdslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VtdslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VtdslSwitch<Adapter> modelSwitch =
    new VtdslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseEntidad(Entidad object)
      {
        return createEntidadAdapter();
      }
      @Override
      public Adapter caseRegistro(Registro object)
      {
        return createRegistroAdapter();
      }
      @Override
      public Adapter caseContacto(Contacto object)
      {
        return createContactoAdapter();
      }
      @Override
      public Adapter casePago(Pago object)
      {
        return createPagoAdapter();
      }
      @Override
      public Adapter casePropiedad(Propiedad object)
      {
        return createPropiedadAdapter();
      }
      @Override
      public Adapter caseObjeto(Objeto object)
      {
        return createObjetoAdapter();
      }
      @Override
      public Adapter caseAtributoSimple(AtributoSimple object)
      {
        return createAtributoSimpleAdapter();
      }
      @Override
      public Adapter caseAtributoInicializado(AtributoInicializado object)
      {
        return createAtributoInicializadoAdapter();
      }
      @Override
      public Adapter caseAtributoListaString(AtributoListaString object)
      {
        return createAtributoListaStringAdapter();
      }
      @Override
      public Adapter caseAtributoListaInteger(AtributoListaInteger object)
      {
        return createAtributoListaIntegerAdapter();
      }
      @Override
      public Adapter caseAtributoLista(AtributoLista object)
      {
        return createAtributoListaAdapter();
      }
      @Override
      public Adapter caseFormula(Formula object)
      {
        return createFormulaAdapter();
      }
      @Override
      public Adapter caseAtributo(Atributo object)
      {
        return createAtributoAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseEvaluation(Evaluation object)
      {
        return createEvaluationAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMulti(Multi object)
      {
        return createMultiAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseSTRING(STRING object)
      {
        return createSTRINGAdapter();
      }
      @Override
      public Adapter caseID(ID object)
      {
        return createIDAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Entidad <em>Entidad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Entidad
   * @generated
   */
  public Adapter createEntidadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Registro <em>Registro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Registro
   * @generated
   */
  public Adapter createRegistroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Contacto <em>Contacto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Contacto
   * @generated
   */
  public Adapter createContactoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Pago <em>Pago</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Pago
   * @generated
   */
  public Adapter createPagoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Propiedad <em>Propiedad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Propiedad
   * @generated
   */
  public Adapter createPropiedadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto <em>Objeto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto
   * @generated
   */
  public Adapter createObjetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoSimple <em>Atributo Simple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoSimple
   * @generated
   */
  public Adapter createAtributoSimpleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado <em>Atributo Inicializado</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoInicializado
   * @generated
   */
  public Adapter createAtributoInicializadoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaString <em>Atributo Lista String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaString
   * @generated
   */
  public Adapter createAtributoListaStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaInteger <em>Atributo Lista Integer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoListaInteger
   * @generated
   */
  public Adapter createAtributoListaIntegerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoLista <em>Atributo Lista</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoLista
   * @generated
   */
  public Adapter createAtributoListaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Formula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Formula
   * @generated
   */
  public Adapter createFormulaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Atributo <em>Atributo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Atributo
   * @generated
   */
  public Adapter createAtributoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Evaluation
   * @generated
   */
  public Adapter createEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Multi
   * @generated
   */
  public Adapter createMultiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.STRING <em>STRING</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.STRING
   * @generated
   */
  public Adapter createSTRINGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ID
   * @generated
   */
  public Adapter createIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VtdslAdapterFactory
