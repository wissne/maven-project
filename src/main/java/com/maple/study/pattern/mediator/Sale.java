package com.maple.study.pattern.mediator;

import java.util.Random;

/**
 * Created by aurogon-mac on 15/7/19.
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int number) {
        System.out.println("销售IBM电脑" + number + "台");
        super.mediator.execute("sale.sell", number);
    }

    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        super.mediator.execute("sale.offsell");
    }
}
