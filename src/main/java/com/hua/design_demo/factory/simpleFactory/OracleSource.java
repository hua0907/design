package com.hua.design_demo.factory.simpleFactory;

public class OracleSource implements DbSource {
    @Override
    public void insert() {
        System.out.println("oracle insert");
    }

    @Override
    public void select() {
        System.out.println("oracle select");
    }
}
