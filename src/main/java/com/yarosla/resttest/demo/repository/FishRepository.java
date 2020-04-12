package com.yarosla.resttest.demo.repository;

import com.yarosla.resttest.demo.model.Fish;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FishRepository extends CrudRepository<Fish, Long> {
    public List<Fish> findByName(String name);
}
