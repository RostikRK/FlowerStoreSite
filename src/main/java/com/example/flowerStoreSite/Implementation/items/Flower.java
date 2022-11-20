package com.example.flowerStoreSite.Implementation.items;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Flower extends Item{
    @Id
    @GeneratedValue
    private int id;
    @Getter
    @Setter
    private double sepalLength;
    @Getter
    @Setter
    private double price;
    @Getter
    @Setter
    private String description;
    public Flower(double sepalLength, double price, String description) {
        this.sepalLength = sepalLength;
        this.price = price;
        this.description = description;
    }
}
