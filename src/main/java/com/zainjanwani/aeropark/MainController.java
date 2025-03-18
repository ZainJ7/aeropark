package com.zainjanwani.aeropark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Locale;

@Controller
public class MainController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(path="/submit")
    public String addNewCustomer(Customer customer, Model model) {
        String email = customer.getEmail_address().toLowerCase(Locale.ROOT);
        customer.setEmail_address(email);

        String errors = Validation.validateCustomer(customer);
        if (!errors.isEmpty()) {
            model.addAttribute("error", String.format("The following fields are required: %s", errors));
            return "error";
        }

        if (customerRepository.existsByEmail(email)) {
            model.addAttribute("error", "A customer already exists with this email");
            return "error";
        }

        customerRepository.save(customer);
        model.addAttribute("name", customer.getFirst_name());
        return "success";
    }
}
