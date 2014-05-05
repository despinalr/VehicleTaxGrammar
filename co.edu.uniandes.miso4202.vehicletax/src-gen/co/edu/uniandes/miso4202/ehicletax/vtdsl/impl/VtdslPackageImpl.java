/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl.impl;

import co.edu.uniandes.miso4202.ehicletax.vtdsl.Atributo;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Componente;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Lista;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInt;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaString;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Model;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoNombre;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ObjetoSimple;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoSimple;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.TipoValor;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslFactory;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VtdslPackageImpl extends EPackageImpl implements VtdslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componenteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objetoSimpleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objetoNombreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atributoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tipoSimpleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tipoValorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listaIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listaStringEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see co.edu.uniandes.miso4202.ehicletax.vtdsl.VtdslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VtdslPackageImpl()
  {
    super(eNS_URI, VtdslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link VtdslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VtdslPackage init()
  {
    if (isInited) return (VtdslPackage)EPackage.Registry.INSTANCE.getEPackage(VtdslPackage.eNS_URI);

    // Obtain or create and register package
    VtdslPackageImpl theVtdslPackage = (VtdslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VtdslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VtdslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theVtdslPackage.createPackageContents();

    // Initialize created meta-data
    theVtdslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVtdslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VtdslPackage.eNS_URI, theVtdslPackage);
    return theVtdslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Componentes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponente()
  {
    return componenteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponente_Name()
  {
    return (EAttribute)componenteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponente_Componentes()
  {
    return (EReference)componenteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjetoSimple()
  {
    return objetoSimpleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjetoNombre()
  {
    return objetoNombreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjetoNombre_Descripcion()
  {
    return (EAttribute)objetoNombreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtributo()
  {
    return atributoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTipoSimple()
  {
    return tipoSimpleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTipoValor()
  {
    return tipoValorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLista()
  {
    return listaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListaInt()
  {
    return listaIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListaInt_Valores()
  {
    return (EAttribute)listaIntEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListaString()
  {
    return listaStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListaString_Valores()
  {
    return (EAttribute)listaStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VtdslFactory getVtdslFactory()
  {
    return (VtdslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__COMPONENTES);

    componenteEClass = createEClass(COMPONENTE);
    createEAttribute(componenteEClass, COMPONENTE__NAME);
    createEReference(componenteEClass, COMPONENTE__COMPONENTES);

    objetoSimpleEClass = createEClass(OBJETO_SIMPLE);

    objetoNombreEClass = createEClass(OBJETO_NOMBRE);
    createEAttribute(objetoNombreEClass, OBJETO_NOMBRE__DESCRIPCION);

    atributoEClass = createEClass(ATRIBUTO);

    tipoSimpleEClass = createEClass(TIPO_SIMPLE);

    tipoValorEClass = createEClass(TIPO_VALOR);

    listaEClass = createEClass(LISTA);

    listaIntEClass = createEClass(LISTA_INT);
    createEAttribute(listaIntEClass, LISTA_INT__VALORES);

    listaStringEClass = createEClass(LISTA_STRING);
    createEAttribute(listaStringEClass, LISTA_STRING__VALORES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    objetoSimpleEClass.getESuperTypes().add(this.getComponente());
    objetoNombreEClass.getESuperTypes().add(this.getComponente());
    tipoSimpleEClass.getESuperTypes().add(this.getAtributo());
    tipoValorEClass.getESuperTypes().add(this.getAtributo());
    listaEClass.getESuperTypes().add(this.getAtributo());
    listaIntEClass.getESuperTypes().add(this.getLista());
    listaStringEClass.getESuperTypes().add(this.getLista());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Componentes(), this.getComponente(), null, "componentes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componenteEClass, Componente.class, "Componente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponente_Name(), ecorePackage.getEString(), "name", null, 0, 1, Componente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponente_Componentes(), this.getComponente(), null, "componentes", null, 0, -1, Componente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objetoSimpleEClass, ObjetoSimple.class, "ObjetoSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objetoNombreEClass, ObjetoNombre.class, "ObjetoNombre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjetoNombre_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, ObjetoNombre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tipoSimpleEClass, TipoSimple.class, "TipoSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tipoValorEClass, TipoValor.class, "TipoValor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(listaEClass, Lista.class, "Lista", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(listaIntEClass, ListaInt.class, "ListaInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListaInt_Valores(), ecorePackage.getEInt(), "valores", null, 0, -1, ListaInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listaStringEClass, ListaString.class, "ListaString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListaString_Valores(), ecorePackage.getEString(), "valores", null, 0, -1, ListaString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //VtdslPackageImpl
