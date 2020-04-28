package com.hua.design_demo.decorate;

public class Tshirt extends Finery{
    @Override
    public void dressUp() {
        person.dressUp();
        System.out.println("dressUp shirt ");
    }
}
