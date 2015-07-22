/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.command;

import com.maple.study.pattern.mediator.command.AddRequirementCommand;
import com.maple.study.pattern.mediator.command.Command;
import com.maple.study.pattern.mediator.command.DeletePageCommand;
import com.maple.study.pattern.mediator.command.Invoker;
import org.junit.Test;

/**
 * Created by aurogon-mac on 15/7/20.
 */
public class Client {

    @Test
    public void test1() {
        Invoker xiaoer = new Invoker();
        Command command = new AddRequirementCommand();
        xiaoer.setCommand(command);
        xiaoer.action();

        command = new DeletePageCommand();
        xiaoer.setCommand(command);
        xiaoer.action();
    }
}
