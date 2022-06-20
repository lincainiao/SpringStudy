package com.lin.diy;

// 自定义切入点类
public class DIYPointCut {
    public void beforeLog(){
        System.out.println("[ Before ]");
    }
    public void afterLog(){
        System.out.println("[ After ]");
    }
}
