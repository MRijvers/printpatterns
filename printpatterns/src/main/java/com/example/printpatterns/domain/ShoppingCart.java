package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ShoppingCart {
    private ArrayList<Product> Products;
    private int quantity;

}
