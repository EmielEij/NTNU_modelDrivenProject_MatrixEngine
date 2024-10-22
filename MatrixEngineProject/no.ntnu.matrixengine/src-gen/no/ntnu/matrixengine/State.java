/**
 */
package no.ntnu.matrixengine;

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
 *   <li>{@link no.ntnu.matrixengine.State#getMap <em>Map</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.State#getTurnsTaken <em>Turns Taken</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.State#getFlagsPlaced <em>Flags Placed</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.State#isIsOver <em>Is Over</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(GameMap)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getState_Map()
	 * @model
	 * @generated
	 */
	GameMap getMap();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.State#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(GameMap value);

	/**
	 * Returns the value of the '<em><b>Turns Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turns Taken</em>' attribute.
	 * @see #setTurnsTaken(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getState_TurnsTaken()
	 * @model
	 * @generated
	 */
	int getTurnsTaken();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.State#getTurnsTaken <em>Turns Taken</em>}' attribute.
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
	 * @see #setFlagsPlaced(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getState_FlagsPlaced()
	 * @model
	 * @generated
	 */
	int getFlagsPlaced();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.State#getFlagsPlaced <em>Flags Placed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags Placed</em>' attribute.
	 * @see #getFlagsPlaced()
	 * @generated
	 */
	void setFlagsPlaced(int value);

	/**
	 * Returns the value of the '<em><b>Is Over</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Over</em>' attribute.
	 * @see #setIsOver(boolean)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getState_IsOver()
	 * @model
	 * @generated
	 */
	boolean isIsOver();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.State#isIsOver <em>Is Over</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Over</em>' attribute.
	 * @see #isIsOver()
	 * @generated
	 */
	void setIsOver(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Tile getCurrentTile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Player getPlayersTurn();

} // State
