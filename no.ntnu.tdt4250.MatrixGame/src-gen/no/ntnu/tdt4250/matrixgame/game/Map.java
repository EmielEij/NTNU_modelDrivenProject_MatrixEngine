/**
 */
package no.ntnu.tdt4250.matrixgame.game;

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
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Map#getTile <em>Tile</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Map#getAmountOfTiles <em>Amount Of Tiles</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Map#getMapSizeX <em>Map Size X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Map#getMapSizeY <em>Map Size Y</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Map#getMapName <em>Map Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getMap()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mapSizeMustBeSquare mapSizeMustFitScreen tileSizeMustBeSquare'"
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Tile</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.matrixgame.game.Tile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile</em>' containment reference list.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getMap_Tile()
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
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getMap_AmountOfTiles()
	 * @model
	 * @generated
	 */
	int getAmountOfTiles();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Map#getAmountOfTiles <em>Amount Of Tiles</em>}' attribute.
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
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getMap_MapSizeX()
	 * @model required="true"
	 * @generated
	 */
	int getMapSizeX();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Map#getMapSizeX <em>Map Size X</em>}' attribute.
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
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getMap_MapSizeY()
	 * @model required="true"
	 * @generated
	 */
	int getMapSizeY();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Map#getMapSizeY <em>Map Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Size Y</em>' attribute.
	 * @see #getMapSizeY()
	 * @generated
	 */
	void setMapSizeY(int value);

	/**
	 * Returns the value of the '<em><b>Map Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Name</em>' attribute.
	 * @see #setMapName(String)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getMap_MapName()
	 * @model
	 * @generated
	 */
	String getMapName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Map#getMapName <em>Map Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Name</em>' attribute.
	 * @see #getMapName()
	 * @generated
	 */
	void setMapName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initializeMap();

} // Map
