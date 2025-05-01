package com.example.demo.dao;

import com.example.demo.entry.Employee;


public class EmployeeMapper {
    @Insert("INSERT INTO employees(name, position, department, salary) VALUES(#{name}, #{position}, #{department}, #{salary})")
    void addEmployee(Employee employee);

    @Select("SELECT * FROM employees WHERE id = #{id}")
    Employee getEmployeeById(Long id);

    @Update("UPDATE employees SET name = #{name}, position = #{position}, department = #{department}, salary = #{salary} WHERE id = #{id}")
    void updateEmployee(Employee employee);

    @Delete("DELETE FROM employees WHERE id = #{id}")
    public void deleteEmployee(Long id);

    @Select("SELECT * FROM employees WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Employee> findEmployeesByName(String name);

    @Select("SELECT * FROM employees LIMIT #{offset}, #{limit}")
    List<Employee> findAllEmployeesWithPagination(int offset, int limit);
}
