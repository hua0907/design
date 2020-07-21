package com.hua.design_demo.singleton;

public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class Context{
        private static final StaticInnerClassSingleton SINGLETON = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return Context.SINGLETON;
    }

}
