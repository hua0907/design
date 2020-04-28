package com.hua.design_demo.decorate;

public class Jeans extends Finery{
    @Override
    public void dressUp() {
        person.dressUp();
        System.out.println("dressUp Jeans");
    }
}
