/**
 */
package matrixGames.impl;

import java.lang.reflect.InvocationTargetException;

import matrixGames.Board;
import matrixGames.MatrixGamesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link matrixGames.impl.BoardImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link matrixGames.impl.BoardImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link matrixGames.impl.BoardImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link matrixGames.impl.BoardImpl#getBoardName <em>Board Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends MinimalEObjectImpl.Container implements Board {
	/**
	 * The default value of the '{@link #getBoard() <em>Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected static final int BOARD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected int board = BOARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected int rows = ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected int columns = COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoardName() <em>Board Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardName()
	 * @generated
	 * @ordered
	 */
	protected static final String BOARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoardName() <em>Board Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardName()
	 * @generated
	 * @ordered
	 */
	protected String boardName = BOARD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixGamesPackage.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoard(int newBoard) {
		int oldBoard = board;
		board = newBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGamesPackage.BOARD__BOARD, oldBoard, board));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRows(int newRows) {
		int oldRows = rows;
		rows = newRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGamesPackage.BOARD__ROWS, oldRows, rows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGamesPackage.BOARD__COLUMNS, oldColumns,
					columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBoardName() {
		return boardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoardName(String newBoardName) {
		String oldBoardName = boardName;
		boardName = newBoardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGamesPackage.BOARD__BOARD_NAME, oldBoardName,
					boardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void displayBoard() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean dropPiece() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getGameBoard() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MatrixGamesPackage.BOARD__BOARD:
			return getBoard();
		case MatrixGamesPackage.BOARD__ROWS:
			return getRows();
		case MatrixGamesPackage.BOARD__COLUMNS:
			return getColumns();
		case MatrixGamesPackage.BOARD__BOARD_NAME:
			return getBoardName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MatrixGamesPackage.BOARD__BOARD:
			setBoard((Integer) newValue);
			return;
		case MatrixGamesPackage.BOARD__ROWS:
			setRows((Integer) newValue);
			return;
		case MatrixGamesPackage.BOARD__COLUMNS:
			setColumns((Integer) newValue);
			return;
		case MatrixGamesPackage.BOARD__BOARD_NAME:
			setBoardName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MatrixGamesPackage.BOARD__BOARD:
			setBoard(BOARD_EDEFAULT);
			return;
		case MatrixGamesPackage.BOARD__ROWS:
			setRows(ROWS_EDEFAULT);
			return;
		case MatrixGamesPackage.BOARD__COLUMNS:
			setColumns(COLUMNS_EDEFAULT);
			return;
		case MatrixGamesPackage.BOARD__BOARD_NAME:
			setBoardName(BOARD_NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MatrixGamesPackage.BOARD__BOARD:
			return board != BOARD_EDEFAULT;
		case MatrixGamesPackage.BOARD__ROWS:
			return rows != ROWS_EDEFAULT;
		case MatrixGamesPackage.BOARD__COLUMNS:
			return columns != COLUMNS_EDEFAULT;
		case MatrixGamesPackage.BOARD__BOARD_NAME:
			return BOARD_NAME_EDEFAULT == null ? boardName != null : !BOARD_NAME_EDEFAULT.equals(boardName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MatrixGamesPackage.BOARD___DISPLAY_BOARD:
			displayBoard();
			return null;
		case MatrixGamesPackage.BOARD___DROP_PIECE:
			return dropPiece();
		case MatrixGamesPackage.BOARD___GET_GAME_BOARD:
			return getGameBoard();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (board: ");
		result.append(board);
		result.append(", rows: ");
		result.append(rows);
		result.append(", columns: ");
		result.append(columns);
		result.append(", boardName: ");
		result.append(boardName);
		result.append(')');
		return result.toString();
	}

} //BoardImpl
