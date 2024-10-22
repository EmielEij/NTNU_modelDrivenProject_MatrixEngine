/**
 */
package no.ntnu.matrixengine.impl;

import no.ntnu.matrixengine.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatrixengineFactoryImpl extends EFactoryImpl implements MatrixengineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MatrixengineFactory init() {
		try {
			MatrixengineFactory theMatrixengineFactory = (MatrixengineFactory) EPackage.Registry.INSTANCE
					.getEFactory(MatrixenginePackage.eNS_URI);
			if (theMatrixengineFactory != null) {
				return theMatrixengineFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MatrixengineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixengineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MatrixenginePackage.SETUP:
			return createSetup();
		case MatrixenginePackage.FIELD:
			return createField();
		case MatrixenginePackage.TILE:
			return createTile();
		case MatrixenginePackage.PLAYER:
			return createPlayer();
		case MatrixenginePackage.GAME_LOGIC:
			return createGameLogic();
		case MatrixenginePackage.MAP:
			return createMap();
		case MatrixenginePackage.STATE:
			return createState();
		case MatrixenginePackage.ACTION:
			return createAction();
		case MatrixenginePackage.ACTION_TYPE:
			return createActionType();
		case MatrixenginePackage.GAME_MAP:
			return createGameMap();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Setup createSetup() {
		SetupImpl setup = new SetupImpl();
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tile createTile() {
		TileImpl tile = new TileImpl();
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameLogic createGameLogic() {
		GameLogicImpl gameLogic = new GameLogicImpl();
		return gameLogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionType createActionType() {
		ActionTypeImpl actionType = new ActionTypeImpl();
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameMap createGameMap() {
		GameMapImpl gameMap = new GameMapImpl();
		return gameMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatrixenginePackage getMatrixenginePackage() {
		return (MatrixenginePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MatrixenginePackage getPackage() {
		return MatrixenginePackage.eINSTANCE;
	}

} //MatrixengineFactoryImpl
