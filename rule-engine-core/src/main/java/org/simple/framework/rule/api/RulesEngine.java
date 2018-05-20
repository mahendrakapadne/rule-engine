package org.simple.framework.rule.api;

import org.simple.framework.rule.core.Parameters;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public interface RulesEngine<T extends Serializable> extends Serializable {
    void load(Parameters parameters);
    void register(Rule<T> rule);
    void register(Rules<T> rules);
    void deRegister(Rule<T> rule);
    T apply(T t);
    default List<T> apply(List<T> t){
        return t.parallelStream().map(t1 -> apply(t1)).collect(Collectors.toList());
    }
}
