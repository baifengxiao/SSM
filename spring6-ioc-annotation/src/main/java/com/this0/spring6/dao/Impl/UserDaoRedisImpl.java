package com.this0.spring6.dao.Impl;

import com.this0.spring6.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoRedisImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("Redis Dao层执行结束");
    }
}
