/**
 */
package matrixGames;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link matrixGames.Player#getName <em>Name</em>}</li>
 *   <li>{@link matrixGames.Player#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link matrixGames.Player#getGamePlayer <em>Game Player</em>}</li>
 * </ul>
 *
 * @see matrixGames.MatrixGamesPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see matrixGames.MatrixGamesPackage#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link matrixGames.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(char)
	 * @see matrixGames.MatrixGamesPackage#getPlayer_Symbol()
	 * @model
	 * @generated
	 */
	char getSymbol();

	/**
	 * Sets the value of the '{@link matrixGames.Player#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(char value);

	/**
	 * Returns the value of the '<em><b>Game Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Player</em>' attribute.
	 * @see #setGamePlayer(String)
	 * @see matrixGames.MatrixGamesPackage#getPlayer_GamePlayer()
	 * @model
	 * @generated
	 */
	String getGamePlayer();

	/**
	 * Sets the value of the '{@link matrixGames.Player#getGamePlayer <em>Game Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Player</em>' attribute.
	 * @see #getGamePlayer()
	 * @generated
	 */
	void setGamePlayer(String value);

} // Player
