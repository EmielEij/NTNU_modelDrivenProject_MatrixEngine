/**
 */
package no.ntnu.matrixengine.impl;

import java.util.Collection;

import no.ntnu.matrixengine.GameOver;
import no.ntnu.matrixengine.GetUserInput;
import no.ntnu.matrixengine.MatrixenginePackage;
import no.ntnu.matrixengine.Setup;
import no.ntnu.matrixengine.UpdateField;
import no.ntnu.matrixengine.main;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.matrixengine.impl.mainImpl#getSetup <em>Setup</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.mainImpl#getUpdatefield <em>Updatefield</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.mainImpl#getGameover <em>Gameover</em>}</li>
 *   <li>{@link no.ntnu.matrixengine.impl.mainImpl#getGetuserinput <em>Getuserinput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class mainImpl extends MinimalEObjectImpl.Container implements main {
	/**
	 * The cached value of the '{@link #getSetup() <em>Setup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetup()
	 * @generated
	 * @ordered
	 */
	protected EList<Setup> setup;

	/**
	 * The cached value of the '{@link #getUpdatefield() <em>Updatefield</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatefield()
	 * @generated
	 * @ordered
	 */
	protected EList<UpdateField> updatefield;

	/**
	 * The cached value of the '{@link #getGameover() <em>Gameover</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameover()
	 * @generated
	 * @ordered
	 */
	protected EList<GameOver> gameover;

	/**
	 * The cached value of the '{@link #getGetuserinput() <em>Getuserinput</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetuserinput()
	 * @generated
	 * @ordered
	 */
	protected EList<GetUserInput> getuserinput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected mainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatrixenginePackage.Literals.MAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Setup> getSetup() {
		if (setup == null) {
			setup = new EObjectContainmentEList<Setup>(Setup.class, this, MatrixenginePackage.MAIN__SETUP);
		}
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UpdateField> getUpdatefield() {
		if (updatefield == null) {
			updatefield = new EObjectContainmentEList<UpdateField>(UpdateField.class, this,
					MatrixenginePackage.MAIN__UPDATEFIELD);
		}
		return updatefield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GameOver> getGameover() {
		if (gameover == null) {
			gameover = new EObjectContainmentEList<GameOver>(GameOver.class, this, MatrixenginePackage.MAIN__GAMEOVER);
		}
		return gameover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GetUserInput> getGetuserinput() {
		if (getuserinput == null) {
			getuserinput = new EObjectContainmentEList<GetUserInput>(GetUserInput.class, this,
					MatrixenginePackage.MAIN__GETUSERINPUT);
		}
		return getuserinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MatrixenginePackage.MAIN__SETUP:
			return ((InternalEList<?>) getSetup()).basicRemove(otherEnd, msgs);
		case MatrixenginePackage.MAIN__UPDATEFIELD:
			return ((InternalEList<?>) getUpdatefield()).basicRemove(otherEnd, msgs);
		case MatrixenginePackage.MAIN__GAMEOVER:
			return ((InternalEList<?>) getGameover()).basicRemove(otherEnd, msgs);
		case MatrixenginePackage.MAIN__GETUSERINPUT:
			return ((InternalEList<?>) getGetuserinput()).basicRemove(otherEnd, msgs);
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
		case MatrixenginePackage.MAIN__SETUP:
			return getSetup();
		case MatrixenginePackage.MAIN__UPDATEFIELD:
			return getUpdatefield();
		case MatrixenginePackage.MAIN__GAMEOVER:
			return getGameover();
		case MatrixenginePackage.MAIN__GETUSERINPUT:
			return getGetuserinput();
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
		case MatrixenginePackage.MAIN__SETUP:
			getSetup().clear();
			getSetup().addAll((Collection<? extends Setup>) newValue);
			return;
		case MatrixenginePackage.MAIN__UPDATEFIELD:
			getUpdatefield().clear();
			getUpdatefield().addAll((Collection<? extends UpdateField>) newValue);
			return;
		case MatrixenginePackage.MAIN__GAMEOVER:
			getGameover().clear();
			getGameover().addAll((Collection<? extends GameOver>) newValue);
			return;
		case MatrixenginePackage.MAIN__GETUSERINPUT:
			getGetuserinput().clear();
			getGetuserinput().addAll((Collection<? extends GetUserInput>) newValue);
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
		case MatrixenginePackage.MAIN__SETUP:
			getSetup().clear();
			return;
		case MatrixenginePackage.MAIN__UPDATEFIELD:
			getUpdatefield().clear();
			return;
		case MatrixenginePackage.MAIN__GAMEOVER:
			getGameover().clear();
			return;
		case MatrixenginePackage.MAIN__GETUSERINPUT:
			getGetuserinput().clear();
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
		case MatrixenginePackage.MAIN__SETUP:
			return setup != null && !setup.isEmpty();
		case MatrixenginePackage.MAIN__UPDATEFIELD:
			return updatefield != null && !updatefield.isEmpty();
		case MatrixenginePackage.MAIN__GAMEOVER:
			return gameover != null && !gameover.isEmpty();
		case MatrixenginePackage.MAIN__GETUSERINPUT:
			return getuserinput != null && !getuserinput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //mainImpl
