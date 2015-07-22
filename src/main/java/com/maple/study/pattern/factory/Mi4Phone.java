/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

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
