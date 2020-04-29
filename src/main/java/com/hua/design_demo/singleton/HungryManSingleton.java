package com.hua.design_demo.singleton;

public class HungryManSingleton {
    private static HungryManSingleton singleton = new HungryManSingleton();

    private HungryManSingleton() {
    }

    public static HungryManSingleton getInstance() {
        return singleton;
    }

}
