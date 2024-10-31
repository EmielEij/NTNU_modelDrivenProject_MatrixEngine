/**
 */
package no.ntnu.tdt4250.matrixgame.game.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import no.ntnu.tdt4250.matrixgame.game.GamePackage;
import no.ntnu.tdt4250.matrixgame.game.Map;
import no.ntnu.tdt4250.matrixgame.game.Tile;

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
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.MapImpl#getTile <em>Tile</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.MapImpl#getAmountOfTiles <em>Amount Of Tiles</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.MapImpl#getMapSizeX <em>Map Size X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.MapImpl#getMapSizeY <em>Map Size Y</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.MapImpl#getMapName <em>Map Name</em>}</li>
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
	 * The default value of the '{@link #getMapSizeX() <em>Map Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapSizeX()
	 * @generated
	 * @ordered
	 */
	protected static final int MAP_SIZE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMapSizeX() <em>Map Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapSizeX()
	 * @generated
	 * @ordered
	 */
	protected int mapSizeX = MAP_SIZE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapSizeY() <em>Map Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapSizeY()
	 * @generated
	 * @ordered
	 */
	protected static final int MAP_SIZE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMapSizeY() <em>Map Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapSizeY()
	 * @generated
	 * @ordered
	 */
	protected int mapSizeY = MAP_SIZE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapName() <em>Map Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapName() <em>Map Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapName()
	 * @generated
	 * @ordered
	 */
	protected String mapName = MAP_NAME_EDEFAULT;

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
		return GamePackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tile> getTile() {
		if (tile == null) {
			tile = new EObjectContainmentEList<Tile>(Tile.class, this, GamePackage.MAP__TILE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.MAP__AMOUNT_OF_TILES, oldAmountOfTiles,
					amountOfTiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMapSizeX() {
		return mapSizeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapSizeX(int newMapSizeX) {
		int oldMapSizeX = mapSizeX;
		mapSizeX = newMapSizeX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.MAP__MAP_SIZE_X, oldMapSizeX, mapSizeX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMapSizeY() {
		return mapSizeY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapSizeY(int newMapSizeY) {
		int oldMapSizeY = mapSizeY;
		mapSizeY = newMapSizeY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.MAP__MAP_SIZE_Y, oldMapSizeY, mapSizeY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMapName() {
		return mapName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapName(String newMapName) {
		String oldMapName = mapName;
		mapName = newMapName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.MAP__MAP_NAME, oldMapName, mapName));
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
		case GamePackage.MAP__TILE:
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
		case GamePackage.MAP__TILE:
			return getTile();
		case GamePackage.MAP__AMOUNT_OF_TILES:
			return getAmountOfTiles();
		case GamePackage.MAP__MAP_SIZE_X:
			return getMapSizeX();
		case GamePackage.MAP__MAP_SIZE_Y:
			return getMapSizeY();
		case GamePackage.MAP__MAP_NAME:
			return getMapName();
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
		case GamePackage.MAP__TILE:
			getTile().clear();
			getTile().addAll((Collection<? extends Tile>) newValue);
			return;
		case GamePackage.MAP__AMOUNT_OF_TILES:
			setAmountOfTiles((Integer) newValue);
			return;
		case GamePackage.MAP__MAP_SIZE_X:
			setMapSizeX((Integer) newValue);
			return;
		case GamePackage.MAP__MAP_SIZE_Y:
			setMapSizeY((Integer) newValue);
			return;
		case GamePackage.MAP__MAP_NAME:
			setMapName((String) newValue);
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
		case GamePackage.MAP__TILE:
			getTile().clear();
			return;
		case GamePackage.MAP__AMOUNT_OF_TILES:
			setAmountOfTiles(AMOUNT_OF_TILES_EDEFAULT);
			return;
		case GamePackage.MAP__MAP_SIZE_X:
			setMapSizeX(MAP_SIZE_X_EDEFAULT);
			return;
		case GamePackage.MAP__MAP_SIZE_Y:
			setMapSizeY(MAP_SIZE_Y_EDEFAULT);
			return;
		case GamePackage.MAP__MAP_NAME:
			setMapName(MAP_NAME_EDEFAULT);
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
		case GamePackage.MAP__TILE:
			return tile != null && !tile.isEmpty();
		case GamePackage.MAP__AMOUNT_OF_TILES:
			return amountOfTiles != AMOUNT_OF_TILES_EDEFAULT;
		case GamePackage.MAP__MAP_SIZE_X:
			return mapSizeX != MAP_SIZE_X_EDEFAULT;
		case GamePackage.MAP__MAP_SIZE_Y:
			return mapSizeY != MAP_SIZE_Y_EDEFAULT;
		case GamePackage.MAP__MAP_NAME:
			return MAP_NAME_EDEFAULT == null ? mapName != null : !MAP_NAME_EDEFAULT.equals(mapName);
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
		case GamePackage.MAP___INITIALIZE_MAP:
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
		result.append(", mapSizeX: ");
		result.append(mapSizeX);
		result.append(", mapSizeY: ");
		result.append(mapSizeY);
		result.append(", mapName: ");
		result.append(mapName);
		result.append(')');
		return result.toString();
	}

} //MapImpl
