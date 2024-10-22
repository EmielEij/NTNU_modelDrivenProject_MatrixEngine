/**
 */
package no.ntnu.matrixengine.impl;

import no.ntnu.matrixengine.Action;
import no.ntnu.matrixengine.ActionType;
import no.ntnu.matrixengine.Field;
import no.ntnu.matrixengine.GameLogic;
import no.ntnu.matrixengine.GameMap;
import no.ntnu.matrixengine.Map;
import no.ntnu.matrixengine.MatrixengineFactory;
import no.ntnu.matrixengine.MatrixenginePackage;
import no.ntnu.matrixengine.Player;
import no.ntnu.matrixengine.Setup;
import no.ntnu.matrixengine.State;
import no.ntnu.matrixengine.Tile;
import no.ntnu.matrixengine.util.MatrixengineValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatrixenginePackageImpl extends EPackageImpl implements MatrixenginePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameLogicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameMapEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.ntnu.matrixengine.MatrixenginePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MatrixenginePackageImpl() {
		super(eNS_URI, MatrixengineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MatrixenginePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MatrixenginePackage init() {
		if (isInited)
			return (MatrixenginePackage) EPackage.Registry.INSTANCE.getEPackage(MatrixenginePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMatrixenginePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MatrixenginePackageImpl theMatrixenginePackage = registeredMatrixenginePackage instanceof MatrixenginePackageImpl
				? (MatrixenginePackageImpl) registeredMatrixenginePackage
				: new MatrixenginePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMatrixenginePackage.createPackageContents();

		// Initialize created meta-data
		theMatrixenginePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theMatrixenginePackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return MatrixengineValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theMatrixenginePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MatrixenginePackage.eNS_URI, theMatrixenginePackage);
		return theMatrixenginePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetup() {
		return setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetup_Game() {
		return (EReference) setupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetup_Map() {
		return (EReference) setupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSetup__InitField() {
		return setupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSetup__LoadGame() {
		return setupEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSetup__SetStartTile() {
		return setupEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getField_Tile() {
		return (EReference) fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTile() {
		return tileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_IsAccessible() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_Content() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_Color() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_Neighbours() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTile__IsUsed() {
		return tileEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayer_Time() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayer_Score() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayer_State() {
		return (EReference) playerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayer_Gamelogic() {
		return (EReference) playerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPlayer__TakeAction() {
		return playerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGameLogic() {
		return gameLogicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameLogic_Multiplayer() {
		return (EAttribute) gameLogicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameLogic_Player() {
		return (EReference) gameLogicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameLogic_Setup() {
		return (EReference) gameLogicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameLogic_Map() {
		return (EReference) gameLogicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameLogic_Gameaction() {
		return (EReference) gameLogicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGameLogic__ApplyAction__ActionType_Tile() {
		return gameLogicEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGameLogic__CheckWinCondition() {
		return gameLogicEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGameLogic__IsGameOver() {
		return gameLogicEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMap() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMap_Name() {
		return (EAttribute) mapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMap_Tile() {
		return (EReference) mapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMap_SizeY() {
		return (EAttribute) mapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMap_SizeX() {
		return (EAttribute) mapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMap__InitializeMap() {
		return mapEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMap__GetTile__int_int() {
		return mapEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMap__LoadMap() {
		return mapEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Map() {
		return (EReference) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_TurnsTaken() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_FlagsPlaced() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_IsOver() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__GetCurrentTile() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__GetPlayersTurn() {
		return stateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Actiontype() {
		return (EReference) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Name() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAction__PerformAction() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionType() {
		return actionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionType_Name() {
		return (EAttribute) actionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionType_ValidTiles() {
		return (EAttribute) actionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGameMap() {
		return gameMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameMap_State() {
		return (EReference) gameMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameMap_Tile() {
		return (EReference) gameMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameMap_TileSizeX() {
		return (EAttribute) gameMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameMap_TileSizeY() {
		return (EAttribute) gameMapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameMap_MapSizeX() {
		return (EAttribute) gameMapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameMap_MapSizeY() {
		return (EAttribute) gameMapEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatrixengineFactory getMatrixengineFactory() {
		return (MatrixengineFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		setupEClass = createEClass(SETUP);
		createEReference(setupEClass, SETUP__GAME);
		createEReference(setupEClass, SETUP__MAP);
		createEOperation(setupEClass, SETUP___INIT_FIELD);
		createEOperation(setupEClass, SETUP___LOAD_GAME);
		createEOperation(setupEClass, SETUP___SET_START_TILE);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__TILE);

		tileEClass = createEClass(TILE);
		createEAttribute(tileEClass, TILE__IS_ACCESSIBLE);
		createEAttribute(tileEClass, TILE__CONTENT);
		createEAttribute(tileEClass, TILE__COLOR);
		createEAttribute(tileEClass, TILE__NEIGHBOURS);
		createEOperation(tileEClass, TILE___IS_USED);

		playerEClass = createEClass(PLAYER);
		createEAttribute(playerEClass, PLAYER__TIME);
		createEAttribute(playerEClass, PLAYER__SCORE);
		createEReference(playerEClass, PLAYER__STATE);
		createEReference(playerEClass, PLAYER__GAMELOGIC);
		createEOperation(playerEClass, PLAYER___TAKE_ACTION);

		gameLogicEClass = createEClass(GAME_LOGIC);
		createEAttribute(gameLogicEClass, GAME_LOGIC__MULTIPLAYER);
		createEReference(gameLogicEClass, GAME_LOGIC__PLAYER);
		createEReference(gameLogicEClass, GAME_LOGIC__SETUP);
		createEReference(gameLogicEClass, GAME_LOGIC__MAP);
		createEReference(gameLogicEClass, GAME_LOGIC__GAMEACTION);
		createEOperation(gameLogicEClass, GAME_LOGIC___APPLY_ACTION__ACTIONTYPE_TILE);
		createEOperation(gameLogicEClass, GAME_LOGIC___CHECK_WIN_CONDITION);
		createEOperation(gameLogicEClass, GAME_LOGIC___IS_GAME_OVER);

		mapEClass = createEClass(MAP);
		createEAttribute(mapEClass, MAP__NAME);
		createEReference(mapEClass, MAP__TILE);
		createEAttribute(mapEClass, MAP__SIZE_Y);
		createEAttribute(mapEClass, MAP__SIZE_X);
		createEOperation(mapEClass, MAP___INITIALIZE_MAP);
		createEOperation(mapEClass, MAP___GET_TILE__INT_INT);
		createEOperation(mapEClass, MAP___LOAD_MAP);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__MAP);
		createEAttribute(stateEClass, STATE__TURNS_TAKEN);
		createEAttribute(stateEClass, STATE__FLAGS_PLACED);
		createEAttribute(stateEClass, STATE__IS_OVER);
		createEOperation(stateEClass, STATE___GET_CURRENT_TILE);
		createEOperation(stateEClass, STATE___GET_PLAYERS_TURN);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__ACTIONTYPE);
		createEAttribute(actionEClass, ACTION__NAME);
		createEOperation(actionEClass, ACTION___PERFORM_ACTION);

		actionTypeEClass = createEClass(ACTION_TYPE);
		createEAttribute(actionTypeEClass, ACTION_TYPE__NAME);
		createEAttribute(actionTypeEClass, ACTION_TYPE__VALID_TILES);

		gameMapEClass = createEClass(GAME_MAP);
		createEReference(gameMapEClass, GAME_MAP__STATE);
		createEReference(gameMapEClass, GAME_MAP__TILE);
		createEAttribute(gameMapEClass, GAME_MAP__TILE_SIZE_X);
		createEAttribute(gameMapEClass, GAME_MAP__TILE_SIZE_Y);
		createEAttribute(gameMapEClass, GAME_MAP__MAP_SIZE_X);
		createEAttribute(gameMapEClass, GAME_MAP__MAP_SIZE_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(setupEClass, Setup.class, "Setup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetup_Game(), this.getGameLogic(), this.getGameLogic_Setup(), "game", null, 0, 1, Setup.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetup_Map(), this.getGameMap(), null, "map", null, 1, 1, Setup.class, IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);

		initEOperation(getSetup__InitField(), null, "InitField", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSetup__LoadGame(), this.getGameLogic(), "loadGame", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSetup__SetStartTile(), this.getTile(), "setStartTile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Tile(), this.getTile(), null, "tile", null, 4, -1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(tileEClass, Tile.class, "Tile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTile_IsAccessible(), ecorePackage.getEInt(), "isAccessible", null, 0, 1, Tile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_Content(), ecorePackage.getEInt(), "content", null, 0, 1, Tile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_Color(), ecorePackage.getEString(), "Color", null, 0, 1, Tile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getTile_Neighbours(), g1, "neighbours", null, 0, 1, Tile.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTile__IsUsed(), null, "IsUsed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayer_Time(), ecorePackage.getEInt(), "Time", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Score(), ecorePackage.getEInt(), "Score", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_State(), this.getState(), null, "state", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPlayer_Gamelogic(), this.getGameLogic(), null, "gamelogic", null, 0, 1, Player.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlayer__TakeAction(), null, "takeAction", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameLogicEClass, GameLogic.class, "GameLogic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameLogic_Multiplayer(), ecorePackage.getEBoolean(), "multiplayer", null, 0, 1,
				GameLogic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGameLogic_Player(), this.getPlayer(), null, "player", null, 1, -1, GameLogic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameLogic_Setup(), this.getSetup(), this.getSetup_Game(), "setup", null, 0, 1,
				GameLogic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameLogic_Map(), this.getGameMap(), null, "map", null, 1, 1, GameLogic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGameLogic_Gameaction(), this.getAction(), null, "gameaction", null, 0, 1, GameLogic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGameLogic__ApplyAction__ActionType_Tile(), null, "applyAction", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActionType(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTile(), "tile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameLogic__CheckWinCondition(), null, "checkWinCondition", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameLogic__IsGameOver(), null, "isGameOver", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMap_Name(), ecorePackage.getEString(), "name", null, 0, 1, Map.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMap_Tile(), this.getTile(), null, "tile", null, 1, -1, Map.class, IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_SizeY(), ecorePackage.getEInt(), "SizeY", null, 0, 1, Map.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_SizeX(), ecorePackage.getEInt(), "SizeX", null, 0, 1, Map.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMap__InitializeMap(), null, "initializeMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMap__GetTile__int_int(), null, "getTile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMap__LoadMap(), this.getMap(), "loadMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Map(), this.getGameMap(), null, "map", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getState_TurnsTaken(), ecorePackage.getEInt(), "turnsTaken", null, 0, 1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_FlagsPlaced(), ecorePackage.getEInt(), "flagsPlaced", null, 0, 1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_IsOver(), ecorePackage.getEBoolean(), "isOver", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getState__GetCurrentTile(), this.getTile(), "getCurrentTile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getState__GetPlayersTurn(), this.getPlayer(), "getPlayersTurn", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Actiontype(), this.getActionType(), null, "actiontype", null, 1, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAction__PerformAction(), null, "performAction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionTypeEClass, ActionType.class, "ActionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getActionType_ValidTiles(), g1, "validTiles", null, 0, 1, ActionType.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameMapEClass, GameMap.class, "GameMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameMap_State(), this.getState(), null, "state", null, 0, 1, GameMap.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGameMap_Tile(), this.getTile(), null, "tile", null, 4, -1, GameMap.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getGameMap_TileSizeX(), ecorePackage.getEInt(), "tileSizeX", null, 0, 1, GameMap.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameMap_TileSizeY(), ecorePackage.getEInt(), "tileSizeY", null, 0, 1, GameMap.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameMap_MapSizeX(), ecorePackage.getEInt(), "mapSizeX", null, 0, 1, GameMap.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameMap_MapSizeY(), ecorePackage.getEInt(), "mapSizeY", null, 0, 1, GameMap.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(mapEClass, source,
				new String[] { "constraints", "tileMustBeSquare fieldMustBeSquare fieldMustFitOnScreen" });
		addAnnotation(gameMapEClass, source,
				new String[] { "constraints", "tileSizeMustBeSquare mapSizeMustFitScreen mapSizeMustBeSquare" });
	}

} //MatrixenginePackageImpl
