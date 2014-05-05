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
      case VtdslPackage.MODELO:
      {
        Modelo modelo = (Modelo)theEObject;
        T result = caseModelo(modelo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.OBJETO:
      {
        Objeto objeto = (Objeto)theEObject;
        T result = caseObjeto(objeto);
        if (result == null) result = caseAtributoObjeto(objeto);
        if (result == null) result = caseAtributo(objeto);
        if (result == null) result = caseContenido(objeto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.ATRIBUTO_NORMAL:
      {
        AtributoNormal atributoNormal = (AtributoNormal)theEObject;
        T result = caseAtributoNormal(atributoNormal);
        if (result == null) result = caseAtributo(atributoNormal);
        if (result == null) result = caseContenido(atributoNormal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.ATRIBUTO_OBJETO:
      {
        AtributoObjeto atributoObjeto = (AtributoObjeto)theEObject;
        T result = caseAtributoObjeto(atributoObjeto);
        if (result == null) result = caseAtributo(atributoObjeto);
        if (result == null) result = caseContenido(atributoObjeto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.ATRIBUTO:
      {
        Atributo atributo = (Atributo)theEObject;
        T result = caseAtributo(atributo);
        if (result == null) result = caseContenido(atributo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.VALOR_ATRIBUTO:
      {
        ValorAtributo valorAtributo = (ValorAtributo)theEObject;
        T result = caseValorAtributo(valorAtributo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.CONTENIDO:
      {
        Contenido contenido = (Contenido)theEObject;
        T result = caseContenido(contenido);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.VALOR_ATRIBUTO_VALOR:
      {
        ValorAtributoValor valorAtributoValor = (ValorAtributoValor)theEObject;
        T result = caseValorAtributoValor(valorAtributoValor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.LISTA_INTEGER:
      {
        ListaInteger listaInteger = (ListaInteger)theEObject;
        T result = caseListaInteger(listaInteger);
        if (result == null) result = caseLista(listaInteger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.LISTA_STRING:
      {
        ListaString listaString = (ListaString)theEObject;
        T result = caseListaString(listaString);
        if (result == null) result = caseLista(listaString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.LISTA:
      {
        Lista lista = (Lista)theEObject;
        T result = caseLista(lista);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modelo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modelo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelo(Modelo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objeto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objeto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjeto(Objeto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atributo Normal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atributo Normal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtributoNormal(AtributoNormal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atributo Objeto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atributo Objeto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtributoObjeto(AtributoObjeto object)
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
   * Returns the result of interpreting the object as an instance of '<em>Valor Atributo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Valor Atributo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValorAtributo(ValorAtributo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contenido</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contenido</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContenido(Contenido object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Valor Atributo Valor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Valor Atributo Valor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValorAtributoValor(ValorAtributoValor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lista Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lista Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListaInteger(ListaInteger object)
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
