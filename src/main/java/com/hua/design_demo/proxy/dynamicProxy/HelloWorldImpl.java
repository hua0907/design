package com.hua.design_demo.proxy.dynamicProxy;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public void printString() {
        System.out.println("hello world");
    }
}
