/**
 */
package CustomerJourney.impl;

import CustomerJourney.CustomerEmotionScore;
import CustomerJourney.CustomerJourneyFactory;
import CustomerJourney.CustomerJourneyPackage;
import CustomerJourney.Expectation;
import CustomerJourney.Persona;
import CustomerJourney.Priority;
import CustomerJourney.ResourceType;
import CustomerJourney.ServiceResource;
import CustomerJourney.Stage;
import CustomerJourney.Step;
import CustomerJourney.StepUsedTimeUnit;
import CustomerJourney.Touchpoint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerJourneyPackageImpl extends EPackageImpl implements CustomerJourneyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepUsedTimeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum customerEmotionScoreEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityEEnum = null;

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
	 * @see CustomerJourney.CustomerJourneyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CustomerJourneyPackageImpl() {
		super(eNS_URI, CustomerJourneyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CustomerJourneyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CustomerJourneyPackage init() {
		if (isInited) return (CustomerJourneyPackage)EPackage.Registry.INSTANCE.getEPackage(CustomerJourneyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCustomerJourneyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CustomerJourneyPackageImpl theCustomerJourneyPackage = registeredCustomerJourneyPackage instanceof CustomerJourneyPackageImpl ? (CustomerJourneyPackageImpl)registeredCustomerJourneyPackage : new CustomerJourneyPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCustomerJourneyPackage.createPackageContents();

		// Initialize created meta-data
		theCustomerJourneyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCustomerJourneyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CustomerJourneyPackage.eNS_URI, theCustomerJourneyPackage);
		return theCustomerJourneyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersona() {
		return personaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersona_Base_Actor() {
		return (EReference)personaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_MinAge() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_MaxAge() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Position() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Organization() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_ImageUrl() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTouchpoint() {
		return touchpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTouchpoint_Base_Class() {
		return (EReference)touchpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTouchpoint_ResourceType() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStage_Base_UseCase() {
		return (EReference)stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStage_ImageUrl() {
		return (EAttribute)stageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Base_UseCase() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_UsedTimeValue() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_UsedTimeUnit() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_CurrentEmotionText() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_CurrentEmotionScore() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_ImageUrl() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpectation() {
		return expectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpectation_Base_Actor() {
		return (EReference)expectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpectation_Priority() {
		return (EAttribute)expectationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceResource() {
		return serviceResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceResource_Base_Actor() {
		return (EReference)serviceResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceResource_ResourceType() {
		return (EAttribute)serviceResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourceType() {
		return resourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStepUsedTimeUnit() {
		return stepUsedTimeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCustomerEmotionScore() {
		return customerEmotionScoreEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPriority() {
		return priorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerJourneyFactory getCustomerJourneyFactory() {
		return (CustomerJourneyFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personaEClass = createEClass(PERSONA);
		createEReference(personaEClass, PERSONA__BASE_ACTOR);
		createEAttribute(personaEClass, PERSONA__MIN_AGE);
		createEAttribute(personaEClass, PERSONA__MAX_AGE);
		createEAttribute(personaEClass, PERSONA__POSITION);
		createEAttribute(personaEClass, PERSONA__ORGANIZATION);
		createEAttribute(personaEClass, PERSONA__IMAGE_URL);

		touchpointEClass = createEClass(TOUCHPOINT);
		createEReference(touchpointEClass, TOUCHPOINT__BASE_CLASS);
		createEAttribute(touchpointEClass, TOUCHPOINT__RESOURCE_TYPE);

		stageEClass = createEClass(STAGE);
		createEReference(stageEClass, STAGE__BASE_USE_CASE);
		createEAttribute(stageEClass, STAGE__IMAGE_URL);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__BASE_USE_CASE);
		createEAttribute(stepEClass, STEP__USED_TIME_VALUE);
		createEAttribute(stepEClass, STEP__USED_TIME_UNIT);
		createEAttribute(stepEClass, STEP__CURRENT_EMOTION_TEXT);
		createEAttribute(stepEClass, STEP__CURRENT_EMOTION_SCORE);
		createEAttribute(stepEClass, STEP__IMAGE_URL);

		expectationEClass = createEClass(EXPECTATION);
		createEReference(expectationEClass, EXPECTATION__BASE_ACTOR);
		createEAttribute(expectationEClass, EXPECTATION__PRIORITY);

		serviceResourceEClass = createEClass(SERVICE_RESOURCE);
		createEReference(serviceResourceEClass, SERVICE_RESOURCE__BASE_ACTOR);
		createEAttribute(serviceResourceEClass, SERVICE_RESOURCE__RESOURCE_TYPE);

		// Create enums
		resourceTypeEEnum = createEEnum(RESOURCE_TYPE);
		stepUsedTimeUnitEEnum = createEEnum(STEP_USED_TIME_UNIT);
		customerEmotionScoreEEnum = createEEnum(CUSTOMER_EMOTION_SCORE);
		priorityEEnum = createEEnum(PRIORITY);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersona_Base_Actor(), theUMLPackage.getActor(), null, "base_Actor", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersona_MinAge(), theTypesPackage.getInteger(), "minAge", null, 1, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersona_MaxAge(), theTypesPackage.getInteger(), "maxAge", null, 1, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersona_Position(), theTypesPackage.getString(), "position", null, 1, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersona_Organization(), theTypesPackage.getString(), "organization", null, 1, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersona_ImageUrl(), theTypesPackage.getString(), "imageUrl", null, 1, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(touchpointEClass, Touchpoint.class, "Touchpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTouchpoint_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTouchpoint_ResourceType(), this.getResourceType(), "resourceType", null, 1, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStage_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStage_ImageUrl(), theTypesPackage.getString(), "imageUrl", null, 1, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStep_UsedTimeValue(), theTypesPackage.getReal(), "usedTimeValue", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStep_UsedTimeUnit(), this.getStepUsedTimeUnit(), "usedTimeUnit", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStep_CurrentEmotionText(), theTypesPackage.getString(), "currentEmotionText", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStep_CurrentEmotionScore(), this.getCustomerEmotionScore(), "currentEmotionScore", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStep_ImageUrl(), theTypesPackage.getString(), "imageUrl", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expectationEClass, Expectation.class, "Expectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpectation_Base_Actor(), theUMLPackage.getActor(), null, "base_Actor", null, 0, 1, Expectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExpectation_Priority(), this.getPriority(), "priority", null, 1, 1, Expectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceResourceEClass, ServiceResource.class, "ServiceResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceResource_Base_Actor(), theUMLPackage.getActor(), null, "base_Actor", null, 0, 1, ServiceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceResource_ResourceType(), this.getResourceType(), "resourceType", null, 1, 1, ServiceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourceTypeEEnum, ResourceType.class, "ResourceType");
		addEEnumLiteral(resourceTypeEEnum, ResourceType.UNDEFINED);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SOFTWARE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.HARDWARE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.NETWORK);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PERSONNEL);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SITE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DATA);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROCESS);

		initEEnum(stepUsedTimeUnitEEnum, StepUsedTimeUnit.class, "StepUsedTimeUnit");
		addEEnumLiteral(stepUsedTimeUnitEEnum, StepUsedTimeUnit.SECOND);
		addEEnumLiteral(stepUsedTimeUnitEEnum, StepUsedTimeUnit.MINUTE);
		addEEnumLiteral(stepUsedTimeUnitEEnum, StepUsedTimeUnit.HOUR);
		addEEnumLiteral(stepUsedTimeUnitEEnum, StepUsedTimeUnit.DAY);
		addEEnumLiteral(stepUsedTimeUnitEEnum, StepUsedTimeUnit.WEEK);
		addEEnumLiteral(stepUsedTimeUnitEEnum, StepUsedTimeUnit.MONTH);
		addEEnumLiteral(stepUsedTimeUnitEEnum, StepUsedTimeUnit.YEAR);

		initEEnum(customerEmotionScoreEEnum, CustomerEmotionScore.class, "CustomerEmotionScore");
		addEEnumLiteral(customerEmotionScoreEEnum, CustomerEmotionScore.ONE);
		addEEnumLiteral(customerEmotionScoreEEnum, CustomerEmotionScore.TWO);
		addEEnumLiteral(customerEmotionScoreEEnum, CustomerEmotionScore.THREE);
		addEEnumLiteral(customerEmotionScoreEEnum, CustomerEmotionScore.FOUR);
		addEEnumLiteral(customerEmotionScoreEEnum, CustomerEmotionScore.FIVE);

		initEEnum(priorityEEnum, Priority.class, "Priority");
		addEEnumLiteral(priorityEEnum, Priority.UNDEFINED);
		addEEnumLiteral(priorityEEnum, Priority.LOW);
		addEEnumLiteral(priorityEEnum, Priority.MEDIUM);
		addEEnumLiteral(priorityEEnum, Priority.HIGH);

		// Create resource
		createResource(eNS_URI);
	}

} //CustomerJourneyPackageImpl
