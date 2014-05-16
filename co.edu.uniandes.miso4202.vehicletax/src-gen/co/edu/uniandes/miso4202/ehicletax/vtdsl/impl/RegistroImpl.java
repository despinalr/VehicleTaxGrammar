/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl.impl;

import co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Registro;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.miso4202.ehicletax.vtdsl.impl.RegistroImpl#getPropiedades <em>Propiedades</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegistroImpl extends EntidadImpl implements Registro
{
  /**
   * The cached value of the '{@link #getPropiedades() <em>Propiedades</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropiedades()
   * @generated
   * @ordered
   */
  protected EList<Objeto> propiedades;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegistroImpl()
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
    return VtdslPackage.Literals.REGISTRO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Objeto> getPropiedades()
  {
    if (propiedades == null)
    {
      propiedades = new EObjectContainmentEList<Objeto>(Objeto.class, this, VtdslPackage.REGISTRO__PROPIEDADES);
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
      case VtdslPackage.REGISTRO__PROPIEDADES:
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
      case VtdslPackage.REGISTRO__PROPIEDADES:
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
      case VtdslPackage.REGISTRO__PROPIEDADES:
        getPropiedades().clear();
        getPropiedades().addAll((Collection<? extends Objeto>)newValue);
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
      case VtdslPackage.REGISTRO__PROPIEDADES:
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
      case VtdslPackage.REGISTRO__PROPIEDADES:
        return propiedades != null && !propiedades.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RegistroImpl
