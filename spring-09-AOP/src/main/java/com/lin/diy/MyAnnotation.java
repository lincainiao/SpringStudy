package com.lin.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// ʹ��ע��ʵ��AOP
// ��ע����Ϊһ������
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

    // �ڻ�����ǿ�У����ǿ��Ը���һ����������������Ҫ��ȡ��������ĵ�
    @Around("execution(* com.lin.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[BEFORE AROUND]");

        // ���ǩ��
//        Signature signature = joinPoint.getSignature();
//        System.out.println("signature : "+signature);
        // ִ�з���
        joinPoint.proceed();
        System.out.println("[AFTER AROUND]");
    }
}
