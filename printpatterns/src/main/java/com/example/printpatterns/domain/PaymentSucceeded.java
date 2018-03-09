package com.example.printpatterns.domain;

import javafx.beans.InvalidationListener;

public class PaymentSucceeded extends PaymentState{

    @Override
    public void orderIsPaid() {
        super.orderIsPaid();
    }

    @Override
    public void addListener(InvalidationListener listener) {

    }

    @Override
    public void removeListener(InvalidationListener listener) {

    }
}
