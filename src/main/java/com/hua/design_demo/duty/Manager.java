package com.hua.design_demo.duty;

public abstract class Manager {
    static String MSG = "加薪";

    protected String name;

    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public Manager(String name, Manager superior) {
        this.name = name;
        this.superior = superior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract void HandlerRequest(String content,int salary);

    abstract String getHandler();
}
