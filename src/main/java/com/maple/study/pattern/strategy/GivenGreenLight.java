package com.maple.study.pattern.strategy;

/**
 * maven-project : com.maple.study.pattern.strategy
 * Created by maple on 2015/7/26.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯, 放行!");
    }
}
