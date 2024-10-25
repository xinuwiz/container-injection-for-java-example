package com.github.xinuwiz.container.injection;

import com.github.xinuwiz.container.injection.exception.DeafDependencyException;

public class DependencyOnceCalling<T> extends Dependency<T> {

    private final boolean deaf;

    public DependencyOnceCalling(Class<T> type, T instance, boolean deaf) {
        super(type, instance);
        this.deaf = deaf;
    }

    public boolean isDeaf() {
        return deaf;
    }

    @Override
    public T getInstance() {
        if (deaf)
            throw new DeafDependencyException();
        return super.getInstance();
    }

    @Override
    public DependencyCallingStrategy getCallingStrategy() {
        return DependencyCallingStrategy.ONCE;
    }
}