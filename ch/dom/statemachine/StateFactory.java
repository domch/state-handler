package ch.dom.statemachine;

public class StateFactory<T> {
    // inject the StateDataHandler
    private StateDataHandler<T> stateDataHandler;

    // create a find method that returns a State object
    public State find(T t) {
        return stateDataHandler.get(t);
    }

    public void update(T t, State state) {
        stateDataHandler.update(t, state);
    }
}
