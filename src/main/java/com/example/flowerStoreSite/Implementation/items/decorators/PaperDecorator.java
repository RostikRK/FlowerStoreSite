package com.example.flowerStoreSite.Implementation.items.decorators;


import com.example.flowerStoreSite.Implementation.items.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;
    public PaperDecorator(Item item) {
        this.item = item;
    }
    public PaperDecorator(Item item, String description){
        super(description);
        this.item = item;
    }
    public double getPrice() {
        return 13 + this.item.getPrice();
    }
    public String getDescription(){
        return this.description;
    }
}
