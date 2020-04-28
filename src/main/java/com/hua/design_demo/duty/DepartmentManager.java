package com.hua.design_demo.duty;

public class DepartmentManager extends Manager {

    public DepartmentManager(String name) {
        super(name);
    }

    public DepartmentManager(String name, Manager superior) {
        super(name, superior);
    }

    @Override
    void HandlerRequest(String content, int salary) {
        if (MSG.equals(content)) {
            System.out.println(getHandler() + "将需求呈给了上级！");
            superior.HandlerRequest(content, salary);
        } else {
            System.out.println(getHandler() + "已经处理了请求");
        }
    }

    @Override
    String getHandler() {
        return "departmentManager";
    }
}
