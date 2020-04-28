package com.hua.design_demo.duty;

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    public GeneralManager(String name, Manager superior) {
        super(name, superior);
    }

    @Override
    void HandlerRequest(String content, int salary) {
        if (MSG.equals(content)) {
            if (salary < 10000) {
                System.out.println(getHandler() + "已经处理了请求" + content + " : " + salary);
            } else {
                System.out.println(getHandler() + "将需求呈给了上级！");
            }
        }
    }

    @Override
    String getHandler() {
        return "generalManager";
    }
}
