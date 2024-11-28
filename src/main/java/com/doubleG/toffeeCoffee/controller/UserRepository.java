package com.doubleG.toffeeCoffee.controller;

import com.doubleG.toffeeCoffee.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}



