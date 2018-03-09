package com.example.printpatterns.domain;

import java.util.ArrayList;

public abstract class OrderState {

    //composition Has-a relationship with Order
    private Order order;

    public void placeOrder() {

    }

    public OrderState getOrderState() {

        return null;
    }
    // Setter for OrderState
    public void updateOrderState(PaymentState paymentState) {

    }

    public void sendOrder() {

    }

    public void payOrder() {

    }

    public void attachObserver(Observer obs) {

    }

    public void detachObserver(Observer obs) {

    }

    public void notifyObserver() {

    }
}
