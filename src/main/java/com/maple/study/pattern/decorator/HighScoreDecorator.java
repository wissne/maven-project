/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.decorator;

/**
 * maven-project : com.maple.study.pattern.decorator
 * Created by maple on 2015/7/23.
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75,数学是78, 自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
