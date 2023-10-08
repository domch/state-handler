package ch.dom.statemachine.client.framework;

import java.util.Optional;
import java.util.UUID;

import ch.dom.statemachine.client.model.Document;

//@Repository
public interface DocumentRepository {
    public Optional<Document> findById(UUID id);
    public void save(Document document);
}
