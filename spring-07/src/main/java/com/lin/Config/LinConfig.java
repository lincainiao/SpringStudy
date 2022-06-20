package com.lin.Config;

import com.lin.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// ���Ҳ�ᱻspring�����йܣ�ע�ᵽ�����У���Ϊ����������һ��Component
// @Configuration��������һ�������࣬�ͺ�applicationContext.xmlһ��
@Import(ZhiConfig.class)
// ������������
public class LinConfig {
    @Bean
    // ע��һ��bean���൱�������ļ��е�bean��ǩ
    // ��������������൱��bean��ǩ�е�id
    // ��������ķ���ֵ���൱��bean��class
    public User getUser(){
        return new User();
    }
    @Bean User getU(){
        return getUser();
    }
}
