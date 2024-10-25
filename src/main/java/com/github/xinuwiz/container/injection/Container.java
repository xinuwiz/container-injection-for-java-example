package com.github.xinuwiz.container.injection;

public interface Container {

    <T> Contract<T> getContract(Class<T> type);

}
