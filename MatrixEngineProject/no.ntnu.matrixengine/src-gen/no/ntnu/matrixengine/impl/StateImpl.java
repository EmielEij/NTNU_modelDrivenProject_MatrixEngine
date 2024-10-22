/**
 */
package no.ntnu.matrixengine.impl;

import java.lang.reflect.InvocationTargetException;

import no.ntnu.matrixengine.GameMap;
import no.ntnu.matrixengine.MatrixenginePackage;
import no.ntnu.matrixengine.Player;
import no.ntnu.matrixengine.State;
import no.ntnu.matrixengine.Tile;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.impl.StateImpl#getMap <em>Map</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.StateImpl#getTurnsTaken <em>Turns Taken</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.StateImpl#getFlagsPlaced <em>Flags Placed</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.StateImpl#isIsOver <em>Is Over</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected GameMap map;

	/**
	 * The default value of the '{@link #getTurnsTaken() <em>Turns Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnsTaken()
	 * @generated
	 * @ordered
	 */
	protected static final int TURNS_TAKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTurnsTaken() <em>Turns Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnsTaken()
	 * @generated
	 * @ordered
	 */
	protected int turnsTaken = TURNS_TAKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlagsPlaced() <em>Flags Placed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlagsPlaced()
	 * @generated
	 * @ordered
	 */
	protected static final int FLAGS_PLACED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFlagsPlaced() <em>Flags Placed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlagsPlaced()
	 * @generated
	 * @ordered
	 */
	protected int flagsPlaced = FLAGS_PLACED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOver() <em>Is Over</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOver()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOver() <em>Is Over</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOver()
	 * @generated
	 * @ordered
	 */
	protected boolean isOver = IS_OVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixenginePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameMap getMap() {
		if (map != null && map.eIsProxy()) {
			InternalEObject oldMap = (InternalEObject) map;
			map = (GameMap) eResolveProxy(oldMap);
			if (map != oldMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatrixenginePackage.STATE__MAP, oldMap,
							map));
			}
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameMap basicGetMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMap(GameMap newMap) {
		GameMap oldMap = map;
		map = newMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.STATE__MAP, oldMap, map));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTurnsTaken() {
		return turnsTaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTurnsTaken(int newTurnsTaken) {
		int oldTurnsTaken = turnsTaken;
		turnsTaken = newTurnsTaken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.STATE__TURNS_TAKEN, oldTurnsTaken,
					turnsTaken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFlagsPlaced() {
		return flagsPlaced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlagsPlaced(int newFlagsPlaced) {
		int oldFlagsPlaced = flagsPlaced;
		flagsPlaced = newFlagsPlaced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.STATE__FLAGS_PLACED,
					oldFlagsPlaced, flagsPlaced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsOver() {
		return isOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsOver(boolean newIsOver) {
		boolean oldIsOver = isOver;
		isOver = newIsOver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.STATE__IS_OVER, oldIsOver,
					isOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tile getCurrentTile() {
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
	public Player getPlayersTurn() {
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
		case MatrixenginePackage.STATE__MAP:
			if (resolve)
				return getMap();
			return basicGetMap();
		case MatrixenginePackage.STATE__TURNS_TAKEN:
			return getTurnsTaken();
		case MatrixenginePackage.STATE__FLAGS_PLACED:
			return getFlagsPlaced();
		case MatrixenginePackage.STATE__IS_OVER:
			return isIsOver();
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
		case MatrixenginePackage.STATE__MAP:
			setMap((GameMap) newValue);
			return;
		case MatrixenginePackage.STATE__TURNS_TAKEN:
			setTurnsTaken((Integer) newValue);
			return;
		case MatrixenginePackage.STATE__FLAGS_PLACED:
			setFlagsPlaced((Integer) newValue);
			return;
		case MatrixenginePackage.STATE__IS_OVER:
			setIsOver((Boolean) newValue);
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
		case MatrixenginePackage.STATE__MAP:
			setMap((GameMap) null);
			return;
		case MatrixenginePackage.STATE__TURNS_TAKEN:
			setTurnsTaken(TURNS_TAKEN_EDEFAULT);
			return;
		case MatrixenginePackage.STATE__FLAGS_PLACED:
			setFlagsPlaced(FLAGS_PLACED_EDEFAULT);
			return;
		case MatrixenginePackage.STATE__IS_OVER:
			setIsOver(IS_OVER_EDEFAULT);
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
		case MatrixenginePackage.STATE__MAP:
			return map != null;
		case MatrixenginePackage.STATE__TURNS_TAKEN:
			return turnsTaken != TURNS_TAKEN_EDEFAULT;
		case MatrixenginePackage.STATE__FLAGS_PLACED:
			return flagsPlaced != FLAGS_PLACED_EDEFAULT;
		case MatrixenginePackage.STATE__IS_OVER:
			return isOver != IS_OVER_EDEFAULT;
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
		case MatrixenginePackage.STATE___GET_CURRENT_TILE:
			return getCurrentTile();
		case MatrixenginePackage.STATE___GET_PLAYERS_TURN:
			return getPlayersTurn();
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
		result.append(" (turnsTaken: ");
		result.append(turnsTaken);
		result.append(", flagsPlaced: ");
		result.append(flagsPlaced);
		result.append(", isOver: ");
		result.append(isOver);
		result.append(')');
		return result.toString();
	}

} //StateImpl
