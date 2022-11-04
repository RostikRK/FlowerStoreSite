package com.example.flowerStoreSite.Implementation.delivery;

import com.example.flowerStoreSite.Implementation.items.Item;

import java.util.List;

public interface Delivery {
    boolean deliver(List<Item> items);
}
