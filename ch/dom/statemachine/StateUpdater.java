package ch.dom.statemachine;

public interface StateUpdater<T> {
    public void update(T t, State state);
}
