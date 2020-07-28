package com.hua.design_demo.duty.handleChain;

public class MesFilter implements MyFilter {
    @Override
    public void doFilter(MyRequest request, MyResponse response, FilterChain filter) {
        request.setName(request.getName().replace("996", "955"));
        System.out.println("MesFilter request");

        filter.doFilter(request, response, filter);

        response.setName(response.getName().replace("res", "result"));
        System.out.println("MesFilter response");
    }
}
