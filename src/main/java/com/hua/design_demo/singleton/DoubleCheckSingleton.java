package com.hua.design_demo.singleton;

public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (null == singleton) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == singleton) {
                    return new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}