package com.doubleG.toffeeCoffee.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public DefaultSecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .formLogin(httpForm -> {
                    httpForm
                            .loginPage("/login").permitAll();
                })
                .authorizeHttpRequests(registry -> {
                    registry
                            .requestMatchers("/Signup", "/static/style", "/js/**").permitAll()
                            .anyRequest().authenticated();
                })
                .build();
    }
}
