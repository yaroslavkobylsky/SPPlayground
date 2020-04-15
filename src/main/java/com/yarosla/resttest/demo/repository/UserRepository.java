package com.yarosla.resttest.demo.repository;


import com.yarosla.resttest.demo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    public Optional<User> findByName(String name);
}
