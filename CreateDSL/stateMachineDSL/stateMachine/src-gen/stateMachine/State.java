/**
 */
package stateMachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachine.State#getIncomming <em>Incomming</em>}</li>
 *   <li>{@link stateMachine.State#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see stateMachine.StateMachinePackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Incomming</b></em>' reference list.
	 * The list contents are of type {@link stateMachine.Transition}.
	 * It is bidirectional and its opposite is '{@link stateMachine.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomming</em>' reference list.
	 * @see stateMachine.StateMachinePackage#getState_Incomming()
	 * @see stateMachine.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link stateMachine.Transition}.
	 * It is bidirectional and its opposite is '{@link stateMachine.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see stateMachine.StateMachinePackage#getState_Outgoing()
	 * @see stateMachine.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

} // State
