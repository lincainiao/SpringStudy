package com.lin.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

// ������Ҫʹ�õķ�������ø÷���
public class AfterLog implements AfterReturningAdvice {
    @Override
    // returnVal������ֵ
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[AFTER]"+target.getClass().getName()+" ִ����"+method.getName()+" ����������ֵ��"+returnValue);
    }
}
