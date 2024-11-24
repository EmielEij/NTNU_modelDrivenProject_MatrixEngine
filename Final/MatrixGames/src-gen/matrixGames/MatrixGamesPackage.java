/**
 */
package matrixGames;

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
 * @see matrixGames.MatrixGamesFactory
 * @model kind="package"
 * @generated
 */
public interface MatrixGamesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "matrixGames";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:/ntnu.tdt4250/matrixGames";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "matrixGames";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatrixGamesPackage eINSTANCE = matrixGames.impl.MatrixGamesPackageImpl.init();

	/**
	 * The meta object id for the '{@link matrixGames.impl.LogicImpl <em>Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGames.impl.LogicImpl
	 * @see matrixGames.impl.MatrixGamesPackageImpl#getLogic()
	 * @generated
	 */
	int LOGIC = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC__PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC__BOARD = 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC__RULE = 2;

	/**
	 * The number of structural features of the '<em>Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Start Game</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC___START_GAME = 0;

	/**
	 * The operation id for the '<em>Main</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC___MAIN = 1;

	/**
	 * The number of operations of the '<em>Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link matrixGames.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGames.impl.RuleImpl
	 * @see matrixGames.impl.MatrixGamesPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ROWS = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Check Winner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___CHECK_WINNER = 0;

	/**
	 * The operation id for the '<em>Is Board Full</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___IS_BOARD_FULL = 1;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link matrixGames.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGames.impl.BoardImpl
	 * @see matrixGames.impl.MatrixGamesPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 2;

	/**
	 * The feature id for the '<em><b>Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOARD = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__ROWS = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__COLUMNS = 2;

	/**
	 * The feature id for the '<em><b>Board Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__BOARD_NAME = 3;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Display Board</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___DISPLAY_BOARD = 0;

	/**
	 * The operation id for the '<em>Drop Piece</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___DROP_PIECE = 1;

	/**
	 * The operation id for the '<em>Get Game Board</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___GET_GAME_BOARD = 2;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link matrixGames.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGames.impl.PlayerImpl
	 * @see matrixGames.impl.MatrixGamesPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Game Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GAME_PLAYER = 2;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link matrixGames.Logic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic</em>'.
	 * @see matrixGames.Logic
	 * @generated
	 */
	EClass getLogic();

	/**
	 * Returns the meta object for the containment reference '{@link matrixGames.Logic#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see matrixGames.Logic#getRule()
	 * @see #getLogic()
	 * @generated
	 */
	EReference getLogic_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link matrixGames.Logic#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Player</em>'.
	 * @see matrixGames.Logic#getPlayer()
	 * @see #getLogic()
	 * @generated
	 */
	EReference getLogic_Player();

	/**
	 * Returns the meta object for the containment reference '{@link matrixGames.Logic#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Board</em>'.
	 * @see matrixGames.Logic#getBoard()
	 * @see #getLogic()
	 * @generated
	 */
	EReference getLogic_Board();

	/**
	 * Returns the meta object for the '{@link matrixGames.Logic#startGame() <em>Start Game</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Game</em>' operation.
	 * @see matrixGames.Logic#startGame()
	 * @generated
	 */
	EOperation getLogic__StartGame();

	/**
	 * Returns the meta object for the '{@link matrixGames.Logic#main() <em>Main</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Main</em>' operation.
	 * @see matrixGames.Logic#main()
	 * @generated
	 */
	EOperation getLogic__Main();

	/**
	 * Returns the meta object for class '{@link matrixGames.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see matrixGames.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link matrixGames.Rule#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see matrixGames.Rule#getRows()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Rows();

	/**
	 * Returns the meta object for the attribute '{@link matrixGames.Rule#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see matrixGames.Rule#getColumns()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Columns();

	/**
	 * Returns the meta object for the '{@link matrixGames.Rule#checkWinner() <em>Check Winner</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Winner</em>' operation.
	 * @see matrixGames.Rule#checkWinner()
	 * @generated
	 */
	EOperation getRule__CheckWinner();

	/**
	 * Returns the meta object for the '{@link matrixGames.Rule#isBoardFull() <em>Is Board Full</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Board Full</em>' operation.
	 * @see matrixGames.Rule#isBoardFull()
	 * @generated
	 */
	EOperation getRule__IsBoardFull();

	/**
	 * Returns the meta object for class '{@link matrixGames.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see matrixGames.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link matrixGames.Board#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board</em>'.
	 * @see matrixGames.Board#getBoard()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Board();

	/**
	 * Returns the meta object for the attribute '{@link matrixGames.Board#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see matrixGames.Board#getRows()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Rows();

	/**
	 * Returns the meta object for the attribute '{@link matrixGames.Board#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see matrixGames.Board#getColumns()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Columns();

	/**
	 * Returns the meta object for the attribute '{@link matrixGames.Board#getBoardName <em>Board Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Name</em>'.
	 * @see matrixGames.Board#getBoardName()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_BoardName();

	/**
	 * Returns the meta object for the '{@link matrixGames.Board#displayBoard() <em>Display Board</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Board</em>' operation.
	 * @see matrixGames.Board#displayBoard()
	 * @generated
	 */
	EOperation getBoard__DisplayBoard();

	/**
	 * Returns the meta object for the '{@link matrixGames.Board#dropPiece() <em>Drop Piece</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Drop Piece</em>' operation.
	 * @see matrixGames.Board#dropPiece()
	 * @generated
	 */
	EOperation getBoard__DropPiece();

	/**
	 * Returns the meta object for the '{@link matrixGames.Board#getGameBoard() <em>Get Game Board</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Game Board</em>' operation.
	 * @see matrixGames.Board#getGameBoard()
	 * @generated
	 */
	EOperation getBoard__GetGameBoard();

	/**
	 * Returns the meta object for class '{@link matrixGames.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see matrixGames.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link matrixGames.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see matrixGames.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link matrixGames.Player#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see matrixGames.Player#getSymbol()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link matrixGames.Player#getGamePlayer <em>Game Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Player</em>'.
	 * @see matrixGames.Player#getGamePlayer()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_GamePlayer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MatrixGamesFactory getMatrixGamesFactory();

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
		 * The meta object literal for the '{@link matrixGames.impl.LogicImpl <em>Logic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGames.impl.LogicImpl
		 * @see matrixGames.impl.MatrixGamesPackageImpl#getLogic()
		 * @generated
		 */
		EClass LOGIC = eINSTANCE.getLogic();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC__RULE = eINSTANCE.getLogic_Rule();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC__PLAYER = eINSTANCE.getLogic_Player();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC__BOARD = eINSTANCE.getLogic_Board();

		/**
		 * The meta object literal for the '<em><b>Start Game</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIC___START_GAME = eINSTANCE.getLogic__StartGame();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIC___MAIN = eINSTANCE.getLogic__Main();

		/**
		 * The meta object literal for the '{@link matrixGames.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGames.impl.RuleImpl
		 * @see matrixGames.impl.MatrixGamesPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ROWS = eINSTANCE.getRule_Rows();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__COLUMNS = eINSTANCE.getRule_Columns();

		/**
		 * The meta object literal for the '<em><b>Check Winner</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULE___CHECK_WINNER = eINSTANCE.getRule__CheckWinner();

		/**
		 * The meta object literal for the '<em><b>Is Board Full</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULE___IS_BOARD_FULL = eINSTANCE.getRule__IsBoardFull();

		/**
		 * The meta object literal for the '{@link matrixGames.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGames.impl.BoardImpl
		 * @see matrixGames.impl.MatrixGamesPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__BOARD = eINSTANCE.getBoard_Board();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__ROWS = eINSTANCE.getBoard_Rows();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__COLUMNS = eINSTANCE.getBoard_Columns();

		/**
		 * The meta object literal for the '<em><b>Board Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__BOARD_NAME = eINSTANCE.getBoard_BoardName();

		/**
		 * The meta object literal for the '<em><b>Display Board</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___DISPLAY_BOARD = eINSTANCE.getBoard__DisplayBoard();

		/**
		 * The meta object literal for the '<em><b>Drop Piece</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___DROP_PIECE = eINSTANCE.getBoard__DropPiece();

		/**
		 * The meta object literal for the '<em><b>Get Game Board</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___GET_GAME_BOARD = eINSTANCE.getBoard__GetGameBoard();

		/**
		 * The meta object literal for the '{@link matrixGames.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGames.impl.PlayerImpl
		 * @see matrixGames.impl.MatrixGamesPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__SYMBOL = eINSTANCE.getPlayer_Symbol();

		/**
		 * The meta object literal for the '<em><b>Game Player</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__GAME_PLAYER = eINSTANCE.getPlayer_GamePlayer();

	}

} //MatrixGamesPackage
