package com.example.flowerStoreSite.Implementation.controllers;

import com.example.flowerStoreSite.Implementation.items.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlowerController {
    @GetMapping
    public List<Flower> getAllFlowers() {
        return List.of(new RomashkaFlower(ChamomileColor.WHITE), new CactusFlower(CactusFlowerColor.BLUE));
    }
}