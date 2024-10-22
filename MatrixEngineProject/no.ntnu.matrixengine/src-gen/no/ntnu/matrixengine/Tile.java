/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.Tile#getIsAccessible <em>Is Accessible</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Tile#getContent <em>Content</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Tile#getColor <em>Color</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Tile#getNeighbours <em>Neighbours</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getTile()
 * @model
 * @generated
 */
public interface Tile extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Accessible</em>' attribute.
	 * @see #setIsAccessible(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getTile_IsAccessible()
	 * @model
	 * @generated
	 */
	int getIsAccessible();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Tile#getIsAccessible <em>Is Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Accessible</em>' attribute.
	 * @see #getIsAccessible()
	 * @generated
	 */
	void setIsAccessible(int value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getTile_Content()
	 * @model
	 * @generated
	 */
	int getContent();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Tile#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getTile_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Tile#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Neighbours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbours</em>' attribute.
	 * @see #setNeighbours(EList)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getTile_Neighbours()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getNeighbours();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Tile#getNeighbours <em>Neighbours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neighbours</em>' attribute.
	 * @see #getNeighbours()
	 * @generated
	 */
	void setNeighbours(EList<?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void IsUsed();

} // Tile
