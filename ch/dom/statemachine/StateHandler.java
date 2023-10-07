package ch.dom.statemachine;

import java.util.Date;
import java.util.UUID;

import ch.dom.statemachine.usecase.Document;

class StateHandler{
    public static void main(String args[]) {

        Document document = Document.create(UUID.randomUUID()); // is coming from message layer
        //StateDataService stateDataService = new StateDataService(new DocumentRepository());
        var stateFactory = new StateFactory<Document>();
        var state = stateFactory.find(document);

        
    }
}
