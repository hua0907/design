package com.hua.design_demo.factory.factoryMethod;

public class PostgreSqlSource implements DbSource{
    @Override
    public void insert() {
        System.out.println("postgresql insert");
    }

    @Override
    public void select() {
        System.out.println("postgresql select");
    }
}
