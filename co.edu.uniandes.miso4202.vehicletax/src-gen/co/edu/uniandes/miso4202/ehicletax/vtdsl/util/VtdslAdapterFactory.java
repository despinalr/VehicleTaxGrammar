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
      public Adapter caseComponente(Componente object)
      {
        return createComponenteAdapter();
      }
      @Override
      public Adapter caseObjetoSimple(ObjetoSimple object)
      {
        return createObjetoSimpleAdapter();
      }
      @Override
      public Adapter caseObjetoNombre(ObjetoNombre object)
      {
        return createObjetoNombreAdapter();
      }
      @Override
      public Adapter caseAtributo(Atributo object)
      {
        return createAtributoAdapter();
      }
      @Override
      public Adapter caseTipoSimple(TipoSimple object)
      {
        return createTipoSimpleAdapter();
      }
      @Override
      public Adapter caseTipoValor(TipoValor object)
      {
        return createTipoValorAdapter();
      }
      @Override
      public Adapter caseLista(Lista object)
      {
        return createListaAdapter();
      }
      @Override
      public Adapter caseListaInt(ListaInt object)
      {
        return createListaIntAdapter();
      }
      @Override
      public Adapter caseListaString(ListaString object)
      {
        return createListaStringAdapter();
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
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente <em>Componente</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente
   * @generated
   */
  public Adapter createComponenteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoSimple <em>Objeto Simple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoSimple
   * @generated
   */
  public Adapter createObjetoSimpleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoNombre <em>Objeto Nombre</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoNombre
   * @generated
   */
  public Adapter createObjetoNombreAdapter()
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
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoSimple <em>Tipo Simple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoSimple
   * @generated
   */
  public Adapter createTipoSimpleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoValor <em>Tipo Valor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoValor
   * @generated
   */
  public Adapter createTipoValorAdapter()
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
   * Creates a new adapter for an object of class '{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInt <em>Lista Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInt
   * @generated
   */
  public Adapter createListaIntAdapter()
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
