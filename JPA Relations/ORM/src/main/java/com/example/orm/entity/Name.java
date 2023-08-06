package com.example.orm.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Setter
@Getter
@Embeddable
public class Name {

    private String firstName;
    private String lastName;
}
