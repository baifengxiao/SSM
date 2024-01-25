package com.this0;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.this0.mapper.EmployeeMapper;
import com.this0.mapper.UserMapper;
import com.this0.pojo.Employee;
import com.this0.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyBatisTest2 {

    private Logger logger = LoggerFactory.getLogger(MyBatisTest2.class);
    private SqlSession session;

    //junit5会在每一个@Test方法前执行@BeforeEach方法
    @BeforeEach
    public void init() throws IOException {
        session = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config2.xml")).openSession();
    }


    @Test
    public void createTest() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        UserMapper userMapper = session.getMapper(UserMapper.class);
        userMapper.insert(user);
        System.out.println(user);
    }

    @Test
    public void updateTest() {
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.selectById(1);
        user.setUsername("root");
        user.setPassword("111111");
        userMapper.update(user);
        user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public void deleteTest() {
        UserMapper userMapper = session.getMapper(UserMapper.class);
        userMapper.delete(1);
        User user = userMapper.selectById(1);
        System.out.println("user = " + user);
    }

    @Test
    public void selectList() {
        UserMapper userMapper = session.getMapper(UserMapper.class);
//        User user = userMapper.selectById(1);
//        System.out.println("user = " + user);


//        分页插件
        PageHelper.startPage(2,3);
        // 查询Customer对象同时将关联的Order集合查询出来
        List<User> users = userMapper.selectAll();

        PageInfo<User> pageInfo = new PageInfo<>(users);

        System.out.println("pageInfo = " + pageInfo);
        long total = pageInfo.getTotal(); // 获取总记录数
        System.out.println("total = " + total);
        int pages = pageInfo.getPages();  // 获取总页数
        System.out.println("pages = " + pages);
        int pageNum = pageInfo.getPageNum(); // 获取当前页码
        System.out.println("pageNum = " + pageNum);
        int pageSize = pageInfo.getPageSize(); // 获取每页显示记录数
        System.out.println("pageSize = " + pageSize);
        List<User> list = pageInfo.getList();//获取查询页的数据集合
        System.out.println("list = " + list);
        list.forEach(System.out::println);

    }

    @Test
    public void selectAllTest() {
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> userList = userMapper.selectAll();
        System.out.println("userList = " + userList);
    }

    @AfterEach
    public void clear() {
        session.commit();
        session.close();
    }
}
