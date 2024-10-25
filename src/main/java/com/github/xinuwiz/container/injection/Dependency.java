package com.github.xinuwiz.container.injection;

public abstract class Dependency<T> extends Token<T> {

    private final T instance;

    public Dependency(final Class<T> type, final T instance) {
        super(type);
        this.instance = instance;
    }

    public T getInstance() {
        return instance;
    }

    public abstract DependencyCallingStrategy getCallingStrategy();

}
