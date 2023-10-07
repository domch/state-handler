package ch.dom.statemachine;

import ch.dom.statemachine.usecase.transition.TransitionType;
import java.lang.reflect.InvocationTargetException;

public class TransitionFactory {

    public <T> TransitionManager<T> get(TransitionType transitionType) {
        try {
            Class<? extends Transition<T>> transitionClass = (Class<? extends Transition<T>>) transitionType.getTransitionClass();
            Transition<T> transition = transitionClass.getDeclaredConstructor().newInstance();
            return new TransitionManager<T>(transition);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    public <T> TransitionManager<T> get(Class<? extends Transition<T>> transitionClass) {
        try {
            Transition<T> transition = transitionClass.getDeclaredConstructor().newInstance();
            return new TransitionManager<T>(transition);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
