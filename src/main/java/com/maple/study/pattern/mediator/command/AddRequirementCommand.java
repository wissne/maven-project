package com.maple.study.pattern.mediator.command;

/**
 * Created by aurogon-mac on 15/7/20.
 */
public class AddRequirementCommand extends Command {

    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}
