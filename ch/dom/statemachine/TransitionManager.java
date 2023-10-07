package ch.dom.statemachine;

public class TransitionManager<T> {
    
    private Transition<T> transition;
    private StateFinder<T> stateFinder;
    private StateUpdater<T> stateUpdater;

    public TransitionManager(Transition<T> transition){
        this.transition = transition;
    }

    public void start(T t){

        var currentState = stateFinder.find(t);

        if(!currentState.equals(transition.getFromState())){
            throw new IllegalStateException("Transition not allowed");
        }

        transition.move(t);

        stateUpdater.update(t, transition.getToState());
    }

}
