package com.maple.study.pattern.factory.absfactory;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class AppleFactory extends AbstractFactory {

    @Override
    public Phone buyPhone() {
        return new IPhone();
    }

    @Override
    public Bang buyBang() {
        return new IWatch();
    }

}
