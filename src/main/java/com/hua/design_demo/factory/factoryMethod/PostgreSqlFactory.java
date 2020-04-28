package com.hua.design_demo.factory.factoryMethod;

public class PostgreSqlFactory implements DbFactory {
    @Override
    public DbSource createSource() {
        return new PostgreSqlSource();
    }
}
