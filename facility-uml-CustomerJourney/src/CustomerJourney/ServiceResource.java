/**
 */
package CustomerJourney;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CustomerJourney.ServiceResource#getBase_Actor <em>Base Actor</em>}</li>
 *   <li>{@link CustomerJourney.ServiceResource#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 *
 * @see CustomerJourney.CustomerJourneyPackage#getServiceResource()
 * @model
 * @generated
 */
public interface ServiceResource extends EObject {
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
	 * @see CustomerJourney.CustomerJourneyPackage#getServiceResource_Base_Actor()
	 * @model ordered="false"
	 * @generated
	 */
	Actor getBase_Actor();

	/**
	 * Sets the value of the '{@link CustomerJourney.ServiceResource#getBase_Actor <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Actor</em>' reference.
	 * @see #getBase_Actor()
	 * @generated
	 */
	void setBase_Actor(Actor value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CustomerJourney.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see CustomerJourney.ResourceType
	 * @see #setResourceType(ResourceType)
	 * @see CustomerJourney.CustomerJourneyPackage#getServiceResource_ResourceType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceType getResourceType();

	/**
	 * Sets the value of the '{@link CustomerJourney.ServiceResource#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see CustomerJourney.ResourceType
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(ResourceType value);

} // ServiceResource
