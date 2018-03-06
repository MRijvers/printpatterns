package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private long productId;
    private String name;
    private String description;
    private double cost;
}
