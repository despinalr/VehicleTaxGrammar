/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl.util;

import co.edu.uniandes.miso4202.ehicletax.vtdsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage
 * @generated
 */
public class VtdslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VtdslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VtdslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VtdslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VtdslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.COMPONENTE:
      {
        Componente componente = (Componente)theEObject;
        T result = caseComponente(componente);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.OBJETO_SIMPLE:
      {
        ObjetoSimple objetoSimple = (ObjetoSimple)theEObject;
        T result = caseObjetoSimple(objetoSimple);
        if (result == null) result = caseComponente(objetoSimple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.OBJETO_NOMBRE:
      {
        ObjetoNombre objetoNombre = (ObjetoNombre)theEObject;
        T result = caseObjetoNombre(objetoNombre);
        if (result == null) result = caseComponente(objetoNombre);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.ATRIBUTO:
      {
        Atributo atributo = (Atributo)theEObject;
        T result = caseAtributo(atributo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.TIPO_SIMPLE:
      {
        TipoSimple tipoSimple = (TipoSimple)theEObject;
        T result = caseTipoSimple(tipoSimple);
        if (result == null) result = caseAtributo(tipoSimple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.TIPO_VALOR:
      {
        TipoValor tipoValor = (TipoValor)theEObject;
        T result = caseTipoValor(tipoValor);
        if (result == null) result = caseAtributo(tipoValor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.LISTA:
      {
        Lista lista = (Lista)theEObject;
        T result = caseLista(lista);
        if (result == null) result = caseAtributo(lista);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.LISTA_INT:
      {
        ListaInt listaInt = (ListaInt)theEObject;
        T result = caseListaInt(listaInt);
        if (result == null) result = caseLista(listaInt);
        if (result == null) result = caseAtributo(listaInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.LISTA_STRING:
      {
        ListaString listaString = (ListaString)theEObject;
        T result = caseListaString(listaString);
        if (result == null) result = caseLista(listaString);
        if (result == null) result = caseAtributo(listaString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Componente</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Componente</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponente(Componente object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objeto Simple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objeto Simple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjetoSimple(ObjetoSimple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objeto Nombre</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objeto Nombre</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjetoNombre(ObjetoNombre object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtributo(Atributo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tipo Simple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tipo Simple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTipoSimple(TipoSimple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tipo Valor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tipo Valor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTipoValor(TipoValor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lista</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lista</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLista(Lista object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lista Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lista Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListaInt(ListaInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lista String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lista String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListaString(ListaString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VtdslSwitch
