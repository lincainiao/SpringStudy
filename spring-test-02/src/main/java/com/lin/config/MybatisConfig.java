package com.lin.config;

import com.lin.dao.UserMapper;
import com.lin.dao.UserMapperImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import java.io.InputStream;

@Configuration
public class MybatisConfig {
    @Bean
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?useSSL=true&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        System.out.println("dataSource Done!");
        return dataSource;
    }
    @Bean
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        Resource mybatisConfig = new InputStreamResource(inputStream);

        InputStream inputStream1 = Resources.getResourceAsStream("com/lin/dao/UserMapper.xml");
        Resource mapperConfig = new InputStreamResource(inputStream1);

        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(getDataSource());
        sqlSessionFactory.setConfigLocation(mybatisConfig);
        sqlSessionFactory.setMapperLocations(mapperConfig);
        System.out.println("sqlSessionFactory Done!");
        return sqlSessionFactory.getObject();
    }
    @Bean
    public SqlSession getSqlSession() throws Exception {
        SqlSession sqlSession = getSqlSessionFactory().openSession(true);
        System.out.println("sqlSession Done!");
        return sqlSession;
    }
    @Bean
    public UserMapperImpl getUserMapper() throws Exception {
        UserMapperImpl userMapper = new UserMapperImpl();
        userMapper.setSqlSessionTemplate(getSqlSession());
        return userMapper;
    }
}
