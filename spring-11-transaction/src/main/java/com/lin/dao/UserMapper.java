package com.lin.dao;

import com.lin.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    int updateUserById(Map<String,Object> map);

    int addUser(User user);
}
