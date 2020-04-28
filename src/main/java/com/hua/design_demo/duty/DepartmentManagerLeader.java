package com.hua.design_demo.duty;

public class DepartmentManagerLeader extends Manager {

    public DepartmentManagerLeader(String name) {
        super(name);
    }

    public DepartmentManagerLeader(String name, Manager superior) {
        super(name, superior);
    }

    @Override
    void HandlerRequest(String content, int salary) {
        if ("加薪".equals(content)) {
            if (salary < 1000) {
                System.out.println(getHandler() + "已经处理了请求" + content + " : " + salary);
            } else {
                System.out.println(getHandler() + "将需求呈给了上级！");
                superior.HandlerRequest(content, salary);
            }
        }
    }

    @Override
    String getHandler() {
        return "departmentManagerLeader";
    }
}
