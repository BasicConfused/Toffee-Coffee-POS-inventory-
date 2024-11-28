package com.doubleG.toffeeCoffee.controller;

import com.doubleG.toffeeCoffee.Model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController{

    private final List<Customer> customers = new ArrayList<>();

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return customer;
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable String id, @RequestBody Customer customerDetails) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                customer.setName(customerDetails.getName());
                customer.setEmail(customerDetails.getEmail());
                customer.setPhone(customerDetails.getPhone());
                customer.setAddress(customerDetails.getAddress());
                return customer;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable String id) {
        customers.removeIf(customer -> customer.getId().equals(id));
        return "Customer with ID " + id + " was deleted.";
    }
}
