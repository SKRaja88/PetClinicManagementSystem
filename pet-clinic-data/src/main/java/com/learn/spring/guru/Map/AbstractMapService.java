package com.learn.spring.guru.Map;

import com.learn.spring.guru.model.BaseEntity;

import java.util.*;


public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {

    protected Map<Long,T> map= new HashMap<>();

   T findById(Long Id){

        return  map.get(Id);
    }

    T save(T object){
        if(object!=null){
            if(object.getId()!=null){
            object.setId(this.getNextId());
            }
    map.put(object.getId(),object);
        }else{
            throw new RuntimeException("Object cannnot be null");
        }
    return object;
    }
    Set<T> findAll(){
        return new HashSet(map.values());
    }

    void delete(T object){
        map.entrySet().removeIf(tidEntry -> tidEntry.getValue().equals(object));
    }
    void deleteById(Long Id){
        map.remove(Id);

    }

    private Long getNextId(){
        Long nextId=null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId=1L;
        }
        return nextId;
    }

}
