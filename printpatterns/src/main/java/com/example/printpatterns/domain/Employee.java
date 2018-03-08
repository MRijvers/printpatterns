package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Getter
@Setter
public class Employee extends Account {

    @Id
    @GeneratedValue
    private Long employeeId;
    private String address;
    private String zipCode;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private ArrayList<Shop> shops;
}
