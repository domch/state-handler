package ch.dom.statemachine.usecase.transition;

import ch.dom.statemachine.State;
import ch.dom.statemachine.Transition;
import ch.dom.statemachine.usecase.service.DocumentDataService;
import ch.dom.statemachine.usecase.state.DocumentDeleted;
import ch.dom.statemachine.usecase.state.DocumentRestored;

public class RestoreDocumentTransition implements Transition{

    private DocumentDataService documentDataService;

    private State from = new DocumentDeleted();
    private State to = new DocumentRestored();

    @Override
    public State getFromState() {
        return this.from;
    }

    @Override
    public State getToState() {
        return this.to;
    }

    @Override
    public void start() {
        documentDataService.restore();
    }
    
}
