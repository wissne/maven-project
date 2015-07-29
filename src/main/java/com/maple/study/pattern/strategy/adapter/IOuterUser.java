package com.maple.study.pattern.strategy.adapter;

import java.util.Map;

/**
 * maven-project : com.maple.study.pattern.strategy.adapter
 * Created by maple on 2015/7/29.
 */
public interface IOuterUser {
    Map<String, String> getUserBaseInfo();

    Map<String, String> getUserOfficeInfo();

    Map<String, String> getUserHomeInfo();
}
