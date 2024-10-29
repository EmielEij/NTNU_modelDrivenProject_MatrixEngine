/**
 */
package matrixGameEngine.impl;

import java.lang.reflect.InvocationTargetException;

import matrixGameEngine.Action;
import matrixGameEngine.MatrixGameEnginePackage;
import matrixGameEngine.Tile;
import matrixGameEngine.TileType;

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
 *   <li>{@link matrixGameEngine.impl.TileImpl#isIsAccessible <em>Is Accessible</em>}</li>
 *   <li>{@link matrixGameEngine.impl.TileImpl#getColor <em>Color</em>}</li>
 *   <li>{@link matrixGameEngine.impl.TileImpl#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link matrixGameEngine.impl.TileImpl#getYCoordinate <em>YCoordinate</em>}</li>
 *   <li>{@link matrixGameEngine.impl.TileImpl#getType <em>Type</em>}</li>
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TileType TYPE_EDEFAULT = TileType.BASIC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TileType type = TYPE_EDEFAULT;

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
		return MatrixGameEnginePackage.Literals.TILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGameEnginePackage.TILE__IS_ACCESSIBLE,
					oldIsAccessible, isAccessible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGameEnginePackage.TILE__COLOR, oldColor,
					color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGameEnginePackage.TILE__XCOORDINATE,
					oldXCoordinate, xCoordinate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGameEnginePackage.TILE__YCOORDINATE,
					oldYCoordinate, yCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TileType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TileType newType) {
		TileType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGameEnginePackage.TILE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TileType getTileType() {
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
		case MatrixGameEnginePackage.TILE__IS_ACCESSIBLE:
			return isIsAccessible();
		case MatrixGameEnginePackage.TILE__COLOR:
			return getColor();
		case MatrixGameEnginePackage.TILE__XCOORDINATE:
			return getXCoordinate();
		case MatrixGameEnginePackage.TILE__YCOORDINATE:
			return getYCoordinate();
		case MatrixGameEnginePackage.TILE__TYPE:
			return getType();
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
		case MatrixGameEnginePackage.TILE__IS_ACCESSIBLE:
			setIsAccessible((Boolean) newValue);
			return;
		case MatrixGameEnginePackage.TILE__COLOR:
			setColor((String) newValue);
			return;
		case MatrixGameEnginePackage.TILE__XCOORDINATE:
			setXCoordinate((Integer) newValue);
			return;
		case MatrixGameEnginePackage.TILE__YCOORDINATE:
			setYCoordinate((Integer) newValue);
			return;
		case MatrixGameEnginePackage.TILE__TYPE:
			setType((TileType) newValue);
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
		case MatrixGameEnginePackage.TILE__IS_ACCESSIBLE:
			setIsAccessible(IS_ACCESSIBLE_EDEFAULT);
			return;
		case MatrixGameEnginePackage.TILE__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case MatrixGameEnginePackage.TILE__XCOORDINATE:
			setXCoordinate(XCOORDINATE_EDEFAULT);
			return;
		case MatrixGameEnginePackage.TILE__YCOORDINATE:
			setYCoordinate(YCOORDINATE_EDEFAULT);
			return;
		case MatrixGameEnginePackage.TILE__TYPE:
			setType(TYPE_EDEFAULT);
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
		case MatrixGameEnginePackage.TILE__IS_ACCESSIBLE:
			return isAccessible != IS_ACCESSIBLE_EDEFAULT;
		case MatrixGameEnginePackage.TILE__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case MatrixGameEnginePackage.TILE__XCOORDINATE:
			return xCoordinate != XCOORDINATE_EDEFAULT;
		case MatrixGameEnginePackage.TILE__YCOORDINATE:
			return yCoordinate != YCOORDINATE_EDEFAULT;
		case MatrixGameEnginePackage.TILE__TYPE:
			return type != TYPE_EDEFAULT;
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
		case MatrixGameEnginePackage.TILE___GET_TILE_TYPE:
			return getTileType();
		case MatrixGameEnginePackage.TILE___INTERACT__ACTION:
			interact((Action) arguments.get(0));
			return null;
		case MatrixGameEnginePackage.TILE___REVEAL:
			reveal();
			return null;
		case MatrixGameEnginePackage.TILE___TOGGLE:
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TileImpl
