package com.lin.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

// 在我们要使用的方法后调用该方法
public class AfterLog implements AfterReturningAdvice {
    @Override
    // returnVal：返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[AFTER]"+target.getClass().getName()+" 执行了"+method.getName()+" 方法，返回值："+returnValue);
    }
}
