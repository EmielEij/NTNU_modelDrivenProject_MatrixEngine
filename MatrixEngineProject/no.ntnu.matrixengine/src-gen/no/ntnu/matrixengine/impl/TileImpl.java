/**
 */
package no.ntnu.matrixengine.impl;

import java.lang.reflect.InvocationTargetException;
import no.ntnu.matrixengine.MatrixenginePackage;
import no.ntnu.matrixengine.Tile;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.impl.TileImpl#getIsAccessible <em>Is Accessible</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.TileImpl#getContent <em>Content</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.TileImpl#getColor <em>Color</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.TileImpl#getNeighbours <em>Neighbours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileImpl extends MinimalEObjectImpl.Container implements Tile {
	/**
	 * The default value of the '{@link #getIsAccessible() <em>Is Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAccessible()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ACCESSIBLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIsAccessible() <em>Is Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAccessible()
	 * @generated
	 * @ordered
	 */
	protected int isAccessible = IS_ACCESSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected int content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNeighbours() <em>Neighbours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbours()
	 * @generated
	 * @ordered
	 */
	protected EList<?> neighbours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixenginePackage.Literals.TILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIsAccessible() {
		return isAccessible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAccessible(int newIsAccessible) {
		int oldIsAccessible = isAccessible;
		isAccessible = newIsAccessible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.TILE__IS_ACCESSIBLE,
					oldIsAccessible, isAccessible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(int newContent) {
		int oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.TILE__CONTENT, oldContent,
					content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.TILE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<?> getNeighbours() {
		return neighbours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeighbours(EList<?> newNeighbours) {
		EList<?> oldNeighbours = neighbours;
		neighbours = newNeighbours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatrixenginePackage.TILE__NEIGHBOURS, oldNeighbours,
					neighbours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void IsUsed() {
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
		case MatrixenginePackage.TILE__IS_ACCESSIBLE:
			return getIsAccessible();
		case MatrixenginePackage.TILE__CONTENT:
			return getContent();
		case MatrixenginePackage.TILE__COLOR:
			return getColor();
		case MatrixenginePackage.TILE__NEIGHBOURS:
			return getNeighbours();
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
		case MatrixenginePackage.TILE__IS_ACCESSIBLE:
			setIsAccessible((Integer) newValue);
			return;
		case MatrixenginePackage.TILE__CONTENT:
			setContent((Integer) newValue);
			return;
		case MatrixenginePackage.TILE__COLOR:
			setColor((String) newValue);
			return;
		case MatrixenginePackage.TILE__NEIGHBOURS:
			setNeighbours((EList<?>) newValue);
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
		case MatrixenginePackage.TILE__IS_ACCESSIBLE:
			setIsAccessible(IS_ACCESSIBLE_EDEFAULT);
			return;
		case MatrixenginePackage.TILE__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case MatrixenginePackage.TILE__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case MatrixenginePackage.TILE__NEIGHBOURS:
			setNeighbours((EList<?>) null);
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
		case MatrixenginePackage.TILE__IS_ACCESSIBLE:
			return isAccessible != IS_ACCESSIBLE_EDEFAULT;
		case MatrixenginePackage.TILE__CONTENT:
			return content != CONTENT_EDEFAULT;
		case MatrixenginePackage.TILE__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case MatrixenginePackage.TILE__NEIGHBOURS:
			return neighbours != null;
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
		case MatrixenginePackage.TILE___IS_USED:
			IsUsed();
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
		result.append(" (isAccessible: ");
		result.append(isAccessible);
		result.append(", content: ");
		result.append(content);
		result.append(", Color: ");
		result.append(color);
		result.append(", neighbours: ");
		result.append(neighbours);
		result.append(')');
		return result.toString();
	}

} //TileImpl
