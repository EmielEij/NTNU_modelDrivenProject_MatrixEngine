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
 * </ul>
 *
 * @see matrixGameEngine.MatrixGameEnginePackage#getMap()
 * @model
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initializeMap();

} // Map
