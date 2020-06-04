package com.learn.spring.guru.service;

import com.learn.spring.guru.model.Owner;

import java.util.Optional;
import java.util.Set;

public interface OwnerService extends CRUDService<Owner,Long> {

    Optional<Owner> findByLastName(String lastName);

}
