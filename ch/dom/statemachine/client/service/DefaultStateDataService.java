package ch.dom.statemachine.client.service;

import ch.dom.statemachine.State;
import ch.dom.statemachine.StateFinder;
import ch.dom.statemachine.StateUpdater;
import ch.dom.statemachine.client.framework.DocumentRepository;
import ch.dom.statemachine.client.model.Document;
import ch.dom.statemachine.client.statemachine.state.StateType;

public class DefaultStateDataService implements StateFinder<Document>, StateUpdater<Document>{
    private DocumentRepository documentRepository;

    public DefaultStateDataService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public void update(Document domainObject, State state) {
        StateType stateType = StateType.fromStateClass(state);

        Document document = getDocument(domainObject);
        document.setState(stateType);
        documentRepository.save(document);
    }

    @Override
    public State find(Document domainObject) {
        StateType stateType = getDocument(domainObject).getState();
        return StateType.fromStateType(stateType);
    }

    private Document getDocument(Document domainObject) {
        return documentRepository.findById(domainObject.getId()).get();
    }
}
    
