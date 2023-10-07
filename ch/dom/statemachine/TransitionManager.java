package ch.dom.statemachine;

public class TransitionManager<T> {
    
    private Transition<T> transition;

    public TransitionManager(Transition<T> transition){
        
        this.transition = transition;
    }

    public void start(T t){
        StateFactory<T> stateFactory = new StateFactory<>();
        State currentState = stateFactory.find(t);

        if(!currentState.equals(transition.getFromState())){
            throw new IllegalStateException("Transition not allowed");
        }

        transition.move(t);

        stateFactory.update(t, transition.getToState());
    }

}
