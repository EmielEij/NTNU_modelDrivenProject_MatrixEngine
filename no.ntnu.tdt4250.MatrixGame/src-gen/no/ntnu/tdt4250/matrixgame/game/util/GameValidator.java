/**
 */
package no.ntnu.tdt4250.matrixgame.game.util;

import java.util.Map;

import no.ntnu.tdt4250.matrixgame.game.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage
 * @generated
 */
public class GameValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GameValidator INSTANCE = new GameValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.matrixgame.game";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return GamePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case GamePackage.TILE:
			return validateTile((Tile) value, diagnostics, context);
		case GamePackage.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case GamePackage.STATE:
			return validateState((State) value, diagnostics, context);
		case GamePackage.PLAYER:
			return validatePlayer((Player) value, diagnostics, context);
		case GamePackage.MAP:
			return validateMap((no.ntnu.tdt4250.matrixgame.game.Map) value, diagnostics, context);
		case GamePackage.GAME_LOGIC:
			return validateGameLogic((GameLogic) value, diagnostics, context);
		case GamePackage.ACTION_TYPE:
			return validateActionType((ActionType) value, diagnostics, context);
		case GamePackage.TILE_TYPE:
			return validateTileType((TileType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTile(Tile tile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(player, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMap(no.ntnu.tdt4250.matrixgame.game.Map map, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(map, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMap_mapSizeMustBeSquare(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMap_mapSizeMustFitScreen(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMap_tileSizeMustBeSquare(map, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mapSizeMustBeSquare constraint of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMap_mapSizeMustBeSquare(no.ntnu.tdt4250.matrixgame.game.Map map, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// IMPLEMENTED
		boolean valid = true;

		if (map.getMapSizeX() != map.getMapSizeY()) {
			valid = false;
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "mapSizeMustBeSquare", getObjectLabel(map, context) },
								new Object[] { map }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the mapSizeMustFitScreen constraint of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMap_mapSizeMustFitScreen(no.ntnu.tdt4250.matrixgame.game.Map map,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// IMPLEMENTED
		boolean valid = true;

		if (map.getMapSizeX() < 3 || map.getMapSizeX() > 30 || map.getMapSizeY() < 3 || map.getMapSizeY() > 30) {
			valid = false;
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "mapSizeMustFitScreen", getObjectLabel(map, context) },
								new Object[] { map }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the tileSizeMustBeSquare constraint of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMap_tileSizeMustBeSquare(no.ntnu.tdt4250.matrixgame.game.Map map,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// IMPLEMENTED
		boolean valid = true;

		if (map.getTileSizeX() != map.getMapSizeY()) {
			valid = false;
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "tileSizeMustBeSquare", getObjectLabel(map, context) },
								new Object[] { map }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameLogic(GameLogic gameLogic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gameLogic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTileType(TileType tileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GameValidator
