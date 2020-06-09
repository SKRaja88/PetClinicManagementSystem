package com.learn.spring.guru.Map;

import com.learn.spring.guru.model.Vet;
import com.learn.spring.guru.service.CRUDService;

import java.util.Optional;
import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CRUDService<Vet,Long> {

    @Override
    public Optional<Vet> findById(Long Id) {
        return super.findById(Id);
    }


    @Override
    public Vet save(Vet vet) {
        return super.save(vet,vet.getId());
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteById(Id);
    }

    @Override
    public void delete(Vet vet) {
            super.delete(vet);
    }

}
