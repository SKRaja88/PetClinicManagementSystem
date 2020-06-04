package com.learn.spring.guru.service;

import com.learn.spring.guru.model.Owner;
import com.learn.spring.guru.model.Pet;

import java.util.Optional;
import java.util.Set;

public interface PetService {

    Optional<Pet> findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
