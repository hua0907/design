package com.hua.design_demo.proxy.dynamicProxy;

public class Test {
    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy();
        HelloWorldImpl impl = new HelloWorldImpl();
        HelloWorld hw = (HelloWorld) proxy.newInstance(impl);
        hw.printString();
    }
}