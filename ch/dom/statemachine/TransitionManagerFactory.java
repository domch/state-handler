package ch.dom.statemachine;

import java.lang.reflect.InvocationTargetException;

public class TransitionManagerFactory<T> {

    public TransitionManager<T> get(Class<? extends Transition<T>> transitionClass) {
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
