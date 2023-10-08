package ch.dom.statemachine.client;

import java.util.UUID;

import ch.dom.statemachine.State;

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

    public void setState(State state) {
        this.state = state;
    }
}
