package com.yarosla.resttest.demo.dao.Impl;


import com.yarosla.resttest.demo.dao.FishDao;
import com.yarosla.resttest.demo.model.Fish;
import org.springframework.stereotype.Repository;

@Repository
public class FishDaoImpl implements FishDao {
    @Override
    public Fish get(Long id) {
        Fish fish = new Fish(
                "perch",
                "predator",
                500
        );
        fish.setId(id);
        return fish;
    }
}
