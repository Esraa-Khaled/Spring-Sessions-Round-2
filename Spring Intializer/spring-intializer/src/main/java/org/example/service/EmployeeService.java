package org.example.service;

import org.example.dao.Employee;
import org.example.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public int getNumberOfEmployees(){
        return employeeRepo.count();
    }

    public Employee getEmployeeById(int id) {
       return employeeRepo.getById(id);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.add(employee);
    }
}
