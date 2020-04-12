package com.yarosla.resttest.demo.repository;


import com.yarosla.resttest.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public Optional<User> findByName(String name);
}
