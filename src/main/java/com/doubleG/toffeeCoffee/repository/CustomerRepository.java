package com.doubleG.toffeeCoffee.repository;
import com.doubleG.toffeeCoffee.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CustomerController handles HTTP requests related to customers.
 * It retrieves customer data and sends it to the view.
 */
@Controller
@RequestMapping("/customers") // Base URL for all requests in this controller
public class CustomerRepository {

    /**
     * Dependency injection for the CustomerRepository to interact with the database.
     */
    @Autowired
    private CustomerRepository customerRepo;

    /**
     * Handles GET requests to "/customers" or "/customers/".
     * Retrieves all customer records sorted by ID in descending order and passes them to the view.
     *
     * @param model The Model object to pass data to the view.
     * @return The name of the template "customers/index" to render the customer list.
     */
    @GetMapping({"", "/"})
    public String getCustomers(Model model) {
        // Retrieve all customers sorted by ID in descending order
        var customers = customerRepo.findAll(Sort.by(Sort.Direction.DESC, "id"));

        // Add the retrieved customers to the model to pass to the view
        model.addAttribute("customers", customers);

        // Return the view template located at "templates/customers/index.html"
        return "customers/index";
    }
}