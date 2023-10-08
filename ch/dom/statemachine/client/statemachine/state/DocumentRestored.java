package ch.dom.statemachine.client.statemachine.state;

import ch.dom.statemachine.State;

public class DocumentRestored implements State{

    @Override
    public void onEnter() {
        // fire event
    }

    @Override
    public void onExit() {
        // fire event
    }

    @Override
    public String getName() {
        return StateType.RESTORED.toString();
    }
}
