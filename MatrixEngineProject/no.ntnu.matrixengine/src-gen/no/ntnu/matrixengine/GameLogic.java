/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Logic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.GameLogic#isMultiplayer <em>Multiplayer</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.GameLogic#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.GameLogic#getSetup <em>Setup</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.GameLogic#getMap <em>Map</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.GameLogic#getGameaction <em>Gameaction</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameLogic()
 * @model
 * @generated
 */
public interface GameLogic extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplayer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplayer</em>' attribute.
	 * @see #setMultiplayer(boolean)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameLogic_Multiplayer()
	 * @model
	 * @generated
	 */
	boolean isMultiplayer();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.GameLogic#isMultiplayer <em>Multiplayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplayer</em>' attribute.
	 * @see #isMultiplayer()
	 * @generated
	 */
	void setMultiplayer(boolean value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.matrixengine.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference list.
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameLogic_Player()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Player> getPlayer();

	/**
	 * Returns the value of the '<em><b>Setup</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.matrixengine.Setup#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup</em>' reference.
	 * @see #setSetup(Setup)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameLogic_Setup()
	 * @see no.ntnu.matrixengine.Setup#getGame
	 * @model opposite="game"
	 * @generated
	 */
	Setup getSetup();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.GameLogic#getSetup <em>Setup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setup</em>' reference.
	 * @see #getSetup()
	 * @generated
	 */
	void setSetup(Setup value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(GameMap)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameLogic_Map()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GameMap getMap();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.GameLogic#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(GameMap value);

	/**
	 * Returns the value of the '<em><b>Gameaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameaction</em>' reference.
	 * @see #setGameaction(Action)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getGameLogic_Gameaction()
	 * @model
	 * @generated
	 */
	Action getGameaction();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.GameLogic#getGameaction <em>Gameaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameaction</em>' reference.
	 * @see #getGameaction()
	 * @generated
	 */
	void setGameaction(Action value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void applyAction(ActionType action, Tile tile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkWinCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void isGameOver();

} // GameLogic
