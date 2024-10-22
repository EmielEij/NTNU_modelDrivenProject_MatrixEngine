/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.ActionType#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.ActionType#getValidTiles <em>Valid Tiles</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getActionType()
 * @model
 * @generated
 */
public interface ActionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getActionType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.ActionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Valid Tiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Tiles</em>' attribute.
	 * @see #setValidTiles(EList)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getActionType_ValidTiles()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getValidTiles();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.ActionType#getValidTiles <em>Valid Tiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Tiles</em>' attribute.
	 * @see #getValidTiles()
	 * @generated
	 */
	void setValidTiles(EList<?> value);

} // ActionType
