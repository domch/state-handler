package ch.dom.statemachine.client.state;

import ch.dom.statemachine.State;

public class DocumentDeleted implements State{

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
        return StateType.DELETED.toString();
    }   
}
