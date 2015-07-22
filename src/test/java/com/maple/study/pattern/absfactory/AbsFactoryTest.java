/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.absfactory;

import com.maple.study.pattern.factory.absfactory.*;
import org.junit.Test;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class AbsFactoryTest {

    @Test
    public void test1() {
        AbstractFactory factory = FactoryProducer.getFactory(MiFactory.class);
        Bang bang = factory.buyBang();
        Phone phone = factory.buyPhone();

        System.out.println(bang.getName());
        System.out.println(phone.getInfo());

        factory = FactoryProducer.getFactory(AppleFactory.class);
        bang = factory.buyBang();
        phone = factory.buyPhone();

        System.out.println(bang.getName());
        System.out.println(phone.getInfo());

    }
}
