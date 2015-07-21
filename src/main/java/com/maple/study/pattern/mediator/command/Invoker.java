package com.maple.study.pattern.mediator.command;

/**
 * Created by aurogon-mac on 15/7/20.
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
