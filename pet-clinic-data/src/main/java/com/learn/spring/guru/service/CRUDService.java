package com.learn.spring.guru.service;

import java.util.Set;

public interface CRUDService<T,ID> {

    T findById(Long Id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(Long Id);

}
