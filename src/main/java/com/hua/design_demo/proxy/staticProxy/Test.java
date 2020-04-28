package com.hua.design_demo.proxy.staticProxy;

public class Test {

    public static void main(String[] args) {
        StaticProxy proxy = new StaticProxy(new HelloWorldImpl());
        proxy.printString();
    }
}
