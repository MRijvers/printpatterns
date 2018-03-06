package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerAddress {
    private String address;
    private String city;
    private String country;
    private String houseNumber;
    private String zipCode;
}
