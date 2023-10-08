package ch.dom.statemachine.client.service;

import ch.dom.statemachine.client.Document;

public interface DocumentDataService {
    void delete(Document document);
    void restore(Document document);
}
