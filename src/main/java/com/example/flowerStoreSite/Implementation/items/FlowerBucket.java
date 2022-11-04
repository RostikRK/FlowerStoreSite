package com.example.flowerStoreSite.Implementation.items;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class FlowerBucket extends Item{
    @Getter
    @Setter
    private ArrayList<Flower> bucket;
    @Getter
    @Setter
    private String description;

    public FlowerBucket() {
        this.bucket = new ArrayList<Flower>();
    }

    public void add(Flower flower) {
        this.bucket.add(flower);
    }

    public double getPrice() {
        double res = 0;
        for (Flower flower : this.bucket) {
            res = res + flower.getPrice();
        }
        return res;
    }
}
