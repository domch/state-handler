package ch.dom.statemachine.client.transition;

import ch.dom.statemachine.Transition;
import ch.dom.statemachine.client.Document;

public enum TransitionType {
    DELETE(DeleteDocumentTransition.class),
    RESTORE(RestoreDocumentTransition.class);

    private final Class<? extends Transition<Document>> transitionClass;

    TransitionType(Class<? extends Transition<Document>> transitionClass) {
        this.transitionClass = transitionClass;
    }

    public Class<? extends Transition<Document>> getTransitionClass() {
        return transitionClass;
    }
}
