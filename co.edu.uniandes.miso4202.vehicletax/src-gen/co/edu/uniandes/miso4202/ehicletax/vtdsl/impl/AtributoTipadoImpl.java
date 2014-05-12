/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl.impl;

import co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoTipado;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorCompleto;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo Tipado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoTipadoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoTipadoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.AtributoTipadoImpl#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtributoTipadoImpl extends AtributoSimpleImpl implements AtributoTipado
{
  /**
   * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected static final String NOMBRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected String nombre = NOMBRE_EDEFAULT;

  /**
   * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected static final String TIPO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected String tipo = TIPO_EDEFAULT;

  /**
   * The cached value of the '{@link #getValor() <em>Valor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected ValorCompleto valor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtributoTipadoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VtdslPackage.Literals.ATRIBUTO_TIPADO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(String newNombre)
  {
    String oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VtdslPackage.ATRIBUTO_TIPADO__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipo(String newTipo)
  {
    String oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VtdslPackage.ATRIBUTO_TIPADO__TIPO, oldTipo, tipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValorCompleto getValor()
  {
    return valor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValor(ValorCompleto newValor, NotificationChain msgs)
  {
    ValorCompleto oldValor = valor;
    valor = newValor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VtdslPackage.ATRIBUTO_TIPADO__VALOR, oldValor, newValor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValor(ValorCompleto newValor)
  {
    if (newValor != valor)
    {
      NotificationChain msgs = null;
      if (valor != null)
        msgs = ((InternalEObject)valor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VtdslPackage.ATRIBUTO_TIPADO__VALOR, null, msgs);
      if (newValor != null)
        msgs = ((InternalEObject)newValor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VtdslPackage.ATRIBUTO_TIPADO__VALOR, null, msgs);
      msgs = basicSetValor(newValor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VtdslPackage.ATRIBUTO_TIPADO__VALOR, newValor, newValor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VtdslPackage.ATRIBUTO_TIPADO__VALOR:
        return basicSetValor(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VtdslPackage.ATRIBUTO_TIPADO__NOMBRE:
        return getNombre();
      case VtdslPackage.ATRIBUTO_TIPADO__TIPO:
        return getTipo();
      case VtdslPackage.ATRIBUTO_TIPADO__VALOR:
        return getValor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VtdslPackage.ATRIBUTO_TIPADO__NOMBRE:
        setNombre((String)newValue);
        return;
      case VtdslPackage.ATRIBUTO_TIPADO__TIPO:
        setTipo((String)newValue);
        return;
      case VtdslPackage.ATRIBUTO_TIPADO__VALOR:
        setValor((ValorCompleto)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VtdslPackage.ATRIBUTO_TIPADO__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case VtdslPackage.ATRIBUTO_TIPADO__TIPO:
        setTipo(TIPO_EDEFAULT);
        return;
      case VtdslPackage.ATRIBUTO_TIPADO__VALOR:
        setValor((ValorCompleto)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VtdslPackage.ATRIBUTO_TIPADO__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case VtdslPackage.ATRIBUTO_TIPADO__TIPO:
        return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
      case VtdslPackage.ATRIBUTO_TIPADO__VALOR:
        return valor != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nombre: ");
    result.append(nombre);
    result.append(", tipo: ");
    result.append(tipo);
    result.append(')');
    return result.toString();
  }

} //AtributoTipadoImpl
