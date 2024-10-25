package com.github.xinuwiz.container.injection.exception;

public class DeafDependencyException extends RuntimeException {

    public DeafDependencyException() {
        super("Dependency can be called once only.");
    }

    public DeafDependencyException(String message) {
        super(message);
    }

}
