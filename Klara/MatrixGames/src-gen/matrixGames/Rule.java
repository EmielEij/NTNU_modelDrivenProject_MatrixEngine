/**
 */
package matrixGames;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link matrixGames.Rule#getRows <em>Rows</em>}</li>
 *   <li>{@link matrixGames.Rule#getColumns <em>Columns</em>}</li>
 *   <li>{@link matrixGames.Rule#getLogic <em>Logic</em>}</li>
 * </ul>
 *
 * @see matrixGames.MatrixGamesPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(Integer)
	 * @see matrixGames.MatrixGamesPackage#getRule_Rows()
	 * @model required="true"
	 * @generated
	 */
	Integer getRows();

	/**
	 * Sets the value of the '{@link matrixGames.Rule#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(Integer value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(Integer)
	 * @see matrixGames.MatrixGamesPackage#getRule_Columns()
	 * @model required="true"
	 * @generated
	 */
	Integer getColumns();

	/**
	 * Sets the value of the '{@link matrixGames.Rule#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(Integer value);

	/**
	 * Returns the value of the '<em><b>Logic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic</em>' containment reference.
	 * @see #setLogic(Logic)
	 * @see matrixGames.MatrixGamesPackage#getRule_Logic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Logic getLogic();

	/**
	 * Sets the value of the '{@link matrixGames.Rule#getLogic <em>Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' containment reference.
	 * @see #getLogic()
	 * @generated
	 */
	void setLogic(Logic value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkWinner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void isBoardFull();

} // Rule
