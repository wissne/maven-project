package com.maple.study.pattern.strategy;

import org.junit.Test;

/**
 * maven-project : com.maple.study.pattern.strategy
 * Created by maple on 2015/7/26.
 */
public class Client {

    @Test
    public void test() {
        int a = 1;
        int b = 2;
        String symbol = "ADD";
        Calculator calculator = Calculator.valueOf(symbol);
        System.out.println(calculator);
        System.out.println("运行结果为:" + a + calculator.getValue() + b + "=" + calculator.exec(a, b));
    }
}
