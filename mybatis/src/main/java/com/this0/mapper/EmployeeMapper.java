package com.this0.mapper;

import com.this0.pojo.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    Employee selectEmployee(Integer empId);
    int updateEmployee(@Param("empId") Integer empId, @Param("empSalary") Integer empSalary);

}
