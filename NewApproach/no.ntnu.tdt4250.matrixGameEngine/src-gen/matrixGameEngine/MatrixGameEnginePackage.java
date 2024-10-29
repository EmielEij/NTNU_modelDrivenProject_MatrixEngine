/**
 */
package matrixGameEngine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

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
 * @see matrixGameEngine.MatrixGameEngineFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface MatrixGameEnginePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "matrixGameEngine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/matrixGameEngine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "matrixGameEngine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatrixGameEnginePackage eINSTANCE = matrixGameEngine.impl.MatrixGameEnginePackageImpl.init();

	/**
	 * The meta object id for the '{@link matrixGameEngine.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGameEngine.impl.TileImpl
	 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getTile()
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Tile Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE___GET_TILE_TYPE = 0;

	/**
	 * The operation id for the '<em>Interact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE___INTERACT__ACTION = 1;

	/**
	 * The operation id for the '<em>Reveal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE___REVEAL = 2;

	/**
	 * The operation id for the '<em>Toggle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE___TOGGLE = 3;

	/**
	 * The number of operations of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link matrixGameEngine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGameEngine.impl.StateImpl
	 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

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
	 * The meta object id for the '{@link matrixGameEngine.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGameEngine.impl.ActionImpl
	 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

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
	 * The meta object id for the '{@link matrixGameEngine.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGameEngine.impl.MapImpl
	 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getMap()
	 * @generated
	 */
	int MAP = 3;

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
	 * The meta object id for the '{@link matrixGameEngine.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGameEngine.impl.PlayerImpl
	 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 4;

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
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link matrixGameEngine.impl.GameLogicImpl <em>Game Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGameEngine.impl.GameLogicImpl
	 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getGameLogic()
	 * @generated
	 */
	int GAME_LOGIC = 5;

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
	 * The feature id for the '<em><b>Gameaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__GAMEACTION = 2;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__MAP = 3;

	/**
	 * The feature id for the '<em><b>Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC__PLAYERS = 4;

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
	 * The number of operations of the '<em>Game Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOGIC_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link matrixGameEngine.TileType <em>Tile Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGameEngine.TileType
	 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getTileType()
	 * @generated
	 */
	int TILE_TYPE = 6;

	/**
	 * The meta object id for the '{@link matrixGameEngine.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see matrixGameEngine.ActionType
	 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 7;

	/**
	 * The meta object id for the '<em>New Data Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getNewDataType1()
	 * @generated
	 */
	int NEW_DATA_TYPE1 = 8;

	int ACTION_TYPE__NAME = 0;

	/**
	 * Returns the meta object for class '{@link matrixGameEngine.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see matrixGameEngine.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Tile#isIsAccessible <em>Is Accessible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Accessible</em>'.
	 * @see matrixGameEngine.Tile#isIsAccessible()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_IsAccessible();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Tile#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see matrixGameEngine.Tile#getColor()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Color();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Tile#getXCoordinate <em>XCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCoordinate</em>'.
	 * @see matrixGameEngine.Tile#getXCoordinate()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_XCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Tile#getYCoordinate <em>YCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCoordinate</em>'.
	 * @see matrixGameEngine.Tile#getYCoordinate()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_YCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Tile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see matrixGameEngine.Tile#getType()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Type();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.Tile#getTileType() <em>Get Tile Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tile Type</em>' operation.
	 * @see matrixGameEngine.Tile#getTileType()
	 * @generated
	 */
	EOperation getTile__GetTileType();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.Tile#interact(matrixGameEngine.Action) <em>Interact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interact</em>' operation.
	 * @see matrixGameEngine.Tile#interact(matrixGameEngine.Action)
	 * @generated
	 */
	EOperation getTile__Interact__Action();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.Tile#reveal() <em>Reveal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reveal</em>' operation.
	 * @see matrixGameEngine.Tile#reveal()
	 * @generated
	 */
	EOperation getTile__Reveal();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.Tile#toggle() <em>Toggle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Toggle</em>' operation.
	 * @see matrixGameEngine.Tile#toggle()
	 * @generated
	 */
	EOperation getTile__Toggle();

	/**
	 * Returns the meta object for class '{@link matrixGameEngine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see matrixGameEngine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.State#getTurnsTaken <em>Turns Taken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turns Taken</em>'.
	 * @see matrixGameEngine.State#getTurnsTaken()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_TurnsTaken();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.State#isFlagsPlaced <em>Flags Placed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags Placed</em>'.
	 * @see matrixGameEngine.State#isFlagsPlaced()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_FlagsPlaced();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.State#isIsOver <em>Is Over</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Over</em>'.
	 * @see matrixGameEngine.State#isIsOver()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsOver();

	/**
	 * Returns the meta object for the reference '{@link matrixGameEngine.State#getTile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tile</em>'.
	 * @see matrixGameEngine.State#getTile()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Tile();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.State#getCurrentStatus() <em>Get Current Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Status</em>' operation.
	 * @see matrixGameEngine.State#getCurrentStatus()
	 * @generated
	 */
	EOperation getState__GetCurrentStatus();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.State#getPlayersTurn() <em>Get Players Turn</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Players Turn</em>' operation.
	 * @see matrixGameEngine.State#getPlayersTurn()
	 * @generated
	 */
	EOperation getState__GetPlayersTurn();

	/**
	 * Returns the meta object for class '{@link matrixGameEngine.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see matrixGameEngine.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see matrixGameEngine.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Action#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see matrixGameEngine.Action#getActionType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionType();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.Action#performAction() <em>Perform Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Action</em>' operation.
	 * @see matrixGameEngine.Action#performAction()
	 * @generated
	 */
	EOperation getAction__PerformAction();

	/**
	 * Returns the meta object for class '{@link matrixGameEngine.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see matrixGameEngine.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the containment reference list '{@link matrixGameEngine.Map#getTile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tile</em>'.
	 * @see matrixGameEngine.Map#getTile()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Tile();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Map#getAmountOfTiles <em>Amount Of Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Tiles</em>'.
	 * @see matrixGameEngine.Map#getAmountOfTiles()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_AmountOfTiles();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Map#getMapSizeX <em>Map Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Size X</em>'.
	 * @see matrixGameEngine.Map#getMapSizeX()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_MapSizeX();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Map#getMapSizeY <em>Map Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Size Y</em>'.
	 * @see matrixGameEngine.Map#getMapSizeY()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_MapSizeY();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Map#getTileSizeY <em>Tile Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Size Y</em>'.
	 * @see matrixGameEngine.Map#getTileSizeY()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_TileSizeY();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Map#getTileSizeX <em>Tile Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Size X</em>'.
	 * @see matrixGameEngine.Map#getTileSizeX()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_TileSizeX();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.Map#initializeMap() <em>Initialize Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Map</em>' operation.
	 * @see matrixGameEngine.Map#initializeMap()
	 * @generated
	 */
	EOperation getMap__InitializeMap();

	/**
	 * Returns the meta object for class '{@link matrixGameEngine.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see matrixGameEngine.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.Player#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see matrixGameEngine.Player#getScore()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Score();

	/**
	 * Returns the meta object for the reference '{@link matrixGameEngine.Player#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see matrixGameEngine.Player#getState()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_State();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.Player#takeAction() <em>Take Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take Action</em>' operation.
	 * @see matrixGameEngine.Player#takeAction()
	 * @generated
	 */
	EOperation getPlayer__TakeAction();

	/**
	 * Returns the meta object for class '{@link matrixGameEngine.GameLogic <em>Game Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Logic</em>'.
	 * @see matrixGameEngine.GameLogic
	 * @generated
	 */
	EClass getGameLogic();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.GameLogic#isMultiplayer <em>Multiplayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplayer</em>'.
	 * @see matrixGameEngine.GameLogic#isMultiplayer()
	 * @see #getGameLogic()
	 * @generated
	 */
	EAttribute getGameLogic_Multiplayer();

	/**
	 * Returns the meta object for the containment reference list '{@link matrixGameEngine.GameLogic#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Player</em>'.
	 * @see matrixGameEngine.GameLogic#getPlayer()
	 * @see #getGameLogic()
	 * @generated
	 */
	EReference getGameLogic_Player();

	/**
	 * Returns the meta object for the reference list '{@link matrixGameEngine.GameLogic#getGameaction <em>Gameaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gameaction</em>'.
	 * @see matrixGameEngine.GameLogic#getGameaction()
	 * @see #getGameLogic()
	 * @generated
	 */
	EReference getGameLogic_Gameaction();

	/**
	 * Returns the meta object for the containment reference '{@link matrixGameEngine.GameLogic#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see matrixGameEngine.GameLogic#getMap()
	 * @see #getGameLogic()
	 * @generated
	 */
	EReference getGameLogic_Map();

	/**
	 * Returns the meta object for the attribute '{@link matrixGameEngine.GameLogic#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Players</em>'.
	 * @see matrixGameEngine.GameLogic#getPlayers()
	 * @see #getGameLogic()
	 * @generated
	 */
	EAttribute getGameLogic_Players();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.GameLogic#applyAction(matrixGameEngine.Action, matrixGameEngine.Tile) <em>Apply Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Action</em>' operation.
	 * @see matrixGameEngine.GameLogic#applyAction(matrixGameEngine.Action, matrixGameEngine.Tile)
	 * @generated
	 */
	EOperation getGameLogic__ApplyAction__Action_Tile();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.GameLogic#isGameOver() <em>Is Game Over</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Game Over</em>' operation.
	 * @see matrixGameEngine.GameLogic#isGameOver()
	 * @generated
	 */
	EOperation getGameLogic__IsGameOver();

	/**
	 * Returns the meta object for the '{@link matrixGameEngine.GameLogic#generateStartingPosition() <em>Generate Starting Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Starting Position</em>' operation.
	 * @see matrixGameEngine.GameLogic#generateStartingPosition()
	 * @generated
	 */
	EOperation getGameLogic__GenerateStartingPosition();

	/**
	 * Returns the meta object for enum '{@link matrixGameEngine.TileType <em>Tile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tile Type</em>'.
	 * @see matrixGameEngine.TileType
	 * @generated
	 */
	EEnum getTileType();

	/**
	 * Returns the meta object for enum '{@link matrixGameEngine.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see matrixGameEngine.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>New Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>New Data Type1</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getNewDataType1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MatrixGameEngineFactory getMatrixGameEngineFactory();

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
		 * The meta object literal for the '{@link matrixGameEngine.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGameEngine.impl.TileImpl
		 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getTile()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__TYPE = eINSTANCE.getTile_Type();

		/**
		 * The meta object literal for the '<em><b>Get Tile Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TILE___GET_TILE_TYPE = eINSTANCE.getTile__GetTileType();

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
		 * The meta object literal for the '{@link matrixGameEngine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGameEngine.impl.StateImpl
		 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getState()
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
		 * The meta object literal for the '<em><b>Get Players Turn</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___GET_PLAYERS_TURN = eINSTANCE.getState__GetPlayersTurn();

		/**
		 * The meta object literal for the '{@link matrixGameEngine.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGameEngine.impl.ActionImpl
		 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getAction()
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
		 * The meta object literal for the '<em><b>Perform Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___PERFORM_ACTION = eINSTANCE.getAction__PerformAction();

		/**
		 * The meta object literal for the '{@link matrixGameEngine.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGameEngine.impl.MapImpl
		 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getMap()
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
		 * The meta object literal for the '{@link matrixGameEngine.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGameEngine.impl.PlayerImpl
		 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getPlayer()
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
		 * The meta object literal for the '<em><b>Take Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___TAKE_ACTION = eINSTANCE.getPlayer__TakeAction();

		/**
		 * The meta object literal for the '{@link matrixGameEngine.impl.GameLogicImpl <em>Game Logic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGameEngine.impl.GameLogicImpl
		 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getGameLogic()
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
		 * The meta object literal for the '<em><b>Players</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_LOGIC__PLAYERS = eINSTANCE.getGameLogic_Players();

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
		 * The meta object literal for the '{@link matrixGameEngine.TileType <em>Tile Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGameEngine.TileType
		 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getTileType()
		 * @generated
		 */
		EEnum TILE_TYPE = eINSTANCE.getTileType();

		/**
		 * The meta object literal for the '{@link matrixGameEngine.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see matrixGameEngine.ActionType
		 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '<em>New Data Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see matrixGameEngine.impl.MatrixGameEnginePackageImpl#getNewDataType1()
		 * @generated
		 */
		EDataType NEW_DATA_TYPE1 = eINSTANCE.getNewDataType1();

		EStructuralFeature ACTION_TYPE__NAME = null;

	}

} //MatrixGameEnginePackage
