package com.maple.study.pattern.factory;

import com.maple.study.singleton.Singleton06;
import org.junit.Test;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class FactoryTest {

    @Test
    public void test1() {
        Phone phone1 = MiPhoneFactory.getPhone(Mi1Phone.class);
        System.out.println(phone1.getInfo());

        Phone phone2 = MiPhoneFactory.getPhone(Mi2Phone.class);
        System.out.println(phone2.getInfo());

        Phone phone3 = MiPhoneFactory.getPhone(Mi4Phone.class);
        System.out.println(phone3.getInfo());
    }
}
