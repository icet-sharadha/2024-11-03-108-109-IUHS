package edu.icet.service;

import edu.icet.dto.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    void deleteCustomer(Integer id);
    Customer searchById(Integer id);
    List<Customer> getAll();
    void updateCustomer(Customer customer);
}
