/**
 */
package no.ntnu.tdt4250.matrixgame.game.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import no.ntnu.tdt4250.matrixgame.game.Board;
import no.ntnu.tdt4250.matrixgame.game.GamePackage;
import no.ntnu.tdt4250.matrixgame.game.Logic;
import no.ntnu.tdt4250.matrixgame.game.Player;
import no.ntnu.tdt4250.matrixgame.game.Rule;

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
 * An implementation of the model object '<em><b>Logic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.LogicImpl#getGameBoard <em>Game Board</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.LogicImpl#isRules <em>Rules</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.LogicImpl#getPlayer1 <em>Player1</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.LogicImpl#getPlayer2 <em>Player2</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.LogicImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.LogicImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.LogicImpl#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicImpl extends MinimalEObjectImpl.Container implements Logic {
	/**
	 * The default value of the '{@link #getGameBoard() <em>Game Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameBoard()
	 * @generated
	 * @ordered
	 */
	protected static final char GAME_BOARD_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getGameBoard() <em>Game Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameBoard()
	 * @generated
	 * @ordered
	 */
	protected char gameBoard = GAME_BOARD_EDEFAULT;

	/**
	 * The default value of the '{@link #isRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRules()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RULES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRules()
	 * @generated
	 * @ordered
	 */
	protected boolean rules = RULES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayer1() <em>Player1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer1()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PLAYER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlayer1() <em>Player1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer1()
	 * @generated
	 * @ordered
	 */
	protected Boolean player1 = PLAYER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayer2() <em>Player2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer2()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PLAYER2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlayer2() <em>Player2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer2()
	 * @generated
	 * @ordered
	 */
	protected Boolean player2 = PLAYER2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Rule rule;

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
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.LOGIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getGameBoard() {
		return gameBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameBoard(char newGameBoard) {
		char oldGameBoard = gameBoard;
		gameBoard = newGameBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LOGIC__GAME_BOARD, oldGameBoard,
					gameBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRules(boolean newRules) {
		boolean oldRules = rules;
		rules = newRules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LOGIC__RULES, oldRules, rules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPlayer1() {
		return player1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayer1(Boolean newPlayer1) {
		Boolean oldPlayer1 = player1;
		player1 = newPlayer1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LOGIC__PLAYER1, oldPlayer1, player1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPlayer2() {
		return player2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayer2(Boolean newPlayer2) {
		Boolean oldPlayer2 = player2;
		player2 = newPlayer2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LOGIC__PLAYER2, oldPlayer2, player2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		Rule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.LOGIC__RULE,
					oldRule, newRule);
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
	public void setRule(Rule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject) rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.LOGIC__RULE,
						null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject) newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.LOGIC__RULE,
						null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LOGIC__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayer() {
		if (player == null) {
			player = new EObjectContainmentEList<Player>(Player.class, this, GamePackage.LOGIC__PLAYER);
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board getBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.LOGIC__BOARD,
					oldBoard, newBoard);
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
	public void setBoard(Board newBoard) {
		if (newBoard != board) {
			NotificationChain msgs = null;
			if (board != null)
				msgs = ((InternalEObject) board).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.LOGIC__BOARD,
						null, msgs);
			if (newBoard != null)
				msgs = ((InternalEObject) newBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.LOGIC__BOARD,
						null, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.LOGIC__BOARD, newBoard, newBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void startGame() {
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
	public void main() {
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
		case GamePackage.LOGIC__RULE:
			return basicSetRule(null, msgs);
		case GamePackage.LOGIC__PLAYER:
			return ((InternalEList<?>) getPlayer()).basicRemove(otherEnd, msgs);
		case GamePackage.LOGIC__BOARD:
			return basicSetBoard(null, msgs);
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
		case GamePackage.LOGIC__GAME_BOARD:
			return getGameBoard();
		case GamePackage.LOGIC__RULES:
			return isRules();
		case GamePackage.LOGIC__PLAYER1:
			return getPlayer1();
		case GamePackage.LOGIC__PLAYER2:
			return getPlayer2();
		case GamePackage.LOGIC__RULE:
			return getRule();
		case GamePackage.LOGIC__PLAYER:
			return getPlayer();
		case GamePackage.LOGIC__BOARD:
			return getBoard();
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
		case GamePackage.LOGIC__GAME_BOARD:
			setGameBoard((Character) newValue);
			return;
		case GamePackage.LOGIC__RULES:
			setRules((Boolean) newValue);
			return;
		case GamePackage.LOGIC__PLAYER1:
			setPlayer1((Boolean) newValue);
			return;
		case GamePackage.LOGIC__PLAYER2:
			setPlayer2((Boolean) newValue);
			return;
		case GamePackage.LOGIC__RULE:
			setRule((Rule) newValue);
			return;
		case GamePackage.LOGIC__PLAYER:
			getPlayer().clear();
			getPlayer().addAll((Collection<? extends Player>) newValue);
			return;
		case GamePackage.LOGIC__BOARD:
			setBoard((Board) newValue);
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
		case GamePackage.LOGIC__GAME_BOARD:
			setGameBoard(GAME_BOARD_EDEFAULT);
			return;
		case GamePackage.LOGIC__RULES:
			setRules(RULES_EDEFAULT);
			return;
		case GamePackage.LOGIC__PLAYER1:
			setPlayer1(PLAYER1_EDEFAULT);
			return;
		case GamePackage.LOGIC__PLAYER2:
			setPlayer2(PLAYER2_EDEFAULT);
			return;
		case GamePackage.LOGIC__RULE:
			setRule((Rule) null);
			return;
		case GamePackage.LOGIC__PLAYER:
			getPlayer().clear();
			return;
		case GamePackage.LOGIC__BOARD:
			setBoard((Board) null);
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
		case GamePackage.LOGIC__GAME_BOARD:
			return gameBoard != GAME_BOARD_EDEFAULT;
		case GamePackage.LOGIC__RULES:
			return rules != RULES_EDEFAULT;
		case GamePackage.LOGIC__PLAYER1:
			return PLAYER1_EDEFAULT == null ? player1 != null : !PLAYER1_EDEFAULT.equals(player1);
		case GamePackage.LOGIC__PLAYER2:
			return PLAYER2_EDEFAULT == null ? player2 != null : !PLAYER2_EDEFAULT.equals(player2);
		case GamePackage.LOGIC__RULE:
			return rule != null;
		case GamePackage.LOGIC__PLAYER:
			return player != null && !player.isEmpty();
		case GamePackage.LOGIC__BOARD:
			return board != null;
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
		case GamePackage.LOGIC___START_GAME:
			startGame();
			return null;
		case GamePackage.LOGIC___MAIN:
			main();
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
		result.append(" (gameBoard: ");
		result.append(gameBoard);
		result.append(", rules: ");
		result.append(rules);
		result.append(", player1: ");
		result.append(player1);
		result.append(", player2: ");
		result.append(player2);
		result.append(')');
		return result.toString();
	}

} //LogicImpl
