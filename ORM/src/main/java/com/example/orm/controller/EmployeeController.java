package com.example.orm.controller;

import com.example.orm.entity.Employee;
import com.example.orm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/findall")
    public Iterable<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee emp) {
        return employeeService.add(emp);
    }

    @GetMapping("/findByUsername")
    public Employee findByUsername() {
        return employeeService.findByUsername("user1");
    }

}
