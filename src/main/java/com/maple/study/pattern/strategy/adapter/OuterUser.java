package com.maple.study.pattern.strategy.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * maven-project : com.maple.study.pattern.strategy.adapter
 * Created by maple on 2015/7/29.
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map<String, String> getUserBaseInfo() {
        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工的电话号码是...");
        return baseInfoMap;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        Map<String, String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumber", "这个员工的家庭电话是...");
        homeInfo.put("homeAddress", "这个员工的家庭地址是...");
        return homeInfo;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        Map<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition", "这个员工的职位是...");
        officeInfo.put("officeTelNumber", "这个员工的办公电话是...");
        return officeInfo;
    }
}
