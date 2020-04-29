package com.hua.design_demo.strategy;

public class SummaryFactory {

    Summary createSummary(DiscountEnum discountEnum) {
        Summary summary = new DefaultSummary();
        try {
            summary = (Summary) Class.forName(discountEnum.getSummaryName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.out.println("创建策略出错！");
            e.printStackTrace();
        }
        return summary;
    }
}
