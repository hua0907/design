package com.hua.design_demo.factory.simpleFactory;

public class Test {
    public static void main(String[] args) {
        DbFactory fa = new DbFactory();
        DbSource mysql = fa.createSource("mysql");
        mysql.insert();
        mysql.select();
        DbSource oracle = fa.createSource("oracle");
        oracle.insert();
        oracle.select();
        DbSource postgresql = fa.createSource("postgresql");
        postgresql.insert();
        postgresql.select();
    }
}
