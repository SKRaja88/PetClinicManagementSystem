package com.learn.spring.guru.repositories;

import com.learn.spring.guru.model.Owner;
import com.learn.spring.guru.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
