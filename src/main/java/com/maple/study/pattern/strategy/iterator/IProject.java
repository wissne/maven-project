package com.maple.study.pattern.strategy.iterator;

/**
 * maven-project : com.maple.study.pattern.strategy.iterator
 * Created by maple on 2015/7/30.
 */
public interface IProject {
    void add(String name, int num, int cost);

    String getProjectInfo();

    IProjectIterator iterator();
}
