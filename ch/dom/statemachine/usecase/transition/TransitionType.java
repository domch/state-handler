package ch.dom.statemachine.usecase.transition;

import ch.dom.statemachine.Transition;

public enum TransitionType {
    DELETE(DeleteDocumentTransition.class),
    RESTORE(RestoreDocumentTransition.class);

    private final Class<? extends Transition> transitionClass;

    TransitionType(Class<? extends Transition> transitionClass) {
        this.transitionClass = transitionClass;
    }

    public Class<? extends Transition> getTransitionClass() {
        return transitionClass;
    }
}
