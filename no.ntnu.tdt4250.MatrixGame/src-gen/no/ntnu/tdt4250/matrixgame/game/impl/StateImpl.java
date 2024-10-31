/**
 */
package no.ntnu.tdt4250.matrixgame.game.impl;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.StateImpl#getTurnsTaken <em>Turns Taken</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.StateImpl#isFlagsPlaced <em>Flags Placed</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.StateImpl#isIsOver <em>Is Over</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.StateImpl#getTile <em>Tile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	 * The default value of the '{@link #isFlagsPlaced() <em>Flags Placed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlagsPlaced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLAGS_PLACED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFlagsPlaced() <em>Flags Placed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlagsPlaced()
	 * @generated
	 * @ordered
	 */
	protected boolean flagsPlaced = FLAGS_PLACED_EDEFAULT;

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
	 * The cached value of the '{@link #getTile() <em>Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTile()
	 * @generated
	 * @ordered
	 */
	protected Tile tile;

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
		return GamePackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.STATE__TURNS_TAKEN, oldTurnsTaken,
					turnsTaken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFlagsPlaced() {
		return flagsPlaced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlagsPlaced(boolean newFlagsPlaced) {
		boolean oldFlagsPlaced = flagsPlaced;
		flagsPlaced = newFlagsPlaced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.STATE__FLAGS_PLACED, oldFlagsPlaced,
					flagsPlaced));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.STATE__IS_OVER, oldIsOver, isOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tile getTile() {
		if (tile != null && tile.eIsProxy()) {
			InternalEObject oldTile = (InternalEObject) tile;
			tile = (Tile) eResolveProxy(oldTile);
			if (tile != oldTile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.STATE__TILE, oldTile, tile));
			}
		}
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetTile() {
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTile(Tile newTile) {
		Tile oldTile = tile;
		tile = newTile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.STATE__TILE, oldTile, tile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tile getCurrentStatus() {
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
		case GamePackage.STATE__TURNS_TAKEN:
			return getTurnsTaken();
		case GamePackage.STATE__FLAGS_PLACED:
			return isFlagsPlaced();
		case GamePackage.STATE__IS_OVER:
			return isIsOver();
		case GamePackage.STATE__TILE:
			if (resolve)
				return getTile();
			return basicGetTile();
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
		case GamePackage.STATE__TURNS_TAKEN:
			setTurnsTaken((Integer) newValue);
			return;
		case GamePackage.STATE__FLAGS_PLACED:
			setFlagsPlaced((Boolean) newValue);
			return;
		case GamePackage.STATE__IS_OVER:
			setIsOver((Boolean) newValue);
			return;
		case GamePackage.STATE__TILE:
			setTile((Tile) newValue);
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
		case GamePackage.STATE__TURNS_TAKEN:
			setTurnsTaken(TURNS_TAKEN_EDEFAULT);
			return;
		case GamePackage.STATE__FLAGS_PLACED:
			setFlagsPlaced(FLAGS_PLACED_EDEFAULT);
			return;
		case GamePackage.STATE__IS_OVER:
			setIsOver(IS_OVER_EDEFAULT);
			return;
		case GamePackage.STATE__TILE:
			setTile((Tile) null);
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
		case GamePackage.STATE__TURNS_TAKEN:
			return turnsTaken != TURNS_TAKEN_EDEFAULT;
		case GamePackage.STATE__FLAGS_PLACED:
			return flagsPlaced != FLAGS_PLACED_EDEFAULT;
		case GamePackage.STATE__IS_OVER:
			return isOver != IS_OVER_EDEFAULT;
		case GamePackage.STATE__TILE:
			return tile != null;
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
		case GamePackage.STATE___GET_CURRENT_STATUS:
			return getCurrentStatus();
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
