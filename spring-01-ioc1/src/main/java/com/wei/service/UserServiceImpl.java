package com.wei.service;

import com.wei.dao.UserDao;

public class UserServiceImpl implements UserService {

    //private UserDao userDao=new UerDaoMySQLImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
