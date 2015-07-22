/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.builder.builder;

import com.maple.study.pattern.builder.*;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by aurogon-mac on 15/7/14.
 */
public class Client {

    @Test
    public void test1() {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        CarBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        CarModel benz = benzBuilder.getCarModel();
        benz.run();

        CarBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        CarModel bmw = bmwBuilder.getCarModel();
        bmw.run();
    }

    @Test
    public void test2() {
        CarDirector director = new CarDirector();
        for (int i = 0; i < 10; i++) {
            director.getABenzModel().run();
        }

        for (int i = 0; i < 10; i++) {
            director.getBBenzModel().run();
        }

        for (int i = 0; i < 10; i++) {
            director.getCBMWBuilder().run();
        }

        for (int i = 0; i < 10; i++) {
            director.getDBMWBuilder().run();
        }
    }
}
