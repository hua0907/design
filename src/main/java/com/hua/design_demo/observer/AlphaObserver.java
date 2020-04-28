package com.hua.design_demo.observer;

public class AlphaObserver extends Observer {

    public AlphaObserver(Subject subject, String name) {
        super(subject, name);
    }

    @Override
    void update() {
        if (subject.getMessage().equalsIgnoreCase("走了")) {
            System.out.println(subject.getName() + subject.getMessage() + " " + getName() + " start game");
        } else if (subject.getMessage().equalsIgnoreCase("回来了")) {
            System.out.println(subject.getName() + subject.getMessage() + " " + getName() + " stop game");
        }
    }
}
