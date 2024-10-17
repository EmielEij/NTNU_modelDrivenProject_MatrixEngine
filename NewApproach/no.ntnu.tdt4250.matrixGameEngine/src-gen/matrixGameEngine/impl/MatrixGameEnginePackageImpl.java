/**
 */
package matrixGameEngine.impl;

import matrixGameEngine.Action;
import matrixGameEngine.ActionType;
import matrixGameEngine.GameLogic;
import matrixGameEngine.Map;
import matrixGameEngine.MatrixGameEngineFactory;
import matrixGameEngine.MatrixGameEnginePackage;
import matrixGameEngine.Player;
import matrixGameEngine.State;
import matrixGameEngine.Tile;
import matrixGameEngine.TileType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatrixGameEnginePackageImpl extends EPackageImpl implements MatrixGameEnginePackage {
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
	private EClass mapEClass = null;

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
	private EEnum tileTypeEEnum = null;

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
	private EDataType newDataType1EDataType = null;

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
	 * @see matrixGameEngine.MatrixGameEnginePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MatrixGameEnginePackageImpl() {
		super(eNS_URI, MatrixGameEngineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MatrixGameEnginePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MatrixGameEnginePackage init() {
		if (isInited)
			return (MatrixGameEnginePackage) EPackage.Registry.INSTANCE.getEPackage(MatrixGameEnginePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMatrixGameEnginePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MatrixGameEnginePackageImpl theMatrixGameEnginePackage = registeredMatrixGameEnginePackage instanceof MatrixGameEnginePackageImpl
				? (MatrixGameEnginePackageImpl) registeredMatrixGameEnginePackage
				: new MatrixGameEnginePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMatrixGameEnginePackage.createPackageContents();

		// Initialize created meta-data
		theMatrixGameEnginePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMatrixGameEnginePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MatrixGameEnginePackage.eNS_URI, theMatrixGameEnginePackage);
		return theMatrixGameEnginePackage;
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
	public EAttribute getTile_Color() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_XCoordinate() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_YCoordinate() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTile__GetTileType() {
		return tileEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTile__Interact__Action() {
		return tileEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTile__Reveal() {
		return tileEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTile__Toggle() {
		return tileEClass.getEOperations().get(3);
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
	public EOperation getState__GetCurrentStatus() {
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
	public EOperation getMap__InitializeMap() {
		return mapEClass.getEOperations().get(0);
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
	public EReference getPlayer_State() {
		return (EReference) playerEClass.getEStructuralFeatures().get(1);
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
	public EReference getGameLogic_Gameaction() {
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
	public EAttribute getGameLogic_Players() {
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
	public EEnum getTileType() {
		return tileTypeEEnum;
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
	public EDataType getNewDataType1() {
		return newDataType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatrixGameEngineFactory getMatrixGameEngineFactory() {
		return (MatrixGameEngineFactory) getEFactoryInstance();
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
		createEAttribute(tileEClass, TILE__IS_ACCESSIBLE);
		createEAttribute(tileEClass, TILE__COLOR);
		createEAttribute(tileEClass, TILE__XCOORDINATE);
		createEAttribute(tileEClass, TILE__YCOORDINATE);
		createEOperation(tileEClass, TILE___GET_TILE_TYPE);
		createEOperation(tileEClass, TILE___INTERACT__ACTION);
		createEOperation(tileEClass, TILE___REVEAL);
		createEOperation(tileEClass, TILE___TOGGLE);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__TURNS_TAKEN);
		createEAttribute(stateEClass, STATE__FLAGS_PLACED);
		createEAttribute(stateEClass, STATE__IS_OVER);
		createEReference(stateEClass, STATE__TILE);
		createEOperation(stateEClass, STATE___GET_CURRENT_STATUS);
		createEOperation(stateEClass, STATE___GET_PLAYERS_TURN);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);
		createEAttribute(actionEClass, ACTION__ACTION_TYPE);
		createEOperation(actionEClass, ACTION___PERFORM_ACTION);

		mapEClass = createEClass(MAP);
		createEReference(mapEClass, MAP__TILE);
		createEAttribute(mapEClass, MAP__AMOUNT_OF_TILES);
		createEOperation(mapEClass, MAP___INITIALIZE_MAP);

		playerEClass = createEClass(PLAYER);
		createEAttribute(playerEClass, PLAYER__SCORE);
		createEReference(playerEClass, PLAYER__STATE);
		createEOperation(playerEClass, PLAYER___TAKE_ACTION);

		gameLogicEClass = createEClass(GAME_LOGIC);
		createEAttribute(gameLogicEClass, GAME_LOGIC__MULTIPLAYER);
		createEReference(gameLogicEClass, GAME_LOGIC__PLAYER);
		createEReference(gameLogicEClass, GAME_LOGIC__GAMEACTION);
		createEReference(gameLogicEClass, GAME_LOGIC__MAP);
		createEAttribute(gameLogicEClass, GAME_LOGIC__PLAYERS);
		createEOperation(gameLogicEClass, GAME_LOGIC___APPLY_ACTION__ACTION_TILE);
		createEOperation(gameLogicEClass, GAME_LOGIC___IS_GAME_OVER);
		createEOperation(gameLogicEClass, GAME_LOGIC___GENERATE_STARTING_POSITION);

		// Create enums
		tileTypeEEnum = createEEnum(TILE_TYPE);
		actionTypeEEnum = createEEnum(ACTION_TYPE);

		// Create data types
		newDataType1EDataType = createEDataType(NEW_DATA_TYPE1);
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
		initEAttribute(getTile_IsAccessible(), ecorePackage.getEBoolean(), "isAccessible", null, 0, 1, Tile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_Color(), ecorePackage.getEString(), "Color", null, 0, 1, Tile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_XCoordinate(), ecorePackage.getEInt(), "xCoordinate", null, 1, 1, Tile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_YCoordinate(), ecorePackage.getEInt(), "yCoordinate", null, 1, 1, Tile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTile__GetTileType(), this.getTileType(), "getTileType", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getTile__Interact__Action(), null, "interact", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTile__Reveal(), null, "reveal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTile__Toggle(), null, "toggle", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		initEOperation(getState__GetCurrentStatus(), this.getTile(), "getCurrentStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getState__GetPlayersTurn(), this.getPlayer(), "getPlayersTurn", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionType(), this.getActionType(), "actionType", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAction__PerformAction(), null, "performAction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMap_Tile(), this.getTile(), null, "tile", null, 4, -1, Map.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_AmountOfTiles(), ecorePackage.getEInt(), "amountOfTiles", null, 0, 1, Map.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMap__InitializeMap(), null, "initializeMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayer_Score(), ecorePackage.getEInt(), "Score", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_State(), this.getState(), null, "state", null, 1, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getPlayer__TakeAction(), null, "takeAction", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameLogicEClass, GameLogic.class, "GameLogic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameLogic_Multiplayer(), ecorePackage.getEBoolean(), "multiplayer", null, 0, 1,
				GameLogic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGameLogic_Player(), this.getPlayer(), null, "player", null, 1, -1, GameLogic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameLogic_Gameaction(), this.getAction(), null, "gameaction", null, 0, -1, GameLogic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameLogic_Map(), this.getMap(), null, "map", null, 1, 1, GameLogic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getGameLogic_Players(), g1, "Players", null, 0, 1, GameLogic.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGameLogic__ApplyAction__Action_Tile(), this.getState(), "applyAction", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTile(), "tile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameLogic__IsGameOver(), null, "isGameOver", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameLogic__GenerateStartingPosition(), this.getTile(), "generateStartingPosition", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tileTypeEEnum, TileType.class, "TileType");
		addEEnumLiteral(tileTypeEEnum, TileType.BASIC);
		addEEnumLiteral(tileTypeEEnum, TileType.REVERALBLE);
		addEEnumLiteral(tileTypeEEnum, TileType.TOGGLEABLE);
		addEEnumLiteral(tileTypeEEnum, TileType.INTERACTIVE);

		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.NONE);
		addEEnumLiteral(actionTypeEEnum, ActionType.REVEAL);
		addEEnumLiteral(actionTypeEEnum, ActionType.MOVE);
		addEEnumLiteral(actionTypeEEnum, ActionType.TOGGLE);
		addEEnumLiteral(actionTypeEEnum, ActionType.ATTACK);

		// Initialize data types
		initEDataType(newDataType1EDataType, Object.class, "NewDataType1", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MatrixGameEnginePackageImpl
