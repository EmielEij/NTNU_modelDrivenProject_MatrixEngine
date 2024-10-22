/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.Player#getTime <em>Time</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Player#getScore <em>Score</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Player#getState <em>State</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Player#getGamelogic <em>Gamelogic</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getPlayer_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Player#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getPlayer_Score()
	 * @model
	 * @generated
	 */
	int getScore();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Player#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(int value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getPlayer_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Player#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Gamelogic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamelogic</em>' reference.
	 * @see #setGamelogic(GameLogic)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getPlayer_Gamelogic()
	 * @model
	 * @generated
	 */
	GameLogic getGamelogic();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Player#getGamelogic <em>Gamelogic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamelogic</em>' reference.
	 * @see #getGamelogic()
	 * @generated
	 */
	void setGamelogic(GameLogic value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void takeAction();

} // Player
