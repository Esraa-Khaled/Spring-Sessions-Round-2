package com.example.orm.controller;

import com.example.orm.dto.EmployeeResponse;
import com.example.orm.entity.Employee;
import com.example.orm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/findall")
    public List<EmployeeResponse> getAllEmployees() {
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

    @DeleteMapping("/deleteById/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployeeById(id);
    }

    @GetMapping ("/findById/{id}")
    public ResponseEntity<?> findEmployeeById(@PathVariable long id) throws Exception {
        return employeeService.findEmployeeById(id);
    }
}
