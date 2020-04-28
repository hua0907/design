package com.hua.design_demo.factory.simpleFactory;

public class PostgresqlSource implements DbSource{
    @Override
    public void insert() {
        System.out.println("postgresql insert");
    }

    @Override
    public void select() {
        System.out.println("postgresql select");
    }
}
