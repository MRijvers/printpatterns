package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Customer {
    private long customerId;
    private ArrayList<CustomerAddress> customerAddresses;
}
