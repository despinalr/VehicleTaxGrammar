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
      public Adapter caseModelo(Modelo object)
      {
        return createModeloAdapter();
      }
      @Override
      public Adapter caseObjeto(Objeto object)
      {
        return createObjetoAdapter();
      }
      @Override
      public Adapter caseAtributoNormal(AtributoNormal object)
      {
        return createAtributoNormalAdapter();
      }
      @Override
      public Adapter caseAtributoObjeto(AtributoObjeto object)
      {
        return createAtributoObjetoAdapter();
      }
      @Override
      public Adapter caseAtributo(Atributo object)
      {
        return createAtributoAdapter();
      }
      @Override
      public Adapter caseValorAtributo(ValorAtributo object)
      {
        return createValorAtributoAdapter();
      }
      @Override
      public Adapter caseContenido(Contenido object)
      {
        return createContenidoAdapter();
      }
      @Override
      public Adapter caseValorAtributoValor(ValorAtributoValor object)
      {
        return createValorAtributoValorAdapter();
      }
      @Override
      public Adapter caseListaInteger(ListaInteger object)
      {
        return createListaIntegerAdapter();
      }
      @Override
      public Adapter caseListaString(ListaString object)
      {
        return createListaStringAdapter();
      }
      @Override
      public Adapter caseLista(Lista object)
      {
        return createListaAdapter();
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
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Modelo <em>Modelo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Modelo
   * @generated
   */
  public Adapter createModeloAdapter()
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
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoNormal <em>Atributo Normal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoNormal
   * @generated
   */
  public Adapter createAtributoNormalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoObjeto <em>Atributo Objeto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoObjeto
   * @generated
   */
  public Adapter createAtributoObjetoAdapter()
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
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributo <em>Valor Atributo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributo
   * @generated
   */
  public Adapter createValorAtributoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Contenido <em>Contenido</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Contenido
   * @generated
   */
  public Adapter createContenidoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributoValor <em>Valor Atributo Valor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributoValor
   * @generated
   */
  public Adapter createValorAtributoValorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInteger <em>Lista Integer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInteger
   * @generated
   */
  public Adapter createListaIntegerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaString <em>Lista String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaString
   * @generated
   */
  public Adapter createListaStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Lista <em>Lista</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Lista
   * @generated
   */
  public Adapter createListaAdapter()
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
