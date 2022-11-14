package com.example.flowerStoreSite.Implementation.services;


import com.example.flowerStoreSite.Implementation.items.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}