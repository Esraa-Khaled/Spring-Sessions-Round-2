package com.example.orm.service;

import com.example.orm.entity.Employee;
import com.example.orm.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Iterable<Employee> findAll() {
        Iterable<Employee> emp = employeeRepository.findAll();
        return emp;
    }


    public Employee add(Employee emp) {
        return employeeRepository.save(emp);
    }

    public Employee findByUsername(String username) {
        return employeeRepository.findALLByUsername(username);
    }


    public Iterable<Employee> findDepartmentEmployees(long departmentId) {
        return employeeRepository.findDepartmentEmployees(departmentId);
    }
}
