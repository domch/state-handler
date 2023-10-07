package ch.dom.statemachine.usecase.state;

import ch.dom.statemachine.State;

public class DocumentRestored implements State{

    @Override
    public void onEnter() {
    }

    @Override
    public void onExit() {
    }

    @Override
    public String getName() {
        return StateType.RESTORED.toString();
    }
}
