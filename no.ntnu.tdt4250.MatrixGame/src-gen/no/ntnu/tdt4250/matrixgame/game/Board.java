/**
 */
package no.ntnu.tdt4250.matrixgame.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Board#getBoard <em>Board</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Board#getRows <em>Rows</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Board#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' attribute.
	 * @see #setBoard(char)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getBoard_Board()
	 * @model required="true"
	 * @generated
	 */
	char getBoard();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Board#getBoard <em>Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' attribute.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(char value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getBoard_Rows()
	 * @model required="true"
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Board#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getBoard_Columns()
	 * @model required="true"
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Board#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void displayBoard();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean dropPiece();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	char getGameBoard();

} // Board
