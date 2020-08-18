package com.learn.spring.guru.service.SDJpaServices;

import com.learn.spring.guru.model.Pet;
import com.learn.spring.guru.model.PetType;
import com.learn.spring.guru.repositories.PetRepository;
import com.learn.spring.guru.repositories.PetTypeRepository;
import com.learn.spring.guru.service.PetService;
import com.learn.spring.guru.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJpa")
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findById(Long Id) {
        return petRepository.findById(Id).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

      @Override
    public Set<Pet> findAll() {
        Set<Pet> pets=new HashSet();
          petRepository.findAll().forEach(pets::add);
        return pets;
    }


    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        petRepository.deleteById(Id);
    }
}
