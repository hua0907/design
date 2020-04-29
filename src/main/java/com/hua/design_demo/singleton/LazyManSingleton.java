package com.hua.design_demo.singleton;

public class LazyManSingleton {
    private static LazyManSingleton singleton;

    private LazyManSingleton() {
    }

    public static synchronized LazyManSingleton getInstance() {
        if (null == singleton) {
            singleton = new LazyManSingleton();
        }
        return singleton;
    }

}
