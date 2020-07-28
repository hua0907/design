package com.hua.design_demo.duty.handleChain;

public class UrlFilter implements MyFilter{
    @Override
    public void doFilter(MyRequest request, MyResponse response, FilterChain filter) {
        request.setName(request.getName().replace("https", "http"));
        System.out.println("urlFilter request");

        filter.doFilter(request, response, filter);

        response.setName(response.getName().replace("com", "com.cn"));
        System.out.println("urlFilter response");
    }
}
