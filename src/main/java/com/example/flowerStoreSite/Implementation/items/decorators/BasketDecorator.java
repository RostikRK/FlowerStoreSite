package com.example.flowerStoreSite.Implementation.items.decorators;


import com.example.flowerStoreSite.Implementation.items.Item;

public class BasketDecorator extends ItemDecorator{

    private Item item;
    public BasketDecorator(Item item) {
        this.item = item;
    }
    public BasketDecorator(Item item, String description){
        super(description);
        this.item = item;
    }
    public double getPrice() {
        return 4 + this.item.getPrice();
    }
    public String getDescription(){
        return this.description;
    }
}