package com.qiufeng.service.impl;

import com.qiufeng.domain.Employee;
import com.qiufeng.mapper.EmployeeMapper;
import com.qiufeng.service.EmployeeService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 员工业务处理层
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 新增员工
     * @param employee
     */
    @Override
    public void saveEmployee(Employee employee) {
        employeeMapper.saveEmployee(employee);
    }

    /**
     * 修改员工
     * @param employee
     */
    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    /**
     * 删除员工
     * @param id
     */
    @Override
    public void deleteEmployee(Long id) {
        employeeMapper.deleteEmployee(id);
    }

    /**
     * 根据员工id查询单个员工
     * @param id 员工id
     * @return 员工
     */
    @Override
    public Employee findEmployeeById(Long id) {
        return employeeMapper.findEmployeeById(id);
    }

    /**
     * 登录 只能是管理员登录
     * @param name 用户名
     * @param password 密码
     * @return
     */
    @Override
    public Employee login(String name, String password) {
        password = DigestUtils.md5(password).toString();
        return employeeMapper.login(name,password);
    }

    /**
     * 查询所有员工
     * @return
     */
    @Override
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }
}
