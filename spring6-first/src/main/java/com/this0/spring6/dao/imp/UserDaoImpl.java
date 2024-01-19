package com.this0.spring6.dao.imp;

import com.this0.spring6.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }

}
