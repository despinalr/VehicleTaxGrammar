/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl.impl;

import co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Propiedad;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objeto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.ObjetoImpl#getPropiedades <em>Propiedades</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjetoImpl extends PropiedadImpl implements Objeto
{
  /**
   * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescripcion()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPCION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescripcion()
   * @generated
   * @ordered
   */
  protected String descripcion = DESCRIPCION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPropiedades() <em>Propiedades</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropiedades()
   * @generated
   * @ordered
   */
  protected EList<Propiedad> propiedades;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjetoImpl()
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
    return VtdslPackage.Literals.OBJETO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescripcion()
  {
    return descripcion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescripcion(String newDescripcion)
  {
    String oldDescripcion = descripcion;
    descripcion = newDescripcion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VtdslPackage.OBJETO__DESCRIPCION, oldDescripcion, descripcion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Propiedad> getPropiedades()
  {
    if (propiedades == null)
    {
      propiedades = new EObjectContainmentEList<Propiedad>(Propiedad.class, this, VtdslPackage.OBJETO__PROPIEDADES);
    }
    return propiedades;
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
      case VtdslPackage.OBJETO__PROPIEDADES:
        return ((InternalEList<?>)getPropiedades()).basicRemove(otherEnd, msgs);
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
      case VtdslPackage.OBJETO__DESCRIPCION:
        return getDescripcion();
      case VtdslPackage.OBJETO__PROPIEDADES:
        return getPropiedades();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VtdslPackage.OBJETO__DESCRIPCION:
        setDescripcion((String)newValue);
        return;
      case VtdslPackage.OBJETO__PROPIEDADES:
        getPropiedades().clear();
        getPropiedades().addAll((Collection<? extends Propiedad>)newValue);
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
      case VtdslPackage.OBJETO__DESCRIPCION:
        setDescripcion(DESCRIPCION_EDEFAULT);
        return;
      case VtdslPackage.OBJETO__PROPIEDADES:
        getPropiedades().clear();
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
      case VtdslPackage.OBJETO__DESCRIPCION:
        return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
      case VtdslPackage.OBJETO__PROPIEDADES:
        return propiedades != null && !propiedades.isEmpty();
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
    result.append(" (descripcion: ");
    result.append(descripcion);
    result.append(')');
    return result.toString();
  }

} //ObjetoImpl
