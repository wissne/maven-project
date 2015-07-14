package com.maple.study.pattern.factory;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class Mi2Phone implements Phone {

    private String name;

    private String birthDate;

    public Mi2Phone() {
        this.name = "小米2";
        this.birthDate = "20120926";
    }

    public String getInfo() {
        return String.format("%s - %s", this.name, this.birthDate);
    }
}
