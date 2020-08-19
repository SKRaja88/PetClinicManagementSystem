package com.learn.spring.guru.service.Map;

import com.learn.spring.guru.model.Pet;
import com.learn.spring.guru.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
@Profile({"default,map"})
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Pet findById(Long Id) {
        return super.findById(Id);
    }


    @Override
    public Pet save(Pet pet) {
        return super.save(pet );
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
