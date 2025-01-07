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
                // CSRF protection
                .csrf(csrf -> csrf.disable()) // Disable CSRF if not needed for APIs or non-browser clients

                // Authorize HTTP requests
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/css/**", "/js/**", "/img/**").permitAll() // Allow static resources
                        .requestMatchers("/", "/Login", "/Signup").permitAll()      // Publicly accessible pages
                        .anyRequest().authenticated()                               // Protect all other routes
                )

                // Login configuration
                .formLogin(form -> form
                        .loginPage("/Login")               // Custom login page
                        .loginProcessingUrl("/Login")      // Endpoint Spring Security listens to for authentication
                        .defaultSuccessUrl("/", true)      // Redirect after successful login
                        .failureUrl("/Login?error=true")   // Redirect on login failure
                        .permitAll()
                )

                // Logout configuration
                .logout(logout -> logout
                        .logoutUrl("/logout")             // Logout URL
                        .logoutSuccessUrl("/Login?logout=true") // Redirect after logout
                        .invalidateHttpSession(true)      // Invalidate session
                        .deleteCookies("JSESSIONID")      // Delete session cookie
                        .permitAll()
                );

        return http.build();
    }
}
