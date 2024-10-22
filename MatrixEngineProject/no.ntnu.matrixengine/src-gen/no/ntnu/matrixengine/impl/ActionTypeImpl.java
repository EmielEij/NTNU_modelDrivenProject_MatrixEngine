/**
 */
package no.ntnu.matrixengine.impl;

import no.ntnu.matrixengine.ActionType;
import no.ntnu.matrixengine.MatrixenginePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.impl.ActionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.ActionTypeImpl#getValidTiles <em>Valid Tiles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionTypeImpl extends MinimalEObjectImpl.Container implements ActionType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidTiles() <em>Valid Tiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTiles()
	 * @generated
	 * @ordered
	 */
	protected EList<?> validTiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixenginePackage.Literals.ACTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.ACTION_TYPE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<?> getValidTiles() {
		return validTiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidTiles(EList<?> newValidTiles) {
		EList<?> oldValidTiles = validTiles;
		validTiles = newValidTiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.ACTION_TYPE__VALID_TILES,
					oldValidTiles, validTiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MatrixenginePackage.ACTION_TYPE__NAME:
			return getName();
		case MatrixenginePackage.ACTION_TYPE__VALID_TILES:
			return getValidTiles();
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
		case MatrixenginePackage.ACTION_TYPE__NAME:
			setName((String) newValue);
			return;
		case MatrixenginePackage.ACTION_TYPE__VALID_TILES:
			setValidTiles((EList<?>) newValue);
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
		case MatrixenginePackage.ACTION_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MatrixenginePackage.ACTION_TYPE__VALID_TILES:
			setValidTiles((EList<?>) null);
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
		case MatrixenginePackage.ACTION_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MatrixenginePackage.ACTION_TYPE__VALID_TILES:
			return validTiles != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", validTiles: ");
		result.append(validTiles);
		result.append(')');
		return result.toString();
	}

} //ActionTypeImpl
