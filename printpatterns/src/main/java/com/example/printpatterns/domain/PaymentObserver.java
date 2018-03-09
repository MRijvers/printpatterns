package com.example.printpatterns.domain;

public class PaymentObserver implements Observer {

    private OrderState orderState;

    public PaymentObserver(OrderState orderState) {
        this.orderState = orderState;
    }

    @Override
    public void updateOrderState() {
        payOrder();
        paymentSucceeded();
    }

    public void payOrder() {

    }

    public void paymentSucceeded() {
        orderState.detachObserver(this);
    }
}
