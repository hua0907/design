package com.hua.design_demo.decorate;

public class Boy extends Person {

    public Boy(String name) {
        super(name);
    }

    @Override
    public void dressUp() {
        System.out.println("I am a boy, my name is " + getName());
    }
}
