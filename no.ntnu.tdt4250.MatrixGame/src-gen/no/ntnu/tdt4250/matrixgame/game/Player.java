/**
 */
package no.ntnu.tdt4250.matrixgame.game;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Player#getScore <em>Score</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Player#getState <em>State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Player#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(int)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getPlayer_Score()
	 * @model
	 * @generated
	 */
	int getScore();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Player#getScore <em>Score</em>}' attribute.
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
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getPlayer_State()
	 * @model required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Player#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.matrixgame.game.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getPlayer_Action()
	 * @model
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void takeAction();

} // Player
