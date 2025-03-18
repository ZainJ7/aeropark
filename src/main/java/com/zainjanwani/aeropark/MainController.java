package com.zainjanwani.aeropark;

import org.hibernate.id.enhanced.CustomOptimizerDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller
public class MainController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(path="/submit")
    public String addNewCustomer(Customer customer, Model model) {
        String email = customer.getEmail_address().toLowerCase(Locale.ROOT);
        customer.setEmail_address(email);
        customerRepository.save(customer);
        model.addAttribute("name", customer.getFirst_name());
        return "success";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
