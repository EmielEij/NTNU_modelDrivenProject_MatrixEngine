/**
 */
package no.ntnu.tdt4250.matrixgame.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getMultiplayer <em>Multiplayer</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getGameaction <em>Gameaction</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic()
 * @model
 * @generated
 */
public interface GameLogic extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplayer</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.matrixgame.game.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplayer</em>' attribute.
	 * @see no.ntnu.tdt4250.matrixgame.game.ActionType
	 * @see #setMultiplayer(ActionType)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_Multiplayer()
	 * @model
	 * @generated
	 */
	ActionType getMultiplayer();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getMultiplayer <em>Multiplayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplayer</em>' attribute.
	 * @see no.ntnu.tdt4250.matrixgame.game.ActionType
	 * @see #getMultiplayer()
	 * @generated
	 */
	void setMultiplayer(ActionType value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.matrixgame.game.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference list.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_Player()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Player> getPlayer();

	/**
	 * Returns the value of the '<em><b>Gameaction</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.matrixgame.game.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameaction</em>' reference list.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_Gameaction()
	 * @model
	 * @generated
	 */
	EList<Action> getGameaction();

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(Map)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_Map()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	State applyAction(Action action, Tile tile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void isGameOver();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tile generateStartingPosition();

} // GameLogic
