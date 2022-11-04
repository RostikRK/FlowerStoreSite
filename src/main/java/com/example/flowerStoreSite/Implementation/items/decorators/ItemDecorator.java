package com.example.flowerStoreSite.Implementation.items.decorators;

import com.example.flowerStoreSite.Implementation.items.Item;

public abstract class ItemDecorator extends Item {
    public abstract String getDescription();
    public ItemDecorator() {
        super("No description");
    }
    public ItemDecorator(String description) {
        super(description);
    }
}
