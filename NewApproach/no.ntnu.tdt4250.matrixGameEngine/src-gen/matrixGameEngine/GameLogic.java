/**
 */
package matrixGameEngine;

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
 *   <li>{@link matrixGameEngine.GameLogic#isMultiplayer <em>Multiplayer</em>}</li>
 *   <li>{@link matrixGameEngine.GameLogic#getPlayer <em>Player</em>}</li>
 *   <li>{@link matrixGameEngine.GameLogic#getGameaction <em>Gameaction</em>}</li>
 *   <li>{@link matrixGameEngine.GameLogic#getMap <em>Map</em>}</li>
 *   <li>{@link matrixGameEngine.GameLogic#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @see matrixGameEngine.MatrixGameEnginePackage#getGameLogic()
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
	 * @see matrixGameEngine.MatrixGameEnginePackage#getGameLogic_Multiplayer()
	 * @model
	 * @generated
	 */
	boolean isMultiplayer();

	/**
	 * Sets the value of the '{@link matrixGameEngine.GameLogic#isMultiplayer <em>Multiplayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplayer</em>' attribute.
	 * @see #isMultiplayer()
	 * @generated
	 */
	void setMultiplayer(boolean value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference list.
	 * The list contents are of type {@link matrixGameEngine.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference list.
	 * @see matrixGameEngine.MatrixGameEnginePackage#getGameLogic_Player()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Player> getPlayer();

	/**
	 * Returns the value of the '<em><b>Gameaction</b></em>' reference list.
	 * The list contents are of type {@link matrixGameEngine.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameaction</em>' reference list.
	 * @see matrixGameEngine.MatrixGameEnginePackage#getGameLogic_Gameaction()
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
	 * @see matrixGameEngine.MatrixGameEnginePackage#getGameLogic_Map()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link matrixGameEngine.GameLogic#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' attribute.
	 * @see #setPlayers(EList)
	 * @see matrixGameEngine.MatrixGameEnginePackage#getGameLogic_Players()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getPlayers();

	/**
	 * Sets the value of the '{@link matrixGameEngine.GameLogic#getPlayers <em>Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Players</em>' attribute.
	 * @see #getPlayers()
	 * @generated
	 */
	void setPlayers(EList<?> value);

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
