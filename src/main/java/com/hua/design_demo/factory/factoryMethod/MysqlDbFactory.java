package com.hua.design_demo.factory.factoryMethod;

public class MysqlDbFactory implements DbFactory{
    @Override
    public DbSource createSource() {
        return new MysqlSource();
    }

}
