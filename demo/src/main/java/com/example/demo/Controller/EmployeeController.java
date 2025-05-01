package com.example.demo.Controller;

import com.example.demo.Service.EmployeeService;
import com.example.demo.entry.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/search")
    public List<Employee> findEmployeesByName(@RequestParam String name) {
        return employeeService.findEmployeesByName(name);
    }

    @GetMapping("/page")
    public List<Employee> findEmployeesWithPagination(@RequestParam int page, @RequestParam int size) {
        return employeeService.findEmployeesWithPagination(page, size);
    }
}
