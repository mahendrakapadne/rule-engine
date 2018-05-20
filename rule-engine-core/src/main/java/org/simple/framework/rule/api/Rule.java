package org.simple.framework.rule.api;

import java.io.Serializable;

public interface Rule<T extends Serializable> extends Serializable {
    int getPriority();
    String getGroupName();
    boolean evaluateCondition(T t);
    boolean executeAction(T t);
}
