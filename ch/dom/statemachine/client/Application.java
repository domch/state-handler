package ch.dom.statemachine.client;

import java.util.UUID;

import ch.dom.statemachine.TransitionManagerFactory;
import ch.dom.statemachine.client.model.Document;
import ch.dom.statemachine.client.statemachine.state.StateType;
import ch.dom.statemachine.client.statemachine.transition.TransitionType;

class Application{
    public static void main(String args[]) {

        var document = Document.create(UUID.randomUUID(), StateType.RESTORED); // is coming from message layer or database

        var factory = new TransitionManagerFactory<Document>(); 
        var transitionManager = factory.get(TransitionType.DELETE.getTransitionClass());
        transitionManager.start(document);
    }
}

