package ch.dom.statemachine.client.statemachine.state;

import ch.dom.statemachine.State;
import java.lang.reflect.InvocationTargetException;

public enum StateType {
    CREATED(DocumentCreated.class),
    DELIVERED(DocumentDelivered.class),
    DELETED(DocumentDeleted.class),
    RESTORED (DocumentRestored.class);

    private final Class<? extends State> stateClass;

    StateType(Class<? extends State> stateClass) {
        this.stateClass = stateClass;
    }

    public Class<? extends State> getStateClass() {
        return stateClass;
    }

    public static StateType fromStateClass(State state){
        for (StateType stateType : values()) {
            if(stateType.getStateClass().equals(state.getClass())){
                return stateType;
            }
        }
        throw new IllegalArgumentException("Unknown state class: " + state.getClass());
    }

    public static State fromStateType(StateType stateType){
        try {
            return stateType.getStateClass().getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
