package com.maple.study.pattern.builder;

import java.util.ArrayList;

/**
 * Created by aurogon-mac on 15/7/14.
 */
public class BenzBuilder extends CarBuilder {

    private CarModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
