package com.maple.study.pattern.adapter;

import com.maple.study.pattern.strategy.adapter.IUserInfo;
import com.maple.study.pattern.strategy.adapter.OutUserInfo;
import org.junit.Test;

/**
 * maven-project : com.maple.study.pattern.adapter
 * Created by maple on 2015/7/30.
 */
public class Client {

    @Test
    public void test() {
        IUserInfo userInfo = new OutUserInfo();

        for (int i = 0; i < 10; i++) {
            System.out.println(userInfo.getMobileNumber());
        }
    }
}
