package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Getter
@Setter
public class Customer extends Account{
    @Id
    @GeneratedValue
    private Long customerId;
    @OneToMany
    private ArrayList<CustomerAddress> customerAddresses;
    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<Order> customerOrders;
}
