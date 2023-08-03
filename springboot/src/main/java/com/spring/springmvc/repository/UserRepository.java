package com.spring.springmvc.repository;

import com.spring.springmvc.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findById(Long id);
}
