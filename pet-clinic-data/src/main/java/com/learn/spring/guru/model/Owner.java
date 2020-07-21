package com.learn.spring.guru.model;

import lombok.ToString;

import java.util.Set;

@ToString
public class Owner extends Person{
    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    private Set<Pet> pets;
}
