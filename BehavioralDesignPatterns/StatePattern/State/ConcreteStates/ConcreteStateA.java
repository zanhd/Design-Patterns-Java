package State.ConcreteStates;

import Context.Context;
import State.State;

public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling State A");
        //Change state if necessary
        context.setState(new ConcreteStateB());
    }
}
