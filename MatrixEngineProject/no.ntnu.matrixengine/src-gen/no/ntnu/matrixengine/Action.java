/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.Action#getActiontype <em>Actiontype</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Action#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Actiontype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actiontype</em>' reference.
	 * @see #setActiontype(ActionType)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getAction_Actiontype()
	 * @model required="true"
	 * @generated
	 */
	ActionType getActiontype();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Action#getActiontype <em>Actiontype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actiontype</em>' reference.
	 * @see #getActiontype()
	 * @generated
	 */
	void setActiontype(ActionType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void performAction();

} // Action
