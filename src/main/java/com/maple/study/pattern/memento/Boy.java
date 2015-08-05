package com.maple.study.pattern.memento;

/**
 * maven-project : com.maple.study.pattern.memento
 * Created by AUROGON on 2015/8/6.
 */
public class Boy {
    private String state;

    public void changeState() {
        this.state = "心情可能很不好";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
