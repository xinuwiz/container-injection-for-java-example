package com.github.xinuwiz.container.injection;

public abstract class Contract<T> extends Token<T> {

    public Contract(final Class<T> type) {
        super(type);
    }
}
