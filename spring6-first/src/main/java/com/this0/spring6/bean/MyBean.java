package com.this0.spring6.bean;

public class MyBean {
    private void init() {
        System.out.println("哟，初始化方法");
    }

    private void destroy() {
        System.out.println("哟，销毁方法");
    }
}
