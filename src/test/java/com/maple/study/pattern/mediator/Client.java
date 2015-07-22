/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.mediator;

import org.junit.Test;

/**
 * Created by aurogon-mac on 15/7/19.
 */
public class Client {

    @Test
    public void test1() {
        System.out.println("----------采购人员采购电脑----------");
        AbstractMediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        System.out.println("----------销售人员销售电脑----------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        System.out.println("----------库房人员清库处理----------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
