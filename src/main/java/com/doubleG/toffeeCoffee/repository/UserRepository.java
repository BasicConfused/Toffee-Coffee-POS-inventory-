package com.doubleG.toffeeCoffee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doubleG.toffeeCoffee.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}