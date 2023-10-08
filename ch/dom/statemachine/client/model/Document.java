package ch.dom.statemachine.client.model;

import java.util.UUID;

import ch.dom.statemachine.client.statemachine.state.StateType;

public class Document {
    private StateType state;
    private UUID id;

    // create a static factory method
    public static Document create(UUID id, StateType state) {
        Document document = new Document();
        document.id = id;
        document.state = state;
        return document;
    }

    public UUID getId() {
        return id;
    }

    public StateType getState() {
        return state;
    }

    public void setState(StateType state) {
        this.state = state;
    }
}
