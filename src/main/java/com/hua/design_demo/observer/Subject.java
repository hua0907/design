package com.hua.design_demo.observer;

public interface Subject {

    void add(Observer ob);

    void remove(Observer ob);

    void notifyOb();

    String getName();

    String getMessage();
}
