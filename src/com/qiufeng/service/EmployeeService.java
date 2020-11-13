package com.qiufeng.service;

import com.qiufeng.domain.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 员工业务层
 */
public interface EmployeeService {

    /**
     * 新增员工
     * @param employee
     */
    void saveEmployee(Employee employee);

    /**
     * 修改员工
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * 删除员工
     * @param id
     */
    void deleteEmployee(Long id);

    /**
     * 根据员工id查询单个员工
     * @param id 员工id
     * @return 员工
     */
    Employee findEmployeeById(Long id);

    /**
     * 登录 只能是管理员登录
     * @param name 用户名
     * @param password 密码
     * @return
     */
    Employee login(String name,String password);

    /**
     * 查询所有员工
     * @return
     */
    List<Employee> findAll();

}
