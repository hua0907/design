package com.hua.design_demo.proxy.staticProxy;

public class StaticProxy implements HelloWorld{
    private HelloWorld helloWorld;

    public StaticProxy(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public void printString() {
        System.out.println("before");
        helloWorld.printString();
        System.out.println("after");
    }
}
