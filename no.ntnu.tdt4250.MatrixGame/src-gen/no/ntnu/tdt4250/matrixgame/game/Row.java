/**
 */
package no.ntnu.tdt4250.matrixgame.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Row#getCells <em>Cells</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Row#getCell <em>Cell</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.common.util.EList}<code>&lt;no.ntnu.tdt4250.matrixgame.game.Cell&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' attribute list.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getRow_Cells()
	 * @model required="true" transient="true"
	 * @generated
	 */
	EList<EList<Cell>> getCells();

	/**
	 * Returns the value of the '<em><b>Cell</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.matrixgame.game.Cell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' containment reference list.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getRow_Cell()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<Cell> getCell();

} // Row
