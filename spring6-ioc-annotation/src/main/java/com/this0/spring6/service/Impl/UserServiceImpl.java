package com.this0.spring6.service.Impl;

import com.this0.spring6.dao.UserDao;
import com.this0.spring6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    @Override
    public void out() {

        userDao.print();
        System.out.println("Service层执行结束");
    }
}
