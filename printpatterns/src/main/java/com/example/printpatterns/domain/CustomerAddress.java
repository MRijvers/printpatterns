package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class CustomerAddress {
    private String address;
    private String city;
    private String country;
    private String houseNumber;
    private String zipCode;
}
