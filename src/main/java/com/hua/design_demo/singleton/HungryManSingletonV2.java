package com.hua.design_demo.singleton;

public class HungryManSingletonV2 {
    private final static HungryManSingletonV2 SINGLETON;

    static {
        SINGLETON = new HungryManSingletonV2();
    }

    private HungryManSingletonV2() {
    }

    public static HungryManSingletonV2 getInstance() {
        return SINGLETON;
    }
}
