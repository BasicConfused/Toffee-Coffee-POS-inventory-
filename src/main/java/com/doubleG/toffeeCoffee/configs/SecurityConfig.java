package com.doubleG.toffeeCoffee.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/css/**", "/js/**", "/images/**").permitAll() // Allow static resources
                        .requestMatchers("/", "/login", "/signup").permitAll()         // Allow public pages
                        .anyRequest().authenticated()                                 // Require authentication for others
                )
                .formLogin(form -> form
                        .loginPage("/login")                                          // Custom login page
                        .permitAll()
                )
                .logout(logout -> logout.permitAll());
        return http.build();

    }
}