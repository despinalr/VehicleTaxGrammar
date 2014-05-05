/**
 */
package co.edu.uniandes.miso4202.ehicletax.vtdsl.impl;

import co.edu.uniandes.miso4202.ehicletax.vtdsl.Atributo;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoNormal;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.AtributoObjeto;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Contenido;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Lista;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaInteger;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ListaString;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Modelo;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.Objeto;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributo;
import co.edu.uniandes.miso4202.ehicletax.vtdsl.ValorAtributoValor;
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
  private EClass modeloEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atributoNormalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atributoObjetoEClass = null;

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
  private EClass valorAtributoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contenidoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valorAtributoValorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listaIntegerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listaStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listaEClass = null;

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
  public EClass getModelo()
  {
    return modeloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelo_Objetos()
  {
    return (EReference)modeloEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjeto()
  {
    return objetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjeto_Name()
  {
    return (EAttribute)objetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjeto_Descripcion()
  {
    return (EAttribute)objetoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjeto_Atributos()
  {
    return (EReference)objetoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtributoNormal()
  {
    return atributoNormalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributoNormal_Nombre()
  {
    return (EAttribute)atributoNormalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtributoNormal_Valor()
  {
    return (EReference)atributoNormalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtributoObjeto()
  {
    return atributoObjetoEClass;
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
  public EClass getValorAtributo()
  {
    return valorAtributoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContenido()
  {
    return contenidoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValorAtributoValor()
  {
    return valorAtributoValorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListaInteger()
  {
    return listaIntegerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListaInteger_Valores()
  {
    return (EAttribute)listaIntegerEClass.getEStructuralFeatures().get(0);
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
  public EClass getLista()
  {
    return listaEClass;
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
    modeloEClass = createEClass(MODELO);
    createEReference(modeloEClass, MODELO__OBJETOS);

    objetoEClass = createEClass(OBJETO);
    createEAttribute(objetoEClass, OBJETO__NAME);
    createEAttribute(objetoEClass, OBJETO__DESCRIPCION);
    createEReference(objetoEClass, OBJETO__ATRIBUTOS);

    atributoNormalEClass = createEClass(ATRIBUTO_NORMAL);
    createEAttribute(atributoNormalEClass, ATRIBUTO_NORMAL__NOMBRE);
    createEReference(atributoNormalEClass, ATRIBUTO_NORMAL__VALOR);

    atributoObjetoEClass = createEClass(ATRIBUTO_OBJETO);

    atributoEClass = createEClass(ATRIBUTO);

    valorAtributoEClass = createEClass(VALOR_ATRIBUTO);

    contenidoEClass = createEClass(CONTENIDO);

    valorAtributoValorEClass = createEClass(VALOR_ATRIBUTO_VALOR);

    listaIntegerEClass = createEClass(LISTA_INTEGER);
    createEAttribute(listaIntegerEClass, LISTA_INTEGER__VALORES);

    listaStringEClass = createEClass(LISTA_STRING);
    createEAttribute(listaStringEClass, LISTA_STRING__VALORES);

    listaEClass = createEClass(LISTA);
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
    objetoEClass.getESuperTypes().add(this.getAtributoObjeto());
    atributoNormalEClass.getESuperTypes().add(this.getAtributo());
    atributoObjetoEClass.getESuperTypes().add(this.getAtributo());
    atributoEClass.getESuperTypes().add(this.getContenido());
    listaIntegerEClass.getESuperTypes().add(this.getLista());
    listaStringEClass.getESuperTypes().add(this.getLista());

    // Initialize classes and features; add operations and parameters
    initEClass(modeloEClass, Modelo.class, "Modelo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelo_Objetos(), this.getObjeto(), null, "objetos", null, 0, -1, Modelo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objetoEClass, Objeto.class, "Objeto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjeto_Name(), ecorePackage.getEString(), "name", null, 0, 1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjeto_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjeto_Atributos(), this.getAtributo(), null, "atributos", null, 0, -1, Objeto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atributoNormalEClass, AtributoNormal.class, "AtributoNormal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtributoNormal_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, AtributoNormal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtributoNormal_Valor(), ecorePackage.getEObject(), null, "valor", null, 0, 1, AtributoNormal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atributoObjetoEClass, AtributoObjeto.class, "AtributoObjeto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valorAtributoEClass, ValorAtributo.class, "ValorAtributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(contenidoEClass, Contenido.class, "Contenido", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valorAtributoValorEClass, ValorAtributoValor.class, "ValorAtributoValor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(listaIntegerEClass, ListaInteger.class, "ListaInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListaInteger_Valores(), ecorePackage.getEInt(), "valores", null, 0, -1, ListaInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listaStringEClass, ListaString.class, "ListaString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListaString_Valores(), ecorePackage.getEString(), "valores", null, 0, -1, ListaString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listaEClass, Lista.class, "Lista", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //VtdslPackageImpl
