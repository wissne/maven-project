package com.maple.study.pattern.iterator;

import com.maple.study.pattern.strategy.iterator.IProject;
import com.maple.study.pattern.strategy.iterator.IProjectIterator;
import com.maple.study.pattern.strategy.iterator.Project;
import org.junit.Test;

/**
 * maven-project : com.maple.study.pattern.iterator
 * Created by maple on 2015/7/30.
 */
public class Boss {

    @Test
    public void test() {
        IProject project = new Project();
        project.add("星球大战项目", 10, 100000);
        project.add("扭转时空项目", 100, 10000000);
        project.add("超人改造项目", 1000, 1000000000);

        for (int i = 4; i < 10; i++) {
            project.add("第" + i + "个项目", i * 5, i * 100000);
        }

        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = projectIterator.next();
            System.out.println(p.getProjectInfo());
        }



    }
}
