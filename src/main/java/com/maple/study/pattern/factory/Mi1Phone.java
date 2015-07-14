package com.maple.study.pattern.factory;

import java.util.Date;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class Mi1Phone implements Phone {

    private String name;

    private String birthDate;

    public Mi1Phone() {
        this.name = "小米1";
        this.birthDate = "20110826";
    }

    public String getInfo() {
        return String.format("%s - %s", this.name, this.birthDate);
    }
}
