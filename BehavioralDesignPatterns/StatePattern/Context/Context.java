package Context;

import State.ConcreteStates.ConcreteStateA;
import State.State;

public class Context {
    private State state;
    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
