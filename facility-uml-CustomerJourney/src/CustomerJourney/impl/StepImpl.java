/**
 */
package CustomerJourney.impl;

import CustomerJourney.CustomerEmotionScore;
import CustomerJourney.CustomerJourneyPackage;
import CustomerJourney.Step;
import CustomerJourney.StepUsedTimeUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CustomerJourney.impl.StepImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link CustomerJourney.impl.StepImpl#getUsedTimeValue <em>Used Time Value</em>}</li>
 *   <li>{@link CustomerJourney.impl.StepImpl#getUsedTimeUnit <em>Used Time Unit</em>}</li>
 *   <li>{@link CustomerJourney.impl.StepImpl#getCurrentEmotionText <em>Current Emotion Text</em>}</li>
 *   <li>{@link CustomerJourney.impl.StepImpl#getCurrentEmotionScore <em>Current Emotion Score</em>}</li>
 *   <li>{@link CustomerJourney.impl.StepImpl#getImageUrl <em>Image Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
	/**
	 * The cached value of the '{@link #getBase_UseCase() <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_UseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase base_UseCase;

	/**
	 * The default value of the '{@link #getUsedTimeValue() <em>Used Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedTimeValue()
	 * @generated
	 * @ordered
	 */
	protected static final double USED_TIME_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUsedTimeValue() <em>Used Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedTimeValue()
	 * @generated
	 * @ordered
	 */
	protected double usedTimeValue = USED_TIME_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsedTimeUnit() <em>Used Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final StepUsedTimeUnit USED_TIME_UNIT_EDEFAULT = StepUsedTimeUnit.SECOND;

	/**
	 * The cached value of the '{@link #getUsedTimeUnit() <em>Used Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected StepUsedTimeUnit usedTimeUnit = USED_TIME_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentEmotionText() <em>Current Emotion Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentEmotionText()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_EMOTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentEmotionText() <em>Current Emotion Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentEmotionText()
	 * @generated
	 * @ordered
	 */
	protected String currentEmotionText = CURRENT_EMOTION_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentEmotionScore() <em>Current Emotion Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentEmotionScore()
	 * @generated
	 * @ordered
	 */
	protected static final CustomerEmotionScore CURRENT_EMOTION_SCORE_EDEFAULT = CustomerEmotionScore.ONE;

	/**
	 * The cached value of the '{@link #getCurrentEmotionScore() <em>Current Emotion Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentEmotionScore()
	 * @generated
	 * @ordered
	 */
	protected CustomerEmotionScore currentEmotionScore = CURRENT_EMOTION_SCORE_EDEFAULT;

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
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomerJourneyPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseCase getBase_UseCase() {
		if (base_UseCase != null && base_UseCase.eIsProxy()) {
			InternalEObject oldBase_UseCase = (InternalEObject)base_UseCase;
			base_UseCase = (UseCase)eResolveProxy(oldBase_UseCase);
			if (base_UseCase != oldBase_UseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomerJourneyPackage.STEP__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
			}
		}
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetBase_UseCase() {
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_UseCase(UseCase newBase_UseCase) {
		UseCase oldBase_UseCase = base_UseCase;
		base_UseCase = newBase_UseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.STEP__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUsedTimeValue() {
		return usedTimeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedTimeValue(double newUsedTimeValue) {
		double oldUsedTimeValue = usedTimeValue;
		usedTimeValue = newUsedTimeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.STEP__USED_TIME_VALUE, oldUsedTimeValue, usedTimeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepUsedTimeUnit getUsedTimeUnit() {
		return usedTimeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedTimeUnit(StepUsedTimeUnit newUsedTimeUnit) {
		StepUsedTimeUnit oldUsedTimeUnit = usedTimeUnit;
		usedTimeUnit = newUsedTimeUnit == null ? USED_TIME_UNIT_EDEFAULT : newUsedTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.STEP__USED_TIME_UNIT, oldUsedTimeUnit, usedTimeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentEmotionText() {
		return currentEmotionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentEmotionText(String newCurrentEmotionText) {
		String oldCurrentEmotionText = currentEmotionText;
		currentEmotionText = newCurrentEmotionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.STEP__CURRENT_EMOTION_TEXT, oldCurrentEmotionText, currentEmotionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerEmotionScore getCurrentEmotionScore() {
		return currentEmotionScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentEmotionScore(CustomerEmotionScore newCurrentEmotionScore) {
		CustomerEmotionScore oldCurrentEmotionScore = currentEmotionScore;
		currentEmotionScore = newCurrentEmotionScore == null ? CURRENT_EMOTION_SCORE_EDEFAULT : newCurrentEmotionScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.STEP__CURRENT_EMOTION_SCORE, oldCurrentEmotionScore, currentEmotionScore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerJourneyPackage.STEP__IMAGE_URL, oldImageUrl, imageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CustomerJourneyPackage.STEP__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case CustomerJourneyPackage.STEP__USED_TIME_VALUE:
				return getUsedTimeValue();
			case CustomerJourneyPackage.STEP__USED_TIME_UNIT:
				return getUsedTimeUnit();
			case CustomerJourneyPackage.STEP__CURRENT_EMOTION_TEXT:
				return getCurrentEmotionText();
			case CustomerJourneyPackage.STEP__CURRENT_EMOTION_SCORE:
				return getCurrentEmotionScore();
			case CustomerJourneyPackage.STEP__IMAGE_URL:
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
			case CustomerJourneyPackage.STEP__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case CustomerJourneyPackage.STEP__USED_TIME_VALUE:
				setUsedTimeValue((Double)newValue);
				return;
			case CustomerJourneyPackage.STEP__USED_TIME_UNIT:
				setUsedTimeUnit((StepUsedTimeUnit)newValue);
				return;
			case CustomerJourneyPackage.STEP__CURRENT_EMOTION_TEXT:
				setCurrentEmotionText((String)newValue);
				return;
			case CustomerJourneyPackage.STEP__CURRENT_EMOTION_SCORE:
				setCurrentEmotionScore((CustomerEmotionScore)newValue);
				return;
			case CustomerJourneyPackage.STEP__IMAGE_URL:
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
			case CustomerJourneyPackage.STEP__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case CustomerJourneyPackage.STEP__USED_TIME_VALUE:
				setUsedTimeValue(USED_TIME_VALUE_EDEFAULT);
				return;
			case CustomerJourneyPackage.STEP__USED_TIME_UNIT:
				setUsedTimeUnit(USED_TIME_UNIT_EDEFAULT);
				return;
			case CustomerJourneyPackage.STEP__CURRENT_EMOTION_TEXT:
				setCurrentEmotionText(CURRENT_EMOTION_TEXT_EDEFAULT);
				return;
			case CustomerJourneyPackage.STEP__CURRENT_EMOTION_SCORE:
				setCurrentEmotionScore(CURRENT_EMOTION_SCORE_EDEFAULT);
				return;
			case CustomerJourneyPackage.STEP__IMAGE_URL:
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
			case CustomerJourneyPackage.STEP__BASE_USE_CASE:
				return base_UseCase != null;
			case CustomerJourneyPackage.STEP__USED_TIME_VALUE:
				return usedTimeValue != USED_TIME_VALUE_EDEFAULT;
			case CustomerJourneyPackage.STEP__USED_TIME_UNIT:
				return usedTimeUnit != USED_TIME_UNIT_EDEFAULT;
			case CustomerJourneyPackage.STEP__CURRENT_EMOTION_TEXT:
				return CURRENT_EMOTION_TEXT_EDEFAULT == null ? currentEmotionText != null : !CURRENT_EMOTION_TEXT_EDEFAULT.equals(currentEmotionText);
			case CustomerJourneyPackage.STEP__CURRENT_EMOTION_SCORE:
				return currentEmotionScore != CURRENT_EMOTION_SCORE_EDEFAULT;
			case CustomerJourneyPackage.STEP__IMAGE_URL:
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
		result.append(" (usedTimeValue: ");
		result.append(usedTimeValue);
		result.append(", usedTimeUnit: ");
		result.append(usedTimeUnit);
		result.append(", currentEmotionText: ");
		result.append(currentEmotionText);
		result.append(", currentEmotionScore: ");
		result.append(currentEmotionScore);
		result.append(", imageUrl: ");
		result.append(imageUrl);
		result.append(')');
		return result.toString();
	}

} //StepImpl
