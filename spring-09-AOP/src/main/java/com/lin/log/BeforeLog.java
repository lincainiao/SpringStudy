package com.lin.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

// ���������ִ��������Ҫ�ķ���֮ǰ���ȵ���
public class BeforeLog implements MethodBeforeAdvice {
    // method��Ҫִ�е�Ŀ�����ķ���
    // args������
    // target��Ŀ�����
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[BEFORE]"+target.getClass().getName()+" �౻ִ����"+method.getName()+" ����");
    }
}
