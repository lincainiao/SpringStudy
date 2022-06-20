package com.lin.Config;

import com.lin.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// 这个也会被spring容器托管，注册到容器中，因为它本来就是一个Component
// @Configuration代表这是一个配置类，就和applicationContext.xml一样
@Import(ZhiConfig.class)
// 引入其他配置
public class LinConfig {
    @Bean
    // 注册一个bean，相当于配置文件中的bean标签
    // 这个方法的名字相当于bean标签中的id
    // 这个方法的返回值，相当于bean的class
    public User getUser(){
        return new User();
    }
    @Bean User getU(){
        return getUser();
    }
}
