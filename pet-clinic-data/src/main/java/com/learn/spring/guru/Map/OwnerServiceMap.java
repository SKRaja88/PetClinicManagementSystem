package com.learn.spring.guru.Map;

import com.learn.spring.guru.model.Owner;
import com.learn.spring.guru.service.CRUDService;

import java.util.Optional;
import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CRUDService<Owner,Long> {

    @Override
    public Optional<Owner> findById(Long Id) {
        return super.findById(Id);
    }


    @Override
    public Owner save(Owner owner) {
        return super.save(owner,owner.getId());
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteById(Id);
    }

    @Override
    public void delete(Owner owner) {
            super.delete(owner);
    }

}
