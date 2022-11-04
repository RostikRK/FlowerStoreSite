package com.example.flowerStoreSite.Implementation.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class CactusFlower extends Flower {
    @Setter
    @Getter
    private CactusFlowerColor color;
}
