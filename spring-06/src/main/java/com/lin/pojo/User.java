package com.lin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// Component:���
// �ȼ���<bean id="user" class="com.lin.pojo.User"/>
//@Scope("singleton")
//@Scope("protype")
public class User {
    @Value("zhizhi")
    // �൱��private String name = "zhizhi"
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
