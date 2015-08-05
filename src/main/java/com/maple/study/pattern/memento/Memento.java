package com.maple.study.pattern.memento;

/**
 * maven-project : com.maple.study.pattern.memento
 * Created by AUROGON on 2015/8/6.
 */
public class Memento {

    private String state = "";
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
