package com.lin.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

// 这个方法在执行我们需要的方法之前会先调用
public class BeforeLog implements MethodBeforeAdvice {
    // method：要执行的目标对象的方法
    // args：参数
    // target：目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[BEFORE]"+target.getClass().getName()+" 类被执行了"+method.getName()+" 方法");
    }
}
