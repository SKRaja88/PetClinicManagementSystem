package com.learn.spring.guru.service;

import com.learn.spring.guru.model.Owner;

import java.util.Optional;
import java.util.Set;

public interface OwnerService {

    Optional<Owner> findById(Long Id);

    Optional<Owner> findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
