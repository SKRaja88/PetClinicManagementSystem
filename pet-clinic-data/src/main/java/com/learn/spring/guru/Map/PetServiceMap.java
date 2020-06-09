package com.learn.spring.guru.Map;

import com.learn.spring.guru.model.Pet;
import com.learn.spring.guru.service.PetService;

import java.util.Optional;
import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Optional<Pet> findById(Long Id) {
        return super.findById(Id);
    }


    @Override
    public void save(Pet pet) {
        super.save(pet, pet.getId());
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteById(Id);
    }

    @Override
    public void delete(Pet pet) {
            super.delete(pet);
    }

}