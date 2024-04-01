import Context.Context;
import State.ConcreteStates.ConcreteStateA;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request(); //Handling State A
        context.request(); //Handling State B
        context.request(); //Handling State A
    }
}
