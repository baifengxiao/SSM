package com.this0.spring6.service.Impl;

import com.this0.spring6.dao.UserDao;
import com.this0.spring6.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    @Qualifier("userDaoImpl")
    private UserDao myUserDao1;

    @Override
    public void out() {
        myUserDao1.print();
        System.out.println("Service层执行结束");
    }
}
