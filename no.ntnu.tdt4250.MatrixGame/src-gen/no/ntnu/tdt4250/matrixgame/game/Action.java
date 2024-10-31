/**
 */
package no.ntnu.tdt4250.matrixgame.game;

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
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Action#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Action#getActionType <em>Action Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Action#getChange_Accessbility <em>Change Accessbility</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.Action#getChange_State <em>Change State</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.matrixgame.game.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see no.ntnu.tdt4250.matrixgame.game.ActionType
	 * @see #setActionType(ActionType)
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getAction_ActionType()
	 * @model
	 * @generated
	 */
	ActionType getActionType();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.matrixgame.game.Action#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see no.ntnu.tdt4250.matrixgame.game.ActionType
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(ActionType value);

	/**
	 * Returns the value of the '<em><b>Change Accessbility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Accessbility</em>' reference.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getAction_Change_Accessbility()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	Tile getChange_Accessbility();

	/**
	 * Returns the value of the '<em><b>Change State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change State</em>' reference.
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getAction_Change_State()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	State getChange_State();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void performAction();

} // Action
