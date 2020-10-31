/**
 */
package CustomerJourney;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CustomerJourney.Touchpoint#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link CustomerJourney.Touchpoint#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 *
 * @see CustomerJourney.CustomerJourneyPackage#getTouchpoint()
 * @model
 * @generated
 */
public interface Touchpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see CustomerJourney.CustomerJourneyPackage#getTouchpoint_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link CustomerJourney.Touchpoint#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

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
	 * @see CustomerJourney.CustomerJourneyPackage#getTouchpoint_ResourceType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceType getResourceType();

	/**
	 * Sets the value of the '{@link CustomerJourney.Touchpoint#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see CustomerJourney.ResourceType
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(ResourceType value);

} // Touchpoint
