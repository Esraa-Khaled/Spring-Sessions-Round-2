package com.example.orm.service;

import com.example.orm.entity.Department;
import com.example.orm.entity.Employee;
import com.example.orm.repository.DepartmentRepository;
import com.example.orm.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeService employeeService;



    public Department add(Department emp) {
        return departmentRepository.save(emp);
    }


    public Iterable<Department> findAll() {
        return departmentRepository.findAll();
    }

    public Iterable<Department> addAll(List<Department> departmentList) {
        return departmentRepository.saveAll(departmentList);
    }

    public Iterable<Employee> findDepartmentEmployees(long departmentId) {
        return employeeService.findDepartmentEmployees(departmentId);
    }
}
