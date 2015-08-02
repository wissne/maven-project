package com.maple.study.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * maven-project : com.maple.study.webservice
 * Created by AUROGON on 2015/8/2.
 */
@WebService
public interface IHelloWS {
    @WebMethod
    String sayHello(String name);
}
