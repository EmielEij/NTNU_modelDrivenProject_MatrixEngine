/**
 */
package no.ntnu.tdt4250.matrixgame.game;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see no.ntnu.tdt4250.matrixgame.game.GameFactory
 * @model kind="package"
 * @generated
 */
public interface GamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "game";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ntnu.no/tdt4250/MatrixGame";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "game";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamePackage eINSTANCE = no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl <em>Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getGameLogic()
	 * @generated
	 */
	int GAME_LOGIC = 0;

	/**
	 * The feature id for the '<em><b>Game Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__GAME_NAME = 0;

	/**
	 * The feature id for the '<em><b>Player X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__PLAYER_X = 1;

	/**
	 * The feature id for the '<em><b>Player O</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__PLAYER_O = 2;

	/**
	 * The feature id for the '<em><b>Map Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__MAP_LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__GRID = 4;

	/**
	 * The feature id for the '<em><b>Current Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__CURRENT_PLAYER = 5;

	/**
	 * The number of structural features of the '<em>Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Switch Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC___SWITCH_PLAYER = 0;

	/**
	 * The operation id for the '<em>Is Game Over</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC___IS_GAME_OVER = 1;

	/**
	 * The operation id for the '<em>Check Win</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC___CHECK_WIN = 2;

	/**
	 * The operation id for the '<em>Make Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC___MAKE_MOVE__INT_INT = 3;

	/**
	 * The number of operations of the '<em>Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.CellImpl
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getCell()
	 * @generated
	 */
	int CELL = 1;

	/**
	 * The feature id for the '<em><b>Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CHARACTER = 0;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.RowImpl
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getRow()
	 * @generated
	 */
	int ROW = 2;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CELLS = 0;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CELL = 1;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GridImpl
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ROW = 0;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__MAP = 1;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___GET_CELL__INT_INT = 0;

	/**
	 * The operation id for the '<em>Set Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___SET_CELL__INT_INT_CHAR = 1;

	/**
	 * The operation id for the '<em>Is Full</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID___IS_FULL = 2;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 3;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic
	 * @generated
	 */
	EClass getGameLogic();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getGameName <em>Game Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Name</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#getGameName()
	 * @see #getGameLogic()
	 * @generated
	 */
	EAttribute getGameLogic_GameName();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getPlayerX <em>Player X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player X</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#getPlayerX()
	 * @see #getGameLogic()
	 * @generated
	 */
	EAttribute getGameLogic_PlayerX();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getPlayerO <em>Player O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player O</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#getPlayerO()
	 * @see #getGameLogic()
	 * @generated
	 */
	EAttribute getGameLogic_PlayerO();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getMapLength <em>Map Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Length</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#getMapLength()
	 * @see #getGameLogic()
	 * @generated
	 */
	EAttribute getGameLogic_MapLength();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#getGrid()
	 * @see #getGameLogic()
	 * @generated
	 */
	EReference getGameLogic_Grid();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getCurrentPlayer <em>Current Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Player</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#getCurrentPlayer()
	 * @see #getGameLogic()
	 * @generated
	 */
	EAttribute getGameLogic_CurrentPlayer();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#switchPlayer() <em>Switch Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Switch Player</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#switchPlayer()
	 * @generated
	 */
	EOperation getGameLogic__SwitchPlayer();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#isGameOver() <em>Is Game Over</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Game Over</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#isGameOver()
	 * @generated
	 */
	EOperation getGameLogic__IsGameOver();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#checkWin() <em>Check Win</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Win</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#checkWin()
	 * @generated
	 */
	EOperation getGameLogic__CheckWin();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#makeMove(int, int) <em>Make Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Move</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#makeMove(int, int)
	 * @generated
	 */
	EOperation getGameLogic__MakeMove__int_int();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.matrixgame.game.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Cell#getCharacter <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Cell#getCharacter()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Character();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.matrixgame.game.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the attribute list '{@link no.ntnu.tdt4250.matrixgame.game.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cells</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Row#getCells()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Cells();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.matrixgame.game.Row#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Row#getCell()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Cell();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.matrixgame.game.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.matrixgame.game.Grid#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Grid#getRow()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Row();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Grid#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Grid#getMap()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Map();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.Grid#getCell(int, int) <em>Get Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.Grid#getCell(int, int)
	 * @generated
	 */
	EOperation getGrid__GetCell__int_int();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.Grid#setCell(int, int, char) <em>Set Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Cell</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.Grid#setCell(int, int, char)
	 * @generated
	 */
	EOperation getGrid__SetCell__int_int_char();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.Grid#isFull() <em>Is Full</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Full</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.Grid#isFull()
	 * @generated
	 */
	EOperation getGrid__IsFull();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GameFactory getGameFactory();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl <em>Logic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getGameLogic()
		 * @generated
		 */
		EClass GAME_LOGIC = eINSTANCE.getGameLogic();

		/**
		 * The meta object literal for the '<em><b>Game Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_LOGIC__GAME_NAME = eINSTANCE.getGameLogic_GameName();

		/**
		 * The meta object literal for the '<em><b>Player X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_LOGIC__PLAYER_X = eINSTANCE.getGameLogic_PlayerX();

		/**
		 * The meta object literal for the '<em><b>Player O</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_LOGIC__PLAYER_O = eINSTANCE.getGameLogic_PlayerO();

		/**
		 * The meta object literal for the '<em><b>Map Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_LOGIC__MAP_LENGTH = eINSTANCE.getGameLogic_MapLength();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_LOGIC__GRID = eINSTANCE.getGameLogic_Grid();

		/**
		 * The meta object literal for the '<em><b>Current Player</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_LOGIC__CURRENT_PLAYER = eINSTANCE.getGameLogic_CurrentPlayer();

		/**
		 * The meta object literal for the '<em><b>Switch Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_LOGIC___SWITCH_PLAYER = eINSTANCE.getGameLogic__SwitchPlayer();

		/**
		 * The meta object literal for the '<em><b>Is Game Over</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_LOGIC___IS_GAME_OVER = eINSTANCE.getGameLogic__IsGameOver();

		/**
		 * The meta object literal for the '<em><b>Check Win</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_LOGIC___CHECK_WIN = eINSTANCE.getGameLogic__CheckWin();

		/**
		 * The meta object literal for the '<em><b>Make Move</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_LOGIC___MAKE_MOVE__INT_INT = eINSTANCE.getGameLogic__MakeMove__int_int();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.CellImpl
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Character</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__CHARACTER = eINSTANCE.getCell_Character();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.RowImpl
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__CELLS = eINSTANCE.getRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__CELL = eINSTANCE.getRow_Cell();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GridImpl
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__ROW = eINSTANCE.getGrid_Row();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__MAP = eINSTANCE.getGrid_Map();

		/**
		 * The meta object literal for the '<em><b>Get Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___GET_CELL__INT_INT = eINSTANCE.getGrid__GetCell__int_int();

		/**
		 * The meta object literal for the '<em><b>Set Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___SET_CELL__INT_INT_CHAR = eINSTANCE.getGrid__SetCell__int_int_char();

		/**
		 * The meta object literal for the '<em><b>Is Full</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRID___IS_FULL = eINSTANCE.getGrid__IsFull();

	}

} //GamePackage
