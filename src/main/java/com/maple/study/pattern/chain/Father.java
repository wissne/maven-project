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
public class Father extends Handler {
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("---女儿向父亲请示---");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是: 同意\n");
    }
}
