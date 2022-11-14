package com.example.flowerStoreSite.Implementation.controllers;

import com.example.flowerStoreSite.Implementation.items.*;
import com.example.flowerStoreSite.Implementation.services.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/flowers")
public class FlowerController {
    private FlowerService flowerService;
    @Autowired
    public void addFlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }
    @GetMapping
    public List<Flower> getAllFlowers() {
        return this.flowerService.getFlowers();
    }
}