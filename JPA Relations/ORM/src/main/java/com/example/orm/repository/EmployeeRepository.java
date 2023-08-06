package com.example.orm.repository;

import com.example.orm.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "select * from comp_employee where user_name = :username", nativeQuery = true)
    Employee findALLByUsername(@Param("username") String username);


    @Query(value = "select * from  comp_employee where dep_id = :depId", nativeQuery = true)
    Iterable<Employee> findDepartmentEmployees(@Param("depId") long departmentId);
}
