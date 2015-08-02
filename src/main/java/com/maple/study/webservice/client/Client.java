package com.maple.study.webservice.client;

/**
 * maven-project : com.maple.study.webservice
 * Created by AUROGON on 2015/8/2.
 */
public class Client {

    public static void main(String[] args) {
        HelloWSService service = new HelloWSService();
        HelloWS helloWSPort = service.getHelloWSPort();
        String result = helloWSPort.sayHello("aurogon");
        System.out.println("Client: " + result);
    }
}
