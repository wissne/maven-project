package com.maple.study.pattern.mediator;

/**
 * Created by aurogon-mac on 15/7/19.
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    public abstract void execute(String string, Object... objects);
}
