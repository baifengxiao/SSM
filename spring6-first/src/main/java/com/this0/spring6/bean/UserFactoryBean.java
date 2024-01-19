package com.this0.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        System.out.println("测试UserFactoryBean");
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        System.out.println("表示返回类型");
        return User.class;
    }
}
