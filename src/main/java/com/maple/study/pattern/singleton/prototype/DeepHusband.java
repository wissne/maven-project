/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.singleton.prototype;

import java.util.ArrayList;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class DeepHusband extends Husband implements Cloneable {

    public DeepHusband(String name, int age) {
        super(name, age);
    }

    @Override
    public DeepHusband clone() {
        DeepHusband thing = null;
        try {
            thing = (DeepHusband) super.clone();
            // 加入以下片断
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
            this.setWife((Wife) this.getWife().clone());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return thing;
    }
}
