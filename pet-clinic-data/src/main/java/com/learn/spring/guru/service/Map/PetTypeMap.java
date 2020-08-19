package com.learn.spring.guru.service.Map;

import com.learn.spring.guru.model.PetType;
import com.learn.spring.guru.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default,map"})
public class PetTypeMap extends AbstractMapService<PetType,Long> implements PetTypeService {


    @Override
    public PetType findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long Id) {
         super.deleteById(Id);
    }

    @Override
    public void delete(PetType object) {
         super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }
}
