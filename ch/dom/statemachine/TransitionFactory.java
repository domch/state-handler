package ch.dom.statemachine;

import ch.dom.statemachine.usecase.transition.TransitionType;
import java.lang.reflect.InvocationTargetException;

public class TransitionFactory {

    public <T> Transition<T> find(TransitionType transitionType) {
        try {
            Class<? extends Transition<T>> transitionClass = (Class<? extends Transition<T>>) transitionType.getTransitionClass();
            return transitionClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
