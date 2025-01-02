package com.doubleG.toffeeCoffee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is mandatory")
    @Size(max = 100, message = "First name should not be more than 100 characters")
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    @Size(max = 100, message = "Last name should not be more than 100 characters")
    private String lastName;

    @NotBlank(message = "Username is mandatory")
    @Size(max = 100, message = "Username should not be more than 100 characters")
    private String username;

    @NotBlank(message = "Password is mandatory")
    @Size(min = 6, message = "Password should be at least 6 characters")
    private String password;

    // Default constructor
    public User() {
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
