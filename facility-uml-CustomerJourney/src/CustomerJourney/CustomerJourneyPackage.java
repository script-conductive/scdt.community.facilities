/**
 */
package CustomerJourney;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CustomerJourney.CustomerJourneyFactory
 * @model kind="package"
 * @generated
 */
public interface CustomerJourneyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CustomerJourney";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://CustomerJourney";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CustomerJourney";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomerJourneyPackage eINSTANCE = CustomerJourney.impl.CustomerJourneyPackageImpl.init();

	/**
	 * The meta object id for the '{@link CustomerJourney.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CustomerJourney.impl.PersonaImpl
	 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 0;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__BASE_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Min Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__MIN_AGE = 1;

	/**
	 * The feature id for the '<em><b>Max Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__MAX_AGE = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__POSITION = 3;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ORGANIZATION = 4;

	/**
	 * The feature id for the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__IMAGE_URL = 5;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CustomerJourney.impl.TouchpointImpl <em>Touchpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CustomerJourney.impl.TouchpointImpl
	 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getTouchpoint()
	 * @generated
	 */
	int TOUCHPOINT = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__RESOURCE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CustomerJourney.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CustomerJourney.impl.StageImpl
	 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 2;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__BASE_USE_CASE = 0;

	/**
	 * The feature id for the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__IMAGE_URL = 1;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CustomerJourney.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CustomerJourney.impl.StepImpl
	 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 3;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__BASE_USE_CASE = 0;

	/**
	 * The feature id for the '<em><b>Used Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__USED_TIME_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Used Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__USED_TIME_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Current Emotion Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CURRENT_EMOTION_TEXT = 3;

	/**
	 * The feature id for the '<em><b>Current Emotion Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CURRENT_EMOTION_SCORE = 4;

	/**
	 * The feature id for the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IMAGE_URL = 5;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CustomerJourney.impl.ExpectationImpl <em>Expectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CustomerJourney.impl.ExpectationImpl
	 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getExpectation()
	 * @generated
	 */
	int EXPECTATION = 4;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__BASE_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__PRIORITY = 1;

	/**
	 * The number of structural features of the '<em>Expectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CustomerJourney.impl.ServiceResourceImpl <em>Service Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CustomerJourney.impl.ServiceResourceImpl
	 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getServiceResource()
	 * @generated
	 */
	int SERVICE_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE__BASE_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE__RESOURCE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Service Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CustomerJourney.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CustomerJourney.ResourceType
	 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 6;

	/**
	 * The meta object id for the '{@link CustomerJourney.StepUsedTimeUnit <em>Step Used Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CustomerJourney.StepUsedTimeUnit
	 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getStepUsedTimeUnit()
	 * @generated
	 */
	int STEP_USED_TIME_UNIT = 7;

	/**
	 * The meta object id for the '{@link CustomerJourney.CustomerEmotionScore <em>Customer Emotion Score</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CustomerJourney.CustomerEmotionScore
	 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getCustomerEmotionScore()
	 * @generated
	 */
	int CUSTOMER_EMOTION_SCORE = 8;

	/**
	 * The meta object id for the '{@link CustomerJourney.Priority <em>Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CustomerJourney.Priority
	 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 9;


	/**
	 * Returns the meta object for class '{@link CustomerJourney.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see CustomerJourney.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the reference '{@link CustomerJourney.Persona#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see CustomerJourney.Persona#getBase_Actor()
	 * @see #getPersona()
	 * @generated
	 */
	EReference getPersona_Base_Actor();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Persona#getMinAge <em>Min Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Age</em>'.
	 * @see CustomerJourney.Persona#getMinAge()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_MinAge();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Persona#getMaxAge <em>Max Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Age</em>'.
	 * @see CustomerJourney.Persona#getMaxAge()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_MaxAge();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Persona#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see CustomerJourney.Persona#getPosition()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Position();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Persona#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see CustomerJourney.Persona#getOrganization()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Organization();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Persona#getImageUrl <em>Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Url</em>'.
	 * @see CustomerJourney.Persona#getImageUrl()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_ImageUrl();

	/**
	 * Returns the meta object for class '{@link CustomerJourney.Touchpoint <em>Touchpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touchpoint</em>'.
	 * @see CustomerJourney.Touchpoint
	 * @generated
	 */
	EClass getTouchpoint();

	/**
	 * Returns the meta object for the reference '{@link CustomerJourney.Touchpoint#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see CustomerJourney.Touchpoint#getBase_Class()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EReference getTouchpoint_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Touchpoint#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see CustomerJourney.Touchpoint#getResourceType()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_ResourceType();

	/**
	 * Returns the meta object for class '{@link CustomerJourney.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see CustomerJourney.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the reference '{@link CustomerJourney.Stage#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see CustomerJourney.Stage#getBase_UseCase()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Base_UseCase();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Stage#getImageUrl <em>Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Url</em>'.
	 * @see CustomerJourney.Stage#getImageUrl()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_ImageUrl();

	/**
	 * Returns the meta object for class '{@link CustomerJourney.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see CustomerJourney.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link CustomerJourney.Step#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see CustomerJourney.Step#getBase_UseCase()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Base_UseCase();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Step#getUsedTimeValue <em>Used Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used Time Value</em>'.
	 * @see CustomerJourney.Step#getUsedTimeValue()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_UsedTimeValue();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Step#getUsedTimeUnit <em>Used Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used Time Unit</em>'.
	 * @see CustomerJourney.Step#getUsedTimeUnit()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_UsedTimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Step#getCurrentEmotionText <em>Current Emotion Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Emotion Text</em>'.
	 * @see CustomerJourney.Step#getCurrentEmotionText()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_CurrentEmotionText();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Step#getCurrentEmotionScore <em>Current Emotion Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Emotion Score</em>'.
	 * @see CustomerJourney.Step#getCurrentEmotionScore()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_CurrentEmotionScore();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Step#getImageUrl <em>Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Url</em>'.
	 * @see CustomerJourney.Step#getImageUrl()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_ImageUrl();

	/**
	 * Returns the meta object for class '{@link CustomerJourney.Expectation <em>Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expectation</em>'.
	 * @see CustomerJourney.Expectation
	 * @generated
	 */
	EClass getExpectation();

	/**
	 * Returns the meta object for the reference '{@link CustomerJourney.Expectation#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see CustomerJourney.Expectation#getBase_Actor()
	 * @see #getExpectation()
	 * @generated
	 */
	EReference getExpectation_Base_Actor();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.Expectation#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see CustomerJourney.Expectation#getPriority()
	 * @see #getExpectation()
	 * @generated
	 */
	EAttribute getExpectation_Priority();

	/**
	 * Returns the meta object for class '{@link CustomerJourney.ServiceResource <em>Service Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Resource</em>'.
	 * @see CustomerJourney.ServiceResource
	 * @generated
	 */
	EClass getServiceResource();

	/**
	 * Returns the meta object for the reference '{@link CustomerJourney.ServiceResource#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see CustomerJourney.ServiceResource#getBase_Actor()
	 * @see #getServiceResource()
	 * @generated
	 */
	EReference getServiceResource_Base_Actor();

	/**
	 * Returns the meta object for the attribute '{@link CustomerJourney.ServiceResource#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see CustomerJourney.ServiceResource#getResourceType()
	 * @see #getServiceResource()
	 * @generated
	 */
	EAttribute getServiceResource_ResourceType();

	/**
	 * Returns the meta object for enum '{@link CustomerJourney.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see CustomerJourney.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the meta object for enum '{@link CustomerJourney.StepUsedTimeUnit <em>Step Used Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Step Used Time Unit</em>'.
	 * @see CustomerJourney.StepUsedTimeUnit
	 * @generated
	 */
	EEnum getStepUsedTimeUnit();

	/**
	 * Returns the meta object for enum '{@link CustomerJourney.CustomerEmotionScore <em>Customer Emotion Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Customer Emotion Score</em>'.
	 * @see CustomerJourney.CustomerEmotionScore
	 * @generated
	 */
	EEnum getCustomerEmotionScore();

	/**
	 * Returns the meta object for enum '{@link CustomerJourney.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority</em>'.
	 * @see CustomerJourney.Priority
	 * @generated
	 */
	EEnum getPriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CustomerJourneyFactory getCustomerJourneyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CustomerJourney.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CustomerJourney.impl.PersonaImpl
		 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONA__BASE_ACTOR = eINSTANCE.getPersona_Base_Actor();

		/**
		 * The meta object literal for the '<em><b>Min Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__MIN_AGE = eINSTANCE.getPersona_MinAge();

		/**
		 * The meta object literal for the '<em><b>Max Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__MAX_AGE = eINSTANCE.getPersona_MaxAge();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__POSITION = eINSTANCE.getPersona_Position();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__ORGANIZATION = eINSTANCE.getPersona_Organization();

		/**
		 * The meta object literal for the '<em><b>Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__IMAGE_URL = eINSTANCE.getPersona_ImageUrl();

		/**
		 * The meta object literal for the '{@link CustomerJourney.impl.TouchpointImpl <em>Touchpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CustomerJourney.impl.TouchpointImpl
		 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getTouchpoint()
		 * @generated
		 */
		EClass TOUCHPOINT = eINSTANCE.getTouchpoint();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCHPOINT__BASE_CLASS = eINSTANCE.getTouchpoint_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__RESOURCE_TYPE = eINSTANCE.getTouchpoint_ResourceType();

		/**
		 * The meta object literal for the '{@link CustomerJourney.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CustomerJourney.impl.StageImpl
		 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__BASE_USE_CASE = eINSTANCE.getStage_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__IMAGE_URL = eINSTANCE.getStage_ImageUrl();

		/**
		 * The meta object literal for the '{@link CustomerJourney.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CustomerJourney.impl.StepImpl
		 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__BASE_USE_CASE = eINSTANCE.getStep_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Used Time Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__USED_TIME_VALUE = eINSTANCE.getStep_UsedTimeValue();

		/**
		 * The meta object literal for the '<em><b>Used Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__USED_TIME_UNIT = eINSTANCE.getStep_UsedTimeUnit();

		/**
		 * The meta object literal for the '<em><b>Current Emotion Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__CURRENT_EMOTION_TEXT = eINSTANCE.getStep_CurrentEmotionText();

		/**
		 * The meta object literal for the '<em><b>Current Emotion Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__CURRENT_EMOTION_SCORE = eINSTANCE.getStep_CurrentEmotionScore();

		/**
		 * The meta object literal for the '<em><b>Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__IMAGE_URL = eINSTANCE.getStep_ImageUrl();

		/**
		 * The meta object literal for the '{@link CustomerJourney.impl.ExpectationImpl <em>Expectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CustomerJourney.impl.ExpectationImpl
		 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getExpectation()
		 * @generated
		 */
		EClass EXPECTATION = eINSTANCE.getExpectation();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPECTATION__BASE_ACTOR = eINSTANCE.getExpectation_Base_Actor();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTATION__PRIORITY = eINSTANCE.getExpectation_Priority();

		/**
		 * The meta object literal for the '{@link CustomerJourney.impl.ServiceResourceImpl <em>Service Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CustomerJourney.impl.ServiceResourceImpl
		 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getServiceResource()
		 * @generated
		 */
		EClass SERVICE_RESOURCE = eINSTANCE.getServiceResource();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_RESOURCE__BASE_ACTOR = eINSTANCE.getServiceResource_Base_Actor();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_RESOURCE__RESOURCE_TYPE = eINSTANCE.getServiceResource_ResourceType();

		/**
		 * The meta object literal for the '{@link CustomerJourney.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CustomerJourney.ResourceType
		 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '{@link CustomerJourney.StepUsedTimeUnit <em>Step Used Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CustomerJourney.StepUsedTimeUnit
		 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getStepUsedTimeUnit()
		 * @generated
		 */
		EEnum STEP_USED_TIME_UNIT = eINSTANCE.getStepUsedTimeUnit();

		/**
		 * The meta object literal for the '{@link CustomerJourney.CustomerEmotionScore <em>Customer Emotion Score</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CustomerJourney.CustomerEmotionScore
		 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getCustomerEmotionScore()
		 * @generated
		 */
		EEnum CUSTOMER_EMOTION_SCORE = eINSTANCE.getCustomerEmotionScore();

		/**
		 * The meta object literal for the '{@link CustomerJourney.Priority <em>Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CustomerJourney.Priority
		 * @see CustomerJourney.impl.CustomerJourneyPackageImpl#getPriority()
		 * @generated
		 */
		EEnum PRIORITY = eINSTANCE.getPriority();

	}

} //CustomerJourneyPackage
