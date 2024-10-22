/**
 */
package no.ntnu.matrixengine.impl;

import java.lang.reflect.InvocationTargetException;

import no.ntnu.matrixengine.Map;
import no.ntnu.matrixengine.MatrixenginePackage;
import no.ntnu.matrixengine.Tile;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.impl.MapImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.MapImpl#getTile <em>Tile</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.MapImpl#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.MapImpl#getSizeX <em>Size X</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends MinimalEObjectImpl.Container implements Map {
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
	 * The cached value of the '{@link #getTile() <em>Tile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTile()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> tile;

	/**
	 * The default value of the '{@link #getSizeY() <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeY()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeY() <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeY()
	 * @generated
	 * @ordered
	 */
	protected int sizeY = SIZE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeX() <em>Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeX()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeX() <em>Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeX()
	 * @generated
	 * @ordered
	 */
	protected int sizeX = SIZE_X_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixenginePackage.Literals.MAP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.MAP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tile> getTile() {
		if (tile == null) {
			tile = new EObjectResolvingEList<Tile>(Tile.class, this, MatrixenginePackage.MAP__TILE);
		}
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSizeY() {
		return sizeY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeY(int newSizeY) {
		int oldSizeY = sizeY;
		sizeY = newSizeY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.MAP__SIZE_Y, oldSizeY, sizeY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSizeX() {
		return sizeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeX(int newSizeX) {
		int oldSizeX = sizeX;
		sizeX = newSizeX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.MAP__SIZE_X, oldSizeX, sizeX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void initializeMap() {
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
	public void getTile(int x, int y) {
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
	public Map loadMap() {
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
		case MatrixenginePackage.MAP__NAME:
			return getName();
		case MatrixenginePackage.MAP__TILE:
			return getTile();
		case MatrixenginePackage.MAP__SIZE_Y:
			return getSizeY();
		case MatrixenginePackage.MAP__SIZE_X:
			return getSizeX();
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
		case MatrixenginePackage.MAP__NAME:
			setName((String) newValue);
			return;
		case MatrixenginePackage.MAP__SIZE_Y:
			setSizeY((Integer) newValue);
			return;
		case MatrixenginePackage.MAP__SIZE_X:
			setSizeX((Integer) newValue);
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
		case MatrixenginePackage.MAP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MatrixenginePackage.MAP__SIZE_Y:
			setSizeY(SIZE_Y_EDEFAULT);
			return;
		case MatrixenginePackage.MAP__SIZE_X:
			setSizeX(SIZE_X_EDEFAULT);
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
		case MatrixenginePackage.MAP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MatrixenginePackage.MAP__TILE:
			return tile != null && !tile.isEmpty();
		case MatrixenginePackage.MAP__SIZE_Y:
			return sizeY != SIZE_Y_EDEFAULT;
		case MatrixenginePackage.MAP__SIZE_X:
			return sizeX != SIZE_X_EDEFAULT;
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
		case MatrixenginePackage.MAP___INITIALIZE_MAP:
			initializeMap();
			return null;
		case MatrixenginePackage.MAP___GET_TILE__INT_INT:
			getTile((Integer) arguments.get(0), (Integer) arguments.get(1));
			return null;
		case MatrixenginePackage.MAP___LOAD_MAP:
			return loadMap();
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
		result.append(", SizeY: ");
		result.append(sizeY);
		result.append(", SizeX: ");
		result.append(sizeX);
		result.append(')');
		return result.toString();
	}

} //MapImpl
