package com.lin.dao;

import com.lin.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class UserMapperImpl implements UserMapper{
    // 现在的操作都是用sqlSession来执行
    private SqlSessionTemplate sqlSession;

    public SqlSessionTemplate getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getUserList() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        return userList;
    }

    @Override
    public List<User> getUserListById(Map<String, Object> map) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userListById = mapper.getUserListById(map);
        return userListById;
    }
}
