package com.learn.spring.guru.Map;

import java.util.*;

public abstract class AbstractMapService<T,ID> {

    protected Map<T,ID> map= new HashMap<T,ID>();

    Optional<T> findById(Long Id){

        return (Optional<T>) map.get(Id);
    }

    T save(T object,ID id){
    map.put(object,map.get(id));
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
}
