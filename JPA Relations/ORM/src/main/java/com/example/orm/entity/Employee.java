package com.example.orm.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Set;


@Entity
@Setter
@Getter
@Table(name = "comp_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "user_name")
    private String username;

    private String email;

    @ColumnDefault(value = "'NTG'") //***
    private String company = "NTG";

    // name >> composite  firstName , latName
    // age, netSalary >> derived

    @Embedded
    private Name name;

    private int dateOfBirth;

    @Transient
    private int age;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name = "mng_id", referencedColumnName = "id")
    private Employee manager;

    @JsonManagedReference
    @OneToMany(mappedBy = "manager")
    private Set<Employee> subordante;


    @ManyToOne()
    @JoinColumn(name="dep_id", referencedColumnName = "id" , nullable = false)
    private Department department;

}
