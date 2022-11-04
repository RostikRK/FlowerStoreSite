package com.example.flowerStoreSite.Implementation.items.decorators;

import com.example.flowerStoreSite.Implementation.items.Item;

public class RibbonDecorator extends ItemDecorator{
    private Item item;
    public RibbonDecorator(Item item) {
        this.item = item;
    }
    public RibbonDecorator(Item item, String description){
        super(description);
        this.item = item;
    }
    public double getPrice() {
        return 40 + this.item.getPrice();
    }
    public String getDescription(){
        return this.description;
    }
}