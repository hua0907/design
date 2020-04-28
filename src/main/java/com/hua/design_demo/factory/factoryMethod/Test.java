package com.hua.design_demo.factory.factoryMethod;

public class Test {
    public static void main(String[] args) {
        DbFactory dbFactory = new MysqlDbFactory();
        DbSource source = dbFactory.createSource();
        source.insert();
        source.select();


        dbFactory = new OracleDbFactory();
        source = dbFactory.createSource();
        source.insert();
        source.select();

        dbFactory = new PostgreSqlFactory();
        source = dbFactory.createSource();
        source.insert();
        source.select();

    }
}
