/**
 */
package no.ntnu.matrixengine.util;

import java.util.Map;

import no.ntnu.matrixengine.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.matrixengine.MatrixenginePackage
 * @generated
 */
public class MatrixengineValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MatrixengineValidator INSTANCE = new MatrixengineValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.matrixengine";

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
	public MatrixengineValidator() {
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
		return MatrixenginePackage.eINSTANCE;
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
		case MatrixenginePackage.SETUP:
			return validateSetup((Setup) value, diagnostics, context);
		case MatrixenginePackage.FIELD:
			return validateField((Field) value, diagnostics, context);
		case MatrixenginePackage.TILE:
			return validateTile((Tile) value, diagnostics, context);
		case MatrixenginePackage.PLAYER:
			return validatePlayer((Player) value, diagnostics, context);
		case MatrixenginePackage.GAME_LOGIC:
			return validateGameLogic((GameLogic) value, diagnostics, context);
		case MatrixenginePackage.MAP:
			return validateMap((no.ntnu.matrixengine.Map) value, diagnostics, context);
		case MatrixenginePackage.STATE:
			return validateState((State) value, diagnostics, context);
		case MatrixenginePackage.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case MatrixenginePackage.ACTION_TYPE:
			return validateActionType((ActionType) value, diagnostics, context);
		case MatrixenginePackage.GAME_MAP:
			return validateGameMap((GameMap) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetup(Setup setup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(field, diagnostics, context);
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
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(player, diagnostics, context);
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
	public boolean validateMap(no.ntnu.matrixengine.Map map, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
			result &= validateMap_tileMustBeSquare(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMap_fieldMustBeSquare(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMap_fieldMustFitOnScreen(map, diagnostics, context);
		return result;
	}

	/**
	 * Validates the tileMustBeSquare constraint of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMap_tileMustBeSquare(no.ntnu.matrixengine.Map map, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "tileMustBeSquare", getObjectLabel(map, context) }, new Object[] { map },
								context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the fieldMustBeSquare constraint of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMap_fieldMustBeSquare(no.ntnu.matrixengine.Map map, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "fieldMustBeSquare", getObjectLabel(map, context) },
								new Object[] { map }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the fieldMustFitOnScreen constraint of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMap_fieldMustFitOnScreen(no.ntnu.matrixengine.Map map, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "fieldMustFitOnScreen", getObjectLabel(map, context) },
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
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
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
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameMap(GameMap gameMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gameMap, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(gameMap, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(gameMap, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(gameMap, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(gameMap, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(gameMap, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(gameMap, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(gameMap, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(gameMap, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGameMap_tileSizeMustBeSquare(gameMap, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGameMap_mapSizeMustFitScreen(gameMap, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGameMap_mapSizeMustBeSquare(gameMap, diagnostics, context);
		return result;
	}

	/**
	 * Validates the tileSizeMustBeSquare constraint of '<em>Game Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameMap_tileSizeMustBeSquare(GameMap gameMap, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "tileSizeMustBeSquare", getObjectLabel(gameMap, context) },
								new Object[] { gameMap }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the mapSizeMustFitScreen constraint of '<em>Game Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameMap_mapSizeMustFitScreen(GameMap gameMap, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "mapSizeMustFitScreen", getObjectLabel(gameMap, context) },
								new Object[] { gameMap }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the mapSizeMustBeSquare constraint of '<em>Game Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameMap_mapSizeMustBeSquare(GameMap gameMap, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "mapSizeMustBeSquare", getObjectLabel(gameMap, context) },
								new Object[] { gameMap }, context));
			}
			return false;
		}
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

} //MatrixengineValidator
