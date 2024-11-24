/**
 */
package matrixGames.impl;

import java.lang.reflect.InvocationTargetException;
import matrixGames.MatrixGamesPackage;
import matrixGames.Rule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link matrixGames.impl.RuleImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link matrixGames.impl.RuleImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected Integer rows = ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected Integer columns = COLUMNS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixGamesPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRows(Integer newRows) {
		Integer oldRows = rows;
		rows = newRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGamesPackage.RULE__ROWS, oldRows, rows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumns(Integer newColumns) {
		Integer oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGamesPackage.RULE__COLUMNS, oldColumns,
					columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean checkWinner() {
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
	public Boolean isBoardFull() {
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
		case MatrixGamesPackage.RULE__ROWS:
			return getRows();
		case MatrixGamesPackage.RULE__COLUMNS:
			return getColumns();
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
		case MatrixGamesPackage.RULE__ROWS:
			setRows((Integer) newValue);
			return;
		case MatrixGamesPackage.RULE__COLUMNS:
			setColumns((Integer) newValue);
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
		case MatrixGamesPackage.RULE__ROWS:
			setRows(ROWS_EDEFAULT);
			return;
		case MatrixGamesPackage.RULE__COLUMNS:
			setColumns(COLUMNS_EDEFAULT);
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
		case MatrixGamesPackage.RULE__ROWS:
			return ROWS_EDEFAULT == null ? rows != null : !ROWS_EDEFAULT.equals(rows);
		case MatrixGamesPackage.RULE__COLUMNS:
			return COLUMNS_EDEFAULT == null ? columns != null : !COLUMNS_EDEFAULT.equals(columns);
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
		case MatrixGamesPackage.RULE___CHECK_WINNER:
			return checkWinner();
		case MatrixGamesPackage.RULE___IS_BOARD_FULL:
			return isBoardFull();
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
		result.append(" (rows: ");
		result.append(rows);
		result.append(", columns: ");
		result.append(columns);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
