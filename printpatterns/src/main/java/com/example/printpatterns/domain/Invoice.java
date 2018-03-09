package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Invoice {

    @Id
    @GeneratedValue
    private Long invoiceId;
    @OneToOne
    private Order order;

}
