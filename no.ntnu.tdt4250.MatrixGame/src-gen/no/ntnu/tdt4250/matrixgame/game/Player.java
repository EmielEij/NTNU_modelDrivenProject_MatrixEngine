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
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Player#getTakes_action <em>Takes action</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Player#getName <em>Name</em>}</li>
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
	 * Returns the value of the '<em><b>Takes action</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.matrixgame.game.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Takes action</em>' reference list.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getPlayer_Takes_action()
	 * @model
	 * @generated
	 */
	EList<Action> getTakes_action();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void takeAction();

} // Player
