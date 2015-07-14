package com.maple.study.pattern.factory.absfactory;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class MiFactory extends AbstractFactory {
    @Override
    public Phone buyPhone() {
        return new MiPhone();
    }

    @Override
    public Bang buyBang() {
        return new MiBang();
    }

}
