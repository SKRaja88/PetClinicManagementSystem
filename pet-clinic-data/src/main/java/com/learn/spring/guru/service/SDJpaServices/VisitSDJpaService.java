package com.learn.spring.guru.service.SDJpaServices;

import com.learn.spring.guru.model.Vet;
import com.learn.spring.guru.model.Visit;
import com.learn.spring.guru.repositories.VetRepository;
import com.learn.spring.guru.repositories.VisitRepository;
import com.learn.spring.guru.service.CRUDService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJpa")
public class VisitSDJpaService implements CRUDService<Visit,Long> {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findById(Long Id) {
        return visitRepository.findById(Id).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

      @Override
    public Set<Visit> findAll() {
        Set<Visit> visits=new HashSet();
          visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        visitRepository.deleteById(Id);
    }
}
