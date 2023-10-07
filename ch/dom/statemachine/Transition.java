
package ch.dom.statemachine;

public interface Transition<T>{
    State getFromState();
    State getToState();
    void start(T t);
}