package com.learn.spring.guru.model;

import javax.persistence.Entity;

@Entity
public class Speciality {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
