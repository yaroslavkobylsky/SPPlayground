package com.yarosla.resttest.demo.controller;

import com.yarosla.resttest.demo.model.Fish;
import com.yarosla.resttest.demo.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FishController {

    @Autowired
    private FishService fishService;

    @GetMapping("/fish/{id}")
    public Fish getFishById(@PathVariable Long id){
        try {
            return fishService.get(id);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getStackTrace());
            return null;
        }
    }

    @GetMapping("/fish")
    public List<Fish> getAllFish(String name){
        try {
            System.out.println("Name: " + name);
            return null == name ? fishService.getAll() : fishService.getByName(name);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getStackTrace());
            return null;
        }
    }
}
