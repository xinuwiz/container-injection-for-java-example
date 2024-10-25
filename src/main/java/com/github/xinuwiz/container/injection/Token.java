package com.github.xinuwiz.container.injection;

public abstract class Token<T> {

    private final Class<T> type;

    public Token(final Class<T> type) {
        this.type = type;
    }

    public Class<T> getType() {
        return type;
    }
}