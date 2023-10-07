package ch.dom.statemachine.usecase.service;

import java.util.UUID;

public interface DocumentDataService {
    void delete(UUID documentId);
    void restore(UUID documentId);
}
