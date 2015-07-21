package com.maple.study.pattern.mediator.command;

/**
 * Created by aurogon-mac on 15/7/20.
 */
public class DeletePageCommand extends Command {

    @Override
    public void execute() {
        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.plan();
    }
}
