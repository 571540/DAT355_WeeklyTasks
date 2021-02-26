package trafficLights.dsl.stateMachine.design;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import stateMachine.*;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public Transition getNextTranstion(Transition transition) {
    	StateMachine stateMachine = (StateMachine) transition.eContainer();
    	List<Transition> actions = stateMachine.getTransitions();
    	int position = actions.indexOf(transition);
    	if(position == actions.size()-1) {
    		return null;
    	}else {
    		return actions.get(position+1);
    	}
    }
}
