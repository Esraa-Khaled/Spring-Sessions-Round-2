package com.example.orm.entity;


import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Type;

import javax.persistence.*;


@Entity
@Table(name = "comp_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
//    @SequenceGenerator(name = "employee_seq", sequenceName = "employee_s", initialValue = 1000)

//    @GeneratedValue(strategy =  GenerationType.TABLE, generator = "employee_seq_table")
//    @TableGenerator(name="employee_seq_table", table = "employee_table_seq")
    private long id;

    @Column(name= "user_name")
    private String username;

    private String email;

    @ColumnDefault(value = "'NTG'") //***
    private String company;


    @Lob // CLOB  >> char , BLOB >> byte[]
    @Type(type = "org.hibernate.type.TextType")
    private String image;


    @Transient
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
