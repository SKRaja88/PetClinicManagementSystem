package com.learn.spring.guru.repositories;

import com.learn.spring.guru.model.Owner;
import com.learn.spring.guru.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
