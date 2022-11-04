package com.example.flowerStoreSite.Implementation.items;

import lombok.Getter;

public abstract class Item {
    @Getter
    public String description;
    public Item(){
        this.description = "No description";
    }
    public Item(String description) {
        this.description = description;
    }
    public abstract double getPrice();
}
