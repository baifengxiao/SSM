package com.this0.spring6;

import com.this0.spring6.config.Spring6Config;
import com.this0.spring6.controller.UserController;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void testAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserController userController = context.getBean("userController", UserController.class);
        userController.out();
    }
}
