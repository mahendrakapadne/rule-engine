package org.simple.framework.rule.api;

import java.io.Serializable;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface Rules<T extends Serializable> extends Serializable, Iterable<Rule<T>> {
    //T apply(T t);
    boolean add(Rule<T> rule);
    boolean remove(Rule<T> rule);
    default Stream<Rule<T>> stream() {
        return StreamSupport.stream(spliterator(), false);
    }
}
