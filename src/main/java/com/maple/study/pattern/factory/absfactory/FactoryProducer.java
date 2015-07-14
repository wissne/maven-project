package com.maple.study.pattern.factory.absfactory;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class FactoryProducer {

    public static final AbstractFactory getFactory(Class<? extends AbstractFactory> clazz) {
        AbstractFactory instance = null;
        try {
            instance = (AbstractFactory) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
