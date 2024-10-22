/**
 */
package no.ntnu.matrixengine;

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
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.SetupImpl <em>Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.SetupImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getSetup()
	 * @generated
	 */
	int SETUP = 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP__GAME = 0;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP__MAP = 1;

	/**
	 * The number of structural features of the '<em>Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Init Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP___INIT_FIELD = 0;

	/**
	 * The operation id for the '<em>Load Game</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP___LOAD_GAME = 1;

	/**
	 * The operation id for the '<em>Set Start Tile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP___SET_START_TILE = 2;

	/**
	 * The number of operations of the '<em>Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.FieldImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getField()
	 * @generated
	 */
	int FIELD = 1;

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
	int TILE = 2;

	/**
	 * The feature id for the '<em><b>Is Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__IS_ACCESSIBLE = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__NEIGHBOURS = 3;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE___IS_USED = 0;

	/**
	 * The number of operations of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.PlayerImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TIME = 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__SCORE = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__STATE = 2;

	/**
	 * The feature id for the '<em><b>Gamelogic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GAMELOGIC = 3;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Take Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___TAKE_ACTION = 0;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.GameLogicImpl <em>Game Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.GameLogicImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getGameLogic()
	 * @generated
	 */
	int GAME_LOGIC = 4;

	/**
	 * The feature id for the '<em><b>Multiplayer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__MULTIPLAYER = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Setup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__SETUP = 2;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__MAP = 3;

	/**
	 * The feature id for the '<em><b>Gameaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__GAMEACTION = 4;

	/**
	 * The number of structural features of the '<em>Game Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Apply Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC___APPLY_ACTION__ACTIONTYPE_TILE = 0;

	/**
	 * The operation id for the '<em>Check Win Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC___CHECK_WIN_CONDITION = 1;

	/**
	 * The operation id for the '<em>Is Game Over</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC___IS_GAME_OVER = 2;

	/**
	 * The number of operations of the '<em>Game Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.MapImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getMap()
	 * @generated
	 */
	int MAP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tile</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TILE = 1;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SIZE_Y = 2;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SIZE_X = 3;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Initialize Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___INITIALIZE_MAP = 0;

	/**
	 * The operation id for the '<em>Get Tile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___GET_TILE__INT_INT = 1;

	/**
	 * The operation id for the '<em>Load Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___LOAD_MAP = 2;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.StateImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getState()
	 * @generated
	 */
	int STATE = 6;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__MAP = 0;

	/**
	 * The feature id for the '<em><b>Turns Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TURNS_TAKEN = 1;

	/**
	 * The feature id for the '<em><b>Flags Placed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FLAGS_PLACED = 2;

	/**
	 * The feature id for the '<em><b>Is Over</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_OVER = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Current Tile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_CURRENT_TILE = 0;

	/**
	 * The operation id for the '<em>Get Players Turn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_PLAYERS_TURN = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.ActionImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Actiontype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIONTYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Perform Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___PERFORM_ACTION = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.ActionTypeImpl <em>Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.ActionTypeImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Valid Tiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__VALID_TILES = 1;

	/**
	 * The number of structural features of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.matrixengine.impl.GameMapImpl <em>Game Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.matrixengine.impl.GameMapImpl
	 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getGameMap()
	 * @generated
	 */
	int GAME_MAP = 9;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MAP__STATE = 0;

	/**
	 * The feature id for the '<em><b>Tile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MAP__TILE = 1;

	/**
	 * The feature id for the '<em><b>Tile Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MAP__TILE_SIZE_X = 2;

	/**
	 * The feature id for the '<em><b>Tile Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MAP__TILE_SIZE_Y = 3;

	/**
	 * The feature id for the '<em><b>Map Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MAP__MAP_SIZE_X = 4;

	/**
	 * The feature id for the '<em><b>Map Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MAP__MAP_SIZE_Y = 5;

	/**
	 * The number of structural features of the '<em>Game Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MAP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Game Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MAP_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.Setup#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Game</em>'.
	 * @see no.ntnu.matrixengine.Setup#getGame()
	 * @see #getSetup()
	 * @generated
	 */
	EReference getSetup_Game();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.Setup#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map</em>'.
	 * @see no.ntnu.matrixengine.Setup#getMap()
	 * @see #getSetup()
	 * @generated
	 */
	EReference getSetup_Map();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.Setup#InitField() <em>Init Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Field</em>' operation.
	 * @see no.ntnu.matrixengine.Setup#InitField()
	 * @generated
	 */
	EOperation getSetup__InitField();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.Setup#loadGame() <em>Load Game</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Game</em>' operation.
	 * @see no.ntnu.matrixengine.Setup#loadGame()
	 * @generated
	 */
	EOperation getSetup__LoadGame();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.Setup#setStartTile() <em>Set Start Tile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Start Tile</em>' operation.
	 * @see no.ntnu.matrixengine.Setup#setStartTile()
	 * @generated
	 */
	EOperation getSetup__SetStartTile();

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
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Tile#getIsAccessible <em>Is Accessible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Accessible</em>'.
	 * @see no.ntnu.matrixengine.Tile#getIsAccessible()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_IsAccessible();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Tile#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see no.ntnu.matrixengine.Tile#getContent()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Content();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Tile#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see no.ntnu.matrixengine.Tile#getColor()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Color();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Tile#getNeighbours <em>Neighbours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neighbours</em>'.
	 * @see no.ntnu.matrixengine.Tile#getNeighbours()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Neighbours();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.Tile#IsUsed() <em>Is Used</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Used</em>' operation.
	 * @see no.ntnu.matrixengine.Tile#IsUsed()
	 * @generated
	 */
	EOperation getTile__IsUsed();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see no.ntnu.matrixengine.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Player#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see no.ntnu.matrixengine.Player#getTime()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Time();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Player#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see no.ntnu.matrixengine.Player#getScore()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Score();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.Player#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see no.ntnu.matrixengine.Player#getState()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_State();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.Player#getGamelogic <em>Gamelogic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gamelogic</em>'.
	 * @see no.ntnu.matrixengine.Player#getGamelogic()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Gamelogic();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.Player#takeAction() <em>Take Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take Action</em>' operation.
	 * @see no.ntnu.matrixengine.Player#takeAction()
	 * @generated
	 */
	EOperation getPlayer__TakeAction();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.GameLogic <em>Game Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Logic</em>'.
	 * @see no.ntnu.matrixengine.GameLogic
	 * @generated
	 */
	EClass getGameLogic();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.GameLogic#isMultiplayer <em>Multiplayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplayer</em>'.
	 * @see no.ntnu.matrixengine.GameLogic#isMultiplayer()
	 * @see #getGameLogic()
	 * @generated
	 */
	EAttribute getGameLogic_Multiplayer();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.matrixengine.GameLogic#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Player</em>'.
	 * @see no.ntnu.matrixengine.GameLogic#getPlayer()
	 * @see #getGameLogic()
	 * @generated
	 */
	EReference getGameLogic_Player();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.GameLogic#getSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Setup</em>'.
	 * @see no.ntnu.matrixengine.GameLogic#getSetup()
	 * @see #getGameLogic()
	 * @generated
	 */
	EReference getGameLogic_Setup();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.matrixengine.GameLogic#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see no.ntnu.matrixengine.GameLogic#getMap()
	 * @see #getGameLogic()
	 * @generated
	 */
	EReference getGameLogic_Map();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.GameLogic#getGameaction <em>Gameaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gameaction</em>'.
	 * @see no.ntnu.matrixengine.GameLogic#getGameaction()
	 * @see #getGameLogic()
	 * @generated
	 */
	EReference getGameLogic_Gameaction();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.GameLogic#applyAction(no.ntnu.matrixengine.ActionType, no.ntnu.matrixengine.Tile) <em>Apply Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Action</em>' operation.
	 * @see no.ntnu.matrixengine.GameLogic#applyAction(no.ntnu.matrixengine.ActionType, no.ntnu.matrixengine.Tile)
	 * @generated
	 */
	EOperation getGameLogic__ApplyAction__ActionType_Tile();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.GameLogic#checkWinCondition() <em>Check Win Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Win Condition</em>' operation.
	 * @see no.ntnu.matrixengine.GameLogic#checkWinCondition()
	 * @generated
	 */
	EOperation getGameLogic__CheckWinCondition();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.GameLogic#isGameOver() <em>Is Game Over</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Game Over</em>' operation.
	 * @see no.ntnu.matrixengine.GameLogic#isGameOver()
	 * @generated
	 */
	EOperation getGameLogic__IsGameOver();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see no.ntnu.matrixengine.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Map#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.matrixengine.Map#getName()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Name();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.matrixengine.Map#getTile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tile</em>'.
	 * @see no.ntnu.matrixengine.Map#getTile()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Tile();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Map#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see no.ntnu.matrixengine.Map#getSizeY()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_SizeY();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Map#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see no.ntnu.matrixengine.Map#getSizeX()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_SizeX();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.Map#initializeMap() <em>Initialize Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Map</em>' operation.
	 * @see no.ntnu.matrixengine.Map#initializeMap()
	 * @generated
	 */
	EOperation getMap__InitializeMap();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.Map#getTile(int, int) <em>Get Tile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tile</em>' operation.
	 * @see no.ntnu.matrixengine.Map#getTile(int, int)
	 * @generated
	 */
	EOperation getMap__GetTile__int_int();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.Map#loadMap() <em>Load Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Map</em>' operation.
	 * @see no.ntnu.matrixengine.Map#loadMap()
	 * @generated
	 */
	EOperation getMap__LoadMap();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see no.ntnu.matrixengine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.State#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map</em>'.
	 * @see no.ntnu.matrixengine.State#getMap()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Map();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.State#getTurnsTaken <em>Turns Taken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turns Taken</em>'.
	 * @see no.ntnu.matrixengine.State#getTurnsTaken()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_TurnsTaken();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.State#getFlagsPlaced <em>Flags Placed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags Placed</em>'.
	 * @see no.ntnu.matrixengine.State#getFlagsPlaced()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_FlagsPlaced();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.State#isIsOver <em>Is Over</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Over</em>'.
	 * @see no.ntnu.matrixengine.State#isIsOver()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsOver();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.State#getCurrentTile() <em>Get Current Tile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Tile</em>' operation.
	 * @see no.ntnu.matrixengine.State#getCurrentTile()
	 * @generated
	 */
	EOperation getState__GetCurrentTile();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.State#getPlayersTurn() <em>Get Players Turn</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Players Turn</em>' operation.
	 * @see no.ntnu.matrixengine.State#getPlayersTurn()
	 * @generated
	 */
	EOperation getState__GetPlayersTurn();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see no.ntnu.matrixengine.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.Action#getActiontype <em>Actiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actiontype</em>'.
	 * @see no.ntnu.matrixengine.Action#getActiontype()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actiontype();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.matrixengine.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the '{@link no.ntnu.matrixengine.Action#performAction() <em>Perform Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Action</em>' operation.
	 * @see no.ntnu.matrixengine.Action#performAction()
	 * @generated
	 */
	EOperation getAction__PerformAction();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type</em>'.
	 * @see no.ntnu.matrixengine.ActionType
	 * @generated
	 */
	EClass getActionType();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.ActionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.matrixengine.ActionType#getName()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.ActionType#getValidTiles <em>Valid Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Tiles</em>'.
	 * @see no.ntnu.matrixengine.ActionType#getValidTiles()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_ValidTiles();

	/**
	 * Returns the meta object for class '{@link no.ntnu.matrixengine.GameMap <em>Game Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Map</em>'.
	 * @see no.ntnu.matrixengine.GameMap
	 * @generated
	 */
	EClass getGameMap();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.matrixengine.GameMap#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see no.ntnu.matrixengine.GameMap#getState()
	 * @see #getGameMap()
	 * @generated
	 */
	EReference getGameMap_State();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.matrixengine.GameMap#getTile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tile</em>'.
	 * @see no.ntnu.matrixengine.GameMap#getTile()
	 * @see #getGameMap()
	 * @generated
	 */
	EReference getGameMap_Tile();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.GameMap#getTileSizeX <em>Tile Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Size X</em>'.
	 * @see no.ntnu.matrixengine.GameMap#getTileSizeX()
	 * @see #getGameMap()
	 * @generated
	 */
	EAttribute getGameMap_TileSizeX();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.GameMap#getTileSizeY <em>Tile Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Size Y</em>'.
	 * @see no.ntnu.matrixengine.GameMap#getTileSizeY()
	 * @see #getGameMap()
	 * @generated
	 */
	EAttribute getGameMap_TileSizeY();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.GameMap#getMapSizeX <em>Map Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Size X</em>'.
	 * @see no.ntnu.matrixengine.GameMap#getMapSizeX()
	 * @see #getGameMap()
	 * @generated
	 */
	EAttribute getGameMap_MapSizeX();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.matrixengine.GameMap#getMapSizeY <em>Map Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Size Y</em>'.
	 * @see no.ntnu.matrixengine.GameMap#getMapSizeY()
	 * @see #getGameMap()
	 * @generated
	 */
	EAttribute getGameMap_MapSizeY();

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
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.SetupImpl <em>Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.SetupImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getSetup()
		 * @generated
		 */
		EClass SETUP = eINSTANCE.getSetup();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETUP__GAME = eINSTANCE.getSetup_Game();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETUP__MAP = eINSTANCE.getSetup_Map();

		/**
		 * The meta object literal for the '<em><b>Init Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SETUP___INIT_FIELD = eINSTANCE.getSetup__InitField();

		/**
		 * The meta object literal for the '<em><b>Load Game</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SETUP___LOAD_GAME = eINSTANCE.getSetup__LoadGame();

		/**
		 * The meta object literal for the '<em><b>Set Start Tile</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SETUP___SET_START_TILE = eINSTANCE.getSetup__SetStartTile();

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
		 * The meta object literal for the '<em><b>Is Accessible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__IS_ACCESSIBLE = eINSTANCE.getTile_IsAccessible();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__CONTENT = eINSTANCE.getTile_Content();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__COLOR = eINSTANCE.getTile_Color();

		/**
		 * The meta object literal for the '<em><b>Neighbours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__NEIGHBOURS = eINSTANCE.getTile_Neighbours();

		/**
		 * The meta object literal for the '<em><b>Is Used</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TILE___IS_USED = eINSTANCE.getTile__IsUsed();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.PlayerImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__TIME = eINSTANCE.getPlayer_Time();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__SCORE = eINSTANCE.getPlayer_Score();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__STATE = eINSTANCE.getPlayer_State();

		/**
		 * The meta object literal for the '<em><b>Gamelogic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__GAMELOGIC = eINSTANCE.getPlayer_Gamelogic();

		/**
		 * The meta object literal for the '<em><b>Take Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___TAKE_ACTION = eINSTANCE.getPlayer__TakeAction();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.GameLogicImpl <em>Game Logic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.GameLogicImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getGameLogic()
		 * @generated
		 */
		EClass GAME_LOGIC = eINSTANCE.getGameLogic();

		/**
		 * The meta object literal for the '<em><b>Multiplayer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_LOGIC__MULTIPLAYER = eINSTANCE.getGameLogic_Multiplayer();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_LOGIC__PLAYER = eINSTANCE.getGameLogic_Player();

		/**
		 * The meta object literal for the '<em><b>Setup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_LOGIC__SETUP = eINSTANCE.getGameLogic_Setup();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_LOGIC__MAP = eINSTANCE.getGameLogic_Map();

		/**
		 * The meta object literal for the '<em><b>Gameaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_LOGIC__GAMEACTION = eINSTANCE.getGameLogic_Gameaction();

		/**
		 * The meta object literal for the '<em><b>Apply Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_LOGIC___APPLY_ACTION__ACTIONTYPE_TILE = eINSTANCE.getGameLogic__ApplyAction__ActionType_Tile();

		/**
		 * The meta object literal for the '<em><b>Check Win Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_LOGIC___CHECK_WIN_CONDITION = eINSTANCE.getGameLogic__CheckWinCondition();

		/**
		 * The meta object literal for the '<em><b>Is Game Over</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_LOGIC___IS_GAME_OVER = eINSTANCE.getGameLogic__IsGameOver();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.MapImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__NAME = eINSTANCE.getMap_Name();

		/**
		 * The meta object literal for the '<em><b>Tile</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__TILE = eINSTANCE.getMap_Tile();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__SIZE_Y = eINSTANCE.getMap_SizeY();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__SIZE_X = eINSTANCE.getMap_SizeX();

		/**
		 * The meta object literal for the '<em><b>Initialize Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___INITIALIZE_MAP = eINSTANCE.getMap__InitializeMap();

		/**
		 * The meta object literal for the '<em><b>Get Tile</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___GET_TILE__INT_INT = eINSTANCE.getMap__GetTile__int_int();

		/**
		 * The meta object literal for the '<em><b>Load Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___LOAD_MAP = eINSTANCE.getMap__LoadMap();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.StateImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__MAP = eINSTANCE.getState_Map();

		/**
		 * The meta object literal for the '<em><b>Turns Taken</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TURNS_TAKEN = eINSTANCE.getState_TurnsTaken();

		/**
		 * The meta object literal for the '<em><b>Flags Placed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__FLAGS_PLACED = eINSTANCE.getState_FlagsPlaced();

		/**
		 * The meta object literal for the '<em><b>Is Over</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_OVER = eINSTANCE.getState_IsOver();

		/**
		 * The meta object literal for the '<em><b>Get Current Tile</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___GET_CURRENT_TILE = eINSTANCE.getState__GetCurrentTile();

		/**
		 * The meta object literal for the '<em><b>Get Players Turn</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___GET_PLAYERS_TURN = eINSTANCE.getState__GetPlayersTurn();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.ActionImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Actiontype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTIONTYPE = eINSTANCE.getAction_Actiontype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Perform Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___PERFORM_ACTION = eINSTANCE.getAction__PerformAction();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.ActionTypeImpl <em>Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.ActionTypeImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getActionType()
		 * @generated
		 */
		EClass ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__NAME = eINSTANCE.getActionType_Name();

		/**
		 * The meta object literal for the '<em><b>Valid Tiles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__VALID_TILES = eINSTANCE.getActionType_ValidTiles();

		/**
		 * The meta object literal for the '{@link no.ntnu.matrixengine.impl.GameMapImpl <em>Game Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.matrixengine.impl.GameMapImpl
		 * @see no.ntnu.matrixengine.impl.MatrixenginePackageImpl#getGameMap()
		 * @generated
		 */
		EClass GAME_MAP = eINSTANCE.getGameMap();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MAP__STATE = eINSTANCE.getGameMap_State();

		/**
		 * The meta object literal for the '<em><b>Tile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MAP__TILE = eINSTANCE.getGameMap_Tile();

		/**
		 * The meta object literal for the '<em><b>Tile Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MAP__TILE_SIZE_X = eINSTANCE.getGameMap_TileSizeX();

		/**
		 * The meta object literal for the '<em><b>Tile Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MAP__TILE_SIZE_Y = eINSTANCE.getGameMap_TileSizeY();

		/**
		 * The meta object literal for the '<em><b>Map Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MAP__MAP_SIZE_X = eINSTANCE.getGameMap_MapSizeX();

		/**
		 * The meta object literal for the '<em><b>Map Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MAP__MAP_SIZE_Y = eINSTANCE.getGameMap_MapSizeY();

	}

} //MatrixenginePackage
