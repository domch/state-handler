package ch.dom.statemachine.client.transition;

import ch.dom.statemachine.State;
import ch.dom.statemachine.Transition;
import ch.dom.statemachine.client.Document;
import ch.dom.statemachine.client.service.DocumentDataService;
import ch.dom.statemachine.client.state.DocumentDeleted;
import ch.dom.statemachine.client.state.DocumentRestored;

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
