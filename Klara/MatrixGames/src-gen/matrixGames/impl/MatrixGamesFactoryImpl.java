/**
 */
package matrixGames.impl;

import matrixGames.*;

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
public class MatrixGamesFactoryImpl extends EFactoryImpl implements MatrixGamesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MatrixGamesFactory init() {
		try {
			MatrixGamesFactory theMatrixGamesFactory = (MatrixGamesFactory) EPackage.Registry.INSTANCE
					.getEFactory(MatrixGamesPackage.eNS_URI);
			if (theMatrixGamesFactory != null) {
				return theMatrixGamesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MatrixGamesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixGamesFactoryImpl() {
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
		case MatrixGamesPackage.LOGIC:
			return createLogic();
		case MatrixGamesPackage.RULE:
			return createRule();
		case MatrixGamesPackage.BOARD:
			return createBoard();
		case MatrixGamesPackage.PLAYER:
			return createPlayer();
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
	public Logic createLogic() {
		LogicImpl logic = new LogicImpl();
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
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
	public MatrixGamesPackage getMatrixGamesPackage() {
		return (MatrixGamesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MatrixGamesPackage getPackage() {
		return MatrixGamesPackage.eINSTANCE;
	}

} //MatrixGamesFactoryImpl
