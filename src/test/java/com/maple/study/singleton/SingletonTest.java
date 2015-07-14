package com.maple.study.singleton;

import com.maple.study.singleton.Singleton06;
import org.junit.Test;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class SingletonTest {

    @Test
    public void test06() {
        Singleton06 instance1 = Singleton06.instance;
        instance1.setName("maple");
        Singleton06 instance2 = Singleton06.instance;
        instance2.setName("aurogon");

        System.out.println(instance1.sayHello());
        System.out.println(instance2.sayHello());
    }
}
