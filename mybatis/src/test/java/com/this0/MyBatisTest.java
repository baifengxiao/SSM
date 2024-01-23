package com.this0;

import com.this0.mapper.EmployeeMapper;
import com.this0.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyBatisTest {

    private Logger logger = LoggerFactory.getLogger(MyBatisTest.class);
    private SqlSession session;

    @Test
    public void testQueryEmpNameAndSalary() {

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Map<String, Object> resultMap = employeeMapper.selectEmpNameAndMaxSalary();

        Set<Map.Entry<String, Object>> entrySet = resultMap.entrySet();

        for (Map.Entry<String, Object> entry : entrySet) {
            String key = entry.getKey();
            Object value = entry.getValue();
            logger.info(key + "=" + value);
        }

    }

    //junit5会在每一个@Test方法前执行@BeforeEach方法
    @BeforeEach
    public void init() throws IOException {
        session = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession();
    }

    @Test
    public void testUpdateEmpNameByMap() {
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Map<String, Object> paramMap = new HashMap<>();

        paramMap.put("empSalaryKey", 999.99);
        paramMap.put("empIdKey", 4);

        int result = mapper.updateEmployeeByMap(paramMap);
    }

    @Test

    public void testEmpCount() {

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        int count = employeeMapper.selectEmpCount();

        logger.info("count=" + count);
    }

    @AfterEach
    public void clear() {
        session.commit();
        session.close();
    }
}
