package com.ntg.security.PublicAPIs.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "sec_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "role_name", unique = true, nullable = false, length = 50)
    private String name;

    public Role(String name) {
        this.name = name;
    }
}
