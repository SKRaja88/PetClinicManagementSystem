package com.learn.spring.guru.repositories;

import com.learn.spring.guru.model.Owner;
import com.learn.spring.guru.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
