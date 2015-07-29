package com.maple.study.pattern.strategy.adapter;

/**
 * maven-project : com.maple.study.pattern.strategy.adapter
 * Created by maple on 2015/7/29.
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        return "姓名叫做...";
    }

    @Override
    public String getHomeAddress() {
        return "员工的家庭地址...";
    }

    @Override
    public String getMobileNumber() {
        return "电话号码是...";
    }

    @Override
    public String getOfficeTelNumber() {
        return "办公室电话是...";
    }

    @Override
    public String getJobPosition() {
        return "工作职位是...";
    }

    @Override
    public String getHomeTelNumber() {
        return "家庭电话是...";
    }
}
