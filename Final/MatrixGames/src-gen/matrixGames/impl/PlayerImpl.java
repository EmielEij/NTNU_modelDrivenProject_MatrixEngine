/**
 */
package matrixGames.impl;

import matrixGames.MatrixGamesPackage;
import matrixGames.Player;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link matrixGames.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link matrixGames.impl.PlayerImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link matrixGames.impl.PlayerImpl#getGamePlayer <em>Game Player</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final char SYMBOL_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected char symbol = SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGamePlayer() <em>Game Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamePlayer()
	 * @generated
	 * @ordered
	 */
	protected static final String GAME_PLAYER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGamePlayer() <em>Game Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamePlayer()
	 * @generated
	 * @ordered
	 */
	protected String gamePlayer = GAME_PLAYER_EDEFAULT;

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
		return MatrixGamesPackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGamesPackage.PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(char newSymbol) {
		char oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGamesPackage.PLAYER__SYMBOL, oldSymbol,
					symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGamePlayer() {
		return gamePlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGamePlayer(String newGamePlayer) {
		String oldGamePlayer = gamePlayer;
		gamePlayer = newGamePlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixGamesPackage.PLAYER__GAME_PLAYER, oldGamePlayer,
					gamePlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MatrixGamesPackage.PLAYER__NAME:
			return getName();
		case MatrixGamesPackage.PLAYER__SYMBOL:
			return getSymbol();
		case MatrixGamesPackage.PLAYER__GAME_PLAYER:
			return getGamePlayer();
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
		case MatrixGamesPackage.PLAYER__NAME:
			setName((String) newValue);
			return;
		case MatrixGamesPackage.PLAYER__SYMBOL:
			setSymbol((Character) newValue);
			return;
		case MatrixGamesPackage.PLAYER__GAME_PLAYER:
			setGamePlayer((String) newValue);
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
		case MatrixGamesPackage.PLAYER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MatrixGamesPackage.PLAYER__SYMBOL:
			setSymbol(SYMBOL_EDEFAULT);
			return;
		case MatrixGamesPackage.PLAYER__GAME_PLAYER:
			setGamePlayer(GAME_PLAYER_EDEFAULT);
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
		case MatrixGamesPackage.PLAYER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MatrixGamesPackage.PLAYER__SYMBOL:
			return symbol != SYMBOL_EDEFAULT;
		case MatrixGamesPackage.PLAYER__GAME_PLAYER:
			return GAME_PLAYER_EDEFAULT == null ? gamePlayer != null : !GAME_PLAYER_EDEFAULT.equals(gamePlayer);
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", symbol: ");
		result.append(symbol);
		result.append(", GamePlayer: ");
		result.append(gamePlayer);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
