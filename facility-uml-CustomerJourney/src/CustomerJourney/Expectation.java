/**
 */
package CustomerJourney;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CustomerJourney.Expectation#getBase_Actor <em>Base Actor</em>}</li>
 *   <li>{@link CustomerJourney.Expectation#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see CustomerJourney.CustomerJourneyPackage#getExpectation()
 * @model
 * @generated
 */
public interface Expectation extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Actor</em>' reference.
	 * @see #setBase_Actor(Actor)
	 * @see CustomerJourney.CustomerJourneyPackage#getExpectation_Base_Actor()
	 * @model ordered="false"
	 * @generated
	 */
	Actor getBase_Actor();

	/**
	 * Sets the value of the '{@link CustomerJourney.Expectation#getBase_Actor <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Actor</em>' reference.
	 * @see #getBase_Actor()
	 * @generated
	 */
	void setBase_Actor(Actor value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link CustomerJourney.Priority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see CustomerJourney.Priority
	 * @see #setPriority(Priority)
	 * @see CustomerJourney.CustomerJourneyPackage#getExpectation_Priority()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link CustomerJourney.Expectation#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see CustomerJourney.Priority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

} // Expectation
