package com.example.orm.dto;


import com.example.orm.entity.Account;
import com.example.orm.entity.Name;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Transient;


@Getter
@Setter
public class EmployeeResponse {

    private long id;

    private String username;

    private String email;

    private String company;

    // name >> composite  firstName , latName
    // age, netSalary >> derived

    private Name name;

    private int dateOfBirth;

    private int age;

    private Account account;
}
