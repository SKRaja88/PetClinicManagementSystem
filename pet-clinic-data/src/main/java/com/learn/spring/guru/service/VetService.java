package com.learn.spring.guru.service;

import com.learn.spring.guru.model.Owner;
import com.learn.spring.guru.model.Vet;

import java.util.Optional;
import java.util.Set;

public interface VetService {

    Optional<Vet> findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
