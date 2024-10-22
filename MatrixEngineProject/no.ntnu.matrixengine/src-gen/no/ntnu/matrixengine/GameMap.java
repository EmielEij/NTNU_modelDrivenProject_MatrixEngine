/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.GameMap#getState <em>State</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.GameMap#getTile <em>Tile</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.GameMap#getTileSizeX <em>Tile Size X</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.GameMap#getTileSizeY <em>Tile Size Y</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.GameMap#getMapSizeX <em>Map Size X</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.GameMap#getMapSizeY <em>Map Size Y</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameMap()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='tileSizeMustBeSquare mapSizeMustFitScreen mapSizeMustBeSquare'"
 * @generated
 */
public interface GameMap extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameMap_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.GameMap#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Tile</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.matrixengine.Tile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile</em>' containment reference list.
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameMap_Tile()
	 * @model containment="true" lower="4"
	 * @generated
	 */
	EList<Tile> getTile();

	/**
	 * Returns the value of the '<em><b>Tile Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Size X</em>' attribute.
	 * @see #setTileSizeX(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameMap_TileSizeX()
	 * @model
	 * @generated
	 */
	int getTileSizeX();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.GameMap#getTileSizeX <em>Tile Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Size X</em>' attribute.
	 * @see #getTileSizeX()
	 * @generated
	 */
	void setTileSizeX(int value);

	/**
	 * Returns the value of the '<em><b>Tile Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Size Y</em>' attribute.
	 * @see #setTileSizeY(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameMap_TileSizeY()
	 * @model
	 * @generated
	 */
	int getTileSizeY();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.GameMap#getTileSizeY <em>Tile Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Size Y</em>' attribute.
	 * @see #getTileSizeY()
	 * @generated
	 */
	void setTileSizeY(int value);

	/**
	 * Returns the value of the '<em><b>Map Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Size X</em>' attribute.
	 * @see #setMapSizeX(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameMap_MapSizeX()
	 * @model
	 * @generated
	 */
	int getMapSizeX();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.GameMap#getMapSizeX <em>Map Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Size X</em>' attribute.
	 * @see #getMapSizeX()
	 * @generated
	 */
	void setMapSizeX(int value);

	/**
	 * Returns the value of the '<em><b>Map Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Size Y</em>' attribute.
	 * @see #setMapSizeY(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameMap_MapSizeY()
	 * @model
	 * @generated
	 */
	int getMapSizeY();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.GameMap#getMapSizeY <em>Map Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Size Y</em>' attribute.
	 * @see #getMapSizeY()
	 * @generated
	 */
	void setMapSizeY(int value);

} // GameMap
