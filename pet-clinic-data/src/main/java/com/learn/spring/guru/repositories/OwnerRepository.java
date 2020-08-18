package com.learn.spring.guru.repositories;

import com.learn.spring.guru.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
