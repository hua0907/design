package com.hua.design_demo.observer;

import java.util.ArrayList;
import java.util.List;

public class BoosSubject implements Subject {
    private List<Observer> obs = new ArrayList<>();

    private String name;
    private String message;

    public BoosSubject(String name, String message) {
        this.name = name;
        this.message = message;
    }

    @Override
    public void add(Observer ob) {
        obs.add(ob);
    }

    @Override
    public void remove(Observer ob) {
        obs.remove(ob);
    }

    @Override
    public void notifyOb() {
        obs.forEach(Observer::update);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
