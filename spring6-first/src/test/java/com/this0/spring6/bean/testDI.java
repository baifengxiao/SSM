package com.this0.spring6.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDI {
    @Test
    public void testDIBySet(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-di.xml");
        Student studentOne = ac.getBean("studentFour", Student.class);
        System.out.println(studentOne);
    }
}
