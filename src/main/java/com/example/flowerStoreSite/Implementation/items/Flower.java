package com.example.flowerStoreSite.Implementation.items;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Flower extends Item{
    @Id
    @GeneratedValue
    private int id;
    @Getter
    @Setter
    private double price;
    @Getter
    @Setter
    private String description;

}
