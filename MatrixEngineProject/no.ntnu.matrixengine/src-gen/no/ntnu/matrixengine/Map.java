/**
 */
package no.ntnu.matrixengine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.Map#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Map#getTile <em>Tile</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Map#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.Map#getSizeX <em>Size X</em>}</li>
 * </ul>
 *
 * @see no.ntnu.matrixengine.MatrixenginePackage#getMap()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='tileMustBeSquare fieldMustBeSquare fieldMustFitOnScreen'"
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getMap_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Map#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tile</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.matrixengine.Tile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile</em>' reference list.
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getMap_Tile()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<Tile> getTile();

	/**
	 * Returns the value of the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Y</em>' attribute.
	 * @see #setSizeY(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getMap_SizeY()
	 * @model
	 * @generated
	 */
	int getSizeY();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Map#getSizeY <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Y</em>' attribute.
	 * @see #getSizeY()
	 * @generated
	 */
	void setSizeY(int value);

	/**
	 * Returns the value of the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size X</em>' attribute.
	 * @see #setSizeX(int)
	 * @see no.ntnu.matrixengine.MatrixenginePackage#getMap_SizeX()
	 * @model
	 * @generated
	 */
	int getSizeX();

	/**
	 * Sets the value of the '{@link no.ntnu.matrixengine.Map#getSizeX <em>Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size X</em>' attribute.
	 * @see #getSizeX()
	 * @generated
	 */
	void setSizeX(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initializeMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void getTile(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Map loadMap();

} // Map
