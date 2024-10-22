/**
 */
package no.ntnu.matrixengine.impl;

import java.lang.reflect.InvocationTargetException;
import no.ntnu.matrixengine.GameLogic;
import no.ntnu.matrixengine.GameMap;
import no.ntnu.matrixengine.MatrixenginePackage;
import no.ntnu.matrixengine.Setup;

import no.ntnu.matrixengine.Tile;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.impl.SetupImpl#getGame <em>Game</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.SetupImpl#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetupImpl extends MinimalEObjectImpl.Container implements Setup {
	/**
	 * The cached value of the '{@link #getGame() <em>Game</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGame()
	 * @generated
	 * @ordered
	 */
	protected GameLogic game;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixenginePackage.Literals.SETUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameLogic getGame() {
		if (game != null && game.eIsProxy()) {
			InternalEObject oldGame = (InternalEObject) game;
			game = (GameLogic) eResolveProxy(oldGame);
			if (game != oldGame) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatrixenginePackage.SETUP__GAME, oldGame,
							game));
			}
		}
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameLogic basicGetGame() {
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGame(GameLogic newGame, NotificationChain msgs) {
		GameLogic oldGame = game;
		game = newGame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MatrixenginePackage.SETUP__GAME, oldGame, newGame);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGame(GameLogic newGame) {
		if (newGame != game) {
			NotificationChain msgs = null;
			if (game != null)
				msgs = ((InternalEObject) game).eInverseRemove(this, MatrixenginePackage.GAME_LOGIC__SETUP,
						GameLogic.class, msgs);
			if (newGame != null)
				msgs = ((InternalEObject) newGame).eInverseAdd(this, MatrixenginePackage.GAME_LOGIC__SETUP,
						GameLogic.class, msgs);
			msgs = basicSetGame(newGame, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.SETUP__GAME, newGame, newGame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameMap getMap() {
		GameMap map = basicGetMap();
		return map != null && map.eIsProxy() ? (GameMap) eResolveProxy((InternalEObject) map) : map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameMap basicGetMap() {
		// TODO: implement this method to return the 'Map' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void InitField() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameLogic loadGame() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tile setStartTile() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MatrixenginePackage.SETUP__GAME:
			if (game != null)
				msgs = ((InternalEObject) game).eInverseRemove(this, MatrixenginePackage.GAME_LOGIC__SETUP,
						GameLogic.class, msgs);
			return basicSetGame((GameLogic) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MatrixenginePackage.SETUP__GAME:
			return basicSetGame(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MatrixenginePackage.SETUP__GAME:
			if (resolve)
				return getGame();
			return basicGetGame();
		case MatrixenginePackage.SETUP__MAP:
			if (resolve)
				return getMap();
			return basicGetMap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MatrixenginePackage.SETUP__GAME:
			setGame((GameLogic) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MatrixenginePackage.SETUP__GAME:
			setGame((GameLogic) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MatrixenginePackage.SETUP__GAME:
			return game != null;
		case MatrixenginePackage.SETUP__MAP:
			return basicGetMap() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MatrixenginePackage.SETUP___INIT_FIELD:
			InitField();
			return null;
		case MatrixenginePackage.SETUP___LOAD_GAME:
			return loadGame();
		case MatrixenginePackage.SETUP___SET_START_TILE:
			return setStartTile();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SetupImpl
