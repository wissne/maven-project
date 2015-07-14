package com.maple.study.pattern.factory;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class Mi3Phone implements Phone {

    private String name;

    private String birthDate;

    public Mi3Phone() {
        this.name = "小米3";
        this.birthDate = "20130406";
    }

    public String getInfo() {
        return String.format("%s - %s", this.name, this.birthDate);
    }
}
