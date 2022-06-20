package com.lin.springmybatis;

import com.lin.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> getUserList() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        return userList;
    }
}
