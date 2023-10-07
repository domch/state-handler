package ch.dom.statemachine;

public interface StateDataHandler<T> {
    State get(T domainObject);
    void update(T domainObject, State state);
}
