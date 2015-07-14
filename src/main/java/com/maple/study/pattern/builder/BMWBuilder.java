package com.maple.study.pattern.builder;

import java.util.ArrayList;

/**
 * Created by aurogon-mac on 15/7/14.
 */
public class BMWBuilder extends CarBuilder {

    private CarModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
