package com.zainjanwani.aeropark;

public class Validation {
    public static String validateCustomer(Customer customer) {
        String errors = "";
        if (customer.getEmail_address().isEmpty()) {
            errors += "Email, ";
        }
        if (customer.getTitle().isEmpty()) {
            errors += "Title, ";
        }
        if (customer.getFirst_name().isEmpty()) {
            errors += "First Name, ";
        }
        if (customer.getLast_name().isEmpty()) {
            errors += "Last Name, ";
        }
        if (customer.getAddress_line_1().isEmpty()) {
            errors += "Address Line 1, ";
        }
        if (customer.getPostcode().isEmpty()) {
            errors += "Postcode, ";
        }
        return errors;
    }
}
