package com.lin.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 使用注解实现AOP
// 标注该类为一个切面
@Aspect
public class MyAnnotation {

    @Before("execution(* com.lin.service.UserServiceImpl.*(..))")
    public void beforeLog(){
        System.out.println("[Before]");
    }

    @After("execution(* com.lin.service.UserServiceImpl.*(..))")
    public void afterLog(){
        System.out.println("[AFTER]");
    }

    // 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.lin.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[BEFORE AROUND]");

        // 获得签名
//        Signature signature = joinPoint.getSignature();
//        System.out.println("signature : "+signature);
        // 执行方法
        joinPoint.proceed();
        System.out.println("[AFTER AROUND]");
    }
}
