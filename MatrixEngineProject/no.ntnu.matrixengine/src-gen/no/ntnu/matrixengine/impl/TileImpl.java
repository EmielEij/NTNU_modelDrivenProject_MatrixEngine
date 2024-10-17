/**
 */
package no.ntnu.matrixengine.impl;

import no.ntnu.matrixengine.MatrixenginePackage;
import no.ntnu.matrixengine.Tile;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link no.ntnu.matrixengine.impl.TileImpl#getTileCordinateX <em>Tile Cordinate X</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.TileImpl#getTileCodinateY <em>Tile Codinate Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileImpl extends MinimalEObjectImpl.Container implements Tile {
	/**
	 * The default value of the '{@link #getTileCordinateX() <em>Tile Cordinate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileCordinateX()
	 * @generated
	 * @ordered
	 */
	protected static final int TILE_CORDINATE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTileCordinateX() <em>Tile Cordinate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileCordinateX()
	 * @generated
	 * @ordered
	 */
	protected int tileCordinateX = TILE_CORDINATE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getTileCodinateY() <em>Tile Codinate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileCodinateY()
	 * @generated
	 * @ordered
	 */
	protected static final int TILE_CODINATE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTileCodinateY() <em>Tile Codinate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileCodinateY()
	 * @generated
	 * @ordered
	 */
	protected int tileCodinateY = TILE_CODINATE_Y_EDEFAULT;

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
		return MatrixenginePackage.Literals.TILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTileCordinateX() {
		return tileCordinateX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTileCordinateX(int newTileCordinateX) {
		int oldTileCordinateX = tileCordinateX;
		tileCordinateX = newTileCordinateX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.TILE__TILE_CORDINATE_X,
					oldTileCordinateX, tileCordinateX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTileCodinateY() {
		return tileCodinateY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTileCodinateY(int newTileCodinateY) {
		int oldTileCodinateY = tileCodinateY;
		tileCodinateY = newTileCodinateY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.TILE__TILE_CODINATE_Y,
					oldTileCodinateY, tileCodinateY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MatrixenginePackage.TILE__TILE_CORDINATE_X:
			return getTileCordinateX();
		case MatrixenginePackage.TILE__TILE_CODINATE_Y:
			return getTileCodinateY();
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
		case MatrixenginePackage.TILE__TILE_CORDINATE_X:
			setTileCordinateX((Integer) newValue);
			return;
		case MatrixenginePackage.TILE__TILE_CODINATE_Y:
			setTileCodinateY((Integer) newValue);
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
		case MatrixenginePackage.TILE__TILE_CORDINATE_X:
			setTileCordinateX(TILE_CORDINATE_X_EDEFAULT);
			return;
		case MatrixenginePackage.TILE__TILE_CODINATE_Y:
			setTileCodinateY(TILE_CODINATE_Y_EDEFAULT);
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
		case MatrixenginePackage.TILE__TILE_CORDINATE_X:
			return tileCordinateX != TILE_CORDINATE_X_EDEFAULT;
		case MatrixenginePackage.TILE__TILE_CODINATE_Y:
			return tileCodinateY != TILE_CODINATE_Y_EDEFAULT;
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
		result.append(" (TileCordinateX: ");
		result.append(tileCordinateX);
		result.append(", TileCodinateY: ");
		result.append(tileCodinateY);
		result.append(')');
		return result.toString();
	}

} //TileImpl
