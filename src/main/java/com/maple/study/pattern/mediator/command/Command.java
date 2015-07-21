package com.maple.study.pattern.mediator.command;

/**
 * Created by aurogon-mac on 15/7/20.
 */
public abstract class Command {
    protected Group requirementGroup = new RequirementGroup();
    protected Group pageGroup = new PageGroup();
    protected Group codeGroup = new CodeGroup();

    public abstract void execute();
}
