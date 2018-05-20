package org.simple.framework.rule.api;

import java.io.Serializable;

public interface Condition<T extends Serializable> extends Serializable {
    boolean evaluate(T t);
}
