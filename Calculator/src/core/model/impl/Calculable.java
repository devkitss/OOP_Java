package core.model.impl;

@FunctionalInterface
public interface Calculable<T> {
    T calculation(T arg1, T arg2);
}
