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
