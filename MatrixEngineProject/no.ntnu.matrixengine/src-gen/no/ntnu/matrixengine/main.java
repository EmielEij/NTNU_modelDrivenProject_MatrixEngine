/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.main#getSetup <em>Setup</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.main#getUpdatefield <em>Updatefield</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.main#getGameover <em>Gameover</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.main#getGetuserinput <em>Getuserinput</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getmain()
 * @model
 * @generated
 */
public interface main extends EObject {
	/**
	 * Returns the value of the '<em><b>Setup</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.matrixengine.Setup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup</em>' containment reference list.
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getmain_Setup()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setup> getSetup();

	/**
	 * Returns the value of the '<em><b>Updatefield</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.matrixengine.UpdateField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updatefield</em>' containment reference list.
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getmain_Updatefield()
	 * @model containment="true"
	 * @generated
	 */
	EList<UpdateField> getUpdatefield();

	/**
	 * Returns the value of the '<em><b>Gameover</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.matrixengine.GameOver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameover</em>' containment reference list.
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getmain_Gameover()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameOver> getGameover();

	/**
	 * Returns the value of the '<em><b>Getuserinput</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.matrixengine.GetUserInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getuserinput</em>' containment reference list.
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getmain_Getuserinput()
	 * @model containment="true"
	 * @generated
	 */
	EList<GetUserInput> getGetuserinput();

} // main
