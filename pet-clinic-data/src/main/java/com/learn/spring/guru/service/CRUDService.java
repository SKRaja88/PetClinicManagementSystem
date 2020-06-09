package com.learn.spring.guru.service;

import java.util.Optional;
import java.util.Set;

public interface CRUDService<T,ID> {

    Optional<T> findById(Long Id);

    void save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(Long Id);

}
