package com.yarosla.resttest.demo.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Fish {

    @Id
    private Long id;
    private String name;
    private String type;
    private float weight;

    public Fish() {
    }

    public Fish(String name, String type, float weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
