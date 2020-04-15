package com.yarosla.resttest.demo.repository;

import com.yarosla.resttest.demo.model.Fish;
import org.springframework.data.repository.CrudRepository;

public interface UserRoleRepository extends CrudRepository<Fish, Long> {
}
