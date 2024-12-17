package com.doubleG.toffeeCoffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.doubleG.toffeeCoffee.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
     User findByUsername(String username); 
}