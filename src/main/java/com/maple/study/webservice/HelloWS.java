package com.maple.study.webservice;

import javax.jws.WebService;

/**
 * maven-project : com.maple.study.webservice
 * Created by AUROGON on 2015/8/2.
 */
@WebService
public class HelloWS implements IHelloWS {
    @Override
    public String sayHello(String name) {
        System.out.println("Server: Hello " + name);
        return "Hello " + name;
    }
}
