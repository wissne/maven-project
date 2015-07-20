package com.maple.study.pattern.mediator;

/**
 * Created by aurogon-mac on 15/7/19.
 */
public class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
