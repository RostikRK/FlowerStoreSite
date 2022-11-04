package com.example.flowerStoreSite.Implementation.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.format("Paid"+ price + "with credit card\n");
        return true;
    }
}