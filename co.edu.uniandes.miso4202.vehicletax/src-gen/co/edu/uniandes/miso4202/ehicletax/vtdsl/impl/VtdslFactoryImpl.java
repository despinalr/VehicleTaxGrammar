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
      case VtdslPackage.COMPONENTE: return createComponente();
      case VtdslPackage.OBJETO_SIMPLE: return createObjetoSimple();
      case VtdslPackage.OBJETO_NOMBRE: return createObjetoNombre();
      case VtdslPackage.ATRIBUTO: return createAtributo();
      case VtdslPackage.TIPO_SIMPLE: return createTipoSimple();
      case VtdslPackage.TIPO_VALOR: return createTipoValor();
      case VtdslPackage.LISTA: return createLista();
      case VtdslPackage.LISTA_INT: return createListaInt();
      case VtdslPackage.LISTA_STRING: return createListaString();
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
  public Componente createComponente()
  {
    ComponenteImpl componente = new ComponenteImpl();
    return componente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjetoSimple createObjetoSimple()
  {
    ObjetoSimpleImpl objetoSimple = new ObjetoSimpleImpl();
    return objetoSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjetoNombre createObjetoNombre()
  {
    ObjetoNombreImpl objetoNombre = new ObjetoNombreImpl();
    return objetoNombre;
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
  public TipoSimple createTipoSimple()
  {
    TipoSimpleImpl tipoSimple = new TipoSimpleImpl();
    return tipoSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TipoValor createTipoValor()
  {
    TipoValorImpl tipoValor = new TipoValorImpl();
    return tipoValor;
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
  public ListaInt createListaInt()
  {
    ListaIntImpl listaInt = new ListaIntImpl();
    return listaInt;
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
