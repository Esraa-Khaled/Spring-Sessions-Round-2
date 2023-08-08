package com.example.orm.controller;

import com.example.orm.entity.Department;
import com.example.orm.entity.Employee;
import com.example.orm.repository.DepartmentRepository;
import com.example.orm.service.DepartmentService;
import com.example.orm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/dep")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/findall")
    public Iterable<Department> getAllDepartments() {
        return departmentService.findAll();
    }

    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.add(department);
    }

    @PostMapping("/addAll")
    public Iterable<Department> addAllDepartment(@RequestBody List<Department> departmentList) {
        return departmentService.addAll(departmentList);
    }


    @RequestMapping( value = "/findEmployeesByDepId/{depId}",method = RequestMethod.GET)
    public Iterable<Employee> findDepartmentEmployees(@PathVariable ("depId") long departmentId) {
        return departmentService.findDepartmentEmployees(departmentId);
    }
}
