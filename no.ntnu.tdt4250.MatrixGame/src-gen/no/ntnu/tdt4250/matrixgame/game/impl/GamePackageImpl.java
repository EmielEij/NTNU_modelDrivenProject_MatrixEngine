/**
 */
package no.ntnu.tdt4250.matrixgame.game.impl;

import no.ntnu.tdt4250.matrixgame.game.Action;
import no.ntnu.tdt4250.matrixgame.game.ActionType;
import no.ntnu.tdt4250.matrixgame.game.GameFactory;
import no.ntnu.tdt4250.matrixgame.game.GameLogic;
import no.ntnu.tdt4250.matrixgame.game.GamePackage;
import no.ntnu.tdt4250.matrixgame.game.Map;
import no.ntnu.tdt4250.matrixgame.game.Player;
import no.ntnu.tdt4250.matrixgame.game.State;
import no.ntnu.tdt4250.matrixgame.game.Tile;
import no.ntnu.tdt4250.matrixgame.game.TileType;

import no.ntnu.tdt4250.matrixgame.game.util.GameValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class GamePackageImpl extends EPackageImpl implements GamePackage {
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
	private EClass actionEClass = null;

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
	private EClass playerEClass = null;

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
	private EClass gameLogicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tileTypeEEnum = null;

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
	 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GamePackageImpl() {
		super(eNS_URI, GameFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GamePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GamePackage init() {
		if (isInited)
			return (GamePackage) EPackage.Registry.INSTANCE.getEPackage(GamePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGamePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GamePackageImpl theGamePackage = registeredGamePackage instanceof GamePackageImpl
				? (GamePackageImpl) registeredGamePackage
				: new GamePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGamePackage.createPackageContents();

		// Initialize created meta-data
		theGamePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theGamePackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return GameValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theGamePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GamePackage.eNS_URI, theGamePackage);
		return theGamePackage;
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
		return (EAttribute) tileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_Color() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_XCoordinate() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_YCoordinate() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_TileType() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_TilePlace() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTile__Interact__Action() {
		return tileEClass.getEOperations().get(0);
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
	public EAttribute getAction_Name() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_ActionType() {
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
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_TurnsTaken() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_FlagsPlaced() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_IsOver() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Tile() {
		return (EReference) stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Name() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getState__GetCurrentStatus() {
		return stateEClass.getEOperations().get(0);
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
	public EAttribute getPlayer_Score() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayer_Takes_action() {
		return (EReference) playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayer_Name() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(2);
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
	public EClass getMap() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMap_Tile() {
		return (EReference) mapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMap_AmountOfTiles() {
		return (EAttribute) mapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMap_MapSizeX() {
		return (EAttribute) mapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMap_MapSizeY() {
		return (EAttribute) mapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMap_MapName() {
		return (EAttribute) mapEClass.getEStructuralFeatures().get(4);
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
	public EClass getGameLogic() {
		return gameLogicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameLogic_Player() {
		return (EReference) gameLogicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameLogic_Map() {
		return (EReference) gameLogicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameLogic_Actions_played() {
		return (EReference) gameLogicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameLogic_Has_state() {
		return (EReference) gameLogicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameLogic_GameName() {
		return (EAttribute) gameLogicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGameLogic__ApplyAction__Action_Tile() {
		return gameLogicEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGameLogic__IsGameOver() {
		return gameLogicEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGameLogic__GenerateStartingPosition() {
		return gameLogicEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTileType() {
		return tileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameFactory getGameFactory() {
		return (GameFactory) getEFactoryInstance();
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
		tileEClass = createEClass(TILE);
		createEAttribute(tileEClass, TILE__TILE_PLACE);
		createEAttribute(tileEClass, TILE__TILE_TYPE);
		createEAttribute(tileEClass, TILE__IS_ACCESSIBLE);
		createEAttribute(tileEClass, TILE__COLOR);
		createEAttribute(tileEClass, TILE__XCOORDINATE);
		createEAttribute(tileEClass, TILE__YCOORDINATE);
		createEOperation(tileEClass, TILE___INTERACT__ACTION);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);
		createEAttribute(actionEClass, ACTION__ACTION_TYPE);
		createEOperation(actionEClass, ACTION___PERFORM_ACTION);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__TURNS_TAKEN);
		createEAttribute(stateEClass, STATE__FLAGS_PLACED);
		createEAttribute(stateEClass, STATE__IS_OVER);
		createEReference(stateEClass, STATE__TILE);
		createEAttribute(stateEClass, STATE__NAME);
		createEOperation(stateEClass, STATE___GET_CURRENT_STATUS);

		playerEClass = createEClass(PLAYER);
		createEAttribute(playerEClass, PLAYER__SCORE);
		createEReference(playerEClass, PLAYER__TAKES_ACTION);
		createEAttribute(playerEClass, PLAYER__NAME);
		createEOperation(playerEClass, PLAYER___TAKE_ACTION);

		mapEClass = createEClass(MAP);
		createEReference(mapEClass, MAP__TILE);
		createEAttribute(mapEClass, MAP__AMOUNT_OF_TILES);
		createEAttribute(mapEClass, MAP__MAP_SIZE_X);
		createEAttribute(mapEClass, MAP__MAP_SIZE_Y);
		createEAttribute(mapEClass, MAP__MAP_NAME);
		createEOperation(mapEClass, MAP___INITIALIZE_MAP);

		gameLogicEClass = createEClass(GAME_LOGIC);
		createEReference(gameLogicEClass, GAME_LOGIC__PLAYER);
		createEReference(gameLogicEClass, GAME_LOGIC__MAP);
		createEReference(gameLogicEClass, GAME_LOGIC__ACTIONS_PLAYED);
		createEReference(gameLogicEClass, GAME_LOGIC__HAS_STATE);
		createEAttribute(gameLogicEClass, GAME_LOGIC__GAME_NAME);
		createEOperation(gameLogicEClass, GAME_LOGIC___APPLY_ACTION__ACTION_TILE);
		createEOperation(gameLogicEClass, GAME_LOGIC___IS_GAME_OVER);
		createEOperation(gameLogicEClass, GAME_LOGIC___GENERATE_STARTING_POSITION);

		// Create enums
		actionTypeEEnum = createEEnum(ACTION_TYPE);
		tileTypeEEnum = createEEnum(TILE_TYPE);
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
		initEClass(tileEClass, Tile.class, "Tile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTile_TilePlace(), ecorePackage.getEString(), "tilePlace", null, 1, 1, Tile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_TileType(), this.getTileType(), "tileType", null, 1, 1, Tile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_IsAccessible(), ecorePackage.getEBoolean(), "isAccessible", null, 1, 1, Tile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_Color(), ecorePackage.getEString(), "Color", null, 0, 1, Tile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_XCoordinate(), ecorePackage.getEInt(), "xCoordinate", null, 1, 1, Tile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_YCoordinate(), ecorePackage.getEInt(), "yCoordinate", null, 1, 1, Tile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTile__Interact__Action(), null, "interact", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionType(), this.getActionType(), "actionType", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAction__PerformAction(), null, "performAction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_TurnsTaken(), ecorePackage.getEInt(), "turnsTaken", null, 0, 1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_FlagsPlaced(), ecorePackage.getEBoolean(), "flagsPlaced", null, 0, 1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_IsOver(), ecorePackage.getEBoolean(), "isOver", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Tile(), this.getTile(), null, "tile", null, 1, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getState__GetCurrentStatus(), this.getTile(), "getCurrentStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayer_Score(), ecorePackage.getEInt(), "score", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_Takes_action(), this.getAction(), null, "takes_action", null, 0, -1, Player.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlayer__TakeAction(), null, "takeAction", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMap_Tile(), this.getTile(), null, "tile", null, 4, -1, Map.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_AmountOfTiles(), ecorePackage.getEInt(), "amountOfTiles", null, 0, 1, Map.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_MapSizeX(), ecorePackage.getEInt(), "mapSizeX", null, 1, 1, Map.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_MapSizeY(), ecorePackage.getEInt(), "mapSizeY", null, 1, 1, Map.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_MapName(), ecorePackage.getEString(), "mapName", null, 0, 1, Map.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMap__InitializeMap(), null, "initializeMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameLogicEClass, GameLogic.class, "GameLogic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameLogic_Player(), this.getPlayer(), null, "player", null, 1, 1, GameLogic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameLogic_Map(), this.getMap(), null, "map", null, 1, 1, GameLogic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGameLogic_Actions_played(), this.getAction(), null, "actions_played", null, 0, -1,
				GameLogic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameLogic_Has_state(), this.getState(), null, "has_state", null, 0, -1, GameLogic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameLogic_GameName(), ecorePackage.getEString(), "gameName", null, 0, 1, GameLogic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGameLogic__ApplyAction__Action_Tile(), this.getState(), "applyAction", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTile(), "tile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameLogic__IsGameOver(), null, "isGameOver", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameLogic__GenerateStartingPosition(), this.getTile(), "generateStartingPosition", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.NONE);
		addEEnumLiteral(actionTypeEEnum, ActionType.REVEAL);
		addEEnumLiteral(actionTypeEEnum, ActionType.MOVE);
		addEEnumLiteral(actionTypeEEnum, ActionType.TOGGLE);
		addEEnumLiteral(actionTypeEEnum, ActionType.ATTACK);

		initEEnum(tileTypeEEnum, TileType.class, "TileType");
		addEEnumLiteral(tileTypeEEnum, TileType.BASIC);
		addEEnumLiteral(tileTypeEEnum, TileType.REWARD);
		addEEnumLiteral(tileTypeEEnum, TileType.OBSTACLE);
		addEEnumLiteral(tileTypeEEnum, TileType.INTERACTIVE);
		addEEnumLiteral(tileTypeEEnum, TileType.CRASH);

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
				new String[] { "constraints", "mapSizeMustBeSquare mapSizeMustFitScreen tileSizeMustBeSquare" });
	}

} //GamePackageImpl
