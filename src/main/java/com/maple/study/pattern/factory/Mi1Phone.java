/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

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
