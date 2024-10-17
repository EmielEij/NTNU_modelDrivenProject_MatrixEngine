/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.matrixengine.MatrixengineFactory
 * @model kind="package"
 * @generated
 */
public interface MatrixenginePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "matrixengine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/matrixengine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "matrixengine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatrixenginePackage eINSTANCE = no.ntnu.matrixengine.impl.MatrixenginePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.mainImpl <em>main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.mainImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getmain()
	 * @generated
	 */
	int MAIN = 0;

	/**
	 * The feature id for the '<em><b>Setup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__SETUP = 0;

	/**
	 * The feature id for the '<em><b>Updatefield</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__UPDATEFIELD = 1;

	/**
	 * The feature id for the '<em><b>Gameover</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__GAMEOVER = 2;

	/**
	 * The feature id for the '<em><b>Getuserinput</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__GETUSERINPUT = 3;

	/**
	 * The number of structural features of the '<em>main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.SetupImpl <em>Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.SetupImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getSetup()
	 * @generated
	 */
	int SETUP = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP__FIELD = 0;

	/**
	 * The number of structural features of the '<em>Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.UpdateFieldImpl <em>Update Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.UpdateFieldImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getUpdateField()
	 * @generated
	 */
	int UPDATE_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FIELD__FIELD = 0;

	/**
	 * The number of structural features of the '<em>Update Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FIELD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Update Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.GameOverImpl <em>Game Over</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.GameOverImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getGameOver()
	 * @generated
	 */
	int GAME_OVER = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OVER__FIELD = 0;

	/**
	 * The number of structural features of the '<em>Game Over</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OVER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Game Over</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.GetUserInputImpl <em>Get User Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.GetUserInputImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getGetUserInput()
	 * @generated
	 */
	int GET_USER_INPUT = 4;

	/**
	 * The number of structural features of the '<em>Get User Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_USER_INPUT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get User Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_USER_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.FieldImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getField()
	 * @generated
	 */
	int FIELD = 5;

	/**
	 * The feature id for the '<em><b>Tile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TILE = 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.TileImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getTile()
	 * @generated
	 */
	int TILE = 6;

	/**
	 * The feature id for the '<em><b>Tile Cordinate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TILE_CORDINATE_X = 0;

	/**
	 * The feature id for the '<em><b>Tile Codinate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TILE_CODINATE_Y = 1;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.main <em>main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>main</em>'.
	 * @see no.ntnu.matrixengine.main
	 * @generated
	 */
	EClass getmain();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.matrixengine.main#getSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setup</em>'.
	 * @see no.ntnu.matrixengine.main#getSetup()
	 * @see #getmain()
	 * @generated
	 */
	EReference getmain_Setup();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.matrixengine.main#getUpdatefield <em>Updatefield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Updatefield</em>'.
	 * @see no.ntnu.matrixengine.main#getUpdatefield()
	 * @see #getmain()
	 * @generated
	 */
	EReference getmain_Updatefield();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.matrixengine.main#getGameover <em>Gameover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gameover</em>'.
	 * @see no.ntnu.matrixengine.main#getGameover()
	 * @see #getmain()
	 * @generated
	 */
	EReference getmain_Gameover();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.matrixengine.main#getGetuserinput <em>Getuserinput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Getuserinput</em>'.
	 * @see no.ntnu.matrixengine.main#getGetuserinput()
	 * @see #getmain()
	 * @generated
	 */
	EReference getmain_Getuserinput();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.Setup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setup</em>'.
	 * @see no.ntnu.matrixengine.Setup
	 * @generated
	 */
	EClass getSetup();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.Setup#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see no.ntnu.matrixengine.Setup#getField()
	 * @see #getSetup()
	 * @generated
	 */
	EReference getSetup_Field();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.UpdateField <em>Update Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Field</em>'.
	 * @see no.ntnu.matrixengine.UpdateField
	 * @generated
	 */
	EClass getUpdateField();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.UpdateField#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see no.ntnu.matrixengine.UpdateField#getField()
	 * @see #getUpdateField()
	 * @generated
	 */
	EReference getUpdateField_Field();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.GameOver <em>Game Over</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Over</em>'.
	 * @see no.ntnu.matrixengine.GameOver
	 * @generated
	 */
	EClass getGameOver();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.GameOver#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see no.ntnu.matrixengine.GameOver#getField()
	 * @see #getGameOver()
	 * @generated
	 */
	EReference getGameOver_Field();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.GetUserInput <em>Get User Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get User Input</em>'.
	 * @see no.ntnu.matrixengine.GetUserInput
	 * @generated
	 */
	EClass getGetUserInput();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see no.ntnu.matrixengine.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.matrixengine.Field#getTile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tile</em>'.
	 * @see no.ntnu.matrixengine.Field#getTile()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Tile();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see no.ntnu.matrixengine.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Tile#getTileCordinateX <em>Tile Cordinate X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Cordinate X</em>'.
	 * @see no.ntnu.matrixengine.Tile#getTileCordinateX()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_TileCordinateX();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Tile#getTileCodinateY <em>Tile Codinate Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Codinate Y</em>'.
	 * @see no.ntnu.matrixengine.Tile#getTileCodinateY()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_TileCodinateY();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MatrixengineFactory getMatrixengineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.mainImpl <em>main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.mainImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getmain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getmain();

		/**
		 * The meta object literal for the '<em><b>Setup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__SETUP = eINSTANCE.getmain_Setup();

		/**
		 * The meta object literal for the '<em><b>Updatefield</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__UPDATEFIELD = eINSTANCE.getmain_Updatefield();

		/**
		 * The meta object literal for the '<em><b>Gameover</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__GAMEOVER = eINSTANCE.getmain_Gameover();

		/**
		 * The meta object literal for the '<em><b>Getuserinput</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__GETUSERINPUT = eINSTANCE.getmain_Getuserinput();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.SetupImpl <em>Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.SetupImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getSetup()
		 * @generated
		 */
		EClass SETUP = eINSTANCE.getSetup();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETUP__FIELD = eINSTANCE.getSetup_Field();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.UpdateFieldImpl <em>Update Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.UpdateFieldImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getUpdateField()
		 * @generated
		 */
		EClass UPDATE_FIELD = eINSTANCE.getUpdateField();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_FIELD__FIELD = eINSTANCE.getUpdateField_Field();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.GameOverImpl <em>Game Over</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.GameOverImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getGameOver()
		 * @generated
		 */
		EClass GAME_OVER = eINSTANCE.getGameOver();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_OVER__FIELD = eINSTANCE.getGameOver_Field();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.GetUserInputImpl <em>Get User Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.GetUserInputImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getGetUserInput()
		 * @generated
		 */
		EClass GET_USER_INPUT = eINSTANCE.getGetUserInput();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.FieldImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Tile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TILE = eINSTANCE.getField_Tile();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.TileImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getTile()
		 * @generated
		 */
		EClass TILE = eINSTANCE.getTile();

		/**
		 * The meta object literal for the '<em><b>Tile Cordinate X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__TILE_CORDINATE_X = eINSTANCE.getTile_TileCordinateX();

		/**
		 * The meta object literal for the '<em><b>Tile Codinate Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__TILE_CODINATE_Y = eINSTANCE.getTile_TileCodinateY();

	}

} //MatrixenginePackage
