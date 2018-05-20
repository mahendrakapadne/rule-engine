package org.simple.framework.rule.core;

import lombok.Getter;
import lombok.Setter;
import org.simple.framework.rule.api.Rule;
import org.simple.framework.rule.api.Rules;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;

@Getter
@Setter
public class SimpleRules<T extends Serializable> implements Rules<T> {
    TreeSet<Rule<T>> ruleList;

    @Override
    public boolean add(Rule<T> rule) {
        return this.ruleList.add(rule);
    }

    @Override
    public boolean remove(Rule<T> rule) {
        return this.ruleList.remove(rule);
    }

    @Override
    public Iterator<Rule<T>> iterator() {
        return ruleList.iterator();
    }

    @Override
    public Spliterator<Rule<T>> spliterator() {
        return ruleList.spliterator();
    }

    @Override
    public void forEach(Consumer<? super Rule<T>> action) {
        ruleList.forEach(action);
    }
}
