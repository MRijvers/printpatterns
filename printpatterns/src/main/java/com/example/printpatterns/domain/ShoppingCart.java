package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;

@Entity
@Getter
@Setter
public class ShoppingCart {
    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private ArrayList<Product> Products;
    private int quantity;

}
