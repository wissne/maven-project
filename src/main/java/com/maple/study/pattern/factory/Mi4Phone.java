package com.maple.study.pattern.factory;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class Mi4Phone implements Phone {

    private String name;

    private String birthDate;

    public Mi4Phone() {
        this.name = "小米4";
        this.birthDate = "20141006";
    }

    public String getInfo() {
        return String.format("%s - %s", this.name, this.birthDate);
    }
}
