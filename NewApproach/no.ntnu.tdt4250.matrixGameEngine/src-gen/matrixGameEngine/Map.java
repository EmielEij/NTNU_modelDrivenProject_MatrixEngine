/**
 */
package matrixGameEngine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link matrixGameEngine.Map#getTile <em>Tile</em>}</li>
 *   <li>{@link matrixGameEngine.Map#getAmountOfTiles <em>Amount Of Tiles</em>}</li>
 *   <li>{@link matrixGameEngine.Map#getMapSizeX <em>Map Size X</em>}</li>
 *   <li>{@link matrixGameEngine.Map#getMapSizeY <em>Map Size Y</em>}</li>
 *   <li>{@link matrixGameEngine.Map#getTileSizeY <em>Tile Size Y</em>}</li>
 *   <li>{@link matrixGameEngine.Map#getTileSizeX <em>Tile Size X</em>}</li>
 * </ul>
 *
 * @see matrixGameEngine.MatrixGameEnginePackage#getMap()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mapSizeMustBeSquare mapSizeMustFitScreen tileSizeMustBeSquare'"
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Tile</b></em>' containment reference list.
	 * The list contents are of type {@link matrixGameEngine.Tile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile</em>' containment reference list.
	 * @see matrixGameEngine.MatrixGameEnginePackage#getMap_Tile()
	 * @model containment="true" lower="4"
	 * @generated
	 */
	EList<Tile> getTile();

	/**
	 * Returns the value of the '<em><b>Amount Of Tiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Tiles</em>' attribute.
	 * @see #setAmountOfTiles(int)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getMap_AmountOfTiles()
	 * @model
	 * @generated
	 */
	int getAmountOfTiles();

	/**
	 * Sets the value of the '{@link matrixGameEngine.Map#getAmountOfTiles <em>Amount Of Tiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Tiles</em>' attribute.
	 * @see #getAmountOfTiles()
	 * @generated
	 */
	void setAmountOfTiles(int value);

	/**
	 * Returns the value of the '<em><b>Map Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Size X</em>' attribute.
	 * @see #setMapSizeX(int)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getMap_MapSizeX()
	 * @model
	 * @generated
	 */
	int getMapSizeX();

	/**
	 * Sets the value of the '{@link matrixGameEngine.Map#getMapSizeX <em>Map Size X</em>}' attribute.
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
	 * @see matrixGameEngine.MatrixGameEnginePackage#getMap_MapSizeY()
	 * @model
	 * @generated
	 */
	int getMapSizeY();

	/**
	 * Sets the value of the '{@link matrixGameEngine.Map#getMapSizeY <em>Map Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Size Y</em>' attribute.
	 * @see #getMapSizeY()
	 * @generated
	 */
	void setMapSizeY(int value);

	/**
	 * Returns the value of the '<em><b>Tile Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Size Y</em>' attribute.
	 * @see #setTileSizeY(int)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getMap_TileSizeY()
	 * @model
	 * @generated
	 */
	int getTileSizeY();

	/**
	 * Sets the value of the '{@link matrixGameEngine.Map#getTileSizeY <em>Tile Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Size Y</em>' attribute.
	 * @see #getTileSizeY()
	 * @generated
	 */
	void setTileSizeY(int value);

	/**
	 * Returns the value of the '<em><b>Tile Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Size X</em>' attribute.
	 * @see #setTileSizeX(int)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getMap_TileSizeX()
	 * @model
	 * @generated
	 */
	int getTileSizeX();

	/**
	 * Sets the value of the '{@link matrixGameEngine.Map#getTileSizeX <em>Tile Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Size X</em>' attribute.
	 * @see #getTileSizeX()
	 * @generated
	 */
	void setTileSizeX(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initializeMap();

} // Map
