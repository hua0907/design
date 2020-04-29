package com.hua.design_demo.strategy;

/**
 * 优惠枚举
 */
public enum DiscountEnum {
    TWENTY_PERCENT("打八折", "com.hua.design_demo.strategy.OneSummary"),
    FULL_ONE_HUNDRED_REDUCTION_TWENTY("满一百减二十", "com.hua.design_demo.strategy.TwoSummary"),
    FULL_THREE_HUNDRED_REDUCTION_EIGHTY("满三百减八十", "com.hua.design_demo.strategy.ThreeSummary");

    private String desc;
    private String summaryName;

    DiscountEnum(String desc, String summaryName) {
        this.desc = desc;
        this.summaryName = summaryName;
    }

    DiscountEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSummaryName() {
        return summaryName;
    }

    public void setSummaryName(String summaryName) {
        this.summaryName = summaryName;
    }}
