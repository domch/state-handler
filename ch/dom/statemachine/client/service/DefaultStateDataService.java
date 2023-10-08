package ch.dom.statemachine.client.service;

import ch.dom.statemachine.State;
import ch.dom.statemachine.StateFinder;
import ch.dom.statemachine.StateUpdater;
import ch.dom.statemachine.client.Document;
import ch.dom.statemachine.client.framework.DocumentRepository;

public class DefaultStateDataService implements StateFinder<Document>, StateUpdater<Document>{
    private DocumentRepository documentRepository;

    public DefaultStateDataService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public void update(Document domainObject, State state) {
        Document document = getDocument(domainObject);
        document.setState(state);
        documentRepository.save(document);
    }

    @Override
    public State find(Document domainObject) {
        return getDocument(domainObject).getState();
    }

    private Document getDocument(Document domainObject) {
        return documentRepository.findById(domainObject.getId()).get();
    }
}
    
