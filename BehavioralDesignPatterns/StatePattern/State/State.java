package State;
import Context.Context;

public interface State {
    void handle(Context context);
}
