package com.maple.study.pattern.mediator;

/**
 * Created by aurogon-mac on 15/7/19.
 */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
