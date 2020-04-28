package com.hua.design_demo.observer;

public abstract class Observer {
    protected Subject subject;

    private String name;


    public Observer(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void update();
}
