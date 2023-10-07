package ch.dom.statemachine.usecase.service;

import ch.dom.statemachine.State;
import ch.dom.statemachine.StateDataHandler;
import ch.dom.statemachine.framework.DocumentRepository;
import ch.dom.statemachine.usecase.Document;

public class DefaultStateDataService implements StateDataHandler<Document>{

    private DocumentRepository documentRepository;

    public DefaultStateDataService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public State get(Document domainObject) {
        return documentRepository.findById(domainObject.getId()).get().getState();
    }

    @Override
    public void update(Document domainObject, State state) {
        Document document = documentRepository.findById(domainObject.getId()).get();
        document.setState(state);
        documentRepository.save(document);
    }
}
    
