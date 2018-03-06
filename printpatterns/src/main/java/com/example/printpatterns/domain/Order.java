package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Order {
    private Date orderDate;
    private Customer customer;
    private ShoppingCart shoppingCart;

}
