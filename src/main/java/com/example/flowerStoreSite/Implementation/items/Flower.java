package com.example.flowerStoreSite.Implementation.items;

import lombok.*;

@ToString
@AllArgsConstructor
public class Flower extends Item{
    @Getter
    @Setter
    private double price;
    @Getter
    @Setter
    private String description;
    public Flower() {

    }
}
