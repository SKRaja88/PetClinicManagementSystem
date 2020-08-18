package com.learn.spring.guru.service.SDJpaServices;

import com.learn.spring.guru.model.Pet;
import com.learn.spring.guru.model.Speciality;
import com.learn.spring.guru.repositories.PetRepository;
import com.learn.spring.guru.repositories.SpecialityRepository;
import com.learn.spring.guru.service.CRUDService;
import com.learn.spring.guru.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJpa")
public class SpecialitySDJpaService implements CRUDService<Speciality,Long> {

    private final SpecialityRepository specialityRepository;

    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Speciality findById(Long Id) {
        return specialityRepository.findById(Id).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

      @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities=new HashSet();
          specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }
    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        specialityRepository.deleteById(Id);
    }
}
