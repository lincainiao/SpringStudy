package com.lin.dao;

import com.lin.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSession sqlSessionTemplate;

    public SqlSession getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSession sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> getUserList() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        return userList;
    }
}
