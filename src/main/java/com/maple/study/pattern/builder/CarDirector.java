package com.maple.study.pattern.builder;

import java.util.ArrayList;

/**
 * Created by aurogon-mac on 15/7/14.
 */
public class CarDirector {

    private ArrayList<String> sequence = new ArrayList<>();

    private CarBuilder benzBuilder = new BenzBuilder();

    private CarBuilder bmwBuilder = new BMWBuilder();

    public CarModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return  this.benzBuilder.getCarModel();
    }

    public CarModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return this.benzBuilder.getCarModel();
    }

    public CarModel getCBMWBuilder() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return this.bmwBuilder.getCarModel();
    }

    public CarModel getDBMWBuilder() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return this.bmwBuilder.getCarModel();
    }
}
