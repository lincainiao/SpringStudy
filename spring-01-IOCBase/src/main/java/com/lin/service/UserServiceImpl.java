package com.lin.service;

import com.lin.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    // 利用set动态出入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
