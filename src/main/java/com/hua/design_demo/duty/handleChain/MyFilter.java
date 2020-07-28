package com.hua.design_demo.duty.handleChain;

public interface MyFilter {

    void doFilter(MyRequest request, MyResponse response, FilterChain filter);
}
