package com.hua.design_demo.duty;

public class Test {
    public static void main(String[] args) {
        Staff h = new Staff("hua");

        DepartmentManager dm = new DepartmentManager("部门经理");
        DepartmentManagerLeader dml = new DepartmentManagerLeader("总监");
        GeneralManager gm = new GeneralManager("总经理");

        h.setLeader(dm);
        dm.setSuperior(dml);
        dml.setSuperior(gm);

        h.apply(Manager.MSG, 2000);
    }
}
