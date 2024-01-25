package com.this0;

import com.this0.mapper.OrderMapper;
import com.this0.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class MyBatisTest3 {
    private Logger logger = LoggerFactory.getLogger(MyBatisTest3.class);
    private SqlSession session;

    //junit5会在每一个@Test方法前执行@BeforeEach方法
    @BeforeEach
    public void init() throws IOException {
        session = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config2.xml")).openSession();
    }
    @Test
    public void test(){
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);
        Order order = orderMapper.selectOrderWithCustomer(1);
        logger.info(order.toString());
    }

    @AfterEach
    public void clear() {
        session.commit();
        session.close();
    }
}
