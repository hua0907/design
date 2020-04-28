package com.hua.design_demo.decorate;

public class Sneakers extends Finery{
    @Override
    public void dressUp() {
        person.dressUp();
        System.out.println("dressUp Sneakers");
    }
}
