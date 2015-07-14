package com.maple.study.pattern.builder;

import java.util.ArrayList;

/**
 * Created by aurogon-mac on 15/7/14.
 */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
