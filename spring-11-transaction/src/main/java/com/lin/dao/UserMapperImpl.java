package com.lin.dao;

import com.lin.pojo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        User user = new User(123123,"zzzzz","123456");
        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        mapper.addUser(user);
        mapper.updateUserById(map);
        List<User> userList = mapper.getUserList();

        return userList;
    }

    @Override
    public int updateUserById(Map<String, Object> map) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.updateUserById(map);
    }

    @Override
    public int addUser(User user) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }
}
