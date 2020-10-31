/**
 */
package CustomerJourney;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CustomerJourney.Step#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link CustomerJourney.Step#getUsedTimeValue <em>Used Time Value</em>}</li>
 *   <li>{@link CustomerJourney.Step#getUsedTimeUnit <em>Used Time Unit</em>}</li>
 *   <li>{@link CustomerJourney.Step#getCurrentEmotionText <em>Current Emotion Text</em>}</li>
 *   <li>{@link CustomerJourney.Step#getCurrentEmotionScore <em>Current Emotion Score</em>}</li>
 *   <li>{@link CustomerJourney.Step#getImageUrl <em>Image Url</em>}</li>
 * </ul>
 *
 * @see CustomerJourney.CustomerJourneyPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Use Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see CustomerJourney.CustomerJourneyPackage#getStep_Base_UseCase()
	 * @model ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link CustomerJourney.Step#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Used Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Time Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Time Value</em>' attribute.
	 * @see #setUsedTimeValue(double)
	 * @see CustomerJourney.CustomerJourneyPackage#getStep_UsedTimeValue()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getUsedTimeValue();

	/**
	 * Sets the value of the '{@link CustomerJourney.Step#getUsedTimeValue <em>Used Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Time Value</em>' attribute.
	 * @see #getUsedTimeValue()
	 * @generated
	 */
	void setUsedTimeValue(double value);

	/**
	 * Returns the value of the '<em><b>Used Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CustomerJourney.StepUsedTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Time Unit</em>' attribute.
	 * @see CustomerJourney.StepUsedTimeUnit
	 * @see #setUsedTimeUnit(StepUsedTimeUnit)
	 * @see CustomerJourney.CustomerJourneyPackage#getStep_UsedTimeUnit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StepUsedTimeUnit getUsedTimeUnit();

	/**
	 * Sets the value of the '{@link CustomerJourney.Step#getUsedTimeUnit <em>Used Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Time Unit</em>' attribute.
	 * @see CustomerJourney.StepUsedTimeUnit
	 * @see #getUsedTimeUnit()
	 * @generated
	 */
	void setUsedTimeUnit(StepUsedTimeUnit value);

	/**
	 * Returns the value of the '<em><b>Current Emotion Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Emotion Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Emotion Text</em>' attribute.
	 * @see #setCurrentEmotionText(String)
	 * @see CustomerJourney.CustomerJourneyPackage#getStep_CurrentEmotionText()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCurrentEmotionText();

	/**
	 * Sets the value of the '{@link CustomerJourney.Step#getCurrentEmotionText <em>Current Emotion Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Emotion Text</em>' attribute.
	 * @see #getCurrentEmotionText()
	 * @generated
	 */
	void setCurrentEmotionText(String value);

	/**
	 * Returns the value of the '<em><b>Current Emotion Score</b></em>' attribute.
	 * The literals are from the enumeration {@link CustomerJourney.CustomerEmotionScore}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Emotion Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Emotion Score</em>' attribute.
	 * @see CustomerJourney.CustomerEmotionScore
	 * @see #setCurrentEmotionScore(CustomerEmotionScore)
	 * @see CustomerJourney.CustomerJourneyPackage#getStep_CurrentEmotionScore()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CustomerEmotionScore getCurrentEmotionScore();

	/**
	 * Sets the value of the '{@link CustomerJourney.Step#getCurrentEmotionScore <em>Current Emotion Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Emotion Score</em>' attribute.
	 * @see CustomerJourney.CustomerEmotionScore
	 * @see #getCurrentEmotionScore()
	 * @generated
	 */
	void setCurrentEmotionScore(CustomerEmotionScore value);

	/**
	 * Returns the value of the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Url</em>' attribute.
	 * @see #setImageUrl(String)
	 * @see CustomerJourney.CustomerJourneyPackage#getStep_ImageUrl()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getImageUrl();

	/**
	 * Sets the value of the '{@link CustomerJourney.Step#getImageUrl <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Url</em>' attribute.
	 * @see #getImageUrl()
	 * @generated
	 */
	void setImageUrl(String value);

} // Step
