/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.Setup#getGame <em>Game</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Setup#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getSetup()
 * @model
 * @generated
 */
public interface Setup extends EObject {
	/**
	 * Returns the value of the '<em><b>Game</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.matrixengine.GameLogic#getSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' reference.
	 * @see #setGame(GameLogic)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getSetup_Game()
	 * @see no.ntnu.matrixengine.GameLogic#getSetup
	 * @model opposite="setup"
	 * @generated
	 */
	GameLogic getGame();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Setup#getGame <em>Game</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(GameLogic value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getSetup_Map()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	GameMap getMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void InitField();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GameLogic loadGame();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tile setStartTile();

} // Setup
