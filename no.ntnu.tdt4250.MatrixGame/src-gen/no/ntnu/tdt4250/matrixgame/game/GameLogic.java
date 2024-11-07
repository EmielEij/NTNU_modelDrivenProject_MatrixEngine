/**
 */
package no.ntnu.tdt4250.matrixgame.game;

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
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getGameName <em>Game Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getPlayerX <em>Player X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getPlayerO <em>Player O</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getMapLength <em>Map Length</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getGrid <em>Grid</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getCurrentPlayer <em>Current Player</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic()
 * @model
 * @generated
 */
public interface GameLogic extends EObject {
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
	 * Returns the value of the '<em><b>Player X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player X</em>' attribute.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_PlayerX()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	char getPlayerX();

	/**
	 * Returns the value of the '<em><b>Player O</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player O</em>' attribute.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_PlayerO()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	char getPlayerO();

	/**
	 * Returns the value of the '<em><b>Map Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Length</em>' attribute.
	 * @see #setMapLength(int)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_MapLength()
	 * @model
	 * @generated
	 */
	int getMapLength();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getMapLength <em>Map Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Length</em>' attribute.
	 * @see #getMapLength()
	 * @generated
	 */
	void setMapLength(int value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(Grid)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_Grid()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Grid getGrid();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getGrid <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(Grid value);

	/**
	 * Returns the value of the '<em><b>Current Player</b></em>' attribute.
	 * The default value is <code>"playerX"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Player</em>' attribute.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getGameLogic_CurrentPlayer()
	 * @model default="playerX" required="true" changeable="false"
	 * @generated
	 */
	char getCurrentPlayer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void switchPlayer();

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
	boolean checkWin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rowDataType="org.eclipse.emf.ecore.xml.type.Int" colDataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	void makeMove(int row, int col);

} // GameLogic
