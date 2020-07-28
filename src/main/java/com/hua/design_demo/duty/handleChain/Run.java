package com.hua.design_demo.duty.handleChain;

public class Run {
    public static void main(String[] args) {
        UrlFilter urlFilter = new UrlFilter();
        MesFilter mesFilter = new MesFilter();

        FilterChain filterChain = new FilterChain();
        filterChain.add(urlFilter);
        filterChain.add(mesFilter);

        MyRequest request = new MyRequest();
        request.setName("https://www.996.com.cn");
        MyResponse response = new MyResponse();
        response.setName("res = {www.baidu.com}");
        filterChain.doFilter(request, response, filterChain);

        System.out.println(request.getName());
        System.out.println(response.getName());
    }
}
