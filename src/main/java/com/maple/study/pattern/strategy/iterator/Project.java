package com.maple.study.pattern.strategy.iterator;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * maven-project : com.maple.study.pattern.strategy.iterator
 * Created by maple on 2015/7/30.
 */
public class Project implements IProject {

    private List<IProject> projects = new ArrayList<>();

    private String name = "";

    private int num = 0;

    private int cost = 0;

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projects.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info += "项目名称是: " + this.name;
        info += "\t项目人数: " + this.num;
        info += "\t项目费用: " + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projects);
    }
}
