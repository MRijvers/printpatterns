package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Getter
@Setter
public class Shop {
    @Id
    @GeneratedValue
    private Long shopId;
    private String name;
    private String address;
    private String zipCode;
    private String city;
    private String email;
    private String phoneNumber;
    private String logo;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private ArrayList<Employee> employees;
}
