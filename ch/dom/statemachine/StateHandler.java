package ch.dom.statemachine;

import java.util.Date;
import java.util.UUID;

import ch.dom.statemachine.usecase.Document;
import ch.dom.statemachine.usecase.transition.TransitionType;

class StateHandler{
    public static void main(String args[]) {

        var document = Document.create(UUID.randomUUID()); // is coming from message layer

        var transitionFactory = new TransitionFactory();
        var transition = transitionFactory.find(TransitionType.DELETE);
        transition.start(document);
    }
}
