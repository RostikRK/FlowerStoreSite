package com.example.flowerStoreSite.Implementation.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.format("Paid"+ price + "with PayPal\n");
        return true;
    }
}
