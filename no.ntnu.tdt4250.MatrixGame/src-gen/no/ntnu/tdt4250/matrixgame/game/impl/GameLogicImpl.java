/**
 */
package no.ntnu.tdt4250.matrixgame.game.impl;

import java.lang.reflect.InvocationTargetException;

import no.ntnu.tdt4250.matrixgame.game.GameLogic;
import no.ntnu.tdt4250.matrixgame.game.GamePackage;
import no.ntnu.tdt4250.matrixgame.game.Grid;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl#getGameName <em>Game Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl#getPlayerX <em>Player X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl#getPlayerO <em>Player O</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl#getMapLength <em>Map Length</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.matrixgame.game.impl.GameLogicImpl#getCurrentPlayer <em>Current Player</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameLogicImpl extends MinimalEObjectImpl.Container implements GameLogic {
	/**
	 * The default value of the '{@link #getGameName() <em>Game Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameName()
	 * @generated
	 * @ordered
	 */
	protected static final String GAME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGameName() <em>Game Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameName()
	 * @generated
	 * @ordered
	 */
	protected String gameName = GAME_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayerX() <em>Player X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerX()
	 * @generated
	 * @ordered
	 */
	protected static final char PLAYER_X_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getPlayerX() <em>Player X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerX()
	 * @generated
	 * @ordered
	 */
	protected char playerX = PLAYER_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayerO() <em>Player O</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerO()
	 * @generated
	 * @ordered
	 */
	protected static final char PLAYER_O_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getPlayerO() <em>Player O</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerO()
	 * @generated
	 * @ordered
	 */
	protected char playerO = PLAYER_O_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapLength() <em>Map Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAP_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMapLength() <em>Map Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLength()
	 * @generated
	 * @ordered
	 */
	protected int mapLength = MAP_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected Grid grid;

	/**
	 * The default value of the '{@link #getCurrentPlayer() <em>Current Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPlayer()
	 * @generated
	 * @ordered
	 */
	protected static final char CURRENT_PLAYER_EDEFAULT = 'p';

	/**
	 * The cached value of the '{@link #getCurrentPlayer() <em>Current Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPlayer()
	 * @generated
	 * @ordered
	 */
	protected char currentPlayer = CURRENT_PLAYER_EDEFAULT;

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
	public String getGameName() {
		return gameName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameName(String newGameName) {
		String oldGameName = gameName;
		gameName = newGameName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME_LOGIC__GAME_NAME, oldGameName,
					gameName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getPlayerX() {
		return playerX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getPlayerO() {
		return playerO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMapLength() {
		return mapLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapLength(int newMapLength) {
		int oldMapLength = mapLength;
		mapLength = newMapLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME_LOGIC__MAP_LENGTH, oldMapLength,
					mapLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grid getGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid(Grid newGrid, NotificationChain msgs) {
		Grid oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.GAME_LOGIC__GRID,
					oldGrid, newGrid);
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
	public void setGrid(Grid newGrid) {
		if (newGrid != grid) {
			NotificationChain msgs = null;
			if (grid != null)
				msgs = ((InternalEObject) grid).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_LOGIC__GRID, null, msgs);
			if (newGrid != null)
				msgs = ((InternalEObject) newGrid).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.GAME_LOGIC__GRID, null, msgs);
			msgs = basicSetGrid(newGrid, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME_LOGIC__GRID, newGrid, newGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getCurrentPlayer() {
		return currentPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void switchPlayer() {
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
	public boolean checkWin() {
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
	public void makeMove(int row, int col) {
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
		case GamePackage.GAME_LOGIC__GRID:
			return basicSetGrid(null, msgs);
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
		case GamePackage.GAME_LOGIC__GAME_NAME:
			return getGameName();
		case GamePackage.GAME_LOGIC__PLAYER_X:
			return getPlayerX();
		case GamePackage.GAME_LOGIC__PLAYER_O:
			return getPlayerO();
		case GamePackage.GAME_LOGIC__MAP_LENGTH:
			return getMapLength();
		case GamePackage.GAME_LOGIC__GRID:
			return getGrid();
		case GamePackage.GAME_LOGIC__CURRENT_PLAYER:
			return getCurrentPlayer();
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
		case GamePackage.GAME_LOGIC__GAME_NAME:
			setGameName((String) newValue);
			return;
		case GamePackage.GAME_LOGIC__MAP_LENGTH:
			setMapLength((Integer) newValue);
			return;
		case GamePackage.GAME_LOGIC__GRID:
			setGrid((Grid) newValue);
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
		case GamePackage.GAME_LOGIC__GAME_NAME:
			setGameName(GAME_NAME_EDEFAULT);
			return;
		case GamePackage.GAME_LOGIC__MAP_LENGTH:
			setMapLength(MAP_LENGTH_EDEFAULT);
			return;
		case GamePackage.GAME_LOGIC__GRID:
			setGrid((Grid) null);
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
		case GamePackage.GAME_LOGIC__GAME_NAME:
			return GAME_NAME_EDEFAULT == null ? gameName != null : !GAME_NAME_EDEFAULT.equals(gameName);
		case GamePackage.GAME_LOGIC__PLAYER_X:
			return playerX != PLAYER_X_EDEFAULT;
		case GamePackage.GAME_LOGIC__PLAYER_O:
			return playerO != PLAYER_O_EDEFAULT;
		case GamePackage.GAME_LOGIC__MAP_LENGTH:
			return mapLength != MAP_LENGTH_EDEFAULT;
		case GamePackage.GAME_LOGIC__GRID:
			return grid != null;
		case GamePackage.GAME_LOGIC__CURRENT_PLAYER:
			return currentPlayer != CURRENT_PLAYER_EDEFAULT;
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
		case GamePackage.GAME_LOGIC___SWITCH_PLAYER:
			switchPlayer();
			return null;
		case GamePackage.GAME_LOGIC___IS_GAME_OVER:
			isGameOver();
			return null;
		case GamePackage.GAME_LOGIC___CHECK_WIN:
			return checkWin();
		case GamePackage.GAME_LOGIC___MAKE_MOVE__INT_INT:
			makeMove((Integer) arguments.get(0), (Integer) arguments.get(1));
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
		result.append(" (gameName: ");
		result.append(gameName);
		result.append(", playerX: ");
		result.append(playerX);
		result.append(", playerO: ");
		result.append(playerO);
		result.append(", mapLength: ");
		result.append(mapLength);
		result.append(", currentPlayer: ");
		result.append(currentPlayer);
		result.append(')');
		return result.toString();
	}

} //GameLogicImpl
