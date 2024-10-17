/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.matrixengine.MatrixenginePackage
 * @generated
 */
public interface MatrixengineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatrixengineFactory eINSTANCE = no.ntnu.matrixengine.impl.MatrixengineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>main</em>'.
	 * @generated
	 */
	main createmain();

	/**
	 * Returns a new object of class '<em>Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setup</em>'.
	 * @generated
	 */
	Setup createSetup();

	/**
	 * Returns a new object of class '<em>Update Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Field</em>'.
	 * @generated
	 */
	UpdateField createUpdateField();

	/**
	 * Returns a new object of class '<em>Game Over</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Over</em>'.
	 * @generated
	 */
	GameOver createGameOver();

	/**
	 * Returns a new object of class '<em>Get User Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get User Input</em>'.
	 * @generated
	 */
	GetUserInput createGetUserInput();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tile</em>'.
	 * @generated
	 */
	Tile createTile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MatrixenginePackage getMatrixenginePackage();

} //MatrixengineFactory
