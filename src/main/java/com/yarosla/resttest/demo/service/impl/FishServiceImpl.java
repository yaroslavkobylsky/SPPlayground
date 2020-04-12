package com.yarosla.resttest.demo.service.impl;

import com.yarosla.resttest.demo.model.Fish;
import com.yarosla.resttest.demo.repository.FishRepository;
import com.yarosla.resttest.demo.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FishServiceImpl implements FishService {

    @Autowired
    private FishRepository fishRepository;

    @Override
    public Fish get(Long id) {
        return fishRepository.findById(id).get();
    }

    @Override
    public List<Fish> getAll() {
        List<Fish> fish = new ArrayList<>();
        fishRepository.findAll().forEach(fish::add);
        return fish;
    }

    @Override
    public List<Fish> getByName(String name) {
        List<Fish> fish = new ArrayList<>();
        fishRepository.findByName(name).forEach(fish::add);
        return fish;
    }
}
