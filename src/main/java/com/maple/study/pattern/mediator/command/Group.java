package com.maple.study.pattern.mediator.command;

/**
 * Created by aurogon-mac on 15/7/20.
 */
public abstract class Group {
    public abstract void find();

    public abstract void add();

    public abstract void delete();

    public abstract void change();

    public abstract void plan();

    public abstract void rollback();
}
