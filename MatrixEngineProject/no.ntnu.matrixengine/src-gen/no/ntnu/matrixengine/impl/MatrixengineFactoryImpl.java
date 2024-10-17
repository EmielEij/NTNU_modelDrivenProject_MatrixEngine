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
		case MatrixenginePackage.MAIN:
			return createmain();
		case MatrixenginePackage.SETUP:
			return createSetup();
		case MatrixenginePackage.UPDATE_FIELD:
			return createUpdateField();
		case MatrixenginePackage.GAME_OVER:
			return createGameOver();
		case MatrixenginePackage.GET_USER_INPUT:
			return createGetUserInput();
		case MatrixenginePackage.FIELD:
			return createField();
		case MatrixenginePackage.TILE:
			return createTile();
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
	public main createmain() {
		mainImpl main = new mainImpl();
		return main;
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
	public UpdateField createUpdateField() {
		UpdateFieldImpl updateField = new UpdateFieldImpl();
		return updateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameOver createGameOver() {
		GameOverImpl gameOver = new GameOverImpl();
		return gameOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetUserInput createGetUserInput() {
		GetUserInputImpl getUserInput = new GetUserInputImpl();
		return getUserInput;
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
