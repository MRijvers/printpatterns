package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;

@Entity
@Getter
@Setter
public class Order {
    private Date orderDate;
    @OneToMany(cascade = CascadeType.ALL)
    private Customer customer;
    private ShoppingCart shoppingCart;

}
