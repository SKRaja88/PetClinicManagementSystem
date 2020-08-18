package com.learn.spring.guru.repositories;

import com.learn.spring.guru.model.Owner;
import com.learn.spring.guru.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
