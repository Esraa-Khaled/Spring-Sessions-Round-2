package com.example.orm.repository;

import com.example.orm.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query(value = "select * from comp_employee where user_name = :username", nativeQuery = true)
    Employee findALLByUsername(@Param("username") String username);
}
