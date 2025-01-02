package com.doubleG.toffeeCoffee.repository;

import com.doubleG.toffeeCoffee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}