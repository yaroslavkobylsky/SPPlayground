package com.yarosla.resttest.demo.service;

import com.yarosla.resttest.demo.model.Fish;

import java.util.List;

public interface FishService {
    public Fish get(Long id);
    public List<Fish> getAll();
    public List<Fish> getByName(String name);
}
