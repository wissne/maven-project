package com.maple.study.pattern.strategy.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * maven-project : com.maple.study.pattern.strategy.iterator
 * Created by maple on 2015/7/30.
 */
public class ProjectIterator implements IProjectIterator {
    private List<IProject> projects = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projects) {
        this.projects = projects;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projects.size() || this.projects.get(this.currentItem) == null)
            b = false;
        return b;
    }

    @Override
    public IProject next() {
        return this.projects.get(this.currentItem++);
    }
}
