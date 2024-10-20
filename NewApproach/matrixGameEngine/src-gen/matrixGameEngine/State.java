/**
 */
package matrixGameEngine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link matrixGameEngine.State#getTurnsTaken <em>Turns Taken</em>}</li>
 *   <li>{@link matrixGameEngine.State#isFlagsPlaced <em>Flags Placed</em>}</li>
 *   <li>{@link matrixGameEngine.State#isIsOver <em>Is Over</em>}</li>
 *   <li>{@link matrixGameEngine.State#getTile <em>Tile</em>}</li>
 * </ul>
 *
 * @see matrixGameEngine.MatrixGameEnginePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Turns Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turns Taken</em>' attribute.
	 * @see #setTurnsTaken(int)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getState_TurnsTaken()
	 * @model
	 * @generated
	 */
	int getTurnsTaken();

	/**
	 * Sets the value of the '{@link matrixGameEngine.State#getTurnsTaken <em>Turns Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turns Taken</em>' attribute.
	 * @see #getTurnsTaken()
	 * @generated
	 */
	void setTurnsTaken(int value);

	/**
	 * Returns the value of the '<em><b>Flags Placed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags Placed</em>' attribute.
	 * @see #setFlagsPlaced(boolean)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getState_FlagsPlaced()
	 * @model
	 * @generated
	 */
	boolean isFlagsPlaced();

	/**
	 * Sets the value of the '{@link matrixGameEngine.State#isFlagsPlaced <em>Flags Placed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags Placed</em>' attribute.
	 * @see #isFlagsPlaced()
	 * @generated
	 */
	void setFlagsPlaced(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Over</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Over</em>' attribute.
	 * @see #setIsOver(boolean)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getState_IsOver()
	 * @model
	 * @generated
	 */
	boolean isIsOver();

	/**
	 * Sets the value of the '{@link matrixGameEngine.State#isIsOver <em>Is Over</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Over</em>' attribute.
	 * @see #isIsOver()
	 * @generated
	 */
	void setIsOver(boolean value);

	/**
	 * Returns the value of the '<em><b>Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile</em>' reference.
	 * @see #setTile(Tile)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getState_Tile()
	 * @model required="true"
	 * @generated
	 */
	Tile getTile();

	/**
	 * Sets the value of the '{@link matrixGameEngine.State#getTile <em>Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile</em>' reference.
	 * @see #getTile()
	 * @generated
	 */
	void setTile(Tile value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Tile getCurrentStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Player getPlayersTurn();

} // State
