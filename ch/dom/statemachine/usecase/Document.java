package ch.dom.statemachine.usecase;

import java.util.UUID;

public class Document {
    private State state;
    private UUID id;

    // create a static factory method
    public static Document create(UUID id) {
        Document document = new Document();
        document.id = id;
        return document;
    }

    public UUID getId() {
        return id;
    }

    public State getState() {
        return state;
    }
}
