package com.doubleG.toffeeCoffee;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class ToffeeCoffeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToffeeCoffeeApplication.class, args);
	}
}
