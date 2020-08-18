package com.learn.spring.guru.repositories;

import com.learn.spring.guru.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Optional<Owner> findByLastName(String lastName);

}
