package com.this0.spring6.service.imp;

import com.this0.spring6.dao.UserDao;
import com.this0.spring6.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }

}
