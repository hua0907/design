package com.hua.design_demo.factory.factoryMethod;

public class OracleDbFactory implements DbFactory {
    @Override
    public DbSource createSource() {
        return new OracleSource();
    }

}
