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
        if (result == null) result = caseContenido(objeto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.ATRIBUTO_SIMPLE:
      {
        AtributoSimple atributoSimple = (AtributoSimple)theEObject;
        T result = caseAtributoSimple(atributoSimple);
        if (result == null) result = caseAtributo(atributoSimple);
        if (result == null) result = caseContenido(atributoSimple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.ATRIBUTO_ASIGNADO:
      {
        AtributoAsignado atributoAsignado = (AtributoAsignado)theEObject;
        T result = caseAtributoAsignado(atributoAsignado);
        if (result == null) result = caseAtributo(atributoAsignado);
        if (result == null) result = caseContenido(atributoAsignado);
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
        if (result == null) result = caseValorCompleto(valorAtributo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.VALOR_COMPLETO:
      {
        ValorCompleto valorCompleto = (ValorCompleto)theEObject;
        T result = caseValorCompleto(valorCompleto);
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
      case VtdslPackage.LISTA_INTEGER:
      {
        ListaInteger listaInteger = (ListaInteger)theEObject;
        T result = caseListaInteger(listaInteger);
        if (result == null) result = caseLista(listaInteger);
        if (result == null) result = caseValorCompleto(listaInteger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.LISTA_STRING:
      {
        ListaString listaString = (ListaString)theEObject;
        T result = caseListaString(listaString);
        if (result == null) result = caseLista(listaString);
        if (result == null) result = caseValorCompleto(listaString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.LISTA:
      {
        Lista lista = (Lista)theEObject;
        T result = caseLista(lista);
        if (result == null) result = caseValorCompleto(lista);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        T result = caseDefinition(definition);
        if (result == null) result = caseStatement(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.EVALUATION:
      {
        Evaluation evaluation = (Evaluation)theEObject;
        T result = caseEvaluation(evaluation);
        if (result == null) result = caseStatement(evaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.ATRIBUTO_TIPADO:
      {
        AtributoTipado atributoTipado = (AtributoTipado)theEObject;
        T result = caseAtributoTipado(atributoTipado);
        if (result == null) result = caseAtributoSimple(atributoTipado);
        if (result == null) result = caseAtributo(atributoTipado);
        if (result == null) result = caseContenido(atributoTipado);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseExpression(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseExpression(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.MULTI:
      {
        Multi multi = (Multi)theEObject;
        T result = caseMulti(multi);
        if (result == null) result = caseExpression(multi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseExpression(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = caseExpression(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.STRING:
      {
        STRING string = (STRING)theEObject;
        T result = caseSTRING(string);
        if (result == null) result = caseExpression(string);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VtdslPackage.ID:
      {
        ID id = (ID)theEObject;
        T result = caseID(id);
        if (result == null) result = caseExpression(id);
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
   * Returns the result of interpreting the object as an instance of '<em>Atributo Simple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atributo Simple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtributoSimple(AtributoSimple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atributo Asignado</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atributo Asignado</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtributoAsignado(AtributoAsignado object)
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
   * Returns the result of interpreting the object as an instance of '<em>Valor Completo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Valor Completo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValorCompleto(ValorCompleto object)
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
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinition(Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluation(Evaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atributo Tipado</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atributo Tipado</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtributoTipado(AtributoTipado object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinus(Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulti(Multi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>STRING</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STRING</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSTRING(STRING object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseID(ID object)
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
