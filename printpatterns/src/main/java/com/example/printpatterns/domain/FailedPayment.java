package com.example.printpatterns.domain;

import javafx.beans.InvalidationListener;

public class FailedPayment extends PaymentState {

    @Override
    public void cancelOrder() {
        super.cancelOrder();
    }

    @Override
    public void retryPayment() {
        super.retryPayment();
    }

    @Override
    public void addListener(InvalidationListener listener) {

    }

    @Override
    public void removeListener(InvalidationListener listener) {

    }
}
