package com.hua.design_demo.factory.simpleFactory;

public class DbFactory {

    public DbSource createSource(String type) {
        DbSource source;
        switch (type) {
            case "mysql":
                source = new MysqlSource();
                break;
            case "oracle":
                source = new OracleSource();
                break;
            default:
                source = new PostgresqlSource();
        }
        return source;
    }

}
