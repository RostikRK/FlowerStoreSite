package com.example.flowerStoreSite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public String getInfo() {
        return "The flower store application";
    }
}