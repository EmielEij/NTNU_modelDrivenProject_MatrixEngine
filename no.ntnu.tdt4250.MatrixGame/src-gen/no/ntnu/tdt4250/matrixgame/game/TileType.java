/**
 */
package no.ntnu.tdt4250.matrixgame.game;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tile Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.matrixgame.game.GamePackage#getTileType()
 * @model
 * @generated
 */
public enum TileType implements Enumerator {
	/**
	 * The '<em><b>BASIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC(0, "BASIC", "BASIC"),

	/**
	 * The '<em><b>REWARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REWARD_VALUE
	 * @generated
	 * @ordered
	 */
	REWARD(0, "REWARD", "REWARD"),
	/**
	 * The '<em><b>OBSTACLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #OBSTACLE_VALUE
	 * @generated
	 * @ordered
	 */
	OBSTACLE(0, "OBSTACLE", "OBSTACLE"),
	/**
	 * The '<em><b>INTERACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #INTERACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERACTIVE(0, "INTERACTIVE", "INTERACTIVE"),
	/**
	 * The '<em><b>CRASH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CRASH_VALUE
	 * @generated
	 * @ordered
	 */
	CRASH(4, "CRASH", "CRASH");

	/**
	 * The '<em><b>BASIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_VALUE = 0;

	/**
	 * The '<em><b>REWARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REWARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REWARD_VALUE = 0;

	/**
	 * The '<em><b>OBSTACLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSTACLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OBSTACLE_VALUE = 0;

	/**
	 * The '<em><b>INTERACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTIVE_VALUE = 0;

	/**
	 * The '<em><b>CRASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRASH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRASH_VALUE = 4;

	/**
	 * An array of all the '<em><b>Tile Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TileType[] VALUES_ARRAY = new TileType[] { BASIC, REWARD, OBSTACLE, INTERACTIVE, CRASH, };

	/**
	 * A public read-only list of all the '<em><b>Tile Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TileType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tile Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TileType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TileType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tile Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TileType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TileType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tile Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TileType get(int value) {
		switch (value) {
		case BASIC_VALUE:
			return BASIC;
		case CRASH_VALUE:
			return CRASH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TileType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TileType
