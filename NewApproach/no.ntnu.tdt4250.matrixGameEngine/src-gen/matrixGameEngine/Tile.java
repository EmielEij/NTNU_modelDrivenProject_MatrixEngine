/**
 */
package matrixGameEngine;

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
 *   <li>{@link matrixGameEngine.Tile#isIsAccessible <em>Is Accessible</em>}</li>
 *   <li>{@link matrixGameEngine.Tile#getColor <em>Color</em>}</li>
 *   <li>{@link matrixGameEngine.Tile#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link matrixGameEngine.Tile#getYCoordinate <em>YCoordinate</em>}</li>
 * </ul>
 *
 * @see matrixGameEngine.MatrixGameEnginePackage#getTile()
 * @model
 * @generated
 */
public interface Tile extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Accessible</em>' attribute.
	 * @see #setIsAccessible(boolean)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getTile_IsAccessible()
	 * @model
	 * @generated
	 */
	boolean isIsAccessible();

	/**
	 * Sets the value of the '{@link matrixGameEngine.Tile#isIsAccessible <em>Is Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Accessible</em>' attribute.
	 * @see #isIsAccessible()
	 * @generated
	 */
	void setIsAccessible(boolean value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getTile_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link matrixGameEngine.Tile#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCoordinate</em>' attribute.
	 * @see #setXCoordinate(int)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getTile_XCoordinate()
	 * @model required="true"
	 * @generated
	 */
	int getXCoordinate();

	/**
	 * Sets the value of the '{@link matrixGameEngine.Tile#getXCoordinate <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XCoordinate</em>' attribute.
	 * @see #getXCoordinate()
	 * @generated
	 */
	void setXCoordinate(int value);

	/**
	 * Returns the value of the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCoordinate</em>' attribute.
	 * @see #setYCoordinate(int)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getTile_YCoordinate()
	 * @model required="true"
	 * @generated
	 */
	int getYCoordinate();

	/**
	 * Sets the value of the '{@link matrixGameEngine.Tile#getYCoordinate <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCoordinate</em>' attribute.
	 * @see #getYCoordinate()
	 * @generated
	 */
	void setYCoordinate(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	TileType getTileType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void interact(Action action);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reveal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void toggle();

} // Tile
