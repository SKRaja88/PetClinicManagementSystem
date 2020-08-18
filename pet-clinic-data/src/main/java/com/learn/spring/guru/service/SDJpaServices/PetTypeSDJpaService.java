package com.learn.spring.guru.service.SDJpaServices;

import com.learn.spring.guru.model.Pet;
import com.learn.spring.guru.model.PetType;
import com.learn.spring.guru.model.Vet;
import com.learn.spring.guru.repositories.PetTypeRepository;
import com.learn.spring.guru.repositories.VetRepository;
import com.learn.spring.guru.service.PetTypeService;
import com.learn.spring.guru.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public PetType findById(Long Id) {
        return petTypeRepository.findById(Id).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

      @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes=new HashSet();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        petTypeRepository.deleteById(Id);
    }
}
