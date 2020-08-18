package com.learn.spring.guru.service.SDJpaServices;

import com.learn.spring.guru.model.Owner;
import com.learn.spring.guru.model.Vet;
import com.learn.spring.guru.repositories.OwnerRepository;
import com.learn.spring.guru.repositories.VetRepository;
import com.learn.spring.guru.service.OwnerService;
import com.learn.spring.guru.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("SpringDataJpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet findById(Long Id) {
        return vetRepository.findById(Id).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

      @Override
    public Set<Vet> findAll() {
        Set<Vet> vets=new HashSet();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

     @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        vetRepository.deleteById(Id);
    }
}
