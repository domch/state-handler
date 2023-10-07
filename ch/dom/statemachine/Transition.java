public interface Transition{
    State getFromState();
    State getToState();
    boolean isPossible(State fromState, State toState);
    void execute();
}