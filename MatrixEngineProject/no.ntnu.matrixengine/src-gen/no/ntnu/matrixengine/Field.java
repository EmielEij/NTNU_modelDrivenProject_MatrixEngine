/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.Field#getTile <em>Tile</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Tile</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.matrixengine.Tile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile</em>' containment reference list.
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getField_Tile()
	 * @model containment="true" lower="4"
	 * @generated
	 */
	EList<Tile> getTile();

} // Field
