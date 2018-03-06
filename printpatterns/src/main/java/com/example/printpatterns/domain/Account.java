package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Account {
    private long accountId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String emailAddress;
    private String phoneNumber;
}