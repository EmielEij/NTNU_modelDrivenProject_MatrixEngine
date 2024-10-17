/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.Tile#getTileCordinateX <em>Tile Cordinate X</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Tile#getTileCodinateY <em>Tile Codinate Y</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getTile()
 * @model
 * @generated
 */
public interface Tile extends EObject {
	/**
	 * Returns the value of the '<em><b>Tile Cordinate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Cordinate X</em>' attribute.
	 * @see #setTileCordinateX(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getTile_TileCordinateX()
	 * @model
	 * @generated
	 */
	int getTileCordinateX();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Tile#getTileCordinateX <em>Tile Cordinate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Cordinate X</em>' attribute.
	 * @see #getTileCordinateX()
	 * @generated
	 */
	void setTileCordinateX(int value);

	/**
	 * Returns the value of the '<em><b>Tile Codinate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Codinate Y</em>' attribute.
	 * @see #setTileCodinateY(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getTile_TileCodinateY()
	 * @model
	 * @generated
	 */
	int getTileCodinateY();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Tile#getTileCodinateY <em>Tile Codinate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Codinate Y</em>' attribute.
	 * @see #getTileCodinateY()
	 * @generated
	 */
	void setTileCodinateY(int value);

} // Tile
