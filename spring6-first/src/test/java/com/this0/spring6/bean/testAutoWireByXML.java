package com.this0.spring6.bean;

import com.this0.spring6.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAutoWireByXML {
    @Test
    public void testUserFactoryBean(){
        //获取IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-di.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.saveUser();
    }
}
