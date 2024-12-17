package com.doubleG.toffeeCoffee.model;


// Importing necessary JPA annotations for entity mapping
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * The @Entity annotation marks this class as a JPA entity, which means
 * it will be mapped to a database table.
 */
@Entity
/*
 * The @Table annotation specifies the name of the table in the database
 * that this entity maps to. In this case, the table name is "customer".
 */
@Table(name = "customer")
public class Customer {
    /*
     * @Id: Marks this field as the primary key of the table.
     * @GeneratedValue: Specifies how the primary key is generated.
     * GenerationType.IDENTITY: Auto-increment the ID in the database.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Simple fields mapped to columns in the table
    private String firstName; // Customer's first name
    private String lastname;  // Customer's last name

    /*
     * @Column: Specifies additional column constraints.
     * unique = true: Ensures no duplicate email values.
     * nullable = false: Ensures email cannot be null in the database.
     */
    @Column(unique = true, nullable = false)
    private String email; // Customer's email (must be unique and not null)

    private String address;  // Customer's address
    private String status;   // Status of the customer (e.g., active, pending)
    private LocalDateTime createAt; // Date and time the customer record was created


    // Getters and Setters: Allow accessing and modifying the private fields


    // Returns the ID of the customer
    public Integer getId() {
        return id;
    }

    // Sets the ID of the customer
    public void setId(Integer id) {
        this.id = id;
    }

    // Returns the first name of the customer
    public String getFirstName() {
        return this.firstName;
    }

    // Sets the first name of the customer
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Returns the last name of the customer
    public String getLastname() {
        return this.lastname;
    }

    // Sets the last name of the customer
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Returns the email of the customer
    public String getEmail() {
        return this.email;
    }

    // Sets the email of the customer
    public void setEmail(String email) {
        this.email = email;
    }

    // Returns the address of the customer
    public String getAddress() {
        return this.address;
    }

    // Sets the address of the customer
    public void setAddress(String address) {
        this.address = address;
    }

    // Returns the status of the customer
    public String getStatus() {
        return this.status;
    }

    // Sets the status of the customer
    public void setStatus(String status) {
        this.status = status;
    }

    // Returns the creation date of the customer record
    public LocalDateTime getCreateAt() {
        return createAt;
    }

    // Sets the creation date of the customer record
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
