package ch.dom.statemachine.client.statemachine.transition;

import ch.dom.statemachine.State;
import ch.dom.statemachine.Transition;
import ch.dom.statemachine.client.model.Document;
import ch.dom.statemachine.client.service.DocumentDataService;
import ch.dom.statemachine.client.statemachine.state.DocumentDeleted;
import ch.dom.statemachine.client.statemachine.state.DocumentRestored;

public class RestoreDocumentTransition implements Transition<Document>{

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
    public void move(Document document) {
        documentDataService.restore(document);
    }
    
}
