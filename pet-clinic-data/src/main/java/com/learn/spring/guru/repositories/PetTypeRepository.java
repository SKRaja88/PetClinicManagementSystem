package com.learn.spring.guru.repositories;

import com.learn.spring.guru.model.Owner;
import com.learn.spring.guru.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
