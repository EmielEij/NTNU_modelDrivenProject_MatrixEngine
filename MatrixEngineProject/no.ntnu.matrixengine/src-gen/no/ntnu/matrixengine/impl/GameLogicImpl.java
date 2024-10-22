/**
 */
package no.ntnu.matrixengine.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import no.ntnu.matrixengine.Action;
import no.ntnu.matrixengine.ActionType;
import no.ntnu.matrixengine.GameLogic;
import no.ntnu.matrixengine.GameMap;
import no.ntnu.matrixengine.MatrixenginePackage;
import no.ntnu.matrixengine.Player;
import no.ntnu.matrixengine.Setup;
import no.ntnu.matrixengine.Tile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Logic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.impl.GameLogicImpl#isMultiplayer <em>Multiplayer</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.GameLogicImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.GameLogicImpl#getSetup <em>Setup</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.GameLogicImpl#getMap <em>Map</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.GameLogicImpl#getGameaction <em>Gameaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameLogicImpl extends MinimalEObjectImpl.Container implements GameLogic {
	/**
	 * The default value of the '{@link #isMultiplayer() <em>Multiplayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiplayer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLAYER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiplayer() <em>Multiplayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiplayer()
	 * @generated
	 * @ordered
	 */
	protected boolean multiplayer = MULTIPLAYER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> player;

	/**
	 * The cached value of the '{@link #getSetup() <em>Setup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetup()
	 * @generated
	 * @ordered
	 */
	protected Setup setup;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected GameMap map;

	/**
	 * The cached value of the '{@link #getGameaction() <em>Gameaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameaction()
	 * @generated
	 * @ordered
	 */
	protected Action gameaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameLogicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixenginePackage.Literals.GAME_LOGIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultiplayer() {
		return multiplayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplayer(boolean newMultiplayer) {
		boolean oldMultiplayer = multiplayer;
		multiplayer = newMultiplayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.GAME_LOGIC__MULTIPLAYER,
					oldMultiplayer, multiplayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayer() {
		if (player == null) {
			player = new EObjectContainmentEList<Player>(Player.class, this, MatrixenginePackage.GAME_LOGIC__PLAYER);
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Setup getSetup() {
		if (setup != null && setup.eIsProxy()) {
			InternalEObject oldSetup = (InternalEObject) setup;
			setup = (Setup) eResolveProxy(oldSetup);
			if (setup != oldSetup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatrixenginePackage.GAME_LOGIC__SETUP,
							oldSetup, setup));
			}
		}
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setup basicGetSetup() {
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetup(Setup newSetup, NotificationChain msgs) {
		Setup oldSetup = setup;
		setup = newSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MatrixenginePackage.GAME_LOGIC__SETUP, oldSetup, newSetup);
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
	public void setSetup(Setup newSetup) {
		if (newSetup != setup) {
			NotificationChain msgs = null;
			if (setup != null)
				msgs = ((InternalEObject) setup).eInverseRemove(this, MatrixenginePackage.SETUP__GAME, Setup.class,
						msgs);
			if (newSetup != null)
				msgs = ((InternalEObject) newSetup).eInverseAdd(this, MatrixenginePackage.SETUP__GAME, Setup.class,
						msgs);
			msgs = basicSetSetup(newSetup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.GAME_LOGIC__SETUP, newSetup,
					newSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameMap getMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(GameMap newMap, NotificationChain msgs) {
		GameMap oldMap = map;
		map = newMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MatrixenginePackage.GAME_LOGIC__MAP, oldMap, newMap);
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
	public void setMap(GameMap newMap) {
		if (newMap != map) {
			NotificationChain msgs = null;
			if (map != null)
				msgs = ((InternalEObject) map).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MatrixenginePackage.GAME_LOGIC__MAP, null, msgs);
			if (newMap != null)
				msgs = ((InternalEObject) newMap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MatrixenginePackage.GAME_LOGIC__MAP, null, msgs);
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.GAME_LOGIC__MAP, newMap, newMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getGameaction() {
		if (gameaction != null && gameaction.eIsProxy()) {
			InternalEObject oldGameaction = (InternalEObject) gameaction;
			gameaction = (Action) eResolveProxy(oldGameaction);
			if (gameaction != oldGameaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MatrixenginePackage.GAME_LOGIC__GAMEACTION, oldGameaction, gameaction));
			}
		}
		return gameaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetGameaction() {
		return gameaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameaction(Action newGameaction) {
		Action oldGameaction = gameaction;
		gameaction = newGameaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.GAME_LOGIC__GAMEACTION,
					oldGameaction, gameaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void applyAction(ActionType action, Tile tile) {
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
	public void checkWinCondition() {
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
	public void isGameOver() {
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
		case MatrixenginePackage.GAME_LOGIC__SETUP:
			if (setup != null)
				msgs = ((InternalEObject) setup).eInverseRemove(this, MatrixenginePackage.SETUP__GAME, Setup.class,
						msgs);
			return basicSetSetup((Setup) otherEnd, msgs);
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
		case MatrixenginePackage.GAME_LOGIC__PLAYER:
			return ((InternalEList<?>) getPlayer()).basicRemove(otherEnd, msgs);
		case MatrixenginePackage.GAME_LOGIC__SETUP:
			return basicSetSetup(null, msgs);
		case MatrixenginePackage.GAME_LOGIC__MAP:
			return basicSetMap(null, msgs);
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
		case MatrixenginePackage.GAME_LOGIC__MULTIPLAYER:
			return isMultiplayer();
		case MatrixenginePackage.GAME_LOGIC__PLAYER:
			return getPlayer();
		case MatrixenginePackage.GAME_LOGIC__SETUP:
			if (resolve)
				return getSetup();
			return basicGetSetup();
		case MatrixenginePackage.GAME_LOGIC__MAP:
			return getMap();
		case MatrixenginePackage.GAME_LOGIC__GAMEACTION:
			if (resolve)
				return getGameaction();
			return basicGetGameaction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MatrixenginePackage.GAME_LOGIC__MULTIPLAYER:
			setMultiplayer((Boolean) newValue);
			return;
		case MatrixenginePackage.GAME_LOGIC__PLAYER:
			getPlayer().clear();
			getPlayer().addAll((Collection<? extends Player>) newValue);
			return;
		case MatrixenginePackage.GAME_LOGIC__SETUP:
			setSetup((Setup) newValue);
			return;
		case MatrixenginePackage.GAME_LOGIC__MAP:
			setMap((GameMap) newValue);
			return;
		case MatrixenginePackage.GAME_LOGIC__GAMEACTION:
			setGameaction((Action) newValue);
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
		case MatrixenginePackage.GAME_LOGIC__MULTIPLAYER:
			setMultiplayer(MULTIPLAYER_EDEFAULT);
			return;
		case MatrixenginePackage.GAME_LOGIC__PLAYER:
			getPlayer().clear();
			return;
		case MatrixenginePackage.GAME_LOGIC__SETUP:
			setSetup((Setup) null);
			return;
		case MatrixenginePackage.GAME_LOGIC__MAP:
			setMap((GameMap) null);
			return;
		case MatrixenginePackage.GAME_LOGIC__GAMEACTION:
			setGameaction((Action) null);
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
		case MatrixenginePackage.GAME_LOGIC__MULTIPLAYER:
			return multiplayer != MULTIPLAYER_EDEFAULT;
		case MatrixenginePackage.GAME_LOGIC__PLAYER:
			return player != null && !player.isEmpty();
		case MatrixenginePackage.GAME_LOGIC__SETUP:
			return setup != null;
		case MatrixenginePackage.GAME_LOGIC__MAP:
			return map != null;
		case MatrixenginePackage.GAME_LOGIC__GAMEACTION:
			return gameaction != null;
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
		case MatrixenginePackage.GAME_LOGIC___APPLY_ACTION__ACTIONTYPE_TILE:
			applyAction((ActionType) arguments.get(0), (Tile) arguments.get(1));
			return null;
		case MatrixenginePackage.GAME_LOGIC___CHECK_WIN_CONDITION:
			checkWinCondition();
			return null;
		case MatrixenginePackage.GAME_LOGIC___IS_GAME_OVER:
			isGameOver();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (multiplayer: ");
		result.append(multiplayer);
		result.append(')');
		return result.toString();
	}

} //GameLogicImpl
