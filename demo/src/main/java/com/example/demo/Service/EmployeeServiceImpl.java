package com.example.demo.Service;

import com.example.demo.dao.EmployeeMapper;
import com.example.demo.entry.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeMapper.getEmployeeById(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeMapper.deleteEmployee(id);
    }

    @Override
    public List<Employee> findEmployeesByName(String name) {
        return employeeMapper.findEmployeesByName(name);
    }

    @Override
    public List<Employee> findEmployeesWithPagination(int page, int size) {
        int offset = (page - 1) * size;
        return employeeMapper.findAllEmployeesWithPagination(offset, size);
    }
}
