package com.hua.design_demo.factory.simpleFactory;

public class MysqlSource implements DbSource {
    @Override
    public void insert() {
        System.out.println("mysql insert");
    }

    @Override
    public void select() {
        System.out.println("mysql select");
    }
}
