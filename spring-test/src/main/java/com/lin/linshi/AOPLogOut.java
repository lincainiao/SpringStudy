package com.lin.linshi;

public class AOPLogOut {
    public void beforeLog(){
        System.out.println("[BEFORE LOG : preparing!]");
    }

    public void afterLog(){
        System.out.println("[AFTER LOG : Done!]");
    }
}
