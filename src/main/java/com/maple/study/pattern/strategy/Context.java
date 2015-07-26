package com.maple.study.pattern.strategy;

/**
 * maven-project : com.maple.study.pattern.strategy
 * Created by maple on 2015/7/26.
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
