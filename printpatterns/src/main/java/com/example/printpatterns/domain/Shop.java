package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shop {

    private long id;
    private String name;
    private String address;
    private String zipCode;
    private String city;
    private String email;
    private String phoneNumber;
    private String logo;
}
