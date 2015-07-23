/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.decorator;

import org.junit.Test;

/**
 * maven-project : com.maple.study.pattern.decorator
 * Created by maple on 2015/7/23.
 */
public class Father {

    @Test
    public void test1() {
        SchoolReport schoolReport;
        schoolReport = new FouthGraceSchoolReport();
        schoolReport = new HighScoreDecorator(schoolReport);
        schoolReport = new SortDecorator(schoolReport);

        schoolReport.report();
        schoolReport.sign("老三");
    }
}
