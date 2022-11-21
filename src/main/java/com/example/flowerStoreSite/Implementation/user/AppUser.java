package com.example.flowerStoreSite.Implementation.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    @Transient
    private int age;

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public AppUser(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }
}