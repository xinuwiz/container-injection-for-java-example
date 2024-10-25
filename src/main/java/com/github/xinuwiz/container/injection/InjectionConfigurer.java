package com.github.xinuwiz.container.injection;

public interface InjectionConfigurer<T> {

    static <T> InjectionConfigurer<T> forContractWithSingleDependency(Class<T> type) {
        // TOOD
    }
}