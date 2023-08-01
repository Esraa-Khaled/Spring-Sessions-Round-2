package org.example.repository;

import org.example.configurations.crudOperations;
import org.example.dao.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo implements crudOperations<Employee> {

    @Autowired()
    @Qualifier("jdbcTemplateImpl")
    JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        String sql = "SELECT count(*) FROM employee";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Employee getById(int id) {
        String sql = "SELECT * FROM employee where id = " + id;
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class));
    }

    @Override
    public Employee add(Employee obj) {

        String username = obj.getUsername();
        String email = obj.getEmail();
        int id = obj.getId();
        String sql = "insert into employee(id, username, email) values(" + id + ",'" + username +"' , '" + email +"' )";
        jdbcTemplate.execute(sql);
        String sql2 = "SELECT * FROM employee where id = " + id;
        return jdbcTemplate.queryForObject(sql2, new BeanPropertyRowMapper<>(Employee.class));
    }
}
