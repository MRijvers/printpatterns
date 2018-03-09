package com.example.printpatterns.domain;

import javafx.beans.Observable;

import java.util.ArrayList;

public abstract class PaymentState extends OrderState implements Observable {
    //List of observers registered for notification
    private OrderState orderState;
    private PaymentState paymentState;
    private ArrayList<Observer> paymentObservers = new ArrayList<Observer>();

    public void updatePaymentState() {

    }

    public void getState(PaymentState paymentState) {

    }

    // Get state
    @Override
    public OrderState getOrderState() {
        return orderState;
    }

    // Set state
    @Override
    public void updateOrderState(PaymentState paymentState) {
        this.orderState = orderState;
        notifyObserver();
        super.updateOrderState(paymentState);
    }

    public void PendingForTransaction() {

    }

    public void orderIsPaid() {

    }

    public void cancelOrder() {

    }

    public void retryPayment(){

    }

    public void payOrder() {

    }

    @Override
    public void attachObserver(Observer obs) {
        paymentObservers.add(obs);
    }

    @Override
    public void detachObserver(Observer obs) {
        paymentObservers.add(obs);
    }

    @Override
    public void notifyObserver() {
        //Notify all observers
        for (Observer paymentObserver : paymentObservers) {
            paymentObserver.updateOrderState();
        }
    }
}
