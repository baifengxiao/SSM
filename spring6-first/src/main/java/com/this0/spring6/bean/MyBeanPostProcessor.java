package com.this0.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("---------------MyBeanPostProcessor.postProcessBeforeInitialization----------");
        System.out.println("bean = " + bean + ", beanName = " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("--------------MyBeanPostProcessor.postProcessAfterInitialization------------------");
        System.out.println("bean = " + bean + ", beanName = " + beanName);
        return bean;
    }
}
