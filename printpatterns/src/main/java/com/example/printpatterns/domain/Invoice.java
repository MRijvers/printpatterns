package com.example.printpatterns.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Invoice {
    private long invoiceId;
    private Order order;

}
