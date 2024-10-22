/**
 */
package no.ntnu.matrixengine.impl;

import java.lang.reflect.InvocationTargetException;

import no.ntnu.matrixengine.GameLogic;
import no.ntnu.matrixengine.MatrixenginePackage;
import no.ntnu.matrixengine.Player;
import no.ntnu.matrixengine.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.impl.PlayerImpl#getTime <em>Time</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.PlayerImpl#getScore <em>Score</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.PlayerImpl#getState <em>State</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.PlayerImpl#getGamelogic <em>Gamelogic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final int SCORE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected int score = SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * The cached value of the '{@link #getGamelogic() <em>Gamelogic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamelogic()
	 * @generated
	 * @ordered
	 */
	protected GameLogic gamelogic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixenginePackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.PLAYER__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(int newScore) {
		int oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.PLAYER__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject) state;
			state = (State) eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatrixenginePackage.PLAYER__STATE,
							oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.PLAYER__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameLogic getGamelogic() {
		if (gamelogic != null && gamelogic.eIsProxy()) {
			InternalEObject oldGamelogic = (InternalEObject) gamelogic;
			gamelogic = (GameLogic) eResolveProxy(oldGamelogic);
			if (gamelogic != oldGamelogic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatrixenginePackage.PLAYER__GAMELOGIC,
							oldGamelogic, gamelogic));
			}
		}
		return gamelogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameLogic basicGetGamelogic() {
		return gamelogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGamelogic(GameLogic newGamelogic) {
		GameLogic oldGamelogic = gamelogic;
		gamelogic = newGamelogic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.PLAYER__GAMELOGIC, oldGamelogic,
					gamelogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void takeAction() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MatrixenginePackage.PLAYER__TIME:
			return getTime();
		case MatrixenginePackage.PLAYER__SCORE:
			return getScore();
		case MatrixenginePackage.PLAYER__STATE:
			if (resolve)
				return getState();
			return basicGetState();
		case MatrixenginePackage.PLAYER__GAMELOGIC:
			if (resolve)
				return getGamelogic();
			return basicGetGamelogic();
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
		case MatrixenginePackage.PLAYER__TIME:
			setTime((Integer) newValue);
			return;
		case MatrixenginePackage.PLAYER__SCORE:
			setScore((Integer) newValue);
			return;
		case MatrixenginePackage.PLAYER__STATE:
			setState((State) newValue);
			return;
		case MatrixenginePackage.PLAYER__GAMELOGIC:
			setGamelogic((GameLogic) newValue);
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
		case MatrixenginePackage.PLAYER__TIME:
			setTime(TIME_EDEFAULT);
			return;
		case MatrixenginePackage.PLAYER__SCORE:
			setScore(SCORE_EDEFAULT);
			return;
		case MatrixenginePackage.PLAYER__STATE:
			setState((State) null);
			return;
		case MatrixenginePackage.PLAYER__GAMELOGIC:
			setGamelogic((GameLogic) null);
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
		case MatrixenginePackage.PLAYER__TIME:
			return time != TIME_EDEFAULT;
		case MatrixenginePackage.PLAYER__SCORE:
			return score != SCORE_EDEFAULT;
		case MatrixenginePackage.PLAYER__STATE:
			return state != null;
		case MatrixenginePackage.PLAYER__GAMELOGIC:
			return gamelogic != null;
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
		case MatrixenginePackage.PLAYER___TAKE_ACTION:
			takeAction();
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
		result.append(" (Time: ");
		result.append(time);
		result.append(", Score: ");
		result.append(score);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
