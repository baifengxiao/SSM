package com.this0.spring6.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloWorldTest {
    @Test
    public void testHelloWorld(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) ac.getBean("helloWorld");
        helloWorld.sayHello();
    }
    

    
}
