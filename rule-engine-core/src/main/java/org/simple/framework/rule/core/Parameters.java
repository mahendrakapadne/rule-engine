package org.simple.framework.rule.core;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Parameters implements Serializable {
    private String groupName;
    private boolean skipRulesOnMatch;
}
