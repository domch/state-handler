package ch.dom.statemachine;

public interface StateFinder<T> {
    public State find(T t);
}
