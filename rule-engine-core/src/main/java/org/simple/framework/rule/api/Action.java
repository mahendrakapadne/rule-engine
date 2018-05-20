package org.simple.framework.rule.api;

import java.io.Serializable;

public interface Action<T extends Serializable> extends Serializable {
    T execute(T t);
}
