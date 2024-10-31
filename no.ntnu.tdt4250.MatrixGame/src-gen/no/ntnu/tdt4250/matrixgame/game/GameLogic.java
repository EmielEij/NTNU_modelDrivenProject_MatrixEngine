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
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getMap <em>Map</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getActions_played <em>Actions played</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getHas_state <em>Has state</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getGameName <em>Game Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic()
 * @model
 * @generated
 */
public interface GameLogic extends EObject {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference.
	 * @see #setPlayer(Player)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_Player()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getPlayer <em>Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' containment reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

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
	 * Returns the value of the '<em><b>Actions played</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.matrixgame.game.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions played</em>' containment reference list.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_Actions_played()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions_played();

	/**
	 * Returns the value of the '<em><b>Has state</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.matrixgame.game.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has state</em>' containment reference list.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_Has_state()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getHas_state();

	/**
	 * Returns the value of the '<em><b>Game Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Name</em>' attribute.
	 * @see #setGameName(String)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_GameName()
	 * @model
	 * @generated
	 */
	String getGameName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getGameName <em>Game Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Name</em>' attribute.
	 * @see #getGameName()
	 * @generated
	 */
	void setGameName(String value);

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
