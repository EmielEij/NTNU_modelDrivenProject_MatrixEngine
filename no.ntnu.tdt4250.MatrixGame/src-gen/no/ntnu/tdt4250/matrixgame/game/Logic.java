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
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Logic#getGameBoard <em>Game Board</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Logic#isRules <em>Rules</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Logic#getPlayer1 <em>Player1</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Logic#getPlayer2 <em>Player2</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Logic#getRule <em>Rule</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Logic#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Logic#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getLogic()
 * @model
 * @generated
 */
public interface Logic extends EObject {
	/**
	 * Returns the value of the '<em><b>Game Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Board</em>' attribute.
	 * @see #setGameBoard(char)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getLogic_GameBoard()
	 * @model
	 * @generated
	 */
	char getGameBoard();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Logic#getGameBoard <em>Game Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Board</em>' attribute.
	 * @see #getGameBoard()
	 * @generated
	 */
	void setGameBoard(char value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' attribute.
	 * @see #setRules(boolean)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getLogic_Rules()
	 * @model
	 * @generated
	 */
	boolean isRules();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Logic#isRules <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' attribute.
	 * @see #isRules()
	 * @generated
	 */
	void setRules(boolean value);

	/**
	 * Returns the value of the '<em><b>Player1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player1</em>' attribute.
	 * @see #setPlayer1(Boolean)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getLogic_Player1()
	 * @model
	 * @generated
	 */
	Boolean getPlayer1();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Logic#getPlayer1 <em>Player1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player1</em>' attribute.
	 * @see #getPlayer1()
	 * @generated
	 */
	void setPlayer1(Boolean value);

	/**
	 * Returns the value of the '<em><b>Player2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player2</em>' attribute.
	 * @see #setPlayer2(Boolean)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getLogic_Player2()
	 * @model
	 * @generated
	 */
	Boolean getPlayer2();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Logic#getPlayer2 <em>Player2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player2</em>' attribute.
	 * @see #getPlayer2()
	 * @generated
	 */
	void setPlayer2(Boolean value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Rule)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getLogic_Rule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Logic#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.matrixgame.game.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference list.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getLogic_Player()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Player> getPlayer();

	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getLogic_Board()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Logic#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void startGame();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

} // Logic
