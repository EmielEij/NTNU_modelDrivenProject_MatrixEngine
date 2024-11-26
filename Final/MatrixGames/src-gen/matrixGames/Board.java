/**
 */
package matrixGames;

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
 *   <li>{@link matrixGames.Board#getBoard <em>Board</em>}</li>
 *   <li>{@link matrixGames.Board#getRows <em>Rows</em>}</li>
 *   <li>{@link matrixGames.Board#getColumns <em>Columns</em>}</li>
 *   <li>{@link matrixGames.Board#getBoardName <em>Board Name</em>}</li>
 *   <li>{@link matrixGames.Board#getDepends_on <em>Depends on</em>}</li>
 * </ul>
 *
 * @see matrixGames.MatrixGamesPackage#getBoard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atLeast2RowsAnd2Columns'"
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' attribute.
	 * @see #setBoard(int)
	 * @see matrixGames.MatrixGamesPackage#getBoard_Board()
	 * @model required="true"
	 * @generated
	 */
	int getBoard();

	/**
	 * Sets the value of the '{@link matrixGames.Board#getBoard <em>Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' attribute.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(int value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see matrixGames.MatrixGamesPackage#getBoard_Rows()
	 * @model required="true"
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link matrixGames.Board#getRows <em>Rows</em>}' attribute.
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
	 * @see matrixGames.MatrixGamesPackage#getBoard_Columns()
	 * @model required="true"
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link matrixGames.Board#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

	/**
	 * Returns the value of the '<em><b>Board Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Name</em>' attribute.
	 * @see #setBoardName(String)
	 * @see matrixGames.MatrixGamesPackage#getBoard_BoardName()
	 * @model required="true"
	 * @generated
	 */
	String getBoardName();

	/**
	 * Sets the value of the '{@link matrixGames.Board#getBoardName <em>Board Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Name</em>' attribute.
	 * @see #getBoardName()
	 * @generated
	 */
	void setBoardName(String value);

	/**
	 * Returns the value of the '<em><b>Depends on</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends on</em>' reference.
	 * @see matrixGames.MatrixGamesPackage#getBoard_Depends_on()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Rule getDepends_on();

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
	 * @model
	 * @generated
	 */
	boolean dropPiece();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	char getGameBoard();

} // Board
