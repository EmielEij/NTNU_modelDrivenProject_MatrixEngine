/**
 */
package matrixGames.util;

import java.util.Map;

import matrixGames.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see matrixGames.MatrixGamesPackage
 * @generated
 */
public class MatrixGamesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MatrixGamesValidator INSTANCE = new MatrixGamesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "matrixGames";

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
	public MatrixGamesValidator() {
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
		return MatrixGamesPackage.eINSTANCE;
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
		case MatrixGamesPackage.LOGIC:
			return validateLogic((Logic) value, diagnostics, context);
		case MatrixGamesPackage.RULE:
			return validateRule((Rule) value, diagnostics, context);
		case MatrixGamesPackage.BOARD:
			return validateBoard((Board) value, diagnostics, context);
		case MatrixGamesPackage.PLAYER:
			return validatePlayer((Player) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogic(Logic logic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRule(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoard(Board board, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(board, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoard_atLeast2RowsAnd2Columns(board, diagnostics, context);
		return result;
	}

	/**
	 * Validates the atLeast2RowsAnd2Columns constraint of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoard_atLeast2RowsAnd2Columns(Board board, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = true;
		if (board.getColumns() < 2 && board.getRows() < 2) {
			valid = false;
		}
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "atLeast2RowsAnd2Columns", getObjectLabel(board, context) },
								new Object[] { board }, context));
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
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(player, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePlayer_symbolShouldNotContainSpecialCharacter(player, diagnostics, context);
		return result;
	}

	/**
	 * Validates the symbolShouldNotContainSpecialCharacter constraint of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePlayer_symbolShouldNotContainSpecialCharacter(Player player, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = true;
		if (player.getSymbol() == '.' || player.getSymbol() == '?' || player.getSymbol() == '!'
				|| player.getSymbol() == ':' || player.getSymbol() == '=') {
			valid = false;
		}
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "symbolShouldNotContainSpecialCharacter", getObjectLabel(player, context) },
						new Object[] { player }, context));
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

} //MatrixGamesValidator
