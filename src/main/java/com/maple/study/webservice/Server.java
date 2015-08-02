package com.maple.study.webservice;

import javax.xml.ws.Endpoint;

/**
 * maven-project : com.maple.study.webservice
 * Created by AUROGON on 2015/8/2.
 */
public class Server {

    public static void main(String[] args) {
        String address = "http://localhost:8989/ws/hello";
        Endpoint.publish(address, new com.maple.study.webservice.HelloWS());
        System.out.println("发布成功, URL: " + address);
    }
}
