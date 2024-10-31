/**
 */
package no.ntnu.tdt4250.matrixgame.game.impl;

import java.lang.reflect.InvocationTargetException;

import no.ntnu.tdt4250.matrixgame.game.Action;
import no.ntnu.tdt4250.matrixgame.game.ActionType;
import no.ntnu.tdt4250.matrixgame.game.GamePackage;

import no.ntnu.tdt4250.matrixgame.game.State;
import no.ntnu.tdt4250.matrixgame.game.Tile;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.ActionImpl#getActionType <em>Action Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.ActionImpl#getChange_Accessbility <em>Change Accessbility</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.ActionImpl#getChange_State <em>Change State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
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
	 * The default value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType ACTION_TYPE_EDEFAULT = ActionType.NONE;

	/**
	 * The cached value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected ActionType actionType = ACTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChange_Accessbility() <em>Change Accessbility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange_Accessbility()
	 * @generated
	 * @ordered
	 */
	protected Tile change_Accessbility;

	/**
	 * The cached value of the '{@link #getChange_State() <em>Change State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange_State()
	 * @generated
	 * @ordered
	 */
	protected State change_State;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionType getActionType() {
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionType(ActionType newActionType) {
		ActionType oldActionType = actionType;
		actionType = newActionType == null ? ACTION_TYPE_EDEFAULT : newActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.ACTION__ACTION_TYPE, oldActionType,
					actionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tile getChange_Accessbility() {
		if (change_Accessbility != null && change_Accessbility.eIsProxy()) {
			InternalEObject oldChange_Accessbility = (InternalEObject) change_Accessbility;
			change_Accessbility = (Tile) eResolveProxy(oldChange_Accessbility);
			if (change_Accessbility != oldChange_Accessbility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.ACTION__CHANGE_ACCESSBILITY,
							oldChange_Accessbility, change_Accessbility));
			}
		}
		return change_Accessbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetChange_Accessbility() {
		return change_Accessbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getChange_State() {
		if (change_State != null && change_State.eIsProxy()) {
			InternalEObject oldChange_State = (InternalEObject) change_State;
			change_State = (State) eResolveProxy(oldChange_State);
			if (change_State != oldChange_State) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.ACTION__CHANGE_STATE,
							oldChange_State, change_State));
			}
		}
		return change_State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetChange_State() {
		return change_State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void performAction() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GamePackage.ACTION__NAME:
			return getName();
		case GamePackage.ACTION__ACTION_TYPE:
			return getActionType();
		case GamePackage.ACTION__CHANGE_ACCESSBILITY:
			if (resolve)
				return getChange_Accessbility();
			return basicGetChange_Accessbility();
		case GamePackage.ACTION__CHANGE_STATE:
			if (resolve)
				return getChange_State();
			return basicGetChange_State();
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
		case GamePackage.ACTION__NAME:
			setName((String) newValue);
			return;
		case GamePackage.ACTION__ACTION_TYPE:
			setActionType((ActionType) newValue);
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
		case GamePackage.ACTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GamePackage.ACTION__ACTION_TYPE:
			setActionType(ACTION_TYPE_EDEFAULT);
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
		case GamePackage.ACTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GamePackage.ACTION__ACTION_TYPE:
			return actionType != ACTION_TYPE_EDEFAULT;
		case GamePackage.ACTION__CHANGE_ACCESSBILITY:
			return change_Accessbility != null;
		case GamePackage.ACTION__CHANGE_STATE:
			return change_State != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GamePackage.ACTION___PERFORM_ACTION:
			performAction();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", actionType: ");
		result.append(actionType);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
