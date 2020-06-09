package com.learn.spring.guru.Map;

import com.learn.spring.guru.model.Vet;
import com.learn.spring.guru.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    @Override
    public Optional<Vet> findById(Long Id) {
        return super.findById(Id);
    }


    @Override
    public void save(Vet vet) {
        super.save(vet, vet.getId());
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
