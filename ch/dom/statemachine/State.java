package ch.dom.statemachine;

public interface State {
    StateType getType();
    void onEnter();
    void onExit();
    void onEvent(Event event);
}
