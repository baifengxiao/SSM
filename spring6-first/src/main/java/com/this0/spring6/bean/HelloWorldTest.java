package com.this0.spring6.bean;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

    private Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);
    @Test
    public void testHelloWorld(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) ac.getBean("helloWorld");
        helloWorld.sayHello();

        logger.info("执行成功");
    }
    

    
}
