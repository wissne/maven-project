package com.maple.study.pattern.strategy.adapter;

import java.util.Map;

/**
 * maven-project : com.maple.study.pattern.strategy.adapter
 * Created by maple on 2015/7/29.
 */
public class OutUserInfo extends OuterUser implements IUserInfo {
    private Map<String, String> baseInfo = super.getUserBaseInfo();
    private Map<String, String> homeInfo = super.getUserHomeInfo();
    private Map<String, String> officeInfo = super.getUserOfficeInfo();
    @Override
    public String getUserName() {
        return this.baseInfo.get("userName");
    }

    @Override
    public String getHomeAddress() {
        return this.homeInfo.get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return this.baseInfo.get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return this.officeInfo.get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {
        return this.officeInfo.get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        return this.homeInfo.get("homeTelNumber");
    }
}
