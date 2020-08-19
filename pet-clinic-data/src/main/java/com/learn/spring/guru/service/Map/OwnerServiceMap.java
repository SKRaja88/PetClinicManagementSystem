package com.learn.spring.guru.service.Map;

import com.learn.spring.guru.model.Owner;
import com.learn.spring.guru.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
@Profile({"default,map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findById(Long Id)
    {

        return super.findById(Id);
    }


    @Override
    public Owner save(Owner owner) {
       return super.save(owner);
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

    @Override
    public Optional<Owner> findByLastName(String lastName) {
        return Optional.empty();
    }
}
