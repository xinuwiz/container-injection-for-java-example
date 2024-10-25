package com.github.xinuwiz.container.injection;

public class ContractWithSingleDependency<T> extends Contract<T> {

    private Dependency<? extends T> dependency;

    public ContractWithSingleDependency(Class<T> type) {
        super(type);
    }

    public Dependency<? extends T> getDependency() {
        return dependency;
    }
}
