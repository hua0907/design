package com.hua.design_demo.duty.handleChain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<MyFilter> filters = new ArrayList<>();
    private int index = 0;

    public void add(MyFilter filter) {
        filters.add(filter);
    }

    public void doFilter(MyRequest request, MyResponse response, FilterChain filter) {
        if (index == filters.size()) {
            return;
        }
        MyFilter f = filters.get(index);
        index++;
        f.doFilter(request, response, filter);
    }


}
