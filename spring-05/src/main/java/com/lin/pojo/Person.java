package com.lin.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import javax.annotation.Resource;

public class Person {
    private String name;
//    @Autowired

    // @Resource��ͨ�����ֲ��ң�û�в�ͨ�����Ͳ��ң����Ҳ����ű���
    // Ҳ����ָ������
    @Resource
    private Cat cat;

//    @Autowired
//    @Qualifier(value = "dog")

    @Resource(name = "dog111")
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
