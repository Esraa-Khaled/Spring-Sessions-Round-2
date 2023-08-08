package com.example.orm.service;

import com.example.orm.dto.EmployeeResponse;
import com.example.orm.entity.Employee;
import com.example.orm.execptions.RecordNotFoundException;
import com.example.orm.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeResponse> findAll() {
        Iterable<Employee> empList = employeeRepository.findAll();
        List<EmployeeResponse> employeeResponseList = new ArrayList<>();

        for(Employee employee:empList){
            EmployeeResponse e1 = new EmployeeResponse();
            BeanUtils.copyProperties(employee, e1);
            employeeResponseList.add(e1);

        }
        return employeeResponseList;
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

    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }

    public ResponseEntity<?>findEmployeeById(long id) throws Exception {
//        return employeeRepository.findById(id).get();
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(employeeOptional.isPresent()) {

            return new ResponseEntity<>(employeeOptional.get(), HttpStatus.ACCEPTED);
        } else {
            //
            throw new RecordNotFoundException("Employee Not found");
        }
    }
}
