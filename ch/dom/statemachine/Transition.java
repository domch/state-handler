
package ch.dom.statemachine;

public interface Transition<T>{
    State getFromState();
    State getToState();
    void move(T t);
}