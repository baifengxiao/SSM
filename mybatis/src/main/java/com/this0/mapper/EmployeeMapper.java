package com.this0.mapper;

import com.this0.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface EmployeeMapper {
    Employee selectEmployee(Integer empId);
    int updateEmployee(@Param("empId") Integer empId, @Param("empSalary") Integer empSalary);
    int insertEmployee(Employee employee);

    int updateEmployeeByMap(Map<String, Object> paramMap);
}
