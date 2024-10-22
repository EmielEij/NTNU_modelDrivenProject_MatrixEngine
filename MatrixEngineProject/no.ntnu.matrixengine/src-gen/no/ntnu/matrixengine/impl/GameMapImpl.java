/**
 */
package no.ntnu.matrixengine.impl;

import java.util.Collection;

import no.ntnu.matrixengine.GameMap;
import no.ntnu.matrixengine.MatrixenginePackage;
import no.ntnu.matrixengine.State;
import no.ntnu.matrixengine.Tile;

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
 * An implementation of the model object '<em><b>Game Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.impl.GameMapImpl#getState <em>State</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.GameMapImpl#getTile <em>Tile</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.GameMapImpl#getTileSizeX <em>Tile Size X</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.GameMapImpl#getTileSizeY <em>Tile Size Y</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.GameMapImpl#getMapSizeX <em>Map Size X</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.GameMapImpl#getMapSizeY <em>Map Size Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameMapImpl extends MinimalEObjectImpl.Container implements GameMap {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

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
	 * The default value of the '{@link #getTileSizeX() <em>Tile Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSizeX()
	 * @generated
	 * @ordered
	 */
	protected static final int TILE_SIZE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTileSizeX() <em>Tile Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSizeX()
	 * @generated
	 * @ordered
	 */
	protected int tileSizeX = TILE_SIZE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getTileSizeY() <em>Tile Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSizeY()
	 * @generated
	 * @ordered
	 */
	protected static final int TILE_SIZE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTileSizeY() <em>Tile Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileSizeY()
	 * @generated
	 * @ordered
	 */
	protected int tileSizeY = TILE_SIZE_Y_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixenginePackage.Literals.GAME_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject) state;
			state = (State) eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatrixenginePackage.GAME_MAP__STATE,
							oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.GAME_MAP__STATE, oldState,
					state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tile> getTile() {
		if (tile == null) {
			tile = new EObjectContainmentEList<Tile>(Tile.class, this, MatrixenginePackage.GAME_MAP__TILE);
		}
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTileSizeX() {
		return tileSizeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTileSizeX(int newTileSizeX) {
		int oldTileSizeX = tileSizeX;
		tileSizeX = newTileSizeX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.GAME_MAP__TILE_SIZE_X,
					oldTileSizeX, tileSizeX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTileSizeY() {
		return tileSizeY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTileSizeY(int newTileSizeY) {
		int oldTileSizeY = tileSizeY;
		tileSizeY = newTileSizeY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.GAME_MAP__TILE_SIZE_Y,
					oldTileSizeY, tileSizeY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.GAME_MAP__MAP_SIZE_X, oldMapSizeX,
					mapSizeX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.GAME_MAP__MAP_SIZE_Y, oldMapSizeY,
					mapSizeY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MatrixenginePackage.GAME_MAP__TILE:
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
		case MatrixenginePackage.GAME_MAP__STATE:
			if (resolve)
				return getState();
			return basicGetState();
		case MatrixenginePackage.GAME_MAP__TILE:
			return getTile();
		case MatrixenginePackage.GAME_MAP__TILE_SIZE_X:
			return getTileSizeX();
		case MatrixenginePackage.GAME_MAP__TILE_SIZE_Y:
			return getTileSizeY();
		case MatrixenginePackage.GAME_MAP__MAP_SIZE_X:
			return getMapSizeX();
		case MatrixenginePackage.GAME_MAP__MAP_SIZE_Y:
			return getMapSizeY();
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
		case MatrixenginePackage.GAME_MAP__STATE:
			setState((State) newValue);
			return;
		case MatrixenginePackage.GAME_MAP__TILE:
			getTile().clear();
			getTile().addAll((Collection<? extends Tile>) newValue);
			return;
		case MatrixenginePackage.GAME_MAP__TILE_SIZE_X:
			setTileSizeX((Integer) newValue);
			return;
		case MatrixenginePackage.GAME_MAP__TILE_SIZE_Y:
			setTileSizeY((Integer) newValue);
			return;
		case MatrixenginePackage.GAME_MAP__MAP_SIZE_X:
			setMapSizeX((Integer) newValue);
			return;
		case MatrixenginePackage.GAME_MAP__MAP_SIZE_Y:
			setMapSizeY((Integer) newValue);
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
		case MatrixenginePackage.GAME_MAP__STATE:
			setState((State) null);
			return;
		case MatrixenginePackage.GAME_MAP__TILE:
			getTile().clear();
			return;
		case MatrixenginePackage.GAME_MAP__TILE_SIZE_X:
			setTileSizeX(TILE_SIZE_X_EDEFAULT);
			return;
		case MatrixenginePackage.GAME_MAP__TILE_SIZE_Y:
			setTileSizeY(TILE_SIZE_Y_EDEFAULT);
			return;
		case MatrixenginePackage.GAME_MAP__MAP_SIZE_X:
			setMapSizeX(MAP_SIZE_X_EDEFAULT);
			return;
		case MatrixenginePackage.GAME_MAP__MAP_SIZE_Y:
			setMapSizeY(MAP_SIZE_Y_EDEFAULT);
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
		case MatrixenginePackage.GAME_MAP__STATE:
			return state != null;
		case MatrixenginePackage.GAME_MAP__TILE:
			return tile != null && !tile.isEmpty();
		case MatrixenginePackage.GAME_MAP__TILE_SIZE_X:
			return tileSizeX != TILE_SIZE_X_EDEFAULT;
		case MatrixenginePackage.GAME_MAP__TILE_SIZE_Y:
			return tileSizeY != TILE_SIZE_Y_EDEFAULT;
		case MatrixenginePackage.GAME_MAP__MAP_SIZE_X:
			return mapSizeX != MAP_SIZE_X_EDEFAULT;
		case MatrixenginePackage.GAME_MAP__MAP_SIZE_Y:
			return mapSizeY != MAP_SIZE_Y_EDEFAULT;
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
		result.append(" (tileSizeX: ");
		result.append(tileSizeX);
		result.append(", tileSizeY: ");
		result.append(tileSizeY);
		result.append(", mapSizeX: ");
		result.append(mapSizeX);
		result.append(", mapSizeY: ");
		result.append(mapSizeY);
		result.append(')');
		return result.toString();
	}

} //GameMapImpl
