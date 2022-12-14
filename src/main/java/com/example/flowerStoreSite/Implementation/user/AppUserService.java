package com.example.flowerStoreSite.Implementation.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
    private final AppUserRepository repository;
    @Autowired
    public AppUserService(AppUserRepository repository) {
        this.repository = repository;
    }
    public List<AppUser> getAppUsers() {
        return repository.findAll();
    }
    public void addUser(AppUser user) {
        if (repository.findUserByEmail(user.getEmail()).isEmpty()) {
            repository.save(user);
        }
    }
}