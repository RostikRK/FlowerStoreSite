package com.example.flowerStoreSite.Implementation.orders;

import com.example.flowerStoreSite.Implementation.delivery.Delivery;
import com.example.flowerStoreSite.Implementation.items.Item;
import com.example.flowerStoreSite.Implementation.payment.Payment;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private final List<Item> items = new LinkedList<Item>();
    @Setter
    private Payment payment;
    @Setter
    private Delivery delivery;

    public double calculateTotalPrice() {
        double res = 0;
        for(Item item : this.items) {
            res = res + item.getPrice();
        }
        return res;
    }
    public void processOrder(){
        this.payment.pay(this.calculateTotalPrice());
        this.delivery.deliver(this.items);
    }
    public void addItem(Item item) {
        this.items.add(item);
    }
    public void removeItem(int index) {
        this.items.remove(index);
    }
}
