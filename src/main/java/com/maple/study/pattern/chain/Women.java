/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.chain;

/**
 * Created by aurogon-mac on 15/7/22.
 */
public class Women implements IWomen {

    /*
    1: 未嫁
    2: 已嫁
    3: 丧偶
     */
    private int type = 0;
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
        switch (type) {
            case 1:
                this.request = "女儿的请求是: " + request;
                break;
            case 2:
                this.request = "妻子的请求是: " + request;
                break;
            case 3:
                this.request = "母亲的请求是: " + request;
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
