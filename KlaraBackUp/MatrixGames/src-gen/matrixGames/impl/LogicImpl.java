/**
 */
package matrixGames.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import matrixGames.Board;
import matrixGames.Logic;
import matrixGames.MatrixGamesPackage;
import matrixGames.Player;
import matrixGames.Rule;

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
 *   <li>{@link matrixGames.impl.LogicImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link matrixGames.impl.LogicImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link matrixGames.impl.LogicImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicImpl extends MinimalEObjectImpl.Container implements Logic {
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
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Rule rule;

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
		return MatrixGamesPackage.Literals.LOGIC;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MatrixGamesPackage.LOGIC__RULE, oldRule, newRule);
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
				msgs = ((InternalEObject) rule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MatrixGamesPackage.LOGIC__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject) newRule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MatrixGamesPackage.LOGIC__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGamesPackage.LOGIC__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayer() {
		if (player == null) {
			player = new EObjectContainmentEList<Player>(Player.class, this, MatrixGamesPackage.LOGIC__PLAYER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MatrixGamesPackage.LOGIC__BOARD, oldBoard, newBoard);
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
				msgs = ((InternalEObject) board).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MatrixGamesPackage.LOGIC__BOARD, null, msgs);
			if (newBoard != null)
				msgs = ((InternalEObject) newBoard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MatrixGamesPackage.LOGIC__BOARD, null, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGamesPackage.LOGIC__BOARD, newBoard, newBoard));
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
		case MatrixGamesPackage.LOGIC__PLAYER:
			return ((InternalEList<?>) getPlayer()).basicRemove(otherEnd, msgs);
		case MatrixGamesPackage.LOGIC__BOARD:
			return basicSetBoard(null, msgs);
		case MatrixGamesPackage.LOGIC__RULE:
			return basicSetRule(null, msgs);
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
		case MatrixGamesPackage.LOGIC__PLAYER:
			return getPlayer();
		case MatrixGamesPackage.LOGIC__BOARD:
			return getBoard();
		case MatrixGamesPackage.LOGIC__RULE:
			return getRule();
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
		case MatrixGamesPackage.LOGIC__PLAYER:
			getPlayer().clear();
			getPlayer().addAll((Collection<? extends Player>) newValue);
			return;
		case MatrixGamesPackage.LOGIC__BOARD:
			setBoard((Board) newValue);
			return;
		case MatrixGamesPackage.LOGIC__RULE:
			setRule((Rule) newValue);
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
		case MatrixGamesPackage.LOGIC__PLAYER:
			getPlayer().clear();
			return;
		case MatrixGamesPackage.LOGIC__BOARD:
			setBoard((Board) null);
			return;
		case MatrixGamesPackage.LOGIC__RULE:
			setRule((Rule) null);
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
		case MatrixGamesPackage.LOGIC__PLAYER:
			return player != null && !player.isEmpty();
		case MatrixGamesPackage.LOGIC__BOARD:
			return board != null;
		case MatrixGamesPackage.LOGIC__RULE:
			return rule != null;
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
		case MatrixGamesPackage.LOGIC___START_GAME:
			startGame();
			return null;
		case MatrixGamesPackage.LOGIC___MAIN:
			main();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //LogicImpl
