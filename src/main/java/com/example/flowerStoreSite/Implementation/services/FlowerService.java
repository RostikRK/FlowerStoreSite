package com.example.flowerStoreSite.Implementation.services;

import com.example.flowerStoreSite.Implementation.items.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class FlowerService {
    public FlowerRepository flowerRepository;
    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers() {
        return this.flowerRepository.findAll();
    }

    public void addFlower(double sepalLength, double price, String description) {
        this.flowerRepository.save(new Flower(sepalLength, price, description));
    }
}