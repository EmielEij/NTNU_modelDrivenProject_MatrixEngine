/**
 */
package no.ntnu.tdt4250.matrixgame.game.impl;

import java.lang.reflect.InvocationTargetException;

import no.ntnu.tdt4250.matrixgame.game.Action;
import no.ntnu.tdt4250.matrixgame.game.GamePackage;
import no.ntnu.tdt4250.matrixgame.game.Tile;
import no.ntnu.tdt4250.matrixgame.game.TileType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.TileImpl#isIsAccessible <em>Is Accessible</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.TileImpl#getColor <em>Color</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.TileImpl#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.TileImpl#getYCoordinate <em>YCoordinate</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.TileImpl#getTileType <em>Tile Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileImpl extends MinimalEObjectImpl.Container implements Tile {
	/**
	 * The default value of the '{@link #isIsAccessible() <em>Is Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAccessible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACCESSIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAccessible() <em>Is Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAccessible()
	 * @generated
	 * @ordered
	 */
	protected boolean isAccessible = IS_ACCESSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getXCoordinate() <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final int XCOORDINATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXCoordinate() <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoordinate()
	 * @generated
	 * @ordered
	 */
	protected int xCoordinate = XCOORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYCoordinate() <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final int YCOORDINATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYCoordinate() <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoordinate()
	 * @generated
	 * @ordered
	 */
	protected int yCoordinate = YCOORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTileType() <em>Tile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileType()
	 * @generated
	 * @ordered
	 */
	protected static final TileType TILE_TYPE_EDEFAULT = TileType.BASIC;

	/**
	 * The cached value of the '{@link #getTileType() <em>Tile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileType()
	 * @generated
	 * @ordered
	 */
	protected TileType tileType = TILE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.TILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAccessible() {
		return isAccessible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAccessible(boolean newIsAccessible) {
		boolean oldIsAccessible = isAccessible;
		isAccessible = newIsAccessible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TILE__IS_ACCESSIBLE, oldIsAccessible,
					isAccessible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TILE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getXCoordinate() {
		return xCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXCoordinate(int newXCoordinate) {
		int oldXCoordinate = xCoordinate;
		xCoordinate = newXCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TILE__XCOORDINATE, oldXCoordinate,
					xCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYCoordinate() {
		return yCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYCoordinate(int newYCoordinate) {
		int oldYCoordinate = yCoordinate;
		yCoordinate = newYCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TILE__YCOORDINATE, oldYCoordinate,
					yCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TileType getTileType() {
		return tileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTileType(TileType newTileType) {
		TileType oldTileType = tileType;
		tileType = newTileType == null ? TILE_TYPE_EDEFAULT : newTileType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TILE__TILE_TYPE, oldTileType, tileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void interact(Action action) {
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
	public void reveal() {
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
	public void toggle() {
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
		case GamePackage.TILE__IS_ACCESSIBLE:
			return isIsAccessible();
		case GamePackage.TILE__COLOR:
			return getColor();
		case GamePackage.TILE__XCOORDINATE:
			return getXCoordinate();
		case GamePackage.TILE__YCOORDINATE:
			return getYCoordinate();
		case GamePackage.TILE__TILE_TYPE:
			return getTileType();
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
		case GamePackage.TILE__IS_ACCESSIBLE:
			setIsAccessible((Boolean) newValue);
			return;
		case GamePackage.TILE__COLOR:
			setColor((String) newValue);
			return;
		case GamePackage.TILE__XCOORDINATE:
			setXCoordinate((Integer) newValue);
			return;
		case GamePackage.TILE__YCOORDINATE:
			setYCoordinate((Integer) newValue);
			return;
		case GamePackage.TILE__TILE_TYPE:
			setTileType((TileType) newValue);
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
		case GamePackage.TILE__IS_ACCESSIBLE:
			setIsAccessible(IS_ACCESSIBLE_EDEFAULT);
			return;
		case GamePackage.TILE__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case GamePackage.TILE__XCOORDINATE:
			setXCoordinate(XCOORDINATE_EDEFAULT);
			return;
		case GamePackage.TILE__YCOORDINATE:
			setYCoordinate(YCOORDINATE_EDEFAULT);
			return;
		case GamePackage.TILE__TILE_TYPE:
			setTileType(TILE_TYPE_EDEFAULT);
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
		case GamePackage.TILE__IS_ACCESSIBLE:
			return isAccessible != IS_ACCESSIBLE_EDEFAULT;
		case GamePackage.TILE__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case GamePackage.TILE__XCOORDINATE:
			return xCoordinate != XCOORDINATE_EDEFAULT;
		case GamePackage.TILE__YCOORDINATE:
			return yCoordinate != YCOORDINATE_EDEFAULT;
		case GamePackage.TILE__TILE_TYPE:
			return tileType != TILE_TYPE_EDEFAULT;
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
		case GamePackage.TILE___INTERACT__ACTION:
			interact((Action) arguments.get(0));
			return null;
		case GamePackage.TILE___REVEAL:
			reveal();
			return null;
		case GamePackage.TILE___TOGGLE:
			toggle();
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
		result.append(" (isAccessible: ");
		result.append(isAccessible);
		result.append(", Color: ");
		result.append(color);
		result.append(", xCoordinate: ");
		result.append(xCoordinate);
		result.append(", yCoordinate: ");
		result.append(yCoordinate);
		result.append(", tileType: ");
		result.append(tileType);
		result.append(')');
		return result.toString();
	}

} //TileImpl
