/**
 */
package no.ntnu.tdt4250.matrixgame.game.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import no.ntnu.tdt4250.matrixgame.game.Action;
import no.ntnu.tdt4250.matrixgame.game.ActionType;
import no.ntnu.tdt4250.matrixgame.game.GameLogic;
import no.ntnu.tdt4250.matrixgame.game.GamePackage;
import no.ntnu.tdt4250.matrixgame.game.Map;
import no.ntnu.tdt4250.matrixgame.game.Player;
import no.ntnu.tdt4250.matrixgame.game.State;
import no.ntnu.tdt4250.matrixgame.game.Tile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl#getMultiplayer <em>Multiplayer</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl#getGameaction <em>Gameaction</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameLogicImpl extends MinimalEObjectImpl.Container implements GameLogic {
	/**
	 * The default value of the '{@link #getMultiplayer() <em>Multiplayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplayer()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType MULTIPLAYER_EDEFAULT = ActionType.NONE;

	/**
	 * The cached value of the '{@link #getMultiplayer() <em>Multiplayer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplayer()
	 * @generated
	 * @ordered
	 */
	protected ActionType multiplayer = MULTIPLAYER_EDEFAULT;

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
	 * The cached value of the '{@link #getGameaction() <em>Gameaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> gameaction;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected Map map;

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
		return GamePackage.Literals.GAME_LOGIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionType getMultiplayer() {
		return multiplayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplayer(ActionType newMultiplayer) {
		ActionType oldMultiplayer = multiplayer;
		multiplayer = newMultiplayer == null ? MULTIPLAYER_EDEFAULT : newMultiplayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME_LOGIC__MULTIPLAYER, oldMultiplayer,
					multiplayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayer() {
		if (player == null) {
			player = new EObjectContainmentEList<Player>(Player.class, this, GamePackage.GAME_LOGIC__PLAYER);
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getGameaction() {
		if (gameaction == null) {
			gameaction = new EObjectResolvingEList<Action>(Action.class, this, GamePackage.GAME_LOGIC__GAMEACTION);
		}
		return gameaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map getMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(Map newMap, NotificationChain msgs) {
		Map oldMap = map;
		map = newMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.GAME_LOGIC__MAP,
					oldMap, newMap);
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
	public void setMap(Map newMap) {
		if (newMap != map) {
			NotificationChain msgs = null;
			if (map != null)
				msgs = ((InternalEObject) map).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_LOGIC__MAP, null, msgs);
			if (newMap != null)
				msgs = ((InternalEObject) newMap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_LOGIC__MAP, null, msgs);
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME_LOGIC__MAP, newMap, newMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State applyAction(Action action, Tile tile) {
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
	public Tile generateStartingPosition() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.GAME_LOGIC__PLAYER:
			return ((InternalEList<?>) getPlayer()).basicRemove(otherEnd, msgs);
		case GamePackage.GAME_LOGIC__MAP:
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
		case GamePackage.GAME_LOGIC__MULTIPLAYER:
			return getMultiplayer();
		case GamePackage.GAME_LOGIC__PLAYER:
			return getPlayer();
		case GamePackage.GAME_LOGIC__GAMEACTION:
			return getGameaction();
		case GamePackage.GAME_LOGIC__MAP:
			return getMap();
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
		case GamePackage.GAME_LOGIC__MULTIPLAYER:
			setMultiplayer((ActionType) newValue);
			return;
		case GamePackage.GAME_LOGIC__PLAYER:
			getPlayer().clear();
			getPlayer().addAll((Collection<? extends Player>) newValue);
			return;
		case GamePackage.GAME_LOGIC__GAMEACTION:
			getGameaction().clear();
			getGameaction().addAll((Collection<? extends Action>) newValue);
			return;
		case GamePackage.GAME_LOGIC__MAP:
			setMap((Map) newValue);
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
		case GamePackage.GAME_LOGIC__MULTIPLAYER:
			setMultiplayer(MULTIPLAYER_EDEFAULT);
			return;
		case GamePackage.GAME_LOGIC__PLAYER:
			getPlayer().clear();
			return;
		case GamePackage.GAME_LOGIC__GAMEACTION:
			getGameaction().clear();
			return;
		case GamePackage.GAME_LOGIC__MAP:
			setMap((Map) null);
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
		case GamePackage.GAME_LOGIC__MULTIPLAYER:
			return multiplayer != MULTIPLAYER_EDEFAULT;
		case GamePackage.GAME_LOGIC__PLAYER:
			return player != null && !player.isEmpty();
		case GamePackage.GAME_LOGIC__GAMEACTION:
			return gameaction != null && !gameaction.isEmpty();
		case GamePackage.GAME_LOGIC__MAP:
			return map != null;
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
		case GamePackage.GAME_LOGIC___APPLY_ACTION__ACTION_TILE:
			return applyAction((Action) arguments.get(0), (Tile) arguments.get(1));
		case GamePackage.GAME_LOGIC___IS_GAME_OVER:
			isGameOver();
			return null;
		case GamePackage.GAME_LOGIC___GENERATE_STARTING_POSITION:
			return generateStartingPosition();
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
