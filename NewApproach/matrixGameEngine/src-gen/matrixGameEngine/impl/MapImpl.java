/**
 */
package matrixGameEngine.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import matrixGameEngine.Map;
import matrixGameEngine.MatrixGameEnginePackage;
import matrixGameEngine.Tile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link matrixGameEngine.impl.MapImpl#getTile <em>Tile</em>}</li>
 *   <li>{@link matrixGameEngine.impl.MapImpl#getAmountOfTiles <em>Amount Of Tiles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends MinimalEObjectImpl.Container implements Map {
	/**
	 * The cached value of the '{@link #getTile() <em>Tile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTile()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> tile;

	/**
	 * The default value of the '{@link #getAmountOfTiles() <em>Amount Of Tiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfTiles()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_OF_TILES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountOfTiles() <em>Amount Of Tiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfTiles()
	 * @generated
	 * @ordered
	 */
	protected int amountOfTiles = AMOUNT_OF_TILES_EDEFAULT;

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
		return MatrixGameEnginePackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tile> getTile() {
		if (tile == null) {
			tile = new EObjectContainmentEList<Tile>(Tile.class, this, MatrixGameEnginePackage.MAP__TILE);
		}
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAmountOfTiles() {
		return amountOfTiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountOfTiles(int newAmountOfTiles) {
		int oldAmountOfTiles = amountOfTiles;
		amountOfTiles = newAmountOfTiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGameEnginePackage.MAP__AMOUNT_OF_TILES,
					oldAmountOfTiles, amountOfTiles));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MatrixGameEnginePackage.MAP__TILE:
			return ((InternalEList<?>) getTile()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MatrixGameEnginePackage.MAP__TILE:
			return getTile();
		case MatrixGameEnginePackage.MAP__AMOUNT_OF_TILES:
			return getAmountOfTiles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MatrixGameEnginePackage.MAP__TILE:
			getTile().clear();
			getTile().addAll((Collection<? extends Tile>) newValue);
			return;
		case MatrixGameEnginePackage.MAP__AMOUNT_OF_TILES:
			setAmountOfTiles((Integer) newValue);
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
		case MatrixGameEnginePackage.MAP__TILE:
			getTile().clear();
			return;
		case MatrixGameEnginePackage.MAP__AMOUNT_OF_TILES:
			setAmountOfTiles(AMOUNT_OF_TILES_EDEFAULT);
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
		case MatrixGameEnginePackage.MAP__TILE:
			return tile != null && !tile.isEmpty();
		case MatrixGameEnginePackage.MAP__AMOUNT_OF_TILES:
			return amountOfTiles != AMOUNT_OF_TILES_EDEFAULT;
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
		case MatrixGameEnginePackage.MAP___INITIALIZE_MAP:
			initializeMap();
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
		result.append(" (amountOfTiles: ");
		result.append(amountOfTiles);
		result.append(')');
		return result.toString();
	}

} //MapImpl
