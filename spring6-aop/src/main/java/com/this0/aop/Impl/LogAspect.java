package com.this0.aop.Impl;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// @Aspect表示这个类是一个切面类
@Aspect
// @Component注解保证这个切面类能够放入IOC容器
@Component
public class LogAspect {

    //设置切入点和通知类型
    //execution是固定单词，
    @Before("execution(public int com.this0.aop.Impl.CalculatorImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名："+methodName+"，参数："+args);
    }

//    @After("execution(* com.atguigu.aop.annotation.CalculatorImpl.*(..))")
//    public void afterMethod(JoinPoint joinPoint){
//        String methodName = joinPoint.getSignature().getName();
//        System.out.println("Logger-->后置通知，方法名："+methodName);
//    }
//
//    @AfterReturning(value = "execution(* com.atguigu.aop.annotation.CalculatorImpl.*(..))", returning = "result")
//    public void afterReturningMethod(JoinPoint joinPoint, Object result){
//        String methodName = joinPoint.getSignature().getName();
//        System.out.println("Logger-->返回通知，方法名："+methodName+"，结果："+result);
//    }
//
//    @AfterThrowing(value = "execution(* com.atguigu.aop.annotation.CalculatorImpl.*(..))", throwing = "ex")
//    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex){
//        String methodName = joinPoint.getSignature().getName();
//        System.out.println("Logger-->异常通知，方法名："+methodName+"，异常："+ex);
//    }
//
//    @Around("execution(* com.atguigu.aop.annotation.CalculatorImpl.*(..))")
//    public Object aroundMethod(ProceedingJoinPoint joinPoint){
//        String methodName = joinPoint.getSignature().getName();
//        String args = Arrays.toString(joinPoint.getArgs());
//        Object result = null;
//        try {
//            System.out.println("环绕通知-->目标对象方法执行之前");
//            //目标对象（连接点）方法的执行
//            result = joinPoint.proceed();
//            System.out.println("环绕通知-->目标对象方法返回值之后");
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//            System.out.println("环绕通知-->目标对象方法出现异常时");
//        } finally {
//            System.out.println("环绕通知-->目标对象方法执行完毕");
//        }
//        return result;
//    }

}