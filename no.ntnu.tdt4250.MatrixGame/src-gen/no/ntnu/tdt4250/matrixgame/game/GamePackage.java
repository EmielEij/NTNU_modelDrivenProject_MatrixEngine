/**
 */
package no.ntnu.tdt4250.matrixgame.game;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.TileImpl
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getTile()
	 * @generated
	 */
	int TILE = 0;

	/**
	 * The feature id for the '<em><b>Is Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__IS_ACCESSIBLE = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__COLOR = 1;

	/**
	 * The feature id for the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__XCOORDINATE = 2;

	/**
	 * The feature id for the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__YCOORDINATE = 3;

	/**
	 * The feature id for the '<em><b>Tile Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TILE_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Interact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE___INTERACT__ACTION = 0;

	/**
	 * The operation id for the '<em>Reveal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE___REVEAL = 1;

	/**
	 * The operation id for the '<em>Toggle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE___TOGGLE = 2;

	/**
	 * The number of operations of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.ActionImpl
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Change Accessbility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CHANGE_ACCESSBILITY = 2;

	/**
	 * The feature id for the '<em><b>Change State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CHANGE_STATE = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 4;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.StateImpl
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Turns Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TURNS_TAKEN = 0;

	/**
	 * The feature id for the '<em><b>Flags Placed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FLAGS_PLACED = 1;

	/**
	 * The feature id for the '<em><b>Is Over</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_OVER = 2;

	/**
	 * The feature id for the '<em><b>Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TILE = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Current Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_CURRENT_STATUS = 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.PlayerImpl
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 3;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__SCORE = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__STATE = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ACTION = 2;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 3;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.MapImpl
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getMap()
	 * @generated
	 */
	int MAP = 4;

	/**
	 * The feature id for the '<em><b>Tile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TILE = 0;

	/**
	 * The feature id for the '<em><b>Amount Of Tiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__AMOUNT_OF_TILES = 1;

	/**
	 * The feature id for the '<em><b>Map Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAP_SIZE_X = 2;

	/**
	 * The feature id for the '<em><b>Map Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAP_SIZE_Y = 3;

	/**
	 * The feature id for the '<em><b>Tile Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TILE_SIZE_Y = 4;

	/**
	 * The feature id for the '<em><b>Tile Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TILE_SIZE_X = 5;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Initialize Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP___INITIALIZE_MAP = 0;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl <em>Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getGameLogic()
	 * @generated
	 */
	int GAME_LOGIC = 5;

	/**
	 * The feature id for the '<em><b>Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Gameaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__GAMEACTION = 1;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__MAP = 2;

	/**
	 * The number of structural features of the '<em>Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Apply Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC___APPLY_ACTION__ACTION_TILE = 0;

	/**
	 * The operation id for the '<em>Is Game Over</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC___IS_GAME_OVER = 1;

	/**
	 * The operation id for the '<em>Generate Starting Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC___GENERATE_STARTING_POSITION = 2;

	/**
	 * The number of operations of the '<em>Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.ActionType
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 6;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.matrixgame.game.TileType <em>Tile Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.matrixgame.game.TileType
	 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getTileType()
	 * @generated
	 */
	int TILE_TYPE = 7;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.matrixgame.game.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Tile#isIsAccessible <em>Is Accessible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Accessible</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Tile#isIsAccessible()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_IsAccessible();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Tile#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Tile#getColor()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Color();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Tile#getXCoordinate <em>XCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCoordinate</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Tile#getXCoordinate()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_XCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Tile#getYCoordinate <em>YCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCoordinate</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Tile#getYCoordinate()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_YCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Tile#getTileType <em>Tile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Type</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Tile#getTileType()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_TileType();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.Tile#interact(no.ntnu.tdt4250.matrixgame.game.Action) <em>Interact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interact</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.Tile#interact(no.ntnu.tdt4250.matrixgame.game.Action)
	 * @generated
	 */
	EOperation getTile__Interact__Action();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.Tile#reveal() <em>Reveal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reveal</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.Tile#reveal()
	 * @generated
	 */
	EOperation getTile__Reveal();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.Tile#toggle() <em>Toggle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Toggle</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.Tile#toggle()
	 * @generated
	 */
	EOperation getTile__Toggle();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.matrixgame.game.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Action#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Action#getActionType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionType();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.matrixgame.game.Action#getChange_Accessbility <em>Change Accessbility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Accessbility</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Action#getChange_Accessbility()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Change_Accessbility();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.matrixgame.game.Action#getChange_State <em>Change State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change State</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Action#getChange_State()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Change_State();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.Action#performAction() <em>Perform Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Action</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.Action#performAction()
	 * @generated
	 */
	EOperation getAction__PerformAction();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.matrixgame.game.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.State#getTurnsTaken <em>Turns Taken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turns Taken</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.State#getTurnsTaken()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_TurnsTaken();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.State#isFlagsPlaced <em>Flags Placed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags Placed</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.State#isFlagsPlaced()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_FlagsPlaced();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.State#isIsOver <em>Is Over</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Over</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.State#isIsOver()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsOver();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.matrixgame.game.State#getTile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tile</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.State#getTile()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Tile();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.State#getCurrentStatus() <em>Get Current Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Status</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.State#getCurrentStatus()
	 * @generated
	 */
	EOperation getState__GetCurrentStatus();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.matrixgame.game.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Player#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Player#getScore()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Score();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.matrixgame.game.Player#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Player#getState()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_State();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.matrixgame.game.Player#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Player#getAction()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Action();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.Player#takeAction() <em>Take Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take Action</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.Player#takeAction()
	 * @generated
	 */
	EOperation getPlayer__TakeAction();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.matrixgame.game.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.matrixgame.game.Map#getTile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tile</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Map#getTile()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Tile();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Map#getAmountOfTiles <em>Amount Of Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Tiles</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Map#getAmountOfTiles()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_AmountOfTiles();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Map#getMapSizeX <em>Map Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Size X</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Map#getMapSizeX()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_MapSizeX();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Map#getMapSizeY <em>Map Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Size Y</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Map#getMapSizeY()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_MapSizeY();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Map#getTileSizeY <em>Tile Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Size Y</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Map#getTileSizeY()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_TileSizeY();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.matrixgame.game.Map#getTileSizeX <em>Tile Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Size X</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.Map#getTileSizeX()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_TileSizeX();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.Map#initializeMap() <em>Initialize Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Map</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.Map#initializeMap()
	 * @generated
	 */
	EOperation getMap__InitializeMap();

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
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#getPlayer()
	 * @see #getGameLogic()
	 * @generated
	 */
	EReference getGameLogic_Player();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getGameaction <em>Gameaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gameaction</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#getGameaction()
	 * @see #getGameLogic()
	 * @generated
	 */
	EReference getGameLogic_Gameaction();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#getMap()
	 * @see #getGameLogic()
	 * @generated
	 */
	EReference getGameLogic_Map();

	/**
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#applyAction(no.ntnu.tdt4250.matrixgame.game.Action, no.ntnu.tdt4250.matrixgame.game.Tile) <em>Apply Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Action</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#applyAction(no.ntnu.tdt4250.matrixgame.game.Action, no.ntnu.tdt4250.matrixgame.game.Tile)
	 * @generated
	 */
	EOperation getGameLogic__ApplyAction__Action_Tile();

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
	 * Returns the meta object for the '{@link no.ntnu.tdt4250.matrixgame.game.GameLogic#generateStartingPosition() <em>Generate Starting Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Starting Position</em>' operation.
	 * @see no.ntnu.tdt4250.matrixgame.game.GameLogic#generateStartingPosition()
	 * @generated
	 */
	EOperation getGameLogic__GenerateStartingPosition();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.matrixgame.game.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.matrixgame.game.TileType <em>Tile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tile Type</em>'.
	 * @see no.ntnu.tdt4250.matrixgame.game.TileType
	 * @generated
	 */
	EEnum getTileType();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.TileImpl
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getTile()
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
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__COLOR = eINSTANCE.getTile_Color();

		/**
		 * The meta object literal for the '<em><b>XCoordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__XCOORDINATE = eINSTANCE.getTile_XCoordinate();

		/**
		 * The meta object literal for the '<em><b>YCoordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__YCOORDINATE = eINSTANCE.getTile_YCoordinate();

		/**
		 * The meta object literal for the '<em><b>Tile Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__TILE_TYPE = eINSTANCE.getTile_TileType();

		/**
		 * The meta object literal for the '<em><b>Interact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TILE___INTERACT__ACTION = eINSTANCE.getTile__Interact__Action();

		/**
		 * The meta object literal for the '<em><b>Reveal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TILE___REVEAL = eINSTANCE.getTile__Reveal();

		/**
		 * The meta object literal for the '<em><b>Toggle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TILE___TOGGLE = eINSTANCE.getTile__Toggle();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.ActionImpl
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_TYPE = eINSTANCE.getAction_ActionType();

		/**
		 * The meta object literal for the '<em><b>Change Accessbility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CHANGE_ACCESSBILITY = eINSTANCE.getAction_Change_Accessbility();

		/**
		 * The meta object literal for the '<em><b>Change State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CHANGE_STATE = eINSTANCE.getAction_Change_State();

		/**
		 * The meta object literal for the '<em><b>Perform Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___PERFORM_ACTION = eINSTANCE.getAction__PerformAction();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.StateImpl
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

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
		 * The meta object literal for the '<em><b>Tile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TILE = eINSTANCE.getState_Tile();

		/**
		 * The meta object literal for the '<em><b>Get Current Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___GET_CURRENT_STATUS = eINSTANCE.getState__GetCurrentStatus();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.PlayerImpl
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

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
		 * The meta object literal for the '<em><b>Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__ACTION = eINSTANCE.getPlayer_Action();

		/**
		 * The meta object literal for the '<em><b>Take Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___TAKE_ACTION = eINSTANCE.getPlayer__TakeAction();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.matrixgame.game.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.MapImpl
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Tile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__TILE = eINSTANCE.getMap_Tile();

		/**
		 * The meta object literal for the '<em><b>Amount Of Tiles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__AMOUNT_OF_TILES = eINSTANCE.getMap_AmountOfTiles();

		/**
		 * The meta object literal for the '<em><b>Map Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__MAP_SIZE_X = eINSTANCE.getMap_MapSizeX();

		/**
		 * The meta object literal for the '<em><b>Map Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__MAP_SIZE_Y = eINSTANCE.getMap_MapSizeY();

		/**
		 * The meta object literal for the '<em><b>Tile Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__TILE_SIZE_Y = eINSTANCE.getMap_TileSizeY();

		/**
		 * The meta object literal for the '<em><b>Tile Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__TILE_SIZE_X = eINSTANCE.getMap_TileSizeX();

		/**
		 * The meta object literal for the '<em><b>Initialize Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP___INITIALIZE_MAP = eINSTANCE.getMap__InitializeMap();

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
		 * The meta object literal for the '<em><b>Player</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_LOGIC__PLAYER = eINSTANCE.getGameLogic_Player();

		/**
		 * The meta object literal for the '<em><b>Gameaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_LOGIC__GAMEACTION = eINSTANCE.getGameLogic_Gameaction();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_LOGIC__MAP = eINSTANCE.getGameLogic_Map();

		/**
		 * The meta object literal for the '<em><b>Apply Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_LOGIC___APPLY_ACTION__ACTION_TILE = eINSTANCE.getGameLogic__ApplyAction__Action_Tile();

		/**
		 * The meta object literal for the '<em><b>Is Game Over</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_LOGIC___IS_GAME_OVER = eINSTANCE.getGameLogic__IsGameOver();

		/**
		 * The meta object literal for the '<em><b>Generate Starting Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_LOGIC___GENERATE_STARTING_POSITION = eINSTANCE.getGameLogic__GenerateStartingPosition();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.matrixgame.game.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.matrixgame.game.ActionType
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.matrixgame.game.TileType <em>Tile Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.matrixgame.game.TileType
		 * @see no.ntnu.tdt4250.matrixgame.game.impl.GamePackageImpl#getTileType()
		 * @generated
		 */
		EEnum TILE_TYPE = eINSTANCE.getTileType();

	}

} //GamePackage
