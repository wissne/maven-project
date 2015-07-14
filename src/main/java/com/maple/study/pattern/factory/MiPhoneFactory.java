package com.maple.study.pattern.factory;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class MiPhoneFactory {

    public static Phone getPhone(Class<?> clazz) {
        Phone phone = null;
        try {
            phone = (Phone) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return phone;
    }
}
