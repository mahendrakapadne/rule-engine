package org.simple.framework.rule.core;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.simple.framework.rule.api.Rule;
import org.simple.framework.rule.api.Rules;
import org.simple.framework.rule.api.RulesEngine;

import java.io.Serializable;

@Setter
@Getter
@Builder
public class SimpleRuleEngine<T extends Serializable> implements RulesEngine<T> {

    protected Parameters parameters;
    protected Rules<T> rules;

    @Override
    public void load(Parameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public void register(Rule<T> rule) {
        rules.add(rule);
    }

    @Override
    public void register(Rules<T> rules) {
        this.rules = rules;
    }

    @Override
    public void deRegister(Rule<T> rule) {
        rules.remove(rule);
    }

    @Override
    public T apply(T t) {
        boolean skipRulesOnMAtch = true;//parameters.
        rules.stream().filter(rule -> rule.evaluateCondition(t)).map(rule -> rule.executeAction(t));
        return t;
    }
}
