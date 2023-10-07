package ch.dom.statemachine.usecase.service;

import ch.dom.statemachine.usecase.Document;

public interface DocumentDataService {
    void delete(Document document);
    void restore(Document document);
}
