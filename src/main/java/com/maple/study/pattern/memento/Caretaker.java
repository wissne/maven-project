package com.maple.study.pattern.memento;

/**
 * maven-project : com.maple.study.pattern.memento
 * Created by AUROGON on 2015/8/6.
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
