package com.doubleG.toffeeCoffee.Model;

import java.util.Objects;

//@Entity
public class Customer {
    private int customer_id;
    private String customer_firstname;
    private String customer_lastname;
    private int customer_phoneNumber;

    Customer(){}

    Customer(int customer_id, String customer_firstname, String customer_lastname, int customer_phoneNumber){
        this.customer_id = customer_id;
        this.customer_firstname = customer_firstname;
        this.customer_lastname = customer_lastname;
        this.customer_phoneNumber = customer_phoneNumber;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_firstname() {
        return customer_firstname;
    }

    public void setCustomer_firstname(String customer_firstname) {
        this.customer_firstname = customer_firstname;
    }

    public String getCustomer_lastname() {
        return customer_lastname;
    }

    public void setCustomer_lastname(String customer_lastname) {
        this.customer_lastname = customer_lastname;
    }

    public int getCustomer_phoneNumber() {
        return customer_phoneNumber;
    }

    public void setCustomer_phoneNumber(int customer_phoneNumber) {
        this.customer_phoneNumber = customer_phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_firstname='" + customer_firstname + '\'' +
                ", customer_lastname='" + customer_lastname + '\'' +
                ", customer_phoneNumber=" + customer_phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customer_id == customer.customer_id && customer_phoneNumber == customer.customer_phoneNumber && Objects.equals(customer_firstname, customer.customer_firstname) && Objects.equals(customer_lastname, customer.customer_lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer_id, customer_firstname, customer_lastname, customer_phoneNumber);
    }
}