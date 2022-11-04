package com.example.flowerStoreSite.Implementation.delivery;

import com.example.flowerStoreSite.Implementation.items.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Delivered by DHL:");
        for(Item item : items){
            System.out.println(item);
        }
        return true;
    }
}