package com.ntg.caching.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_s")
    @SequenceGenerator(name = "product_s", sequenceName = "product_s", initialValue = 100, allocationSize = 1)
    private Long id;
    private String name;
    private Long price;
    @Lob
    private String description;
}
