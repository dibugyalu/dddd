package com.example.demo.Service;

import com.example.demo.entry.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    List<Employee> findEmployeesByName(String name);
    List<Employee> findEmployeesWithPagination(int page, int size);
}
