package com.hua.design_demo.duty;

import javax.naming.Name;

public class Staff {
    private String name;

    private String content;

    private int salary;

    private Manager leader;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Manager getLeader() {
        return leader;
    }

    public void setLeader(Manager leader) {
        this.leader = leader;
    }

    public Staff(String name) {
        this.name = name;
    }

    public void apply(String content, int salary) {
        leader.HandlerRequest(content, salary);
    }

}
