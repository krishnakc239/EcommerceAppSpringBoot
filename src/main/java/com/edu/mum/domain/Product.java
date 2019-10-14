package com.edu.mum.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tables")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotNull(message = "Product name is required.")
//    @Basic(optional = false)
    private String name;

    private Double price;

    private String pictureUrl;


    private Category category;

    // all arguments contructor
    // standard getters and setters
}