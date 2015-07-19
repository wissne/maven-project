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
