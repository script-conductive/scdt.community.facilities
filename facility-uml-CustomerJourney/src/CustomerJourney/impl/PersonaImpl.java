/**
 */
package CustomerJourney.impl;

import CustomerJourney.CustomerJourneyPackage;
import CustomerJourney.Persona;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Actor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CustomerJourney.impl.PersonaImpl#getBase_Actor <em>Base Actor</em>}</li>
 *   <li>{@link CustomerJourney.impl.PersonaImpl#getMinAge <em>Min Age</em>}</li>
 *   <li>{@link CustomerJourney.impl.PersonaImpl#getMaxAge <em>Max Age</em>}</li>
 *   <li>{@link CustomerJourney.impl.PersonaImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link CustomerJourney.impl.PersonaImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link CustomerJourney.impl.PersonaImpl#getImageUrl <em>Image Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaImpl extends MinimalEObjectImpl.Container implements Persona {
	/**
	 * The cached value of the '{@link #getBase_Actor() <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Actor()
	 * @generated
	 * @ordered
	 */
	protected Actor base_Actor;

	/**
	 * The default value of the '{@link #getMinAge() <em>Min Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAge()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinAge() <em>Min Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAge()
	 * @generated
	 * @ordered
	 */
	protected int minAge = MIN_AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAge() <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAge()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxAge() <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAge()
	 * @generated
	 * @ordered
	 */
	protected int maxAge = MAX_AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected String position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected String organization = ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String imageUrl = IMAGE_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomerJourneyPackage.Literals.PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor getBase_Actor() {
		if (base_Actor != null && base_Actor.eIsProxy()) {
			InternalEObject oldBase_Actor = (InternalEObject)base_Actor;
			base_Actor = (Actor)eResolveProxy(oldBase_Actor);
			if (base_Actor != oldBase_Actor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomerJourneyPackage.PERSONA__BASE_ACTOR, oldBase_Actor, base_Actor));
			}
		}
		return base_Actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetBase_Actor() {
		return base_Actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Actor(Actor newBase_Actor) {
		Actor oldBase_Actor = base_Actor;
		base_Actor = newBase_Actor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.PERSONA__BASE_ACTOR, oldBase_Actor, base_Actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinAge() {
		return minAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinAge(int newMinAge) {
		int oldMinAge = minAge;
		minAge = newMinAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.PERSONA__MIN_AGE, oldMinAge, minAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxAge() {
		return maxAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAge(int newMaxAge) {
		int oldMaxAge = maxAge;
		maxAge = newMaxAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.PERSONA__MAX_AGE, oldMaxAge, maxAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(String newPosition) {
		String oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.PERSONA__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganization(String newOrganization) {
		String oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.PERSONA__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageUrl(String newImageUrl) {
		String oldImageUrl = imageUrl;
		imageUrl = newImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.PERSONA__IMAGE_URL, oldImageUrl, imageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CustomerJourneyPackage.PERSONA__BASE_ACTOR:
				if (resolve) return getBase_Actor();
				return basicGetBase_Actor();
			case CustomerJourneyPackage.PERSONA__MIN_AGE:
				return getMinAge();
			case CustomerJourneyPackage.PERSONA__MAX_AGE:
				return getMaxAge();
			case CustomerJourneyPackage.PERSONA__POSITION:
				return getPosition();
			case CustomerJourneyPackage.PERSONA__ORGANIZATION:
				return getOrganization();
			case CustomerJourneyPackage.PERSONA__IMAGE_URL:
				return getImageUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CustomerJourneyPackage.PERSONA__BASE_ACTOR:
				setBase_Actor((Actor)newValue);
				return;
			case CustomerJourneyPackage.PERSONA__MIN_AGE:
				setMinAge((Integer)newValue);
				return;
			case CustomerJourneyPackage.PERSONA__MAX_AGE:
				setMaxAge((Integer)newValue);
				return;
			case CustomerJourneyPackage.PERSONA__POSITION:
				setPosition((String)newValue);
				return;
			case CustomerJourneyPackage.PERSONA__ORGANIZATION:
				setOrganization((String)newValue);
				return;
			case CustomerJourneyPackage.PERSONA__IMAGE_URL:
				setImageUrl((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CustomerJourneyPackage.PERSONA__BASE_ACTOR:
				setBase_Actor((Actor)null);
				return;
			case CustomerJourneyPackage.PERSONA__MIN_AGE:
				setMinAge(MIN_AGE_EDEFAULT);
				return;
			case CustomerJourneyPackage.PERSONA__MAX_AGE:
				setMaxAge(MAX_AGE_EDEFAULT);
				return;
			case CustomerJourneyPackage.PERSONA__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case CustomerJourneyPackage.PERSONA__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case CustomerJourneyPackage.PERSONA__IMAGE_URL:
				setImageUrl(IMAGE_URL_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CustomerJourneyPackage.PERSONA__BASE_ACTOR:
				return base_Actor != null;
			case CustomerJourneyPackage.PERSONA__MIN_AGE:
				return minAge != MIN_AGE_EDEFAULT;
			case CustomerJourneyPackage.PERSONA__MAX_AGE:
				return maxAge != MAX_AGE_EDEFAULT;
			case CustomerJourneyPackage.PERSONA__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case CustomerJourneyPackage.PERSONA__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
			case CustomerJourneyPackage.PERSONA__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? imageUrl != null : !IMAGE_URL_EDEFAULT.equals(imageUrl);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (minAge: ");
		result.append(minAge);
		result.append(", maxAge: ");
		result.append(maxAge);
		result.append(", position: ");
		result.append(position);
		result.append(", organization: ");
		result.append(organization);
		result.append(", imageUrl: ");
		result.append(imageUrl);
		result.append(')');
		return result.toString();
	}

} //PersonaImpl
